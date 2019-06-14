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

/** Generated Model for s_period_closing
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_period_closing extends PO implements I_s_period_closing, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190127L;

    /** Standard Constructor */
    public X_s_period_closing (Properties ctx, int s_period_closing_ID, String trxName)
    {
      super (ctx, s_period_closing_ID, trxName);
      /** if (s_period_closing_ID == 0)
        {
			sets_period_closing_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_period_closing (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_period_closing[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Close Period.
		@param btn_close_period Close Period	  */
	public void setbtn_close_period (String btn_close_period)
	{
		set_Value (COLUMNNAME_btn_close_period, btn_close_period);
	}

	/** Get Close Period.
		@return Close Period	  */
	public String getbtn_close_period () 
	{
		return (String)get_Value(COLUMNNAME_btn_close_period);
	}

	/** Set Closed.
		@param closed Closed	  */
	public void setclosed (boolean closed)
	{
		set_Value (COLUMNNAME_closed, Boolean.valueOf(closed));
	}

	/** Get Closed.
		@return Closed	  */
	public boolean isclosed () 
	{
		Object oo = get_Value(COLUMNNAME_closed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Closing Date.
		@param closing_date Closing Date	  */
	public void setclosing_date (Timestamp closing_date)
	{
		set_Value (COLUMNNAME_closing_date, closing_date);
	}

	/** Get Closing Date.
		@return Closing Date	  */
	public Timestamp getclosing_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_closing_date);
	}

	/** Set Closing Time.
		@param closing_time Closing Time	  */
	public void setclosing_time (Timestamp closing_time)
	{
		set_Value (COLUMNNAME_closing_time, closing_time);
	}

	/** Get Closing Time.
		@return Closing Time	  */
	public Timestamp getclosing_time () 
	{
		return (Timestamp)get_Value(COLUMNNAME_closing_time);
	}

	public org.compiere.model.I_AD_User getclosing_user() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getclosing_user_ID(), get_TrxName());	}

	/** Set Closed By.
		@param closing_user_ID Closed By	  */
	public void setclosing_user_ID (int closing_user_ID)
	{
		if (closing_user_ID < 1) 
			set_Value (COLUMNNAME_closing_user_ID, null);
		else 
			set_Value (COLUMNNAME_closing_user_ID, Integer.valueOf(closing_user_ID));
	}

	/** Get Closed By.
		@return Closed By	  */
	public int getclosing_user_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_closing_user_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Period getcurrent_period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getcurrent_period_ID(), get_TrxName());	}

	/** Set Current Period.
		@param current_period_ID Current Period	  */
	public void setcurrent_period_ID (int current_period_ID)
	{
		if (current_period_ID < 1) 
			set_Value (COLUMNNAME_current_period_ID, null);
		else 
			set_Value (COLUMNNAME_current_period_ID, Integer.valueOf(current_period_ID));
	}

	/** Get Current Period.
		@return Current Period	  */
	public int getcurrent_period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_current_period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set disp001.
		@param disp001 disp001	  */
	public void setdisp001 (boolean disp001)
	{
		set_Value (COLUMNNAME_disp001, Boolean.valueOf(disp001));
	}

	/** Get disp001.
		@return disp001	  */
	public boolean isdisp001 () 
	{
		Object oo = get_Value(COLUMNNAME_disp001);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_C_Period getnext_period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getnext_period_ID(), get_TrxName());	}

	/** Set Next Period.
		@param next_period_ID Next Period	  */
	public void setnext_period_ID (int next_period_ID)
	{
		if (next_period_ID < 1) 
			set_Value (COLUMNNAME_next_period_ID, null);
		else 
			set_Value (COLUMNNAME_next_period_ID, Integer.valueOf(next_period_ID));
	}

	/** Get Next Period.
		@return Next Period	  */
	public int getnext_period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_next_period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_period_closing ID.
		@param s_period_closing_ID s_period_closing ID	  */
	public void sets_period_closing_ID (int s_period_closing_ID)
	{
		if (s_period_closing_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_period_closing_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_period_closing_ID, Integer.valueOf(s_period_closing_ID));
	}

	/** Get s_period_closing ID.
		@return s_period_closing ID	  */
	public int gets_period_closing_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_period_closing_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}