package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

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

}
