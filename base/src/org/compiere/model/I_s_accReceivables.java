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

/** Generated Interface for s_accReceivables
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_accReceivables 
{

    /** TableName=s_accReceivables */
    public static final String Table_Name = "s_accReceivables";

    /** AD_Table_ID=1000027 */
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

    /** Column name AmountInWords */
    public static final String COLUMNNAME_AmountInWords = "AmountInWords";

	/** Set AmountInWords	  */
	public void setAmountInWords (String AmountInWords);

	/** Get AmountInWords	  */
	public String getAmountInWords();

    /** Column name appliedamount */
    public static final String COLUMNNAME_appliedamount = "appliedamount";

	/** Set Applied Amount	  */
	public void setappliedamount (BigDecimal appliedamount);

	/** Get Applied Amount	  */
	public BigDecimal getappliedamount();

    /** Column name bankgl_Acct */
    public static final String COLUMNNAME_bankgl_Acct = "bankgl_Acct";

	/** Set Bank GL Code	  */
	public void setbankgl_Acct (int bankgl_Acct);

	/** Get Bank GL Code	  */
	public int getbankgl_Acct();

	public I_C_ValidCombination getbankgl_A() throws RuntimeException;

    /** Column name cashamount */
    public static final String COLUMNNAME_cashamount = "cashamount";

	/** Set Cash Amount	  */
	public void setcashamount (BigDecimal cashamount);

	/** Get Cash Amount	  */
	public BigDecimal getcashamount();

    /** Column name chequeamount */
    public static final String COLUMNNAME_chequeamount = "chequeamount";

	/** Set Cheque Amount	  */
	public void setchequeamount (BigDecimal chequeamount);

	/** Get Cheque Amount	  */
	public BigDecimal getchequeamount();

    /** Column name ChequeNo */
    public static final String COLUMNNAME_ChequeNo = "ChequeNo";

	/** Set Cheque No	  */
	public void setChequeNo (String ChequeNo);

	/** Get Cheque No	  */
	public String getChequeNo();

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

    /** Column name CrAmount */
    public static final String COLUMNNAME_CrAmount = "CrAmount";

	/** Set Credit Amount	  */
	public void setCrAmount (BigDecimal CrAmount);

	/** Get Credit Amount	  */
	public BigDecimal getCrAmount();

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

    /** Column name Credit_Acct */
    public static final String COLUMNNAME_Credit_Acct = "Credit_Acct";

	/** Set Credit Account	  */
	public void setCredit_Acct (int Credit_Acct);

	/** Get Credit Account	  */
	public int getCredit_Acct();

	public I_C_ValidCombination getCredit_A() throws RuntimeException;

    /** Column name Deposit */
    public static final String COLUMNNAME_Deposit = "Deposit";

	/** Set Deposit	  */
	public void setDeposit (BigDecimal Deposit);

	/** Get Deposit	  */
	public BigDecimal getDeposit();

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

    /** Column name GLID */
    public static final String COLUMNNAME_GLID = "GLID";

	/** Set GLID	  */
	public void setGLID (int GLID);

	/** Get GLID	  */
	public int getGLID();

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

    /** Column name LoanShare */
    public static final String COLUMNNAME_LoanShare = "LoanShare";

	/** Set LoanShare	  */
	public void setLoanShare (String LoanShare);

	/** Get LoanShare	  */
	public String getLoanShare();

    /** Column name mcode */
    public static final String COLUMNNAME_mcode = "mcode";

	/** Set Member #	  */
	public void setmcode (String mcode);

	/** Get Member #	  */
	public String getmcode();

    /** Column name ncChargeAmt */
    public static final String COLUMNNAME_ncChargeAmt = "ncChargeAmt";

	/** Set ncChargeAmt	  */
	public void setncChargeAmt (BigDecimal ncChargeAmt);

	/** Get ncChargeAmt	  */
	public BigDecimal getncChargeAmt();

    /** Column name paymode */
    public static final String COLUMNNAME_paymode = "paymode";

	/** Set Pay Mode	  */
	public void setpaymode (String paymode);

	/** Get Pay Mode	  */
	public String getpaymode();

    /** Column name ReceiptNo */
    public static final String COLUMNNAME_ReceiptNo = "ReceiptNo";

	/** Set Receipt No	  */
	public void setReceiptNo (String ReceiptNo);

	/** Get Receipt No	  */
	public String getReceiptNo();

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

    /** Column name s_accReceivables_ID */
    public static final String COLUMNNAME_s_accReceivables_ID = "s_accReceivables_ID";

	/** Set s_accReceivables ID	  */
	public void sets_accReceivables_ID (int s_accReceivables_ID);

	/** Get s_accReceivables ID	  */
	public int gets_accReceivables_ID();

    /** Column name s_bank_ID */
    public static final String COLUMNNAME_s_bank_ID = "s_bank_ID";

	/** Set s_bank ID	  */
	public void sets_bank_ID (int s_bank_ID);

	/** Get s_bank ID	  */
	public int gets_bank_ID();

	public I_s_bank gets_bank() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name serialid */
    public static final String COLUMNNAME_serialid = "serialid";

	/** Set serialid	  */
	public void setserialid (int serialid);

	/** Get serialid	  */
	public int getserialid();

    /** Column name suppliername */
    public static final String COLUMNNAME_suppliername = "suppliername";

	/** Set suppliername	  */
	public void setsuppliername (String suppliername);

	/** Get suppliername	  */
	public String getsuppliername();

    /** Column name ToApply */
    public static final String COLUMNNAME_ToApply = "ToApply";

	/** Set To Apply	  */
	public void setToApply (BigDecimal ToApply);

	/** Get To Apply	  */
	public BigDecimal getToApply();

    /** Column name TransactionType */
    public static final String COLUMNNAME_TransactionType = "TransactionType";

	/** Set Transaction Type	  */
	public void setTransactionType (String TransactionType);

	/** Get Transaction Type	  */
	public String getTransactionType();

    /** Column name TransAmount */
    public static final String COLUMNNAME_TransAmount = "TransAmount";

	/** Set Transaction Amount	  */
	public void setTransAmount (BigDecimal TransAmount);

	/** Get Transaction Amount	  */
	public BigDecimal getTransAmount();

    /** Column name Transcode */
    public static final String COLUMNNAME_Transcode = "Transcode";

	/** Set Transaction Code	  */
	public void setTranscode (String Transcode);

	/** Get Transaction Code	  */
	public String getTranscode();

    /** Column name TransDate */
    public static final String COLUMNNAME_TransDate = "TransDate";

	/** Set Transaction Date	  */
	public void setTransDate (Timestamp TransDate);

	/** Get Transaction Date	  */
	public Timestamp getTransDate();

    /** Column name Transid */
    public static final String COLUMNNAME_Transid = "Transid";

	/** Set Transid	  */
	public void setTransid (int Transid);

	/** Get Transid	  */
	public int getTransid();

    /** Column name transperiod */
    public static final String COLUMNNAME_transperiod = "transperiod";

	/** Set Period	  */
	public void settransperiod (int transperiod);

	/** Get Period	  */
	public int gettransperiod();

	public org.compiere.model.I_C_Period gettransper() throws RuntimeException;

    /** Column name transyear */
    public static final String COLUMNNAME_transyear = "transyear";

	/** Set Transaction Year	  */
	public void settransyear (int transyear);

	/** Get Transaction Year	  */
	public int gettransyear();

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

    /** Column name UserCode */
    public static final String COLUMNNAME_UserCode = "UserCode";

	/** Set User Code	  */
	public void setUserCode (String UserCode);

	/** Get User Code	  */
	public String getUserCode();
}
