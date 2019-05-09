package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MUser;
import org.compiere.model.SLoan;
import org.compiere.model.SMember;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class LoanTrackingCallout extends CalloutEngine {

	public String approve(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (mTab.getValue("s_loans_ID") == null)
			return "";
		boolean val = (Boolean) value;
		if (val) {
			Timestamp now = DateUtil.newTimestamp();
			BigDecimal loanAmount = (BigDecimal) mTab.getValue("loanamount");
			BigDecimal loanBalance = (BigDecimal) mTab.getValue("loanbalance");

			mTab.setValue("approvedamount", loanAmount);
			mTab.setValue("approveddate", now);
		} else {
			mTab.setValue("approvedamount", null);
			mTab.setValue("approveddate", null);
		}
		return NO_ERROR;
	}

	public String reject(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (mTab.getValue("s_loans_ID") == null)
			return "";
		boolean val = (Boolean) value;
		if (val) {
			Timestamp now = DateUtil.newTimestamp();
			mTab.setValue("rejecteddate", now);
		} else {
			mTab.setValue("rejecteddate", null);
		}

		return NO_ERROR;
	}

	public String paymode(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Integer val = (Integer) value;
		if (val == 3) {
			mTab.setValue("cashamount", null);
		} else {

		}
		BigDecimal approvedamount = (BigDecimal) mTab.getValue("approvedamount");
		mTab.setValue("appliedamount", approvedamount);
		mTab.setValue("s_shamba_ID", null);
		mTab.setValue("s_shamba_plot_ID", null);
		mTab.setValue("s_membershares_ID", null);

		return NO_ERROR;
	}

	public String collectionDate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int loanID = (int) mTab.getValue("s_loans_ID");
		int userID = Env.getAD_User_ID(Env.getCtx());

		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		MUser user = new MUser(Env.getCtx(), userID, null);
		SMember member = new SMember(Env.getCtx(), loan.gets_member_ID(), null);
		String memberName = member.getmfirstname() + " " + member.getmothername() + " " + member.getmsurname();

		mTab.setValue("issuedby", user.getName());
		mTab.setValue("collectedby", memberName);

		return NO_ERROR;
	}

	// org.sacco.callout.LoanTrackingCallout.chequeCollector_changed
	public String chequeCollector_changed(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int loanID = (int) mTab.getValue("s_loans_ID");
		SLoan loan = new SLoan(Env.getCtx(), loanID, null);
		SMember member = new SMember(Env.getCtx(), loan.gets_member_ID(), null);
		String memberName = member.getmfirstname() + " " + member.getmothername() + " " + member.getmsurname();
		String val = (String) value;
		if (memberName.trim() != null && val.trim() != null) {
			if (!memberName.trim().equalsIgnoreCase(val.trim())) {
				mTab.setValue("cheque_collector_changed", true);
			}
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanTrackingCallout.disbursement_amount
	public String disbursement_amount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (mTab.getValue("s_loans_ID") == null)
			return "";
		BigDecimal pending_disbursement = (BigDecimal) mTab.getValue("pending_disbursement");
		BigDecimal disbursement_amount = (BigDecimal) value;
		if (pending_disbursement.compareTo(disbursement_amount) == 1) {

		} else {
			JOptionPane.showMessageDialog(null, "Disbursement cannot be more than Pendiing amount!");
			mTab.setValue("disbursed_amount", Env.ZERO);
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanTrackingCallout.plot_cost
	public String plot_cost(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (mTab.getValue("s_loans_ID") == null)
			return "";

		BigDecimal val = (BigDecimal) value;
		
		BigDecimal loanAmount = (BigDecimal) mTab.getValue("appliedamount");
		System.out.println(loanAmount);

		BigDecimal netGain = loanAmount.subtract(val);
		mTab.setValue("plot_gain", netGain);

		return NO_ERROR;
	}  
}   
