package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ChargeSetup extends X_s_accountsetup {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3549867153372005121L;

	public ChargeSetup(Properties ctx, int s_accountsetup_ID, String trxName) {
		super(ctx, s_accountsetup_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ChargeSetup(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
