package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

import zenith.util.DateUtil;

public class LoanTrackingCallout extends CalloutEngine {

	public String approve(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		boolean val = (Boolean) value;
		if (val) {
			Timestamp now = DateUtil.newTimestamp();
			BigDecimal loanAmount = (BigDecimal) mTab.getValue("loanamount");
			BigDecimal loanBalance = (BigDecimal) mTab.getValue("loanbalance");

			mTab.setValue("approvedamount", loanAmount.add(loanBalance));
			mTab.setValue("approveddate", now);
		} else {
			mTab.setValue("approvedamount", null);
			mTab.setValue("approveddate", null);
		}
		return NO_ERROR;
	}

	public String reject(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		boolean val = (Boolean) value;
		if (val) {
			Timestamp now = DateUtil.newTimestamp();
			mTab.setValue("rejecteddate", now);
		} else {
			mTab.setValue("rejecteddate", null);
		}

		return NO_ERROR;
	}

	public String paymode(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		String val = (String) value;
		if (val.equals("3")) {
			mTab.setValue("cashamount", null);
		} else {

		}
		mTab.setValue("appliedamount", null);
		return NO_ERROR;
	}
}
