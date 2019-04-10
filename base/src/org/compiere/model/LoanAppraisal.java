package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class LoanAppraisal extends X_s_loanappraisal {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7995393347229042546L;

	public LoanAppraisal(Properties ctx, int s_loanappraisal_ID, String trxName) {
		super(ctx, s_loanappraisal_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public LoanAppraisal(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
