package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Doc_PettyCash;
import org.compiere.acct.Doc_ReceiptVoucher;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MClient;
import org.compiere.model.PO;
import org.compiere.model.PettyCash;
import org.compiere.model.ReceiptVoucher;
import org.compiere.model.Repayment;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.NumberWordConverter;

public class SaveReceiptVoucher extends SvrProcess {
	Doc doc = null;
	PO po = null;
	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;
	MAcctSchemaDefault acctSchemaDefault = null;
	ReceiptVoucher receiptVoucher  = null;

	@Override
	protected void prepare() {
		System.out.println("sssed");
	}
	
	@Override
	protected String doIt() throws Exception {
		receiptVoucher = new ReceiptVoucher(getCtx(), getRecord_ID(), get_TrxName());

		receiptVoucher.setIsComplete(true);
		receiptVoucher.getbtn_save();
		receiptVoucher.setDocStatus("CO");
		receiptVoucher.setPosted(true);

		String AmountInWords = NumberWordConverter.getMoneyIntoWords(receiptVoucher.getAmount().abs().doubleValue());
		receiptVoucher.setAmountInWords(AmountInWords);
		receiptVoucher.save();
		post();

		return null;
	}

	public void post() {
		MAcctSchema[] ass = { MClient.get(Env.getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.s_receipts WHERE s_receipts_ID =" + getRecord_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_ReceiptVoucher receipt_Doc = new Doc_ReceiptVoucher(ass, ReceiptVoucher.class, rs, get_TrxName());
				doc = receipt_Doc;

				ReceiptVoucher receiptVoucher = new ReceiptVoucher(Env.getCtx(), rs, get_TrxName());
				po = receiptVoucher;
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
		if (receiptVoucher.getAmount().compareTo(Env.ZERO) == 0) {
			return;
		}
		int drAcc = receiptVoucher.getDr_Acct();
		int crAcc = receiptVoucher.getCr_Acct();

		// MAccount accountDR = new MAccount(Env.getCtx(), 1, get_TrxName());
		MAccount DR = new MAccount(acctSchema);
		DR.setAccount_ID(drAcc);
		DR.save();
		FactLine lineDR = fact.createLine(docLine, DR, acctSchema.getC_Currency_ID(), receiptVoucher.getAmount().negate());
		lineDR.save();

		// MAccount accountCR = new MAccount(Env.getCtx(), crAcc, get_TrxName());
		MAccount CR = new MAccount(acctSchema);
		CR.setAccount_ID(crAcc);
		CR.save();
		FactLine lineCR = fact.createLine(docLine, CR, acctSchema.getC_Currency_ID(), receiptVoucher.getAmount());
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
