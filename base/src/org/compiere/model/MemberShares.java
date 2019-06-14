package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.util.Env;

import zenith.util.DateUtil;

public class MemberShares extends X_s_membershares {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1079762948247596210L;

	public MemberShares(Properties ctx, int s_membershares_ID, String trxName) {
		super(ctx, s_membershares_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MemberShares(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public void newRemmittance(BigDecimal appliedamount, boolean is_withdrawal,String remittanceremarks) {
		SMember member = new SMember(getCtx(), gets_member_ID(), get_TrxName());
		ShareType shareType = new ShareType(getCtx(), gets_sharetype_ID(), get_TrxName());

		ShareRemittance shareRemittance = new ShareRemittance(getCtx(), 0, get_TrxName());
		shareRemittance.setmcode(member.getDocumentNo());
		shareRemittance.setpayroll_no(member.getmpayroll());
		shareRemittance.sets_member_ID(member.get_ID());
		shareRemittance.setpaymode("9");
		shareRemittance.sets_payment_mode_remittance_ID(9);
		shareRemittance.setremittancedate(DateUtil.newTimestamp());
		shareRemittance.sets_membershares_ID(gets_membershares_ID());
		shareRemittance.sets_sharetype_ID(gets_sharetype_ID());
		shareRemittance.setsharegl_Acct(shareType.getsharegl_Acct());
		shareRemittance.setreceiptamount(appliedamount);
		shareRemittance.setIsComplete(true);
		shareRemittance.setothercharges(Env.ZERO);
		shareRemittance.setShareBalance(getsharestodate().add(appliedamount));
		shareRemittance.setis_withdrawal(is_withdrawal);
		shareRemittance.setremittanceremarks(remittanceremarks);
		shareRemittance.save();

		setsharestodate(getsharestodate().add(appliedamount));
		setfreeshares(getfreeshares().add(appliedamount));
		save();

	}
 
	public void transfer(BigDecimal amount) {
		setsharestodate(getsharestodate().add(amount));
		setfreeshares(getfreeshares().add(amount));
		save();
	}

	public BigDecimal getInterestToday() {
		Timestamp depositDate = getlast_deposit_date();
		Timestamp WithdrawalDate = DateUtil.newTimestamp();
		int months = (int) Sacco.calculateAgeInMonths(depositDate, WithdrawalDate);
		int freq = gets_sharetype().getintfrequency();
		int freqMonths = Sacco.getFrequencyMonths(months, freq);

		double rate = gets_sharetype().getintrate().doubleValue() / 100;
		double interest = rate * freqMonths * getsharestodate().doubleValue();
		return BigDecimal.valueOf(interest);

	}

}
