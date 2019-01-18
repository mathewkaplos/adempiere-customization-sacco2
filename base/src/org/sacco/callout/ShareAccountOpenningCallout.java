package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.SMember;
import org.compiere.model.ShareType;
import org.compiere.util.Env;

public class ShareAccountOpenningCallout extends CalloutEngine {

	// org.sacco.callout.ShareAccountOpenningCallout.member
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
		mTab.setValue("member_no", member_number);
		mTab.setValue("payroll_no", payroll_number);

		return NO_ERROR;
	}

	private SMember getMember(int id) {
		return new SMember(Env.getCtx(), id, null);
	}

	// org.sacco.callout.ShareAccountOpenningCallout.shareType
	public String shareType(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int s_sharetype_ID = (int) value;
		ShareType shareType = new ShareType(Env.getCtx(), s_sharetype_ID, null);
		String code = shareType.getsharecode();
		mTab.setValue("share_code", code);

		return NO_ERROR;
	}
}
