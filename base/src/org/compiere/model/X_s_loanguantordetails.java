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

/** Generated Model for s_loanguantordetails
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loanguantordetails extends PO implements I_s_loanguantordetails, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190316L;

    /** Standard Constructor */
    public X_s_loanguantordetails (Properties ctx, int s_loanguantordetails_ID, String trxName)
    {
      super (ctx, s_loanguantordetails_ID, trxName);
      /** if (s_loanguantordetails_ID == 0)
        {
			setamountguaranteed (Env.ZERO);
			setid (0);
			sets_loanguantordetails_ID (0);
			sets_loans_ID (0);
			sets_member_ID (0);
			sets_membershares_ID (0);
// 0
        } */
    }

    /** Load Constructor */
    public X_s_loanguantordetails (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loanguantordetails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount Guaranteed.
		@param amountguaranteed Amount Guaranteed	  */
	public void setamountguaranteed (BigDecimal amountguaranteed)
	{
		set_Value (COLUMNNAME_amountguaranteed, amountguaranteed);
	}

	/** Get Amount Guaranteed.
		@return Amount Guaranteed	  */
	public BigDecimal getamountguaranteed () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountguaranteed);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set id.
		@param id id	  */
	public void setid (int id)
	{
		set_Value (COLUMNNAME_id, Integer.valueOf(id));
	}

	/** Get id.
		@return id	  */
	public int getid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Member NO.
		@param member_no Member NO	  */
	public void setmember_no (String member_no)
	{
		set_Value (COLUMNNAME_member_no, member_no);
	}

	/** Get Member NO.
		@return Member NO	  */
	public String getmember_no () 
	{
		return (String)get_Value(COLUMNNAME_member_no);
	}

	/** Set Payroll #.
		@param mpayroll Payroll #	  */
	public void setmpayroll (String mpayroll)
	{
		set_Value (COLUMNNAME_mpayroll, mpayroll);
	}

	/** Get Payroll #.
		@return Payroll #	  */
	public String getmpayroll () 
	{
		return (String)get_Value(COLUMNNAME_mpayroll);
	}

	/** Set s_loanguantordetails ID.
		@param s_loanguantordetails_ID s_loanguantordetails ID	  */
	public void sets_loanguantordetails_ID (int s_loanguantordetails_ID)
	{
		if (s_loanguantordetails_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loanguantordetails_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loanguantordetails_ID, Integer.valueOf(s_loanguantordetails_ID));
	}

	/** Get s_loanguantordetails ID.
		@return s_loanguantordetails ID	  */
	public int gets_loanguantordetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loanguantordetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_loans gets_loans() throws RuntimeException
    {
		return (I_s_loans)MTable.get(getCtx(), I_s_loans.Table_Name)
			.getPO(gets_loans_ID(), get_TrxName());	}

	/** Set Loan Ref.
		@param s_loans_ID Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID)
	{
		if (s_loans_ID < 1) 
			set_Value (COLUMNNAME_s_loans_ID, null);
		else 
			set_Value (COLUMNNAME_s_loans_ID, Integer.valueOf(s_loans_ID));
	}

	/** Get Loan Ref.
		@return Loan Ref	  */
	public int gets_loans_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loans_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_ValueNoCheck (COLUMNNAME_s_member_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
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

	/** Set Member Shares.
		@param s_membershares_ID Member Shares	  */
	public void sets_membershares_ID (int s_membershares_ID)
	{
		if (s_membershares_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_membershares_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_membershares_ID, Integer.valueOf(s_membershares_ID));
	}

	/** Get Member Shares.
		@return Member Shares	  */
	public int gets_membershares_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_membershares_ID);
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