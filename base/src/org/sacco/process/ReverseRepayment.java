package org.sacco.process;

import org.compiere.apps.ADialog;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;

public class ReverseRepayment extends SvrProcess {
	int AD_Table_ID = 1000020;
	Repayment repayment = null;
	SLoan loan = null;

	@Override
	protected void prepare() {
		repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		loan = new SLoan(getCtx(), repayment.gets_loans_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		Sacco.activateOrDeactiveTransactions(AD_Table_ID, repayment.get_ID(),false, get_TrxName());
		loan.setloanbalance(loan.getloanbalance().add(repayment.getPrincipal()));
		loan.setintbalance(loan.getintbalance().add(repayment.getInterest()));
		loan.save();

		repayment.setReversed(true);
		repayment.save();
		ADialog.info(2, null, "Reversed Successfully...");
		return null;
	}

}
