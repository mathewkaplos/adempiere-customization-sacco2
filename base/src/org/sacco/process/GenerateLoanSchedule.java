package org.sacco.process;

import org.compiere.model.LoanAppraisal;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.Schedule;

public class GenerateLoanSchedule extends SvrProcess {

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
	SLoan	loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		if (!loan.isseen_documents()) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"Please confirm that you have seen and checked all supporting documents first..");
			return "" ;
		}
		Schedule schedule = new Schedule(loan, true);
		schedule.prepareSchedules();
		createAppraisalRecord();
		return null;
	}

	private void createAppraisalRecord() {
		String sql = "SELECT COUNT(s_loanappraisal_ID) FROM adempiere.s_loanappraisal WHERE s_loans_ID="
				+ getRecord_ID();
		int count = DB.getSQLValue(get_TrxName(), sql);
		if (count == 0) {
			LoanAppraisal appraisal = new LoanAppraisal(getCtx(), 0, get_TrxName());
			appraisal.sets_loans_ID(getRecord_ID());
			appraisal.save();
		}

	}
}