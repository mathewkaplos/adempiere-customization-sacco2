package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

public class ConsiderTiedShares extends CalloutEngine {
	public String considerTiedShares(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		// if (mTab.getValue("s_loantype_ID") == null)
		// return null;
		try {
			boolean val = (boolean) value;
			if (val) {
				mTab.setValue("allow_zero_value_guarantors", false);
			} else {
				mTab.setValue("allow_zero_value_guarantors", true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// org.sacco.callout.ConsiderTiedShares.considerTiedShares
		return NO_ERROR;
	}

	public String allowZeroValueGuarantors(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		// if (mTab.getValue("s_loantype_ID") == null)
		// return null;
		try {
			boolean val = (boolean) value;
			if (val) {
				mTab.setValue("considertiedshares", false);
			} else {
				mTab.setValue("considertiedshares", true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// org.sacco.callout.ConsiderTiedShares.allowZeroValueGuarantors
		return NO_ERROR;
	}

}
