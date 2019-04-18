package org.sacco.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MWindow;

public class SaccoSetupCallout extends CalloutEngine {
	public String cashonly(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		
		if (value == null)
			return "";
		boolean val = (boolean) value;
		if (val) {
			MWindow window = new MWindow(ctx, 1000020, null);
			MWindow window2 = new MWindow(ctx, 1000016, null);

			window.setIsActive(false);
			window2.setIsActive(false);

			window.save();
			window2.save();
		} else {
			MWindow window = new MWindow(ctx, 1000020, null);
			MWindow window2 = new MWindow(ctx, 1000016, null);

			window.setIsActive(true);
			window2.setIsActive(true);

			window.save();
			window2.save();
		}

		return "";
	}
}
