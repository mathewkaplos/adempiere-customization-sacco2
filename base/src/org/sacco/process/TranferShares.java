package org.sacco.process;

import org.compiere.model.MemberShares;
import org.compiere.model.ShareTranfer;
import org.compiere.process.SvrProcess;

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
		return null;
	}

	private void tranfer() {
		MemberShares tranferor_Account = new MemberShares(getCtx(), tansferor_Account_ID, get_TrxName());
		MemberShares recepient_Account = new MemberShares(getCtx(), recepient_Account_ID, get_TrxName());

		tranferor_Account.transfer(tranfer.getAmount().negate());
		recepient_Account.transfer(tranfer.getAmount());
	}

}
