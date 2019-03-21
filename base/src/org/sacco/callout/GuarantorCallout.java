package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
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
		int s_loans_ID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(ctx, s_loans_ID, null);
		BigDecimal remainingGuaranteedAmount = loan.getRemainingGuaranteedAmount();

		SLoanType type = new SLoanType(ctx, loan.gets_loantype_ID(), null);
		boolean allowZeroGurantors = type.isallow_zero_value_guarantors();

		if (amt.compareTo(freeShares) == 1 && !allowZeroGurantors) {
			JOptionPane.showMessageDialog(null, "The free shares is insufficient: Must be less or equal to:"
					+ freeShares.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
			mTab.setValue("amountguaranteed", oldVal);
		} else {

			if (amt.compareTo(remainingGuaranteedAmount) > 0 && !allowZeroGurantors) {
				JOptionPane.showMessageDialog(null, "The guaranteed amount should not exceed the loan amount");
				mTab.setValue("amountguaranteed", remainingGuaranteedAmount);
				ms.setfreeshares(ms.getfreeshares().subtract(remainingGuaranteedAmount));
				ms.settiedshares(ms.gettiedshares().add(remainingGuaranteedAmount));
			} else {
				if (!allowZeroGurantors) {
					ms.setfreeshares(ms.getfreeshares().subtract(amt));
					ms.settiedshares(ms.gettiedshares().add(amt));
				}
			}
			ms.save();
		}
		return NO_ERROR;
	}
}
// mathew kipchumba