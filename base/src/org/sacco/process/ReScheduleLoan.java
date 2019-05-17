package org.sacco.process;

import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.sacco.loan.Schedule;

public class ReScheduleLoan extends SvrProcess {

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
		Schedule schedule = new Schedule(loan, false);
		schedule.prepareSchedules();
		return null;
	}
}
