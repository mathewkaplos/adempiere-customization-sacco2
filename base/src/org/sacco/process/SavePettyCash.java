package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Doc_PettyCash;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MClient;
import org.compiere.model.PO;
import org.compiere.model.PettyCash;
import org.compiere.model.Repayment;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.NumberWordConverter;

public class SavePettyCash extends SvrProcess {
	Doc doc = null;
	PO po = null;
	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;
	MAcctSchemaDefault acctSchemaDefault = null;
	PettyCash pettyCash = null;

	@Override
	protected void prepare() {
		System.out.println("sssed");
	}
	
	@Override
	protected String doIt() throws Exception {
		pettyCash = new PettyCash(getCtx(), getRecord_ID(), get_TrxName());

		pettyCash.setIsComplete(true);
		pettyCash.getbtn_save();
		pettyCash.setDocStatus("CO");
		pettyCash.setPosted(true);

		String AmountInWords = NumberWordConverter.getMoneyIntoWords(pettyCash.getAmount().abs().doubleValue());
		pettyCash.setAmountInWords(AmountInWords);
		pettyCash.save();
		post();

		return null;
	}

	public void post() {
		MAcctSchema[] ass = { MClient.get(Env.getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.s_petty_cash WHERE s_petty_cash_ID =" + getRecord_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_PettyCash pettyCash_Doc = new Doc_PettyCash(ass, PettyCash.class, rs, get_TrxName());
				doc = pettyCash_Doc;

				PettyCash pettyCash = new PettyCash(Env.getCtx(), rs, get_TrxName());
				po = pettyCash;
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
		acctSchema = new MAcctSchema(Env.getCtx(), 101, null);
		acctSchemaDefault = MAcctSchemaDefault.get(Env.getCtx(), acctSchema.get_ID());
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		postPayment();

	}

	private void postPayment() {
		if (pettyCash.getAmount().compareTo(Env.ZERO) == 0) {
			return;
		}
		int drAcc = pettyCash.getDr_Acct();
		int crAcc = pettyCash.getCr_Acct();

		// MAccount accountDR = new MAccount(Env.getCtx(), 1, get_TrxName());
		MAccount DR = new MAccount(acctSchema);
		DR.setAccount_ID(drAcc);
		DR.save();
		FactLine lineDR = fact.createLine(docLine, DR, acctSchema.getC_Currency_ID(), pettyCash.getAmount().negate());
		lineDR.save();

		// MAccount accountCR = new MAccount(Env.getCtx(), crAcc, get_TrxName());
		MAccount CR = new MAccount(acctSchema);
		CR.setAccount_ID(crAcc);
		CR.save();
		FactLine lineCR = fact.createLine(docLine, CR, acctSchema.getC_Currency_ID(), pettyCash.getAmount());
		lineCR.save();

		// update contra -accounts , and other particulars
		// lineDR.setcontra_account_id(lineCR.getAccount_ID());
		// lineDR.setUserCode(user.getName());
		// lineDR.setChequeNo(chequeNo);
		// lineDR.setDescription("Repayment." + MemberNoDescription);
		// lineDR.save();

		// lineCR.setcontra_account_id(lineDR.getAccount_ID());
		// lineCR.setUserCode(user.getName());
		// lineCR.setChequeNo(chequeNo);
		// lineCR.setDescription("Repayment." + MemberNoDescription);
		// lineCR.save();

	}

}
