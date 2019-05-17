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
import java.sql.Timestamp;
import java.util.Properties;

/** Generated Model for s_account_activity_report
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_account_activity_report extends PO implements I_s_account_activity_report, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190517L;

    /** Standard Constructor */
    public X_s_account_activity_report (Properties ctx, int s_account_activity_report_ID, String trxName)
    {
      super (ctx, s_account_activity_report_ID, trxName);
      /** if (s_account_activity_report_ID == 0)
        {
			sets_account_activity_report_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_account_activity_report (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_account_activity_report[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Print.
		@param btn_print Print	  */
	public void setbtn_print (String btn_print)
	{
		set_Value (COLUMNNAME_btn_print, btn_print);
	}

	/** Get Print.
		@return Print	  */
	public String getbtn_print () 
	{
		return (String)get_Value(COLUMNNAME_btn_print);
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

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set s_account_activity_report ID.
		@param s_account_activity_report_ID s_account_activity_report ID	  */
	public void sets_account_activity_report_ID (int s_account_activity_report_ID)
	{
		if (s_account_activity_report_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_account_activity_report_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_account_activity_report_ID, Integer.valueOf(s_account_activity_report_ID));
	}

	/** Get s_account_activity_report ID.
		@return s_account_activity_report ID	  */
	public int gets_account_activity_report_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_account_activity_report_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Select for Single Date.
		@param select_date Select for Single Date	  */
	public void setselect_date (boolean select_date)
	{
		set_Value (COLUMNNAME_select_date, Boolean.valueOf(select_date));
	}

	/** Get Select for Single Date.
		@return Select for Single Date	  */
	public boolean isselect_date () 
	{
		Object oo = get_Value(COLUMNNAME_select_date);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Select Multiple Accounts.
		@param select_multiple Select Multiple Accounts	  */
	public void setselect_multiple (boolean select_multiple)
	{
		set_Value (COLUMNNAME_select_multiple, Boolean.valueOf(select_multiple));
	}

	/** Get Select Multiple Accounts.
		@return Select Multiple Accounts	  */
	public boolean isselect_multiple () 
	{
		Object oo = get_Value(COLUMNNAME_select_multiple);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Sql WHERE.
		@param WhereClause 
		Fully qualified SQL WHERE clause
	  */
	public void setWhereClause (String WhereClause)
	{
		set_Value (COLUMNNAME_WhereClause, WhereClause);
	}

	/** Get Sql WHERE.
		@return Fully qualified SQL WHERE clause
	  */
	public String getWhereClause () 
	{
		return (String)get_Value(COLUMNNAME_WhereClause);
	}
}