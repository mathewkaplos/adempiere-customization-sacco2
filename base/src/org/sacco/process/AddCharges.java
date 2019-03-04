package org.sacco.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.ChargeSetup;
import org.compiere.model.SLoan;
import org.compiere.model.Sloan_charges;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

public class AddCharges extends SvrProcess {

	private int s_accountsetup_ID = 0;
	private ChargeSetup chargeSetup = null;
	private BigDecimal amt = Env.ZERO;
	private String Description = "";

	private SLoan loan = null;

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
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());

	}

	@Override
	protected String doIt() throws Exception {
		if (chargeSetup != null) {
			amt = chargeSetup.getAmount();
		}
		add();
		return null;
	}

	private void add() {
		Sloan_charges charges = new Sloan_charges(getCtx(), 0, get_TrxName());
		charges.sets_loans_ID(getRecord_ID());
		charges.sets_accountsetup_ID(s_accountsetup_ID);
		charges.setDescription(Description);
		charges.setAmount(amt);
		charges.save();
	}
}
