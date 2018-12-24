package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;

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

}