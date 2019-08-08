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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_dividend_manager
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_dividend_manager extends PO implements I_s_dividend_manager, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190730L;

    /** Standard Constructor */
    public X_s_dividend_manager (Properties ctx, int s_dividend_manager_ID, String trxName)
    {
      super (ctx, s_dividend_manager_ID, trxName);
      /** if (s_dividend_manager_ID == 0)
        {
			setdividend_calculation_formulae (null);
			sets_dividend_manager_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_dividend_manager (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_dividend_manager[")
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

	/** Set Amount Apportioned.
		@param amount_apportioned Amount Apportioned	  */
	public void setamount_apportioned (BigDecimal amount_apportioned)
	{
		set_Value (COLUMNNAME_amount_apportioned, amount_apportioned);
	}

	/** Get Amount Apportioned.
		@return Amount Apportioned	  */
	public BigDecimal getamount_apportioned () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount_apportioned);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Apply Different Date Ranges.
		@param apply_date_different_ranges Apply Different Date Ranges	  */
	public void setapply_date_different_ranges (boolean apply_date_different_ranges)
	{
		set_Value (COLUMNNAME_apply_date_different_ranges, Boolean.valueOf(apply_date_different_ranges));
	}

	/** Get Apply Different Date Ranges.
		@return Apply Different Date Ranges	  */
	public boolean isapply_date_different_ranges () 
	{
		Object oo = get_Value(COLUMNNAME_apply_date_different_ranges);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Apply Minimum Membership.
		@param apply_minimum_membership Apply Minimum Membership	  */
	public void setapply_minimum_membership (boolean apply_minimum_membership)
	{
		set_Value (COLUMNNAME_apply_minimum_membership, Boolean.valueOf(apply_minimum_membership));
	}

	/** Get Apply Minimum Membership.
		@return Apply Minimum Membership	  */
	public boolean isapply_minimum_membership () 
	{
		Object oo = get_Value(COLUMNNAME_apply_minimum_membership);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Apportion Amount.
		@param apportion_amount Apportion Amount	  */
	public void setapportion_amount (BigDecimal apportion_amount)
	{
		set_Value (COLUMNNAME_apportion_amount, apportion_amount);
	}

	/** Get Apportion Amount.
		@return Apportion Amount	  */
	public BigDecimal getapportion_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_apportion_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Calculate.
		@param btn_calculate Calculate	  */
	public void setbtn_calculate (String btn_calculate)
	{
		set_Value (COLUMNNAME_btn_calculate, btn_calculate);
	}

	/** Get Calculate.
		@return Calculate	  */
	public String getbtn_calculate () 
	{
		return (String)get_Value(COLUMNNAME_btn_calculate);
	}

	/** Set Commit.
		@param btn_commit Commit	  */
	public void setbtn_commit (String btn_commit)
	{
		set_Value (COLUMNNAME_btn_commit, btn_commit);
	}

	/** Get Commit.
		@return Commit	  */
	public String getbtn_commit () 
	{
		return (String)get_Value(COLUMNNAME_btn_commit);
	}

	/** Set Import.
		@param btn_import Import	  */
	public void setbtn_import (String btn_import)
	{
		set_Value (COLUMNNAME_btn_import, btn_import);
	}

	/** Get Import.
		@return Import	  */
	public String getbtn_import () 
	{
		return (String)get_Value(COLUMNNAME_btn_import);
	}

	/** Set List.
		@param btn_list List	  */
	public void setbtn_list (String btn_list)
	{
		set_Value (COLUMNNAME_btn_list, btn_list);
	}

	/** Get List.
		@return List	  */
	public String getbtn_list () 
	{
		return (String)get_Value(COLUMNNAME_btn_list);
	}

	/** Set Preview.
		@param btn_preview Preview	  */
	public void setbtn_preview (String btn_preview)
	{
		set_Value (COLUMNNAME_btn_preview, btn_preview);
	}

	/** Get Preview.
		@return Preview	  */
	public String getbtn_preview () 
	{
		return (String)get_Value(COLUMNNAME_btn_preview);
	}

	/** Set Select All.
		@param btn_select_all Select All	  */
	public void setbtn_select_all (String btn_select_all)
	{
		set_Value (COLUMNNAME_btn_select_all, btn_select_all);
	}

	/** Get Select All.
		@return Select All	  */
	public String getbtn_select_all () 
	{
		return (String)get_Value(COLUMNNAME_btn_select_all);
	}

	/** Set Difference.
		@param Difference Difference	  */
	public void setDifference (BigDecimal Difference)
	{
		set_Value (COLUMNNAME_Difference, Difference);
	}

	/** Get Difference.
		@return Difference	  */
	public BigDecimal getDifference () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Difference);
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

	/** dividend_calculation_formulae AD_Reference_ID=1000044 */
	public static final int DIVIDEND_CALCULATION_FORMULAE_AD_Reference_ID=1000044;
	/** Closing Balance Method = 1 */
	public static final String DIVIDEND_CALCULATION_FORMULAE_ClosingBalanceMethod = "1";
	/** Weighted Method = 2 */
	public static final String DIVIDEND_CALCULATION_FORMULAE_WeightedMethod = "2";
	/** Set Dividend Calculation Formulae.
		@param dividend_calculation_formulae Dividend Calculation Formulae	  */
	public void setdividend_calculation_formulae (String dividend_calculation_formulae)
	{

		set_Value (COLUMNNAME_dividend_calculation_formulae, dividend_calculation_formulae);
	}

	/** Get Dividend Calculation Formulae.
		@return Dividend Calculation Formulae	  */
	public String getdividend_calculation_formulae () 
	{
		return (String)get_Value(COLUMNNAME_dividend_calculation_formulae);
	}

	/** Set End Date.
		@param end_date End Date	  */
	public void setend_date (Timestamp end_date)
	{
		set_Value (COLUMNNAME_end_date, end_date);
	}

	/** Get End Date.
		@return End Date	  */
	public Timestamp getend_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_end_date);
	}

	public org.compiere.model.I_C_Period getend_period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getend_period_ID(), get_TrxName());	}

	/** Set End Period.
		@param end_period_ID End Period	  */
	public void setend_period_ID (int end_period_ID)
	{
		if (end_period_ID < 1) 
			set_Value (COLUMNNAME_end_period_ID, null);
		else 
			set_Value (COLUMNNAME_end_period_ID, Integer.valueOf(end_period_ID));
	}

	/** Get End Period.
		@return End Period	  */
	public int getend_period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_end_period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Ignore Dormant Members.
		@param ignore_dormant_members Ignore Dormant Members	  */
	public void setignore_dormant_members (boolean ignore_dormant_members)
	{
		set_Value (COLUMNNAME_ignore_dormant_members, Boolean.valueOf(ignore_dormant_members));
	}

	/** Get Ignore Dormant Members.
		@return Ignore Dormant Members	  */
	public boolean isignore_dormant_members () 
	{
		Object oo = get_Value(COLUMNNAME_ignore_dormant_members);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Minimum Membership Period.
		@param Minimum_membership_period Minimum Membership Period	  */
	public void setMinimum_membership_period (int Minimum_membership_period)
	{
		set_Value (COLUMNNAME_Minimum_membership_period, Integer.valueOf(Minimum_membership_period));
	}

	/** Get Minimum Membership Period.
		@return Minimum Membership Period	  */
	public int getMinimum_membership_period () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Minimum_membership_period);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minimum Shares To Qualify.
		@param minimum_shares_to_qualify Minimum Shares To Qualify	  */
	public void setminimum_shares_to_qualify (BigDecimal minimum_shares_to_qualify)
	{
		set_Value (COLUMNNAME_minimum_shares_to_qualify, minimum_shares_to_qualify);
	}

	/** Get Minimum Shares To Qualify.
		@return Minimum Shares To Qualify	  */
	public BigDecimal getminimum_shares_to_qualify () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minimum_shares_to_qualify);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Percentage.
		@param Percentage 
		Percent of the entire amount
	  */
	public void setPercentage (BigDecimal Percentage)
	{
		set_Value (COLUMNNAME_Percentage, Percentage);
	}

	/** Get Percentage.
		@return Percent of the entire amount
	  */
	public BigDecimal getPercentage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Rate %.
		@param Rate 
		Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate)
	{
		set_Value (COLUMNNAME_Rate, Rate);
	}

	/** Get Rate %.
		@return Rate or Tax or Exchange
	  */
	public BigDecimal getRate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set s_dividend_manager ID.
		@param s_dividend_manager_ID s_dividend_manager ID	  */
	public void sets_dividend_manager_ID (int s_dividend_manager_ID)
	{
		if (s_dividend_manager_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_dividend_manager_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_dividend_manager_ID, Integer.valueOf(s_dividend_manager_ID));
	}

	/** Get s_dividend_manager ID.
		@return s_dividend_manager ID	  */
	public int gets_dividend_manager_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_dividend_manager_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Set Minimum Shares.
		@param set_minimum_shares Set Minimum Shares	  */
	public void setset_minimum_shares (boolean set_minimum_shares)
	{
		set_Value (COLUMNNAME_set_minimum_shares, Boolean.valueOf(set_minimum_shares));
	}

	/** Get Set Minimum Shares.
		@return Set Minimum Shares	  */
	public boolean isset_minimum_shares () 
	{
		Object oo = get_Value(COLUMNNAME_set_minimum_shares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Start Date.
		@param start_date Start Date	  */
	public void setstart_date (Timestamp start_date)
	{
		set_Value (COLUMNNAME_start_date, start_date);
	}

	/** Get Start Date.
		@return Start Date	  */
	public Timestamp getstart_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_start_date);
	}

	public org.compiere.model.I_C_Period getstart_period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getstart_period_ID(), get_TrxName());	}

	/** Set Start Period.
		@param start_period_ID Start Period	  */
	public void setstart_period_ID (int start_period_ID)
	{
		if (start_period_ID < 1) 
			set_Value (COLUMNNAME_start_period_ID, null);
		else 
			set_Value (COLUMNNAME_start_period_ID, Integer.valueOf(start_period_ID));
	}

	/** Get Start Period.
		@return Start Period	  */
	public int getstart_period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_start_period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total Share Balance.
		@param total_share_balance Total Share Balance	  */
	public void settotal_share_balance (BigDecimal total_share_balance)
	{
		set_Value (COLUMNNAME_total_share_balance, total_share_balance);
	}

	/** Get Total Share Balance.
		@return Total Share Balance	  */
	public BigDecimal gettotal_share_balance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_total_share_balance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Use Amoun Only.
		@param use_amount_only Use Amoun Only	  */
	public void setuse_amount_only (boolean use_amount_only)
	{
		set_Value (COLUMNNAME_use_amount_only, Boolean.valueOf(use_amount_only));
	}

	/** Get Use Amoun Only.
		@return Use Amoun Only	  */
	public boolean isuse_amount_only () 
	{
		Object oo = get_Value(COLUMNNAME_use_amount_only);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set User Percentage Only.
		@param use_percentage_only User Percentage Only	  */
	public void setuse_percentage_only (boolean use_percentage_only)
	{
		set_Value (COLUMNNAME_use_percentage_only, Boolean.valueOf(use_percentage_only));
	}

	/** Get User Percentage Only.
		@return User Percentage Only	  */
	public boolean isuse_percentage_only () 
	{
		Object oo = get_Value(COLUMNNAME_use_percentage_only);
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