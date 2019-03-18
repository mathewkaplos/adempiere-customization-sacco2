package org.sacco.process;

import java.math.BigDecimal;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.sacco.loan.ApplyLoanCharges;

public class SaveApproveReject extends SvrProcess {

	SLoan loan = null;

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		if (loan.isApproved()) {
			loan.setapproval_done(true);
			loan.setloanstatus("APPROVED");
			loan.save();
			if (loan.is_refinance()) {
				int oldLoan_ID = loan.gets_loans_refinance_ID();
				SLoan oldLoan = new SLoan(getCtx(), oldLoan_ID, get_TrxName());
				BigDecimal oldLoanBal = oldLoan.getloanbalance();
				BigDecimal approvedAmount = loan.getapprovedamount();
				BigDecimal appliedamount = approvedAmount.subtract(oldLoanBal);

				loan.setappliedamount(appliedamount);
				loan.save();
			}
			//addCharges();
		}
		return null;
	}

	private void addCharges() {
		BigDecimal loanAmt = loan.getappliedamount();
		ApplyLoanCharges applyLoanCharges = new ApplyLoanCharges(loan, "loan_tracking", loanAmt);
		applyLoanCharges.generate();
	}

}
