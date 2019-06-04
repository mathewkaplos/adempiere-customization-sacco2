package org.sacco.process;

import java.util.logging.Level;

import javax.swing.JOptionPane;

import org.compiere.model.ConversationHistory;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class LoanConversion extends SvrProcess {
	private int s_new_loantype_ID = 0;
	private int s_old_loantype_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("s_new_loantype_ID"))
				s_new_loantype_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		SLoanType loanType = SLoanType.getLoanType(getRecord_ID());
		s_old_loantype_ID = loanType.get_ID();
	}

	@Override
	protected String doIt() throws Exception {
		ConversationHistory history = new ConversationHistory(getCtx(), 0, get_TrxName());
		history.sets_new_loantype_ID(s_new_loantype_ID);
		history.sets_old_loantype_ID(s_old_loantype_ID);
		history.sets_loans_ID(getRecord_ID());
		history.save();

		SLoan loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		loan.sets_loantype_ID(s_new_loantype_ID);
		loan.save();
		JOptionPane.showMessageDialog(null, "Converted successfully. Please Re-generate the schedule");
		return "Converted successfully. Please Re-generate the schedule";
	}
}
