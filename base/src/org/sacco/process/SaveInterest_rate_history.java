package org.sacco.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.Interest_rate_history;
import org.compiere.model.SLoanType;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SaveInterest_rate_history extends SvrProcess {
	BigDecimal newRate = Env.ZERO;
	
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("newRate"))
				newRate = (BigDecimal) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}

	@Override
	protected String doIt() throws Exception {
		SLoanType type = new SLoanType(getCtx(), getRecord_ID(), get_TrxName());
		
		Interest_rate_history history = new Interest_rate_history(getCtx(), 0, get_TrxName());
		history.sets_loantype_ID(getRecord_ID());
		history.setEffectDate(DateUtil.newTimestamp());
		
		history.setold_rate(type.getloantypeinterestrate());
		history.setnew_rate(newRate);
		history.save();

	
		BigDecimal loantypeinterestrate = newRate;
		BigDecimal annualinterest = newRate.multiply(BigDecimal.valueOf(12));
		type.setloantypeinterestrate(loantypeinterestrate);
		type.setannualinterest(annualinterest);
		type.save();
		return null;
	}

}
