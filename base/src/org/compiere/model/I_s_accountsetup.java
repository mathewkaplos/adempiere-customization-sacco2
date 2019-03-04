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

/** Generated Interface for s_accountsetup
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_accountsetup 
{

    /** TableName=s_accountsetup */
    public static final String Table_Name = "s_accountsetup";

    /** AD_Table_ID=1000008 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name accountscode */
    public static final String COLUMNNAME_accountscode = "accountscode";

	/** Set Ref # / Code	  */
	public void setaccountscode (String accountscode);

	/** Get Ref # / Code	  */
	public String getaccountscode();

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

    /** Column name additionalamt */
    public static final String COLUMNNAME_additionalamt = "additionalamt";

	/** Set Additional Amount Value	  */
	public void setadditionalamt (BigDecimal additionalamt);

	/** Get Additional Amount Value	  */
	public BigDecimal getadditionalamt();

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

    /** Column name blocked */
    public static final String COLUMNNAME_blocked = "blocked";

	/** Set Blocked	  */
	public void setblocked (boolean blocked);

	/** Get Blocked	  */
	public boolean isblocked();

    /** Column name btn_cheque_witing_OC */
    public static final String COLUMNNAME_btn_cheque_witing_OC = "btn_cheque_witing_OC";

	/** Set Add Charges (Cheque Writing)	  */
	public void setbtn_cheque_witing_OC (String btn_cheque_witing_OC);

	/** Get Add Charges (Cheque Writing)	  */
	public String getbtn_cheque_witing_OC();

    /** Column name btn_paymode_OC */
    public static final String COLUMNNAME_btn_paymode_OC = "btn_paymode_OC";

	/** Set Add Charges (Pay Mode)	  */
	public void setbtn_paymode_OC (String btn_paymode_OC);

	/** Get Add Charges (Pay Mode)	  */
	public String getbtn_paymode_OC();

    /** Column name btn_post_charges */
    public static final String COLUMNNAME_btn_post_charges = "btn_post_charges";

	/** Set Post Service Charges	  */
	public void setbtn_post_charges (String btn_post_charges);

	/** Get Post Service Charges	  */
	public String getbtn_post_charges();

    /** Column name btn_print_chargelist */
    public static final String COLUMNNAME_btn_print_chargelist = "btn_print_chargelist";

	/** Set Print Charge List	  */
	public void setbtn_print_chargelist (String btn_print_chargelist);

	/** Get Print Charge List	  */
	public String getbtn_print_chargelist();

    /** Column name chargeformula */
    public static final String COLUMNNAME_chargeformula = "chargeformula";

	/** Set Charge Formula.
	  * "P"=LoanAmount, "I"=SumInterest, "T" =LoanRepaymentPeriod, "L"=OldLoanBalance. For Example 0.049/100*[P]*[T]
	  */
	public void setchargeformula (String chargeformula);

	/** Get Charge Formula.
	  * "P"=LoanAmount, "I"=SumInterest, "T" =LoanRepaymentPeriod, "L"=OldLoanBalance. For Example 0.049/100*[P]*[T]
	  */
	public String getchargeformula();

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name glcode_Acct */
    public static final String COLUMNNAME_glcode_Acct = "glcode_Acct";

	/** Set GL Account	  */
	public void setglcode_Acct (int glcode_Acct);

	/** Get GL Account	  */
	public int getglcode_Acct();

	public I_C_ValidCombination getglcode_A() throws RuntimeException;

    /** Column name hasadditionalcalculation */
    public static final String COLUMNNAME_hasadditionalcalculation = "hasadditionalcalculation";

	/** Set Has Additiona Calculation	  */
	public void sethasadditionalcalculation (boolean hasadditionalcalculation);

	/** Get Has Additiona Calculation	  */
	public boolean ishasadditionalcalculation();

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

    /** Column name ispercentage */
    public static final String COLUMNNAME_ispercentage = "ispercentage";

	/** Set Is Percentage	  */
	public void setispercentage (boolean ispercentage);

	/** Get Is Percentage	  */
	public boolean ispercentage();

    /** Column name operator */
    public static final String COLUMNNAME_operator = "operator";

	/** Set Operator	  */
	public void setoperator (String operator);

	/** Get Operator	  */
	public String getoperator();

    /** Column name s_accountsetup_ID */
    public static final String COLUMNNAME_s_accountsetup_ID = "s_accountsetup_ID";

	/** Set Other Charge	  */
	public void sets_accountsetup_ID (int s_accountsetup_ID);

	/** Get Other Charge	  */
	public int gets_accountsetup_ID();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type To Post Service Charge.
	  * Share Type To Post Service Charge
	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type To Post Service Charge.
	  * Share Type To Post Service Charge
	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

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

    /** Column name useformula */
    public static final String COLUMNNAME_useformula = "useformula";

	/** Set Use Formula	  */
	public void setuseformula (boolean useformula);

	/** Get Use Formula	  */
	public boolean isuseformula();

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();
}
