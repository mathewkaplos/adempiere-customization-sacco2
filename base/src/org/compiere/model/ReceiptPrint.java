package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ReceiptPrint extends X_s_receipt_print {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8948754761598773583L;

	public ReceiptPrint(Properties ctx, int s_receipt_print_ID, String trxName) {
		super(ctx, s_receipt_print_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ReceiptPrint(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
