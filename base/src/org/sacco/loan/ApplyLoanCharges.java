package org.sacco.loan;

import java.math.BigDecimal;

import org.compiere.model.ChargeSetup;
import org.compiere.model.Other_loan_charges;
import org.compiere.model.SLoan;
import org.compiere.model.SLoanType;
import org.compiere.model.Sloan_charges;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 * This class is used to generate loan charges
 * 
 * @author MATT
 *
 */

public class ApplyLoanCharges {
	SLoan loan = null;
	private BigDecimal amt = Env.ZERO;
	private String stage;

	/**
	 * @param loan
	 * @param stage
	 */
	public ApplyLoanCharges(SLoan _loan, String _stage, BigDecimal _amt) {
		this.loan = _loan;
		this.stage = _stage;
		this.amt = _amt;

		//clear();
	}

	private void clear() {
		String sql = "DELETE FROM adempiere.s_loan_charges WHERE s_loans_ID=" + loan.get_ID();
		DB.executeUpdate(sql, null);

	}

	public void generate() {
		SLoanType type = new SLoanType(Env.getCtx(), loan.gets_loantype_ID(), null);
		Other_loan_charges[] charges = type.getChargesForLoan();
		for (int i = 0; i < charges.length; i++) {
			Other_loan_charges charge = charges[i];
			ChargeSetup chargeSetup = new ChargeSetup(Env.getCtx(), charge.gets_accountsetup_ID(), null);
			add(chargeSetup);
		}
		loan.updateCharges();
	}

	private void add(ChargeSetup chargeSetup) {

		BigDecimal amount = Env.ZERO;
		if (chargeSetup.getAmount().compareTo(Env.ZERO) == 1) {
			amount = chargeSetup.getAmount();
		} else if (chargeSetup.getchargeformula() != null && !chargeSetup.getchargeformula().isEmpty()) {
			String formula = chargeSetup.getchargeformula();
			formula = formula.replace("P", amt.stripTrailingZeros().toPlainString());
			formula = formula.replace("[", "").replace("]", "");
			double d = eval(formula);
			BigDecimal f_amt = BigDecimal.valueOf(d);
			amount = f_amt;
		}
		if (amount.compareTo(Env.ZERO) == 1) {
			Sloan_charges charges = new Sloan_charges(Env.getCtx(), 0, null);
			charges.sets_loans_ID(loan.get_ID());
			charges.sets_accountsetup_ID(chargeSetup.gets_accountsetup_ID());
			charges.setDescription(stage);
			charges.setAmount(amount);
			charges.save();
		}
	}

	private static double eval(final String str) {
		return new Object() {
			int pos = -1, ch;

			void nextChar() {
				ch = (++pos < str.length()) ? str.charAt(pos) : -1;
			}

			boolean eat(int charToEat) {
				while (ch == ' ')
					nextChar();
				if (ch == charToEat) {
					nextChar();
					return true;
				}
				return false;
			}

			double parse() {
				nextChar();
				double x = parseExpression();
				if (pos < str.length())
					throw new RuntimeException("Unexpected: " + (char) ch);
				return x;
			}

			// Grammar:
			// expression = term | expression `+` term | expression `-` term
			// term = factor | term `*` factor | term `/` factor
			// factor = `+` factor | `-` factor | `(` expression `)`
			// | number | functionName factor | factor `^` factor

			double parseExpression() {
				double x = parseTerm();
				for (;;) {
					if (eat('+'))
						x += parseTerm(); // addition
					else if (eat('-'))
						x -= parseTerm(); // subtraction
					else
						return x;
				}
			}

			double parseTerm() {
				double x = parseFactor();
				for (;;) {
					if (eat('*'))
						x *= parseFactor(); // multiplication
					else if (eat('/'))
						x /= parseFactor(); // division
					else
						return x;
				}
			}

			double parseFactor() {
				if (eat('+'))
					return parseFactor(); // unary plus
				if (eat('-'))
					return -parseFactor(); // unary minus

				double x;
				int startPos = this.pos;
				if (eat('(')) { // parentheses
					x = parseExpression();
					eat(')');
				} else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
					while ((ch >= '0' && ch <= '9') || ch == '.')
						nextChar();
					x = Double.parseDouble(str.substring(startPos, this.pos));
				} else if (ch >= 'a' && ch <= 'z') { // functions
					while (ch >= 'a' && ch <= 'z')
						nextChar();
					String func = str.substring(startPos, this.pos);
					x = parseFactor();
					if (func.equals("sqrt"))
						x = Math.sqrt(x);
					else if (func.equals("sin"))
						x = Math.sin(Math.toRadians(x));
					else if (func.equals("cos"))
						x = Math.cos(Math.toRadians(x));
					else if (func.equals("tan"))
						x = Math.tan(Math.toRadians(x));
					else
						throw new RuntimeException("Unknown function: " + func);
				} else {
					throw new RuntimeException("Unexpected: " + (char) ch);
				}

				if (eat('^'))
					x = Math.pow(x, parseFactor()); // exponentiation

				return x;
			}
		}.parse();
	}
}
