package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.SMember;
import org.compiere.util.Env;

public class ShadrackCallout extends CalloutEngine {

	// return String
	// parameters
	public String email(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		int key = (int) mTab.getValue("s_member_ID");
		SMember member = new SMember(Env.getCtx(), key, null);
		String fn = member.getmfirstname();
		String sn = member.getmsurname();
		String email = fn.trim() + "." + sn.trim() + "@gmail.com";
		mTab.setValue("EMail", email);
		return "";
	}
}
