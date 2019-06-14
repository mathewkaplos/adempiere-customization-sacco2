package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Change_request extends X_s_change_req {

	public Change_request(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Change_request(Properties ctx, int s_change_req_ID, String trxName) {
		super(ctx, s_change_req_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
