package org.compiere.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.compiere.util.AmtInWords_EN;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.ReducingBalance;

import zenith.util.DateUtil;

public class SLoan extends X_s_loans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SLoan(Properties ctx, int s_loans_ID, String trxName) {
		super(ctx, s_loans_ID, trxName);
	}

	public SLoan(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public LoanSchedule getPeriodSchedule(int period) {
		String sql = "SELECT * FROM adempiere.s_loanschedule s WHERE s.s_loans_ID =" + get_ID() + " AND C_Period_ID="
				+ period;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				return new LoanSchedule(getCtx(), rs, get_TrxName());
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

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public MonthlyLoansAdjustments getPeriodAdjustment() {
		String sql = "SELECT * FROM adempiere.s_monthlyloansadjustments WHERE s_loans_ID=" + get_ID()
				+ " AND iscomplete='Y' ORDER BY s_monthlyloansadjustments_ID DESC ";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				return new MonthlyLoansAdjustments(getCtx(), rs, get_TrxName());
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

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean remittanceDoneForPeriod(Timestamp periodDate) {
		MPeriod period = MPeriod.get(getCtx(), periodDate, 0);
		String sql = "SELECT * FROM adempiere.l_repayments WHERE s_loans_ID =" + get_ID() + " AND C_Period_ID ="
				+ period.get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				if (repayment.isComplete())
					return true;
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

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public boolean remittanceDoneForPeriod(int C_Period_ID) {
		String sql = "SELECT * FROM adempiere.l_repayments WHERE s_loans_ID =" + get_ID() + " AND C_Period_ID ="
				+ C_Period_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				if (repayment.isComplete())
					return true;
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
				e.printStackTrace();
			}
		}

		return false;
	}

	public long getLastRepayPeriodInDays(Timestamp selectedtDate) {
		long diff = 0;
		LocalDateTime d2 = selectedtDate.toLocalDateTime();
		String sql = "SELECT * FROM adempiere.l_repayments WHERE isComplete ='Y' AND s_loans_ID =" + get_ID()
				+ " ORDER BY created DESC";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				LocalDateTime d1 = repayment.getPaymentDate().toLocalDateTime();
				diff = Duration.between(d1, d2).toDays();

			} else {
				LocalDateTime d1 = this.getloanappdate().toLocalDateTime();
				diff = Duration.between(d1, d2).toDays();
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
			} catch (SQLException e) {
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

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return diff;
	}

	public BigDecimal getPeriodPrincipal(int C_Period_ID) {
		if (isschedule_adjusted()) {
			BigDecimal adjustedValue = getPeriodAdjustment().getnewamount();
			BigDecimal loanBal = this.getloanbalance();
			if (adjustedValue.compareTo(loanBal) == 1) {
				return loanBal;
			} else {
				return adjustedValue;
			}
		} else {
			return getSchedulePrincipal(C_Period_ID);
		}
	}

	private BigDecimal getSchedulePrincipal(int c_Period_ID) {
		LoanSchedule schedule = getScheduleForPeriod(c_Period_ID);
		if (schedule != null) {
			return schedule.getprincipalrepayment();
		}
		return Env.ZERO;
	}

	public BigDecimal getPeriodInterest(int C_Period_ID) {

		if (isReducingBalance()) {
			if (isschedule_adjusted()) {
				return getReducingBalanceInterest();
			} else {
				return getScheduleInterest(C_Period_ID);
			}

		} else {
			return getScheduleInterest(C_Period_ID);
		}
	}

	public boolean isReducingBalance() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		if (loanType.getloantypeinteresttype().equalsIgnoreCase("R"))
			return true;
		return false;
	}

	public boolean isAmortized() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		if (loanType.getloantypeinteresttype().equalsIgnoreCase("A"))
			return true;
		return false;
	}

	public boolean isReducingBalanceConstant() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		if (loanType.getloantypeinteresttype().equalsIgnoreCase("RC"))
			return true;
		return false;
	}

	public boolean isFixed() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		if (loanType.getloantypeinteresttype().equalsIgnoreCase("F"))
			return true;
		return false;
	}

	public boolean isModifiedAmortized() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		if (loanType.getloantypeinteresttype().equalsIgnoreCase("MA"))
			return true;
		return false;
	}

	private BigDecimal getScheduleInterest(int c_Period_ID) {
		boolean hasRemittance = remittanceDoneForPeriod(c_Period_ID);
		if (hasRemittance)
			return Env.ZERO;
		LoanSchedule schedule = getScheduleForPeriod(c_Period_ID);
		if (schedule != null) {
			return schedule.getinterestamount();
		}
		return Env.ZERO;
	}

	private BigDecimal getReducingBalanceInterest() {
		ReducingBalance reducingBalance = new ReducingBalance(get_ID());
		return reducingBalance.getExpectedInterest();
	}

	private LoanSchedule getScheduleForPeriod(int C_Period_ID) {
		String sql0 = "SELECT * FROM  adempiere.s_loanschedule WHERE s_loans_ID =" + gets_loans_ID()
				+ "  AND C_Period_ID=" + C_Period_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql0, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				LoanSchedule schedule = new LoanSchedule(getCtx(), rs, get_TrxName());
				return schedule;
			}
		} catch (Exception w) {
			w.printStackTrace();
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
				e.printStackTrace();
			}
		}
		return null;
	}

	public String getInterestPayMethodCode() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		return loanType.getloantypeinteresttype();
	}

	public boolean hasAdjustment(int C_Period_ID) {
		String sql = "SELECT * FROM adempiere.s_monthlyloansadjustments WHERE s_loans_ID =" + get_ID()
				+ " AND C_Period_ID =" + C_Period_ID;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Repayment repayment = new Repayment(getCtx(), rs, get_TrxName());
				if (repayment.isComplete())
					return true;
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
				e.printStackTrace();
			}
		}

		return false;
	}

	private BigDecimal getOtherCharges(String whereClause) {
		String sql = "SELECT * FROM adempiere.s_loan_charges " + whereClause;
		BigDecimal value = Env.ZERO;

		PreparedStatement stm = null;
		ResultSet rs = null;
		try {

			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Sloan_charges charge = new Sloan_charges(getCtx(), rs, get_TrxName());
				value = value.add(charge.getAmount()).add(charge.getadditionalamt());
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	public BigDecimal getOtherChargesAll() {
		return getOtherCharges("");
	}

	public void updateCharges() {
		String sql = "select SUM(amount) from adempiere.s_loan_charges WHERE s_loans_ID =" + get_ID();
		BigDecimal totalAmt = DB.getSQLValueBD(get_TrxName(), sql);
		System.out.println("totalAmt: " + totalAmt);

		setothercharges(totalAmt);
		save();
	}

	////////////////////////////////////////
	// REPAYMENT///////////
	private SLoan loan = null;
	private Repayment repayment = null;

	public Repayment newRepayment(SLoan _loan) {
		loan = _loan;
		BigDecimal PaymentAmount = loan.getloanbalance();
		SLoanType loanType = new SLoanType(Env.getCtx(), loan.gets_loantype_ID(), get_TrxName());
		Repayment r = new Repayment(getCtx(), 0, get_TrxName());
		r.sets_loans_ID(loan.get_ID());
		r.setC_Period_ID(Sacco.getSaccco().getsaccoperiod_ID());
		r.setbankgl_Acct(loan.getbankgl_Acct());
		r.sets_loantype_ID(loan.gets_loantype_ID());
		r.setPaymentDate(DateUtil.newTimestamp());
		r.setpaymode("CASH PERMIT");
		r.setloan_gl_Acct(loan.getloan_gl_Acct());
		r.setinterestgl_Acct(loanType.getloantypeinterestgl_Acct());
		r.save();
		r.setReceiptNo(r.getDocumentNo());
		r.setVoucherNo(r.getDocumentNo());
		r.setPrincipal(PaymentAmount);
		r.setPaymentAmount(PaymentAmount);
		r.setIsComplete(true);
		r.setis_repayment(true);
		r.save();
		repayment = r;
		updateLoanRemmittance();
		reAllocateGuarantors();
		return r;
	}

	private void reAllocateGuarantors() {
		SLoanGuantorDetails[] details = repayment.getGuarantorDetails(loan.gets_loans_ID());
		for (int i = 0; i < details.length; i++) {
			SLoanGuantorDetails detail = details[i];
			detail.sets_loans_ID(this.gets_loans_ID());
			detail.save();
		}

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
		accRecievables.settransperiod(Sacco.getSaccco().getsaccoperiod_ID());
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
			// String AmountInWords =
			// aiw.getAmtInWords(repayment.getgross_amount_due().toString());
			// accRecievables.setAmountInWords(AmountInWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
		accRecievables.save();
	}

	private String getDescription() {
		SLoanType loanType = new SLoanType(getCtx(), loan.gets_loantype_ID(), get_TrxName());
		return loanType.getloantypecode() + " Loan Remmittance No: " + repayment.getDocumentNo();
	}

	public BigDecimal getAllDisbursedAmounts() {
		String sql = "SELECT COALESCE (SUM(disbursed_amount),0) FROM adempiere.s_loan_disbursement WHERE s_loans_ID ="
				+ gets_loans_ID();

		return DB.getSQLValueBD(get_TrxName(), sql);

	}

}
