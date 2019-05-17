package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

public class TransactionChargesSetupCallout extends CalloutEngine {
	public String appliesInLoans(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";

		boolean applies_in_saving = (boolean) mTab.getValue("applies_in_saving");
		boolean applies_in_loans = (boolean) mTab.getValue("applies_in_loans");

		if (applies_in_saving && applies_in_loans)
			mTab.setValue("useformula", false);

		// org.sacco.callout.TransactionChargesSetupCallout.appliesInLoans
		return NO_ERROR;
	}

	public String appliesInSavings(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		// org.sacco.callout.TransactionChargesSetupCallout.appliesInSavings
		boolean applies_in_saving = (boolean) mTab.getValue("applies_in_saving");
		boolean applies_in_loans = (boolean) mTab.getValue("applies_in_loans");

		if (applies_in_saving && applies_in_loans)
			mTab.setValue("useformula", false);

		return NO_ERROR;
	}

	public String useformula(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (boolean) value;
		// org.sacco.callout.TransactionChargesSetupCallout.useformula
		boolean applies_in_saving = (boolean) mTab.getValue("applies_in_saving");
		boolean applies_in_loans = (boolean) mTab.getValue("applies_in_loans");
		if (val)
			if (applies_in_saving && applies_in_loans)
				mTab.setValue("useformula", false);

		return NO_ERROR;
	}

}
