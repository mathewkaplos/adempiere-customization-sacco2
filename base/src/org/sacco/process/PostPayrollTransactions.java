package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MemberShares;
import org.compiere.model.Payroll_Interface;
import org.compiere.model.SMember;
import org.compiere.model.STransactions;
import org.compiere.model.ShareRemittance;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

import zenith.util.DateUtil;

public class PostPayrollTransactions extends SvrProcess {

	Payroll_Interface payroll_Interface = null;

	STransactions[] shareTransactions = null;
	STransactions[] loanTransactions = null;
	private String ChequeNo = null;
	private int bankgl_Acct = 0;

	@Override
	protected void prepare() {

		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("ChequeNo"))
				ChequeNo = (String) para[i].getParameter();
			else if (name.equals("bankgl_Acct"))
				bankgl_Acct = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		payroll_Interface = new Payroll_Interface(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		updateShareRemittance();
		return null;
	}

	private void updateShareRemittance() {
		getShareTransactions();
		getLoanTransactions();
		post();
	}

	private void post() {
		for (int i = 0; i < shareTransactions.length; i++) {
			STransactions transactions = shareTransactions[i];
			ShareRemittance remittance = new ShareRemittance(getCtx(), 0, get_TrxName());
			SMember member = new SMember(getCtx(), transactions.gets_member_ID(), get_TrxName());

			remittance.sets_membershares_ID(transactions.getshareloanid());
			remittance.setreceiptamount(transactions.getAmount());
			remittance.sets_member_ID(transactions.gets_member_ID());
			remittance.setremittancedate(DateUtil.newTimestamp());
			remittance.setChequeNo(ChequeNo);
			remittance.setmcode(member.getDocumentNo());
			remittance.setpayroll_no(member.getmpayroll());
			remittance.setpaymode("Payroll Payment");
			remittance.setremittanceremarks("Payroll Payment");
			remittance.save();

			MemberShares memberShares = new MemberShares(getCtx(), remittance.gets_membershares_ID(), get_TrxName());
			memberShares.setsharestodate(memberShares.getsharestodate().add(remittance.getreceiptamount()));
			memberShares.save();
		}
	}

	private void getShareTransactions() {
		List<STransactions> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_transactions WHERE TransactionType='SHARES' AND s_payrol_interface_ID="
				+ getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				STransactions trans = new STransactions(getCtx(), rs, get_TrxName());
				list.add(trans);
			}
		} catch (Exception e) {

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
		shareTransactions = list.toArray(new STransactions[list.size()]);
	}

	private void getLoanTransactions() {
		List<STransactions> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_transactions WHERE TransactionType='LOANS' AND s_payrol_interface_ID="
				+ getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				STransactions trans = new STransactions(getCtx(), rs, get_TrxName());
				list.add(trans);
			}
		} catch (Exception e) {

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
		loanTransactions = list.toArray(new STransactions[list.size()]);
	}
}
