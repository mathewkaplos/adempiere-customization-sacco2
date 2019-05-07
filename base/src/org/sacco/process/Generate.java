package org.sacco.process;

import org.compiere.apps.ADialog;
import org.compiere.model.SLoan;
import org.compiere.util.Env;
import org.sacco.loan.Schedule;

public class Generate {
	public static String generate(int s_loans_ID) {
		SLoan loan = new SLoan(Env.getCtx(), s_loans_ID, null);
		if (!loan.isseen_documents()) {
			ADialog.error(2, null, "Please confirm that you have seen and checked all supporting documents first..!",
					"You cannot proceed");
			return "error";
		}
		Schedule schedule = new Schedule(loan, true);
		schedule.prepareSchedules();
		CreateAppraisalRecord appraisalRecord = new CreateAppraisalRecord(loan, null, Env.getCtx());
		appraisalRecord.createAppraisalRecord();
		return null;
	}
}
