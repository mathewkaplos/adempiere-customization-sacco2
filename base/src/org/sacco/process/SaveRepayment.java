package org.sacco.process;

import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

import zenith.util.DateUtil;

public class SaveRepayment extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		Repayment repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		SLoan loan = new SLoan(getCtx(), repayment.gets_loans_ID(), get_TrxName());

		repayment.setReceiptNo(repayment.getDocumentNo());
		repayment.setVoucherNo(repayment.getDocumentNo());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		repayment.setInterest(repayment.getexpectedinterest());
		
		repayment.setIsComplete(true);
		repayment.save();

		loan.setloanbalance(loan.getloanbalance().subtract(repayment.getPrincipal()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().subtract(repayment.getPrincipal()));
		loan.setintbalance(loan.getintbalance().subtract(repayment.getexpectedinterest()));
		loan.setlast_pay_date(DateUtil.newTimestamp());

		loan.save();
		return null;
	}

}
