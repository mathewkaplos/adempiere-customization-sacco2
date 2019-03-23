package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class AD_User extends X_AD_User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AD_User(Properties ctx, int AD_User_ID, String trxName) {
		super(ctx, AD_User_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public AD_User(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public boolean is_transaction_supervisor() {
		Object oo = get_Value("is_transaction_supervisor");
		if (oo != null) {
			if (oo instanceof Boolean)
				return ((Boolean) oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}
