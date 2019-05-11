package zenith.processes;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_Loan;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.I_s_loantype;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.PO;
import org.compiere.model.SLoan;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class EndOfDay extends SvrProcess {
	Doc doc = null; //
	PO po = null; //

	@Override
	protected void prepare() {
		getLoansWithBalance();

	}

	// zenith.processes.EndOfDay
	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	private void getLoansWithBalance() {
		String sql = "SELECT l.* FROM adempiere.s_loans l "
				+ " INNER JOIN adempiere.s_loantype t ON t.s_loantype_id = l.s_loantype_id WHERE loanbalance>0 and t.monthlyintcalc='0'";
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, null);
			rs = stm.executeQuery();
			while (rs.next()) {
				SLoan loan = new SLoan(Env.getCtx(), rs, get_TrxName());

				post(loan);
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

	private void post(SLoan loan) {
		MAcctSchema[] ass = { MClient.get(Env.getCtx()).getAcctSchema() };
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {

			String sql = "SELECT * FROM adempiere.s_loans WHERE s_loans_ID=" + loan.get_ID();
			stm = DB.prepareStatement(sql, null);
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_Loan loan_doc = new Doc_Loan(ass, SLoan.class, rs, get_TrxName());
				doc = loan_doc;
				po = loan;

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
			}
		}
		acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		prePostLoan(loan);
		postLoan(loan);
		loan.setDocStatus("CO");
		// loan.setProcessed(true);
		loan.setIsComplete(true);
		loan.setPosted(true);
		loan.save();
	}

	BigDecimal loanPostingAMount = Env.ZERO;

	private void prePostLoan(SLoan loan) {
		String sql = "DELETE FROM adempiere.fact_acct WHERE  record_ID="+loan.get_ID();
		DB.executeUpdate(sql, get_TrxName());
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postLoan(SLoan loan) {
		I_s_loantype loanType = loan.gets_loantype();

		int debitGL = loanType.getUnEarnedInterest_Acct();
		int creditGL = loanType.getloantypeinterestgl_Acct();
		if (debitGL < 1 || creditGL < 1)
			return;

		BigDecimal amount = loan.getLoanInterestToday();
		if (amount.compareTo(Env.ZERO) < 1)
			return;
		MAccount accountDR = new MAccount(Env.getCtx(), debitGL, get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), amount);
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), creditGL, get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), amount.negate());
		lineCR.save();
	}

}
