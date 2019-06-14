package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.AD_User;
import org.compiere.model.I_s_member;
import org.compiere.model.LoanCharges;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Repayment;
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
	int disbursement_ID = 0;
	boolean chargesAddedToLoan = false;
	AD_User user = null;

	String userCode = "";
	String chequeNo = "";
	String MemberNoDescription = "";
	I_s_member member = null;

	int C_Period_ID = 0;

	public PostLoanDisbursement(MBank bank, String trxName, SLoan loan) {

		totalCharge = Env.ZERO;
		this.bank = bank;
		this.trxName = trxName;
		this.loan = loan;
		this.disbursement_ID = loan.gets_disbursement_mode_ID();
		loanType = new SLoanType(Env.getCtx(), loan.gets_loantype_ID(), trxName);

		chargesAddedToLoan = loanType.ischarges_added_to_loan();
		saveDisbursement();

		member = loan.gets_member();
		user = new AD_User(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()), null);
		userCode = user.getName();
		//// if (!loan.getreadychequeno().isEmpty() && loan.getreadychequeno() != null)
		// chequeNo = loan.getreadychequeno();
		// else
		chequeNo = disbursement.getDocumentNo();
		MemberNoDescription = ".Mbr. No:" + member.getDocumentNo();

		C_Period_ID = Sacco.getSaccco().getsaccoperiod_ID();

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
		prePostLoan();
		postLoan();
		disbursement.setDocStatus("CO");
		disbursement.setProcessed(true);
		disbursement.setPosted(true);
		disbursement.save();
	}

	BigDecimal loanPostingAMountDR = Env.ZERO;
	BigDecimal loanPostingAMountCR = Env.ZERO;

	private void prePostLoan() {
		if (chargesAddedToLoan) {// not added to cheque
			loanPostingAMountDR = disbursement.getdisbursed_amount();
			if (loan.is_refinance()) {
				int oldLoan_ID = loan.gets_loans_refinance_ID();
				SLoan oldLoan = new SLoan(Env.getCtx(), oldLoan_ID, trxName);
				BigDecimal interest = oldLoan.getLoanInterestToday();
				BigDecimal penalty = oldLoan.getLoanPenaltyToday();

				loanPostingAMountCR = loan.getappliedamount().add(interest).add(penalty);

			} else {
				loanPostingAMountCR = disbursement.getdisbursed_amount();
			}

			loan.setloanbalance(loan.getloanbalance().add(totalCharge));
			loan.save();

		} else {
			// charges deducted from the cheque
			loanPostingAMountDR = disbursement.getdisbursed_amount().subtract(totalCharge);
			if (loan.is_refinance()) {
				int oldLoan_ID = loan.gets_loans_refinance_ID();
				SLoan oldLoan = new SLoan(Env.getCtx(), oldLoan_ID, trxName);
				BigDecimal interest = oldLoan.getLoanInterestToday();
				BigDecimal penalty = oldLoan.getLoanPenaltyToday();

				loanPostingAMountCR = loan.getappliedamount().add(interest).add(penalty);

			} else {
				loanPostingAMountCR = disbursement.getdisbursed_amount();
			}

		}

	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postLoan() {

		int debitGL = loanType.getloantypeloangl_Acct();
		int creditGL = 0;

		BigDecimal debitAmount = loanPostingAMountDR;
		BigDecimal crditAmount = Env.ZERO;
		if (disbursement_ID == Sacco.disbursementmode_investment) {
			// shamba
			creditGL = loan.gets_shamba().getplot_gl_Acct();
			crditAmount = loan.getplot_cost();

		} else if (disbursement_ID == Sacco.disbursementmode_saving) {
			MemberShares shares = new MemberShares(Env.getCtx(), loan.gets_membershares_ID(), userCode);
			creditGL = shares.gets_sharetype().getsaving_gl_code_Acct();
			crditAmount = loanPostingAMountCR;
			// Savings transfer
		} else {
			creditGL = bank.getGLAccount();
			crditAmount = loanPostingAMountCR;
		}

		MAccount accountDR = new MAccount(Env.getCtx(), debitGL, trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), debitAmount);

		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), creditGL, trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), crditAmount.negate());
		lineCR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Loan Disbursement." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("Loan Disbursement." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
		lineCR.save();

		if (disbursement_ID == Sacco.disbursementmode_investment) {
			// shamba
			int creditGL2 = loan.gets_shamba().getnet_gain_gl_Acct();
			BigDecimal crditAmount2 = loan.getplot_gain();

			MAccount accountCR2 = new MAccount(Env.getCtx(), creditGL2, trxName);
			FactLine lineCR2 = fact.createLine(docLine, accountCR2, acctSchema.getC_Currency_ID(),
					crditAmount2.negate());
			lineCR2.save();

			lineCR2.setcontra_account_id(lineDR.getAccount_ID());
			lineCR2.setUserCode(user.getName());
			lineCR2.setChequeNo(chequeNo);
			lineCR2.setDescription("Loan Disbursement." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
			lineCR2.save();

		}
		if (loan.is_refinance()) {
			// Credit Bank
			int creditGL2 = loan.getC_Bank().getGLAccount();
			int oldLoan_ID = loan.gets_loans_refinance_ID();
			SLoan oldLoan = new SLoan(Env.getCtx(), oldLoan_ID, trxName);
			BigDecimal crditAmount2 = oldLoan.getloanbalance();

			MAccount accountCR2 = new MAccount(Env.getCtx(), creditGL2, trxName);
			FactLine lineCR2 = fact.createLine(docLine, accountCR2, acctSchema.getC_Currency_ID(),
					crditAmount2.negate());
			lineCR2.save();

			lineCR2.setcontra_account_id(lineDR.getAccount_ID());
			lineCR2.setUserCode(user.getName());
			lineCR2.setChequeNo(chequeNo);
			lineCR2.setDescription("Loan Refinance." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
			lineCR2.save();
			repayOldLoan(creditGL);
		}

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
		MAccount accountDR = new MAccount(Env.getCtx(), loanType.getInterestReceivable_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), loanType.getUnEarnedInterest_Acct(), trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				loan.getloaninterestamount().negate());
		lineCR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("InterestReceivable." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("UnEarnedInterest." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
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

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Charges." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("Charges." + "Loan No. " + loan.getDocumentNo() + MemberNoDescription);
		lineCR.save();

	}

	private void saveDisbursement() {
		disbursement = new LoanDisbursement(Env.getCtx(), 0, trxName);
		disbursement.sets_loans_ID(loan.get_ID());
		disbursement.setAmount(loan.getapprovedamount());
		if (loan.ispartial_disbursement()) {
			disbursement.setdisbursed_amount(loan.getdisbursed_amount());
		} else {
			disbursement.setdisbursed_amount(loan.getapprovedamount());
		}
		disbursement.settransactiondate(DateUtil.newTimestamp());
		disbursement.save();
		loan.setdisbursed_amount(Env.ZERO);
		loan.save();

		loanType.setdisbursed(true);
		loanType.save();
	}

	private void repayOldLoan(int creditGL) {
		int oldLoan_ID = loan.gets_loans_refinance_ID();
		SLoan oldLoan = new SLoan(Env.getCtx(), oldLoan_ID, trxName);

		oldLoan.setC_Bank_ID(loan.getC_Bank_ID());
		oldLoan.save();

		Repayment newRepayment = loan.newRepayment(oldLoan);
		PostLoanRepayment postLoanRepayment = new PostLoanRepayment(newRepayment, creditGL,trxName);
		postLoanRepayment.post();
	}
}
