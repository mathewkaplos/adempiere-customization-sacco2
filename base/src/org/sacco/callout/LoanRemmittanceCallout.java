package org.sacco.callout;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.apps.ADialog;
import org.compiere.model.AD_User;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.I_s_loantype;
import org.compiere.model.MBank;
import org.compiere.model.MemberShares;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.model.ShareRemittance;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.Formula;
import org.sacco.loan.Penalty;

import zenith.util.DateUtil;
import zenith.util.Util;

public class LoanRemmittanceCallout extends CalloutEngine {
	public String newRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";

		int remmittanceTabID = 1000035;
		int refundTabID = 1000044;
		int val = (Integer) value;
		SLoan loan = new SLoan(Env.getCtx(), val, null);

		// period
		Sacco sacco = Sacco.getSaccco();
		int C_Period_ID = sacco.getsaccoperiod_ID();
		mTab.setValue("C_Period_ID", C_Period_ID);
		//
		AD_User user = new AD_User(ctx, Env.getAD_User_ID(ctx), null);
		int bankgl_Acct = user.getTellerGLCode();
		if (bankgl_Acct > 0) {
			mTab.setValue("bankgl_Acct", bankgl_Acct);
			mTab.getField("C_Bank_ID").setDisplayed(false);
		} //
		Timestamp PaymentDate = (Timestamp) mTab.getValue("PaymentDate");
		if (mTab.getAD_Tab_ID() == remmittanceTabID) {

			BigDecimal expectedPrincipal = Util.round(loan.getPeriodPrincipal(C_Period_ID, PaymentDate));
			BigDecimal expectedInterest = Util.round(loan.getPeriodInterest(C_Period_ID, PaymentDate));
			BigDecimal extraInterest = Util.round(loan.getPeriodExtraInterest(C_Period_ID));
			if (expectedPrincipal.compareTo(Env.ZERO) < 0) {
				expectedPrincipal = Env.ZERO;
			}

			BigDecimal penalty = Util.round(loan.getPenalty(PaymentDate));
			mTab.setValue("penalty_due", penalty);
			BigDecimal gross = expectedPrincipal.add(expectedInterest).add(penalty);
			if (extraInterest != null)
				gross = gross.add(extraInterest);

			mTab.setValue("PaymentAmount", gross);
			mTab.setValue("Principal", expectedPrincipal);
			mTab.setValue("expectedinterest", expectedInterest);
			mTab.setValue("gross_amount_due", gross);
			mTab.setValue("interest_due", loan.getintbalance());
			mTab.setValue("ExtraInterest", extraInterest);
			mTab.setValue("monthopeningbal", loan.getloanbalance());

			mTab.setValue("s_loantype_ID", loan.gets_loantype_ID());
			mTab.setValue("loan_gl_Acct", loan.getloan_gl_Acct());
			mTab.setValue("s_member_ID", loan.gets_member_ID());

			// interestgl_Acct
			I_s_loantype loanType = loan.getLoanType();
			mTab.setValue("interestgl_Acct", loanType.getloantypeinterestgl_Acct());
			mTab.setValue("is_repayment", true);
			// mTab.setValue("Comments", "Loan Repayment");
			//

		} else if (mTab.getAD_Tab_ID() == refundTabID) {
			updateRefundInstance(ctx, WindowNo, mTab, mField);

			mTab.setValue("LoanNo", loan.getDocumentNo());
			mTab.setValue("loanbalance", loan.getloanbalance());
			mTab.setValue("s_loantype_ID", loan.gets_loantype_ID());
			mTab.setValue("s_member_ID", loan.gets_member_ID());
			// refund_approvedby_ID
			mTab.setValue("refund_approvedby_ID", user.getAD_User_ID());
		}
		return NO_ERROR;
	}

	private void updateRefundInstance(Properties ctx, int WindowNo, GridTab mTab, GridField mField) {
		String l_repayments_ID_String = "";
		outerLoop: for (int i = 1; i <= 100; ++i) {
			for (int j = 1; j <= 100; ++j) {
				l_repayments_ID_String = Env.getContext(Env.getCtx(), i, j, "l_repayments_ID");
				if (l_repayments_ID_String != null && !l_repayments_ID_String.isEmpty()) {
					break outerLoop;
				}
			}
		}

		if (l_repayments_ID_String != null && !"".equals(l_repayments_ID_String)) {
			try {
				int l_repayments_ID = Integer.parseInt(l_repayments_ID_String);
				if (l_repayments_ID > 0) {
					// isRefund(ctx, WindowNo, mTab, mField, true);
					Repayment repayment = new Repayment(Env.getCtx(), l_repayments_ID, null);
					mTab.setValue("PaymentAmount", repayment.getPaymentAmount());
					mTab.setValue("Principal", repayment.getPrincipal());
					mTab.setValue("interest", repayment.getInterest());
					mTab.setValue("othercharges",
							repayment.gettotal_oc_due() != null ? repayment.gettotal_oc_due() : Env.ZERO);
					mTab.setValue("is_refund", true);
				}
			} catch (NumberFormatException e) {
				System.out.println("This is not a number: l_repayments_ID_String");
			}

		} else {
			// updateRefundInstance(mTab);
		}
	}

	//
	public String paymentAmount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		if (mTab.getAD_Tab_ID() == 1000044)
			return null;
		double gross = ((BigDecimal) value).doubleValue();
		double interest = ((BigDecimal) mTab.getValue("expectedinterest")).doubleValue();
		double otherCharges = 0;
		if (mTab.getValue("total_oc_due") != null)
			otherCharges = ((BigDecimal) mTab.getValue("total_oc_due")).doubleValue();
		double extraInterest = 0;
		if (mTab.getValue("ExtraInterest") != null) {
			extraInterest = ((BigDecimal) mTab.getValue("ExtraInterest")).doubleValue();
		}
		double penalty_due = 0;
		if (mTab.getValue("penalty_due") != null) {
			penalty_due = ((BigDecimal) mTab.getValue("penalty_due")).doubleValue();
		}
		// Gross = P+I
		// P=Gross- I
		double P = gross - (interest + extraInterest + otherCharges + penalty_due);
		if (P > 0) {
			BigDecimal loanbalance = (BigDecimal) mTab.getValue("monthopeningbal");
			if (P > loanbalance.doubleValue()) {
			
				JOptionPane.showMessageDialog(null,
						"The amount is in excess of " + (P - loanbalance.doubleValue()) + ". You cannot overpay!. The balance is:"+loanbalance.doubleValue());
				mTab.setValue("PaymentAmount", null);
				mTab.getField("PaymentAmount").isMandatory(true);
				return "";
			}

			mTab.setValue("Principal", BigDecimal.valueOf(P));
		} else {
			mTab.setValue("Principal", Env.ZERO);
		}

		return NO_ERROR;
	}

	//
	public String documentNo(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		String documentNo = (String) mTab.getValue("DocumentNo");
		mTab.setValue("ReceiptNo", documentNo);
		mTab.setValue("VoucherNo", documentNo);
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.isRefund
	public String isRefund(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		boolean val = (Boolean) value;

		if (val) {
			mTab.setValue("is_topup", false);
			// mTab.setValue("Comments", "Loan Refund");

			updateRefundInstance(ctx, WindowNo, mTab, mField);
		}

		else {
			mTab.setValue("is_topup", true);
			// mTab.setValue("Comments", "Loan Top-Up");
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.isTopUp
	public String isTopUp(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		System.out.println("...");
		boolean val = (Boolean) value;
		int s_loantype_ID = (int) mTab.getValue("s_loantype_ID");

		SLoanType type = new SLoanType(ctx, s_loantype_ID, null);
		if (!type.iscan_be_topped_up()) {
			mTab.setValue("is_topup", false);
			mTab.setValue("is_refund", true);
			JOptionPane.showMessageDialog(null, "This loan cannot be toped up!");
		}

		if (val) {
			mTab.setValue("is_refund", false);
			// mTab.setValue("Comments", "Loan To-Up");

			mTab.setValue("PaymentAmount", null);
			mTab.setValue("Principal", Env.ZERO);
			mTab.setValue("interest", Env.ZERO);
			mTab.setValue("othercharges", Env.ZERO);

			// mTab.getField("Principal").setDisplayed(false);
			// mTab.getField("interest").setDisplayed(false);
			// mTab.getField("othercharges").setDisplayed(false);

		}

		else {
			mTab.setValue("is_refund", true);

			// mTab.setValue("Comments", "Loan Refund");
		}
		return NO_ERROR;
	}

	// PaymentDate
	// org.sacco.callout.LoanRemmittanceCallout.PaymentDate
	public String PaymentDate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		Timestamp paymentDate = (Timestamp) value;

		boolean beforeOrToday = paymentDate.before(DateUtil.newTimestamp());
		if (!beforeOrToday) {
			// ADialog.error(WindowNo, null, "The payment date cannot be greater than
			// today!", "You cannot proceed");
			// return "";
		}

		int s_loantype_ID = (int) mTab.getValue("s_loantype_ID");
		SLoanType type = new SLoanType(ctx, s_loantype_ID, null);
		if (type.getmonthlyintcalc().equals("0")) {

			int s_loans_ID = (int) mTab.getValue("s_loans_ID");
			SLoan loan = new SLoan(ctx, s_loans_ID, null);
			long days = loan.getLastRepayPeriodInDays(paymentDate);
			double P = loan.getloanbalance().doubleValue();
			double R = loan.getloaninterestrate().doubleValue() * 12;
			double yearDays = 360;
			double T = days / yearDays;
			System.out.println(days);
			String method = type.getinterestformula();
			Formula formula = new Formula(P, R, T, method);
			BigDecimal interet = Util.round(formula.getInterest());
			BigDecimal Principal = (BigDecimal) mTab.getValue("Principal");
			// penalty
			BigDecimal penalty = Env.ZERO;
			if (type.isoverdue_penalty()) {
				Penalty pen = new Penalty(days, interet);
				penalty = Util.round(pen.getPenalty());
			}

			mTab.setValue("expectedinterest", interet);
			mTab.setValue("penalty_due", penalty);
			BigDecimal PaymentAmount = Principal.add(interet).add(penalty);
			mTab.setValue("PaymentAmount", PaymentAmount);
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.clear
	public String clear(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		boolean val = (boolean) value;

		if (val) {

			int s_loans_ID = (int) mTab.getValue("s_loans_ID");
			SLoan loan = new SLoan(ctx, s_loans_ID, null);
			BigDecimal loanBalance = loan.getloanbalance();//
			System.out.println(loanBalance);
			BigDecimal expectedinterest = (BigDecimal) mTab.getValue("expectedinterest");
			BigDecimal interest_due = (BigDecimal) mTab.getValue("interest_due");//
			BigDecimal ExtraInterest = interest_due.subtract(expectedinterest);
			BigDecimal penalty_due = (BigDecimal) mTab.getValue("penalty_due");//
			BigDecimal gross = loanBalance.add(interest_due).add(penalty_due);

			mTab.setValue("ExtraInterest", ExtraInterest);
			mTab.setValue("PaymentAmount", gross);

			mTab.setValue("Principal", loanBalance);

		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.extraInterest
	public String extraInterest(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		BigDecimal val = (BigDecimal) value;

		BigDecimal interest_due = (BigDecimal) mTab.getValue("interest_due");//
		BigDecimal expectedinterest = (BigDecimal) mTab.getValue("expectedinterest");

		BigDecimal maxExtraInterest = interest_due.subtract(expectedinterest);
		if (val.compareTo(maxExtraInterest) < 1) {
			BigDecimal diff = ((BigDecimal) mField.getOldValue()).subtract(val);
			BigDecimal PaymentAmount = (BigDecimal) mTab.getValue("PaymentAmount");
			BigDecimal Principal = (BigDecimal) mTab.getValue("Principal");
			mTab.setValue("PaymentAmount", PaymentAmount.subtract(diff));
			mTab.setValue("Principal", Principal);

		} else {
			JOptionPane.showMessageDialog(null, "Extra interest must not exceed " + maxExtraInterest);
			mTab.setValue("ExtraInterest", mField.getOldValue());
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.bank
	public String bank(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		AD_User user = new AD_User(ctx, Env.getAD_User_ID(ctx), null);
		int bankgl_Acct_teller = user.getTellerGLCode();
		if (bankgl_Acct_teller > 0) {
			return "";
		} //

		int val = (int) value;
		MBank bank = new MBank(ctx, val, null);
		int bankgl_Acct = bank.getGLAccount();
		if (bankgl_Acct > 0) {
			mTab.setValue("bankgl_Acct", bankgl_Acct);
		}
		// MPeriod
		return NO_ERROR;
	}

	// org.sacco.callout.LoanRemmittanceCallout.active
	// recover_from_share_transfer
	public String active(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		Object record = mTab.getValue("l_repayments_ID");
		if (record == null)
			return "";
		boolean val = (boolean) value;

		Timestamp time = (Timestamp) mTab.getValue("created");
		String created = time.toString();
		int s_member_ID = (int) mTab.getValue("s_member_ID");

		String sql = "SELECT COUNT(*) FROM adempiere.l_repayments WHERE s_member_ID =" + s_member_ID + " AND created >'"
				+ created + "'";
		int count = DB.getSQLValue(null, sql);
		if (count > 0) {
			JOptionPane.showMessageDialog(null,
					"You cannot reverse this transaction because it is not the last transaction of this account");
			mTab.setValue("isActive", !val);
			return "";
		}

		String msg = "";
		if (val) {
			msg = "activate ";
		} else {
			msg = "deactive ";
		}

		final int x = yesnocancel("Are you sure want to " + msg + "this transaction?");
		if (x == 0) {
			int l_repayments_ID = (int) mTab.getValue("l_repayments_ID");
			Repayment repayment = new Repayment(ctx, l_repayments_ID, null);
			if (repayment.getactivation_count() > 1) {
				JOptionPane.showMessageDialog(null, "You cannot " + msg
						+ "this transaction because you have reached the maximum number of reversals(2)");
				mTab.setValue("isActive", !val);
			} else {
				mTab.setValue("activation_count", repayment.getactivation_count() + 1);
				mTab.setValue("isActive", val);

				doIt(ctx, l_repayments_ID, val);

				SLoan loan = new SLoan(ctx, repayment.gets_loans_ID(), null);

				BigDecimal loanBalance = loan.getloanbalance();
				BigDecimal prev_bal = loan.getprev_balance();

				loan.setprev_balance(loanBalance);
				loan.setloanbalance(prev_bal);
				loan.save();
			}
			//
		} else {
			mTab.setValue("isActive", !val);
		}
		return NO_ERROR;
	}

	private void doIt(Properties ctx, int record_id, boolean val) {
		int AD_Table_ID = 1000015;
		Sacco.activateOrDeactiveTransactions(AD_Table_ID, record_id, val, null);

	}

	private static int yesnocancel(final String theMessage) {
		final int result = JOptionPane.showConfirmDialog(null, theMessage, "Alert", 1);
		return result;
	}

}
