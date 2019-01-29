package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Properties;
import org.compiere.util.DB;

import zenith.util.DateUtil;

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

	public boolean remittanceDoneForPeriod(Timestamp periodDate) {
		MPeriod period = MPeriod.get(getCtx(), periodDate, 0);
		String sql = "SELECT * FROM adempiere.l_repayments WHERE s_loans_ID =" + get_ID() + " AND C_Period_ID ="
				+ period.get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				if (repayment.isComplete())
					return true;
			}

		} catch (Exception e) {

		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean remittanceDoneForPeriod(int C_Period_ID) {
		String sql = "SELECT * FROM adempiere.l_repayments WHERE s_loans_ID =" + get_ID() + " AND C_Period_ID ="
				+ C_Period_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				if (repayment.isComplete())
					return true;
			}

		} catch (Exception e) {

		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public long getLastRepayPeriodInDays(Timestamp selectedtDate) {
		long diff = 0;
		LocalDateTime d2 = selectedtDate.toLocalDateTime();
		String sql = "SELECT * FROM adempiere.l_repayments WHERE isComplete ='Y' AND s_loans_ID =" + get_ID()
				+ " ORDER BY created DESC";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				LocalDateTime d1 = repayment.getPaymentDate().toLocalDateTime();
				diff = Duration.between(d1, d2).toDays();

			} else {
				LocalDateTime d1 = this.getloanappdate().toLocalDateTime();
				diff = Duration.between(d1, d2).toDays();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return diff;
	}
}
