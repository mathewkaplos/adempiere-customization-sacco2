package org.compiere.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.util.DB;
import mat.mathew.SendMailSSL;

public class SMember extends X_s_member {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SMember(Properties ctx, int s_member_ID, String trxName) {
		super(ctx, s_member_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public SMember(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean afterSave(boolean newRecord, boolean success) {
		if (newRecord) {
			String email = this.getEMail();
			if (email != null) {
				I_s_saccoinfo info = new X_s_saccoinfo(getCtx(), 1000000, get_TrxName());
				String saccoName = info.getsacconame();
				String subject = saccoName + " Registration";
				String message = "Dear " + this.getmfirstname() + ", \n\n" + " Thank you for registering at "
						+ info.getsacconame() + ".Welcome";
				SaccoMail sm = SaccoMail.get();

				SendMailSSL send = new SendMailSSL(sm.getsmtp_host(), sm.getsmtp_port(),
						sm.getsmtp_socketfactory_port(), sm.issmtp_auth(), sm.getEMail(), sm.getPassword(), email,
						subject, message);
				send.send();
			}
		}
		return super.afterSave(newRecord, success);
	}

	public int getExistingAccounts(int s_sharetype_ID) {
		String sql = "SELECT COUNT(s_membershares_ID) FROM adempiere.s_membershares WHERE s_sharetype_ID = "
				+ s_sharetype_ID + " AND s_member_ID=" + get_ID();
		int val = DB.getSQLValue(get_TrxName(), sql);
		return val;
	}

	public BigDecimal getSavingsBal() {
		String sql = "SELECT COALESCE(SUM(sharestodate),0) " + " FROM adempiere.s_membershares  WHERE s_member_ID ="
				+ get_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public BigDecimal getFreeSavingsBal() {
		String sql = "SELECT COALESCE(SUM(freeshares),0) " + " FROM adempiere.s_membershares  WHERE s_member_ID ="
				+ get_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public BigDecimal getFreeSavingsBalWhichCanGuaranteeLoan() {
		String sql = "SELECT COALESCE(SUM(s.freeshares),0) FROM adempiere.s_membershares s "
				+ " INNER JOIN adempiere.s_sharetype t ON t.s_sharetype_ID =s.s_sharetype_ID"
				+ "  WHERE t.canguaranteeloan='Y' AND s_member_ID =" + get_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public BigDecimal getTiedSavings() {
		String sql = "SELECT COALESCE(SUM(tiedshares),0) " + " FROM adempiere.s_membershares  WHERE s_member_ID ="
				+ get_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public MemberShares[] getSavings(String and_whereClause) {
		List<MemberShares> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_membershares  WHERE s_member_ID =" + get_ID() + " " + and_whereClause
				+ " ORDER BY s_membershares_ID";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				MemberShares shares = new MemberShares(getCtx(), rs, get_TrxName());
				list.add(shares);
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
		return list.toArray(new MemberShares[list.size()]);

	}

	public Repayment[] getLoanRemittance(String whereClause) {
		List<Repayment> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.l_repayments WHERE s_member_ID=" + gets_member_ID() + " " + whereClause;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				list.add(repayment);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.toArray(new Repayment[list.size()]);
	}

	public int numberOfContributions() {
		String sql = "SELECT COUNT(s_shareremittance_ID) FROM adempiere.s_shareremittance WHERE is_withdrawal='N' AND isComplete='Y' AND s_member_ID="
				+ gets_member_ID();
		return DB.getSQLValue(get_TrxName(), sql);
	}

	public BigDecimal getCurrentLoanceBalance() {
		String sql = "SELECT COALESCE(SUM(loanbalance),0) FROM adempiere.s_loans WHERE s_member_ID=" + gets_member_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}
}
