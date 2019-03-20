package org.sacco.callout;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
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
		int s_member_ID = (int) mTab.getValue("s_member_ID");
		SMember member = getMember(s_member_ID);

		MemberShares[] savings = member.getSavings(" AND s_sharetype_ID = " + s_sharetype_ID + "");
		int no = savings.length + 1;
		//
		Arrays.sort(savings, Comparator.comparing(MemberShares::get_ID));
		for (int i = 0; i < savings.length; i++) {
			int count = i + 1;
			MemberShares saving = savings[i];
			saving.setshare_code(code + count);
			saving.save();
		}
		updateCode(mTab, code + no);

		return NO_ERROR;
	}

	private void updateCode(GridTab mTab, String code) {
		mTab.setValue("share_code", code);
	}
}
