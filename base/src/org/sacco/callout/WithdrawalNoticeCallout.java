package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.I_s_sharetype;
import org.compiere.model.MemberShares;
import org.compiere.util.Env;
import org.joda.time.Days;

import zenith.util.DateUtil;

public class WithdrawalNoticeCallout extends CalloutEngine {
	// org.sacco.callout.WithdrawalNoticeCallout.membershares
	public String membershares(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int s_membershares_ID = (int) value;
		MemberShares memberShares = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		mTab.setValue("sharestodate", memberShares.getsharestodate());
		return NO_ERROR;
	}

	// org.sacco.callout.WithdrawalNoticeCallout.withdrawalDate
	public String withdrawalDate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Timestamp val = (Timestamp) value;
		int s_membershares_ID = (int) mTab.getValue("s_membershares_ID");
		MemberShares memberShares = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		I_s_sharetype sharetype = memberShares.gets_sharetype();
		int noticeDays = sharetype.getnoticedays();
		LocalDate from = DateUtil.newTimestamp().toLocalDateTime().toLocalDate();
		LocalDate to = val.toLocalDateTime().toLocalDate();
		long days = ChronoUnit.DAYS.between(from, to); // 6 days
		if (noticeDays > days) {
			ADialog.error(2, null, "Notice days must be equal or more than " + noticeDays + "!");
			mTab.setValue("WithdrawalDate", null);
		}

		return NO_ERROR;
	}
}
