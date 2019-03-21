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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_share_tranfer
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_share_tranfer extends PO implements I_s_share_tranfer, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190321L;

    /** Standard Constructor */
    public X_s_share_tranfer (Properties ctx, int s_share_tranfer_ID, String trxName)
    {
      super (ctx, s_share_tranfer_ID, trxName);
      /** if (s_share_tranfer_ID == 0)
        {
			setIsComplete (false);
// N
			sets_share_tranfer_ID (0);
			settransactiondate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Load Constructor */
    public X_s_share_tranfer (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_share_tranfer[")
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

	/** Set Tranfer.
		@param btn_tranfer Tranfer	  */
	public void setbtn_tranfer (String btn_tranfer)
	{
		set_Value (COLUMNNAME_btn_tranfer, btn_tranfer);
	}

	/** Get Tranfer.
		@return Tranfer	  */
	public String getbtn_tranfer () 
	{
		return (String)get_Value(COLUMNNAME_btn_tranfer);
	}

	/** Set Complete.
		@param IsComplete 
		It is complete
	  */
	public void setIsComplete (boolean IsComplete)
	{
		set_Value (COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
	}

	/** Get Complete.
		@return It is complete
	  */
	public boolean isComplete () 
	{
		Object oo = get_Value(COLUMNNAME_IsComplete);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_s_member gets_member_receiver() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_receiver_ID(), get_TrxName());	}

	/** Set Recepient.
		@param s_member_receiver_ID Recepient	  */
	public void sets_member_receiver_ID (int s_member_receiver_ID)
	{
		if (s_member_receiver_ID < 1) 
			set_Value (COLUMNNAME_s_member_receiver_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_receiver_ID, Integer.valueOf(s_member_receiver_ID));
	}

	/** Get Recepient.
		@return Recepient	  */
	public int gets_member_receiver_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_receiver_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_member gets_member_sender() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_sender_ID(), get_TrxName());	}

	/** Set Transferor.
		@param s_member_sender_ID Transferor	  */
	public void sets_member_sender_ID (int s_member_sender_ID)
	{
		if (s_member_sender_ID < 1) 
			set_Value (COLUMNNAME_s_member_sender_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_sender_ID, Integer.valueOf(s_member_sender_ID));
	}

	/** Get Transferor.
		@return Transferor	  */
	public int gets_member_sender_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_sender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_membershares gets_membershares_receiver() throws RuntimeException
    {
		return (I_s_membershares)MTable.get(getCtx(), I_s_membershares.Table_Name)
			.getPO(gets_membershares_receiver_ID(), get_TrxName());	}

	/** Set Recepient Account.
		@param s_membershares_receiver_ID Recepient Account	  */
	public void sets_membershares_receiver_ID (int s_membershares_receiver_ID)
	{
		if (s_membershares_receiver_ID < 1) 
			set_Value (COLUMNNAME_s_membershares_receiver_ID, null);
		else 
			set_Value (COLUMNNAME_s_membershares_receiver_ID, Integer.valueOf(s_membershares_receiver_ID));
	}

	/** Get Recepient Account.
		@return Recepient Account	  */
	public int gets_membershares_receiver_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_membershares_receiver_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_membershares gets_membershares_sender() throws RuntimeException
    {
		return (I_s_membershares)MTable.get(getCtx(), I_s_membershares.Table_Name)
			.getPO(gets_membershares_sender_ID(), get_TrxName());	}

	/** Set Transferor Account.
		@param s_membershares_sender_ID Transferor Account	  */
	public void sets_membershares_sender_ID (int s_membershares_sender_ID)
	{
		if (s_membershares_sender_ID < 1) 
			set_Value (COLUMNNAME_s_membershares_sender_ID, null);
		else 
			set_Value (COLUMNNAME_s_membershares_sender_ID, Integer.valueOf(s_membershares_sender_ID));
	}

	/** Get Transferor Account.
		@return Transferor Account	  */
	public int gets_membershares_sender_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_membershares_sender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_share_tranfer ID.
		@param s_share_tranfer_ID s_share_tranfer ID	  */
	public void sets_share_tranfer_ID (int s_share_tranfer_ID)
	{
		if (s_share_tranfer_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_share_tranfer_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_share_tranfer_ID, Integer.valueOf(s_share_tranfer_ID));
	}

	/** Get s_share_tranfer ID.
		@return s_share_tranfer ID	  */
	public int gets_share_tranfer_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_share_tranfer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype_receiver() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_receiver_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_receiver_ID Share Type	  */
	public void sets_sharetype_receiver_ID (int s_sharetype_receiver_ID)
	{
		if (s_sharetype_receiver_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_receiver_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_receiver_ID, Integer.valueOf(s_sharetype_receiver_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_receiver_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_receiver_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype_sender() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_sender_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_sender_ID Share Type	  */
	public void sets_sharetype_sender_ID (int s_sharetype_sender_ID)
	{
		if (s_sharetype_sender_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_sender_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_sender_ID, Integer.valueOf(s_sharetype_sender_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_sender_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_sender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Date.
		@param transactiondate Transaction Date	  */
	public void settransactiondate (Timestamp transactiondate)
	{
		set_Value (COLUMNNAME_transactiondate, transactiondate);
	}

	/** Get Transaction Date.
		@return Transaction Date	  */
	public Timestamp gettransactiondate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_transactiondate);
	}
}