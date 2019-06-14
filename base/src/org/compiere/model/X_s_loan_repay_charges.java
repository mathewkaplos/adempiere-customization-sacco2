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

/** Generated Model for s_loan_repay_charges
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loan_repay_charges extends PO implements I_s_loan_repay_charges, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190505L;

    /** Standard Constructor */
    public X_s_loan_repay_charges (Properties ctx, int s_loan_repay_charges_ID, String trxName)
    {
      super (ctx, s_loan_repay_charges_ID, trxName);
      /** if (s_loan_repay_charges_ID == 0)
        {
			sets_loan_repay_charges_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_loan_repay_charges (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loan_repay_charges[")
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

	/** Set l_repayments ID.
		@param l_repayments_ID l_repayments ID	  */
	public void setl_repayments_ID (int l_repayments_ID)
	{
		if (l_repayments_ID < 1) 
			set_Value (COLUMNNAME_l_repayments_ID, null);
		else 
			set_Value (COLUMNNAME_l_repayments_ID, Integer.valueOf(l_repayments_ID));
	}

	/** Get l_repayments ID.
		@return l_repayments ID	  */
	public int getl_repayments_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_l_repayments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_accountsetup gets_accountsetup() throws RuntimeException
    {
		return (I_s_accountsetup)MTable.get(getCtx(), I_s_accountsetup.Table_Name)
			.getPO(gets_accountsetup_ID(), get_TrxName());	}

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

	/** Set s_loan_repay_charges ID.
		@param s_loan_repay_charges_ID s_loan_repay_charges ID	  */
	public void sets_loan_repay_charges_ID (int s_loan_repay_charges_ID)
	{
		if (s_loan_repay_charges_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loan_repay_charges_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loan_repay_charges_ID, Integer.valueOf(s_loan_repay_charges_ID));
	}

	/** Get s_loan_repay_charges ID.
		@return s_loan_repay_charges ID	  */
	public int gets_loan_repay_charges_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loan_repay_charges_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}