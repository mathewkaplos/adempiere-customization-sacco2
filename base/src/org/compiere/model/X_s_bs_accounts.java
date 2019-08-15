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

/** Generated Model for s_bs_accounts
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_bs_accounts extends PO implements I_s_bs_accounts, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190814L;

    /** Standard Constructor */
    public X_s_bs_accounts (Properties ctx, int s_bs_accounts_ID, String trxName)
    {
      super (ctx, s_bs_accounts_ID, trxName);
      /** if (s_bs_accounts_ID == 0)
        {
			sets_bs_accounts_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_bs_accounts (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_bs_accounts[")
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

	/** Set s_balancesheet ID.
		@param s_balancesheet_ID s_balancesheet ID	  */
	public void sets_balancesheet_ID (int s_balancesheet_ID)
	{
		if (s_balancesheet_ID < 1) 
			set_Value (COLUMNNAME_s_balancesheet_ID, null);
		else 
			set_Value (COLUMNNAME_s_balancesheet_ID, Integer.valueOf(s_balancesheet_ID));
	}

	/** Get s_balancesheet ID.
		@return s_balancesheet ID	  */
	public int gets_balancesheet_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_balancesheet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_bs_accounts ID.
		@param s_bs_accounts_ID s_bs_accounts ID	  */
	public void sets_bs_accounts_ID (int s_bs_accounts_ID)
	{
		if (s_bs_accounts_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_bs_accounts_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_bs_accounts_ID, Integer.valueOf(s_bs_accounts_ID));
	}

	/** Get s_bs_accounts ID.
		@return s_bs_accounts ID	  */
	public int gets_bs_accounts_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_bs_accounts_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Balance Sheet Classification ID.
		@param s_bs_classification_ID Balance Sheet Classification ID	  */
	public void sets_bs_classification_ID (int s_bs_classification_ID)
	{
		if (s_bs_classification_ID < 1) 
			set_Value (COLUMNNAME_s_bs_classification_ID, null);
		else 
			set_Value (COLUMNNAME_s_bs_classification_ID, Integer.valueOf(s_bs_classification_ID));
	}

	/** Get Balance Sheet Classification ID.
		@return Balance Sheet Classification ID	  */
	public int gets_bs_classification_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_bs_classification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Balance Sheet Group ID.
		@param s_bs_group_ID Balance Sheet Group ID	  */
	public void sets_bs_group_ID (int s_bs_group_ID)
	{
		if (s_bs_group_ID < 1) 
			set_Value (COLUMNNAME_s_bs_group_ID, null);
		else 
			set_Value (COLUMNNAME_s_bs_group_ID, Integer.valueOf(s_bs_group_ID));
	}

	/** Get Balance Sheet Group ID.
		@return Balance Sheet Group ID	  */
	public int gets_bs_group_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_bs_group_ID);
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