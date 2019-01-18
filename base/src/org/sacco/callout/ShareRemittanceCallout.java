package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
import org.compiere.model.SMember;
import org.compiere.model.ShareType;
import org.compiere.util.Env;

public class ShareRemittanceCallout extends CalloutEngine {

	// org.sacco.callout.ShareRemittanceCallout.member
	public String member(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		SMember member = null;
		String payroll_number = "";
		String member_number = "";

		// Get Member object
		Integer id = (Integer) value;
		if (id != null && id > 0)
			member = getMember(id);

		// // Initialize Variables
		if (member != null) {
			payroll_number = member.getmpayroll();
			member_number = member.getDocumentNo();

		}
		//
		// Set values to fields
		mTab.setValue("mcode", member_number);
		mTab.setValue("payroll_no", payroll_number);

		return NO_ERROR;
	}

	private SMember getMember(int id) {
		return new SMember(Env.getCtx(), id, null);
	}

	// org.sacco.callout.ShareRemittanceCallout.memberShare
	public String memberShare(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int s_membershares_ID = (int) value;
		MemberShares memberShares = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		int s_sharetype_ID = memberShares.gets_sharetype_ID();
		mTab.setValue("s_sharetype_ID", s_sharetype_ID);
		mTab.setValue("contributionrate", memberShares.getcontributionrate());
		mTab.setValue("ShareBalance", memberShares.getsharestodate());

		ShareType shareType = new ShareType(Env.getCtx(), s_sharetype_ID, null);
		mTab.setValue("sharegl_Acct", shareType.getsharegl_Acct());

		return NO_ERROR;
	}
}
