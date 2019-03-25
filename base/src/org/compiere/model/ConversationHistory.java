package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class ConversationHistory extends X_s_conversation_history {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConversationHistory(Properties ctx, int s_conversation_history_ID, String trxName) {
		super(ctx, s_conversation_history_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public ConversationHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}


}
