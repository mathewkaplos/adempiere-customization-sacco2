package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.STransactions;
import org.compiere.model.X_s_payroll_compare_csv;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class UpdatePayrollTransactions extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		String sql = "SELECT * FROM adempiere.s_payroll_compare_csv WHERE s_payrol_interface_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				X_s_payroll_compare_csv compare_csv = new X_s_payroll_compare_csv(getCtx(), rs, get_TrxName());
				STransactions transactions = new STransactions(getCtx(), compare_csv.gets_transactions_ID(),
						get_TrxName());
				if (compare_csv.gets_membershares_ID() > 0) {
					BigDecimal newAmount = compare_csv.getimport_amount();
					transactions.setshare_contribution(newAmount);
					transactions.save();
				} else {

					transactions.save();
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

		return null;
	}

}
