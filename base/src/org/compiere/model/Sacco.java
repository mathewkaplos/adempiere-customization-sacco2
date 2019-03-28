package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.codehaus.groovy.classgen.GeneratorContext;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.Schedule;

public class Sacco extends X_s_saccoinfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Sacco(Properties ctx, int s_saccoinfo_ID, String trxName) {
		super(ctx, s_saccoinfo_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public static Sacco getSaccco() {
		return new Sacco(Env.getCtx(), 1000000, null);
	}

	public static MPeriod getCurrentPeriod() {
		return MPeriod.get(Env.getCtx(), getSaccco().getsaccoperiod_ID());
	}

	public static TransactionSupervision getTransactionSupervision() {
		return new TransactionSupervision(Env.getCtx(), 1000000, null);
	}

	public void getLoanToBeDebitRaised() {
		SLoan[] loans = getAllLoans("WHERE loanbalance>0");
		for (int i = 0; i < loans.length; i++) {

		}
	}

	public SLoan[] getAllLoans(String whereClause) {
		List<SLoan> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_loans " + whereClause;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				SLoan loan = new SLoan(getCtx(), rs, get_TrxName());
				list.add(loan);
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
		return list.toArray(new SLoan[list.size()]);
	}


	public LoanSchedule[] getAllSchedules(String whereClause) {
		List<LoanSchedule> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_loanschedule " + whereClause;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanSchedule loanSchdule = new LoanSchedule(getCtx(), rs, get_TrxName());
				list.add(loanSchdule);
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
		return list.toArray(new LoanSchedule[list.size()]);
	}
}
