package org.sacco.process;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class SaveChequeWriting extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loan.setloanbalance(loan.getchequeamount());
		loan.setmonthopeningbal(loan.getchequeamount());
		loan.setcheque_writing_done(true);
		loan.save();

		return null;
	}

}
