package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Period;
import java.util.Calendar;

import org.compiere.model.Dividend;
import org.compiere.model.Dividend_manager;
import org.compiere.model.MPeriod;
import org.compiere.model.ShareType;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class ListDividends extends SvrProcess {

	private Dividend_manager dividend_manager = null;

	private ShareType shareType = null;

	private int year;
	private int no_of_months;
	private int start_month;
	private boolean ignoreDormantMembers;
	private int s_sharetype_ID;
	private BigDecimal minShares;
	private BigDecimal rate;
	private int taxRate;

	int[] sampleMembers = new int[] { 72668 };

	@Override
	protected void prepare() {
		dividend_manager = new Dividend_manager(getCtx(), getRecord_ID(), get_TrxName());
		MPeriod startPeriod = new MPeriod(getCtx(), dividend_manager.getstart_period_ID(), get_TrxName());
		MPeriod endPeriod = new MPeriod(getCtx(), dividend_manager.getend_period_ID(), get_TrxName());

		shareType = new ShareType(getCtx(), dividend_manager.gets_sharetype_ID(), get_TrxName());
		long timestamp = startPeriod.getStartDate().getTime();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(timestamp);
		year = cal.get(Calendar.YEAR);
		start_month = cal.get(Calendar.MONTH);

		Period diff = Period.between(startPeriod.getStartDate().toLocalDateTime().toLocalDate().withDayOfMonth(1),
				endPeriod.getStartDate().toLocalDateTime().toLocalDate().withDayOfMonth(1));
		System.out.println(diff.getMonths());
		no_of_months = diff.getMonths();

		ignoreDormantMembers = dividend_manager.isignore_dormant_members();
		s_sharetype_ID = dividend_manager.gets_sharetype_ID();
		minShares = dividend_manager.getminimum_shares_to_qualify();
		rate = dividend_manager.getRate();
		taxRate = shareType.getsharewithholdingtax();
	}

	@Override
	protected String doIt() throws Exception {

		String sql0 = "DELETE  FROM adempiere.s_dividends WHERE s_dividend_manager_ID=" + getRecord_ID();
		DB.executeUpdate(sql0, get_TrxName());
		int count = 1;
		BigDecimal amount_apportioned = Env.ZERO;
		String sql = "SELECT DISTINCT s_member_ID FROM adempiere.s_share_closing_bal";// where s_member_id>1026787";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_member_ID = rs.getInt(1);

				BigDecimal grossDividend = Env.ZERO;
				for (int j = 0; j < 12; j++) {
					int mon = 1 + j;
					String sql1 = "SELECT adempiere.get_calculate_dividend(" + s_member_ID + "," + s_sharetype_ID + ","
							+ mon + "," + year + "," + rate + "," + taxRate + "," + 12 + "," + 1 + ")";
					BigDecimal val = DB.getSQLValueBD(get_TrxName(), sql1);
					if (val != null)
						grossDividend = grossDividend.add(val);

				}
				System.out.println(count++);
				if (s_member_ID > 0) {
					Dividend dividend = new Dividend(getCtx(), 0, get_TrxName());
					dividend.sets_dividend_manager_ID(getRecord_ID());
					dividend.sets_member_ID(s_member_ID);
					dividend.sets_sharetype_ID(s_sharetype_ID);
					dividend.setdividend_rate(rate);
					dividend.setDividendAmount(grossDividend);
					dividend.setWithhodingTax(BigDecimal.valueOf(taxRate));
					double grossDividendDouble = grossDividend.doubleValue();
					double NetDividendDouble = grossDividendDouble * (100 - taxRate) * 0.01;
					BigDecimal NetDividend = BigDecimal.valueOf(NetDividendDouble);
					dividend.setNetDividend(NetDividend);

					dividend.save();
					amount_apportioned = amount_apportioned.add(NetDividend);
				}

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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		dividend_manager.setamount_apportioned(amount_apportioned);

		dividend_manager.save();
		return null;
	}

}
