package org.sacco.process;

import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.ChargeSetup;
import org.compiere.model.MemberShares;
import org.compiere.model.SavingsWithdrawalCharge;
import org.compiere.model.ShareRemittance;
import org.compiere.model.Sloan_charges;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class AddChargeForSavingWithrawal extends SvrProcess {
	private int s_accountsetup_ID = 0;
	private String Description = "";
	private ChargeSetup chargeSetup = null;;
	ShareRemittance remit = null;
	MemberShares shares = null;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("s_accountsetup_ID"))
				s_accountsetup_ID = para[i].getParameterAsInt();
			else if (name.equals("Description"))
				Description = para[i].getParameterAsString();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		if (s_accountsetup_ID > 0) {
			chargeSetup = new ChargeSetup(getCtx(), s_accountsetup_ID, get_TrxName());
		}
		remit = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
		shares = new MemberShares(getCtx(), remit.gets_membershares_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		addCharge();
		return null;
	}

	private void addCharge() {
		BigDecimal chargeAmt = Env.ZERO;
		if (chargeSetup.isuseformula()) {
			if (chargeSetup.getchargeformula() != null && !chargeSetup.getchargeformula().isEmpty()) {
				String formula = chargeSetup.getchargeformula();
				formula = formula.replace("A", remit.getreceiptamount().stripTrailingZeros().toPlainString());
				formula = formula.replace("B", shares.getsharestodate().stripTrailingZeros().toPlainString());
				formula = formula.replace("[", "").replace("]", "");
				double d = eval(formula);
				chargeAmt = BigDecimal.valueOf(d);
			} else {
				chargeAmt = chargeSetup.getAmount();
			}
		} else {
			chargeAmt = chargeSetup.getAmount();
		}
		SavingsWithdrawalCharge charge = new SavingsWithdrawalCharge(getCtx(), 0, get_TrxName());
		charge.sets_accountsetup_ID(s_accountsetup_ID);
		charge.setAmount(chargeAmt);
		charge.setDescription(Description);
		charge.sets_shareremittance_ID(getRecord_ID());
		charge.save();

		remit.setreceiptamount(remit.getreceiptamount().subtract(chargeAmt));
		remit.setothercharges(remit.getothercharges().add(chargeAmt));
		remit.save();

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
