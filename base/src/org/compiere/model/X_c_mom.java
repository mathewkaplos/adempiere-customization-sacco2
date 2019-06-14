/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/**
 * Generated Model for c_mom
 * 
 * @author Adempiere (generated)
 * @version Release 3.8.0 - $Id$
 */
public class X_c_mom extends PO implements I_c_mom, I_Persistent {

	/**
	 *
	 */
	private static final long serialVersionUID = 20181219L;

	/** Standard Constructor */
	public X_c_mom(Properties ctx, int c_mom_ID, String trxName) {
		super(ctx, c_mom_ID, trxName);
		/**
		 * if (c_mom_ID == 0) { setc_mom_ID (0); setend_time (new Timestamp(
		 * System.currentTimeMillis() )); setName (null); setstart_date (new
		 * Timestamp( System.currentTimeMillis() )); setstart_time (new
		 * Timestamp( System.currentTimeMillis() )); setValue (null); }
		 */
	}

	/** Load Constructor */
	public X_c_mom(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * AccessLevel
	 * 
	 * @return 7 - System - Client - Org
	 */
	protected int get_AccessLevel() {
		return accessLevel.intValue();
	}

	/** Load Meta Data */
	protected POInfo initPO(Properties ctx) {
		POInfo poi = POInfo.getPOInfo(ctx, Table_ID, get_TrxName());
		return poi;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("X_c_mom[").append(get_ID()).append("]");
		return sb.toString();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException {
		return (org.compiere.model.I_AD_User) MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
				.getPO(getAD_User_ID(), get_TrxName());
	}

	/**
	 * Set User/Contact.
	 * 
	 * @param AD_User_ID
	 *            User within the system - Internal or Business Partner Contact
	 */
	public void setAD_User_ID(int AD_User_ID) {
		if (AD_User_ID < 1)
			set_Value(COLUMNNAME_AD_User_ID, null);
		else
			set_Value(COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/**
	 * Get User/Contact.
	 * 
	 * @return User within the system - Internal or Business Partner Contact
	 */
	public int getAD_User_ID() {
		Integer ii = (Integer) get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/**
	 * Set agenda.
	 * 
	 * @param agenda
	 *            agenda
	 */
	public void setagenda(String agenda) {
		set_Value(COLUMNNAME_agenda, agenda);
	}

	/**
	 * Get agenda.
	 * 
	 * @return agenda
	 */
	public String getagenda() {
		return (String) get_Value(COLUMNNAME_agenda);
	}

	/**
	 * Set c_mom ID.
	 * 
	 * @param c_mom_ID
	 *            c_mom ID
	 */
	public void setc_mom_ID(int c_mom_ID) {
		if (c_mom_ID < 1)
			set_ValueNoCheck(COLUMNNAME_c_mom_ID, null);
		else
			set_ValueNoCheck(COLUMNNAME_c_mom_ID, Integer.valueOf(c_mom_ID));
	}

	/**
	 * Get c_mom ID.
	 * 
	 * @return c_mom ID
	 */
	public int getc_mom_ID() {
		Integer ii = (Integer) get_Value(COLUMNNAME_c_mom_ID);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/**
	 * Set end_time.
	 * 
	 * @param end_time
	 *            end_time
	 */
	public void setend_time(Timestamp end_time) {
		set_Value(COLUMNNAME_end_time, end_time);
	}

	/**
	 * Get end_time.
	 * 
	 * @return end_time
	 */
	public Timestamp getend_time() {
		return (Timestamp) get_Value(COLUMNNAME_end_time);
	}

	/**
	 * Set Name.
	 * 
	 * @param Name
	 *            Alphanumeric identifier of the entity
	 */
	public void setName(String Name) {
		set_Value(COLUMNNAME_Name, Name);
	}

	/**
	 * Get Name.
	 * 
	 * @return Alphanumeric identifier of the entity
	 */
	public String getName() {
		return (String) get_Value(COLUMNNAME_Name);
	}

	/**
	 * Get Record ID/ColumnName
	 * 
	 * @return ID/ColumnName pair
	 */
	public KeyNamePair getKeyNamePair() {
		return new KeyNamePair(get_ID(), getName());
	}

	/**
	 * Set start_date.
	 * 
	 * @param start_date
	 *            start_date
	 */
	public void setstart_date(Timestamp start_date) {
		set_Value(COLUMNNAME_start_date, start_date);
	}

	/**
	 * Get start_date.
	 * 
	 * @return start_date
	 */
	public Timestamp getstart_date() {
		return (Timestamp) get_Value(COLUMNNAME_start_date);
	}

	/**
	 * Set start_time.
	 * 
	 * @param start_time
	 *            start_time
	 */
	public void setstart_time(Timestamp start_time) {
		set_Value(COLUMNNAME_start_time, start_time);
	}

	/**
	 * Get start_time.
	 * 
	 * @return start_time
	 */
	public Timestamp getstart_time() {
		return (Timestamp) get_Value(COLUMNNAME_start_time);
	}

	/**
	 * Set Search Key.
	 * 
	 * @param Value
	 *            Search key for the record in the format required - must be
	 *            unique
	 */
	public void setValue(String Value) {
		set_Value(COLUMNNAME_Value, Value);
	}

	/**
	 * Get Search Key.
	 * 
	 * @return Search key for the record in the format required - must be unique
	 */
	public String getValue() {
		return (String) get_Value(COLUMNNAME_Value);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		System.out.println("this is in the extended class before save");
		return true;
	}
}