package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Dividend extends X_s_dividends {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5938380757181971662L;

	public Dividend(Properties ctx, int s_dividends_ID, String trxName) {
		super(ctx, s_dividends_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Dividend(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
