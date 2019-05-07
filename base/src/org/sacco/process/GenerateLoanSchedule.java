package org.sacco.process;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class GenerateLoanSchedule extends SvrProcess {

	SLoan loan = null;

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		return Generate.generate(getRecord_ID());
	}

}