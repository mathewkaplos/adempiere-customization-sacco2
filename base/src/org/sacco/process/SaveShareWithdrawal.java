package org.sacco.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import org.compiere.acct.Doc;
import org.compiere.acct.DocLine;
import org.compiere.acct.Doc_ShareRemittance;
import org.compiere.acct.Fact;
import org.compiere.acct.FactLine;
import org.compiere.model.I_s_sharetype;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.SavingsWithdrawalCharge;
import org.compiere.model.ShareRemittance;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;

public class SaveShareWithdrawal extends SvrProcess {

	ShareRemittance shareRemittance = null;
	private int C_Bank_ID = 0;
	private MBank bank = null;
	private I_s_sharetype shareType = null;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Bank_ID"))
				C_Bank_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		bank = new MBank(getCtx(), C_Bank_ID, get_TrxName());
		shareRemittance = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
		shareType = shareRemittance.gets_sharetype();
	}

	@Override
	protected String doIt() throws Exception {
		BigDecimal receiptAmt = shareRemittance.getreceiptamount();

		shareRemittance.setIsComplete(true);
		shareRemittance.setreceiptamount(shareRemittance.getreceiptamount().negate());
		shareRemittance.setTransactionTime(DateUtil.newTimestamp());
		shareRemittance.setTransDate(DateUtil.newTimestamp());
		shareRemittance.setIsComplete(true);
		shareRemittance.save();
		post();
		JOptionPane.showMessageDialog(null, "Saved Successfully");
		return null;
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
		postShareCharges();
		postSahre();
		updateMemberShare();
		shareRemittance.setDocStatus("CO");
		shareRemittance.setProcessed(true);
		shareRemittance.setPosted(true);
		shareRemittance.save();

	}

	private void updateMemberShare() {
		BigDecimal withrawalAmt = shareRemittance.getreceiptamount();
		if (totalCharge.compareTo(Env.ZERO) == 1)
			withrawalAmt.abs().add(totalCharge);

		MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(), get_TrxName());
		memberShares.setsharestodate(memberShares.getsharestodate().subtract(withrawalAmt));
		memberShares.setfreeshares(memberShares.getfreeshares().subtract(withrawalAmt));
		memberShares.save();
	}

	Fact fact = null;
	DocLine docLine = null;
	MAcctSchema acctSchema = null;

	private void postSahre() {
		if (shareRemittance.getreceiptamount().compareTo(Env.ZERO) == 0) {
			return;
		}
		int share_saving_gl = 0;
		if (shareType.getshare_saving().equals("saving"))
			share_saving_gl = shareType.getinterestgl_Acct();
		else
			share_saving_gl = shareType.getdividendgl_Acct();

		MAccount accountCR = new MAccount(Env.getCtx(), share_saving_gl, get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				shareRemittance.getreceiptamount().negate());
		lineCR.save();

		MAccount accountDR = new MAccount(Env.getCtx(), bank.getGLAccount(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(),
				shareRemittance.getreceiptamount());
		lineDR.save();
	}

	private void postShareCharges() {
		String sql = "SELECT * FROM adempiere.s_saving_withdrawal_charges WHERE s_shareremittance_ID ="
				+ getRecord_ID();
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			stm = DB.prepareStatement(sql, get_TrxName());
			rs = stm.executeQuery();
			while (rs.next()) {
				SavingsWithdrawalCharge charge = new SavingsWithdrawalCharge(getCtx(), rs, get_TrxName());
				postCharge(charge);
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

	static BigDecimal totalCharge = Env.ZERO;

	private void postCharge(SavingsWithdrawalCharge charge) {

		int chargeSetupID = charge.gets_accountsetup_ID();
		if (chargeSetupID < 1)
			return;
		int share_saving_gl = 0;
		if (shareType.getshare_saving().equals("saving"))
			share_saving_gl = shareType.getinterestgl_Acct();
		else
			share_saving_gl = shareType.getdividendgl_Acct();

		totalCharge = totalCharge.add(charge.getAmount());
		TransactionChargeSetup chargeSetup = new TransactionChargeSetup(Env.getCtx(), chargeSetupID, get_TrxName());

		MAccount accountDR = new MAccount(Env.getCtx(), share_saving_gl, get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), charge.getAmount());
		lineDR.save();

		MAccount accountCR = new MAccount(Env.getCtx(), chargeSetup.getglcode_Acct(), get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(),
				charge.getAmount().negate());
		lineCR.save();
	}
}
