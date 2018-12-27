package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.SLoan;
import org.compiere.util.Env;
import org.sacco.loan.ReducingBalance;

import zenith.util.DateUtil;

public class LoanRemmittanceCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int val = (Integer) value;
		SLoan loan = new SLoan(Env.getCtx(), val, null);
		ReducingBalance reducingBalance = new ReducingBalance(loan.get_ID());
		BigDecimal expectedPrincipal = reducingBalance.getExpectedPrincipal();
		BigDecimal expectedInterest = reducingBalance.getExpectedInterest();
		BigDecimal gross = expectedPrincipal.add(expectedInterest);
		mTab.setValue("PaymentAmount", gross);
		mTab.setValue("Principal", expectedPrincipal);
		mTab.setValue("expectedinterest", expectedInterest);
		mTab.setValue("gross_amount_due", gross);

		mTab.setValue("bankgl_Acct", loan.getbankgl_Acct());
		mTab.setValue("s_loantype_ID", loan.gets_loantype_ID());
		mTab.setValue("loan_gl_Acct", loan.getloan_gl_Acct());

		return NO_ERROR;
	}

	//
	public String paymentAmount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		double gross = ((BigDecimal) value).doubleValue();
		double interest = ((BigDecimal) mTab.getValue("expectedinterest")).doubleValue();
		// Gross = P+I
		// P=Gross- I
		double P = gross - interest;
		if (P > 0) {
			mTab.setValue("Principal", BigDecimal.valueOf(P));
		} else {
			mTab.setValue("Principal", Env.ZERO);
		}

		return NO_ERROR;
	}
	
	//
	public String documentNo(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		String documentNo = (String) mTab.getValue("DocumentNo");
		mTab.setValue("ReceiptNo", documentNo);
		mTab.setValue("VoucherNo", documentNo);
		return NO_ERROR;
	}
}
