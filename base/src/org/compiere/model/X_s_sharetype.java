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
import org.compiere.util.KeyNamePair;

/** Generated Model for s_sharetype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_sharetype extends PO implements I_s_sharetype, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190504L;

    /** Standard Constructor */
    public X_s_sharetype (Properties ctx, int s_sharetype_ID, String trxName)
    {
      super (ctx, s_sharetype_ID, trxName);
      /** if (s_sharetype_ID == 0)
        {
			setcan_be_overdrawn (false);
// N
			setcan_be_transferred (false);
// N
			setcharge_defaulters (false);
// N
			setdisplay_in_statement (false);
// N
			setis_benevolent (false);
// N
			setis_default_share_account (false);
// N
			setmust_be_contributed_monthly (false);
// N
			setrecovery_prioroty (0);
// 0
			sets_sharetype_ID (0);
			setsharecode (null);
			setsharename (null);
			setuse_for_sms (false);
// N
        } */
    }

    /** Load Constructor */
    public X_s_sharetype (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_sharetype[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Allow Multiple Accounts For Same Member.
		@param allow_multiple_accounts 
		Allow Multiple Accounts For Same Member
	  */
	public void setallow_multiple_accounts (boolean allow_multiple_accounts)
	{
		set_Value (COLUMNNAME_allow_multiple_accounts, Boolean.valueOf(allow_multiple_accounts));
	}

	/** Get Allow Multiple Accounts For Same Member.
		@return Allow Multiple Accounts For Same Member
	  */
	public boolean isallow_multiple_accounts () 
	{
		Object oo = get_Value(COLUMNNAME_allow_multiple_accounts);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Annual Interest Rate.
		@param annualinterestrate Annual Interest Rate	  */
	public void setannualinterestrate (int annualinterestrate)
	{
		set_Value (COLUMNNAME_annualinterestrate, Integer.valueOf(annualinterestrate));
	}

	/** Get Annual Interest Rate.
		@return Annual Interest Rate	  */
	public int getannualinterestrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_annualinterestrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Blocked.
		@param blocked Blocked	  */
	public void setblocked (boolean blocked)
	{
		set_Value (COLUMNNAME_blocked, Boolean.valueOf(blocked));
	}

	/** Get Blocked.
		@return Blocked	  */
	public boolean isblocked () 
	{
		Object oo = get_Value(COLUMNNAME_blocked);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Overdrawn.
		@param can_be_overdrawn Can Be Overdrawn	  */
	public void setcan_be_overdrawn (boolean can_be_overdrawn)
	{
		set_Value (COLUMNNAME_can_be_overdrawn, Boolean.valueOf(can_be_overdrawn));
	}

	/** Get Can Be Overdrawn.
		@return Can Be Overdrawn	  */
	public boolean iscan_be_overdrawn () 
	{
		Object oo = get_Value(COLUMNNAME_can_be_overdrawn);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Transferred.
		@param can_be_transferred Can Be Transferred	  */
	public void setcan_be_transferred (boolean can_be_transferred)
	{
		set_Value (COLUMNNAME_can_be_transferred, Boolean.valueOf(can_be_transferred));
	}

	/** Get Can Be Transferred.
		@return Can Be Transferred	  */
	public boolean iscan_be_transferred () 
	{
		Object oo = get_Value(COLUMNNAME_can_be_transferred);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Withdrawn.
		@param canbewithdrawn Can Be Withdrawn	  */
	public void setcanbewithdrawn (boolean canbewithdrawn)
	{
		set_Value (COLUMNNAME_canbewithdrawn, Boolean.valueOf(canbewithdrawn));
	}

	/** Get Can Be Withdrawn.
		@return Can Be Withdrawn	  */
	public boolean iscanbewithdrawn () 
	{
		Object oo = get_Value(COLUMNNAME_canbewithdrawn);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Earn Annual Interest.
		@param canearnannaulinterest Can Earn Annual Interest	  */
	public void setcanearnannaulinterest (boolean canearnannaulinterest)
	{
		set_Value (COLUMNNAME_canearnannaulinterest, Boolean.valueOf(canearnannaulinterest));
	}

	/** Get Can Earn Annual Interest.
		@return Can Earn Annual Interest	  */
	public boolean iscanearnannaulinterest () 
	{
		Object oo = get_Value(COLUMNNAME_canearnannaulinterest);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Earn Dividends.
		@param canearndividends Can Earn Dividends	  */
	public void setcanearndividends (boolean canearndividends)
	{
		set_Value (COLUMNNAME_canearndividends, Boolean.valueOf(canearndividends));
	}

	/** Get Can Earn Dividends.
		@return Can Earn Dividends	  */
	public boolean iscanearndividends () 
	{
		Object oo = get_Value(COLUMNNAME_canearndividends);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Guarantee Loan.
		@param canguaranteeloan Can Guarantee Loan	  */
	public void setcanguaranteeloan (boolean canguaranteeloan)
	{
		set_Value (COLUMNNAME_canguaranteeloan, Boolean.valueOf(canguaranteeloan));
	}

	/** Get Can Guarantee Loan.
		@return Can Guarantee Loan	  */
	public boolean iscanguaranteeloan () 
	{
		Object oo = get_Value(COLUMNNAME_canguaranteeloan);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Charge Amount.
		@param charge_amount Charge Amount	  */
	public void setcharge_amount (BigDecimal charge_amount)
	{
		set_Value (COLUMNNAME_charge_amount, charge_amount);
	}

	/** Get Charge Amount.
		@return Charge Amount	  */
	public BigDecimal getcharge_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_charge_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Charge Defaulters.
		@param charge_defaulters Charge Defaulters	  */
	public void setcharge_defaulters (boolean charge_defaulters)
	{
		set_Value (COLUMNNAME_charge_defaulters, Boolean.valueOf(charge_defaulters));
	}

	/** Get Charge Defaulters.
		@return Charge Defaulters	  */
	public boolean ischarge_defaulters () 
	{
		Object oo = get_Value(COLUMNNAME_charge_defaulters);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set chargecode.
		@param chargecode chargecode	  */
	public void setchargecode (String chargecode)
	{
		set_Value (COLUMNNAME_chargecode, chargecode);
	}

	/** Get chargecode.
		@return chargecode	  */
	public String getchargecode () 
	{
		return (String)get_Value(COLUMNNAME_chargecode);
	}

	/** Set Transaction Charges Apply When Transacting.
		@param charges_apply_when_transacting Transaction Charges Apply When Transacting	  */
	public void setcharges_apply_when_transacting (boolean charges_apply_when_transacting)
	{
		set_Value (COLUMNNAME_charges_apply_when_transacting, Boolean.valueOf(charges_apply_when_transacting));
	}

	/** Get Transaction Charges Apply When Transacting.
		@return Transaction Charges Apply When Transacting	  */
	public boolean ischarges_apply_when_transacting () 
	{
		Object oo = get_Value(COLUMNNAME_charges_apply_when_transacting);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Cheque Days.
		@param chequedays Cheque Days	  */
	public void setchequedays (int chequedays)
	{
		set_Value (COLUMNNAME_chequedays, Integer.valueOf(chequedays));
	}

	/** Get Cheque Days.
		@return Cheque Days	  */
	public int getchequedays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_chequedays);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Denomination.
		@param denomination Denomination	  */
	public void setdenomination (BigDecimal denomination)
	{
		set_Value (COLUMNNAME_denomination, denomination);
	}

	/** Get Denomination.
		@return Denomination	  */
	public BigDecimal getdenomination () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_denomination);
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

	/** Set Display In Statement.
		@param display Display In Statement	  */
	public void setdisplay (boolean display)
	{
		set_Value (COLUMNNAME_display, Boolean.valueOf(display));
	}

	/** Get Display In Statement.
		@return Display In Statement	  */
	public boolean isdisplay () 
	{
		Object oo = get_Value(COLUMNNAME_display);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Display In Statement.
		@param display_in_statement Display In Statement	  */
	public void setdisplay_in_statement (boolean display_in_statement)
	{
		set_Value (COLUMNNAME_display_in_statement, Boolean.valueOf(display_in_statement));
	}

	/** Get Display In Statement.
		@return Display In Statement	  */
	public boolean isdisplay_in_statement () 
	{
		Object oo = get_Value(COLUMNNAME_display_in_statement);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_C_ValidCombination getdividend_paid_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdividend_paid_Acct(), get_TrxName());	}

	/** Set Dividend Paid GL Code.
		@param dividend_paid_Acct Dividend Paid GL Code	  */
	public void setdividend_paid_Acct (int dividend_paid_Acct)
	{
		set_Value (COLUMNNAME_dividend_paid_Acct, Integer.valueOf(dividend_paid_Acct));
	}

	/** Get Dividend Paid GL Code.
		@return Dividend Paid GL Code	  */
	public int getdividend_paid_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_dividend_paid_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getdividend_payable_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdividend_payable_Acct(), get_TrxName());	}

	/** Set Dividend Payable GL Code.
		@param dividend_payable_Acct Dividend Payable GL Code	  */
	public void setdividend_payable_Acct (int dividend_payable_Acct)
	{
		set_Value (COLUMNNAME_dividend_payable_Acct, Integer.valueOf(dividend_payable_Acct));
	}

	/** Get Dividend Payable GL Code.
		@return Dividend Payable GL Code	  */
	public int getdividend_payable_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_dividend_payable_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getdividendgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdividendgl_Acct(), get_TrxName());	}

	/** Set Dividend/Interest GL Code.
		@param dividendgl_Acct Dividend/Interest GL Code	  */
	public void setdividendgl_Acct (int dividendgl_Acct)
	{
		set_Value (COLUMNNAME_dividendgl_Acct, Integer.valueOf(dividendgl_Acct));
	}

	/** Get Dividend/Interest GL Code.
		@return Dividend/Interest GL Code	  */
	public int getdividendgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_dividendgl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Has Maximum Shares.
		@param hasmaxshares Has Maximum Shares	  */
	public void sethasmaxshares (boolean hasmaxshares)
	{
		set_Value (COLUMNNAME_hasmaxshares, Boolean.valueOf(hasmaxshares));
	}

	/** Get Has Maximum Shares.
		@return Has Maximum Shares	  */
	public boolean ishasmaxshares () 
	{
		Object oo = get_Value(COLUMNNAME_hasmaxshares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Has Minimum Shares.
		@param hasminshares Has Minimum Shares	  */
	public void sethasminshares (boolean hasminshares)
	{
		set_Value (COLUMNNAME_hasminshares, Boolean.valueOf(hasminshares));
	}

	/** Get Has Minimum Shares.
		@return Has Minimum Shares	  */
	public boolean ishasminshares () 
	{
		Object oo = get_Value(COLUMNNAME_hasminshares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_C_ValidCombination getinterest_paid_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getinterest_paid_Acct(), get_TrxName());	}

	/** Set Interest Paid GL Code.
		@param interest_paid_Acct Interest Paid GL Code	  */
	public void setinterest_paid_Acct (int interest_paid_Acct)
	{
		set_Value (COLUMNNAME_interest_paid_Acct, Integer.valueOf(interest_paid_Acct));
	}

	/** Get Interest Paid GL Code.
		@return Interest Paid GL Code	  */
	public int getinterest_paid_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_interest_paid_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getinterest_payable_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getinterest_payable_Acct(), get_TrxName());	}

	/** Set Interest Payable GL Code.
		@param interest_payable_Acct Interest Payable GL Code	  */
	public void setinterest_payable_Acct (int interest_payable_Acct)
	{
		set_Value (COLUMNNAME_interest_payable_Acct, Integer.valueOf(interest_payable_Acct));
	}

	/** Get Interest Payable GL Code.
		@return Interest Payable GL Code	  */
	public int getinterest_payable_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_interest_payable_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Interest Frequency(M).
		@param intfrequency Interest Frequency(M)	  */
	public void setintfrequency (int intfrequency)
	{
		set_Value (COLUMNNAME_intfrequency, Integer.valueOf(intfrequency));
	}

	/** Get Interest Frequency(M).
		@return Interest Frequency(M)	  */
	public int getintfrequency () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_intfrequency);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Interest Rate(PM).
		@param intrate Interest Rate(PM)	  */
	public void setintrate (BigDecimal intrate)
	{
		set_Value (COLUMNNAME_intrate, intrate);
	}

	/** Get Interest Rate(PM).
		@return Interest Rate(PM)	  */
	public BigDecimal getintrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_intrate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Is Benevolent.
		@param is_benevolent Is Benevolent	  */
	public void setis_benevolent (boolean is_benevolent)
	{
		set_Value (COLUMNNAME_is_benevolent, Boolean.valueOf(is_benevolent));
	}

	/** Get Is Benevolent.
		@return Is Benevolent	  */
	public boolean is_benevolent () 
	{
		Object oo = get_Value(COLUMNNAME_is_benevolent);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Default Share Account.
		@param is_default_share_account Is Default Share Account	  */
	public void setis_default_share_account (boolean is_default_share_account)
	{
		set_Value (COLUMNNAME_is_default_share_account, Boolean.valueOf(is_default_share_account));
	}

	/** Get Is Default Share Account.
		@return Is Default Share Account	  */
	public boolean is_default_share_account () 
	{
		Object oo = get_Value(COLUMNNAME_is_default_share_account);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Fixed Deposit.
		@param isfixeddeposit Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit)
	{
		set_Value (COLUMNNAME_isfixeddeposit, Boolean.valueOf(isfixeddeposit));
	}

	/** Get Is Fixed Deposit.
		@return Is Fixed Deposit	  */
	public boolean isfixeddeposit () 
	{
		Object oo = get_Value(COLUMNNAME_isfixeddeposit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is FOSA.
		@param isfosa Is FOSA	  */
	public void setisfosa (boolean isfosa)
	{
		set_Value (COLUMNNAME_isfosa, Boolean.valueOf(isfosa));
	}

	/** Get Is FOSA.
		@return Is FOSA	  */
	public boolean isfosa () 
	{
		Object oo = get_Value(COLUMNNAME_isfosa);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Maximum Beneficiaries Count.
		@param maximum_beneficiaries_count Maximum Beneficiaries Count	  */
	public void setmaximum_beneficiaries_count (int maximum_beneficiaries_count)
	{
		set_Value (COLUMNNAME_maximum_beneficiaries_count, Integer.valueOf(maximum_beneficiaries_count));
	}

	/** Get Maximum Beneficiaries Count.
		@return Maximum Beneficiaries Count	  */
	public int getmaximum_beneficiaries_count () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_maximum_beneficiaries_count);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minimum Balance.
		@param minbalance Minimum Balance	  */
	public void setminbalance (BigDecimal minbalance)
	{
		set_Value (COLUMNNAME_minbalance, minbalance);
	}

	/** Get Minimum Balance.
		@return Minimum Balance	  */
	public BigDecimal getminbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Min Contribution.
		@param mincount Min Contribution	  */
	public void setmincount (BigDecimal mincount)
	{
		set_Value (COLUMNNAME_mincount, mincount);
	}

	/** Get Min Contribution.
		@return Min Contribution	  */
	public BigDecimal getmincount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_mincount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Minimum Count.
		@param minimum_count Minimum Count	  */
	public void setminimum_count (int minimum_count)
	{
		set_Value (COLUMNNAME_minimum_count, Integer.valueOf(minimum_count));
	}

	/** Get Minimum Count.
		@return Minimum Count	  */
	public int getminimum_count () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_minimum_count);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minimum Shares.
		@param minshares Minimum Shares	  */
	public void setminshares (BigDecimal minshares)
	{
		set_Value (COLUMNNAME_minshares, minshares);
	}

	/** Get Minimum Shares.
		@return Minimum Shares	  */
	public BigDecimal getminshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Must Be Contributed Monthly.
		@param must_be_contributed_monthly Must Be Contributed Monthly	  */
	public void setmust_be_contributed_monthly (boolean must_be_contributed_monthly)
	{
		set_Value (COLUMNNAME_must_be_contributed_monthly, Boolean.valueOf(must_be_contributed_monthly));
	}

	/** Get Must Be Contributed Monthly.
		@return Must Be Contributed Monthly	  */
	public boolean ismust_be_contributed_monthly () 
	{
		Object oo = get_Value(COLUMNNAME_must_be_contributed_monthly);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Notice Days.
		@param noticedays Notice Days	  */
	public void setnoticedays (int noticedays)
	{
		set_Value (COLUMNNAME_noticedays, Integer.valueOf(noticedays));
	}

	/** Get Notice Days.
		@return Notice Days	  */
	public int getnoticedays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_noticedays);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set payrollcodeid.
		@param payrollcodeid payrollcodeid	  */
	public void setpayrollcodeid (int payrollcodeid)
	{
		set_Value (COLUMNNAME_payrollcodeid, Integer.valueOf(payrollcodeid));
	}

	/** Get payrollcodeid.
		@return payrollcodeid	  */
	public int getpayrollcodeid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_payrollcodeid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Prefix.
		@param Prefix 
		Prefix before the sequence number
	  */
	public void setPrefix (String Prefix)
	{
		set_Value (COLUMNNAME_Prefix, Prefix);
	}

	/** Get Prefix.
		@return Prefix before the sequence number
	  */
	public String getPrefix () 
	{
		return (String)get_Value(COLUMNNAME_Prefix);
	}

	/** Set priority_.
		@param priority_ priority_	  */
	public void setpriority_ (int priority_)
	{
		set_Value (COLUMNNAME_priority_, Integer.valueOf(priority_));
	}

	/** Get priority_.
		@return priority_	  */
	public int getpriority_ () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_priority_);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		throw new IllegalArgumentException ("Record_ID is virtual column");	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Recovery Priority.
		@param recovery_prioroty Recovery Priority	  */
	public void setrecovery_prioroty (int recovery_prioroty)
	{
		set_Value (COLUMNNAME_recovery_prioroty, Integer.valueOf(recovery_prioroty));
	}

	/** Get Recovery Priority.
		@return Recovery Priority	  */
	public int getrecovery_prioroty () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_recovery_prioroty);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Require Refund/Withdrawal Notice.
		@param reqnotice Require Refund/Withdrawal Notice	  */
	public void setreqnotice (boolean reqnotice)
	{
		set_Value (COLUMNNAME_reqnotice, Boolean.valueOf(reqnotice));
	}

	/** Get Require Refund/Withdrawal Notice.
		@return Require Refund/Withdrawal Notice	  */
	public boolean isreqnotice () 
	{
		Object oo = get_Value(COLUMNNAME_reqnotice);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
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

	public I_C_ValidCombination getsaving_gl_code_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsaving_gl_code_Acct(), get_TrxName());	}

	/** Set Savig GL Code.
		@param saving_gl_code_Acct Savig GL Code	  */
	public void setsaving_gl_code_Acct (int saving_gl_code_Acct)
	{
		set_Value (COLUMNNAME_saving_gl_code_Acct, Integer.valueOf(saving_gl_code_Acct));
	}

	/** Get Savig GL Code.
		@return Savig GL Code	  */
	public int getsaving_gl_code_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saving_gl_code_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** share_saving AD_Reference_ID=1000040 */
	public static final int SHARE_SAVING_AD_Reference_ID=1000040;
	/** Saving = saving */
	public static final String SHARE_SAVING_Saving = "saving";
	/** Share = share */
	public static final String SHARE_SAVING_Share = "share";
	/** Set Product Type.
		@param share_saving Product Type	  */
	public void setshare_saving (String share_saving)
	{

		set_Value (COLUMNNAME_share_saving, share_saving);
	}

	/** Get Product Type.
		@return Product Type	  */
	public String getshare_saving () 
	{
		return (String)get_Value(COLUMNNAME_share_saving);
	}

	/** Set Share Capital.
		@param sharecapital Share Capital	  */
	public void setsharecapital (BigDecimal sharecapital)
	{
		set_Value (COLUMNNAME_sharecapital, sharecapital);
	}

	/** Get Share Capital.
		@return Share Capital	  */
	public BigDecimal getsharecapital () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharecapital);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Share Code / Ref #.
		@param sharecode Share Code / Ref #	  */
	public void setsharecode (String sharecode)
	{
		set_Value (COLUMNNAME_sharecode, sharecode);
	}

	/** Get Share Code / Ref #.
		@return Share Code / Ref #	  */
	public String getsharecode () 
	{
		return (String)get_Value(COLUMNNAME_sharecode);
	}

	/** Set Last Dividend/Interest Rate.
		@param sharedividendrate Last Dividend/Interest Rate	  */
	public void setsharedividendrate (int sharedividendrate)
	{
		set_Value (COLUMNNAME_sharedividendrate, Integer.valueOf(sharedividendrate));
	}

	/** Get Last Dividend/Interest Rate.
		@return Last Dividend/Interest Rate	  */
	public int getsharedividendrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharedividendrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Maximum Capital.
		@param sharemaxbalance Maximum Capital	  */
	public void setsharemaxbalance (BigDecimal sharemaxbalance)
	{
		set_Value (COLUMNNAME_sharemaxbalance, sharemaxbalance);
	}

	/** Get Maximum Capital.
		@return Maximum Capital	  */
	public BigDecimal getsharemaxbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharemaxbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Share Type Description.
		@param sharename Share Type Description	  */
	public void setsharename (String sharename)
	{
		set_Value (COLUMNNAME_sharename, sharename);
	}

	/** Get Share Type Description.
		@return Share Type Description	  */
	public String getsharename () 
	{
		return (String)get_Value(COLUMNNAME_sharename);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getsharename());
    }

	/** Set Withholding Tax %.
		@param sharewithholdingtax Withholding Tax %	  */
	public void setsharewithholdingtax (int sharewithholdingtax)
	{
		set_Value (COLUMNNAME_sharewithholdingtax, Integer.valueOf(sharewithholdingtax));
	}

	/** Get Withholding Tax %.
		@return Withholding Tax %	  */
	public int getsharewithholdingtax () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharewithholdingtax);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getsms_charge_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsms_charge_Acct(), get_TrxName());	}

	/** Set SMS Charge Code GL.
		@param sms_charge_Acct SMS Charge Code GL	  */
	public void setsms_charge_Acct (int sms_charge_Acct)
	{
		set_Value (COLUMNNAME_sms_charge_Acct, Integer.valueOf(sms_charge_Acct));
	}

	/** Get SMS Charge Code GL.
		@return SMS Charge Code GL	  */
	public int getsms_charge_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sms_charge_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getsms_income_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsms_income_Acct(), get_TrxName());	}

	/** Set SMS Income Account.
		@param sms_income_Acct SMS Income Account	  */
	public void setsms_income_Acct (int sms_income_Acct)
	{
		set_Value (COLUMNNAME_sms_income_Acct, Integer.valueOf(sms_income_Acct));
	}

	/** Get SMS Income Account.
		@return SMS Income Account	  */
	public int getsms_income_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sms_income_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination gettaxcode_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(gettaxcode_Acct(), get_TrxName());	}

	/** Set Tax GL Account.
		@param taxcode_Acct Tax GL Account	  */
	public void settaxcode_Acct (int taxcode_Acct)
	{
		set_Value (COLUMNNAME_taxcode_Acct, Integer.valueOf(taxcode_Acct));
	}

	/** Get Tax GL Account.
		@return Tax GL Account	  */
	public int gettaxcode_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_taxcode_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Use for SMS.
		@param use_for_sms Use for SMS	  */
	public void setuse_for_sms (boolean use_for_sms)
	{
		set_Value (COLUMNNAME_use_for_sms, Boolean.valueOf(use_for_sms));
	}

	/** Get Use for SMS.
		@return Use for SMS	  */
	public boolean isuse_for_sms () 
	{
		Object oo = get_Value(COLUMNNAME_use_for_sms);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set uuid.
		@param uuid uuid	  */
	public void setuuid (String uuid)
	{
		set_Value (COLUMNNAME_uuid, uuid);
	}

	/** Get uuid.
		@return uuid	  */
	public String getuuid () 
	{
		return (String)get_Value(COLUMNNAME_uuid);
	}
}