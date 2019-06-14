package org.compiere.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.util.AmtInWords_EN;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class Repayment extends X_l_repayments {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Repayment(Properties ctx, int l_repayments_ID, String trxName) {
		super(ctx, l_repayments_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Repayment(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	private LoanGuarantorDetails[] details = null;
	private double totalAmtGuranteed = 0;

	public LoanGuarantorDetails[] getGuarantorDetails(int s_loans_ID) {
		List<LoanGuarantorDetails> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID= " + s_loans_ID
				+ " AND amountguaranteed>0";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails detail = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				totalAmtGuranteed = totalAmtGuranteed + detail.getamountguaranteed().doubleValue();
				list.add(detail);
			}

		} catch (Exception e) {
			// TODO: handle exception
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
				// TODO: handle exception
			}
		}
		details = list.toArray(new LoanGuarantorDetails[list.size()]);

		return list.toArray(new LoanGuarantorDetails[list.size()]);
	}

	public void freeTiedShares() {
		for (int i = 0; i < details.length; i++) {
			LoanGuarantorDetails d = details[i];
			double dd = (d.getamountguaranteed().doubleValue() / totalAmtGuranteed) * this.getPrincipal().doubleValue();
			int s_membershares_ID = d.gets_membershares_ID();
			MemberShares ms = new MemberShares(getCtx(), s_membershares_ID, get_TrxName());

			BigDecimal amt = BigDecimal.valueOf(dd);
			ms.setfreeshares(ms.getfreeshares().add(amt));
			ms.settiedshares(ms.gettiedshares().subtract(amt));
			ms.save();
		}

	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		System.out.println("lllllllllllllll");
		return super.afterSave(newRecord, success);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		return super.beforeSave(newRecord);
	}
}
