package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Repayment extends X_l_repayments {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Repayment(Properties ctx, int l_repayments_ID, String trxName) {
		super(ctx, l_repayments_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Repayment(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
