package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.compiere.model.I_s_loans;
import org.compiere.model.MPeriod;
import org.compiere.model.MemberShares;
import org.compiere.model.Payroll_Interface;
import org.compiere.model.Period_remittance;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.STransactions;
import org.compiere.model.Sacco;
import org.compiere.model.ShareType;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class ListPayrollTransactions extends SvrProcess {

	Payroll_Interface payroll_Interface = null;
	MemberShares[] memberShares = null;
	Period_remittance[] period_remittances = null;
	// variables
	String TransactionType = null;
	int s_loantype_ID = 0;
	int s_sharetype_ID = 0;
	String repaymode = null;
	int s_employers_ID = 0;
	int s_station_ID = 0;
	int s_department_ID = 0;
	int s_member_ID = 0;
	String payroll_no = null;
	int C_Period_ID = 0;

	@Override
	protected void prepare() {
		init();
		deleteExisting();

	}

	@Override
	protected String doIt() throws Exception {
		if (TransactionType == null) {
			getShares();
			getLoans();
		} else if (TransactionType.equalsIgnoreCase("SHARES")) {
			getShares();
		} else if (TransactionType.equalsIgnoreCase("LOANS")) {
			getLoans();
		}

		setSerialNo();
		return null;
	}

	int x = 0;

	private void setSerialNo() {
		String sql = "SELECT * FROM s_transactions WHERE s_payrol_interface_ID=" + getRecord_ID()
				+ " ORDER BY s_member_ID";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				STransactions transactions = new STransactions(getCtx(), rs, get_TrxName());
				transactions.setSerialNo(++x);
				transactions.save();
			}

		} catch (Exception e) {

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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void init() {
		Payroll_Interface payroll_Interface = new Payroll_Interface(getCtx(), getRecord_ID(), get_TrxName());
		TransactionType = payroll_Interface.getTransactionType();
		s_loantype_ID = payroll_Interface.gets_loantype_ID();
		s_sharetype_ID = payroll_Interface.gets_sharetype_ID();
		repaymode = payroll_Interface.getrepaymode();
		s_employers_ID = payroll_Interface.gets_employers_ID();
		s_station_ID = payroll_Interface.gets_station_ID();
		s_department_ID = payroll_Interface.gets_department_ID();
		s_member_ID = payroll_Interface.gets_member_ID();
		payroll_no = payroll_Interface.getpayroll_no();
		C_Period_ID = payroll_Interface.getC_Period_ID();
		this.payroll_Interface = payroll_Interface;
	}

	private void deleteExisting() {
		String sql = "DELETE FROM s_transactions WHERE s_payrol_interface_ID=" + getRecord_ID();

		DB.executeUpdate(sql, get_TrxName());
	}

	private void getShares() {

		StringBuilder sb = new StringBuilder();
		String whereClause = "";
		sb.append("SELECT * FROM s_membershares ms WHERE ms.contributionrate>0 AND ms.paymode='SALARY DEDS'");
		if (s_sharetype_ID > 0)
			whereClause = " AND  ms.s_sharetype_ID =" + s_sharetype_ID;
		filter(sb, whereClause);

		List<MemberShares> list = new ArrayList<>();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sb.toString(), get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				MemberShares shares = new MemberShares(getCtx(), rs, get_TrxName());
				list.add(shares);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (stm != null)
					stm.close();
				if (rs != null)
					rs.close();
				stm = null;
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		memberShares = list.toArray(new MemberShares[list.size()]);

		for (int i = 0; i < memberShares.length; i++) {
			MemberShares share = memberShares[i];
			ShareType type = new ShareType(getCtx(), share.gets_sharetype_ID(), get_TrxName());
			STransactions transactions = new STransactions(getCtx(), 0, get_TrxName());
			transactions.sets_payrol_interface_ID(getRecord_ID());
			transactions.sets_member_ID(share.gets_member_ID());
			transactions.sets_sharetype_ID(share.gets_sharetype_ID());
			transactions.setshare_contribution(share.getcontributionrate());
			transactions.setsharegl_Acct(type.getsharegl_Acct());
			transactions.setbefore_trans_bal(share.getsharestodate());
			transactions.setafter_trans_bal(share.getsharestodate().add(share.getcontributionrate()));
			transactions.setReference(share.getDocumentNo());
			transactions.setTransactionType("SHARES");
			transactions.setshareloanid(share.get_ID());
			transactions.save();
		}
	}

	private void filter(StringBuilder sb, String whereClause) {
		if (repaymode != null) {
			whereClause = whereClause + " AND paymode = '" + repaymode + "'";
		}
		if (s_employers_ID > 0) {
			whereClause = whereClause
					+ " AND s_member_ID IN ( SELECT s_member_ID FROM adempiere.s_member  WHERE s_employers_ID = '"
					+ s_employers_ID + "') ";

		}
		if (s_station_ID > 0) {
			whereClause = whereClause
					+ " AND s_member_ID IN ( SELECT s_member_ID FROM adempiere.s_member  WHERE s_station_ID = '"
					+ s_station_ID + "') ";

		}
		if (s_department_ID > 0) {
			whereClause = whereClause
					+ " AND s_member_ID IN ( SELECT s_member_ID FROM adempiere.s_member  WHERE s_department_ID = '"
					+ s_department_ID + "') ";

		}
		if (s_member_ID > 0) {
			whereClause = whereClause + " AND s_member_ID= " + s_member_ID;

		}
		if (whereClause != null)
			sb.append(whereClause);
	}

	private void getLoans() {
		StringBuilder sb = new StringBuilder();
		String whereClause = "";
		sb.append(
				"SELECT * FROM s_period_remittance rem WHERE transactiontype='LOANS' AND is_payroll='Y' AND C_Period_ID="
						+ payroll_Interface.getC_Period_ID());
		if (s_loantype_ID > 0)
			whereClause = " AND  s_loantype_ID =" + s_loantype_ID;
		filter(sb, whereClause);
		System.out.println(sb.toString());
		List<Period_remittance> list = new ArrayList<>();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sb.toString(), get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Period_remittance period_remittance = new Period_remittance(getCtx(), rs, get_TrxName());
				list.add(period_remittance);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (stm != null)
					stm.close();
				if (rs != null)
					rs.close();
				stm = null;
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		period_remittances = list.toArray(new Period_remittance[list.size()]);

		for (int i = 0; i < period_remittances.length; i++) {

			Period_remittance period_remittance = period_remittances[i];
			STransactions transactions = new STransactions(getCtx(), 0, get_TrxName());
			transactions.sets_payrol_interface_ID(getRecord_ID());
			transactions.sets_member_ID(period_remittance.gets_member_ID());
			transactions.sets_loantype_ID(period_remittance.gets_loantype_ID());
			transactions.setAmount(period_remittance.getAmount());
			// transactions.setinterestamount(interestamount);
			// transactions.setgross(gross);
			// transactions.setothercharges(othercharges);
			I_s_loans loan = period_remittance.gets_loans();
			transactions.setloan_gl_Acct(loan.getloan_gl_Acct());
			transactions.setbefore_trans_bal(loan.getloanbalance());
			transactions.setafter_trans_bal(loan.getloanbalance().subtract(loan.getloanrepayamt()));
			transactions.setReference(loan.getDocumentNo());
			transactions.setTransactionType("LOANS");
			transactions.setshareloanid(period_remittance.gets_loans_ID());
			transactions.save();
		}
	}

}
