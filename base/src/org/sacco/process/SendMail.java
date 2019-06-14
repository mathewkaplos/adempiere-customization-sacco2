package org.sacco.process;

import org.compiere.model.SaccoMail;
import org.compiere.process.SvrProcess;

import mat.mathew.SendMailSSL;

public class SendMail extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	public String mailTo = "mathew3597@gmail.com";
	public String subject = "Loan Application";
	public String message = "Dear Sacco Member, your loan application has been received. "
			+ " Thank you.";

	@Override
	protected String doIt() throws Exception {
		SaccoMail sm = SaccoMail.get();

		SendMailSSL send = new SendMailSSL(sm.getsmtp_host(), sm.getsmtp_port(), sm.getsmtp_socketfactory_port(),
				sm.issmtp_auth(), sm.getEMail(), sm.getPassword(), mailTo, subject, message);
		send.send();
		return null;
	}

}
