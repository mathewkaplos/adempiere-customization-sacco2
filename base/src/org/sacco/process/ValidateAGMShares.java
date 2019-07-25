package org.sacco.process;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import org.compiere.model.AD_User;
import org.compiere.model.AgmInvitation;
import org.compiere.model.AgmValidation;
import org.compiere.model.Sacco;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;

public class ValidateAGMShares extends SvrProcess {

	AgmValidation agm = null;

	@Override
	protected void prepare() {
		agm = new AgmValidation(getCtx(), getRecord_ID(), get_TrxName());

	}

	// org.sacco.process.ValidateAGMShares
	@Override
	protected String doIt() throws Exception {
		// create record for invitation

		int s_member_ID = agm.gets_member_ID();
		Sacco sacco = Sacco.getSaccco();

		boolean use_sum_of_saving = sacco.isusesum();
		BigDecimal agm_shares = sacco.getagmshares();
		int shareId = sacco.getagm_sharetype_ID();

		String whereClause = "";
		if (use_sum_of_saving) {
			whereClause = "";
		} else {
			whereClause = " AND s_sharetype_ID=" + shareId;
		}
		BigDecimal memberValidShares = sacco.getAGMShares(s_member_ID, whereClause);
		// mTab.setValue("Amt", agm_shares);
		agm.setAmt(agm_shares);
		// mTab.setValue("validShares", memberValidShares);
		agm.setvalidShares(memberValidShares);

		// mTab.setValue("s_sharetype_ID", shareId);
		agm.sets_sharetype_ID(shareId);

		AgmInvitation invitation = sacco.AGMValidated(s_member_ID);
		if (invitation != null) {
			agm.setvalidated(true);
			agm.setAttendanceno(invitation.getDocumentNo());
			agm.setvalidated_on(invitation.getCreated());
			agm.setUserName(invitation.getUserName());
			agm.sets_AgmInvitation_ID(invitation.gets_AgmInvitation_ID());
			agm.save();
			JOptionPane.showMessageDialog(null, "This Member is already registered for the AGM");
		} else if (valid()) {
			createInvationCard();
		}
		return null;
	}

	private void createInvationCard() {
		AgmInvitation invitation = new AgmInvitation(getCtx(), 0, get_TrxName());
		invitation.sets_AgmValidation_ID(agm.gets_AgmValidation_ID());
		invitation.sets_member_ID(agm.gets_member_ID());
		invitation.setAgmDate(agm.getAgmDate());
		invitation.setvalidated(true);
		AD_User user = new AD_User(getCtx(), Env.getAD_User_ID(getCtx()), get_TrxName());
		invitation.setUserName(user.getName());

		invitation.save();

		agm.setAttendanceno(invitation.getDocumentNo());
		agm.setvalidated(true);
		agm.setvalidated_on(invitation.getCreated());
		agm.setUserName(user.getName());
		agm.sets_AgmInvitation_ID(invitation.gets_AgmInvitation_ID());
		agm.save();
	}

	private boolean valid() {
		if (agm.getvalidShares().compareTo(agm.getAmt()) == -1) {
			JOptionPane.showMessageDialog(null, "Member not validated!!!");
			return false;
		}
		return true;
	}

}
