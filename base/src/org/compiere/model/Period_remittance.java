package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Period_remittance extends X_s_period_remittance {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Period_remittance(Properties ctx, int s_period_remittance_ID, String trxName) {
		super(ctx, s_period_remittance_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Period_remittance(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
}
