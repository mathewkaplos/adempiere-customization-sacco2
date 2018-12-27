package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MUser;
import org.compiere.model.SLoan;
import org.compiere.model.SMember;
import org.compiere.util.Env;

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

	public String collectionDate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int loanID = (int) mTab.getValue("s_loans_ID");
		int userID = Env.getAD_User_ID(Env.getCtx());

		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		MUser user = new MUser(Env.getCtx(), userID, null);
		SMember member = new SMember(Env.getCtx(), loan.gets_member_ID(), null);
		String memberName = member.getmfirstname() + " " + member.getmothername() + " " + member.getmsurname();

		mTab.setValue("issuedby", user.getName());
		mTab.setValue("collectedby", memberName);

		return NO_ERROR;
	}

	// org.sacco.callout.LoanTrackingCallout.chequeCollector_changed
	public String chequeCollector_changed(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int loanID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		SMember member = new SMember(Env.getCtx(), loan.gets_member_ID(), null);
		String memberName = member.getmfirstname() + " " + member.getmothername() + " " + member.getmsurname();
		String val = (String) value;
		if (memberName.trim() != null && val.trim() != null) {
			if (!memberName.trim().equalsIgnoreCase(val.trim())) {
				mTab.setValue("cheque_collector_changed", true);
			}
		}
		return NO_ERROR;
	}
}
