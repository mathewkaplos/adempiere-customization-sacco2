package org.sacco.loan;

import java.math.BigDecimal;
import org.compiere.model.LoanSchedule;
import org.compiere.model.Sacco;
import org.compiere.util.Env;

import zenith.util.Util;

public class ReducingBalance extends Schedule implements InterestPayMethod {

	public ReducingBalance(int loanID) {
		super(loanID, newSchedule);
	}

	public void execute() {
		BigDecimal tempPaid = Env.ZERO;
		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			interest = Util.round(getInterest(ls.getmonthopeningbal().doubleValue(), 1));
			total_interest = Util.round(total_interest.add(interest));
			ls.setamountdue(ls.getmonthlyrepayment().add(interest));
			ls.setInterest(Util.round(interest));
			ls.setrepayamount(Util.round(ls.getmonthlyrepayment().add(interest)));

			ls.save();
			// paid amount
			tempPaid = tempPaid.add(ls.getamountdue());
			ls.setamountpaid(Util.round(tempPaid));

			ls.save();
		}

		// BigDecimal initialAmt = Env.ZERO;
		for (int i = 0; i < loanSchedules.length; i++) {

			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			if (i == 0) {
				ls.setoldinterest(total_interest);
				ls.setnewinterest(total_interest.subtract(ls.getinterestamount()));
			} else {
				ls.setoldinterest(loanSchedules[i - 1].getnewinterest());
				ls.setnewinterest(loanSchedules[i - 1].getnewinterest().subtract(ls.getinterestamount()));
			}
			ls.setsuminterest(total_interest);

			ls.save();

			// loan balance
			ls.setloanbalance(Util.round(ls.getnewinterest().add(ls.getexpprincipal())));
			ls.setopenning_loanbalance(Util.round(ls.getmonthopeningbal().add(ls.getoldinterest())));

			ls.save();

			createPeriodRemittance(ls);
		}
		loan.setloaninterestamount(total_interest);
		loan.setintbalance(total_interest);
		loan.setstatementbal(loan.getloanamount().add(total_interest));
		loan.save();
	}

	private void createPeriodRemittance(LoanSchedule ls) {
		Sacco.createReplaceRemittanceForLoan(loan, ls.getC_Period_ID(), ls.getPrincipal(),ls.getinterestamount());
	}

	public BigDecimal getExpectedInterest() {
		double Principal = loan.getmonthopeningbal().doubleValue();
		BigDecimal expInterest = getInterest(Principal, 1);
		return expInterest;
	}
}
