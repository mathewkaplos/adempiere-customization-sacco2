package org.sacco.process;

import java.awt.Container;

import org.compiere.apps.ADialog;
import org.compiere.model.I_s_loantype;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

public class SaveLoan extends SvrProcess {

	private SLoan loan = null;
	I_s_loantype type = null;

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		type = loan.gets_loantype();
	}

	@Override
	protected String doIt() throws Exception {
		saveIt();
		return null;
	}
	// 1. Guaranteers- fully guaranteed
	// 2. Guarantees -Check the minimum number
	// 3. Income factor
	// 4. Is within limit
	// 5. Membership period
	// 6. Share saving factor
	// 7. Retirement age

	int WindowNo = 2;
	Container c = null;
	boolean hasRights = true;

	private void saveIt() {
		if (type.isshould_be_guaranteed()) {
			if (!type.isallow_zero_value_guarantors()) {
				if (loan.getRemainingGuaranteedAmount().compareTo(Env.ZERO) == 1) {
					// loan not fully guaranteed
					if (!hasRights) {
						ADialog.error(WindowNo, c, "This loan is not fully guaranteed!", "You cannot proceed");
						return;
					}
					boolean val = ADialog.ask(WindowNo, c, "This loan is not fully guaranteed!",
							"Do you want to proceed with saving the loan?");
					if (!val) {
						return;
					}
				}
			}
			int minGuar = type.getloantypeminguarantors();
			if (minGuar > 0) { // has minimum guarantor
								// number
				int guarNo = loan.getGuarantorNumber();
				if (minGuar > guarNo) {
					// loan has no enough guarantors
					if (!hasRights) {
						ADialog.error(WindowNo, c, "This loan has no enough guarantors!", "You cannot proceed");
						return;
					}
					boolean val = ADialog.ask(WindowNo, c, "This loan has no enough guarantors!",
							"Do you want to proceed with saving the loan?");
					if (!val) {
						return;
					}
				}
			}

		}

		loan.setsaved(true);
		loan.save();
	}
}
