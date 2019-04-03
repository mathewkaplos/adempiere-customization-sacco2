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

	/**
	 * Get Member.
	 * 
	 * @return s_member_ID
	 */
	public int getSMember_ID() {
		Integer ii = (Integer) get_Value("s_member_ID");
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/**
	 * Get teller bank account
	 * 
	 * @return
	 */
	public int getTellerGLCode() {
		Integer ii = (Integer) get_Value("bankgl_Acct");
		if (ii == null)
			return 0;
		return ii.intValue();
	}

}
