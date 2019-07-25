package org.sacco.callout;

import java.math.BigDecimal;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.AgmInvitation;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Sacco;

public class AGMCallout extends CalloutEngine {
	// org.sacco.callout.AGMCallout.newrecord
	public String newrecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object s_AgmValidation_ID = mTab.getValue("s_AgmValidation_ID");
		if (s_AgmValidation_ID == null)
			return "";
		int s_member_ID = (int) value;
		Sacco sacco = Sacco.getSaccco();

		boolean use_sum_of_saving = sacco.isusesum();
		BigDecimal agm_shares = sacco.getagmshares();
		int shareId = sacco.getagm_sharetype_ID();

		String whereClause = "";
		if (use_sum_of_saving) {
			whereClause = "";
		} else {
			whereClause = " AND s_sharetype_ID=" + shareId;
		}
		BigDecimal memberValidShares = sacco.getAGMShares(s_member_ID, whereClause);
		System.out.println(agm_shares);
		System.out.println(memberValidShares);

		return NO_ERROR;
	}

	// org.sacco.callout.AGMCallout.member
	public String member(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (1 == 1)
			return "";
		int s_AgmValidation_ID = (int) mTab.getValue("s_AgmValidation_ID");
		int s_member_ID = (int) value;
		Sacco sacco = Sacco.getSaccco();

		boolean use_sum_of_saving = sacco.isusesum();
		BigDecimal agm_shares = sacco.getagmshares();
		int shareId = sacco.getagm_sharetype_ID();

		String whereClause = "";
		if (use_sum_of_saving) {
			whereClause = "";
		} else {
			whereClause = " AND s_sharetype_ID=" + shareId;
		}
		BigDecimal memberValidShares = sacco.getAGMShares(s_member_ID, whereClause);
		mTab.setValue("Amt", agm_shares);
		mTab.setValue("validShares", memberValidShares);
		mTab.setValue("s_sharetype_ID", shareId);

		AgmInvitation invitation = sacco.AGMValidated(s_AgmValidation_ID, s_member_ID);
		if (invitation != null) {
			mTab.setValue("validated", true);
			mTab.setValue("Attendanceno", invitation.getDocumentNo());
			mTab.setValue("validated_on", invitation.getCreated());
			mTab.setValue("UserName", invitation.getUserName());
			mTab.setValue("s_AgmInvitation_ID", invitation.gets_AgmInvitation_ID());
			JOptionPane.showMessageDialog(null, "This Member is already registered for the AGM");
		} else {
			mTab.setValue("validated", false);
			mTab.setValue("Attendanceno", "");
			mTab.setValue("validated_on", null);
			mTab.setValue("UserName", "");
			mTab.setValue("s_AgmInvitation_ID", null);
		}
		return NO_ERROR;
	}
}
