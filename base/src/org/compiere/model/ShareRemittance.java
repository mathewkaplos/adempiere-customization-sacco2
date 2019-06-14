package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.util.DB;

public class ShareRemittance extends X_s_shareremittance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 457309379633078849L;

	public ShareRemittance(Properties ctx, int s_shareremittance_ID, String trxName) {
		super(ctx, s_shareremittance_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ShareRemittance(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public SavingsWithdrawalCharge[] getCharges() {
		List<SavingsWithdrawalCharge> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_saving_withdrawal_charges WHERE s_shareremittance_ID =" + get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				SavingsWithdrawalCharge charge = new SavingsWithdrawalCharge(getCtx(), rs, get_TrxName());
				list.add(charge);
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

		return list.toArray(new SavingsWithdrawalCharge[list.size()]);

	}

}
