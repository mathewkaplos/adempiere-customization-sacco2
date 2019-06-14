package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class AccPayables extends X_s_accPayable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4491181871626105036L;

	public AccPayables(Properties ctx, int s_accPayable_ID, String trxName) {
		super(ctx, s_accPayable_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public AccPayables(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
