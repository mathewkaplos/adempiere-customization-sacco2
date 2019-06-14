package org.sacco.process;

import org.compiere.model.Period_closing;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class ClosePeriod extends SvrProcess {

	int s_period_closing_ID = 0;

	@Override
	protected void prepare() {

		s_period_closing_ID = getRecord_ID();
	}

	@Override
	protected String doIt() throws Exception {
		Period_closing period_closing = new Period_closing(getCtx(), s_period_closing_ID, get_TrxName());
		period_closing.setclosing_date(DateUtil.newTimestamp());
		period_closing.setclosing_time(DateUtil.newTimestamp());
		period_closing.setclosing_user_ID(Env.getAD_User_ID(getCtx()));
		period_closing.setclosed(true);
		period_closing.save();

		
		Sacco sacco = Sacco.getSaccco();
		sacco.setsaccoperiod_ID(period_closing.getnext_period_ID());
		sacco.save();

		return null;
	}

}
