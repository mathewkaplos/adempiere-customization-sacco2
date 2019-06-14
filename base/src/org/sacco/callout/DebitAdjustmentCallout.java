package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

public class DebitAdjustmentCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int val = (Integer) value;
		SLoan loan = new SLoan(Env.getCtx(), val, null);
		mTab.setValue("s_loantype_ID", loan.gets_loantype_ID());
		Sacco sacco = Sacco.getSaccco();
		int period_ID = sacco.getsaccoperiod_ID();
		mTab.setValue("C_Period_ID", period_ID);
		LoanSchedule ls = loan.getPeriodSchedule(period_ID);
		if (ls != null) {
			mTab.setValue("expectedamount", ls.getmonthlyrepayment());
			mTab.setValue("expectedinterest", ls.getinterestamount());

			mTab.setValue("newamount", ls.getmonthlyrepayment());
			mTab.setValue("newinterest", ls.getinterestamount());
		}
		String methodCode = loan.getInterestPayMethodCode();
		mTab.setValue("loantypeinteresttype", methodCode);
		if (!methodCode.equals("R")) {
			mTab.setValue("onemonthadjustment", true);
			mTab.setValue("recurring", false);
		} else {
			mTab.setValue("onemonthadjustment", false);
			mTab.setValue("recurring", true);
		}
		return NO_ERROR;
	}

	public String effectPeriod(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int C_Period_ID = (int) value;
		int loanID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		LoanSchedule ls = loan.getPeriodSchedule(C_Period_ID);
		if (ls != null) {
			mTab.setValue("expectedamount", ls.getmonthlyrepayment());
			mTab.setValue("expectedinterest", ls.getinterestamount());
			mTab.setValue("newamount", ls.getmonthlyrepayment());
			mTab.setValue("newinterest", ls.getinterestamount());
			mTab.setValue("loaneffectdate", ls.getloanpaydate());
		}

		return NO_ERROR;
	}

	public String onemonthadjustment(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		String methodCode = (String) mTab.getValue("loantypeinteresttype");
		if (value == null)
			return "";
		boolean val = (Boolean) value;

		if (val) {
			mTab.setValue("recurring", false);
		}

		else {
			mTab.setValue("recurring", true);
		}
		return NO_ERROR;
	}

	public String recurring(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		boolean val = (Boolean) value;

		if (val) {
			mTab.setValue("onemonthadjustment", false);
		}

		else {
			mTab.setValue("onemonthadjustment", true);
		}
		return NO_ERROR;
	}

	// org.sacco.callout.DebitAdjustmentCallout.newAmount
	public String newAmount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal val = (BigDecimal) value;
		int s_loans_ID = (Integer) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(Env.getCtx(), s_loans_ID, null);
		if (val.compareTo(loan.getloanbalance()) > 0) {
			mTab.setValue("newamount", null);
			JOptionPane.showMessageDialog(null,
					"Loan balance is: " + loan.getloanbalance().setScale(2, RoundingMode.UP));
		}
		return NO_ERROR;
	}
}
