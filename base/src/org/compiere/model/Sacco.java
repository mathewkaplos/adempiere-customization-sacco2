package org.compiere.model;

import java.math.BigDecimal;
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


	/**
	 * Creating the anticipated period remittabce for loan
	 * 
	 * @param loan
	 * @param period
	 * @param Amount
	 * @param Interest
	 * @param gross
	 */
	public static void createReplaceRemittanceForLoan(SLoan loan, MPeriod period, BigDecimal Amount,
			BigDecimal Interest, BigDecimal balance,BigDecimal othercharges) {

		deletePeriodRemittanceForLoan(loan.get_ID(), period.getC_Period_ID());

		Period_remittance remittance = new Period_remittance(Env.getCtx(), 0, null);
		remittance.sets_member_ID(loan.gets_member_ID());
		remittance.sets_loans_ID(loan.gets_loans_ID());
		remittance.setC_Period_ID(period.getC_Period_ID());
		remittance.setStartDate(period.getStartDate());
		remittance.setAmount(Amount);
		remittance.setInterest(Interest);
		remittance.setgross(Amount.add(Interest));
		remittance.setarrears(Amount);
		remittance.setBalance(balance);
		remittance.setExtraInterest(othercharges);
		remittance.setTransactionType("LOANS");
		remittance.sets_loantype_ID(loan.gets_loantype_ID());
		remittance.setis_payroll(loan.getrepaymode().equalsIgnoreCase("SALARY DEDS"));
		remittance.save();
	}

	public static void updatePeriodRemittance(SLoan loan, MPeriod period, BigDecimal diff) {
		Period_remittance remittance = getPeriodRemimittance(loan, period.get_ID());
		remittance.setarrears(diff);
		remittance.save();
		if (loan.isReducingBalance()) {
			if (diff.compareTo(Env.ZERO) != 0) {
				updateInterestForNextPeriod(loan, period.get_ID() + 1, diff);
			}
		}
	}

	/**
	 * ONLY for reducing balance
	 * 
	 * @param loan
	 * @param diff
	 */
	private static void updateInterestForNextPeriod(SLoan loan, int C_Period_ID, BigDecimal diff) {
		Period_remittance remittance = getPeriodRemimittance(loan, C_Period_ID);
		if (remittance != null) {
			BigDecimal newBal = remittance.getBalance().add(diff);
			double interest = newBal.doubleValue() * loan.getMonthlyRate().doubleValue() / 100;
			BigDecimal Interest = BigDecimal.valueOf(interest);
			remittance.setInterest(Interest);
			remittance.setBalance(remittance.getBalance().add(diff));
			remittance.setgross(remittance.getAmount().add(Interest));
			remittance.save();
		}
	}

	/**
	 * Delete the anticipated loan remittance for a particular period This might
	 * happen if a loan remittance is adjusted to zero, or when replacing the
	 * period remittance
	 * 
	 * @param s_loans_ID
	 * @param C_Period_ID
	 */
	public static void deletePeriodRemittanceForLoan(int s_loans_ID, int C_Period_ID) {
		deleteAllRemittanceForLoan(s_loans_ID, " AND C_Period_ID =" + C_Period_ID);
	}

	/**
	 * Delete the anticipated loan remittance for a future periods. This might
	 * happen if a loan remittance is adjusted to zero, or when replacing the
	 * period remittance
	 * 
	 * @param s_loans_ID
	 * @param C_Period_ID
	 */
	public static void deleteFuturePeriodRemittanceForLoan(int s_loans_ID, int C_Period_ID) {
		deleteAllRemittanceForLoan(s_loans_ID, " AND C_Period_ID >" + C_Period_ID);
	}

	/**
	 * delete all period remittances for this loan..This will happen when a loan
	 * is fully repaid, a loan is re-financed, re-scheduled or a loan is written off
	 * 
	 * @param s_loans_ID
	 * @param andWhereClause
	 */
	public static void deleteAllRemittanceForLoan(int s_loans_ID, String andWhereClause) {
		String sql = "DELETE FROM adempiere.s_period_remittance WHERE s_loans_ID=" + s_loans_ID + " " + andWhereClause;
		DB.executeUpdate(sql, null);
	}

	/**
	 * Create new anticipated remittance for a particular period
	 * 
	 * @param C_Period_ID
	 * @param shares
	 * @param Amount
	 */
	public static Period_remittance getPeriodRemimittance(SLoan loan, int C_Period_ID) {
		String sql = "SELECT * FROM adempiere.s_period_remittance WHERE s_loans_ID=" + loan.gets_loans_ID()
				+ " AND C_Period_ID=" + C_Period_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, null);
			rs = stm.executeQuery();
			if (rs.next()) {
				return new Period_remittance(Env.getCtx(), rs, null);
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
		return null;
	}

	public static void createReplaceRemittanceForSaving(int C_Period_ID, MemberShares shares, BigDecimal Amount) {
		String sql = "DELETE FROM adempiere.s_period_remittance WHERE C_Period_ID =" + C_Period_ID
				+ " AND s_membershares_ID=" + shares.gets_membershares_ID();
		DB.executeUpdate(sql, null);

		deletePeriodRemittanceForSaving(C_Period_ID, shares.gets_membershares_ID());

		Period_remittance remittance = new Period_remittance(Env.getCtx(), 0, null);
		remittance.sets_member_ID(shares.gets_member_ID());
		remittance.sets_membershares_ID(shares.gets_membershares_ID());
		remittance.setC_Period_ID(C_Period_ID);
		remittance.setAmount(Amount);
		remittance.setTransactionType("SHARES");
		remittance.save();
	}

	/**
	 * This function will delete an existing remittance for a saving for a given
	 * period
	 * 
	 * @param C_Period_ID
	 * @param shares
	 */
	public static void deletePeriodRemittanceForSaving(int C_Period_ID, int s_membershares_ID) {
		String sql = "DELETE FROM adempiere.s_period_remittance WHERE C_Period_ID =" + C_Period_ID
				+ " AND s_membershares_ID=" + s_membershares_ID;
		DB.executeUpdate(sql, null);
	}
}
