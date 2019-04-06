package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.AccRecievables;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MPeriod;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Period_remittance;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanGuantorDetails;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.AmtInWords_EN;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;
import zenith.util.Util;

public class SaveRepayment extends SvrProcess {
	private Repayment repayment = null;
	private SLoan loan = null;
	private Sacco sacco = null;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		//
		sacco = Sacco.getSaccco();
	}

	@Override
	protected String doIt() throws Exception {
		repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		loan = new SLoan(getCtx(), repayment.gets_loans_ID(), get_TrxName());

		repayment.setReceiptNo(repayment.getDocumentNo());
		repayment.setVoucherNo(repayment.getDocumentNo());

		repayment.setIsComplete(true);
		repayment.save();
		/////////////////////////
		if (repayment.is_repayment())
			updateLoanRemmittance();
		else if (repayment.is_topup() || repayment.is_refund()) {
			updateLoanRefund();
			repayment.setPaymentAmount(repayment.getPaymentAmount().negate());
			repayment.setInterest(repayment.getInterest().negate());
			repayment.setPrincipal(repayment.getPrincipal().negate());
			repayment.save();
		}
		repayment.getGuarantorDetails(repayment.gets_loans_ID());
		repayment.freeTiedShares();

		resetPeriodRemittance();
		post();
		return null;
	}

	Doc doc = null;
	PO po = null;

	private void post() {
		MAcctSchema[] ass = { MClient.get(getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.l_repayments WHERE l_repayments_ID =" + getRecord_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_LoanReapayment repayment_Doc = new Doc_LoanReapayment(ass, Repayment.class, rs, get_TrxName());
				doc = repayment_Doc;

				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				po = repayment;
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
				e2.printStackTrace();
			}
		}

		acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		postLoan();
		repayment.setDocStatus("CO");
		repayment.setProcessed(true);
		repayment.setPosted(true);
		repayment.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postLoan() {
		// System.out.println(Env.getCtx());
		if (repayment.getPrincipal().compareTo(Env.ZERO) == 0) {
			return;
		}
		MAccount accountDR = new MAccount(Env.getCtx(), loan.gets_loantype().getloantypeloangl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), repayment.getPrincipal());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				repayment.getPrincipal().negate());
		lineCR.save();
		postInterest();
	}

	private void postInterest() {
		if (repayment.getInterest().compareTo(Env.ZERO) == 0)
			return;
		Sacco sacco = Sacco.getSaccco();
		MAccount accountCR = new MAccount(Env.getCtx(), sacco.getInterestReceivable_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				repayment.getInterest().negate());
		lineDR.save();

		MAccount accountDR = new MAccount(Env.getCtx(), sacco.getUnEarnedInterest_Acct(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), repayment.getInterest());
		lineCR.save();
	}

	private void resetPeriodRemittance() {

		BigDecimal loanPrincipal = Env.ZERO;

		@SuppressWarnings("static-access")
		Period_remittance period_remittance = Sacco.getSaccco().getPeriodRemimittance(loan, repayment.getC_Period_ID());
		if (period_remittance != null) {
			loanPrincipal = period_remittance.getarrears();
		} else {
			loanPrincipal = loan.getloanrepayamt();
		}
		BigDecimal repaymentPrincipal = repayment.getPrincipal();
		BigDecimal diff = loanPrincipal.subtract(repaymentPrincipal);
		Sacco.updatePeriodRemittance(loan, MPeriod.get(getCtx(), repayment.getC_Period_ID()), diff);
	}

	private void updateLoanRefund() {
		loan.setloanbalance(loan.getloanbalance().add(repayment.getPaymentAmount()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().add(repayment.getPaymentAmount()));
		repayment.setmonthclosingbal(loan.getloanbalance());
		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		// repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();
		saveAccPayables();

	}

	private void saveAccPayables() {
		// TODO Auto-generated method stub

	}

	private void updateLoanRemmittance() {
		loan.setloanbalance(loan.getloanbalance().subtract(repayment.getPrincipal()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().subtract(repayment.getPrincipal()));
		BigDecimal totalInterest = repayment.getexpectedinterest().add(repayment.getExtraInterest());
		loan.setintbalance(loan.getintbalance().subtract(totalInterest));
		loan.setlast_pay_date(DateUtil.newTimestamp());

		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		repayment.setmonthclosingbal(loan.getloanbalance());
		repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();
		saveAccRecievables();
	}

	private void saveAccRecievables() {
		AccRecievables accRecievables = new AccRecievables(getCtx(), 0, get_TrxName());
		accRecievables.setTransDate(DateUtil.newTimestamp());
		accRecievables.settransperiod(sacco.getsaccoperiod_ID());
		accRecievables.setCrAmount(repayment.getgross_amount_due());
		accRecievables.setTransAmount(repayment.getgross_amount_due());
		accRecievables.setappliedamount(repayment.getgross_amount_due());
		accRecievables.setComments(repayment.getComments());
		accRecievables.setbankgl_Acct(repayment.getbankgl_Acct());
		accRecievables.setCredit_Acct(repayment.getloan_gl_Acct());
		accRecievables.setDescription(getDescription());
		accRecievables.setLoanShare("Loan");
		accRecievables.sets_member_ID(loan.gets_member_ID());
		accRecievables.setpaymode(repayment.getpaymode());
		AmtInWords_EN aiw = new AmtInWords_EN();
		try {
			// String AmountInWords =
			// aiw.getAmtInWords(repayment.getgross_amount_due().toString());
			// accRecievables.setAmountInWords(AmountInWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
		accRecievables.save();
	}

	// update from zenith
	private String getDescription() {
		SLoanType loanType = new SLoanType(getCtx(), loan.gets_loantype_ID(), get_TrxName());
		return loanType.getloantypecode() + " Loan Remmittance No: " + repayment.getDocumentNo();
	}
}
