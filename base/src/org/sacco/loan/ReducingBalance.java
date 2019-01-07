package org.sacco.loan;

import java.math.BigDecimal;
import org.compiere.model.LoanSchedule;
import org.compiere.util.Env;

public class ReducingBalance extends Schedule implements InterestPayMethod {

	public ReducingBalance(int loanID) {
		super(loanID);
		// TODO Auto-generated constructor stub
	}

	// Reducing balance
	public void execute() {

		BigDecimal tempPaid = Env.ZERO;
		System.out.println(loanSchedules);
		for (int i = 0; i < loanSchedules.length; i++) {
			LoanSchedule ls = loanSchedules[i];
			if (ls == null)
				continue;
			interest = getInterest(ls.getmonthopeningbal().doubleValue(), 1);
			total_interest = total_interest.add(interest);
			ls.setamountdue(ls.getmonthlyrepayment().add(interest));
			P = P - monthlyAmt.doubleValue();
			ls.setInterest(interest);
			ls.setrepayamount(ls.getmonthlyrepayment().add(interest));

			ls.save();
			// paid amount
			tempPaid = tempPaid.add(ls.getamountdue());
			ls.setamountpaid(tempPaid);

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
			ls.setloanbalance(ls.getnewinterest().add(ls.getexpprincipal()));
			ls.setopenning_loanbalance(ls.getmonthopeningbal().add(ls.getoldinterest()));

			ls.save();
		}
		loan.setloaninterestamount(total_interest);
		loan.setintbalance(total_interest);
		loan.save();
	}

	public BigDecimal getExpectedPrincipal() {
		double val = loan.getloanamount().doubleValue() / loan.getloanrepayperiod();
		return BigDecimal.valueOf(val);
	}

	public BigDecimal getExpectedInterest() {
		double Principal = loan.getmonthopeningbal().doubleValue();
		BigDecimal expInterest = getInterest(Principal, 1);
		return expInterest;
	}

}
