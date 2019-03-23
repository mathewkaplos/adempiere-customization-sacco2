package org.compiere.model;

import java.util.Properties;
import org.codehaus.groovy.classgen.GeneratorContext;
import org.compiere.util.Env;

public class Sacco extends X_s_saccoinfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Sacco(Properties ctx, int s_saccoinfo_ID, String trxName) {
		super(ctx, s_saccoinfo_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public static Sacco getSaccco() {
		return new Sacco(Env.getCtx(), 1000000, null);
	}

	public static MPeriod getCurrentPeriod() {
		return MPeriod.get(Env.getCtx(), getSaccco().getsaccoperiod_ID());
	}

	public static TransactionSupervision getTransactionSupervision() {
		return new TransactionSupervision(Env.getCtx(), 1000000, null);
	}
}
