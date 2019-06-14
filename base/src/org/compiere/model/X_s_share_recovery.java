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

/** Generated Model for s_share_recovery
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_share_recovery extends PO implements I_s_share_recovery, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190409L;

    /** Standard Constructor */
    public X_s_share_recovery (Properties ctx, int s_share_recovery_ID, String trxName)
    {
      super (ctx, s_share_recovery_ID, trxName);
      /** if (s_share_recovery_ID == 0)
        {
			setAmount (Env.ZERO);
			sets_member_ID (0);
			sets_membershares_ID (0);
			sets_share_recovery_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_share_recovery (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_share_recovery[")
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

	public I_s_membershares gets_membershares() throws RuntimeException
    {
		return (I_s_membershares)MTable.get(getCtx(), I_s_membershares.Table_Name)
			.getPO(gets_membershares_ID(), get_TrxName());	}

	/** Set Member Shares.
		@param s_membershares_ID Member Shares	  */
	public void sets_membershares_ID (int s_membershares_ID)
	{
		if (s_membershares_ID < 1) 
			set_Value (COLUMNNAME_s_membershares_ID, null);
		else 
			set_Value (COLUMNNAME_s_membershares_ID, Integer.valueOf(s_membershares_ID));
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

	/** Set s_share_recovery ID.
		@param s_share_recovery_ID s_share_recovery ID	  */
	public void sets_share_recovery_ID (int s_share_recovery_ID)
	{
		if (s_share_recovery_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_share_recovery_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_share_recovery_ID, Integer.valueOf(s_share_recovery_ID));
	}

	/** Get s_share_recovery ID.
		@return s_share_recovery ID	  */
	public int gets_share_recovery_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_share_recovery_ID);
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