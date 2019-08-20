package org.sacco.process;

import java.util.logging.Level;

import org.compiere.model.BS_accounts;
import org.compiere.model.X_s_income_accounts;
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
		X_s_income_accounts accounts = new X_s_income_accounts(getCtx(), 0, get_TrxName());
		accounts.sets_income_ID(getRecord_ID());
		accounts.setC_ElementValue_ID(C_ElementValue_ID);
		accounts.save();
		return null;
	}

}
