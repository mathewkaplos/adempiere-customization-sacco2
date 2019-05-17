package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class TransactionChargeSetup extends X_s_accountsetup {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4938679201182271619L;

	public TransactionChargeSetup(Properties ctx, int s_accountsetup_ID, String trxName) {
		super(ctx, s_accountsetup_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public TransactionChargeSetup(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
