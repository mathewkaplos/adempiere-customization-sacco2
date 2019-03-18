package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class SLoanGuantorDetails extends X_s_loanguantordetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9220223217293130597L;

	public SLoanGuantorDetails(Properties ctx, int s_loanguantordetails_ID, String trxName) {
		super(ctx, s_loanguantordetails_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public SLoanGuantorDetails(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
