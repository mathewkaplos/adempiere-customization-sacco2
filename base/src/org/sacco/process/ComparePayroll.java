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

		// getList();//
		// getCSVList();//

		String sql = "select s_member_id,payroll_code,item,item_code,amount,list_amount,"
				+ "s_membershares_id , s_loans_id,trans_id from adempiere.comparepayroll(" + getRecord_ID() + ")";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				int s_member_id = rs.getInt(1);
				String payroll_code = rs.getString(2);
				String item = rs.getString(3);
				String item_code = rs.getString(4);
				BigDecimal amount = rs.getBigDecimal(5);
				BigDecimal list_amount = rs.getBigDecimal(6);
				int s_membershares_id = rs.getInt(7);
				int s_loans_id = rs.getInt(8);
				int s_transactions_id =rs.getInt(9);

				Payroll_compare_csv compare_csv = new Payroll_compare_csv(getCtx(), 0, get_TrxName());

				compare_csv.sets_payrol_interface_ID(payroll_Interface.get_ID());

				compare_csv.sets_member_ID(s_member_id);
				// compare_csv.setmember_no(member.getDocumentNo());
				compare_csv.setpayroll_no(payroll_code);
				compare_csv.setlist_amount(list_amount);
				compare_csv.setimport_amount(amount);
				compare_csv.setTransactionType(item);
				compare_csv.sets_loans_ID(s_loans_id);
				compare_csv.sets_membershares_ID(s_membershares_id);
				compare_csv.sets_transactions_ID(s_transactions_id);
				compare_csv.save();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		payroll_Interface.setcompared(true);
		payroll_Interface.save();
		return null;
	}

	private void deleteExisting() {
		String sql = "DELETE FROM adempiere.s_payroll_compare_csv WHERE s_payrol_interface_ID =" + getRecord_ID();
		DB.executeUpdate(sql, get_TrxName());
	}

}
