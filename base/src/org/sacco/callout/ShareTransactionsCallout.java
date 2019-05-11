package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.AD_User;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.I_s_sharetype;
import org.compiere.model.MemberShares;
import org.compiere.model.SMember;
import org.compiere.model.Sacco;
import org.compiere.model.ShareRemittance;
import org.compiere.model.ShareType;
import org.compiere.model.TransactionSupervision;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class ShareTransactionsCallout extends CalloutEngine {

	// org.sacco.callout.ShareTransactionsCallout.member
	public String member(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		SMember member = null;
		String payroll_number = "";
		String member_number = "";

		// Get Member object
		Integer id = (Integer) value;
		if (id != null && id > 0)
			member = getMember(id);

		// // Initialize Variables
		if (member != null) {
			payroll_number = member.getmpayroll();
			member_number = member.getDocumentNo();

		}
		//
		// Set values to fields
		mTab.setValue("mcode", member_number);
		mTab.setValue("payroll_no", payroll_number);

		return NO_ERROR;
	}

	private SMember getMember(int id) {
		return new SMember(Env.getCtx(), id, null);
	}

	// org.sacco.callout.ShareTransactionsCallout.receiptamount
	public String receiptamount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int withdrawal_Tab_ID = 1000048;
		int deposit_Tab_ID = 1000047;
		BigDecimal val = (BigDecimal) value;
		int s_sharetype_ID = (int) mTab.getValue("s_sharetype_ID");
		ShareType shareType = new ShareType(Env.getCtx(), s_sharetype_ID, null);
		boolean isfixeddeposit = shareType.isfixeddeposit();
		if (withdrawal_Tab_ID == mTab.getAD_Tab_ID()) {

			BigDecimal bal = (BigDecimal) mTab.getValue("ShareBalance");
			if (val.compareTo(bal) > 0 && !isfixeddeposit) {
				mTab.setValue("receiptamount", null);
				JOptionPane.showMessageDialog(null, "Share free balance is: " + bal.setScale(2, RoundingMode.UP));
			}
		} else if (deposit_Tab_ID == mTab.getAD_Tab_ID()) {
			TransactionSupervision superVision = Sacco.getTransactionSupervision();
			if (superVision.isdeposit_supervised()) {
				AD_User user = new AD_User(ctx, Env.getAD_User_ID(ctx), null);
				if (!user.is_transaction_supervisor()) {
					BigDecimal maxAmount = superVision.getdeposit_amount();
					if (val.compareTo(maxAmount) > -1) {
						mTab.setValue("needs_supervision", true);
					} else {
						mTab.setValue("needs_supervision", false);
					}
				} else {
					mTab.setValue("needs_supervision", false);
				}
			}
		}
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTransactionsCallout.memberShare
	public String memberShare(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";

		int s_membershares_ID = (int) value;
		MemberShares memberShares = new MemberShares(Env.getCtx(), s_membershares_ID, null);
		int s_sharetype_ID = memberShares.gets_sharetype_ID();
		mTab.setValue("s_sharetype_ID", s_sharetype_ID);
		mTab.setValue("contributionrate", memberShares.getcontributionrate());
		mTab.setValue("ShareBalance", memberShares.getfreeshares());
		mTab.setValue("ShareTotal", memberShares.getsharestodate());

		ShareType shareType = new ShareType(Env.getCtx(), s_sharetype_ID, null);
		if (shareType.isfixeddeposit()) {
			mTab.setValue("isfixeddeposit", true);
			BigDecimal receiptamount = memberShares.getsharestodate();

			Timestamp depositDate = memberShares.getlast_deposit_date();
			Timestamp WithdrawalDate = (Timestamp) mTab.getValue("remittancedate");
			int months = (int) Sacco.calculateAgeInMonths(depositDate, WithdrawalDate);
			int freq = shareType.getintfrequency();
			int freqMonths = Sacco.getFrequencyMonths(months, freq);

			double rate = shareType.getintrate().doubleValue() / 100;
			double interest = rate * freqMonths * receiptamount.doubleValue();

			mTab.setValue("InterestAmt", BigDecimal.valueOf(interest));

			mTab.setValue("receiptamount", receiptamount.add(BigDecimal.valueOf(interest)));
		}
		// isfixeddeposit

		int share_saving_gl = 0;
		if (shareType.getshare_saving().equals("saving"))
			share_saving_gl = shareType.getsaving_gl_code_Acct();
		else
			share_saving_gl = shareType.getsharegl_Acct();
		mTab.setValue("sharegl_Acct", share_saving_gl);

		return NO_ERROR;
	}

	// is_supervised
	// org.sacco.callout.ShareTransactionsCallout.is_supervised
	public String is_supervised(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		if (mTab.getValue("s_shareremittance_ID") == null) {
			return "";
		}
		boolean val = (boolean) value;
		if (val) {
			int Supervisor_ID = Env.getAD_User_ID(ctx);
			mTab.setValue("Supervisor_ID", Supervisor_ID);
			mTab.setValue("supervision_time", DateUtil.newTimestamp());
			mTab.setValue("needs_supervision", false);
		} else {
			mTab.setValue("Supervisor_ID", null);
			mTab.setValue("supervision_time", null);
			mTab.setValue("needs_supervision", true);
		}

		return NO_ERROR;
	}

	// org.sacco.callout.ShareTransactionsCallout.applyShareTransfer
	public String applyShareTransfer(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (mTab.getValue("s_shareremittance_ID") == null)
			return "";
		Object recover_from_share_transfer = mTab.getValue("recover_from_share_transfer");
		if (recover_from_share_transfer == null)
			return "";
		if ((boolean) recover_from_share_transfer == true) {
			String sql = "SELECT COALESCE(SUM(amount),0) FROM adempiere.s_share_recovery WHERE s_shareremittance_ID ="
					+ (int) mTab.getValue("s_shareremittance_ID");
			BigDecimal totalAmount = DB.getSQLValueBD(null, sql);
			mTab.setValue("receiptamount", totalAmount);
		}
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTransactionsCallout.recover_from_share_transfer
	// recover_from_share_transfer
	public String recover_from_share_transfer(Properties ctx, int WindowNo, GridTab mTab, GridField mField,
			Object value) {
		if (mTab.getValue("s_shareremittance_ID") == null)
			return "";
		mTab.setValue("receiptamount", Env.ZERO);
		return NO_ERROR;
	}

	// org.sacco.callout.ShareTransactionsCallout.openingbal
	// recover_from_share_transfer
	public String openingbal(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		BigDecimal val = (BigDecimal) value;
		mTab.setValue("sharestodate", val);

		return NO_ERROR;
	}
}