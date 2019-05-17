package org.sacco.process;

import java.util.Properties;

import org.compiere.model.LoanAppraisal;
import org.compiere.model.SLoan;
import org.compiere.util.DB;

public class CreateAppraisalRecord {
	SLoan loan = null;
	String trxName = null;
	Properties ctx = null;

	public CreateAppraisalRecord(SLoan _loan, String _trxName, Properties _ctx) {
		loan = _loan;
		trxName = _trxName;
		ctx = _ctx;
	}
	// 1. Guaranteers- fully guaranteed
	// 2. Guarantees -Check the minimum number
	// 3. Income factor
	// 4. Is within limit
	// 5. Membership period
	// 6. Share saving factor
	// 7. Retirement age

	public void createAppraisalRecord() {
		LoanAppraisal appraisal = null;
		String sql = "SELECT COUNT(s_loanappraisal_ID) FROM adempiere.s_loanappraisal WHERE s_loans_ID="
				+ loan.get_ID();
		int count = DB.getSQLValue(trxName, sql);
		if (count == 0) {
			appraisal = new LoanAppraisal(ctx, 0, trxName);
			appraisal.sets_loans_ID(loan.get_ID());

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
					+ loan.get_ID();
			int s_loanappraisal_ID = DB.getSQLValue(trxName, sql2);
			appraisal = new LoanAppraisal(ctx, s_loanappraisal_ID, trxName);
			appraisal.sets_loans_ID(loan.get_ID());

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