package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.AD_User;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.SMember;
import org.compiere.util.Env;

public class ChangeRequest extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		AD_User user = new AD_User(ctx, Env.getAD_User_ID(ctx), null);
		int s_member_ID = user.getSMember_ID();
		if (s_member_ID > 0) {
			mTab.setValue("s_member_ID", s_member_ID);
			SMember member = new SMember(ctx, s_member_ID, null);
			mTab.setValue("mtel1", member.getmtel1());
			mTab.setValue("msurname", member.getmsurname());
			mTab.setValue("mothername", member.getmothername());
			mTab.setValue("mfirstname", member.getmfirstname());
			mTab.setValue("address", member.getaddress());

		} // org.sacco.callout.ChangeRequest.newRecord
		return NO_ERROR;
		 
	}
//
	public String selectEmployer(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (boolean) value;
		if (val)
			mTab.setValue("other_employer", false);
		else
			mTab.setValue("other_employer", true);
		return NO_ERROR;
	}// org.sacco.callout.ChangeRequest.selectEmployer

	// org.sacco.callout.ChangeRequest.otherEmployer
	public String otherEmployer(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (boolean) value;
		if (val)
			mTab.setValue("select_employer", false);
		else
			mTab.setValue("select_employer", true);
		return NO_ERROR;
	}

	// org.sacco.callout.ChangeRequest.select_next_of_kin
	public String select_next_of_kin(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (boolean) value;
		if (val)
			mTab.setValue("other_next_of_kin", false);
		else
			mTab.setValue("other_next_of_kin", true);
		return NO_ERROR;
	}

	// org.sacco.callout.ChangeRequest.other_next_of_kin
	public String other_next_of_kin(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (boolean) value;
		if (val)
			mTab.setValue("select_next_of_kin", false);
		else
			mTab.setValue("select_next_of_kin", true);
		return NO_ERROR;
	}
} 
