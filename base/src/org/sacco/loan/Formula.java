package org.sacco.loan;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author MATT
 *
 */
public class Formula {

	// Interest Calculation formula
	/*
	 * PRT/100-------------------------------------------------------------1
	 * (P(T+1)R)/200-------------------------------------------------------2
	 * (P(T+R+2))/200------------------------------------------------------3
	 * P(1+T)R/100---------------------------------------------------------4
	 */
	private double P;
	private double R;
	private double T;
	private String M;
	double interest;

	public static void main(String[] args) {
		Formula formula = new Formula(201920, 1, .04, "1");
		formula.getInterest();

	}

	/**
	 * @param p
	 *            - principal
	 * @param r
	 *            - rate per month
	 * @param t
	 *            - time
	 * @param method
	 *            - the formula used
	 */
	public Formula(double p, double r, double t, String method) {
		P = p;
		R = r;
		T = t;
		M = method;
	}

	public BigDecimal getInterest() {
		if (M.equals("1")) {
			interest = P * R * T / 100;
		} else if (M.equals("2")) {
			interest = (P * (T + 1) * R) / 200;
		}
		if (M.equals("3")) {
			interest = (P * (T + R + 2)) / 200;
		} else if (M.equals("4")) {
			interest = P * (1 + T) * R / 100;
		}
		return BigDecimal.valueOf(interest).setScale(2, RoundingMode.CEILING);
	}

}
