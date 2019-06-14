package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.compiere.model.Day;
import org.compiere.model.MPeriod;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class CreatePeriodDays extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT * FROM adempiere.C_Period";
		PreparedStatement stm = null;
		ResultSet rs = null;
		int x = 1;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				MPeriod period = new MPeriod(getCtx(), rs, get_TrxName());
				createDays(period);
				System.out.println(x++);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void createDays(MPeriod period) {
		try {

			Date myDate = new Date(period.getStartDate().getTime());

			Date myDate2 = new Date(period.getEndDate().getTime());

			Calendar start = Calendar.getInstance();
			start.setTime(myDate);

			Calendar end = Calendar.getInstance();
			end.setTime(myDate2);
			end.add(Calendar.DATE, 1);

			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
				// date.to
				Timestamp timestamp = new Timestamp(date.getTime());
				Day day = new Day(getCtx(), 0, get_TrxName());
				day.setC_Period_ID(period.get_ID());
				day.setDate1(timestamp);
				day.setIsClosed(false);
				day.setIsOpen(false);

				if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
						|| start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					day.setIsWeekend(true);
				} else {
					day.setIsWeekend(false);
				}
				day.save();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
