package org.sacco.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

import zenith.util.Util;

public class LoanProductSetupCallout extends CalloutEngine {

	// org.sacco.callout.LoanProductSetupCallout.annualRate
	public String annualRate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal annualRate = (BigDecimal) value;
		double months = 12;
		double monthlyRate = annualRate.doubleValue() / months;

		BigDecimal decimal = BigDecimal.valueOf(monthlyRate);
		mTab.setValue("loantypeinterestrate", Util.round(decimal));
		return NO_ERROR;
	}

	// org.sacco.callout.LoanProductSetupCallout.monthlyRate
	public String monthlyRate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal monthlyRate = (BigDecimal) value;
		double months = 12;
		double AnnualRate = monthlyRate.doubleValue() * months;

		BigDecimal decimal = BigDecimal.valueOf(AnnualRate);
		mTab.setValue("annualinterest", Util.round(decimal));
		return NO_ERROR;
	}

	// org.sacco.callout.LoanProductSetupCallout.interestPayMethod
	public String interestPayMethod(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		String method = (String) value;
		if (!method.equals("R")) {
			if (mTab.getValue("monthlyintcalc") != null) {
				String mode = (String) mTab.getValue("monthlyintcalc");
				if (mode.equals("0")) {
					mTab.setValue("monthlyintcalc", "1");
				}
			}
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanProductSetupCallout.interestMode
	public String interestMode(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		String mode = (String) value;
		if (mode.equals("0")) {
			mTab.setValue("loantypeinteresttype", "R");
		}
		return NO_ERROR;
	}
}
