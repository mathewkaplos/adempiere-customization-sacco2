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

/** Generated Model for s_loan_charges
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loan_charges extends PO implements I_s_loan_charges, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190505L;

    /** Standard Constructor */
    public X_s_loan_charges (Properties ctx, int s_loan_charges_ID, String trxName)
    {
      super (ctx, s_loan_charges_ID, trxName);
      /** if (s_loan_charges_ID == 0)
        {
			sets_loan_charges_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_loan_charges (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loan_charges[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Additional Amount.
		@param additionalamt Additional Amount	  */
	public void setadditionalamt (BigDecimal additionalamt)
	{
		set_Value (COLUMNNAME_additionalamt, additionalamt);
	}

	/** Get Additional Amount.
		@return Additional Amount	  */
	public BigDecimal getadditionalamt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_additionalamt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Change Amount.
		@param btn_change Change Amount	  */
	public void setbtn_change (String btn_change)
	{
		set_Value (COLUMNNAME_btn_change, btn_change);
	}

	/** Get Change Amount.
		@return Change Amount	  */
	public String getbtn_change () 
	{
		return (String)get_Value(COLUMNNAME_btn_change);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Other Charge.
		@param s_accountsetup_ID Other Charge	  */
	public void sets_accountsetup_ID (int s_accountsetup_ID)
	{
		if (s_accountsetup_ID < 1) 
			set_Value (COLUMNNAME_s_accountsetup_ID, null);
		else 
			set_Value (COLUMNNAME_s_accountsetup_ID, Integer.valueOf(s_accountsetup_ID));
	}

	/** Get Other Charge.
		@return Other Charge	  */
	public int gets_accountsetup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_accountsetup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_loan_charges ID.
		@param s_loan_charges_ID s_loan_charges ID	  */
	public void sets_loan_charges_ID (int s_loan_charges_ID)
	{
		if (s_loan_charges_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loan_charges_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loan_charges_ID, Integer.valueOf(s_loan_charges_ID));
	}

	/** Get s_loan_charges ID.
		@return s_loan_charges ID	  */
	public int gets_loan_charges_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loan_charges_ID);
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
}