package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_LoanReapayment;
import org.compiere.acct.Doc_ShareRemittance;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Repayment;
import org.compiere.model.Sacco;
import org.compiere.model.ShareRemittance;
import org.compiere.model.Share_recovery;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SaveShareRemittance extends SvrProcess {

	ShareRemittance shareRemittance = null;

	@Override
	protected void prepare() {
		shareRemittance = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		BigDecimal receiptAmt = shareRemittance.getreceiptamount();
		MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(), get_TrxName());
		memberShares.setsharestodate(memberShares.getsharestodate().add(receiptAmt));
		memberShares.setfreeshares(memberShares.getfreeshares().add(receiptAmt));
		memberShares.save();

		JOptionPane.showMessageDialog(null, "Saved Successfully");

		shareRemittance.setIsComplete(true);
		shareRemittance.setTransactionTime(DateUtil.newTimestamp());
		shareRemittance.setTransDate(DateUtil.newTimestamp());
		shareRemittance.save();

		post();

		if (shareRemittance.isrecover_from_share_transfer()) {
			List<Share_recovery> list = new ArrayList<>();
			String sql = "SELECT * FROM adempiere.s_share_recovery WHERE s_shareremittance_ID=" + getRecord_ID();
			PreparedStatement stm = null;
			ResultSet rs = null;
			try {
				stm = DB.prepareStatement(sql, get_TrxName());
				rs = stm.executeQuery();
				while (rs.next()) {
					Share_recovery recovery = new Share_recovery(getCtx(), rs, get_TrxName());
					list.add(recovery);
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
			Share_recovery[] arr = list.toArray(new Share_recovery[list.size()]);
			update(arr);
		}
		return null;
	}

	private void update(Share_recovery[] _arr) {
		Share_recovery[] arr = _arr;
		for (int i = 0; i < arr.length; i++) {
			Share_recovery recovery = arr[i];
			int s_membershares_ID = recovery.gets_membershares_ID();
			MemberShares memberShares = new MemberShares(getCtx(), s_membershares_ID, get_TrxName());
			memberShares.setsharestodate(memberShares.getsharestodate().subtract(recovery.getAmount()));
			memberShares.setfreeshares(memberShares.getfreeshares().subtract(recovery.getAmount()));
			memberShares.save();
		}
	}

	Doc doc = null;
	PO po = null;

	private void post() {
		MAcctSchema[] ass = { MClient.get(getCtx()).getAcctSchema() };
		String sql = "SELECT * FROM adempiere.s_shareremittance WHERE s_shareremittance_ID =" + getRecord_ID();
		ResultSet rs = null;
		PreparedStatement stm = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				Doc_ShareRemittance shareRemittance_Doc = new Doc_ShareRemittance(ass, ShareRemittance.class, rs,
						get_TrxName());
				doc = shareRemittance_Doc;

				ShareRemittance remittance = new ShareRemittance(getCtx(), rs, get_TrxName());
				po = remittance;
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
		postSahre();
		shareRemittance.setDocStatus("CO");
		shareRemittance.setProcessed(true);
		shareRemittance.setPosted(true);
		shareRemittance.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postSahre() {
		if (shareRemittance.getreceiptamount().compareTo(Env.ZERO) == 0) {
			return;
		}
		MAcctSchemaDefault acctSchemaDefault = MAcctSchemaDefault.get(getCtx(), acctSchema.get_ID());
		MAccount accountDR = new MAccount(Env.getCtx(), shareRemittance.gets_sharetype().getsharegl_Acct(),
				get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				shareRemittance.getreceiptamount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), acctSchemaDefault.getV_Liability_Acct(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				shareRemittance.getreceiptamount().negate());
		lineCR.save();
	}
}
