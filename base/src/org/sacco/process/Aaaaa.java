package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanDisbursement;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.LoanDisbursement;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.PO;
import org.compiere.model.SLoan;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class Aaaaa extends SvrProcess {

	Doc doc = null;
	PO po = null;
	private int C_Bank_ID = 100;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MAcctSchema[] ass = { MClient.get(getCtx()).getAcctSchema() };

		try {
			ResultSet rs = null;
			PreparedStatement stm = null;
			String sql = "SELECT * FROM adempiere.s_loan_disbursement WHERE s_loan_disbursement_ID=1000000";
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_LoanDisbursement disbursement = new Doc_LoanDisbursement(ass, LoanDisbursement.class, rs,
						get_TrxName());
				doc = disbursement;

				LoanDisbursement loanDisbursement = new LoanDisbursement(getCtx(), rs, get_TrxName());
				po = loanDisbursement;
				post2();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void post2() {
		MAcctSchema acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		MAccount account = new MAccount(Env.getCtx(), 1000002, null);
		Fact fact = new Fact(doc, acctSchema, "A");
		DocLine docLine = new DocLine(po, doc);
		FactLine line = fact.createLine(docLine, account, 100, Env.ONEHUNDRED);
		line.setDateTrx(DateUtil.newTimestamp());
		line.setDateAcct(DateUtil.newTimestamp());
		line.save();
		doc.post(true, false);

		MBank bank = new MBank(getCtx(), C_Bank_ID, get_TrxName());

	}

	private void post() {
		MAcctSchema acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		MAccount account = new MAccount(Env.getCtx(), 1000001, null);
		FactLine line = new FactLine(Env.getCtx(), SLoan.Table_ID, 0, 0, null);
		line.setAccount(acctSchema, account);
		line.setAccount_ID(account.getAccount_ID());
		line.setDateTrx(DateUtil.newTimestamp());
		line.setDateAcct(DateUtil.newTimestamp());
		line.setPostingType("A");
		line.setC_Currency_ID(100);
		line.save();
	}

}
