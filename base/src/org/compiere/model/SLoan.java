package org.compiere.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.compiere.util.AmtInWords_EN;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.Formula;
import org.sacco.loan.Penalty;
import org.sacco.loan.ReducingBalance;

import z.mathew.Finance;
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
		String sql = "SELECT * FROM adempiere.l_repayments WHERE paymentAmount>0 AND isComplete ='Y' AND s_loans_ID ="
				+ get_ID() + " ORDER BY paymentdate DESC";
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
				LocalDateTime d1 = this.getapproveddate().toLocalDateTime();
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

	public BigDecimal getPeriodPrincipal(int C_Period_ID, Timestamp paymentDate) {
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

		BigDecimal val = Env.ZERO;
		Period_remittance rem = Sacco.getSaccco().getPeriodRemimittance(this, c_Period_ID);
		if (rem == null) {
			LoanSchedule schedule = getScheduleForPeriod(c_Period_ID);
			if (schedule != null) {
				val = schedule.getprincipalrepayment();
			}
		} else {
			val = rem.getarrears();
		}
		return val;
	}

	public BigDecimal getPeriodInterest(int C_Period_ID, Timestamp paymentDate) {

		if (isReducingBalance()) {
			if (isschedule_adjusted()) {
				return getReducingBalanceInterest();
			} else {
				return getScheduleInterest(C_Period_ID, paymentDate);
			}

		} else {
			return getScheduleInterest(C_Period_ID, paymentDate);
		}
	}

	public boolean isReducingBalance() {
		if (gets_loantype().getloantypeinteresttype().equalsIgnoreCase("R"))
			return true;
		return false;
	}

	public boolean isAmortized() {
		if (gets_loantype().getloantypeinteresttype().equalsIgnoreCase("A"))
			return true;
		return false;
	}

	public boolean isReducingBalanceConstant() {
		if (gets_loantype().getloantypeinteresttype().equalsIgnoreCase("RC"))
			return true;
		return false;
	}

	public boolean isFixed() {
		if (gets_loantype().getloantypeinteresttype().equalsIgnoreCase("F"))
			return true;
		return false;
	}

	public boolean isModifiedAmortized() {
		if (gets_loantype().getloantypeinteresttype().equalsIgnoreCase("MA"))
			return true;
		return false;
	}

	private BigDecimal getScheduleInterest(int c_Period_ID, Timestamp paymentDate) {
		boolean hasRemittance = remittanceDoneForPeriod(c_Period_ID);
		boolean dailyMode = gets_loantype().getmonthlyintcalc().equalsIgnoreCase("0");

		if (dailyMode) {
			return getDailyInterest(paymentDate);
		} else {
			if (hasRemittance)
				return Env.ZERO;
			LoanSchedule schedule = getScheduleForPeriod(c_Period_ID);
			if (schedule != null) {
				return schedule.getinterestamount();
			}
		}
		return Env.ZERO;
	}

	private BigDecimal getDailyInterest(Timestamp paymentDate) {
		long days = getLastRepayPeriodInDays(paymentDate);
		double P = getloanbalance().doubleValue();
		double R = getloaninterestrate().doubleValue() * 12;
		double yearDays = 360;
		double T = days / yearDays;
		String method = gets_loantype().getinterestformula();
		Formula formula = new Formula(P, R, T, method);
		BigDecimal interet = formula.getInterest();
		return interet;
	}

	public BigDecimal getPenalty(Timestamp paymentDate) {
		long days = getLastRepayPeriodInDays(paymentDate);
		// penalty
		BigDecimal penalty = Env.ZERO;
		if (gets_loantype().isoverdue_penalty()) {
			BigDecimal interet = getDailyInterest(paymentDate);
			Penalty pen = new Penalty(days, interet);
			penalty = pen.getPenalty();
			return penalty;
		}

		return Env.ZERO;
	}

	private BigDecimal getReducingBalanceInterest() {
		ReducingBalance reducingBalance = new ReducingBalance(this);
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
		return gets_loantype().getloantypeinteresttype();
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

	/**
	 * This method sums all charges associated with loan
	 */
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

	/**
	 * new Repayments This will be used when re-financing a loan
	 * 
	 * @param _loan
	 * @return
	 */
	public Repayment newRepayment(SLoan _loan) {
		loan = _loan;
		BigDecimal PaymentAmount = loan.getloanbalance();
		Repayment r = new Repayment(getCtx(), 0, get_TrxName());
		r.sets_loans_ID(loan.get_ID());
		r.setC_Period_ID(Sacco.getSaccco().getsaccoperiod_ID());
		r.setbankgl_Acct(loan.getbankgl_Acct());
		r.sets_loantype_ID(loan.gets_loantype_ID());
		r.setPaymentDate(DateUtil.newTimestamp());
		r.setpaymode("CASH PERMIT");
		r.setloan_gl_Acct(loan.getloan_gl_Acct());
		r.setinterestgl_Acct(gets_loantype().getloantypeinterestgl_Acct());
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

	/**
	 * This will be used when re-financing a loan
	 * 
	 * @param _loan
	 * @return
	 */
	private void reAllocateGuarantors() {
		LoanGuarantorDetails[] details = repayment.getGuarantorDetails(loan.gets_loans_ID());
		for (int i = 0; i < details.length; i++) {
			LoanGuarantorDetails detail = details[i];
			detail.sets_loans_ID(this.gets_loans_ID());
			detail.save();
		}

	}

	/**
	 * This will be used when re-financing a loan
	 * 
	 * @param _loan
	 * @return
	 */
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

	/**
	 * I'm thinking of revisiting this someday
	 */
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
		accRecievables.sets_member_ID(gets_member_ID());
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

	/**
	 * I don't remember what this shit was supposed to do
	 * 
	 * @return
	 */
	private String getDescription() {
		SLoanType loanType = new SLoanType(getCtx(), gets_loantype_ID(), get_TrxName());
		return loanType.getloantypecode() + " Loan Remmittance No: " + repayment.getDocumentNo();
	}

	/**
	 * Get the amount of loan disbursed.. The sum of all disbursements
	 * 
	 * @return
	 */

	public BigDecimal getAllDisbursedAmounts() {
		String sql = "SELECT COALESCE (SUM(disbursed_amount),0) FROM adempiere.s_loan_disbursement WHERE s_loans_ID ="
				+ gets_loans_ID();

		return DB.getSQLValueBD(get_TrxName(), sql);

	}

	/**
	 * Get the number of repayments already made for the loan. Repayments which are
	 * complete
	 * 
	 * @return
	 */
	public int getNumberOfRepayments() {
		String sql = "SELECT COUNT(l_repayments_ID) FROM adempiere.l_repayments WHERE is_repayment ='Y' AND isComplete='Y' AND  s_loans_ID  = "
				+ get_ID();
		return DB.getSQLValue(get_TrxName(), sql);
	}

	/**
	 * this return the sum of savings used to guarantee the loan
	 * 
	 * @return
	 */
	public BigDecimal getGuaranteedAmountSum() {
		String sql = "SELECT COALESCE(SUM(amountguaranteed),0) FROM adempiere.s_loanguantordetails WHERE s_loans_ID="
				+ get_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	/**
	 * If this loan is guaranteed , then this will return the amount needed to fully
	 * guarantee it
	 * 
	 * @return
	 */
	public BigDecimal getRemainingGuaranteedAmount() {

		return getloanamount().subtract((getGuaranteedAmountSum().add(getCollateralValue())));
	}

	/**
	 * check if this loan is partially disbursed it has been disbursed at least once
	 * before
	 * 
	 * @return true if loan has at leat one disbursement
	 */
	public boolean isPartiallyDisbursed() {
		String sql = "SELECT COUNT(s_loan_disbursement_ID) FROM adempiere.s_loan_disbursement WHERE s_loans_ID="
				+ get_ID();
		int count = DB.getSQLValue(get_TrxName(), sql);
		return count > 1;
	}

	/**
	 * Resets all period remittances as from the period specified --Used for
	 * reducing balance
	 * 
	 * @param _period
	 */
	public void resetPeriodRemittance122(MPeriod _period, BigDecimal diff) {
		Sacco.updatePeriodRemittance(this, _period, diff);
	}

	public I_s_loantype getLoanType() {
		return gets_loantype();
	}

	public BigDecimal getMonthlyRate() {
		return getLoanType().getloantypeinterestrate();
	}

	public BigDecimal getAnnualRate() {
		return getLoanType().getannualinterest();
	}

	/**
	 * ONLY For reducing balance
	 * 
	 * @return
	 */
	public BigDecimal getCurrentInterest() {
		double interest = getloanbalance().doubleValue() * getMonthlyRate().doubleValue() / 100;
		return BigDecimal.valueOf(interest);
	}

	public BigDecimal getPeriodExtraInterest(int c_Period_ID) {
		boolean hasRemittance = remittanceDoneForPeriod(c_Period_ID);
		boolean dailyMode = gets_loantype().getmonthlyintcalc().equalsIgnoreCase("0");

		if (dailyMode) {
			// do nothing
		} else {
			if (hasRemittance)// has remittance for this month
				return Env.ZERO;
			Period_remittance remittance = getPeriod_remittance(c_Period_ID);
			if (remittance != null) {
				return remittance.getExtraInterest();
			}
		}
		return Env.ZERO;
	}

	public Period_remittance getPeriod_remittance(int C_Period_ID) {
		Period_remittance remittance = null;
		String sql = "SELECT * FROM adempiere.s_period_remittance WHERE s_loans_ID=" + get_ID() + " AND C_Period_ID="
				+ C_Period_ID + " ORDER BY created DESC";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				remittance = new Period_remittance(getCtx(), rs, get_TrxName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return remittance;
	}

	public double getLoanToShareProportion() {
		SMember member = new SMember(getCtx(), gets_member_ID(), get_TrxName());
		double freeShares = member.getFreeSavingsBal().doubleValue();
		double loanBalance = getloanbalance().doubleValue();
		if (freeShares == 0)
			return 1;
		return loanBalance / freeShares;
	}

	public int getGuarantorNumber() {
		String sql = "SELECT COUNT(s_loanguantordetails_ID) FROM adempiere.s_loanguantordetails WHERE isActive='Y' AND s_loans_ID="
				+ get_ID();
		return DB.getSQLValue(get_TrxName(), sql);
	}

	/**
	 * Check only savings linked to the loan type
	 * 
	 * @return Savings factor amount
	 */
	public BigDecimal getSavingsFactorAmount() {
		String sql = "SELECT COALESCE(SUM(freeshares),0) FROM adempiere.s_membershares WHERE "
				+ " s_sharetype_ID IN(SELECT s_sharetype_ID FROM  adempiere.s_linked_savings WHERE s_loantype_ID="
				+ gets_loantype_ID() + ")" + " AND s_member_ID=" + gets_member_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public boolean fullyGuaranteed() {
		return getRemainingGuaranteedAmount().compareTo(Env.ZERO) < 1;
	}

	public boolean hasEnoughGuarantors() {
		return getGuarantorNumber() >= gets_loantype().getloantypeminguarantors();
	}

	public BigDecimal getCollateralValue() {
		String sql = "select COALESCE(SUM(valuenumber),0 )from adempiere.s_collateral where s_loans_id ="
				+ gets_loans_ID();
		return DB.getSQLValueBD(get_TrxName(), sql);
	}

	public boolean incomeFactorOk() {
		BigDecimal incomeFactor = gets_loantype().getloantypeincomefactor();
		if (incomeFactor.compareTo(Env.ZERO) == 0)
			return true;

		double pmt = Finance.pmt(getloaninterestrate().doubleValue() / 100, getloanrepayperiod(),
				getloanamount().doubleValue());
		double averageRepay = Math.abs(pmt);
		double minIncome = averageRepay / incomeFactor.doubleValue();
		I_s_member member = gets_member();
		BigDecimal nettIncome = member.getmnett() == null ? Env.ZERO : member.getmnett();
		return nettIncome.doubleValue() >= minIncome;
	}

	public boolean isWithinLimit() {
		BigDecimal maxAmount = gets_loantype().getloantypemaxamount();
		if (maxAmount.compareTo(Env.ZERO) == 0)
			return true;
		return getloanamount().compareTo(maxAmount) < 1;
	}

	public boolean membershipPeriodOk() {
		int minContr = gets_loantype().getminimumcontributions();
		if (minContr == 0)
			return true;
		int s_member_ID = gets_member_ID();
		SMember member = new SMember(getCtx(), s_member_ID, null);
		int months = member.numberOfContributions();
		return months > minContr;
	}

	public boolean shareSavingFactorOk() {
		BigDecimal savingFactor = gets_loantype().getloantypesharesfactor();
		if (savingFactor.compareTo(Env.ZERO) == 0)
			return true;
		BigDecimal memberFreeShares = getSavingsFactorAmount();
		BigDecimal maxAmt = memberFreeShares.multiply(savingFactor);
		return getloanamount().compareTo(maxAmt) < 1;
	}

	public boolean retirementAgeOK() {
		if (1 == 1) {
			return true;
		}
		// Check Retirement age
		I_s_member member = gets_member();

		System.out.println(member.gets_employers_ID());
		if (member.gets_employers_ID() < 1)
			return true;
		// now member has employer at this point
		I_s_employers empl = member.gets_employers();
		int retirementAgeInMonths = empl.getretirement_age() * 12;
		if (retirementAgeInMonths < 1)
			return true;
		// now retirement age set in the employers setup
		if (member.getmdob() == null)
			return true;
		Timestamp ts = member.getmdob();
		Calendar cal = Calendar.getInstance();
		cal.setTime(ts);
		cal.add(Calendar.MONTH, 0 - getloanrepayperiod());
		ts.setTime(cal.getTime().getTime());

		long ageAtLastRepayment = Sacco.calculateAgeInMonths(ts, DateUtil.newTimestamp());
		// now member has age..i.e not null.. do the checking
		return ageAtLastRepayment <= retirementAgeInMonths;
	}

	public int getFirstScheduleID() {
		String sql = "SELECT COALESCE(MIN(s_loanschedule_ID),0) FROM adempiere.s_loanschedule WHERE s_loans_ID="
				+ gets_loans_ID();
		return DB.getSQLValue(get_TrxName(), sql);
	}

	public boolean loanFactorOK() {
		BigDecimal loansFactor = gets_loantype().getloansfactor() != null ? gets_loantype().getloansfactor() : Env.ZERO;

		if (loansFactor.compareTo(Env.ZERO) < 1) {
			return true;
		}
		SMember member = new SMember(getCtx(), gets_member_ID(), get_TrxName());
		BigDecimal currentLoanBalance = member.getCurrentLoanceBalance();
		BigDecimal balanceAfterThisLoan = currentLoanBalance.add(getloanamount() != null ? getloanamount() : Env.ZERO);
		if (loansFactor.compareTo(balanceAfterThisLoan) >= 0) {
			return true;
		}

		return false;
	}

	public LoanDisbursement[] getDisbursements() {
		List<LoanDisbursement> list = new ArrayList<>();
		String sql = "SELECT * FROM adempiere.s_loan_disbursement WHERE s_loans_ID =" + get_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			if (rs.next()) {
				LoanDisbursement d = new LoanDisbursement(getCtx(), rs, get_TrxName());
				list.add(d);
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
		return list.toArray(new LoanDisbursement[list.size()]);

	}

	public BigDecimal getLoanInterestToday() {
		String sql = "select adempiere.getloaninterest(" + get_ID() + ")";
		return DB.getSQLValueBD(get_TrxName(), sql);
	}
}
