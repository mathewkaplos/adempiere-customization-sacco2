package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class LoanRepaymentCharge extends X_s_loan_repay_charges {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9191365297690131099L;

	public LoanRepaymentCharge(Properties ctx, int s_loan_repay_charges_ID, String trxName) {
		super(ctx, s_loan_repay_charges_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public LoanRepaymentCharge(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
