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

/** Generated Model for s_payroll_compare_csv
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_payroll_compare_csv extends PO implements I_s_payroll_compare_csv, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190125L;

    /** Standard Constructor */
    public X_s_payroll_compare_csv (Properties ctx, int s_payroll_compare_csv_ID, String trxName)
    {
      super (ctx, s_payroll_compare_csv_ID, trxName);
      /** if (s_payroll_compare_csv_ID == 0)
        {
			sets_payroll_compare_csv_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_payroll_compare_csv (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_payroll_compare_csv[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Import Amount.
		@param import_amount Import Amount	  */
	public void setimport_amount (BigDecimal import_amount)
	{
		set_Value (COLUMNNAME_import_amount, import_amount);
	}

	/** Get Import Amount.
		@return Import Amount	  */
	public BigDecimal getimport_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_import_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set List Amount.
		@param list_amount List Amount	  */
	public void setlist_amount (BigDecimal list_amount)
	{
		set_Value (COLUMNNAME_list_amount, list_amount);
	}

	/** Get List Amount.
		@return List Amount	  */
	public BigDecimal getlist_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_list_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Payroll NO.
		@param payroll_no Payroll NO	  */
	public void setpayroll_no (String payroll_no)
	{
		set_Value (COLUMNNAME_payroll_no, payroll_no);
	}

	/** Get Payroll NO.
		@return Payroll NO	  */
	public String getpayroll_no () 
	{
		return (String)get_Value(COLUMNNAME_payroll_no);
	}

	/** Set Reference.
		@param Reference 
		Reference for this record
	  */
	public void setReference (String Reference)
	{
		set_Value (COLUMNNAME_Reference, Reference);
	}

	/** Get Reference.
		@return Reference for this record
	  */
	public String getReference () 
	{
		return (String)get_Value(COLUMNNAME_Reference);
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

	/** Set s_payrol_interface ID.
		@param s_payrol_interface_ID s_payrol_interface ID	  */
	public void sets_payrol_interface_ID (int s_payrol_interface_ID)
	{
		if (s_payrol_interface_ID < 1) 
			set_Value (COLUMNNAME_s_payrol_interface_ID, null);
		else 
			set_Value (COLUMNNAME_s_payrol_interface_ID, Integer.valueOf(s_payrol_interface_ID));
	}

	/** Get s_payrol_interface ID.
		@return s_payrol_interface ID	  */
	public int gets_payrol_interface_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payrol_interface_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_payroll_compare_csv ID.
		@param s_payroll_compare_csv_ID s_payroll_compare_csv ID	  */
	public void sets_payroll_compare_csv_ID (int s_payroll_compare_csv_ID)
	{
		if (s_payroll_compare_csv_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_payroll_compare_csv_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_payroll_compare_csv_ID, Integer.valueOf(s_payroll_compare_csv_ID));
	}

	/** Get s_payroll_compare_csv ID.
		@return s_payroll_compare_csv ID	  */
	public int gets_payroll_compare_csv_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payroll_compare_csv_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set Variance Amount.
		@param variance_amount Variance Amount	  */
	public void setvariance_amount (BigDecimal variance_amount)
	{
		set_Value (COLUMNNAME_variance_amount, variance_amount);
	}

	/** Get Variance Amount.
		@return Variance Amount	  */
	public BigDecimal getvariance_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_variance_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}