package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.LoanSchedule;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.model.ShambaPlot;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SavePaymentMode extends SvrProcess {

	private SLoan loan = null;

	// private String payMode = null;
	int s_disbursement_mode_ID = 0;
	private int C_Bank_ID = 0;
	MBank bank = null;
	// SLoanType loanType = null;

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

		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());

		s_disbursement_mode_ID = loan.gets_disbursement_mode_ID();
		bank = new MBank(getCtx(), C_Bank_ID, get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		// if (loan.getNumberOfRepayments() == 1) {
		loan.setmonthopeningbal(loan.getappliedamount());
		loan.setloanpaymode_done(true);
		loan.setintbalance(loan.getloaninterestamount());
		loan.setloanbalance(loan.getappliedamount());
		loan.save();
		// }
		if (loan.is_refinance()) {
			repayOldLoan();
		}
		if (s_disbursement_mode_ID == 8) {
			updateShambaPlot();
		} else if (s_disbursement_mode_ID == 9) {
			updateSavings();
		}
		if (s_disbursement_mode_ID == 2 || s_disbursement_mode_ID == 3) { // cheque
			loan.setwritingdate(DateUtil.newTimestamp());
			loan.save();
		}

		if (s_disbursement_mode_ID != 2) {
			PostLoanDisbursement postLoanDisbursement = new PostLoanDisbursement( bank, get_TrxName(),
					loan);
			postLoanDisbursement.post();
		}
		return null;
	}

	

	private void updateSavings() {
		int s_membershares_ID = loan.gets_membershares_ID();
		MemberShares memberShares = new MemberShares(getCtx(), s_membershares_ID, get_TrxName());
		memberShares.newRemmittance(loan.getappliedamount());
	}

	private void updateShambaPlot() {
		int s_shamba_plot_ID = loan.gets_shamba_plot_ID();
		ShambaPlot plot = new ShambaPlot(getCtx(), s_shamba_plot_ID, get_TrxName());
		plot.setStatus("0");
		plot.save();
	}

	private void repayOldLoan() {
		int oldLoan_ID = loan.gets_loans_refinance_ID();
		SLoan oldLoan = new SLoan(getCtx(), oldLoan_ID, get_TrxName());
		BigDecimal oldLoanBal = oldLoan.getloanbalance();
		BigDecimal approvedAmount = loan.getapprovedamount();
		BigDecimal appliedamount = approvedAmount.subtract(oldLoanBal);
		loan.setappliedamount(appliedamount);
		loan.save();
		loan.newRepayment(oldLoan);
	}
}
