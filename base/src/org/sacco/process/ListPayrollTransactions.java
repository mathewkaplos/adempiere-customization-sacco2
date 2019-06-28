package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.compiere.model.MemberShares;
import org.compiere.model.Payroll_Interface;
import org.compiere.model.Period_remittance;
import org.compiere.model.STransactions;
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
	int x = 0;

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

	int i = 0;

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
				transactions.setSerialNo(++i);
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

		String sql = "SELECT s_member_id ,s_membershares_id,s_sharetype_id,amount,source"
				+ ", mpayroll,item,item_code FROM  adempiere.list_payroll_shares(" + getRecord_ID() + ")";

		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_member_id = rs.getInt(1);
				int s_membershares_id = rs.getInt(2);
				int s_sharetype_id = rs.getInt(3);
				BigDecimal amount = rs.getBigDecimal(4);
				int source = rs.getInt(5);
				String mpayroll = rs.getString(6);
				String item = rs.getString(7);
				String item_code = rs.getString(8);
				ShareType shareType = new ShareType(getCtx(), s_sharetype_id, get_TrxName());
				MemberShares memberShares = new MemberShares(getCtx(), s_membershares_id, get_TrxName());

				STransactions transactions = new STransactions(getCtx(), 0, get_TrxName());
				transactions.sets_payrol_interface_ID(getRecord_ID());
				transactions.sets_member_ID(s_member_id);
				transactions.sets_sharetype_ID(s_sharetype_id);
				transactions.setshare_contribution(amount);
				transactions.setsharegl_Acct(shareType.getsharegl_Acct());
				transactions.setbefore_trans_bal(memberShares.getsharestodate());
				transactions.setafter_trans_bal(memberShares.getsharestodate().add(amount));
				transactions.setReference(String.valueOf(s_membershares_id));
				transactions.setTransactionType("SHARES");
				transactions.setshareloanid(s_membershares_id);
				
				transactions.sets_membershares_ID(s_membershares_id);
				transactions.setmpayroll(mpayroll);
				transactions.setTransactionType(item);
				transactions.setItem_Code(item_code);
				
				transactions.save();
				
				System.out.println(x++);
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

	}

	private void getLoans() {
		String sql = "SELECT s_member_ID, s_loantype_ID, reference , principal ,interest ,penalty,balance,loan_id, "
				+ " mpayroll,item,item_code FROM adempiere.list_payroll_loans(" + getRecord_ID() + ")";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_member_ID = rs.getInt(1);
				int s_loantype_ID = rs.getInt(2);
				String reference = rs.getString(3);
				BigDecimal principal = rs.getBigDecimal(4);
				BigDecimal interest = rs.getBigDecimal(5);
				BigDecimal penalty = rs.getBigDecimal(6);
				BigDecimal balance = rs.getBigDecimal(7);
				int loan_id = rs.getInt(8);
				String mpayroll = rs.getString(9);
				String item = rs.getString(10);
				String item_code = rs.getString(11);

				STransactions transactions = new STransactions(getCtx(), 0, get_TrxName());
				transactions.sets_payrol_interface_ID(getRecord_ID());
				transactions.sets_member_ID(s_member_ID);
				transactions.sets_loantype_ID(s_loantype_ID);
				transactions.setAmount(principal);
				transactions.setinterestamount(interest);
				transactions.setgross((principal.add(interest).add(penalty)));
				transactions.setothercharges(penalty);
				transactions.setbefore_trans_bal(balance);
				transactions.setafter_trans_bal(balance.subtract(principal));
				transactions.setReference(reference);
				transactions.setTransactionType("LOANS");
				transactions.setshareloanid(loan_id);

				transactions.sets_loans_ID(loan_id);
				transactions.setmpayroll(mpayroll);
				transactions.setTransactionType(item);
				transactions.setItem_Code(item_code);

				transactions.save();

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

	}

}
