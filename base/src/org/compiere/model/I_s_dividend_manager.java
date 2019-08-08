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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_dividend_manager
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_s_dividend_manager 
{

    /** TableName=s_dividend_manager */
    public static final String Table_Name = "s_dividend_manager";

    /** AD_Table_ID=1000111 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name amount_apportioned */
    public static final String COLUMNNAME_amount_apportioned = "amount_apportioned";

	/** Set Amount Apportioned	  */
	public void setamount_apportioned (BigDecimal amount_apportioned);

	/** Get Amount Apportioned	  */
	public BigDecimal getamount_apportioned();

    /** Column name apply_date_different_ranges */
    public static final String COLUMNNAME_apply_date_different_ranges = "apply_date_different_ranges";

	/** Set Apply Different Date Ranges	  */
	public void setapply_date_different_ranges (boolean apply_date_different_ranges);

	/** Get Apply Different Date Ranges	  */
	public boolean isapply_date_different_ranges();

    /** Column name apply_minimum_membership */
    public static final String COLUMNNAME_apply_minimum_membership = "apply_minimum_membership";

	/** Set Apply Minimum Membership	  */
	public void setapply_minimum_membership (boolean apply_minimum_membership);

	/** Get Apply Minimum Membership	  */
	public boolean isapply_minimum_membership();

    /** Column name apportion_amount */
    public static final String COLUMNNAME_apportion_amount = "apportion_amount";

	/** Set Apportion Amount	  */
	public void setapportion_amount (BigDecimal apportion_amount);

	/** Get Apportion Amount	  */
	public BigDecimal getapportion_amount();

    /** Column name btn_calculate */
    public static final String COLUMNNAME_btn_calculate = "btn_calculate";

	/** Set Calculate	  */
	public void setbtn_calculate (String btn_calculate);

	/** Get Calculate	  */
	public String getbtn_calculate();

    /** Column name btn_commit */
    public static final String COLUMNNAME_btn_commit = "btn_commit";

	/** Set Commit	  */
	public void setbtn_commit (String btn_commit);

	/** Get Commit	  */
	public String getbtn_commit();

    /** Column name btn_import */
    public static final String COLUMNNAME_btn_import = "btn_import";

	/** Set Import	  */
	public void setbtn_import (String btn_import);

	/** Get Import	  */
	public String getbtn_import();

    /** Column name btn_list */
    public static final String COLUMNNAME_btn_list = "btn_list";

	/** Set List	  */
	public void setbtn_list (String btn_list);

	/** Get List	  */
	public String getbtn_list();

    /** Column name btn_preview */
    public static final String COLUMNNAME_btn_preview = "btn_preview";

	/** Set Preview	  */
	public void setbtn_preview (String btn_preview);

	/** Get Preview	  */
	public String getbtn_preview();

    /** Column name btn_select_all */
    public static final String COLUMNNAME_btn_select_all = "btn_select_all";

	/** Set Select All	  */
	public void setbtn_select_all (String btn_select_all);

	/** Get Select All	  */
	public String getbtn_select_all();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Difference */
    public static final String COLUMNNAME_Difference = "Difference";

	/** Set Difference	  */
	public void setDifference (BigDecimal Difference);

	/** Get Difference	  */
	public BigDecimal getDifference();

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

    /** Column name dividend_calculation_formulae */
    public static final String COLUMNNAME_dividend_calculation_formulae = "dividend_calculation_formulae";

	/** Set Dividend Calculation Formulae	  */
	public void setdividend_calculation_formulae (String dividend_calculation_formulae);

	/** Get Dividend Calculation Formulae	  */
	public String getdividend_calculation_formulae();

    /** Column name end_date */
    public static final String COLUMNNAME_end_date = "end_date";

	/** Set End Date	  */
	public void setend_date (Timestamp end_date);

	/** Get End Date	  */
	public Timestamp getend_date();

    /** Column name end_period_ID */
    public static final String COLUMNNAME_end_period_ID = "end_period_ID";

	/** Set End Period	  */
	public void setend_period_ID (int end_period_ID);

	/** Get End Period	  */
	public int getend_period_ID();

	public org.compiere.model.I_C_Period getend_period() throws RuntimeException;

    /** Column name ignore_dormant_members */
    public static final String COLUMNNAME_ignore_dormant_members = "ignore_dormant_members";

	/** Set Ignore Dormant Members	  */
	public void setignore_dormant_members (boolean ignore_dormant_members);

	/** Get Ignore Dormant Members	  */
	public boolean isignore_dormant_members();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Minimum_membership_period */
    public static final String COLUMNNAME_Minimum_membership_period = "Minimum_membership_period";

	/** Set Minimum Membership Period	  */
	public void setMinimum_membership_period (int Minimum_membership_period);

	/** Get Minimum Membership Period	  */
	public int getMinimum_membership_period();

    /** Column name minimum_shares_to_qualify */
    public static final String COLUMNNAME_minimum_shares_to_qualify = "minimum_shares_to_qualify";

	/** Set Minimum Shares To Qualify	  */
	public void setminimum_shares_to_qualify (BigDecimal minimum_shares_to_qualify);

	/** Get Minimum Shares To Qualify	  */
	public BigDecimal getminimum_shares_to_qualify();

    /** Column name Percentage */
    public static final String COLUMNNAME_Percentage = "Percentage";

	/** Set Percentage.
	  * Percent of the entire amount
	  */
	public void setPercentage (BigDecimal Percentage);

	/** Get Percentage.
	  * Percent of the entire amount
	  */
	public BigDecimal getPercentage();

    /** Column name Rate */
    public static final String COLUMNNAME_Rate = "Rate";

	/** Set Rate %.
	  * Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate);

	/** Get Rate %.
	  * Rate or Tax or Exchange
	  */
	public BigDecimal getRate();

    /** Column name s_dividend_manager_ID */
    public static final String COLUMNNAME_s_dividend_manager_ID = "s_dividend_manager_ID";

	/** Set s_dividend_manager ID	  */
	public void sets_dividend_manager_ID (int s_dividend_manager_ID);

	/** Get s_dividend_manager ID	  */
	public int gets_dividend_manager_ID();

    /** Column name set_minimum_shares */
    public static final String COLUMNNAME_set_minimum_shares = "set_minimum_shares";

	/** Set Set Minimum Shares	  */
	public void setset_minimum_shares (boolean set_minimum_shares);

	/** Get Set Minimum Shares	  */
	public boolean isset_minimum_shares();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

    /** Column name start_date */
    public static final String COLUMNNAME_start_date = "start_date";

	/** Set Start Date	  */
	public void setstart_date (Timestamp start_date);

	/** Get Start Date	  */
	public Timestamp getstart_date();

    /** Column name start_period_ID */
    public static final String COLUMNNAME_start_period_ID = "start_period_ID";

	/** Set Start Period	  */
	public void setstart_period_ID (int start_period_ID);

	/** Get Start Period	  */
	public int getstart_period_ID();

	public org.compiere.model.I_C_Period getstart_period() throws RuntimeException;

    /** Column name total_share_balance */
    public static final String COLUMNNAME_total_share_balance = "total_share_balance";

	/** Set Total Share Balance	  */
	public void settotal_share_balance (BigDecimal total_share_balance);

	/** Get Total Share Balance	  */
	public BigDecimal gettotal_share_balance();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name use_amount_only */
    public static final String COLUMNNAME_use_amount_only = "use_amount_only";

	/** Set Use Amoun Only	  */
	public void setuse_amount_only (boolean use_amount_only);

	/** Get Use Amoun Only	  */
	public boolean isuse_amount_only();

    /** Column name use_percentage_only */
    public static final String COLUMNNAME_use_percentage_only = "use_percentage_only";

	/** Set User Percentage Only	  */
	public void setuse_percentage_only (boolean use_percentage_only);

	/** Get User Percentage Only	  */
	public boolean isuse_percentage_only();

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();
}
