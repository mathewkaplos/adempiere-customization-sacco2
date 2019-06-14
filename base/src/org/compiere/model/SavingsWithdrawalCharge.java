package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class SavingsWithdrawalCharge extends X_s_saving_withdrawal_charges {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3773507379221017524L;

	public SavingsWithdrawalCharge(Properties ctx, int s_saving_withdrawal_charges_ID, String trxName) {
		super(ctx, s_saving_withdrawal_charges_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public SavingsWithdrawalCharge(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}


}
