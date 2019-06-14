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

/** Generated Model for s_receipt_print
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_receipt_print extends PO implements I_s_receipt_print, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190322L;

    /** Standard Constructor */
    public X_s_receipt_print (Properties ctx, int s_receipt_print_ID, String trxName)
    {
      super (ctx, s_receipt_print_ID, trxName);
      /** if (s_receipt_print_ID == 0)
        {
			sete_date (new Timestamp( System.currentTimeMillis() ));
			sets_date (new Timestamp( System.currentTimeMillis() ));
			sets_member_ID (0);
			sets_receipt_print_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_receipt_print (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_receipt_print[")
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

	/** Set Select All.
		@param btn_select_all Select All	  */
	public void setbtn_select_all (String btn_select_all)
	{
		set_Value (COLUMNNAME_btn_select_all, btn_select_all);
	}

	/** Get Select All.
		@return Select All	  */
	public String getbtn_select_all () 
	{
		return (String)get_Value(COLUMNNAME_btn_select_all);
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

	/** Set End Date.
		@param e_date End Date	  */
	public void sete_date (Timestamp e_date)
	{
		set_Value (COLUMNNAME_e_date, e_date);
	}

	/** Get End Date.
		@return End Date	  */
	public Timestamp gete_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_e_date);
	}

	/** Set Start Date.
		@param s_date Start Date	  */
	public void sets_date (Timestamp s_date)
	{
		set_Value (COLUMNNAME_s_date, s_date);
	}

	/** Get Start Date.
		@return Start Date	  */
	public Timestamp gets_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_s_date);
	}

	public I_s_member gets_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_ID(), get_TrxName());	}

	/** Set Member.
		@param s_member_ID Member	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_Value (COLUMNNAME_s_member_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
	}

	/** Get Member.
		@return Member	  */
	public int gets_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_receipt_print ID.
		@param s_receipt_print_ID s_receipt_print ID	  */
	public void sets_receipt_print_ID (int s_receipt_print_ID)
	{
		if (s_receipt_print_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_receipt_print_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_receipt_print_ID, Integer.valueOf(s_receipt_print_ID));
	}

	/** Get s_receipt_print ID.
		@return s_receipt_print ID	  */
	public int gets_receipt_print_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_receipt_print_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}