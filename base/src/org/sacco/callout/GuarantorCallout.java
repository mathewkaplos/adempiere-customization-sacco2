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

public class GuarantorCallout extends CalloutEngine {
	public String amount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null) {
			return "";
		}
		BigDecimal oldVal = (BigDecimal) mField.getOldValue();

		BigDecimal newVal = (BigDecimal) value;

		BigDecimal amt = newVal.subtract(oldVal);

		int s_membershares_ID = (int) mTab.getValue("s_membershares_ID");
		MemberShares ms = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		BigDecimal freeShares = ms.getfreeshares();

		if (amt.compareTo(freeShares) == 1) {
			JOptionPane.showMessageDialog(null, "The free shares is insufficient: Must be less or equal to:"
					+ freeShares.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
			mTab.setValue("amountguaranteed", oldVal);
		} else {
			ms.setfreeshares(ms.getfreeshares().subtract(amt));
			ms.settiedshares(ms.gettiedshares().add(amt));

			ms.save();
		}

		return NO_ERROR;
	}
}
//mathew