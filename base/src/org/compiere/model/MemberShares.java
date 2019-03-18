package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MemberShares extends X_s_membershares {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1079762948247596210L;

	public MemberShares(Properties ctx, int s_membershares_ID, String trxName) {
		super(ctx, s_membershares_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MemberShares(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	

}
