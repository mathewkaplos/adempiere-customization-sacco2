package org.sacco.loan;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Period;

import org.compiere.model.LoanSchedule;
import org.compiere.model.MPeriod;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

import z.mathew.Finance;
import z.mathew.FinanceLib;
import zenith.util.DateUtil;
import zenith.util.Util;

public class Amortized extends Schedule implements InterestPayMethod {

	public Amortized(SLoan _loan) {
		super(_loan, isNewSchedule);
	}

	// Amortized
	public void execute() {

		BigDecimal tempPaid = Env.ZERO;

		Timestamp today = DateUtil.newTimestamp();
		Timestamp effectDate = loan.geteffect_period().getEndDate();
		Period period = Period.between(today.toLocalDateTime().toLocalDate(),
				effectDate.toLocalDateTime().toLocalDate());

		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			double annaulRate = R;
			double percent = 100;
			// double period = periods;
			double rPer = annaulRate / percent;

			double r = rPer;
			double p = P;
			double inter = Finance.ipmt(r, i + 1, loanSchedules.length, p);
			interest = BigDecimal.valueOf(Math.round(inter * 100D) / 100D);
			total_interest = total_interest.add(interest);

			double principal = Finance.ppmt(r, i + 1, loanSchedules.length, p, 0, 0);
			double pmt = Finance.pmt(r, loanSchedules.length, p);
			BigDecimal constantRepayment = BigDecimal.valueOf(Math.round(pmt * 100D) / 100D);

			ls.setmonthlyrepayment(Util.round(constantRepayment.negate()));

			double pv = FinanceLib.pv(r, loanSchedules.length - (i + 1), pmt, 0, false);
			BigDecimal balance = BigDecimal.valueOf(Math.round(pv * 100D) / 100D);

			ls.setloanbalance(Util.round(balance));
			BigDecimal principalRepayment = BigDecimal.valueOf(Math.round(principal * 100D) / 100D);
			ls.setprincipalrepayment(Util.round(principalRepayment.negate()));
			ls.setinterestamount(Util.round(interest.negate()));

			ls.save();
			// paid amount
			tempPaid = tempPaid.add(ls.getamountdue());
			ls.setamountpaid(Util.round(tempPaid));
			ls.setmonthopeningbal(Util.round(ls.getmonthlyrepayment().add(ls.getloanbalance())));

			ls.save();
			if (i == 0) {
				if (period.getMonths() > 0) {
					ls.setothercharges(ls.getinterestamount().multiply(BigDecimal.valueOf(period.getMonths())));
					ls.save();
				}
			}
			loan.setstatementbal(constantRepayment.multiply(BigDecimal.valueOf(loanSchedules.length)).abs());
			loan.setloaninterestamount(Util.round(total_interest.negate()));
			loan.save();
			createPeriodRemittance(ls);

		}
	}

	private void createPeriodRemittance(LoanSchedule ls) {
		Sacco.createReplaceRemittanceForLoan(loan, (MPeriod) ls.getC_Period(), ls.getPrincipal(),
				ls.getinterestamount(), ls.getmonthopeningbal(), ls.getothercharges());
	}
}
