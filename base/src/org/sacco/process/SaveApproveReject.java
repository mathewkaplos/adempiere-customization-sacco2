package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.LoanGuarantorDetails;
import org.compiere.model.LoanSchedule;
import org.compiere.model.MemberShares;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.ApplyLoanCharges;

public class SaveApproveReject extends SvrProcess {

	SLoan loan = null;

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		if (loan.isApproved()) {
			loan.setapproval_done(true);
			loan.setloanstatus("APPROVED");
			loan.save();
			if (loan.is_refinance()) {
				int oldLoan_ID = loan.gets_loans_refinance_ID();
				SLoan oldLoan = new SLoan(getCtx(), oldLoan_ID, get_TrxName());
				BigDecimal oldLoanBal = oldLoan.getloanbalance();
				BigDecimal approvedAmount = loan.getapprovedamount();
				BigDecimal appliedamount = approvedAmount.subtract(oldLoanBal);

				loan.setappliedamount(appliedamount);
				loan.save();
			} else if (loan.isrejected()) {
				updateGuarantorsOnRejection();
			}
			updateGuarantorsOnApproval();

			int firsScheduleID = loan.getFirstScheduleID();
			if (firsScheduleID > 0) {
				LoanSchedule ls = new LoanSchedule(getCtx(), firsScheduleID, get_TrxName());
				loan.setexpectedrepaydate(ls.getloanpaydate());
				loan.save();
			}
			// addCharges();
		}
		return null;
	}

	private void updateGuarantorsOnApproval() {
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails details = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				details.setloan_approved(true);
				details.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void updateGuarantorsOnRejection() {
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails details = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				details.settiedshares(Env.ZERO);
				details.setloan_rejected(true);
				details.save();

				MemberShares memberShares = new MemberShares(getCtx(), details.gets_membershares_ID(), get_TrxName());
				memberShares.setfreeshares(memberShares.getfreeshares().add(details.getamountguaranteed()));
				memberShares.settiedshares(memberShares.gettiedshares().subtract(details.getamountguaranteed()));
				memberShares.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
					stm = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void addCharges() {
		BigDecimal loanAmt = loan.getappliedamount();
		ApplyLoanCharges applyLoanCharges = new ApplyLoanCharges(loan, "loan_tracking", loanAmt);
		applyLoanCharges.generate();
	}

}
