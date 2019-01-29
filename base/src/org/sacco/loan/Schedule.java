package org.sacco.loan;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import org.compiere.model.LoanSchedule;
import org.compiere.model.MPeriod;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class Schedule {

	protected static BigDecimal interest = Env.ZERO;
	protected BigDecimal total_interest = Env.ZERO;
	protected static SLoan loan;
	protected static LoanSchedule[] loanSchedules;
	private static String formula = "";
	static int periods = 0;

	SLoanType loanType = null;
	String l_type = "";

	static double P = 0;
	static double R = 0;
	static double T = 0;

	BigDecimal monthlyAmt = Env.ZERO;

	public Schedule(int loanID) {
		loan = new SLoan(Env.getCtx(), loanID, get_TrxName());
		int loanTypeID = loan.gets_loantype_ID();
		if (loanTypeID > 0) {
			loanType = new SLoanType(Env.getCtx(), loanTypeID, get_TrxName());
		}
		periods = loan.getloanrepayperiod();
		if (loan.is_new())
			P = loan.getloanamount().doubleValue();
		else
			loan.getloanbalance().doubleValue();

		R = loan.getloaninterestrate().doubleValue();
		T = periods;

		// Interest Calculation formula
		/*
		 * PRT/100-------------------------------------------------------------1
		 * (P(T+1)R)/200-------------------------------------------------------2
		 * (P(T+R+2))/200------------------------------------------------------3
		 * P(1+T)R/100---------------------------------------------------------4
		 */

		formula = loanType.getinterestformula();

		// Interest Pay Method
		/*
		 * Reducing Balance----------------------------------------------------R
		 * Reducing Balance Constant-----------------------------------------RC
		 * Fixed---------------------------------------------------------------F
		 * Amortized ----------------------------------------------------------A
		 * Modified Amortized-----------------------------------------------MA
		 */
		l_type = loanType.getloantypeinteresttype();

	}

	public void prepareSchedules() {
		createSchedules();
	}

	private String get_TrxName() {
		return null;
	}

	protected BigDecimal getInterest(double P, double T) {
		BigDecimal interest = Env.ZERO;
		// Interest Calculation formula
		/*
		 * PRT/100-------------------------------------------------------------1
		 * (P(T+1)R)/200-------------------------------------------------------2
		 * (P(T+R+2))/200------------------------------------------------------3
		 * P(1+T)R/100---------------------------------------------------------4
		 */
		if (formula.equals("1")) {
			interest = BigDecimal.valueOf(P * R * T / 100);
		} else if (formula.equals("2")) {
			interest = BigDecimal.valueOf((P * (T + 1) * R) / 200);
		} else if (formula.equals("3")) {
			interest = BigDecimal.valueOf((P * (T + R + 2)) / 200);
		} else if (formula.equals("4")) {
			interest = BigDecimal.valueOf(P * (1 + T) * R / 100);
		}

		return interest;
	}

	private void createSchedules() {
		deleteExistingSchedules();
		BigDecimal monthlyAmt = Env.ZERO;
		BigDecimal totalAmount = Env.ZERO;
		if (loan.isnewloan()) {
			totalAmount = loan.getloanamount();
		} else {
			totalAmount = loan.getloanbalance();
			loan.setloanamount(loan.getloanbalance());
			loan.save();
		}

		if (loan.isopen_repay_amount())
			monthlyAmt = loan.getconstantrepayamnt();
		else
			monthlyAmt = loan.getloanrepayamt();

		loanSchedules = new LoanSchedule[periods];
		for (int i = 0; i < periods; i++) {
			if (totalAmount.compareTo(Env.ZERO) < 1) {
				break;
			}
			if (i == (periods - 1)) {
				monthlyAmt = totalAmount;
			}
			if (totalAmount.compareTo(monthlyAmt) < 1) {
				monthlyAmt = totalAmount;
			}

			LoanSchedule ls = new LoanSchedule(Env.getCtx(), 0, null);

			ls.sets_loans_ID(loan.gets_loans_ID());
			ls.setloanamount(loan.getloanamount());
			ls.setrepayperiod(i + 1);

			ls.setinterestrate(loan.getloaninterestrate());

			ls.setloanappdate(loan.getloanappdate());
			ls.setloaneffectdate(loan.getloaneffectdate());

			ls.setPrincipal(monthlyAmt);

			ls.setintperiod(BigDecimal.valueOf(periods));

			ls.setmonthopeningbal(totalAmount);
			ls.setexpprincipal(totalAmount.subtract(ls.getmonthlyrepayment()));

			ls.save();
			totalAmount = totalAmount.subtract(monthlyAmt);

			MPeriod period = new MPeriod(Env.getCtx(), loan.geteffect_period_ID(), null);
			LocalDate effectDate = period.getEndDate().toLocalDateTime().toLocalDate();
			effectDate = effectDate.plusMonths(i);
			Timestamp payDate = Timestamp.valueOf(effectDate.atStartOfDay());

			LocalDate periodPayDate = effectDate.minusDays(1);// for February
			Timestamp periodPayTimestamp = Timestamp.valueOf(periodPayDate.atStartOfDay());
			int C_Period_ID = MPeriod.getC_Period_ID(Env.getCtx(), periodPayTimestamp, 0);
			ls.setC_Period_ID(C_Period_ID);
			ls.setloanpaydate(payDate);
			ls.setmonthperiod(effectDate.getMonthValue());
			ls.save();

			loanSchedules[i] = ls;
		}
	}

	private void deleteExistingSchedules() {
		String sql = "DELETE FROM s_loanschedule WHERE s_loans_ID =" + loan.gets_loans_ID();
		DB.executeUpdate(sql, null);
	}

	public void execute() {
		// TODO Auto-generated method stub

	}
}
