package org.sacco.process;

import java.util.logging.Level;

import org.compiere.model.BS_accounts;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class NewBalanceAccount extends SvrProcess {

	private int C_ElementValue_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_ElementValue_ID"))
				C_ElementValue_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
//org.sacco.process.NewBalanceAccount
	}

	@Override
	protected String doIt() throws Exception {
		BS_accounts accounts = new BS_accounts(getCtx(), 0, get_TrxName());
		accounts.sets_balancesheet_ID(getRecord_ID());
		accounts.setC_ElementValue_ID(C_ElementValue_ID);
		accounts.save();
		return null;
	}

}
