package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.util.DB;
import org.compiere.util.Env;

public class SLoanType extends X_s_loantype {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SLoanType(Properties ctx, int s_loantype_ID, String trxName) {
		super(ctx, s_loantype_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public SLoanType(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public static SLoanType getLoanType(int s_loans_ID) {
		int s_loantype_ID = new SLoan(Env.getCtx(), s_loans_ID, null).gets_loantype_ID();
		return new SLoanType(Env.getCtx(), s_loantype_ID, null);
	}

	public Other_loan_charges[] getChargesForLoan() {
		List<Other_loan_charges> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_other_loan_charges WHERE s_loantype_ID =" + this.gets_loantype_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, null);
			rs = stm.executeQuery();
			while (rs.next()) {
				Other_loan_charges charge = new Other_loan_charges(getCtx(), rs, get_TrxName());
				list.add(charge);
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
			} catch (Exception e2) {

			}
		}
		return list.toArray(new Other_loan_charges[list.size()]);
	}
}