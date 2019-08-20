/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for s_income_accounts
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_income_accounts extends PO implements I_s_income_accounts, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190820L;

    /** Standard Constructor */
    public X_s_income_accounts (Properties ctx, int s_income_accounts_ID, String trxName)
    {
      super (ctx, s_income_accounts_ID, trxName);
      /** if (s_income_accounts_ID == 0)
        {
			sets_income_accounts_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_income_accounts (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_income_accounts[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_ElementValue getC_ElementValue() throws RuntimeException
    {
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
			.getPO(getC_ElementValue_ID(), get_TrxName());	}

	/** Set Account.
		@param C_ElementValue_ID 
		Account Element
	  */
	public void setC_ElementValue_ID (int C_ElementValue_ID)
	{
		if (C_ElementValue_ID < 1) 
			set_Value (COLUMNNAME_C_ElementValue_ID, null);
		else 
			set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
	}

	/** Get Account.
		@return Account Element
	  */
	public int getC_ElementValue_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set s_income_accounts ID.
		@param s_income_accounts_ID s_income_accounts ID	  */
	public void sets_income_accounts_ID (int s_income_accounts_ID)
	{
		if (s_income_accounts_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_income_accounts_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_income_accounts_ID, Integer.valueOf(s_income_accounts_ID));
	}

	/** Get s_income_accounts ID.
		@return s_income_accounts ID	  */
	public int gets_income_accounts_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_income_accounts_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_income ID.
		@param s_income_ID s_income ID	  */
	public void sets_income_ID (int s_income_ID)
	{
		if (s_income_ID < 1) 
			set_Value (COLUMNNAME_s_income_ID, null);
		else 
			set_Value (COLUMNNAME_s_income_ID, Integer.valueOf(s_income_ID));
	}

	/** Get s_income ID.
		@return s_income ID	  */
	public int gets_income_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_income_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set uuid.
		@param uuid uuid	  */
	public void setuuid (String uuid)
	{
		set_Value (COLUMNNAME_uuid, uuid);
	}

	/** Get uuid.
		@return uuid	  */
	public String getuuid () 
	{
		return (String)get_Value(COLUMNNAME_uuid);
	}
}