package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
import org.compiere.model.SMember;
import org.compiere.model.ShareType;
import org.compiere.util.Env;

public class ShareTransactionsCallout extends CalloutEngine {

	// org.sacco.callout.ShareTransactionsCallout.member
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

	// org.sacco.callout.ShareTransactionsCallout.receiptamount
	public String receiptamount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int withdrawal_Tab_ID = 1000048;
		if (withdrawal_Tab_ID == mTab.getAD_Tab_ID()) {
			BigDecimal val = (BigDecimal) value;
			BigDecimal bal = (BigDecimal) mTab.getValue("ShareBalance");
			if (val.compareTo(bal) > 0) {
				mTab.setValue("receiptamount", null);
				JOptionPane.showMessageDialog(null, "Share free balance is: " + bal.setScale(2, RoundingMode.UP));
			}
		}
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTransactionsCallout.memberShare
	public String memberShare(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";

		int s_membershares_ID = (int) value;
		MemberShares memberShares = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		int s_sharetype_ID = memberShares.gets_sharetype_ID();
		mTab.setValue("s_sharetype_ID", s_sharetype_ID);
		mTab.setValue("contributionrate", memberShares.getcontributionrate());
		mTab.setValue("ShareBalance", memberShares.getfreeshares());

		ShareType shareType = new ShareType(Env.getCtx(), s_sharetype_ID, null);
		mTab.setValue("sharegl_Acct", shareType.getsharegl_Acct());

		return NO_ERROR;
	}
}