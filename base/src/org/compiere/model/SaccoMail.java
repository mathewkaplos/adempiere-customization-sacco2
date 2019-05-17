package org.compiere.model;

import java.util.Properties;

import org.compiere.util.Env;

public class SaccoMail extends X_s_sacco_mail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaccoMail(Properties ctx, int s_sacco_mail_ID, String trxName) {
		super(ctx, s_sacco_mail_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public static SaccoMail get() {
		return new SaccoMail(Env.getCtx(), 1000000, null);
	}
}
