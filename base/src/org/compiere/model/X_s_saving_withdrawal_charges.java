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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_saving_withdrawal_charges
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_saving_withdrawal_charges extends PO implements I_s_saving_withdrawal_charges, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190506L;

    /** Standard Constructor */
    public X_s_saving_withdrawal_charges (Properties ctx, int s_saving_withdrawal_charges_ID, String trxName)
    {
      super (ctx, s_saving_withdrawal_charges_ID, trxName);
      /** if (s_saving_withdrawal_charges_ID == 0)
        {
			sets_saving_withdrawal_charges_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_saving_withdrawal_charges (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_s_saving_withdrawal_charges[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public I_s_accountsetup gets_accountsetup() throws RuntimeException
    {
		return (I_s_accountsetup)MTable.get(getCtx(), I_s_accountsetup.Table_Name)
			.getPO(gets_accountsetup_ID(), get_TrxName());	}

	/** Set Other Charge.
		@param s_accountsetup_ID Other Charge	  */
	public void sets_accountsetup_ID (int s_accountsetup_ID)
	{
		if (s_accountsetup_ID < 1) 
			set_Value (COLUMNNAME_s_accountsetup_ID, null);
		else 
			set_Value (COLUMNNAME_s_accountsetup_ID, Integer.valueOf(s_accountsetup_ID));
	}

	/** Get Other Charge.
		@return Other Charge	  */
	public int gets_accountsetup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_accountsetup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_saving_withdrawal_charges ID.
		@param s_saving_withdrawal_charges_ID s_saving_withdrawal_charges ID	  */
	public void sets_saving_withdrawal_charges_ID (int s_saving_withdrawal_charges_ID)
	{
		if (s_saving_withdrawal_charges_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_saving_withdrawal_charges_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_saving_withdrawal_charges_ID, Integer.valueOf(s_saving_withdrawal_charges_ID));
	}

	/** Get s_saving_withdrawal_charges ID.
		@return s_saving_withdrawal_charges ID	  */
	public int gets_saving_withdrawal_charges_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_saving_withdrawal_charges_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_shareremittance ID.
		@param s_shareremittance_ID s_shareremittance ID	  */
	public void sets_shareremittance_ID (int s_shareremittance_ID)
	{
		if (s_shareremittance_ID < 1) 
			set_Value (COLUMNNAME_s_shareremittance_ID, null);
		else 
			set_Value (COLUMNNAME_s_shareremittance_ID, Integer.valueOf(s_shareremittance_ID));
	}

	/** Get s_shareremittance ID.
		@return s_shareremittance ID	  */
	public int gets_shareremittance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shareremittance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}