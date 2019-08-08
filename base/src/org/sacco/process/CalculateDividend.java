package org.sacco.process;

import org.compiere.model.Dividend_manager;
import org.compiere.process.SvrProcess;

public class CalculateDividend extends SvrProcess {

	private Dividend_manager dividend_manager = null;

	@Override
	protected void prepare() {
		dividend_manager = new Dividend_manager(getCtx(), getRecord_ID(), get_TrxName());

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
