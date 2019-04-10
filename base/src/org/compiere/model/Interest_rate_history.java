package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Interest_rate_history extends X_s_interest_rate_history {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1848336067055035710L;

	public Interest_rate_history(Properties ctx, int s_interest_rate_history_ID, String trxName) {
		super(ctx, s_interest_rate_history_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Interest_rate_history(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
