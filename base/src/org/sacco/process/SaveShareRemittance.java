package org.sacco.process;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import org.compiere.model.MemberShares;
import org.compiere.model.ShareRemittance;
import org.compiere.process.SvrProcess;

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
		JOptionPane.showMessageDialog(null,"Saved Successfully");
		return null;
	}

}
