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

/** Generated Model for s_period_remittance
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_period_remittance extends PO implements I_s_period_remittance, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190329L;

    /** Standard Constructor */
    public X_s_period_remittance (Properties ctx, int s_period_remittance_ID, String trxName)
    {
      super (ctx, s_period_remittance_ID, trxName);
      /** if (s_period_remittance_ID == 0)
        {
			sets_period_remittance_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_period_remittance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_period_remittance[")
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

	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1) 
			set_Value (COLUMNNAME_C_Period_ID, null);
		else 
			set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gross Amount.
		@param gross Gross Amount	  */
	public void setgross (BigDecimal gross)
	{
		set_Value (COLUMNNAME_gross, gross);
	}

	/** Get Gross Amount.
		@return Gross Amount	  */
	public BigDecimal getgross () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_gross);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest.
		@param Interest Interest	  */
	public void setInterest (BigDecimal Interest)
	{
		set_Value (COLUMNNAME_Interest, Interest);
	}

	/** Get Interest.
		@return Interest	  */
	public BigDecimal getInterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Interest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set s_period_remittance ID.
		@param s_period_remittance_ID s_period_remittance ID	  */
	public void sets_period_remittance_ID (int s_period_remittance_ID)
	{
		if (s_period_remittance_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_period_remittance_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_period_remittance_ID, Integer.valueOf(s_period_remittance_ID));
	}

	/** Get s_period_remittance ID.
		@return s_period_remittance ID	  */
	public int gets_period_remittance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_period_remittance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** TransactionType AD_Reference_ID=1000023 */
	public static final int TRANSACTIONTYPE_AD_Reference_ID=1000023;
	/** LOANS = LOANS */
	public static final String TRANSACTIONTYPE_LOANS = "LOANS";
	/** SHARES = SHARES */
	public static final String TRANSACTIONTYPE_SHARES = "SHARES";
	/** Set Transaction Type.
		@param TransactionType Transaction Type	  */
	public void setTransactionType (String TransactionType)
	{

		set_Value (COLUMNNAME_TransactionType, TransactionType);
	}

	/** Get Transaction Type.
		@return Transaction Type	  */
	public String getTransactionType () 
	{
		return (String)get_Value(COLUMNNAME_TransactionType);
	}
}