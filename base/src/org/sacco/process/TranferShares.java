package org.sacco.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_ShareTransfer;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.ShareTranfer;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class TranferShares extends SvrProcess {

	private int tansferor_Account_ID = 0;
	private int recepient_Account_ID = 0;
	private ShareTranfer tranfer = null;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		tranfer = new ShareTranfer(getCtx(), getRecord_ID(), get_TrxName());
		tansferor_Account_ID = tranfer.gets_membershares_sender_ID();
		recepient_Account_ID = tranfer.gets_membershares_receiver_ID();
		tranfer.setIsComplete(true);
		tranfer.save();
		tranfer();
		post();
		return null;
	}

	private void tranfer() {
		MemberShares tranferor_Account = new MemberShares(getCtx(), tansferor_Account_ID, get_TrxName());
		MemberShares recepient_Account = new MemberShares(getCtx(), recepient_Account_ID, get_TrxName());

		tranferor_Account.transfer(tranfer.getAmount().negate());
		recepient_Account.transfer(tranfer.getAmount());
	}

	Doc doc = null;
	PO po = null;

	private void post() {
		MAcctSchema[] ass = { MClient.get(getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.s_share_tranfer WHERE s_share_tranfer_ID =" + getRecord_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_ShareTransfer shareTransfer_Doc = new Doc_ShareTransfer(ass, ShareTranfer.class, rs, get_TrxName());
				doc = shareTransfer_Doc;

				ShareTranfer shareTranfer = new ShareTranfer(getCtx(), rs, get_TrxName());
				po = shareTranfer;
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
		fact = new Fact(doc, acctSchema, "A");
		docLine = new DocLine(po, doc);
		postTranfer();
		tranfer.setDocStatus("CO");
		tranfer.setProcessed(true);
		tranfer.setPosted(true);
		tranfer.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postTranfer() {
		if (tranfer.getAmount().compareTo(Env.ZERO) == 0) {
			return;
		}

		MAccount accountDR = new MAccount(Env.getCtx(), tranfer.gets_sharetype_sender().getsharegl_Acct(),
				get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), tranfer.getAmount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), tranfer.gets_sharetype_sender().getsharegl_Acct(),
				get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				tranfer.getAmount().negate());
		lineCR.save();
	}
}
