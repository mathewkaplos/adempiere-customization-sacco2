package org.sacco.process;

import org.compiere.process.SvrProcess;
import org.sacco.loan.Schedule;

public class ReScheduleLoan extends SvrProcess {

	@Override
	protected void prepare() {
	}

	@Override
	protected String doIt() throws Exception {
		Schedule schedule = new Schedule(getRecord_ID(), false);
		schedule.prepareSchedules();
		return null;
	}
}
