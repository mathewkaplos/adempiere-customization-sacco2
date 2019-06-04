package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class PettyCash extends X_s_petty_cash {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PettyCash(Properties ctx, int s_petty_cash_ID, String trxName) {
		super(ctx, s_petty_cash_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public PettyCash(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
