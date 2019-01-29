package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

public class LoanSchedule extends X_s_loanschedule {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoanSchedule(Properties ctx, int s_loanschedule_ID, String trxName) {
		super(ctx, s_loanschedule_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public LoanSchedule(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public void setInterest(BigDecimal interest) {
		setexpinterest(interest);
		setoldinterest(interest);
		setnewinterest(interest);
		setinterestamount(interest);
		save();
	}

	public void setPrincipal(BigDecimal principal) {
		setmonthlyrepayment(principal);
		setprincipalrepayment(principal);
		setexpprincipal(principal);
		save();
	}

	public LoanSchedule getPeriodSchedule(SLoan loan, Timestamp period) {

		return null;
	}
}
