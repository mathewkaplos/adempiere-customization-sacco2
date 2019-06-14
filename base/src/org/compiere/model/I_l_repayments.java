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

/** Generated Interface for l_repayments
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_l_repayments 
{

    /** TableName=l_repayments */
    public static final String Table_Name = "l_repayments";

    /** AD_Table_ID=1000020 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name activation_count */
    public static final String COLUMNNAME_activation_count = "activation_count";

	/** Set Activation Count	  */
	public void setactivation_count (int activation_count);

	/** Get Activation Count	  */
	public int getactivation_count();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AdditionalCharges */
    public static final String COLUMNNAME_AdditionalCharges = "AdditionalCharges";

	/** Set AdditionalCharges	  */
	public void setAdditionalCharges (BigDecimal AdditionalCharges);

	/** Get AdditionalCharges	  */
	public BigDecimal getAdditionalCharges();

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

    /** Column name affects_debit_raise */
    public static final String COLUMNNAME_affects_debit_raise = "affects_debit_raise";

	/** Set Affects Monthly Debit Raise	  */
	public void setaffects_debit_raise (boolean affects_debit_raise);

	/** Get Affects Monthly Debit Raise	  */
	public boolean isaffects_debit_raise();

    /** Column name affectsdr */
    public static final String COLUMNNAME_affectsdr = "affectsdr";

	/** Set Affects DR	  */
	public void setaffectsdr (int affectsdr);

	/** Get Affects DR	  */
	public int getaffectsdr();

    /** Column name AmountInWords */
    public static final String COLUMNNAME_AmountInWords = "AmountInWords";

	/** Set AmountInWords	  */
	public void setAmountInWords (String AmountInWords);

	/** Get AmountInWords	  */
	public String getAmountInWords();

    /** Column name bankaccount */
    public static final String COLUMNNAME_bankaccount = "bankaccount";

	/** Set bankaccount	  */
	public void setbankaccount (String bankaccount);

	/** Get bankaccount	  */
	public String getbankaccount();

    /** Column name BankAccount_Acct */
    public static final String COLUMNNAME_BankAccount_Acct = "BankAccount_Acct";

	/** Set Bank Account	  */
	public void setBankAccount_Acct (String BankAccount_Acct);

	/** Get Bank Account	  */
	public String getBankAccount_Acct();

    /** Column name bankgl_Acct */
    public static final String COLUMNNAME_bankgl_Acct = "bankgl_Acct";

	/** Set Bank GL Code	  */
	public void setbankgl_Acct (int bankgl_Acct);

	/** Get Bank GL Code	  */
	public int getbankgl_Acct();

	public I_C_ValidCombination getbankgl_A() throws RuntimeException;

    /** Column name BranchID */
    public static final String COLUMNNAME_BranchID = "BranchID";

	/** Set Branch ID.
	  * Bank Branch ID
	  */
	public void setBranchID (int BranchID);

	/** Get Branch ID.
	  * Bank Branch ID
	  */
	public int getBranchID();

    /** Column name btn_add_charge */
    public static final String COLUMNNAME_btn_add_charge = "btn_add_charge";

	/** Set Add Charge	  */
	public void setbtn_add_charge (String btn_add_charge);

	/** Get Add Charge	  */
	public String getbtn_add_charge();

    /** Column name btn_save */
    public static final String COLUMNNAME_btn_save = "btn_save";

	/** Set Save	  */
	public void setbtn_save (String btn_save);

	/** Get Save	  */
	public String getbtn_save();

    /** Column name btn_view_schedule */
    public static final String COLUMNNAME_btn_view_schedule = "btn_view_schedule";

	/** Set View Schedule	  */
	public void setbtn_view_schedule (String btn_view_schedule);

	/** Get View Schedule	  */
	public String getbtn_view_schedule();

    /** Column name C_Bank_ID */
    public static final String COLUMNNAME_C_Bank_ID = "C_Bank_ID";

	/** Set Bank.
	  * Bank
	  */
	public void setC_Bank_ID (int C_Bank_ID);

	/** Get Bank.
	  * Bank
	  */
	public int getC_Bank_ID();

	public org.compiere.model.I_C_Bank getC_Bank() throws RuntimeException;

    /** Column name change_interest_if_clearing */
    public static final String COLUMNNAME_change_interest_if_clearing = "change_interest_if_clearing";

	/** Set Change Interest If Clearing Loan	  */
	public void setchange_interest_if_clearing (boolean change_interest_if_clearing);

	/** Get Change Interest If Clearing Loan	  */
	public boolean ischange_interest_if_clearing();

    /** Column name ChequeNo */
    public static final String COLUMNNAME_ChequeNo = "ChequeNo";

	/** Set Cheque No	  */
	public void setChequeNo (String ChequeNo);

	/** Get Cheque No	  */
	public String getChequeNo();

    /** Column name clear */
    public static final String COLUMNNAME_clear = "clear";

	/** Set Clear	  */
	public void setclear (boolean clear);

	/** Get Clear	  */
	public boolean isclear();

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

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

    /** Column name disp002 */
    public static final String COLUMNNAME_disp002 = "disp002";

	/** Set disp002	  */
	public void setdisp002 (boolean disp002);

	/** Get disp002	  */
	public boolean isdisp002();

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

    /** Column name expectedinterest */
    public static final String COLUMNNAME_expectedinterest = "expectedinterest";

	/** Set Expected Interest	  */
	public void setexpectedinterest (BigDecimal expectedinterest);

	/** Get Expected Interest	  */
	public BigDecimal getexpectedinterest();

    /** Column name ExtraInterest */
    public static final String COLUMNNAME_ExtraInterest = "ExtraInterest";

	/** Set Extra Interest	  */
	public void setExtraInterest (BigDecimal ExtraInterest);

	/** Get Extra Interest	  */
	public BigDecimal getExtraInterest();

    /** Column name GLAccount */
    public static final String COLUMNNAME_GLAccount = "GLAccount";

	/** Set GLAccount	  */
	public void setGLAccount (String GLAccount);

	/** Get GLAccount	  */
	public String getGLAccount();

    /** Column name gross_amount_due */
    public static final String COLUMNNAME_gross_amount_due = "gross_amount_due";

	/** Set Gross Amount Due	  */
	public void setgross_amount_due (BigDecimal gross_amount_due);

	/** Get Gross Amount Due	  */
	public BigDecimal getgross_amount_due();

    /** Column name Interest */
    public static final String COLUMNNAME_Interest = "Interest";

	/** Set Interest	  */
	public void setInterest (BigDecimal Interest);

	/** Get Interest	  */
	public BigDecimal getInterest();

    /** Column name interest_due */
    public static final String COLUMNNAME_interest_due = "interest_due";

	/** Set Total Interest Due	  */
	public void setinterest_due (BigDecimal interest_due);

	/** Get Total Interest Due	  */
	public BigDecimal getinterest_due();

    /** Column name interestgl_Acct */
    public static final String COLUMNNAME_interestgl_Acct = "interestgl_Acct";

	/** Set Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct);

	/** Get Interest GL Code	  */
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

    /** Column name is_refund */
    public static final String COLUMNNAME_is_refund = "is_refund";

	/** Set Is Refund	  */
	public void setis_refund (boolean is_refund);

	/** Get Is Refund	  */
	public boolean is_refund();

    /** Column name is_repayment */
    public static final String COLUMNNAME_is_repayment = "is_repayment";

	/** Set Is Repayment	  */
	public void setis_repayment (boolean is_repayment);

	/** Get Is Repayment	  */
	public boolean is_repayment();

    /** Column name is_topup */
    public static final String COLUMNNAME_is_topup = "is_topup";

	/** Set Is Top Up	  */
	public void setis_topup (boolean is_topup);

	/** Get Is Top Up	  */
	public boolean is_topup();

    /** Column name LAmount */
    public static final String COLUMNNAME_LAmount = "LAmount";

	/** Set LAmount	  */
	public void setLAmount (BigDecimal LAmount);

	/** Get LAmount	  */
	public BigDecimal getLAmount();

    /** Column name last_pay_date */
    public static final String COLUMNNAME_last_pay_date = "last_pay_date";

	/** Set Last Pay Date.
	  * (select last_pay_date from adempiere.s_loans s where s.s_loans_ID = l_repayments.s_loans_ID)
	  */
	public void setlast_pay_date (Timestamp last_pay_date);

	/** Get Last Pay Date.
	  * (select last_pay_date from adempiere.s_loans s where s.s_loans_ID = l_repayments.s_loans_ID)
	  */
	public Timestamp getlast_pay_date();

    /** Column name loanbalance */
    public static final String COLUMNNAME_loanbalance = "loanbalance";

	/** Set Loan Balance	  */
	public void setloanbalance (BigDecimal loanbalance);

	/** Get Loan Balance	  */
	public BigDecimal getloanbalance();

    /** Column name loan_gl_Acct */
    public static final String COLUMNNAME_loan_gl_Acct = "loan_gl_Acct";

	/** Set Loan GL Code	  */
	public void setloan_gl_Acct (int loan_gl_Acct);

	/** Get Loan GL Code	  */
	public int getloan_gl_Acct();

	public I_C_ValidCombination getloan_gl_A() throws RuntimeException;

    /** Column name loan_interest_balance */
    public static final String COLUMNNAME_loan_interest_balance = "loan_interest_balance";

	/** Set Loan Interest Balance	  */
	public void setloan_interest_balance (BigDecimal loan_interest_balance);

	/** Get Loan Interest Balance	  */
	public BigDecimal getloan_interest_balance();

    /** Column name LoanNo */
    public static final String COLUMNNAME_LoanNo = "LoanNo";

	/** Set LoanNo	  */
	public void setLoanNo (String LoanNo);

	/** Get LoanNo	  */
	public String getLoanNo();

    /** Column name loanpenalty */
    public static final String COLUMNNAME_loanpenalty = "loanpenalty";

	/** Set Loan Penalty	  */
	public void setloanpenalty (BigDecimal loanpenalty);

	/** Get Loan Penalty	  */
	public BigDecimal getloanpenalty();

    /** Column name l_repayments_ID */
    public static final String COLUMNNAME_l_repayments_ID = "l_repayments_ID";

	/** Set l_repayments ID	  */
	public void setl_repayments_ID (int l_repayments_ID);

	/** Get l_repayments ID	  */
	public int getl_repayments_ID();

    /** Column name memberid */
    public static final String COLUMNNAME_memberid = "memberid";

	/** Set memberid	  */
	public void setmemberid (int memberid);

	/** Get memberid	  */
	public int getmemberid();

    /** Column name monthclosingbal */
    public static final String COLUMNNAME_monthclosingbal = "monthclosingbal";

	/** Set Month Closing Balance	  */
	public void setmonthclosingbal (BigDecimal monthclosingbal);

	/** Get Month Closing Balance	  */
	public BigDecimal getmonthclosingbal();

    /** Column name monthopeningbal */
    public static final String COLUMNNAME_monthopeningbal = "monthopeningbal";

	/** Set Month Opening Bal	  */
	public void setmonthopeningbal (BigDecimal monthopeningbal);

	/** Get Month Opening Bal	  */
	public BigDecimal getmonthopeningbal();

    /** Column name newinterest */
    public static final String COLUMNNAME_newinterest = "newinterest";

	/** Set New Interest	  */
	public void setnewinterest (BigDecimal newinterest);

	/** Get New Interest	  */
	public BigDecimal getnewinterest();

    /** Column name offset_from_shares */
    public static final String COLUMNNAME_offset_from_shares = "offset_from_shares";

	/** Set Offset Total Amt From Shares/Share Transfer	  */
	public void setoffset_from_shares (boolean offset_from_shares);

	/** Get Offset Total Amt From Shares/Share Transfer	  */
	public boolean isoffset_from_shares();

    /** Column name othercharges */
    public static final String COLUMNNAME_othercharges = "othercharges";

	/** Set Other Charges	  */
	public void setothercharges (BigDecimal othercharges);

	/** Get Other Charges	  */
	public BigDecimal getothercharges();

    /** Column name pay_additional_charges_only */
    public static final String COLUMNNAME_pay_additional_charges_only = "pay_additional_charges_only";

	/** Set Pay Additional Charges Only	  */
	public void setpay_additional_charges_only (boolean pay_additional_charges_only);

	/** Get Pay Additional Charges Only	  */
	public boolean ispay_additional_charges_only();

    /** Column name PaymentAmount */
    public static final String COLUMNNAME_PaymentAmount = "PaymentAmount";

	/** Set Payment Amount	  */
	public void setPaymentAmount (BigDecimal PaymentAmount);

	/** Get Payment Amount	  */
	public BigDecimal getPaymentAmount();

    /** Column name PaymentDate */
    public static final String COLUMNNAME_PaymentDate = "PaymentDate";

	/** Set Payment Date	  */
	public void setPaymentDate (Timestamp PaymentDate);

	/** Get Payment Date	  */
	public Timestamp getPaymentDate();

    /** Column name PaymentNo */
    public static final String COLUMNNAME_PaymentNo = "PaymentNo";

	/** Set Payment No	  */
	public void setPaymentNo (String PaymentNo);

	/** Get Payment No	  */
	public String getPaymentNo();

    /** Column name paymode */
    public static final String COLUMNNAME_paymode = "paymode";

	/** Set Pay Mode	  */
	public void setpaymode (String paymode);

	/** Get Pay Mode	  */
	public String getpaymode();

    /** Column name pay_penalty_only */
    public static final String COLUMNNAME_pay_penalty_only = "pay_penalty_only";

	/** Set Pay Penalty Only	  */
	public void setpay_penalty_only (boolean pay_penalty_only);

	/** Get Pay Penalty Only	  */
	public boolean ispay_penalty_only();

    /** Column name penalty_due */
    public static final String COLUMNNAME_penalty_due = "penalty_due";

	/** Set Penalty Due	  */
	public void setpenalty_due (BigDecimal penalty_due);

	/** Get Penalty Due	  */
	public BigDecimal getpenalty_due();

    /** Column name penaltyglcode_Acct */
    public static final String COLUMNNAME_penaltyglcode_Acct = "penaltyglcode_Acct";

	/** Set Penalty GL Code	  */
	public void setpenaltyglcode_Acct (int penaltyglcode_Acct);

	/** Get Penalty GL Code	  */
	public int getpenaltyglcode_Acct();

	public I_C_ValidCombination getpenaltyglcode_A() throws RuntimeException;

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

    /** Column name Principal */
    public static final String COLUMNNAME_Principal = "Principal";

	/** Set Principal	  */
	public void setPrincipal (BigDecimal Principal);

	/** Get Principal	  */
	public BigDecimal getPrincipal();

    /** Column name print_a4 */
    public static final String COLUMNNAME_print_a4 = "print_a4";

	/** Set PRINT A4	  */
	public void setprint_a4 (String print_a4);

	/** Get PRINT A4	  */
	public String getprint_a4();

    /** Column name print_receipt */
    public static final String COLUMNNAME_print_receipt = "print_receipt";

	/** Set PRINT RECEIPT	  */
	public void setprint_receipt (String print_receipt);

	/** Get PRINT RECEIPT	  */
	public String getprint_receipt();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name ReceiptNo */
    public static final String COLUMNNAME_ReceiptNo = "ReceiptNo";

	/** Set Receipt No	  */
	public void setReceiptNo (String ReceiptNo);

	/** Get Receipt No	  */
	public String getReceiptNo();

    /** Column name ReceiptNoIssued */
    public static final String COLUMNNAME_ReceiptNoIssued = "ReceiptNoIssued";

	/** Set Receipt No Issued	  */
	public void setReceiptNoIssued (String ReceiptNoIssued);

	/** Get Receipt No Issued	  */
	public String getReceiptNoIssued();

    /** Column name refund_approvedby_ID */
    public static final String COLUMNNAME_refund_approvedby_ID = "refund_approvedby_ID";

	/** Set Refund/Top-Up Approved By	  */
	public void setrefund_approvedby_ID (int refund_approvedby_ID);

	/** Get Refund/Top-Up Approved By	  */
	public int getrefund_approvedby_ID();

	public org.compiere.model.I_AD_User getrefund_approvedby() throws RuntimeException;

    /** Column name Reverse */
    public static final String COLUMNNAME_Reverse = "Reverse";

	/** Set Reverse	  */
	public void setReverse (String Reverse);

	/** Get Reverse	  */
	public String getReverse();

    /** Column name Reversed */
    public static final String COLUMNNAME_Reversed = "Reversed";

	/** Set Reversed	  */
	public void setReversed (boolean Reversed);

	/** Get Reversed	  */
	public boolean isReversed();

    /** Column name serialid */
    public static final String COLUMNNAME_serialid = "serialid";

	/** Set serialid	  */
	public void setserialid (int serialid);

	/** Get serialid	  */
	public int getserialid();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

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

    /** Column name s_payment_mode_remittance_ID */
    public static final String COLUMNNAME_s_payment_mode_remittance_ID = "s_payment_mode_remittance_ID";

	/** Set Pay Mode	  */
	public void sets_payment_mode_remittance_ID (int s_payment_mode_remittance_ID);

	/** Get Pay Mode	  */
	public int gets_payment_mode_remittance_ID();

	public I_s_payment_mode gets_payment_mode_remittance() throws RuntimeException;

    /** Column name total_oc_due */
    public static final String COLUMNNAME_total_oc_due = "total_oc_due";

	/** Set Total O/C Due	  */
	public void settotal_oc_due (BigDecimal total_oc_due);

	/** Get Total O/C Due	  */
	public BigDecimal gettotal_oc_due();

    /** Column name TransactionPer */
    public static final String COLUMNNAME_TransactionPer = "TransactionPer";

	/** Set Transaction Period	  */
	public void setTransactionPer (int TransactionPer);

	/** Get Transaction Period	  */
	public int getTransactionPer();

    /** Column name TransactionTime */
    public static final String COLUMNNAME_TransactionTime = "TransactionTime";

	/** Set Transaction Time	  */
	public void setTransactionTime (Timestamp TransactionTime);

	/** Get Transaction Time	  */
	public Timestamp getTransactionTime();

    /** Column name TransactionType */
    public static final String COLUMNNAME_TransactionType = "TransactionType";

	/** Set Transaction Type	  */
	public void setTransactionType (String TransactionType);

	/** Get Transaction Type	  */
	public String getTransactionType();

    /** Column name transactionyear */
    public static final String COLUMNNAME_transactionyear = "transactionyear";

	/** Set Transaction Year	  */
	public void settransactionyear (int transactionyear);

	/** Get Transaction Year	  */
	public int gettransactionyear();

    /** Column name Transid */
    public static final String COLUMNNAME_Transid = "Transid";

	/** Set Transid	  */
	public void setTransid (int Transid);

	/** Get Transid	  */
	public int getTransid();

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

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name VoucherNo */
    public static final String COLUMNNAME_VoucherNo = "VoucherNo";

	/** Set Voucher No	  */
	public void setVoucherNo (String VoucherNo);

	/** Get Voucher No	  */
	public String getVoucherNo();

    /** Column name write_off_gl_Acct */
    public static final String COLUMNNAME_write_off_gl_Acct = "write_off_gl_Acct";

	/** Set Write-Off GL Expense Account	  */
	public void setwrite_off_gl_Acct (int write_off_gl_Acct);

	/** Get Write-Off GL Expense Account	  */
	public int getwrite_off_gl_Acct();

	public I_C_ValidCombination getwrite_off_gl_A() throws RuntimeException;

    /** Column name write_off_loan */
    public static final String COLUMNNAME_write_off_loan = "write_off_loan";

	/** Set Write Off Loan	  */
	public void setwrite_off_loan (boolean write_off_loan);

	/** Get Write Off Loan	  */
	public boolean iswrite_off_loan();
}
