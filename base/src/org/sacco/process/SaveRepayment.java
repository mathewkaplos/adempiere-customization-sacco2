package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MPeriod;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Period_remittance;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.AD_User;
import org.compiere.model.I_s_loantype;
import org.compiere.model.I_s_member;
import org.compiere.model.LoanCharges;
import org.compiere.model.LoanGuarantorDetails;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.Sacco;
import org.compiere.model.ShareRemittance;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;
import zenith.util.Util;

public class SaveRepayment extends SvrProcess {
	private Repayment repayment = null;
	private SLoan loan = null;
	I_s_loantype loantype = null;

	AD_User user = null;

	String userCode = "";
	String chequeNo = "";
	String MemberNoDescription = "";
	I_s_member member = null;

	int C_Period_ID = 0;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		//

		repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		loan = new SLoan(getCtx(), repayment.gets_loans_ID(), get_TrxName());
		loantype = loan.gets_loantype();

		member = loan.gets_member();
		user = new AD_User(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()), get_TrxName());
		userCode = user.getName();
		if (repayment.getChequeNo() != null && !repayment.getChequeNo().isEmpty())
			chequeNo = repayment.getChequeNo();
		else
			chequeNo = repayment.getDocumentNo();
		MemberNoDescription = ".Mbr. No:" + member.getDocumentNo();

		C_Period_ID = Sacco.getSaccco().getsaccoperiod_ID();
	}

	@Override
	protected String doIt() throws Exception {
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
		freeGuarantorShares();
		return null;
	}

	private void freeGuarantorShares() {
		boolean freeAll = false;
		double loanToShareProportion = loan.getLoanToShareProportion();
		if (loanToShareProportion <= 0.8) { // loan is less than 80%
			freeAll = true;
		}
		System.out.println(freeAll);
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID=" + repayment.gets_loans_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails details = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				updateGuarantor(details);
				if (freeAll) {
					freeGuarantor(details);
				}
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

	private void updateGuarantor(LoanGuarantorDetails details) {
		BigDecimal guaranteeProportion = details.getproportion();
		BigDecimal freeingAmt = Util.round(guaranteeProportion.multiply(repayment.getPrincipal()), Env.ONE);
		MemberShares memberShares = new MemberShares(getCtx(), details.gets_membershares_ID(), get_TrxName());
		memberShares.setfreeshares(memberShares.getfreeshares().add(freeingAmt));
		memberShares.settiedshares(memberShares.gettiedshares().subtract(freeingAmt));
		memberShares.save();
		details.settiedshares(details.gettiedshares().subtract(freeingAmt));
		details.save();
	}

	private void freeGuarantor(LoanGuarantorDetails details) {
		BigDecimal freeingAmt = details.gettiedshares();
		MemberShares memberShares = new MemberShares(getCtx(), details.gets_membershares_ID(), get_TrxName());
		memberShares.setfreeshares(memberShares.getfreeshares().add(freeingAmt));
		memberShares.settiedshares(memberShares.gettiedshares().subtract(freeingAmt));
		memberShares.save();
		details.settiedshares(Env.ZERO);
		details.save();
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
		acctSchemaDefault = MAcctSchemaDefault.get(getCtx(), acctSchema.get_ID());
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		postLoanCharges();
		postLoan();
		repayment.setDocStatus("CO");
		repayment.setProcessed(true);
		repayment.setPosted(true);
		repayment.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;
	MAcctSchemaDefault acctSchemaDefault = null;

	/*
	 * Bank is always debited
	 */
	private void postLoan() {
		if (repayment.getPrincipal().compareTo(Env.ZERO) == 0) {
			return;
		}
		MAccount accountDR = new MAccount(Env.getCtx(), loan.gets_loantype().getloantypeloangl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				repayment.getPrincipal().negate());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), get_TrxName());
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
		lineDR.setDescription("Repayment." + MemberNoDescription);
		lineCR.save();

		
		
		postInterest();
	}

	private void postInterest() {
		BigDecimal totalInterest = repayment.getInterest().add(repayment.getExtraInterest());

		if (totalInterest.compareTo(Env.ZERO) == 0)
			return;

		MAccount accountDR = new MAccount(Env.getCtx(), loantype.getInterestReceivable_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), totalInterest.negate());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), get_TrxName());
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
		lineDR.setDescription("Loan Interest." + MemberNoDescription);
		lineCR.save();


	}

	private void postLoanCharges() {
		String sql = "SELECT * FROM adempiere.s_loan_repay_charges WHERE l_repayments_ID =" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanRepaymentCharge charge = new LoanRepaymentCharge(getCtx(), rs, get_TrxName());
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
		TransactionChargeSetup chargeSetup = new TransactionChargeSetup(Env.getCtx(), chargeSetupID, get_TrxName());

		MAccount accountDR = new MAccount(Env.getCtx(), repayment.getbankgl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), charge.getAmount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), chargeSetup.getglcode_Acct(), get_TrxName());
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
	}
}
