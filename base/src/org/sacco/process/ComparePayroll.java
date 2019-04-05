package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.compiere.model.Payroll_Interface;
import org.compiere.model.Payroll_compare_csv;
import org.compiere.model.Payroll_csv;
import org.compiere.model.SMember;
import org.compiere.model.STransactions;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class ComparePayroll extends SvrProcess {
	Payroll_Interface payroll_Interface = null;

	List<STransactions> transactions_list = null;

	List<Payroll_csv> csv_list = null;

	@Override
	protected void prepare() {
		payroll_Interface = new Payroll_Interface(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		deleteExisting();//

		getList();//

		getCSVList();//  

		for (Payroll_csv csv : csv_list) {
			// getTransactionByPayrollNoAndType(csv.getpayroll_no(),
			// csv.getTransactionType(), csv.getAmount());
		}
		payroll_Interface.setcompared(true);
		payroll_Interface.save();
		return null;
	}

	private void deleteExisting() {
		String sql = "DELETE FROM adempiere.s_payroll_compare_csv WHERE s_payrol_interface_ID =" + getRecord_ID();
		DB.executeUpdate(sql, get_TrxName());
	}

	private STransactions getTransactionByPayrollNoAndType(String payrollNo, String TransactionType,
			BigDecimal amount) {
		SMember member = getMember(payrollNo);
		STransactions oneTrans = null;
		try {
			oneTrans = transactions_list.stream().filter(x -> x != null)

					.filter(trans -> member.gets_member_ID() == trans.gets_member_ID())
					.filter(trans -> trans.getTransactionType().contains(TransactionType)).findAny().orElse(null);
		} catch (Exception e) {

		}
		if (oneTrans != null) {
			Payroll_compare_csv compare_csv = new Payroll_compare_csv(getCtx(), 0, get_TrxName());

			compare_csv.sets_payrol_interface_ID(payroll_Interface.get_ID());

			compare_csv.sets_member_ID(member.gets_member_ID());
			compare_csv.setmember_no(member.getDocumentNo());
			compare_csv.setpayroll_no(member.getmpayroll());
			compare_csv.setlist_amount(oneTrans.getAmount());
			compare_csv.setimport_amount(amount);
			compare_csv.setTransactionType(oneTrans.getTransactionType());
			compare_csv.save();

		}

		return oneTrans;
	}

	private SMember getMember(String payrollNo) {
		String sql = "SELECT * FROM adempiere.s_member WHERE mpayroll='" + payrollNo + "'";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				return new SMember(getCtx(), rs, get_TrxName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	private void getList() {
		List<STransactions> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_transactions WHERE s_payrol_interface_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				STransactions tran = new STransactions(getCtx(), rs, get_TrxName());
				list.add(tran);

			}

		} catch (Exception e) {

		} finally {
			try {
				stm.close();
				rs.close();
				stm = null;
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		transactions_list = list;
	}

	private void getCSVList() {
		List<Payroll_csv> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.z_payroll_csv WHERE s_payrol_interface_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Payroll_csv csv = new Payroll_csv(getCtx(), rs, get_TrxName());
				list.add(csv);
			}
		} catch (Exception e) {

		} finally {
			try {
				stm.close();
				rs.close();
				stm = null;
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		csv_list = list;
	}

}
