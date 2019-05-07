package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.LoanCharges;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.PO;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class PostLoanDisbursement {

	LoanDisbursement disbursement = null;
	MBank bank = null;

	String trxName = null;
	SLoan loan = null;
	Doc doc = null; //
	PO po = null; //
	SLoanType loanType = null;//

	public PostLoanDisbursement(MBank bank, String trxName, SLoan loan) {
		totalCharge = Env.ZERO;
		this.bank = bank;
		this.trxName = trxName;
		this.loan = loan;
		loanType = new SLoanType(Env.getCtx(), loan.gets_loantype_ID(), trxName);
		saveDisbursement();
	}

	public void post() {
		MAcctSchema[] ass = { MClient.get(Env.getCtx()).getAcctSchema() };
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {

			String sql = "SELECT * FROM adempiere.s_loan_disbursement WHERE s_loan_disbursement_ID="
					+ disbursement.get_ID();
			stm = DB.prepareStatement(sql, trxName);
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_LoanDisbursement disbursement = new Doc_LoanDisbursement(ass, LoanDisbursement.class, rs, trxName);
				doc = disbursement;

				LoanDisbursement loanDisbursement = new LoanDisbursement(Env.getCtx(), rs, trxName);
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
		postLoanCharges();
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
		BigDecimal disbursementAmount = disbursement.getdisbursed_amount().subtract(totalCharge);
		MAccount accountDR = new MAccount(Env.getCtx(), loanType.getloantypeloangl_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), disbursementAmount);
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), bank.getGLAccount(), trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				disbursementAmount.negate());
		lineCR.save();
		if (loan.ispartial_disbursement()) {
			if (loan.isPartiallyDisbursed()) { // at least one department had
												// taken place, so do not post
												// interest
				// NEVER TODO
			} else {
				postInterest();
			}
		} else {
			postInterest();
		}
	}

	private void postInterest() {
		if (loan.getloaninterestamount().compareTo(Env.ZERO) < 1) {
			return;
		}
		Sacco sacco = Sacco.getSaccco();
		MAccount accountDR = new MAccount(Env.getCtx(), sacco.getInterestReceivable_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), sacco.getUnEarnedInterest_Acct(), trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount().negate());
		lineCR.save();
	}

	private void postLoanCharges() {
		String sql = "SELECT * FROM adempiere.s_loan_charges WHERE s_loans_ID =" + loan.get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, trxName);
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanCharges charge = new LoanCharges(Env.getCtx(), rs, trxName);
				postCharge(charge);
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
	}

	static BigDecimal totalCharge = Env.ZERO;

	private void postCharge(LoanCharges charge) {

		int chargeSetupID = charge.gets_accountsetup_ID();
		if (chargeSetupID < 1)
			return;
		totalCharge = totalCharge.add(charge.getAmount());
		TransactionChargeSetup chargeSetup = new TransactionChargeSetup(Env.getCtx(), chargeSetupID, trxName);

		MAccount accountDR = new MAccount(Env.getCtx(), loanType.getloantypeloangl_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), charge.getAmount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), chargeSetup.getglcode_Acct(), trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				charge.getAmount().negate());
		lineCR.save();
	}

	private void saveDisbursement() {
		disbursement = new LoanDisbursement(Env.getCtx(), 0, trxName);
		disbursement.sets_loans_ID(loan.get_ID());
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

		loanType.setdisbursed(true);
		loanType.save();
	}

}
