package org.sacco.loan;

import java.math.BigDecimal;

import org.compiere.util.Env;

public class Penalty {

	long dueDays = 45;
	private long days = 0;
	private double interest = 0;

	// form I*0.5;
	public Penalty(long _days, BigDecimal _interest) {
		days = _days;
		interest = _interest.doubleValue();
	}

	public BigDecimal getPenalty() {
		if (days > dueDays) {
			double penalty = interest * 0.5;
			return BigDecimal.valueOf(penalty);
		}
		return Env.ZERO;

	}
}
