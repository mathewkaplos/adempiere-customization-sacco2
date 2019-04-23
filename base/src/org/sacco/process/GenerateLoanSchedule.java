package org.sacco.process;

import org.compiere.model.LoanAppraisal;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.Schedule;

public class GenerateLoanSchedule extends SvrProcess {

	SLoan loan = null;

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		if (!loan.isseen_documents()) {
			javax.swing.JOptionPane.showMessageDialog(null,
					"Please confirm that you have seen and checked all supporting documents first..");
			return "";
		}
		Schedule schedule = new Schedule(loan, true);
		schedule.prepareSchedules();
		createAppraisalRecord();
		return null;
	}

	// 1. Guaranteers- fully guaranteed
	// 2. Guarantees -Check the minimum number
	// 3. Income factor
	// 4. Is within limit
	// 5. Membership period
	// 6. Share saving factor
	// 7. Retirement age

	private void createAppraisalRecord() {
		LoanAppraisal appraisal = null;
		String sql = "SELECT COUNT(s_loanappraisal_ID) FROM adempiere.s_loanappraisal WHERE s_loans_ID="
				+ getRecord_ID();
		int count = DB.getSQLValue(get_TrxName(), sql);
		if (count == 0) {
			appraisal = new LoanAppraisal(getCtx(), 0, get_TrxName());
			appraisal.sets_loans_ID(getRecord_ID());

			appraisal.sets_loans_ID(loan.get_ID());
			appraisal.sets_member_ID(loan.gets_member_ID());
			appraisal.setloan_no(loan.getDocumentNo());
			appraisal.setloancode(loan.gets_loantype().getloantypecode());
			appraisal.setloanstatus(loan.getloanstatus());
			appraisal.setmember_no(loan.gets_member().getDocumentNo());
			appraisal.setpayroll_no(loan.gets_member().getmpayroll());
			appraisal.setpaymethod(loan.gets_payment_mode().getName());
			appraisal.setloanamount(loan.getloanamount());
			appraisal.setloanappdate(loan.getloanappdate());

			appraisal.save();
		} else {
			String sql2 = "SELECT MAX(s_loanappraisal_ID) FROM adempiere.s_loanappraisal WHERE s_loans_ID="
					+ getRecord_ID();
			int s_loanappraisal_ID = DB.getSQLValue(get_TrxName(), sql2);
			appraisal = new LoanAppraisal(getCtx(), s_loanappraisal_ID, get_TrxName());
			appraisal.sets_loans_ID(getRecord_ID());

			appraisal.sets_loans_ID(loan.get_ID());
			appraisal.sets_member_ID(loan.gets_member_ID());
			appraisal.setloan_no(loan.getDocumentNo());
			appraisal.setloancode(loan.gets_loantype().getloantypecode());
			appraisal.setloanstatus(loan.getloanstatus());
			appraisal.setmember_no(loan.gets_member().getDocumentNo());
			appraisal.setpayroll_no(loan.gets_member().getmpayroll());
			appraisal.setpaymethod(loan.gets_payment_mode().getName());
			appraisal.setloanamount(loan.getloanamount());
			appraisal.setloanappdate(loan.getloanappdate());

			appraisal.save();
		}
		appraisal.refresh();

	}
}