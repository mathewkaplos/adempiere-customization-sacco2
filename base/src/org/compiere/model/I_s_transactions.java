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

/** Generated Interface for s_transactions
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_transactions 
{

    /** TableName=s_transactions */
    public static final String Table_Name = "s_transactions";

    /** AD_Table_ID=1000032 */
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

    /** Column name after_trans_bal */
    public static final String COLUMNNAME_after_trans_bal = "after_trans_bal";

	/** Set After Transaction Balance	  */
	public void setafter_trans_bal (BigDecimal after_trans_bal);

	/** Get After Transaction Balance	  */
	public BigDecimal getafter_trans_bal();

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

    /** Column name before_trans_bal */
    public static final String COLUMNNAME_before_trans_bal = "before_trans_bal";

	/** Set Before Transaction Balance	  */
	public void setbefore_trans_bal (BigDecimal before_trans_bal);

	/** Get Before Transaction Balance	  */
	public BigDecimal getbefore_trans_bal();

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

    /** Column name gross */
    public static final String COLUMNNAME_gross = "gross";

	/** Set Gross Amount	  */
	public void setgross (int gross);

	/** Get Gross Amount	  */
	public int getgross();

	public I_C_ValidCombination getgr() throws RuntimeException;

    /** Column name interestamount */
    public static final String COLUMNNAME_interestamount = "interestamount";

	/** Set Interest Amount	  */
	public void setinterestamount (BigDecimal interestamount);

	/** Get Interest Amount	  */
	public BigDecimal getinterestamount();

    /** Column name interestgl_Acct */
    public static final String COLUMNNAME_interestgl_Acct = "interestgl_Acct";

	/** Set Fixed Deposit Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct);

	/** Get Fixed Deposit Interest GL Code	  */
	public int getinterestgl_Acct();

	public I_C_ValidCombination getinterestgl_A() throws RuntimeException;

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

    /** Column name loan_gl_Acct */
    public static final String COLUMNNAME_loan_gl_Acct = "loan_gl_Acct";

	/** Set Loan GL Code	  */
	public void setloan_gl_Acct (int loan_gl_Acct);

	/** Get Loan GL Code	  */
	public int getloan_gl_Acct();

	public I_C_ValidCombination getloan_gl_A() throws RuntimeException;

    /** Column name othercharges */
    public static final String COLUMNNAME_othercharges = "othercharges";

	/** Set Other Charges	  */
	public void setothercharges (BigDecimal othercharges);

	/** Get Other Charges	  */
	public BigDecimal getothercharges();

    /** Column name othercharges_gl_Acct */
    public static final String COLUMNNAME_othercharges_gl_Acct = "othercharges_gl_Acct";

	/** Set Charges GL Code	  */
	public void setothercharges_gl_Acct (int othercharges_gl_Acct);

	/** Get Charges GL Code	  */
	public int getothercharges_gl_Acct();

	public I_C_ValidCombination getothercharges_gl_A() throws RuntimeException;

    /** Column name Reference */
    public static final String COLUMNNAME_Reference = "Reference";

	/** Set Reference.
	  * Reference for this record
	  */
	public void setReference (String Reference);

	/** Get Reference.
	  * Reference for this record
	  */
	public String getReference();

    /** Column name s_loantype_ID */
    public static final String COLUMNNAME_s_loantype_ID = "s_loantype_ID";

	/** Set Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID);

	/** Get Loan Type	  */
	public int gets_loantype_ID();

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_payrol_interface_ID */
    public static final String COLUMNNAME_s_payrol_interface_ID = "s_payrol_interface_ID";

	/** Set s_payrol_interface ID	  */
	public void sets_payrol_interface_ID (int s_payrol_interface_ID);

	/** Get s_payrol_interface ID	  */
	public int gets_payrol_interface_ID();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

    /** Column name s_transactions_ID */
    public static final String COLUMNNAME_s_transactions_ID = "s_transactions_ID";

	/** Set s_transactions ID	  */
	public void sets_transactions_ID (int s_transactions_ID);

	/** Get s_transactions ID	  */
	public int gets_transactions_ID();

    /** Column name selected */
    public static final String COLUMNNAME_selected = "selected";

	/** Set Select	  */
	public void setselected (boolean selected);

	/** Get Select	  */
	public boolean isselected();

    /** Column name SerialNo */
    public static final String COLUMNNAME_SerialNo = "SerialNo";

	/** Set SerialNo	  */
	public void setSerialNo (int SerialNo);

	/** Get SerialNo	  */
	public int getSerialNo();

    /** Column name share_contribution */
    public static final String COLUMNNAME_share_contribution = "share_contribution";

	/** Set Share Contribution	  */
	public void setshare_contribution (BigDecimal share_contribution);

	/** Get Share Contribution	  */
	public BigDecimal getshare_contribution();

    /** Column name sharegl_Acct */
    public static final String COLUMNNAME_sharegl_Acct = "sharegl_Acct";

	/** Set Share Type GL Code	  */
	public void setsharegl_Acct (int sharegl_Acct);

	/** Get Share Type GL Code	  */
	public int getsharegl_Acct();

	public I_C_ValidCombination getsharegl_A() throws RuntimeException;

    /** Column name shareloanid */
    public static final String COLUMNNAME_shareloanid = "shareloanid";

	/** Set shareloanid	  */
	public void setshareloanid (int shareloanid);

	/** Get shareloanid	  */
	public int getshareloanid();

    /** Column name TransactionType */
    public static final String COLUMNNAME_TransactionType = "TransactionType";

	/** Set Transaction Type	  */
	public void setTransactionType (String TransactionType);

	/** Get Transaction Type	  */
	public String getTransactionType();

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
}
