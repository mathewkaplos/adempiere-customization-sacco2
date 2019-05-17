package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class Payroll_Interface extends X_s_payrol_interface {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6723470464960430714L;

	public Payroll_Interface(Properties ctx, int s_payrol_interface_ID, String trxName) {
		super(ctx, s_payrol_interface_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public Payroll_Interface(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
