package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ReceiptVoucher extends X_s_receipts {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReceiptVoucher(Properties ctx, int s_receipts_ID, String trxName) {
		super(ctx, s_receipts_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ReceiptVoucher(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
}
