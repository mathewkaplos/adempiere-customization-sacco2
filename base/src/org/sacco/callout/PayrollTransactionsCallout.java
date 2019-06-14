package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Sacco;

public class PayrollTransactionsCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int C_Period_ID = Sacco.getSaccco().getsaccoperiod_ID();
		mTab.setValue("C_Period_ID", C_Period_ID);
		return NO_ERROR;
	}
}
