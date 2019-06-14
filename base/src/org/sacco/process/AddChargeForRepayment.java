package org.sacco.process;

import java.util.logging.Level;

import org.compiere.model.ChargeSetup;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.Repayment;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class AddChargeForRepayment extends SvrProcess {

	private int s_accountsetup_ID = 0;
	private String Description = "";
	private ChargeSetup chargeSetup = null;;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("s_accountsetup_ID"))
				s_accountsetup_ID = para[i].getParameterAsInt();
			else if (name.equals("Description"))
				Description = para[i].getParameterAsString();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		if (s_accountsetup_ID > 0) {
			chargeSetup = new ChargeSetup(getCtx(), s_accountsetup_ID, get_TrxName());
		}
	}

	@Override
	protected String doIt() throws Exception {
		add();
		return null;
	}

	private void add() {
		LoanRepaymentCharge charge = new LoanRepaymentCharge(getCtx(), 0, get_TrxName());
		charge.setAmount(chargeSetup.getAmount());
		charge.setl_repayments_ID(getRecord_ID());
		charge.sets_accountsetup_ID(s_accountsetup_ID);
		charge.setDescription(Description);
		charge.save();

		updatePaymentAmount();
	}

	private void updatePaymentAmount() {
		Repayment repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		repayment.setPaymentAmount(repayment.getPaymentAmount().add(chargeSetup.getAmount()));
		repayment.settotal_oc_due(repayment.gettotal_oc_due().add(chargeSetup.getAmount()));
		repayment.save();
	}
}
