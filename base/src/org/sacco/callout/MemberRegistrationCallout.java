package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

public class MemberRegistrationCallout extends CalloutEngine {
	public String employer(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		mTab.setValue("mstartdate", null);
		mTab.setValue("menddate", null);
		mTab.setValue("s_station_ID", null);
		mTab.setValue("mpayroll", null);
		mTab.setValue("s_department_ID", null);
		mTab.setValue("mgross", null);
		mTab.setValue("mnett", null);

		return NO_ERROR;
	}
}
