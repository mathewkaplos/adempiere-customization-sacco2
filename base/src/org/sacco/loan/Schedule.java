package org.sacco.loan;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class Schedule {

	protected static BigDecimal interest = Env.ZERO;
	protected static BigDecimal total_interest = Env.ZERO;
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

	public void prepare(int loanID) {
		loan = new SLoan(Env.getCtx(), loanID, get_TrxName());
		int loanTypeID = loan.gets_loantype_ID();
		if (loanTypeID > 0) {
			loanType = new SLoanType(Env.getCtx(), loanTypeID, get_TrxName());
		}
		periods = loan.getloanrepayperiod();

		P = loan.getloanamount().doubleValue() + loan.getloanbalance().doubleValue();
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
		BigDecimal totalAmount = loan.getloanamount().add(loan.getloanbalance());
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
			ls.setloanamount(loan.getloanamount().add(loan.getloanbalance()));
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

			LocalDate date = ls.getloaneffectdate().toLocalDateTime().toLocalDate();
			date = date.plusMonths(i + 1);
			LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
			ls.setmonthperiod(lastDay.getMonthValue());
			Timestamp timestamp = Timestamp.valueOf(lastDay.atStartOfDay());
			ls.setloanpaydate(timestamp);
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
