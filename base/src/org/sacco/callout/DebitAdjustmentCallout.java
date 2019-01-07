package org.sacco.callout;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.LoanSchedule;
import org.compiere.model.MPeriod;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

public class DebitAdjustmentCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int val = (Integer) value;
		SLoan loan = new SLoan(Env.getCtx(), val, null);
		Sacco sacco = Sacco.getSaccco();
		int period_ID = sacco.getsaccoperiod_ID();
		MPeriod period = new MPeriod(Env.getCtx(), period_ID, null);
		LoanSchedule ls = loan.getPeriodSchedule(period.getPeriodNo());
		mTab.setValue("expectedamount", ls.getmonthlyrepayment());
		mTab.setValue("expectedinterest", ls.getinterestamount());

		mTab.setValue("newamount", ls.getmonthlyrepayment());
		mTab.setValue("newinterest", ls.getinterestamount());
		return NO_ERROR;
	}

	public String effectPeriod(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Timestamp val = (Timestamp) value;
		LocalDate date = val.toLocalDateTime().toLocalDate();

		int loanID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		LoanSchedule ls = loan.getPeriodSchedule(date.getMonthValue());
		mTab.setValue("expectedamount", ls.getmonthlyrepayment());
		mTab.setValue("expectedinterest", ls.getinterestamount());

		mTab.setValue("newamount", ls.getmonthlyrepayment());
		mTab.setValue("newinterest", ls.getinterestamount());
		return NO_ERROR;
	}

	public String onemonthadjustment(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
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
}
