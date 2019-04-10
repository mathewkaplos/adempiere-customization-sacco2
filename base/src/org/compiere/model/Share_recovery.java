package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Share_recovery extends X_s_share_recovery {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5968135481163384883L;

	public Share_recovery(Properties ctx, int s_share_recovery_ID, String trxName) {
		super(ctx, s_share_recovery_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Share_recovery(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
