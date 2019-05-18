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
import org.compiere.model.AD_User;
import org.compiere.model.I_s_member;
import org.compiere.model.I_s_sharetype;
import org.compiere.model.LoanRepaymentCharge;
import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaDefault;
import org.compiere.model.MBank;
import org.compiere.model.MClient;
import org.compiere.model.MemberShares;
import org.compiere.model.PO;
import org.compiere.model.Sacco;
import org.compiere.model.SavingsWithdrawalCharge;
import org.compiere.model.ShareRemittance;
import org.compiere.model.TransactionChargeSetup;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import zenith.util.DateUtil;
import zenith.util.NumberWordConverter;

public class SaveShareWithdrawal extends SvrProcess {

	ShareRemittance shareRemittance = null;
	private int C_Bank_ID = 0;

	private I_s_sharetype shareType = null;

	private BigDecimal amount = Env.ZERO;
	private BigDecimal interest = Env.ZERO;
	private boolean isfixeddeposit = true;

	AD_User user = null;

	String userCode = "";
	String chequeNo = "";
	String MemberNoDescription = "";
	I_s_member member = null;

	int C_Period_ID = 0;

	@Override
	protected void prepare() {

		shareRemittance = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
		shareType = shareRemittance.gets_sharetype();

		member = shareRemittance.gets_member();
		user = new AD_User(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()), get_TrxName());
		userCode = user.getName();
		if (shareRemittance.getChequeNo() != null && !shareRemittance.getChequeNo().isEmpty())
			chequeNo = shareRemittance.getChequeNo();
		else
			chequeNo = shareRemittance.getDocumentNo();
		MemberNoDescription = ".Mbr. No:" + member.getDocumentNo();

		C_Period_ID = Sacco.getSaccco().getsaccoperiod_ID();
	}

	@Override
	protected String doIt() throws Exception {

		isfixeddeposit = shareRemittance.isfixeddeposit();
		if (isfixeddeposit) {
			interest = shareRemittance.getInterestAmt();
			MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(),
					get_TrxName());
			amount = memberShares.getsharestodate();
		} else
			amount = shareRemittance.getreceiptamount();

		shareRemittance.setIsComplete(true);
		shareRemittance.setreceiptamount(shareRemittance.getreceiptamount().negate());
		shareRemittance.setTransactionTime(DateUtil.newTimestamp());
		shareRemittance.setTransDate(DateUtil.newTimestamp());
		shareRemittance.setIsComplete(true);

		String amtInWords_EN = NumberWordConverter
				.getMoneyIntoWords(shareRemittance.getreceiptamount().abs().doubleValue());

		shareRemittance.setAmountInWords(amtInWords_EN);
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
		if (isfixeddeposit)
			postInterest();
		updateMemberShare();
		shareRemittance.setDocStatus("CO");
		shareRemittance.setProcessed(true);
		shareRemittance.setPosted(true);
		shareRemittance.save();

	}

	private void updateMemberShare() {
		System.out.println(totalCharge);
		if (totalCharge.compareTo(Env.ZERO) == 1)
			amount = amount.abs().add(totalCharge);
	System.out.println(amount);

		MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(), get_TrxName());
		memberShares.setsharestodate(memberShares.getsharestodate().subtract(amount));
		memberShares.setfreeshares(memberShares.getfreeshares().subtract(amount));
		memberShares.save();

		shareRemittance.setShareBalance(memberShares.getsharestodate());
		shareRemittance.setShareTotal(memberShares.getsharestodate());
		shareRemittance.setothercharges(totalCharge);
		shareRemittance.save();
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
			share_saving_gl = shareType.getsaving_gl_code_Acct();
		else
			share_saving_gl = shareType.getsharegl_Acct();

		MAccount accountCR = new MAccount(Env.getCtx(), share_saving_gl, get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), amount);
		lineCR.save();

		MAccount accountDR = new MAccount(Env.getCtx(), shareRemittance.getbankgl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), amount.negate());
		lineDR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Saving Withdrawal." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineDR.setDescription("Saving Withdrawal." + MemberNoDescription);
		lineCR.save();

	}

	private void postInterest() {
		if (interest.compareTo(Env.ZERO) == 0) {
			return;
		}
		int interest_gl = 0;
		if (shareType.getshare_saving().equals("saving"))
			interest_gl = shareType.getinterest_payable_Acct();
		else
			interest_gl = shareType.getdividend_payable_Acct();

		MAccount accountCR = new MAccount(Env.getCtx(), interest_gl, get_TrxName());
		FactLine lineCR = fact.createLine(docLine, accountCR, acctSchema.getC_Currency_ID(), interest);
		lineCR.save();

		MAccount accountDR = new MAccount(Env.getCtx(), shareRemittance.getbankgl_Acct(), get_TrxName());
		FactLine lineDR = fact.createLine(docLine, accountDR, acctSchema.getC_Currency_ID(), interest.negate());
		lineDR.save();

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Saving Interest." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineDR.setDescription("Saving Interest." + MemberNoDescription);
		lineCR.save();

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

	 BigDecimal totalCharge = Env.ZERO;

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

		// update contra -accounts , and other particulars
		lineDR.setcontra_account_id(lineCR.getAccount_ID());
		lineDR.setUserCode(user.getName());
		lineDR.setChequeNo(chequeNo);
		lineDR.setDescription("Charges." + MemberNoDescription);
		lineDR.save();

		lineCR.setcontra_account_id(lineDR.getAccount_ID());
		lineCR.setUserCode(user.getName());
		lineCR.setChequeNo(chequeNo);
		lineDR.setDescription("Charges." + MemberNoDescription);
		lineCR.save();
	}
}
