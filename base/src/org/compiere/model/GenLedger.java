package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class GenLedger extends X_GenLedger {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7908099724525109023L;

	public GenLedger(Properties ctx, int GenLedger_ID, String trxName) {
		super(ctx, GenLedger_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public GenLedger(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
