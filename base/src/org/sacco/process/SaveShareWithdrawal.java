package org.sacco.process;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import org.compiere.model.MemberShares;
import org.compiere.model.ShareRemittance;
import org.compiere.process.SvrProcess;

public class SaveShareWithdrawal extends SvrProcess {

	ShareRemittance shareRemittance = null;

	@Override
	protected void prepare() {
		shareRemittance = new ShareRemittance(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		BigDecimal receiptAmt = shareRemittance.getreceiptamount();
		MemberShares memberShares = new MemberShares(getCtx(), shareRemittance.gets_membershares_ID(), get_TrxName());
		memberShares.setsharestodate(memberShares.getsharestodate().subtract(receiptAmt));
		memberShares.save();
		shareRemittance.setIsComplete(true);
		shareRemittance.setreceiptamount(shareRemittance.getreceiptamount().negate());
		shareRemittance.save();
		JOptionPane.showMessageDialog(null, "Saved Successfully");
		return null;
	}

}
