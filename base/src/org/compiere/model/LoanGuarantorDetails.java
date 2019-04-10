package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class LoanGuarantorDetails extends X_s_loanguantordetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9220223217293130597L;

	public LoanGuarantorDetails(Properties ctx, int s_loanguantordetails_ID, String trxName) {
		super(ctx, s_loanguantordetails_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public LoanGuarantorDetails(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
