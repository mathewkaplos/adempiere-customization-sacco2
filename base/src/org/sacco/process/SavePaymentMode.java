package org.sacco.process;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class SavePaymentMode extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loan.setloanbalance(loan.getappliedamount());
		loan.setmonthopeningbal(loan.getappliedamount());
		loan.setloanpaymode_done(true);
		loan.save();
		return null;
	}

}
