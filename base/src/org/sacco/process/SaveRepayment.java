package org.sacco.process;

import org.compiere.model.AccRecievables;
import org.compiere.model.Repayment;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.AmtInWords_EN;

import zenith.util.DateUtil;

public class SaveRepayment extends SvrProcess {
	private Repayment repayment = null;
	private SLoan loan = null;
	private Sacco sacco = null;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		//
		sacco = Sacco.getSaccco();
	}

	@Override
	protected String doIt() throws Exception {
		repayment = new Repayment(getCtx(), getRecord_ID(), get_TrxName());
		loan = new SLoan(getCtx(), repayment.gets_loans_ID(), get_TrxName());

		repayment.setReceiptNo(repayment.getDocumentNo());
		repayment.setVoucherNo(repayment.getDocumentNo());

		repayment.setIsComplete(true);
		repayment.save();
		/////////////////////////
		if (repayment.is_repayment())
			updateLoanRemmittance();
		else if (repayment.is_topup() || repayment.is_refund()){
			updateLoanRefund();
			repayment.setPaymentAmount(repayment.getPaymentAmount().negate());
			repayment.setInterest(repayment.getInterest().negate());
			repayment.setPrincipal(repayment.getPrincipal().negate());
			repayment.save();
		}
		
		return null;
	}

	private void updateLoanRefund() {
		loan.setloanbalance(loan.getloanbalance().add(repayment.getPaymentAmount()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().add(repayment.getPaymentAmount()));
		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		//repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();
		saveAccPayables();

	}

	private void saveAccPayables() {
		// TODO Auto-generated method stub

	}

	private void updateLoanRemmittance() {
		loan.setloanbalance(loan.getloanbalance().subtract(repayment.getPrincipal()));
		loan.setmonthopeningbal(loan.getmonthopeningbal().subtract(repayment.getPrincipal()));
		loan.setintbalance(loan.getintbalance().subtract(repayment.getexpectedinterest()));
		loan.setlast_pay_date(DateUtil.newTimestamp());

		loan.save();

		// interest balance
		repayment.setloan_interest_balance(loan.getintbalance());
		repayment.setmonthopeningbal(loan.getmonthopeningbal());
		repayment.setInterest(repayment.getexpectedinterest());
		repayment.save();
		saveAccRecievables();
	}

	private void saveAccRecievables() {
		AccRecievables accRecievables = new AccRecievables(getCtx(), 0, get_TrxName());
		accRecievables.setTransDate(DateUtil.newTimestamp());
		accRecievables.settransperiod(sacco.getsaccoperiod_ID());
		accRecievables.setCrAmount(repayment.getgross_amount_due());
		accRecievables.setTransAmount(repayment.getgross_amount_due());
		accRecievables.setappliedamount(repayment.getgross_amount_due());
		accRecievables.setComments(repayment.getComments());
		accRecievables.setbankgl_Acct(repayment.getbankgl_Acct());
		accRecievables.setCredit_Acct(repayment.getloan_gl_Acct());
		accRecievables.setDescription(getDescription());
		accRecievables.setLoanShare("Loan");
		accRecievables.sets_member_ID(loan.gets_member_ID());
		accRecievables.setpaymode(repayment.getpaymode());
		AmtInWords_EN aiw = new AmtInWords_EN();
		try {
			String AmountInWords = aiw.getAmtInWords(repayment.getgross_amount_due().toString());
			accRecievables.setAmountInWords(AmountInWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
		accRecievables.save();
	}

	private String getDescription() {
		SLoanType loanType = new SLoanType(getCtx(), loan.gets_loantype_ID(), get_TrxName());
		return loanType.getloantypecode() + " Loan Remmittance No: " + repayment.getDocumentNo();
	}
}
