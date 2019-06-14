/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_transactions
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_transactions extends PO implements I_s_transactions, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190610L;

    /** Standard Constructor */
    public X_s_transactions (Properties ctx, int s_transactions_ID, String trxName)
    {
      super (ctx, s_transactions_ID, trxName);
      /** if (s_transactions_ID == 0)
        {
			sets_transactions_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_transactions (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_transactions[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set After Transaction Balance.
		@param after_trans_bal After Transaction Balance	  */
	public void setafter_trans_bal (BigDecimal after_trans_bal)
	{
		set_Value (COLUMNNAME_after_trans_bal, after_trans_bal);
	}

	/** Get After Transaction Balance.
		@return After Transaction Balance	  */
	public BigDecimal getafter_trans_bal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_after_trans_bal);
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

	/** Set Before Transaction Balance.
		@param before_trans_bal Before Transaction Balance	  */
	public void setbefore_trans_bal (BigDecimal before_trans_bal)
	{
		set_Value (COLUMNNAME_before_trans_bal, before_trans_bal);
	}

	/** Get Before Transaction Balance.
		@return Before Transaction Balance	  */
	public BigDecimal getbefore_trans_bal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_before_trans_bal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Interest Amount.
		@param interestamount Interest Amount	  */
	public void setinterestamount (BigDecimal interestamount)
	{
		set_Value (COLUMNNAME_interestamount, interestamount);
	}

	/** Get Interest Amount.
		@return Interest Amount	  */
	public BigDecimal getinterestamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interestamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getinterestgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getinterestgl_Acct(), get_TrxName());	}

	/** Set Interest GL Code.
		@param interestgl_Acct Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct)
	{
		set_Value (COLUMNNAME_interestgl_Acct, Integer.valueOf(interestgl_Acct));
	}

	/** Get Interest GL Code.
		@return Interest GL Code	  */
	public int getinterestgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_interestgl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getloan_gl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getloan_gl_Acct(), get_TrxName());	}

	/** Set Loan GL Code.
		@param loan_gl_Acct Loan GL Code	  */
	public void setloan_gl_Acct (int loan_gl_Acct)
	{
		set_Value (COLUMNNAME_loan_gl_Acct, Integer.valueOf(loan_gl_Acct));
	}

	/** Get Loan GL Code.
		@return Loan GL Code	  */
	public int getloan_gl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loan_gl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Other Charges.
		@param othercharges Other Charges	  */
	public void setothercharges (BigDecimal othercharges)
	{
		set_Value (COLUMNNAME_othercharges, othercharges);
	}

	/** Get Other Charges.
		@return Other Charges	  */
	public BigDecimal getothercharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_othercharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getothercharges_gl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getothercharges_gl_Acct(), get_TrxName());	}

	/** Set Charges GL Code.
		@param othercharges_gl_Acct Charges GL Code	  */
	public void setothercharges_gl_Acct (int othercharges_gl_Acct)
	{
		set_Value (COLUMNNAME_othercharges_gl_Acct, Integer.valueOf(othercharges_gl_Acct));
	}

	/** Get Charges GL Code.
		@return Charges GL Code	  */
	public int getothercharges_gl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_othercharges_gl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Select.
		@param selected Select	  */
	public void setselected (boolean selected)
	{
		set_Value (COLUMNNAME_selected, Boolean.valueOf(selected));
	}

	/** Get Select.
		@return Select	  */
	public boolean isselected () 
	{
		Object oo = get_Value(COLUMNNAME_selected);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set SerialNo.
		@param SerialNo SerialNo	  */
	public void setSerialNo (int SerialNo)
	{
		set_Value (COLUMNNAME_SerialNo, Integer.valueOf(SerialNo));
	}

	/** Get SerialNo.
		@return SerialNo	  */
	public int getSerialNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SerialNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Share Contribution.
		@param share_contribution Share Contribution	  */
	public void setshare_contribution (BigDecimal share_contribution)
	{
		set_Value (COLUMNNAME_share_contribution, share_contribution);
	}

	/** Get Share Contribution.
		@return Share Contribution	  */
	public BigDecimal getshare_contribution () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_share_contribution);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getsharegl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsharegl_Acct(), get_TrxName());	}

	/** Set Share Type GL Code.
		@param sharegl_Acct Share Type GL Code	  */
	public void setsharegl_Acct (int sharegl_Acct)
	{
		set_Value (COLUMNNAME_sharegl_Acct, Integer.valueOf(sharegl_Acct));
	}

	/** Get Share Type GL Code.
		@return Share Type GL Code	  */
	public int getsharegl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharegl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set shareloanid.
		@param shareloanid shareloanid	  */
	public void setshareloanid (int shareloanid)
	{
		set_Value (COLUMNNAME_shareloanid, Integer.valueOf(shareloanid));
	}

	/** Get shareloanid.
		@return shareloanid	  */
	public int getshareloanid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_shareloanid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	public I_s_sharetype gets_sharetype() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_transactions ID.
		@param s_transactions_ID s_transactions ID	  */
	public void sets_transactions_ID (int s_transactions_ID)
	{
		if (s_transactions_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_transactions_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_transactions_ID, Integer.valueOf(s_transactions_ID));
	}

	/** Get s_transactions ID.
		@return s_transactions ID	  */
	public int gets_transactions_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_transactions_ID);
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

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}