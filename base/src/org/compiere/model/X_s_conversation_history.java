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
import java.util.Properties;

/** Generated Model for s_conversation_history
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_conversation_history extends PO implements I_s_conversation_history, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190325L;

    /** Standard Constructor */
    public X_s_conversation_history (Properties ctx, int s_conversation_history_ID, String trxName)
    {
      super (ctx, s_conversation_history_ID, trxName);
      /** if (s_conversation_history_ID == 0)
        {
			sets_conversation_history_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_conversation_history (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_conversation_history[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set s_conversation_history ID.
		@param s_conversation_history_ID s_conversation_history ID	  */
	public void sets_conversation_history_ID (int s_conversation_history_ID)
	{
		if (s_conversation_history_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_conversation_history_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_conversation_history_ID, Integer.valueOf(s_conversation_history_ID));
	}

	/** Get s_conversation_history ID.
		@return s_conversation_history ID	  */
	public int gets_conversation_history_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_conversation_history_ID);
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

	public I_s_loantype gets_new_loantype() throws RuntimeException
    {
		return (I_s_loantype)MTable.get(getCtx(), I_s_loantype.Table_Name)
			.getPO(gets_new_loantype_ID(), get_TrxName());	}

	/** Set New Loan Type.
		@param s_new_loantype_ID New Loan Type	  */
	public void sets_new_loantype_ID (int s_new_loantype_ID)
	{
		if (s_new_loantype_ID < 1) 
			set_Value (COLUMNNAME_s_new_loantype_ID, null);
		else 
			set_Value (COLUMNNAME_s_new_loantype_ID, Integer.valueOf(s_new_loantype_ID));
	}

	/** Get New Loan Type.
		@return New Loan Type	  */
	public int gets_new_loantype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_new_loantype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_loantype gets_old_loantype() throws RuntimeException
    {
		return (I_s_loantype)MTable.get(getCtx(), I_s_loantype.Table_Name)
			.getPO(gets_old_loantype_ID(), get_TrxName());	}

	/** Set Old Loan Type.
		@param s_old_loantype_ID Old Loan Type	  */
	public void sets_old_loantype_ID (int s_old_loantype_ID)
	{
		if (s_old_loantype_ID < 1) 
			set_Value (COLUMNNAME_s_old_loantype_ID, null);
		else 
			set_Value (COLUMNNAME_s_old_loantype_ID, Integer.valueOf(s_old_loantype_ID));
	}

	/** Get Old Loan Type.
		@return Old Loan Type	  */
	public int gets_old_loantype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_old_loantype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}