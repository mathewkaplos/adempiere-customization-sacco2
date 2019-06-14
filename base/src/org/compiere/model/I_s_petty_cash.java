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

/** Generated Interface for s_petty_cash
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_s_petty_cash 
{

    /** TableName=s_petty_cash */
    public static final String Table_Name = "s_petty_cash";

    /** AD_Table_ID=1000107 */
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

    /** Column name AmountInWords */
    public static final String COLUMNNAME_AmountInWords = "AmountInWords";

	/** Set AmountInWords	  */
	public void setAmountInWords (String AmountInWords);

	/** Get AmountInWords	  */
	public String getAmountInWords();

    /** Column name authorizedby */
    public static final String COLUMNNAME_authorizedby = "authorizedby";

	/** Set authorizedby	  */
	public void setauthorizedby (String authorizedby);

	/** Get authorizedby	  */
	public String getauthorizedby();

    /** Column name btn_print */
    public static final String COLUMNNAME_btn_print = "btn_print";

	/** Set Print	  */
	public void setbtn_print (String btn_print);

	/** Get Print	  */
	public String getbtn_print();

    /** Column name btn_save */
    public static final String COLUMNNAME_btn_save = "btn_save";

	/** Set Save	  */
	public void setbtn_save (String btn_save);

	/** Get Save	  */
	public String getbtn_save();

    /** Column name ChequeNo */
    public static final String COLUMNNAME_ChequeNo = "ChequeNo";

	/** Set Cheque No	  */
	public void setChequeNo (String ChequeNo);

	/** Get Cheque No	  */
	public String getChequeNo();

    /** Column name collectedby */
    public static final String COLUMNNAME_collectedby = "collectedby";

	/** Set Collected By	  */
	public void setcollectedby (String collectedby);

	/** Get Collected By	  */
	public String getcollectedby();

    /** Column name Comments */
    public static final String COLUMNNAME_Comments = "Comments";

	/** Set Comments.
	  * Comments or additional information
	  */
	public void setComments (String Comments);

	/** Get Comments.
	  * Comments or additional information
	  */
	public String getComments();

    /** Column name Cr_Acct */
    public static final String COLUMNNAME_Cr_Acct = "Cr_Acct";

	/** Set Cr. Account	  */
	public void setCr_Acct (int Cr_Acct);

	/** Get Cr. Account	  */
	public int getCr_Acct();

	public I_C_ValidCombination getCr_A() throws RuntimeException;

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

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name Dr_Acct */
    public static final String COLUMNNAME_Dr_Acct = "Dr_Acct";

	/** Set Dr. Account	  */
	public void setDr_Acct (int Dr_Acct);

	/** Get Dr. Account	  */
	public int getDr_Acct();

	public I_C_ValidCombination getDr_A() throws RuntimeException;

    /** Column name invoicedate */
    public static final String COLUMNNAME_invoicedate = "invoicedate";

	/** Set invoicedate	  */
	public void setinvoicedate (Timestamp invoicedate);

	/** Get invoicedate	  */
	public Timestamp getinvoicedate();

    /** Column name invoicenumber */
    public static final String COLUMNNAME_invoicenumber = "invoicenumber";

	/** Set invoicenumber	  */
	public void setinvoicenumber (String invoicenumber);

	/** Get invoicenumber	  */
	public String getinvoicenumber();

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

    /** Column name isBenevolent */
    public static final String COLUMNNAME_isBenevolent = "isBenevolent";

	/** Set Is Benevolent	  */
	public void setisBenevolent (boolean isBenevolent);

	/** Get Is Benevolent	  */
	public boolean isBenevolent();

    /** Column name IsComplete */
    public static final String COLUMNNAME_IsComplete = "IsComplete";

	/** Set Complete.
	  * It is complete
	  */
	public void setIsComplete (boolean IsComplete);

	/** Get Complete.
	  * It is complete
	  */
	public boolean isComplete();

    /** Column name paidby */
    public static final String COLUMNNAME_paidby = "paidby";

	/** Set paidby	  */
	public void setpaidby (String paidby);

	/** Get paidby	  */
	public String getpaidby();

    /** Column name payee */
    public static final String COLUMNNAME_payee = "payee";

	/** Set Payee	  */
	public void setpayee (String payee);

	/** Get Payee	  */
	public String getpayee();

    /** Column name PaymentDate */
    public static final String COLUMNNAME_PaymentDate = "PaymentDate";

	/** Set Payment Date	  */
	public void setPaymentDate (Timestamp PaymentDate);

	/** Get Payment Date	  */
	public Timestamp getPaymentDate();

    /** Column name pending_disbursement */
    public static final String COLUMNNAME_pending_disbursement = "pending_disbursement";

	/** Set Pending Disbursement	  */
	public void setpending_disbursement (BigDecimal pending_disbursement);

	/** Get Pending Disbursement	  */
	public BigDecimal getpending_disbursement();

    /** Column name Posted */
    public static final String COLUMNNAME_Posted = "Posted";

	/** Set Posted.
	  * Posting status
	  */
	public void setPosted (boolean Posted);

	/** Get Posted.
	  * Posting status
	  */
	public boolean isPosted();

    /** Column name s_payment_mode_ID */
    public static final String COLUMNNAME_s_payment_mode_ID = "s_payment_mode_ID";

	/** Set Payment Mode	  */
	public void sets_payment_mode_ID (int s_payment_mode_ID);

	/** Get Payment Mode	  */
	public int gets_payment_mode_ID();

	public I_s_payment_mode gets_payment_mode() throws RuntimeException;

    /** Column name s_petty_cash_ID */
    public static final String COLUMNNAME_s_petty_cash_ID = "s_petty_cash_ID";

	/** Set s_petty_cash ID	  */
	public void sets_petty_cash_ID (int s_petty_cash_ID);

	/** Get s_petty_cash ID	  */
	public int gets_petty_cash_ID();

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

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();

    /** Column name VoucherNo */
    public static final String COLUMNNAME_VoucherNo = "VoucherNo";

	/** Set Voucher No	  */
	public void setVoucherNo (String VoucherNo);

	/** Get Voucher No	  */
	public String getVoucherNo();
}
