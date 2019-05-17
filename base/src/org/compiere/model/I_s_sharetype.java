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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_sharetype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_sharetype 
{

    /** TableName=s_sharetype */
    public static final String Table_Name = "s_sharetype";

    /** AD_Table_ID=1000007 */
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

    /** Column name allow_multiple_accounts */
    public static final String COLUMNNAME_allow_multiple_accounts = "allow_multiple_accounts";

	/** Set Allow Multiple Accounts For Same Member.
	  * Allow Multiple Accounts For Same Member
	  */
	public void setallow_multiple_accounts (boolean allow_multiple_accounts);

	/** Get Allow Multiple Accounts For Same Member.
	  * Allow Multiple Accounts For Same Member
	  */
	public boolean isallow_multiple_accounts();

    /** Column name annualinterestrate */
    public static final String COLUMNNAME_annualinterestrate = "annualinterestrate";

	/** Set Annual Interest Rate	  */
	public void setannualinterestrate (int annualinterestrate);

	/** Get Annual Interest Rate	  */
	public int getannualinterestrate();

    /** Column name blocked */
    public static final String COLUMNNAME_blocked = "blocked";

	/** Set Blocked	  */
	public void setblocked (boolean blocked);

	/** Get Blocked	  */
	public boolean isblocked();

    /** Column name can_be_overdrawn */
    public static final String COLUMNNAME_can_be_overdrawn = "can_be_overdrawn";

	/** Set Can Be Overdrawn	  */
	public void setcan_be_overdrawn (boolean can_be_overdrawn);

	/** Get Can Be Overdrawn	  */
	public boolean iscan_be_overdrawn();

    /** Column name can_be_transferred */
    public static final String COLUMNNAME_can_be_transferred = "can_be_transferred";

	/** Set Can Be Transferred	  */
	public void setcan_be_transferred (boolean can_be_transferred);

	/** Get Can Be Transferred	  */
	public boolean iscan_be_transferred();

    /** Column name canbewithdrawn */
    public static final String COLUMNNAME_canbewithdrawn = "canbewithdrawn";

	/** Set Can Be Withdrawn	  */
	public void setcanbewithdrawn (boolean canbewithdrawn);

	/** Get Can Be Withdrawn	  */
	public boolean iscanbewithdrawn();

    /** Column name canearnannaulinterest */
    public static final String COLUMNNAME_canearnannaulinterest = "canearnannaulinterest";

	/** Set Can Earn Annual Interest	  */
	public void setcanearnannaulinterest (boolean canearnannaulinterest);

	/** Get Can Earn Annual Interest	  */
	public boolean iscanearnannaulinterest();

    /** Column name canearndividends */
    public static final String COLUMNNAME_canearndividends = "canearndividends";

	/** Set Can Earn Dividends	  */
	public void setcanearndividends (boolean canearndividends);

	/** Get Can Earn Dividends	  */
	public boolean iscanearndividends();

    /** Column name canguaranteeloan */
    public static final String COLUMNNAME_canguaranteeloan = "canguaranteeloan";

	/** Set Can Guarantee Loan	  */
	public void setcanguaranteeloan (boolean canguaranteeloan);

	/** Get Can Guarantee Loan	  */
	public boolean iscanguaranteeloan();

    /** Column name charge_amount */
    public static final String COLUMNNAME_charge_amount = "charge_amount";

	/** Set Charge Amount	  */
	public void setcharge_amount (BigDecimal charge_amount);

	/** Get Charge Amount	  */
	public BigDecimal getcharge_amount();

    /** Column name charge_defaulters */
    public static final String COLUMNNAME_charge_defaulters = "charge_defaulters";

	/** Set Charge Defaulters	  */
	public void setcharge_defaulters (boolean charge_defaulters);

	/** Get Charge Defaulters	  */
	public boolean ischarge_defaulters();

    /** Column name chargecode */
    public static final String COLUMNNAME_chargecode = "chargecode";

	/** Set chargecode	  */
	public void setchargecode (String chargecode);

	/** Get chargecode	  */
	public String getchargecode();

    /** Column name charges_apply_when_transacting */
    public static final String COLUMNNAME_charges_apply_when_transacting = "charges_apply_when_transacting";

	/** Set Transaction Charges Apply When Transacting	  */
	public void setcharges_apply_when_transacting (boolean charges_apply_when_transacting);

	/** Get Transaction Charges Apply When Transacting	  */
	public boolean ischarges_apply_when_transacting();

    /** Column name chequedays */
    public static final String COLUMNNAME_chequedays = "chequedays";

	/** Set Cheque Days	  */
	public void setchequedays (int chequedays);

	/** Get Cheque Days	  */
	public int getchequedays();

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

    /** Column name denomination */
    public static final String COLUMNNAME_denomination = "denomination";

	/** Set Denomination	  */
	public void setdenomination (BigDecimal denomination);

	/** Get Denomination	  */
	public BigDecimal getdenomination();

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

    /** Column name display */
    public static final String COLUMNNAME_display = "display";

	/** Set Display In Statement	  */
	public void setdisplay (boolean display);

	/** Get Display In Statement	  */
	public boolean isdisplay();

    /** Column name display_in_statement */
    public static final String COLUMNNAME_display_in_statement = "display_in_statement";

	/** Set Display In Statement	  */
	public void setdisplay_in_statement (boolean display_in_statement);

	/** Get Display In Statement	  */
	public boolean isdisplay_in_statement();

    /** Column name dividend_paid_Acct */
    public static final String COLUMNNAME_dividend_paid_Acct = "dividend_paid_Acct";

	/** Set Dividend Paid GL Code	  */
	public void setdividend_paid_Acct (int dividend_paid_Acct);

	/** Get Dividend Paid GL Code	  */
	public int getdividend_paid_Acct();

	public I_C_ValidCombination getdividend_paid_A() throws RuntimeException;

    /** Column name dividend_payable_Acct */
    public static final String COLUMNNAME_dividend_payable_Acct = "dividend_payable_Acct";

	/** Set Dividend Payable GL Code	  */
	public void setdividend_payable_Acct (int dividend_payable_Acct);

	/** Get Dividend Payable GL Code	  */
	public int getdividend_payable_Acct();

	public I_C_ValidCombination getdividend_payable_A() throws RuntimeException;

    /** Column name dividendgl_Acct */
    public static final String COLUMNNAME_dividendgl_Acct = "dividendgl_Acct";

	/** Set Dividend/Interest GL Code	  */
	public void setdividendgl_Acct (int dividendgl_Acct);

	/** Get Dividend/Interest GL Code	  */
	public int getdividendgl_Acct();

	public I_C_ValidCombination getdividendgl_A() throws RuntimeException;

    /** Column name hasmaxshares */
    public static final String COLUMNNAME_hasmaxshares = "hasmaxshares";

	/** Set Has Maximum Shares	  */
	public void sethasmaxshares (boolean hasmaxshares);

	/** Get Has Maximum Shares	  */
	public boolean ishasmaxshares();

    /** Column name hasminshares */
    public static final String COLUMNNAME_hasminshares = "hasminshares";

	/** Set Has Minimum Shares	  */
	public void sethasminshares (boolean hasminshares);

	/** Get Has Minimum Shares	  */
	public boolean ishasminshares();

    /** Column name interest_paid_Acct */
    public static final String COLUMNNAME_interest_paid_Acct = "interest_paid_Acct";

	/** Set Interest Paid GL Code	  */
	public void setinterest_paid_Acct (int interest_paid_Acct);

	/** Get Interest Paid GL Code	  */
	public int getinterest_paid_Acct();

	public I_C_ValidCombination getinterest_paid_A() throws RuntimeException;

    /** Column name interest_payable_Acct */
    public static final String COLUMNNAME_interest_payable_Acct = "interest_payable_Acct";

	/** Set Interest Payable GL Code	  */
	public void setinterest_payable_Acct (int interest_payable_Acct);

	/** Get Interest Payable GL Code	  */
	public int getinterest_payable_Acct();

	public I_C_ValidCombination getinterest_payable_A() throws RuntimeException;

    /** Column name interestgl_Acct */
    public static final String COLUMNNAME_interestgl_Acct = "interestgl_Acct";

	/** Set Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct);

	/** Get Interest GL Code	  */
	public int getinterestgl_Acct();

	public I_C_ValidCombination getinterestgl_A() throws RuntimeException;

    /** Column name intfrequency */
    public static final String COLUMNNAME_intfrequency = "intfrequency";

	/** Set Interest Frequency(M)	  */
	public void setintfrequency (int intfrequency);

	/** Get Interest Frequency(M)	  */
	public int getintfrequency();

    /** Column name intrate */
    public static final String COLUMNNAME_intrate = "intrate";

	/** Set Interest Rate(PM)	  */
	public void setintrate (BigDecimal intrate);

	/** Get Interest Rate(PM)	  */
	public BigDecimal getintrate();

    /** Column name is_benevolent */
    public static final String COLUMNNAME_is_benevolent = "is_benevolent";

	/** Set Is Benevolent	  */
	public void setis_benevolent (boolean is_benevolent);

	/** Get Is Benevolent	  */
	public boolean is_benevolent();

    /** Column name is_default_share_account */
    public static final String COLUMNNAME_is_default_share_account = "is_default_share_account";

	/** Set Is Default Share Account	  */
	public void setis_default_share_account (boolean is_default_share_account);

	/** Get Is Default Share Account	  */
	public boolean is_default_share_account();

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

    /** Column name isfixeddeposit */
    public static final String COLUMNNAME_isfixeddeposit = "isfixeddeposit";

	/** Set Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit);

	/** Get Is Fixed Deposit	  */
	public boolean isfixeddeposit();

    /** Column name isfosa */
    public static final String COLUMNNAME_isfosa = "isfosa";

	/** Set Is FOSA	  */
	public void setisfosa (boolean isfosa);

	/** Get Is FOSA	  */
	public boolean isfosa();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

    /** Column name maximum_beneficiaries_count */
    public static final String COLUMNNAME_maximum_beneficiaries_count = "maximum_beneficiaries_count";

	/** Set Maximum Beneficiaries Count	  */
	public void setmaximum_beneficiaries_count (int maximum_beneficiaries_count);

	/** Get Maximum Beneficiaries Count	  */
	public int getmaximum_beneficiaries_count();

    /** Column name minbalance */
    public static final String COLUMNNAME_minbalance = "minbalance";

	/** Set Minimum Balance	  */
	public void setminbalance (BigDecimal minbalance);

	/** Get Minimum Balance	  */
	public BigDecimal getminbalance();

    /** Column name mincount */
    public static final String COLUMNNAME_mincount = "mincount";

	/** Set Min Contribution	  */
	public void setmincount (BigDecimal mincount);

	/** Get Min Contribution	  */
	public BigDecimal getmincount();

    /** Column name minimum_count */
    public static final String COLUMNNAME_minimum_count = "minimum_count";

	/** Set Minimum Count	  */
	public void setminimum_count (int minimum_count);

	/** Get Minimum Count	  */
	public int getminimum_count();

    /** Column name minshares */
    public static final String COLUMNNAME_minshares = "minshares";

	/** Set Minimum Shares	  */
	public void setminshares (BigDecimal minshares);

	/** Get Minimum Shares	  */
	public BigDecimal getminshares();

    /** Column name must_be_contributed_monthly */
    public static final String COLUMNNAME_must_be_contributed_monthly = "must_be_contributed_monthly";

	/** Set Must Be Contributed Monthly	  */
	public void setmust_be_contributed_monthly (boolean must_be_contributed_monthly);

	/** Get Must Be Contributed Monthly	  */
	public boolean ismust_be_contributed_monthly();

    /** Column name noticedays */
    public static final String COLUMNNAME_noticedays = "noticedays";

	/** Set Notice Days	  */
	public void setnoticedays (int noticedays);

	/** Get Notice Days	  */
	public int getnoticedays();

    /** Column name othercharges_gl_Acct */
    public static final String COLUMNNAME_othercharges_gl_Acct = "othercharges_gl_Acct";

	/** Set Charges GL Code	  */
	public void setothercharges_gl_Acct (int othercharges_gl_Acct);

	/** Get Charges GL Code	  */
	public int getothercharges_gl_Acct();

	public I_C_ValidCombination getothercharges_gl_A() throws RuntimeException;

    /** Column name payrollcodeid */
    public static final String COLUMNNAME_payrollcodeid = "payrollcodeid";

	/** Set payrollcodeid	  */
	public void setpayrollcodeid (int payrollcodeid);

	/** Get payrollcodeid	  */
	public int getpayrollcodeid();

    /** Column name Prefix */
    public static final String COLUMNNAME_Prefix = "Prefix";

	/** Set Prefix.
	  * Prefix before the sequence number
	  */
	public void setPrefix (String Prefix);

	/** Get Prefix.
	  * Prefix before the sequence number
	  */
	public String getPrefix();

    /** Column name priority_ */
    public static final String COLUMNNAME_priority_ = "priority_";

	/** Set priority_	  */
	public void setpriority_ (int priority_);

	/** Get priority_	  */
	public int getpriority_();

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();

    /** Column name recovery_prioroty */
    public static final String COLUMNNAME_recovery_prioroty = "recovery_prioroty";

	/** Set Recovery Priority	  */
	public void setrecovery_prioroty (int recovery_prioroty);

	/** Get Recovery Priority	  */
	public int getrecovery_prioroty();

    /** Column name reqnotice */
    public static final String COLUMNNAME_reqnotice = "reqnotice";

	/** Set Require Refund/Withdrawal Notice	  */
	public void setreqnotice (boolean reqnotice);

	/** Get Require Refund/Withdrawal Notice	  */
	public boolean isreqnotice();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

    /** Column name saving_gl_code_Acct */
    public static final String COLUMNNAME_saving_gl_code_Acct = "saving_gl_code_Acct";

	/** Set Savig GL Code	  */
	public void setsaving_gl_code_Acct (int saving_gl_code_Acct);

	/** Get Savig GL Code	  */
	public int getsaving_gl_code_Acct();

	public I_C_ValidCombination getsaving_gl_code_A() throws RuntimeException;

    /** Column name share_saving */
    public static final String COLUMNNAME_share_saving = "share_saving";

	/** Set Product Type	  */
	public void setshare_saving (String share_saving);

	/** Get Product Type	  */
	public String getshare_saving();

    /** Column name sharecapital */
    public static final String COLUMNNAME_sharecapital = "sharecapital";

	/** Set Share Capital	  */
	public void setsharecapital (BigDecimal sharecapital);

	/** Get Share Capital	  */
	public BigDecimal getsharecapital();

    /** Column name sharecode */
    public static final String COLUMNNAME_sharecode = "sharecode";

	/** Set Share Code / Ref #	  */
	public void setsharecode (String sharecode);

	/** Get Share Code / Ref #	  */
	public String getsharecode();

    /** Column name sharedividendrate */
    public static final String COLUMNNAME_sharedividendrate = "sharedividendrate";

	/** Set Last Dividend/Interest Rate	  */
	public void setsharedividendrate (int sharedividendrate);

	/** Get Last Dividend/Interest Rate	  */
	public int getsharedividendrate();

    /** Column name sharegl_Acct */
    public static final String COLUMNNAME_sharegl_Acct = "sharegl_Acct";

	/** Set Share Type GL Code	  */
	public void setsharegl_Acct (int sharegl_Acct);

	/** Get Share Type GL Code	  */
	public int getsharegl_Acct();

	public I_C_ValidCombination getsharegl_A() throws RuntimeException;

    /** Column name sharemaxbalance */
    public static final String COLUMNNAME_sharemaxbalance = "sharemaxbalance";

	/** Set Maximum Capital	  */
	public void setsharemaxbalance (BigDecimal sharemaxbalance);

	/** Get Maximum Capital	  */
	public BigDecimal getsharemaxbalance();

    /** Column name sharename */
    public static final String COLUMNNAME_sharename = "sharename";

	/** Set Share Type Description	  */
	public void setsharename (String sharename);

	/** Get Share Type Description	  */
	public String getsharename();

    /** Column name sharewithholdingtax */
    public static final String COLUMNNAME_sharewithholdingtax = "sharewithholdingtax";

	/** Set Withholding Tax %	  */
	public void setsharewithholdingtax (int sharewithholdingtax);

	/** Get Withholding Tax %	  */
	public int getsharewithholdingtax();

    /** Column name sms_charge_Acct */
    public static final String COLUMNNAME_sms_charge_Acct = "sms_charge_Acct";

	/** Set SMS Charge Code GL	  */
	public void setsms_charge_Acct (int sms_charge_Acct);

	/** Get SMS Charge Code GL	  */
	public int getsms_charge_Acct();

	public I_C_ValidCombination getsms_charge_A() throws RuntimeException;

    /** Column name sms_income_Acct */
    public static final String COLUMNNAME_sms_income_Acct = "sms_income_Acct";

	/** Set SMS Income Account	  */
	public void setsms_income_Acct (int sms_income_Acct);

	/** Get SMS Income Account	  */
	public int getsms_income_Acct();

	public I_C_ValidCombination getsms_income_A() throws RuntimeException;

    /** Column name taxcode_Acct */
    public static final String COLUMNNAME_taxcode_Acct = "taxcode_Acct";

	/** Set Tax GL Account	  */
	public void settaxcode_Acct (int taxcode_Acct);

	/** Get Tax GL Account	  */
	public int gettaxcode_Acct();

	public I_C_ValidCombination gettaxcode_A() throws RuntimeException;

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

    /** Column name use_for_sms */
    public static final String COLUMNNAME_use_for_sms = "use_for_sms";

	/** Set Use for SMS	  */
	public void setuse_for_sms (boolean use_for_sms);

	/** Get Use for SMS	  */
	public boolean isuse_for_sms();

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();
}
