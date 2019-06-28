package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.AD_User;
import org.compiere.model.I_s_loantype;
import org.compiere.model.I_s_member;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.model.X_s_loan_recovery;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class PostLoanRepayment {
	Doc doc = null;
	PO po = null;
	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;
	MAcctSchemaDefault acctSchemaDefault = null;

	private Repayment repayment = null;
	private SLoan loan = null;
	I_s_loantype loantype = null;

	AD_User user = null;

	String userCode = "";
	String chequeNo = "";
	String MemberNoDescription = "";
	I_s_member member = null;

	int C_Period_ID = 0;
	String trxName = null;

	int interestDebitAcc = 0; // for re finance

	public PostLoanRepayment(Repayment repayment, int debitAcc, String _trxName) {
		this.repayment = repayment;
		trxName = _trxName;
		loan = new SLoan(Env.getCtx(), repayment.gets_loans_ID(), trxName);
		loantype = loan.gets_loantype();
		interestDebitAcc = debitAcc;
		member = loan.gets_member();
		user = new AD_User(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()), trxName);
		userCode = user.getName();
		if (repayment.getChequeNo() != null && !repayment.getChequeNo().isEmpty())
			chequeNo = repayment.getChequeNo();
		else
			chequeNo = repayment.getDocumentNo();
		MemberNoDescription = ".Mbr. No:" + member.getDocumentNo();

		C_Period_ID = Sacco.getSaccco().getsaccoperiod_ID();

	}

	public void post() {
		MAcctSchema[] ass = { MClient.get(Env.getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.l_repayments WHERE l_repayments_ID =" + repayment.get_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, trxName);
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_LoanReapayment repayment_Doc = new Doc_LoanReapayment(ass, Repayment.class, rs, trxName);
				doc = repayment_Doc;

				Repayment repayment = new Repayment(Env.getCtx(), rs, trxName);
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
		acctSchemaDefault = MAcctSchemaDefault.get(Env.getCtx(), acctSchema.get_ID());
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		if (repayment.isoffset_from_shares()) {
			// create a withdrawal entry
			updateShareRecory();

		}
		postLoanCharges();
		postLoan();

		repayment.setDocStatus("CO");
		repayment.setProcessed(true);
		repayment.setPosted(true);
		repayment.save();
	}

	private void updateShareRecory() {
		String sql = "SELECT * FROM adempiere.s_loan_recovery WHERE l_repayments_ID =" + repayment.get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, trxName);
			rs = stm.executeQuery();
			while (rs.next()) {
				X_s_loan_recovery loan_recovery = new X_s_loan_recovery(Env.getCtx(), rs, null);
				postShareRecory(loan_recovery);
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

	private void postShareRecory(X_s_loan_recovery loan_recovery) {
		MemberShares memberShares = new MemberShares(Env.getCtx(), loan_recovery.gets_membershares_ID(),null);
		memberShares.newRemmittance(loan_recovery.getAmount().negate(),true,"Loan Offsetting, for Mbr."+loan.gets_member().getDocumentNo(),9);

	}

	/*
	 * Bank is always debited
	 */
	private void postLoan() {
		if (repayment.getPrincipal().compareTo(Env.ZERO) == 0) {
			postInterest();
			return;
		}
		MAccount accountDR = new MAccount(Env.getCtx(), loan.gets_loantype().getloantypeloangl_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				repayment.getPrincipal().negate());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), repayment.getPrincipal());
		lineCR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Repayment." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("Repayment." + MemberNoDescription);
		lineCR.save();

		postInterest();
	}

	private void postInterest() {
		BigDecimal totalInterest = repayment.getInterest().add(repayment.getExtraInterest());

		if (totalInterest.compareTo(Env.ZERO) == 0)
			return;

		MAccount accountDR = new MAccount(Env.getCtx(), loantype.getloantypeinterestgl_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), totalInterest.negate());
		lineDR.save();

		int bankGL = 0;
		if (interestDebitAcc > 0)
			bankGL = interestDebitAcc;
		else
			bankGL = repayment.getbankgl_Acct();

		MAccount accountCR = new MAccount(Env.getCtx(), bankGL, trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), totalInterest);
		lineCR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Loan Interest." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("Loan Interest." + MemberNoDescription);
		lineCR.save();
		postPenalty();
	}

	private void postPenalty() {
		BigDecimal penalty = repayment.getpenalty_due();

		if (penalty.compareTo(Env.ZERO) == 0)
			return;

		MAccount accountDR = new MAccount(Env.getCtx(), loantype.getloantypeinterestgl_Acct(), trxName);
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), penalty.negate());
		lineDR.save();

		int bankGL = 0;
		if (interestDebitAcc > 0)
			bankGL = interestDebitAcc;
		else
			bankGL = repayment.getbankgl_Acct();

		MAccount accountCR = new MAccount(Env.getCtx(), bankGL, trxName);
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), penalty);
		lineCR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Loan Penalty." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineCR.setDescription("Loan Penalty." + MemberNoDescription);
		lineCR.save();

	}

	private void postLoanCharges() {
		String sql = "SELECT * FROM adempiere.s_loan_repay_charges WHERE l_repayments_ID =" + repayment.get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, trxName);
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanRepaymentCharge charge = new LoanRepaymentCharge(Env.getCtx(), rs, trxName);
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

	private void postCharge(LoanRepaymentCharge charge) {

		int chargeSetupID = charge.gets_accountsetup_ID();
		if (chargeSetupID < 1)
			return;
		totalCharge = totalCharge.add(charge.getAmount());
		TransactionChargeSetup chargeSetup = new TransactionChargeSetup(Env.getCtx(), chargeSetupID, trxName);

		MAccount accountDR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), trxName);
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
		lineDR.setDescription("Charges." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineDR.setDescription("Charges." + MemberNoDescription);
		lineCR.save();
	}

}
