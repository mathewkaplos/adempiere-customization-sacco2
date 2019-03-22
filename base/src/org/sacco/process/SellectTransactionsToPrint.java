package org.sacco.process;

import org.compiere.model.ReceiptPrint;
import org.compiere.model.ReceiptPrintLine;
import org.compiere.model.Repayment;
import org.compiere.model.SMember;
import org.compiere.process.SvrProcess;

public class SellectTransactionsToPrint extends SvrProcess {
	private ReceiptPrint print = null;
	private SMember member = null;

	@Override
	protected void prepare() {
		print = new ReceiptPrint(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		member = new SMember(getCtx(), print.gets_member_ID(), get_TrxName());
		saveLoanRemittance();
		return null;
	}

	private void saveLoanRemittance() {
		Repayment[] repayments = member.getLoanRemittance("AND isComplete='Y' AND is_repayment='Y'");
		for (int i = 0; i < repayments.length; i++) {
			Repayment repayment = repayments[i];
			ReceiptPrintLine line = new ReceiptPrintLine(getCtx(), 0, get_TrxName());
			line.settransactionid(repayment.get_ID());
			line.settransaction_type_remmittance("LR");
			line.sets_receipt_print_ID(print.gets_receipt_print_ID());
			line.save();
		}
	}

}
