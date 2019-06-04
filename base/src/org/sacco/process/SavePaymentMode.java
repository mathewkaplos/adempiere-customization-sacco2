package org.sacco.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.MBank;
import org.compiere.model.MemberShares;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.model.ShambaPlot;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

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
		if (!loan.is_topup()) {
			loan.setmonthopeningbal(loan.getappliedamount());
			loan.setloanpaymode_done(true);
			loan.setintbalance(loan.getloaninterestamount());
			loan.setloanbalance(loan.getapprovedamount());
			loan.save();
		}
		// }
		
		if (s_disbursement_mode_ID == Sacco.disbursementmode_investment) {
			updateShambaPlot();
		} else if (s_disbursement_mode_ID == Sacco.disbursementmode_saving) {
			updateSavings();
		}
		if (s_disbursement_mode_ID == 2 || s_disbursement_mode_ID == 3) { // cheque
			loan.setwritingdate(DateUtil.newTimestamp());
			loan.save();
		}

		if (s_disbursement_mode_ID != 2) {
			PostLoanDisbursement postLoanDisbursement = new PostLoanDisbursement(bank, get_TrxName(), loan);
			postLoanDisbursement.post();
		}

		clearUsedCharges();
		return null;
	}

	private void clearUsedCharges() {
		String sql = "DELETE FROM adempiere.s_loan_charges WHERE s_loans_id=" + loan.get_ID();
		DB.executeUpdate(sql, get_TrxName());

	}

	private void updateSavings() {
		int s_membershares_ID = loan.gets_membershares_ID();
		MemberShares memberShares = new MemberShares(getCtx(), s_membershares_ID, get_TrxName());
		memberShares.newRemmittance(loan.getissued_amount());
	}

	private void updateShambaPlot() {
		int s_shamba_plot_ID = loan.gets_shamba_plot_ID();
		ShambaPlot plot = new ShambaPlot(getCtx(), s_shamba_plot_ID, get_TrxName());
		plot.setStatus("0");
		plot.save();
	}


}
