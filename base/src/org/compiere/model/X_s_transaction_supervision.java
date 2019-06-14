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

/** Generated Model for s_transaction_supervision
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_transaction_supervision extends PO implements I_s_transaction_supervision, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190323L;

    /** Standard Constructor */
    public X_s_transaction_supervision (Properties ctx, int s_transaction_supervision_ID, String trxName)
    {
      super (ctx, s_transaction_supervision_ID, trxName);
      /** if (s_transaction_supervision_ID == 0)
        {
			sets_transaction_supervision_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_transaction_supervision (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_transaction_supervision[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Cash Withdrawal Amount.
		@param cash_withdrawal_amount Cash Withdrawal Amount	  */
	public void setcash_withdrawal_amount (BigDecimal cash_withdrawal_amount)
	{
		set_Value (COLUMNNAME_cash_withdrawal_amount, cash_withdrawal_amount);
	}

	/** Get Cash Withdrawal Amount.
		@return Cash Withdrawal Amount	  */
	public BigDecimal getcash_withdrawal_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_cash_withdrawal_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cash Withdrawal Supervised.
		@param cash_withdrawal_supervised Cash Withdrawal Supervised	  */
	public void setcash_withdrawal_supervised (boolean cash_withdrawal_supervised)
	{
		set_Value (COLUMNNAME_cash_withdrawal_supervised, Boolean.valueOf(cash_withdrawal_supervised));
	}

	/** Get Cash Withdrawal Supervised.
		@return Cash Withdrawal Supervised	  */
	public boolean iscash_withdrawal_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_cash_withdrawal_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Deduction Schedule Supervised(Debit Raise).
		@param deduction_schedule_supervised Deduction Schedule Supervised(Debit Raise)	  */
	public void setdeduction_schedule_supervised (boolean deduction_schedule_supervised)
	{
		set_Value (COLUMNNAME_deduction_schedule_supervised, Boolean.valueOf(deduction_schedule_supervised));
	}

	/** Get Deduction Schedule Supervised(Debit Raise).
		@return Deduction Schedule Supervised(Debit Raise)	  */
	public boolean isdeduction_schedule_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_deduction_schedule_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Deposit Amount.
		@param deposit_amount Deposit Amount	  */
	public void setdeposit_amount (BigDecimal deposit_amount)
	{
		set_Value (COLUMNNAME_deposit_amount, deposit_amount);
	}

	/** Get Deposit Amount.
		@return Deposit Amount	  */
	public BigDecimal getdeposit_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_deposit_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Deposit Supervised.
		@param deposit_supervised Deposit Supervised	  */
	public void setdeposit_supervised (boolean deposit_supervised)
	{
		set_Value (COLUMNNAME_deposit_supervised, Boolean.valueOf(deposit_supervised));
	}

	/** Get Deposit Supervised.
		@return Deposit Supervised	  */
	public boolean isdeposit_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_deposit_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Fixed Deposit Amount.
		@param fixed_deposit_amount Fixed Deposit Amount	  */
	public void setfixed_deposit_amount (BigDecimal fixed_deposit_amount)
	{
		set_Value (COLUMNNAME_fixed_deposit_amount, fixed_deposit_amount);
	}

	/** Get Fixed Deposit Amount.
		@return Fixed Deposit Amount	  */
	public BigDecimal getfixed_deposit_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_fixed_deposit_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Fixed Deposit Supervised.
		@param fixed_deposit_supervised Fixed Deposit Supervised	  */
	public void setfixed_deposit_supervised (boolean fixed_deposit_supervised)
	{
		set_Value (COLUMNNAME_fixed_deposit_supervised, Boolean.valueOf(fixed_deposit_supervised));
	}

	/** Get Fixed Deposit Supervised.
		@return Fixed Deposit Supervised	  */
	public boolean isfixed_deposit_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_fixed_deposit_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Import Transactions Supervised(Payrol Imports).
		@param import_transactions_supervised Import Transactions Supervised(Payrol Imports)	  */
	public void setimport_transactions_supervised (boolean import_transactions_supervised)
	{
		set_Value (COLUMNNAME_import_transactions_supervised, Boolean.valueOf(import_transactions_supervised));
	}

	/** Get Import Transactions Supervised(Payrol Imports).
		@return Import Transactions Supervised(Payrol Imports)	  */
	public boolean isimport_transactions_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_import_transactions_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Loan Repayment Amount.
		@param loan_repayment_amount Loan Repayment Amount	  */
	public void setloan_repayment_amount (BigDecimal loan_repayment_amount)
	{
		set_Value (COLUMNNAME_loan_repayment_amount, loan_repayment_amount);
	}

	/** Get Loan Repayment Amount.
		@return Loan Repayment Amount	  */
	public BigDecimal getloan_repayment_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loan_repayment_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Loan Repayment Supervised.
		@param loan_repayment_supervised Loan Repayment Supervised	  */
	public void setloan_repayment_supervised (boolean loan_repayment_supervised)
	{
		set_Value (COLUMNNAME_loan_repayment_supervised, Boolean.valueOf(loan_repayment_supervised));
	}

	/** Get Loan Repayment Supervised.
		@return Loan Repayment Supervised	  */
	public boolean isloan_repayment_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_loan_repayment_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Partial Disbursement Amount.
		@param partial_disburs_amount Partial Disbursement Amount	  */
	public void setpartial_disburs_amount (BigDecimal partial_disburs_amount)
	{
		set_Value (COLUMNNAME_partial_disburs_amount, partial_disburs_amount);
	}

	/** Get Partial Disbursement Amount.
		@return Partial Disbursement Amount	  */
	public BigDecimal getpartial_disburs_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_partial_disburs_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Partial Disbursement Supervised.
		@param partial_disburs_supervised Partial Disbursement Supervised	  */
	public void setpartial_disburs_supervised (boolean partial_disburs_supervised)
	{
		set_Value (COLUMNNAME_partial_disburs_supervised, Boolean.valueOf(partial_disburs_supervised));
	}

	/** Get Partial Disbursement Supervised.
		@return Partial Disbursement Supervised	  */
	public boolean ispartial_disburs_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_partial_disburs_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product Transfer Amount.
		@param product_transfer_amount Product Transfer Amount	  */
	public void setproduct_transfer_amount (BigDecimal product_transfer_amount)
	{
		set_Value (COLUMNNAME_product_transfer_amount, product_transfer_amount);
	}

	/** Get Product Transfer Amount.
		@return Product Transfer Amount	  */
	public BigDecimal getproduct_transfer_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_product_transfer_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Product Transfer Supervised.
		@param product_transfer_supervised Product Transfer Supervised	  */
	public void setproduct_transfer_supervised (boolean product_transfer_supervised)
	{
		set_Value (COLUMNNAME_product_transfer_supervised, Boolean.valueOf(product_transfer_supervised));
	}

	/** Get Product Transfer Supervised.
		@return Product Transfer Supervised	  */
	public boolean isproduct_transfer_supervised () 
	{
		Object oo = get_Value(COLUMNNAME_product_transfer_supervised);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set s_transaction_supervision ID.
		@param s_transaction_supervision_ID s_transaction_supervision ID	  */
	public void sets_transaction_supervision_ID (int s_transaction_supervision_ID)
	{
		if (s_transaction_supervision_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_transaction_supervision_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_transaction_supervision_ID, Integer.valueOf(s_transaction_supervision_ID));
	}

	/** Get s_transaction_supervision ID.
		@return s_transaction_supervision ID	  */
	public int gets_transaction_supervision_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_transaction_supervision_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}