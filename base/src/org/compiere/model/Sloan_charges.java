package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Sloan_charges extends X_s_loan_charges {
	/**
	 * 
	 */
	private static final long serialVersionUID = 686801267712313162L;

	public Sloan_charges(Properties ctx, int s_loan_charges_ID, String trxName) {
		super(ctx, s_loan_charges_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Sloan_charges(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
