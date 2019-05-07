package org.sacco.process;

import java.awt.Container;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

import org.compiere.apps.ADialog;
import org.compiere.model.I_s_employers;
import org.compiere.model.I_s_loantype;
import org.compiere.model.I_s_member;
import org.compiere.model.SLoan;
import org.compiere.model.SMember;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

import z.mathew.Finance;
import zenith.util.DateUtil;
import zenith.util.Util;

public class SaveLoan extends SvrProcess {

	private SLoan loan = null;
	SMember member = null;
	I_s_loantype type = null;

	@Override
	protected void prepare() {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		type = loan.gets_loantype();
		member = new SMember(getCtx(), loan.gets_member_ID(), get_TrxName());
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
	// 7. Loan Factor -maximum number of loan balance

	int WindowNo = 2;
	Container c = null;
	boolean hasRights = true;

	private void saveIt() {
		// 1. Guaranteers- fully guaranteed
		if (type.isshould_be_guaranteed()) {
			if (!type.isallow_zero_value_guarantors()) {
				if (!loan.fullyGuaranteed()) {
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
			// 2. Guarantees -Check the minimum number
			int minGuar = type.getloantypeminguarantors();
			if (minGuar > 0) { // has minimum guarantor
								// number
				if (!loan.hasEnoughGuarantors()) {
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
		// 3. Income factor
		// check Income factor ---move to loan schedule
		if (!loan.incomeFactorOk()) {
			// loan income factor not okay
			if (!hasRights) {
				ADialog.error(WindowNo, c, "The loan income factor is not okay!", "You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c, "The loan income factor is not okay!",
					"Do you want to proceed with saving the loan?");
			if (!val) {
				return;
			}

		}
		// 4. Is within limit
		// check if loan Is within limit
		if (!loan.isWithinLimit()) {
			// loan is exceeding the limit
			if (!hasRights) {
				ADialog.error(WindowNo, c, "This loan exceeds the maximum set amount for the loan type!",
						"You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c, "This loan exceeds the maximum set amount for the loan type!",
					"Do you want to proceed with saving the loan?");
			if (!val) {
				return;
			}

		}
		// 5. Membership period
		// Membership period
		if (!loan.membershipPeriodOk()) {
			if (!hasRights) {
				ADialog.error(WindowNo, c,
						"This member cannot borrow this loan. Minimum no of contribtions(months) is not atained!",
						"You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c,
					"This member cannot borrow this loan. Minimum no of contribtions(months) is not atained!",
					"Do you want to proceed with saving the loan?");
			if (!val) {
				return;
			}

		}
		// 6. Share saving factor
		// Share saving factor
		if (!loan.shareSavingFactorOk()) {
			// saving factor not OK
			if (!hasRights) {
				ADialog.error(WindowNo, c, "This member savings factor for this loan is not attained!",
						"You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c, "This member savings factor for this loan is not attained!",
					"Do you want to proceed with saving the loan?");
			if (!val) {
				return;
			}

		}
		// 7. Retirement age
		// Check Retirement age
		if (!loan.retirementAgeOK()) {
			// age not OK
			if (!hasRights) {
				ADialog.error(WindowNo, c,
						"The member loan schedule goes beyond retirement age set at employer setup.You need to reduce the loan schedule!",
						"You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c,
					"The member loan schedule goes beyond retirement age set at employer setup.You need to reduce the loan schedule!",
					"Do you want to proceed with saving the loan,then you will make an arrangement for loan repayment beyond employment date?");
			if (!val) {
				return;
			}
		}
		if (!loan.loanFactorOK()) {
			// Loan factor not OK
			if (!hasRights) {
				ADialog.error(WindowNo, c, "This loans factor for this loan is not attained!", "You cannot proceed");
				return;
			}
			boolean val = ADialog.ask(WindowNo, c, "This loans  factor for this loan is not attained!",
					"Do you want to proceed with saving the loan?");
			if (!val) {
				return;
			}
		}
		// generate loan schedule
		String msg = Generate.generate(getRecord_ID());
		if (msg != null)
			return;

		loan.setsaved(true);
		loan.save();

	}
}
