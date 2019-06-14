package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class STransactions extends X_s_transactions {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2217198578291946943L;

	public STransactions(Properties ctx, int s_transactions_ID, String trxName) {
		super(ctx, s_transactions_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public STransactions(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}



}
