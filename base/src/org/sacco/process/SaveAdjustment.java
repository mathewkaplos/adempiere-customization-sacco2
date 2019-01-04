package org.sacco.process;

import org.compiere.model.MonthlyLoansAdjustments;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class SaveAdjustment extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		save();
		return null;
	}

	private void save() {
		MonthlyLoansAdjustments adjustments = new MonthlyLoansAdjustments(getCtx(), getRecord_ID(), get_TrxName());
		SLoan loan = new SLoan(getCtx(), adjustments.gets_loans_ID(), get_TrxName());

	}

}
