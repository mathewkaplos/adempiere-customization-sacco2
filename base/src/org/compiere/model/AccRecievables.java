package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class AccRecievables extends X_s_accReceivables {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8338969688022988095L;

	public AccRecievables(Properties ctx, int s_accReceivables_ID, String trxName) {
		super(ctx, s_accReceivables_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public AccRecievables(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
