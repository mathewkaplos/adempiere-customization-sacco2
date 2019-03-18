package org.sacco.process;

import java.math.BigDecimal;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class SavePaymentMode extends SvrProcess {

	private SLoan loan = null;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loan.setloanbalance(loan.getapprovedamount());
		loan.setmonthopeningbal(loan.getapprovedamount());
		loan.setloanpaymode_done(true);
		loan.setintbalance(loan.getloaninterestamount());
		loan.save();
		if (loan.is_refinance()) {
			repayOldLoan();
		}
		return null;
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
