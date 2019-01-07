package org.sacco.process;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.ReducingBalance;
import org.sacco.loan.Schedule;

public class GenerateLoanSchedule extends SvrProcess {
	/**
	 * TODO s * Open repay amount
	 * 
	 */

	SLoan loan = null;
	SLoanType loanType = null;
	int periods = 0;
	LoanSchedule[] loanSchedules = null;
	String formula = "";
	String l_type = "";

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());

		int loanTypeID = loan.gets_loantype_ID();
		if (loanTypeID > 0) {
			loanType = new SLoanType(getCtx(), loanTypeID, get_TrxName());
		}
		periods = loan.getloanrepayperiod();

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

	@Override
	protected String doIt() throws Exception {

		// createScheduleReducingBalance();
		if (!loan.isseen_documents()) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"Please confirm that you have seen and checked all supporting documents first..");
			return "SCHEDULES NOT GENERATED.";
		}
		// start();
		Schedule schedule = new Schedule(getRecord_ID());
		schedule.prepareSchedules();
		Schedule interestPayMethod = new ReducingBalance(getRecord_ID());
		interestPayMethod.execute();
		return null;
	}

	void start() {
		deleteExistingSchedules();
		createSchedules();

		if (l_type.equalsIgnoreCase("R")) {
			firstAlgo(); // Reducing Balance
		} else if (l_type.equalsIgnoreCase("RC")) {
			secondAlgo();// Reducing Balance Constant
		} else if (l_type.equalsIgnoreCase("F")) {
			thirdAlgo(); // Fixed
		} else {
			thirdAlgo(); // Default for now .. TODO
		}

	}

	// Reducing balance
	void firstAlgo() {
		BigDecimal interest = Env.ZERO;
		BigDecimal total_interest = Env.ZERO;
		double P = loan.getappliedamount().doubleValue();
		double R = loan.getloaninterestrate().doubleValue();
		double T = periods;
		BigDecimal monthlyAmt = Env.ZERO;
		if (loan.isopen_repay_amount())
			monthlyAmt = loan.getconstantrepayamnt();
		else
			monthlyAmt = loan.getloanrepayamt();

		BigDecimal tempPaid = Env.ZERO;

		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];

			if (ls == null)
				continue;

			interest = getInterest(P, R, T);

			total_interest = total_interest.add(interest);

			ls.setamountdue(BigDecimal.valueOf(P));
			P = P - monthlyAmt.doubleValue();
			ls.setinterestamount(interest);
			System.out.println("iiiiiiiiiiiiiiiiii==" + i);
			ls.setinterestamount(interest);
			// ls.setprincipalrepayment(monthlyAmt);
			// ls.setmonthlyrepayment(monthlyAmt);
			// if (loanType != null) {
			// ls.setinteresttype(loanType.getloantypeinteresttype());
			// }
			ls.setexpinterest(interest);
			// ls.setExpPrincipal(monthlyAmt);
			ls.setoldinterest(interest);
			ls.setnewinterest(interest);
			ls.setmonthopeningbal(ls.getmonthlyrepayment().add(interest));
			ls.save();
			// paid amount

			tempPaid = tempPaid.add(ls.getmonthopeningbal());
			ls.setamountpaid(tempPaid);

			ls.save();
		}

		BigDecimal initialAmt = Env.ZERO;
		for (int i = 0; i < loanSchedules.length; i++) {

			LoanSchedule ls = loanSchedules[i];
			if (i == 0)
				initialAmt = ls.getamountdue().add(total_interest);
			if (ls == null)
				continue;
			// ls.setamountdue(initialAmt.subtract(ls.getmonthlyrepayment()));
			ls.setloanbalance(initialAmt.subtract(ls.getamountpaid()));
			ls.save();
		}

	}

	private BigDecimal getInterest(double P, double R, double T) {
		BigDecimal interest = Env.ZERO;
		// Interest Calculation formula
		/*
		 * PRT/100-------------------------------------------------------------1
		 * (P(T+1)R)/200-------------------------------------------------------2
		 * (P(T+R+2))/200------------------------------------------------------3
		 * P(1+T)R/100---------------------------------------------------------4
		 */
		if (formula.equals("1")) {
			interest = BigDecimal.valueOf(P * R * T / 1200);
		} else if (formula.equals("2")) {
			interest = BigDecimal.valueOf((P * (T + 1) * R) / 2400);
		} else if (formula.equals("3")) {
			interest = BigDecimal.valueOf((P * (T + R + 2)) / 2400);
		} else if (formula.equals("4")) {
			interest = BigDecimal.valueOf(P * (1 + T) * R / 1200);
		}

		return interest;
	}

	// Reducing balance constant
	void secondAlgo() {
		BigDecimal interest = Env.ZERO;
		BigDecimal total_interest = Env.ZERO;
		double P = loan.getappliedamount().doubleValue();
		double R = loan.getloaninterestrate().doubleValue();
		double T = periods;

		BigDecimal monthlyAmt = Env.ZERO;
		if (loan.isopen_repay_amount())
			monthlyAmt = loan.getconstantrepayamnt();
		else
			monthlyAmt = loan.getloanrepayamt();

		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];

			if (ls == null)
				continue;
			interest = getInterest(P, R, T);

			total_interest = total_interest.add(interest);

			ls.setamountdue(BigDecimal.valueOf(P));
			P = P - monthlyAmt.doubleValue();

			// ls.setprincipalrepayment(monthlyAmt);
			// ls.setmonthlyrepayment(monthlyAmt);
			// if (loanType != null) {
			// ls.setinteresttype(loanType.getloantypeinteresttype());
			// }

			// ls.setExpPrincipal(monthlyAmt);

			ls.save();
		}
		interest = total_interest.divide(BigDecimal.valueOf(periods), 2, RoundingMode.HALF_UP).setScale(0,
				RoundingMode.CEILING);
		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			ls.setoldinterest(interest);
			ls.setnewinterest(interest);
			ls.setexpinterest(interest);
			ls.setinterestamount(interest);
			ls.setinterestamount(interest);

			ls.setmonthopeningbal(ls.getmonthlyrepayment().add(interest));
			ls.save();
		}
	}

	// Fixed
	void thirdAlgo() {
		BigDecimal interest = Env.ZERO;
		BigDecimal total_interest = Env.ZERO;
		double P = loan.getappliedamount().doubleValue();
		double R = loan.getloaninterestrate().doubleValue();
		double T = periods;

		System.out.println(P);
		System.out.println(R);
		System.out.println(T);

		BigDecimal monthlyAmt = Env.ZERO;
		if (loan.isopen_repay_amount())
			monthlyAmt = loan.getconstantrepayamnt();
		else
			monthlyAmt = loan.getloanrepayamt();

		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			interest = getInterest(P, R, T);

			total_interest = total_interest.add(interest);

			ls.setamountdue(BigDecimal.valueOf(P));
			P = P - monthlyAmt.doubleValue();
			ls.setinterestamount(interest);

			ls.setinterestamount(interest);
			// ls.setprincipalrepayment(monthlyAmt);
			// ls.setmonthlyrepayment(monthlyAmt);
			// if (loanType != null) {
			// ls.setinteresttype(loanType.getloantypeinteresttype());
			// }
			ls.setexpinterest(interest);
			// ls.setExpPrincipal(monthlyAmt);
			ls.setoldinterest(interest);
			ls.setnewinterest(interest);
			ls.setmonthopeningbal(ls.getmonthlyrepayment().add(interest));

			ls.save();
		}
	}

	private void createSchedules() {

		BigDecimal monthlyAmt = Env.ZERO;
		BigDecimal totalAmount = loan.getloanrepayamt().multiply(BigDecimal.valueOf(periods));
		if (loan.isopen_repay_amount())
			monthlyAmt = loan.getconstantrepayamnt();
		else
			monthlyAmt = loan.getloanrepayamt();

		loanSchedules = new LoanSchedule[periods];
		for (int i = 0; i < periods; i++) {

			if (totalAmount.compareTo(Env.ZERO) < 1) {
				break;
			}
			if (i == periods - 1) {
				monthlyAmt = totalAmount;
			}
			if (totalAmount.compareTo(monthlyAmt) < 1) {
				monthlyAmt = totalAmount;
			}
			totalAmount = totalAmount.subtract(monthlyAmt);
			LoanSchedule ls = new LoanSchedule(Env.getCtx(), 0, get_TrxName());

			ls.sets_loans_ID(loan.gets_loans_ID());
			ls.setloanamount(loan.getappliedamount());
			ls.setrepayperiod(periods);
			ls.setrepayamount(monthlyAmt);
			ls.setmonthlyrepayment(monthlyAmt);
			ls.setinterestrate(loan.getloaninterestrate());

			ls.setloanappdate(loan.getloanappdate());
			ls.setloaneffectdate(loan.getloaneffectdate());

			ls.setprincipalrepayment(monthlyAmt);
			ls.setmonthlyrepayment(monthlyAmt);
			ls.setexpprincipal(monthlyAmt);
			ls.setintperiod(BigDecimal.valueOf(periods));

			ls.save();

			LocalDate date = ls.getloaneffectdate().toLocalDateTime().toLocalDate();
			date = date.plusMonths(i);
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
		DB.executeUpdate(sql, get_TrxName());
	}

}
