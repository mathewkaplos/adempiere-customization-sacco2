package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.compiere.model.X_s_day;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class CreateHolidays extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT to_char( date1, 'mm-dd 00') as re_format FROM adempiere.s_holidays WHERE isActive='Y'";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				String likeClause = "'%" + rs.getString(1) + "%'";
				update(likeClause);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void update(String likeClause) {
		reset();
		String sql = "select * from adempiere.s_day WHERE date1::text like" + likeClause;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, likeClause);
			rs = stm.executeQuery();
			while (rs.next()) {
				X_s_day day = new X_s_day(getCtx(), rs, get_TrxName());
				day.setIsNonWorkingDay(true);
				day.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void reset() {
		String sql = "UPDATE adempiere.s_day SET IsNonWorkingDay ='N'";
		DB.executeUpdate(sql, get_TrxName());
	}
}
