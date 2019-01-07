package org.sacco.process;
import org.compiere.model.MonthlyLoansAdjustments;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;

public class SaveAdjustment extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		save();
		return null;
	}

	// save
	private void save() {
		MonthlyLoansAdjustments adjustments = new MonthlyLoansAdjustments(getCtx(), getRecord_ID(), get_TrxName());
		SLoan loan = new SLoan(getCtx(), adjustments.gets_loans_ID(), get_TrxName());

		adjustments.setIsComplete(true);

		adjustments.save();

		loan.setschedule_adjusted(true);
		loan.save();
		// double P = loan.getloanbalance().doubleValue();
		// double R = loan.getloaninterestrate().doubleValue();
		// double MI = adjustments.getnewamount().doubleValue();

		// int i = 0;
		// while (P > 0) {
		//
		// if (i == 0) {// the first adjustment is already created..
		//
		// } else {
		// MonthlyLoansAdjustments adj = new MonthlyLoansAdjustments(getCtx(),
		// 0, get_TrxName());
		// if (P > MI) {
		// adj.setnewamount(BigDecimal.valueOf(MI));
		// } else {
		// adj.setnewamount(BigDecimal.valueOf(P));
		// }
		// adj.setIsComplete(true);
		// adj.sets_loans_ID(adjustments.gets_loans_ID());
		//
		// // dates
		// LocalDate date =
		// adjustments.getloaneffectdate().toLocalDateTime().toLocalDate();
		// date = date.plusMonths(i);
		// LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		// // ls.setmonthperiod(lastDay.getMonthValue());
		// Timestamp timestamp = Timestamp.valueOf(lastDay.atStartOfDay());
		// adj.settransactiondate(timestamp);
		// adj.setloaneffectdate(timestamp);
		// //
		//
		// adj.save();
		// }
		// P = P - MI;
		// i++;
		// }

	}

}
