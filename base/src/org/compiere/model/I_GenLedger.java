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

/** Generated Interface for GenLedger
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_GenLedger 
{

    /** TableName=GenLedger */
    public static final String Table_Name = "GenLedger";

    /** AD_Table_ID=1000033 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AccNo_Acct */
    public static final String COLUMNNAME_AccNo_Acct = "AccNo_Acct";

	/** Set Account No	  */
	public void setAccNo_Acct (int AccNo_Acct);

	/** Get Account No	  */
	public int getAccNo_Acct();

	public I_C_ValidCombination getAccNo_A() throws RuntimeException;

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

    /** Column name C_Period_ID */
    public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

	/** Set Period.
	  * Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID);

	/** Get Period.
	  * Period of the Calendar
	  */
	public int getC_Period_ID();

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException;

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

    /** Column name ContraAcc_Acct */
    public static final String COLUMNNAME_ContraAcc_Acct = "ContraAcc_Acct";

	/** Set Contra Account	  */
	public void setContraAcc_Acct (int ContraAcc_Acct);

	/** Get Contra Account	  */
	public int getContraAcc_Acct();

	public I_C_ValidCombination getContraAcc_A() throws RuntimeException;

    /** Column name CR */
    public static final String COLUMNNAME_CR = "CR";

	/** Set CR	  */
	public void setCR (BigDecimal CR);

	/** Get CR	  */
	public BigDecimal getCR();

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

    /** Column name DateReconciled */
    public static final String COLUMNNAME_DateReconciled = "DateReconciled";

	/** Set Date Reconciled	  */
	public void setDateReconciled (Timestamp DateReconciled);

	/** Get Date Reconciled	  */
	public Timestamp getDateReconciled();

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

    /** Column name DR */
    public static final String COLUMNNAME_DR = "DR";

	/** Set DR	  */
	public void setDR (BigDecimal DR);

	/** Get DR	  */
	public BigDecimal getDR();

    /** Column name GenLedger_ID */
    public static final String COLUMNNAME_GenLedger_ID = "GenLedger_ID";

	/** Set GenLedger ID	  */
	public void setGenLedger_ID (int GenLedger_ID);

	/** Get GenLedger ID	  */
	public int getGenLedger_ID();

    /** Column name GroupAccount */
    public static final String COLUMNNAME_GroupAccount = "GroupAccount";

	/** Set GroupAccount	  */
	public void setGroupAccount (boolean GroupAccount);

	/** Get GroupAccount	  */
	public boolean isGroupAccount();

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

    /** Column name OBal */
    public static final String COLUMNNAME_OBal = "OBal";

	/** Set OBal	  */
	public void setOBal (BigDecimal OBal);

	/** Get OBal	  */
	public BigDecimal getOBal();

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

    /** Column name Reconciled */
    public static final String COLUMNNAME_Reconciled = "Reconciled";

	/** Set Reconciled	  */
	public void setReconciled (boolean Reconciled);

	/** Get Reconciled	  */
	public boolean isReconciled();

    /** Column name ReconNo */
    public static final String COLUMNNAME_ReconNo = "ReconNo";

	/** Set ReconNo	  */
	public void setReconNo (String ReconNo);

	/** Get ReconNo	  */
	public String getReconNo();

    /** Column name RunningBal */
    public static final String COLUMNNAME_RunningBal = "RunningBal";

	/** Set RunningBal	  */
	public void setRunningBal (BigDecimal RunningBal);

	/** Get RunningBal	  */
	public BigDecimal getRunningBal();

    /** Column name s_branch_ID */
    public static final String COLUMNNAME_s_branch_ID = "s_branch_ID";

	/** Set Member Branch	  */
	public void sets_branch_ID (int s_branch_ID);

	/** Get Member Branch	  */
	public int gets_branch_ID();

    /** Column name s_employers_ID */
    public static final String COLUMNNAME_s_employers_ID = "s_employers_ID";

	/** Set Employer	  */
	public void sets_employers_ID (int s_employers_ID);

	/** Get Employer	  */
	public int gets_employers_ID();

    /** Column name serialid */
    public static final String COLUMNNAME_serialid = "serialid";

	/** Set serialid	  */
	public void setserialid (int serialid);

	/** Get serialid	  */
	public int getserialid();

    /** Column name Subledger */
    public static final String COLUMNNAME_Subledger = "Subledger";

	/** Set Subledger	  */
	public void setSubledger (boolean Subledger);

	/** Get Subledger	  */
	public boolean isSubledger();

    /** Column name TransactionNo */
    public static final String COLUMNNAME_TransactionNo = "TransactionNo";

	/** Set TransactionNo	  */
	public void setTransactionNo (String TransactionNo);

	/** Get TransactionNo	  */
	public String getTransactionNo();

    /** Column name TransactionType */
    public static final String COLUMNNAME_TransactionType = "TransactionType";

	/** Set Transaction Type	  */
	public void setTransactionType (String TransactionType);

	/** Get Transaction Type	  */
	public String getTransactionType();

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

    /** Column name transperiod */
    public static final String COLUMNNAME_transperiod = "transperiod";

	/** Set Period	  */
	public void settransperiod (int transperiod);

	/** Get Period	  */
	public int gettransperiod();

    /** Column name TransTime */
    public static final String COLUMNNAME_TransTime = "TransTime";

	/** Set Transaction Time	  */
	public void setTransTime (Timestamp TransTime);

	/** Get Transaction Time	  */
	public Timestamp getTransTime();

    /** Column name TransType */
    public static final String COLUMNNAME_TransType = "TransType";

	/** Set Transaction Type	  */
	public void setTransType (String TransType);

	/** Get Transaction Type	  */
	public String getTransType();

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
