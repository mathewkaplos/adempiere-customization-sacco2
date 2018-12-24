package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import mat.mathew.SendMailSSL;

public class SMember extends X_s_member {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SMember(Properties ctx, int s_member_ID, String trxName) {
		super(ctx, s_member_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public SMember(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean afterSave(boolean newRecord, boolean success) {
		if (newRecord) {
			String email = this.getEMail();
			if (email != null) {
				I_s_saccoinfo info = new X_s_saccoinfo(getCtx(), 1000000, get_TrxName());
				String saccoName = info.getsacconame();
				String subject = saccoName + " Registration";
				String message = "Dear " + this.getmfirstname() + ", \n\n" + " Thank you for registering at "
						+ info.getsacconame() + ".Welcome";
				SaccoMail sm = SaccoMail.get();

				SendMailSSL send = new SendMailSSL(sm.getsmtp_host(), sm.getsmtp_port(),
						sm.getsmtp_socketfactory_port(), sm.issmtp_auth(), sm.getEMail(), sm.getPassword(), email,
						subject, message);
				send.send();
			}
		}
		return super.afterSave(newRecord, success);
	}
}
