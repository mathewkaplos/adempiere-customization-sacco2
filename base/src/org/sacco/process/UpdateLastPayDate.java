package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class UpdateLastPayDate extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}
	
	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT s_loans_id, adempiere.getlastpaydate(s_loans_id::int)::text FROM adempiere.s_loans WHERE last_pay_date IS NULL";
		PreparedStatement stm = null;
		ResultSet rs = null;
		int x = 0;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_loans_ID = rs.getInt(1);
				String last_pay_date = rs.getString(2);
				updateLoan(s_loans_ID, last_pay_date);
				System.out.println(x++);
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

	private void updateLoan(int s_loans_ID, String last_pay_date) {
		String sql = "UPDATE adempiere.s_loans SET last_pay_date='" + last_pay_date + "' WHERE s_loans_ID="
				+ s_loans_ID;
		DB.executeUpdate(sql, null);
	}

}
