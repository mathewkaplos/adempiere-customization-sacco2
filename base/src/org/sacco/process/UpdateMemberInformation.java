package org.sacco.process;

import org.compiere.model.Change_request;
import org.compiere.model.SMember;
import org.compiere.process.SvrProcess;

public class UpdateMemberInformation extends SvrProcess {
	private Change_request request = null;

	@Override
	protected void prepare() {
		request = new Change_request(getCtx(), getRecord_ID(), get_TrxName());
	}

	@Override
	protected String doIt() throws Exception {
		SMember member = new SMember(getCtx(), request.gets_member_ID(), get_TrxName());
		member.setmfirstname(request.getmfirstname());
		member.setmothername(request.getmothername());
		member.setmsurname(request.getmsurname());
		member.setmtel1(request.getmtel1());
		member.setaddress(request.getaddress());
		member.setbankaccno(request.getbankaccno());
		member.save();
		request.setis_updated(true);
		request.save();
		return null;
	}

}
