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
import org.compiere.model.LoanGuarantorDetails;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.Sacco;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;
import zenith.util.NumberWordConverter;
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
		String AmountInWords = NumberWordConverter.getMoneyIntoWords(repayment.getPaymentAmount().abs().doubleValue());
		repayment.setAmountInWords(AmountInWords);
		repayment.getGuarantorDetails(repayment.gets_loans_ID());
		repayment.freeTiedShares();

		repayment.save();

		// resetPeriodRemittance();
		PostLoanRepayment postLoanRepayment = new PostLoanRepayment(repayment, 0, get_TrxName());
		postLoanRepayment.post();
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
		loan.setappliedamount(repayment.getPaymentAmount());
		loan.setapprovedamount(repayment.getPaymentAmount());
		loan.setapproval_done(true);
		loan.setissued_amount(repayment.getPaymentAmount());
		loan.save();

		loan.setis_topup(true);
		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		// repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();

	}

	private void updateLoanRemmittance() {
		BigDecimal prev_bal = loan.getloanbalance();
		loan.setprev_balance(prev_bal);

		loan.setloanbalance(loan.getloanbalance().subtract(repayment.getPrincipal()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().subtract(repayment.getPrincipal()));
		BigDecimal totalInterest = repayment.getexpectedinterest().add(repayment.getExtraInterest());
		loan.setintbalance(loan.getintbalance().subtract(totalInterest));
		loan.setlast_pay_date(DateUtil.newTimestamp());
		loan.setis_topup(true);
		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		repayment.setmonthclosingbal(loan.getloanbalance());
		repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();
	}
}
