package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

public class ShareWithdrawalCallout extends CalloutEngine {

	// org.sacco.callout.ShareWithdrawalCallout.receiptamount
	public String receiptamount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal val = (BigDecimal) value;
		BigDecimal bal = (BigDecimal) mTab.getValue("ShareBalance");
		if (val.compareTo(bal) > 0) {
			mTab.setValue("receiptamount", null);
			JOptionPane.showMessageDialog(null, "Share balance is: " + bal.setScale(2, RoundingMode.UP));
		}
		return NO_ERROR;
	}

}