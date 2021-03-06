package org.sacco.process;

import java.math.BigDecimal;

import org.compiere.apps.ADialog;
import org.compiere.model.MemberShares;
import org.compiere.model.Sacco;
import org.compiere.model.ShareRemittance;
import org.compiere.process.SvrProcess;

public class ReverseSavingsRemittance extends SvrProcess {

	int AD_Table_ID = 1000029;
	private ShareRemittance shareRemittance = null;

	@Override
	protected void prepare() {
		shareRemittance = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
	}
	
	//
	@Override
	protected String doIt() throws Exception {

		Sacco.deactivateTransactions(AD_Table_ID, shareRemittance.get_ID(), get_TrxName());
		BigDecimal receiptAmt = shareRemittance.getreceiptamount().abs();
		MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(), get_TrxName());
		memberShares.setsharestodate(memberShares.getsharestodate().subtract(receiptAmt));
		memberShares.setfreeshares(memberShares.getfreeshares().subtract(receiptAmt));
		memberShares.save();
		shareRemittance.setReversed(true);
		shareRemittance.save();
		ADialog.info(2, null, "Reversed Successfully...");
		return null;
	}

}
