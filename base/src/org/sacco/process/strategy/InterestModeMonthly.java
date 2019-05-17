package org.sacco.process.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.util.Env;

public class InterestModeMonthly implements InterestMode {

	@Override
	public List<LoanSchedule> createSchedules(SLoan loan) {
		List<LoanSchedule> loanSchedules = new ArrayList<>();

		SLoanType loanType = null;

		int loanTypeID = loan.gets_loantype_ID();
		if (loanTypeID > 0) {
			loanType = new SLoanType(Env.getCtx(), loanTypeID, null);
		}

		int periods = loan.getloanrepayperiod();

		for (int i = 0; i < periods; i++) {
			LoanSchedule ls = new LoanSchedule(Env.getCtx(), 0, null);
			ls.sets_loans_ID(loan.gets_loans_ID());
			ls.setloanamount(loan.getappliedamount());
			ls.setrepayperiod(periods);
			ls.setrepayamount(loan.getloanrepayamt());
			ls.setmonthlyrepayment(loan.getloanrepayamt());
			ls.setinterestrate(loan.getloaninterestrate());

			ls.setloanappdate(loan.getloanappdate());
			ls.setloaneffectdate(loan.getloaneffectdate());
			ls.setloanpaydate(null);
			// ls.setinterestamount(interest);
			ls.setprincipalrepayment(loan.getloanrepayamt());
			ls.setmonthlyrepayment(loan.getloanrepayamt());
			if (loanType != null) {
				ls.setinteresttype(loanType.getloantypeinteresttype());
			}
			ls.setintperiod(BigDecimal.valueOf(periods));
			ls.save();

			loanSchedules.add(ls);
		}

		return null;
	}

}
