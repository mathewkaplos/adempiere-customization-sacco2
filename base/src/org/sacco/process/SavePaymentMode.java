package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.model.ShambaPlot;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SavePaymentMode extends SvrProcess {

	private SLoan loan = null;

	private String payMode = null;
	private int C_Bank_ID = 0;
	Doc doc = null;
	PO po = null;
	LoanDisbursement disbursement = null;
	MBank bank = null;
	SLoanType loanType = null;

	@Override
	protected void prepare() {

		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Bank_ID"))
				C_Bank_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loanType = new SLoanType(getCtx(), loan.gets_loantype_ID(), get_TrxName());
		payMode = loan.getpaymode();
		bank = new MBank(getCtx(), C_Bank_ID, get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		if (loan.getNumberOfRepayments() == 1) {
			loan.setmonthopeningbal(loan.getappliedamount());
			loan.setloanpaymode_done(true);
			loan.setintbalance(loan.getloaninterestamount());
			loan.setloanbalance(loan.getappliedamount());
			loan.save();
		}
		if (loan.is_refinance()) {
			repayOldLoan();
		}
		if (payMode.equalsIgnoreCase("8")) {
			updateShambaPlot();
		} else if (payMode.equalsIgnoreCase("9")) {
			updateSavings();
		}
		saveDisbursement();
		post();
		return null;
	}

	private void post() {
		MAcctSchema[] ass = { MClient.get(getCtx()).getAcctSchema() };
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {

			String sql = "SELECT * FROM adempiere.s_loan_disbursement WHERE s_loan_disbursement_ID="
					+ disbursement.get_ID();
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_LoanDisbursement disbursement = new Doc_LoanDisbursement(ass, LoanDisbursement.class, rs,
						get_TrxName());
				doc = disbursement;

				LoanDisbursement loanDisbursement = new LoanDisbursement(getCtx(), rs, get_TrxName());
				po = loanDisbursement;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}

			} catch (Exception e2) {
			}
		}
		acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		postLoan();
		disbursement.setDocStatus("CO");
		disbursement.setProcessed(true);
		disbursement.setPosted(true);
		disbursement.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postLoan() {

		MAccount accountDR = new MAccount(Env.getCtx(), loanType.getloantypeloangl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				disbursement.getdisbursed_amount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), bank.getGLAccount(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				disbursement.getdisbursed_amount().negate());
		lineCR.save();
		if (loan.ispartial_disbursement()) {
			if (loan.isPartiallyDisbursed()) {
				// NEVER TODO
			} else {
				postInterest();
			}
		} else {
			postInterest();
		}
	}

	private void postInterest() {
		Sacco sacco = Sacco.getSaccco();
		MAccount accountDR = new MAccount(Env.getCtx(), sacco.getInterestReceivable_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), sacco.getUnEarnedInterest_Acct(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount().negate());
		lineCR.save();
	}

	private void saveDisbursement() {
		disbursement = new LoanDisbursement(getCtx(), 0, get_TrxName());
		disbursement.sets_loans_ID(getRecord_ID());
		disbursement.setAmount(loan.getappliedamount());
		if (loan.ispartial_disbursement()) {
			disbursement.setdisbursed_amount(loan.getdisbursed_amount());
		} else {
			disbursement.setdisbursed_amount(loan.getappliedamount());
		}
		disbursement.settransactiondate(DateUtil.newTimestamp());
		disbursement.save();
		loan.setdisbursed_amount(Env.ZERO);
		loan.save();
	}

	private void updateSavings() {
		int s_membershares_ID = loan.gets_membershares_ID();
		MemberShares memberShares = new MemberShares(getCtx(), s_membershares_ID, get_TrxName());
		memberShares.newRemmittance(loan.getappliedamount());
	}

	private void updateShambaPlot() {
		int s_shamba_plot_ID = loan.gets_shamba_plot_ID();
		ShambaPlot plot = new ShambaPlot(getCtx(), s_shamba_plot_ID, get_TrxName());
		plot.setStatus("0");
		plot.save();
	}

	private void repayOldLoan() {
		int oldLoan_ID = loan.gets_loans_refinance_ID();
		SLoan oldLoan = new SLoan(getCtx(), oldLoan_ID, get_TrxName());
		BigDecimal oldLoanBal = oldLoan.getloanbalance();
		BigDecimal approvedAmount = loan.getapprovedamount();
		BigDecimal appliedamount = approvedAmount.subtract(oldLoanBal);
		loan.setappliedamount(appliedamount);
		loan.save();
		loan.newRepayment(oldLoan);
	}
}
