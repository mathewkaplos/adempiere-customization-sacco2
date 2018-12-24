package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;

public class SLoan extends X_s_loans {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SLoan(Properties ctx, int s_loans_ID, String trxName) {
		super(ctx, s_loans_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public SLoan(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}



}
