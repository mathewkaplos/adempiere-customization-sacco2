package org.sacco.process;

import org.compiere.apps.ADialog;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;

public class ReverseLoanDisbursement extends SvrProcess {
	int AD_Table_ID = 1000050;

	@Override
	protected void prepare() {
	}
	
	@Override
	protected String doIt() throws Exception {
		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());

		LoanDisbursement[] disbursement = loan.getDisbursements();
		for (int i = 0; i < disbursement.length; i++) {
			reverse(disbursement[i].get_ID());
		}

		return null;
	}

	private void reverse(int recordID) {
		Sacco.deactivateTransactions(AD_Table_ID, recordID, get_TrxName());

		ADialog.info(2, null, "Reversed Successfully...");
	}

}
