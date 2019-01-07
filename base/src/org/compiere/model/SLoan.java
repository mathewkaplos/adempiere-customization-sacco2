package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.DB;

public class SLoan extends X_s_loans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SLoan(Properties ctx, int s_loans_ID, String trxName) {
		super(ctx, s_loans_ID, trxName);
	}

	public SLoan(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public LoanSchedule getPeriodSchedule(int period) {
		String sql = "SELECT * FROM adempiere.s_loanschedule s WHERE s.s_loans_ID =" + get_ID() + " AND monthperiod="
				+ period;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				return new LoanSchedule(getCtx(), rs, get_TrxName());
			}

		} catch (Exception e) {

		}
		return null;
	}

	public MonthlyLoansAdjustments getPeriodAdjustment() {
		String sql = "SELECT * FROM adempiere.s_monthlyloansadjustments WHERE s_loans_ID=" + get_ID()
				+ " ORDER BY s_monthlyloansadjustments_ID DESC ";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				return new MonthlyLoansAdjustments(getCtx(), rs, get_TrxName());
			}

		} catch (Exception e) {

		}
		return null;
	}
}
