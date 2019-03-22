package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ReceiptPrintLine extends X_s_receipt_print_line {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1011796846403366030L;

	public ReceiptPrintLine(Properties ctx, int s_receipt_print_line_ID, String trxName) {
		super(ctx, s_receipt_print_line_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ReceiptPrintLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
