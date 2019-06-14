package org.sacco.process;

import java.util.logging.Level;

import org.compiere.model.MBank;
import org.compiere.model.SLoan;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class SaveChequeWriting extends SvrProcess {

	private int C_Bank_ID = 0;
	MBank bank = null;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Bank_ID"))
				C_Bank_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		bank = new MBank(getCtx(), C_Bank_ID, get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loan.setloanbalance(loan.getchequeamount());
		loan.setmonthopeningbal(loan.getchequeamount());
		loan.setcheque_writing_done(true);
		loan.save();
		if (loan.gets_disbursement_mode_ID() == 2) {
			clearExistingPosting();
			PostLoanDisbursement postLoanDisbursement = new PostLoanDisbursement(bank, get_TrxName(), loan);
			postLoanDisbursement.post();
		}

		return null;
	}

	private void clearExistingPosting() {
	
		
	}

}
