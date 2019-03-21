package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ShareTranfer extends X_s_share_tranfer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1924189387086556939L;

	public ShareTranfer(Properties ctx, int s_share_tranfer_ID, String trxName) {
		super(ctx, s_share_tranfer_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ShareTranfer(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
