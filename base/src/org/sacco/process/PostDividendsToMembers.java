package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.ShareRemittance;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

//org.sacco.process.PostDividendsToMembers
public class PostDividendsToMembers extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "select s_member_id,round(dividendamount,0) as rounded "
				+ " from adempiere.s_dividends where dividendamount>0";
		PreparedStatement stm = null;
		ResultSet rs = null;
		int count = 1;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_member_id = rs.getInt(1);
				BigDecimal dividendamount = rs.getBigDecimal(2);
				newRemmittance(s_member_id, dividendamount);
				System.out.println(count++);
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
		return null;
	}

	public void newRemmittance(int s_member_ID, BigDecimal appliedamount) {
		ShareRemittance shareRemittance = new ShareRemittance(getCtx(), 0, get_TrxName());
		shareRemittance.sets_member_ID(s_member_ID);
		shareRemittance.sets_membershares_ID(2147483647);
		shareRemittance.sets_payment_mode_remittance_ID(1000001);
		shareRemittance.setremittancedate(DateUtil.newTimestamp());
		shareRemittance.sets_sharetype_ID(2);
		shareRemittance.setreceiptamount(appliedamount);
		shareRemittance.setIsComplete(true);
		shareRemittance.setothercharges(Env.ZERO);
		shareRemittance.setis_withdrawal(false);
		shareRemittance.setremittanceremarks("2018 Dividend @4% shares");
		shareRemittance.save();
	}
}
