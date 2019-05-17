package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
import org.compiere.util.Env;

public class ShareTranferCallout extends CalloutEngine {
	public String amount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal val = (BigDecimal) value;
		BigDecimal tranferable_amount = (BigDecimal) mTab.getValue("tranferable_amount");
		if (val.compareTo(tranferable_amount) > 0) {
			mTab.setValue("Amount", null);
			JOptionPane.showMessageDialog(null,
					"Transferable Amount is: " + tranferable_amount.setScale(2, RoundingMode.UP));
		}
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTranferCallout.transferorAccount
	public String transferorAccount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int tansferor_Account_ID = (int) value;
		MemberShares tranferor_Account = new MemberShares(Env.getCtx(), tansferor_Account_ID, null);
		BigDecimal tranferable_amount = tranferor_Account.getfreeshares();
		mTab.setValue("tranferable_amount", tranferable_amount);
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTranferCallout.sharetype
	public String sharetype(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		mTab.setValue("s_sharetype_receiver_ID", (int) value);
		return NO_ERROR;
	}
}
