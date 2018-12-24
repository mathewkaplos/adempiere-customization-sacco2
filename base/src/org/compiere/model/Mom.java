package org.compiere.model;

import java.util.Properties;

public class Mom extends X_c_mom  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4623788592290222767L;

	public Mom(Properties ctx, int c_mom_ID, String trxName) {
		super(ctx, c_mom_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		System.out.println("this is in the extended class before save");
		return true;
	}
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		System.out.println("this is in the extended class after save");
		return true;
	}

}
