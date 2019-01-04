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

/** Generated Model for s_monthlyloansadjustments
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_monthlyloansadjustments extends PO implements I_s_monthlyloansadjustments, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190103L;

    /** Standard Constructor */
    public X_s_monthlyloansadjustments (Properties ctx, int s_monthlyloansadjustments_ID, String trxName)
    {
      super (ctx, s_monthlyloansadjustments_ID, trxName);
      /** if (s_monthlyloansadjustments_ID == 0)
        {
			setloaneffectdate (new Timestamp( System.currentTimeMillis() ));
// @Date@
			sets_monthlyloansadjustments_ID (0);
			settransactiondate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Load Constructor */
    public X_s_monthlyloansadjustments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_monthlyloansadjustments[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Save.
		@param btn_save Save	  */
	public void setbtn_save (String btn_save)
	{
		set_Value (COLUMNNAME_btn_save, btn_save);
	}

	/** Get Save.
		@return Save	  */
	public String getbtn_save () 
	{
		return (String)get_Value(COLUMNNAME_btn_save);
	}

	/** Set Closing Balance.
		@param closingbalance Closing Balance	  */
	public void setclosingbalance (BigDecimal closingbalance)
	{
		set_Value (COLUMNNAME_closingbalance, closingbalance);
	}

	/** Get Closing Balance.
		@return Closing Balance	  */
	public BigDecimal getclosingbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_closingbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Constant Amount.
		@param ConstantAmount Constant Amount	  */
	public void setConstantAmount (BigDecimal ConstantAmount)
	{
		set_Value (COLUMNNAME_ConstantAmount, ConstantAmount);
	}

	/** Get Constant Amount.
		@return Constant Amount	  */
	public BigDecimal getConstantAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConstantAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Expected Amount.
		@param expectedamount Expected Amount	  */
	public void setexpectedamount (BigDecimal expectedamount)
	{
		set_Value (COLUMNNAME_expectedamount, expectedamount);
	}

	/** Get Expected Amount.
		@return Expected Amount	  */
	public BigDecimal getexpectedamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_expectedamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Expected Interest.
		@param expectedinterest Expected Interest	  */
	public void setexpectedinterest (BigDecimal expectedinterest)
	{
		set_Value (COLUMNNAME_expectedinterest, expectedinterest);
	}

	/** Get Expected Interest.
		@return Expected Interest	  */
	public BigDecimal getexpectedinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_expectedinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Effect Period.
		@param loaneffectdate Effect Period	  */
	public void setloaneffectdate (Timestamp loaneffectdate)
	{
		set_Value (COLUMNNAME_loaneffectdate, loaneffectdate);
	}

	/** Get Effect Period.
		@return Effect Period	  */
	public Timestamp getloaneffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loaneffectdate);
	}

	/** Set New Amount.
		@param newamount New Amount	  */
	public void setnewamount (BigDecimal newamount)
	{
		set_Value (COLUMNNAME_newamount, newamount);
	}

	/** Get New Amount.
		@return New Amount	  */
	public BigDecimal getnewamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set New Interest.
		@param newinterest New Interest	  */
	public void setnewinterest (BigDecimal newinterest)
	{
		set_Value (COLUMNNAME_newinterest, newinterest);
	}

	/** Get New Interest.
		@return New Interest	  */
	public BigDecimal getnewinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set NewOtherCharges.
		@param NewOtherCharges NewOtherCharges	  */
	public void setNewOtherCharges (BigDecimal NewOtherCharges)
	{
		set_Value (COLUMNNAME_NewOtherCharges, NewOtherCharges);
	}

	/** Get NewOtherCharges.
		@return NewOtherCharges	  */
	public BigDecimal getNewOtherCharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NewOtherCharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set One Month Adjustment.
		@param onemonthadjustment One Month Adjustment	  */
	public void setonemonthadjustment (boolean onemonthadjustment)
	{
		set_Value (COLUMNNAME_onemonthadjustment, Boolean.valueOf(onemonthadjustment));
	}

	/** Get One Month Adjustment.
		@return One Month Adjustment	  */
	public boolean isonemonthadjustment () 
	{
		Object oo = get_Value(COLUMNNAME_onemonthadjustment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Opening Balance.
		@param openingbalance Opening Balance	  */
	public void setopeningbalance (BigDecimal openingbalance)
	{
		set_Value (COLUMNNAME_openingbalance, openingbalance);
	}

	/** Get Opening Balance.
		@return Opening Balance	  */
	public BigDecimal getopeningbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_openingbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Recurring.
		@param recurring Recurring	  */
	public void setrecurring (boolean recurring)
	{
		set_Value (COLUMNNAME_recurring, Boolean.valueOf(recurring));
	}

	/** Get Recurring.
		@return Recurring	  */
	public boolean isrecurring () 
	{
		Object oo = get_Value(COLUMNNAME_recurring);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	public I_s_loantype gets_loantype() throws RuntimeException
    {
		return (I_s_loantype)MTable.get(getCtx(), I_s_loantype.Table_Name)
			.getPO(gets_loantype_ID(), get_TrxName());	}

	/** Set Loan Type.
		@param s_loantype_ID Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID)
	{
		if (s_loantype_ID < 1) 
			set_Value (COLUMNNAME_s_loantype_ID, null);
		else 
			set_Value (COLUMNNAME_s_loantype_ID, Integer.valueOf(s_loantype_ID));
	}

	/** Get Loan Type.
		@return Loan Type	  */
	public int gets_loantype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loantype_ID);
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

	/** Set s_monthlyloansadjustments ID.
		@param s_monthlyloansadjustments_ID s_monthlyloansadjustments ID	  */
	public void sets_monthlyloansadjustments_ID (int s_monthlyloansadjustments_ID)
	{
		if (s_monthlyloansadjustments_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_monthlyloansadjustments_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_monthlyloansadjustments_ID, Integer.valueOf(s_monthlyloansadjustments_ID));
	}

	/** Get s_monthlyloansadjustments ID.
		@return s_monthlyloansadjustments ID	  */
	public int gets_monthlyloansadjustments_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_monthlyloansadjustments_ID);
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

	/** Set Transaction Period.
		@param TransactionPer Transaction Period	  */
	public void setTransactionPer (int TransactionPer)
	{
		set_Value (COLUMNNAME_TransactionPer, Integer.valueOf(TransactionPer));
	}

	/** Get Transaction Period.
		@return Transaction Period	  */
	public int getTransactionPer () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TransactionPer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Year.
		@param transactionyear Transaction Year	  */
	public void settransactionyear (int transactionyear)
	{
		set_Value (COLUMNNAME_transactionyear, Integer.valueOf(transactionyear));
	}

	/** Get Transaction Year.
		@return Transaction Year	  */
	public int gettransactionyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transactionyear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}