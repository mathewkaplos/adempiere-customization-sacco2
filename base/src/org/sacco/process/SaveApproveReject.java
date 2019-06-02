package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.model.ChargeSetup;
import org.compiere.model.LoanGuarantorDetails;
import org.compiere.model.LoanSchedule;
import org.compiere.model.MemberShares;
import org.compiere.model.SLoan;
import org.compiere.model.Sloan_charges;
import org.compiere.model.X_s_other_loan_charges;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.sacco.loan.ApplyLoanCharges;

import zenith.util.Util;

public class SaveApproveReject extends SvrProcess {

	SLoan loan = null;

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		loan = new SLoan(getCtx(), getRecord_ID(), get_TrxName());
		if (loan.isApproved()) {
			loan.setapproval_done(true);
			loan.setloanstatus("APPROVED");
			loan.save();
			if (loan.is_refinance()) {
				int oldLoan_ID = loan.gets_loans_refinance_ID();
				SLoan oldLoan = new SLoan(getCtx(), oldLoan_ID, get_TrxName());
				BigDecimal oldLoanBal = oldLoan.getloanbalance();

				BigDecimal interest = oldLoan.getLoanInterestToday();
				BigDecimal penalty = oldLoan.getLoanPenaltyToday();
				BigDecimal extraCharge = Util.round(interest.add(penalty));

				BigDecimal approvedAmount = loan.getapprovedamount();
				BigDecimal appliedamount = approvedAmount.subtract(oldLoanBal).subtract(extraCharge);

				loan.setappliedamount(Util.round(appliedamount));
				loan.setissued_amount(Util.round(appliedamount));
				loan.save();

			} else {
				loan.setissued_amount(loan.getapprovedamount());
				loan.save();
			}
			updateGuarantorsOnApproval();
			int firsScheduleID = loan.getFirstScheduleID();
			if (firsScheduleID > 0) {
				LoanSchedule ls = new LoanSchedule(getCtx(), firsScheduleID, get_TrxName());
				loan.setexpectedrepaydate(ls.getloanpaydate());
				loan.save();
			}
		} else if (loan.isrejected()) {
			updateGuarantorsOnRejection();
		}

		// addCharges();

		return null;
	}

	private void updateGuarantorsOnApproval() {
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails details = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				details.setloan_approved(true);
				details.save();
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

	}

	private void updateGuarantorsOnRejection() {
		String sql = "SELECT * FROM adempiere.s_loanguantordetails WHERE s_loans_ID=" + getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				LoanGuarantorDetails details = new LoanGuarantorDetails(getCtx(), rs, get_TrxName());
				details.settiedshares(Env.ZERO);
				details.setloan_rejected(true);
				details.save();

				MemberShares memberShares = new MemberShares(getCtx(), details.gets_membershares_ID(), get_TrxName());
				memberShares.setfreeshares(memberShares.getfreeshares().add(details.getamountguaranteed()));
				memberShares.settiedshares(memberShares.gettiedshares().subtract(details.getamountguaranteed()));
				memberShares.save();
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

	}

	private void addCharges() {

		String sql = "SELECT * FROM adempiere.s_other_loan_charges WHERE  apply_in_tracking='Y' AND s_loantype_ID= "
				+ loan.gets_loantype_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				X_s_other_loan_charges charges = new X_s_other_loan_charges(getCtx(), rs, get_TrxName());
				addCharge(charges);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private void addCharge(X_s_other_loan_charges charge) {
		BigDecimal chargeAmt = Env.ZERO;
		ChargeSetup chargeSetup = new ChargeSetup(getCtx(), charge.gets_accountsetup_ID(), get_TrxName());
		if (chargeSetup.isuseformula()) {
			if (chargeSetup.getchargeformula() != null && !chargeSetup.getchargeformula().isEmpty()) {
				String formula = chargeSetup.getchargeformula();
				formula = formula.replace("P", loan.getapprovedamount().stripTrailingZeros().toPlainString());
				formula = formula.replace("[", "").replace("]", "");
				double d = eval(formula);
				chargeAmt = BigDecimal.valueOf(d);
			} else {
				chargeAmt = chargeSetup.getAmount();
			}
		} else {
			chargeAmt = chargeSetup.getAmount();
		}
		Sloan_charges charges = new Sloan_charges(Env.getCtx(), 0, null);
		charges.sets_loans_ID(loan.get_ID());
		charges.sets_accountsetup_ID(chargeSetup.gets_accountsetup_ID());
		charges.setDescription("loan_tracking");
		charges.setAmount(chargeAmt);
		charges.save();

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
