package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class LoanDisbursement extends X_s_loan_disbursement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoanDisbursement(Properties ctx, int s_loan_disbursement_ID, String trxName) {
		super(ctx, s_loan_disbursement_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public LoanDisbursement(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
