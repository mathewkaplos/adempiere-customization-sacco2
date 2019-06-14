package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MemberShares;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.SMember;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

import zenith.util.Util;

public class GuarantorCallout extends CalloutEngine {
	public String amount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null) {
			return "";
		}

		BigDecimal oldVal = (BigDecimal) mField.getOldValue();

		BigDecimal newVal = (BigDecimal) value;

		BigDecimal amt = newVal.subtract(oldVal);

		// handle self guaranteeing
		int guarantorMember_ID = (int) mTab.getValue("s_member_ID");
		int s_loans_ID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(ctx, s_loans_ID, null);
		int loanMember_ID = loan.gets_member_ID();

		if (guarantorMember_ID == loanMember_ID) {// self guaranteeing
			BigDecimal selfGLimit = BigDecimal.valueOf(loan.gets_loantype().getselfglimit());
			if (selfGLimit.compareTo(Env.ZERO) > 0) {
				if (newVal.compareTo(selfGLimit) > 0) {
					ADialog.error(WindowNo, null, "You cannot exceed self guarantee limit.",
							"The limit for this loan type is:" + loan.gets_loantype().getselfglimit());
					mTab.setValue("amountguaranteed", oldVal);
					return "";
				}

			}
		}

		// check for

		// mTab.fireDataStatusEEvent("Already open access","message",true);
		// boolean a = ADialog.ask(WindowNo, null, "Are you sure");
		// System.out.println(a);
		int s_membershares_ID = (int) mTab.getValue("s_membershares_ID");
		MemberShares ms = new MemberShares(Env.getCtx(), s_membershares_ID, null);

		SMember donor = new SMember(ctx, guarantorMember_ID, null);
		BigDecimal donorFreeShares = donor.getFreeSavingsBalWhichCanGuaranteeLoan();
		BigDecimal minimumFreeShares = Sacco.getSaccco().getminfreeshares();
		BigDecimal diff = donorFreeShares.subtract(minimumFreeShares);

		BigDecimal freeShares = ms.getfreeshares();
		BigDecimal remainingGuaranteedAmount = loan.getRemainingGuaranteedAmount();

		SLoanType type = new SLoanType(ctx, loan.gets_loantype_ID(), null);
		boolean allowZeroGurantors = type.isallow_zero_value_guarantors();
		if (amt.compareTo(diff) == 1 && 1==2) {

			ADialog.error(WindowNo, null,
					"Minimum free shares is:"
							+ minimumFreeShares.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString(),
					"The member has :"
							+ donorFreeShares.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString()
							+ " free shares which can be used to guarantee.");
			mTab.setValue("amountguaranteed", oldVal);
		}
		if (amt.compareTo(freeShares) == 1 && !allowZeroGurantors) {
			ADialog.error(WindowNo, null, "The free shares is insufficient! ", "Must be less or equal to:"
					+ freeShares.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
			mTab.setValue("amountguaranteed", oldVal);
		}

		if (amt.compareTo(remainingGuaranteedAmount) > 0 && !allowZeroGurantors) {
			amt = remainingGuaranteedAmount.subtract(oldVal);
			ADialog.info(WindowNo, null, "The guaranteed amount should not exceed the loan amount",
					Util.round(remainingGuaranteedAmount) + "(remaining amount) will be applied.");
			mTab.setValue("amountguaranteed", remainingGuaranteedAmount);
			ms.setfreeshares(ms.getfreeshares().subtract(remainingGuaranteedAmount));
			ms.settiedshares(ms.gettiedshares().add(remainingGuaranteedAmount));
		} else {
			if (!allowZeroGurantors) {
				ms.setfreeshares(ms.getfreeshares().subtract(amt));
				ms.settiedshares(ms.gettiedshares().add(amt));
			}
		}
		BigDecimal guaranteeingAmt = (BigDecimal) mTab.getValue("amountguaranteed");
		double d = guaranteeingAmt.doubleValue() / loan.getloanamount().doubleValue();
		BigDecimal proportion = BigDecimal.valueOf(d);
		mTab.setValue("proportion", proportion);
		mTab.setValue("tiedshares", guaranteeingAmt);
		ms.save();
		return NO_ERROR;
	}
}
// mathew kipchumba