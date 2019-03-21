package org.sacco.process;

import java.math.BigDecimal;

import org.compiere.model.LoanDisbursement;
import org.compiere.model.MemberShares;
import org.compiere.model.SLoan;
import org.compiere.model.ShambaPlot;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SavePaymentMode extends SvrProcess {

	private SLoan loan = null;

	private String payMode = null;

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		payMode = loan.getpaymode();
	}

	@Override
	protected String doIt() throws Exception {
		if (loan.getNumberOfRepayments() == 0) {
			loan.setloanbalance(loan.getapprovedamount());
			loan.setmonthopeningbal(loan.getapprovedamount());
			loan.setloanpaymode_done(true);
			loan.setintbalance(loan.getloaninterestamount());
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
		return null;
	}

	private void saveDisbursement() {
		LoanDisbursement disbursement = new LoanDisbursement(getCtx(), 0, get_TrxName());
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
