package org.sacco.callout;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MPeriod;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

public class PeriodCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		MPeriod period = Sacco.getCurrentPeriod();
		Timestamp current = period.getStartDate();

		mTab.setValue("current_period_ID", period.getC_Period_ID());
		Calendar cal = Calendar.getInstance();
		cal.setTime(current);
		cal.add(Calendar.MONTH, 1);
		Timestamp next = new Timestamp(cal.getTime().getTime());
		mTab.setValue("next_period_ID", MPeriod.getC_Period_ID(Env.getCtx(), next, 0));
		return "";
	}
}
