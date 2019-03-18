package org.sacco.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.SMember;
import org.compiere.util.Env;

import zenith.util.Util;

public class LoanApplicationCallout extends CalloutEngine {

	public String loanType(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		// Declare Variables
		int repayPeriod = 0;
		BigDecimal minimumloan = Env.ZERO;
		BigDecimal maximumloan = Env.ZERO;
		SLoanType loanType = null;
		BigDecimal interestRate = Env.ZERO;
		int loanGLCode = 0;

		// Get Loan Type Object
		Integer loanTypeID = (Integer) mTab.getValue("s_loantype_ID");
		if (loanTypeID != null && loanTypeID > 0)
			loanType = getLoanType(loanTypeID);

		// Initialize the Variables
		if (loanType != null) {
			repayPeriod = loanType.getloantypemaxperiod();
			minimumloan = loanType.getloantypeminamount();
			maximumloan = loanType.getloantypemaxamount();
			interestRate = loanType.getloantypeinterestrate();
			loanGLCode = loanType.getloantypeloangl_Acct();
		}
		// Set Values to fields
		mTab.setValue("loanrepayperiod", repayPeriod);
		mTab.setValue("minimumloan", minimumloan);
		mTab.setValue("maximumloan", maximumloan);
		mTab.setValue("loaninterestrate", interestRate);
		mTab.setValue("loan_gl_Acct", loanGLCode);
		// loan_gl_Acct
		return NO_ERROR;
	}

	private SLoanType getLoanType(int id) {
		return new SLoanType(Env.getCtx(), id, null);
	}

	public String member(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		// org.sacco.callout.LoanApplicationCallout.member
		// Declare Variables
		SMember member = null;
		BigDecimal grossPay = Env.ZERO;
		BigDecimal nettPay = Env.ZERO;
		String payroll_number = "";
		String member_number = "";

		// Get Member object
		Integer id = (Integer) value;
		if (id != null && id > 0)
			member = getMember(id);

		// // Initialize Variables
		if (member != null) {
			grossPay = member.getmgross();
			nettPay = member.getmnett();
			payroll_number = member.getmpayroll();
			member_number = member.getDocumentNo();

		}
		//
		// Set values to fields
		mTab.setValue("loangrosspay", grossPay);
		mTab.setValue("loannettpay", nettPay);
		mTab.setValue("member_no", member_number);
		mTab.setValue("payroll_no", payroll_number);

		return NO_ERROR;
	}

	private SMember getMember(int id) {
		return new SMember(Env.getCtx(), id, null);
	}

	public String loanAmount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		// org.sacco.callout.LoanApplicationCallout.loanAmount
		Integer s_loans_ID = (Integer) mTab.getValue("s_loans_ID");
		BigDecimal amt = (BigDecimal) value;

		BigDecimal interestAmount = Env.ZERO;

		SLoan loan = new SLoan(Env.getCtx(), s_loans_ID, null);
		interestAmount = interestFormula1(loan, amt);

		mTab.setValue("loaninterestamount", interestAmount);

		int repayPeriod = loan.getloanrepayperiod();
		if (repayPeriod > 0) {
			double repay = amt.doubleValue() / repayPeriod;
			mTab.setValue("LoanRepayAmt", Util.round(BigDecimal.valueOf(repay)));
		}

		// mTab.dataRefresh();`
		// createSchedule(loan);
		return NO_ERROR;
	}

	BigDecimal interestFormula1(SLoan loan, BigDecimal amt) {

		BigDecimal value = Env.ZERO;
		double P = amt.doubleValue();
		double R = loan.getloaninterestrate().doubleValue();
		double T = (double) loan.getloanrepayperiod();

		double interest = (P * T * R) / 100;
		System.out.println(P);
		System.out.println(R);
		System.out.println(T);

		value = BigDecimal.valueOf(interest).setScale(2, RoundingMode.HALF_UP);

		return value;
	}

	void createSchedule(SLoan loan) {
		int periods = loan.getloanrepayperiod();
		BigDecimal outstandingLoan = loan.getappliedamount();
		for (int i = 0; i < periods; i++) {
			LoanSchedule ls = new LoanSchedule(Env.getCtx(), 0, null);
			ls.sets_loans_ID(loan.gets_loans_ID());
			ls.setloanamount(loan.getappliedamount());
			ls.setrepayperiod(periods);
			ls.setrepayamount(loan.getloanrepayamt());
			ls.setmonthlyrepayment(loan.getloanrepayamt());
			ls.setinterestrate(loan.getloaninterestrate());

			BigDecimal interest = outstandingLoan.multiply(loan.getloaninterestrate().divide(Env.ONEHUNDRED));
			ls.setamountdue(outstandingLoan.add(interest));

			outstandingLoan = outstandingLoan.subtract(loan.getloanrepayamt());

			ls.save();
		}
	}

	public String newLoan(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		// Declare Variables
		// org.sacco.callout.LoanApplicationCallout.newLoan
		boolean val = (Boolean) value;

		if (val) {
			mTab.setValue("ExistingLoan", false);
			mTab.setValue("loanBalance", Env.ZERO);
			mTab.setValue("IntBalance", Env.ZERO);
		}

		else {
			mTab.setValue("ExistingLoan", true);
			mTab.setValue("loanamount", Env.ZERO);
		}
		return NO_ERROR;
	}

	public String existingLoan(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		// Declare Variables
		// org.sacco.callout.LoanApplicationCallout.existingLoan
		boolean val = (Boolean) value;

		if (val)
			mTab.setValue("newLoan", false);
		else
			mTab.setValue("newLoan", true);

		return NO_ERROR;
	}

	// validate the effect date
	public String effectDate(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		// org.sacco.callout.LoanApplicationCallout.effectDate
		Long aDay = (long) (1 * 24 * 60 * 60 * 1000);
		Timestamp now = new Timestamp(System.currentTimeMillis() - aDay);
		Timestamp t = (Timestamp) value;
		if (t != null && t.compareTo(now) < 0) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"The effect date entered is invalid. Please enter a date greater than or equal to today.");
			mTab.setValue("loaneffectdate", null);
		}

		return NO_ERROR;
	}

	public String period(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";

		double loanAmount = ((BigDecimal) mTab.getValue("loanamount")).doubleValue();
		int periods = ((int) value);
		if (periods > 0) {
			double repayAmount = loanAmount / periods;
			mTab.setValue("loanrepayamt", Util.round(BigDecimal.valueOf(repayAmount)));
		}
		return NO_ERROR;
	}

	// org.sacco.callout.LoanApplicationCallout.oldLoan
	public String oldLoan(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		int s_loans_ID = (int) value;
		SLoan loan = new SLoan(ctx, s_loans_ID, null);
		BigDecimal loanBal = loan.getloanbalance();
		if (loanBal.compareTo(Env.ZERO) < 1) {
			JOptionPane.showMessageDialog(null, "This loan is fully settled!");
			mTab.setValue("s_loans_refinance_ID", null);
			// mTab.setValue(mField, null);
		}

		return NO_ERROR;
	}

	// org.sacco.callout.LoanApplicationCallout.is_refinance
	public String is_refinance(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (value == null)
			return "";
		mTab.setValue("s_loans_refinance_ID", null);
		return NO_ERROR;
	}
}
