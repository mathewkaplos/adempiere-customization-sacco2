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

/** Generated Interface for s_loans
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_loans 
{

    /** TableName=s_loans */
    public static final String Table_Name = "s_loans";

    /** AD_Table_ID=1000015 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name acceptdate */
    public static final String COLUMNNAME_acceptdate = "acceptdate";

	/** Set Accept Date	  */
	public void setacceptdate (Timestamp acceptdate);

	/** Get Accept Date	  */
	public Timestamp getacceptdate();

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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name affectsdr */
    public static final String COLUMNNAME_affectsdr = "affectsdr";

	/** Set Affects DR	  */
	public void setaffectsdr (boolean affectsdr);

	/** Get Affects DR	  */
	public boolean isaffectsdr();

    /** Column name amountqualified */
    public static final String COLUMNNAME_amountqualified = "amountqualified";

	/** Set Amount Qualified	  */
	public void setamountqualified (BigDecimal amountqualified);

	/** Get Amount Qualified	  */
	public BigDecimal getamountqualified();

    /** Column name annualchargesloaded */
    public static final String COLUMNNAME_annualchargesloaded = "annualchargesloaded";

	/** Set Annual Charges Loaded	  */
	public void setannualchargesloaded (BigDecimal annualchargesloaded);

	/** Get Annual Charges Loaded	  */
	public BigDecimal getannualchargesloaded();

    /** Column name annualchargesseparate */
    public static final String COLUMNNAME_annualchargesseparate = "annualchargesseparate";

	/** Set Annual Charges Separate	  */
	public void setannualchargesseparate (BigDecimal annualchargesseparate);

	/** Get Annual Charges Separate	  */
	public BigDecimal getannualchargesseparate();

    /** Column name appliedamount */
    public static final String COLUMNNAME_appliedamount = "appliedamount";

	/** Set Applied Amount	  */
	public void setappliedamount (BigDecimal appliedamount);

	/** Get Applied Amount	  */
	public BigDecimal getappliedamount();

    /** Column name approval_done */
    public static final String COLUMNNAME_approval_done = "approval_done";

	/** Set approval_done	  */
	public void setapproval_done (boolean approval_done);

	/** Get approval_done	  */
	public boolean isapproval_done();

    /** Column name approvalrejectionremarks */
    public static final String COLUMNNAME_approvalrejectionremarks = "approvalrejectionremarks";

	/** Set Rejection Remarks	  */
	public void setapprovalrejectionremarks (String approvalrejectionremarks);

	/** Get Rejection Remarks	  */
	public String getapprovalrejectionremarks();

    /** Column name approvedamount */
    public static final String COLUMNNAME_approvedamount = "approvedamount";

	/** Set Approved Amount	  */
	public void setapprovedamount (BigDecimal approvedamount);

	/** Get Approved Amount	  */
	public BigDecimal getapprovedamount();

    /** Column name approveddate */
    public static final String COLUMNNAME_approveddate = "approveddate";

	/** Set Approved Date	  */
	public void setapproveddate (Timestamp approveddate);

	/** Get Approved Date	  */
	public Timestamp getapproveddate();

    /** Column name bankgl_Acct */
    public static final String COLUMNNAME_bankgl_Acct = "bankgl_Acct";

	/** Set Bank GL Code	  */
	public void setbankgl_Acct (int bankgl_Acct);

	/** Get Bank GL Code	  */
	public int getbankgl_Acct();

	public I_C_ValidCombination getbankgl_A() throws RuntimeException;

    /** Column name btn_appraisal_approve */
    public static final String COLUMNNAME_btn_appraisal_approve = "btn_appraisal_approve";

	/** Set Approve Appraisal	  */
	public void setbtn_appraisal_approve (String btn_appraisal_approve);

	/** Get Approve Appraisal	  */
	public String getbtn_appraisal_approve();

    /** Column name btn_appraisal_reject */
    public static final String COLUMNNAME_btn_appraisal_reject = "btn_appraisal_reject";

	/** Set Reject Appraisal	  */
	public void setbtn_appraisal_reject (String btn_appraisal_reject);

	/** Get Reject Appraisal	  */
	public String getbtn_appraisal_reject();

    /** Column name btn_approve_reject_save */
    public static final String COLUMNNAME_btn_approve_reject_save = "btn_approve_reject_save";

	/** Set Save Approval/Rejection	  */
	public void setbtn_approve_reject_save (String btn_approve_reject_save);

	/** Get Save Approval/Rejection	  */
	public String getbtn_approve_reject_save();

    /** Column name btn_preprint_cheque */
    public static final String COLUMNNAME_btn_preprint_cheque = "btn_preprint_cheque";

	/** Set Pre-Print Cheques	  */
	public void setbtn_preprint_cheque (String btn_preprint_cheque);

	/** Get Pre-Print Cheques	  */
	public String getbtn_preprint_cheque();

    /** Column name btn_print_cheque */
    public static final String COLUMNNAME_btn_print_cheque = "btn_print_cheque";

	/** Set Print Cheque	  */
	public void setbtn_print_cheque (String btn_print_cheque);

	/** Get Print Cheque	  */
	public String getbtn_print_cheque();

    /** Column name btn_repaymode_reverse */
    public static final String COLUMNNAME_btn_repaymode_reverse = "btn_repaymode_reverse";

	/** Set Reverse Status[Payment Mode]	  */
	public void setbtn_repaymode_reverse (String btn_repaymode_reverse);

	/** Get Reverse Status[Payment Mode]	  */
	public String getbtn_repaymode_reverse();

    /** Column name btn_repaymode_save */
    public static final String COLUMNNAME_btn_repaymode_save = "btn_repaymode_save";

	/** Set Save [Payment Mode]	  */
	public void setbtn_repaymode_save (String btn_repaymode_save);

	/** Get Save [Payment Mode]	  */
	public String getbtn_repaymode_save();

    /** Column name btn_reverse_cheque_collection */
    public static final String COLUMNNAME_btn_reverse_cheque_collection = "btn_reverse_cheque_collection";

	/** Set Reverse Status[Checque Collection]	  */
	public void setbtn_reverse_cheque_collection (String btn_reverse_cheque_collection);

	/** Get Reverse Status[Checque Collection]	  */
	public String getbtn_reverse_cheque_collection();

    /** Column name btn_reverse_cheque_writing */
    public static final String COLUMNNAME_btn_reverse_cheque_writing = "btn_reverse_cheque_writing";

	/** Set Revers Status[Cheque Writing]	  */
	public void setbtn_reverse_cheque_writing (String btn_reverse_cheque_writing);

	/** Get Revers Status[Cheque Writing]	  */
	public String getbtn_reverse_cheque_writing();

    /** Column name btn_save_cheque_collection */
    public static final String COLUMNNAME_btn_save_cheque_collection = "btn_save_cheque_collection";

	/** Set Save[Cheque Collection]	  */
	public void setbtn_save_cheque_collection (String btn_save_cheque_collection);

	/** Get Save[Cheque Collection]	  */
	public String getbtn_save_cheque_collection();

    /** Column name btn_save_cheque_writing */
    public static final String COLUMNNAME_btn_save_cheque_writing = "btn_save_cheque_writing";

	/** Set Save [Cheque Writing]	  */
	public void setbtn_save_cheque_writing (String btn_save_cheque_writing);

	/** Get Save [Cheque Writing]	  */
	public String getbtn_save_cheque_writing();

    /** Column name btn_view_schedule */
    public static final String COLUMNNAME_btn_view_schedule = "btn_view_schedule";

	/** Set View Schedule	  */
	public void setbtn_view_schedule (String btn_view_schedule);

	/** Get View Schedule	  */
	public String getbtn_view_schedule();

    /** Column name calcfied */
    public static final String COLUMNNAME_calcfied = "calcfied";

	/** Set calcfied	  */
	public void setcalcfied (String calcfied);

	/** Get calcfied	  */
	public String getcalcfied();

    /** Column name cashamount */
    public static final String COLUMNNAME_cashamount = "cashamount";

	/** Set Cash Amount	  */
	public void setcashamount (BigDecimal cashamount);

	/** Get Cash Amount	  */
	public BigDecimal getcashamount();

    /** Column name cheque_collection_date */
    public static final String COLUMNNAME_cheque_collection_date = "cheque_collection_date";

	/** Set Cheque Collection Date	  */
	public void setcheque_collection_date (Timestamp cheque_collection_date);

	/** Get Cheque Collection Date	  */
	public Timestamp getcheque_collection_date();

    /** Column name cheque_collection_done */
    public static final String COLUMNNAME_cheque_collection_done = "cheque_collection_done";

	/** Set cheque_collection_done	  */
	public void setcheque_collection_done (boolean cheque_collection_done);

	/** Get cheque_collection_done	  */
	public boolean ischeque_collection_done();

    /** Column name cheque_collector_changed */
    public static final String COLUMNNAME_cheque_collector_changed = "cheque_collector_changed";

	/** Set cheque_collector_changed	  */
	public void setcheque_collector_changed (boolean cheque_collector_changed);

	/** Get cheque_collector_changed	  */
	public boolean ischeque_collector_changed();

    /** Column name cheque_writing_done */
    public static final String COLUMNNAME_cheque_writing_done = "cheque_writing_done";

	/** Set cheque_writing_done	  */
	public void setcheque_writing_done (boolean cheque_writing_done);

	/** Get cheque_writing_done	  */
	public boolean ischeque_writing_done();

    /** Column name chequeamount */
    public static final String COLUMNNAME_chequeamount = "chequeamount";

	/** Set Cheque Amount	  */
	public void setchequeamount (BigDecimal chequeamount);

	/** Get Cheque Amount	  */
	public BigDecimal getchequeamount();

    /** Column name chequetype */
    public static final String COLUMNNAME_chequetype = "chequetype";

	/** Set Cheque Type	  */
	public void setchequetype (String chequetype);

	/** Get Cheque Type	  */
	public String getchequetype();

    /** Column name collectcash */
    public static final String COLUMNNAME_collectcash = "collectcash";

	/** Set Collect Cash	  */
	public void setcollectcash (String collectcash);

	/** Get Collect Cash	  */
	public String getcollectcash();

    /** Column name collected */
    public static final String COLUMNNAME_collected = "collected";

	/** Set Collected	  */
	public void setcollected (boolean collected);

	/** Get Collected	  */
	public boolean iscollected();

    /** Column name collectedby */
    public static final String COLUMNNAME_collectedby = "collectedby";

	/** Set Collected By	  */
	public void setcollectedby (String collectedby);

	/** Get Collected By	  */
	public String getcollectedby();

    /** Column name collectedchequeamount */
    public static final String COLUMNNAME_collectedchequeamount = "collectedchequeamount";

	/** Set Collected Cheque Amount	  */
	public void setcollectedchequeamount (BigDecimal collectedchequeamount);

	/** Get Collected Cheque Amount	  */
	public BigDecimal getcollectedchequeamount();

    /** Column name collecteddate */
    public static final String COLUMNNAME_collecteddate = "collecteddate";

	/** Set Collected Date	  */
	public void setcollecteddate (Timestamp collecteddate);

	/** Get Collected Date	  */
	public Timestamp getcollecteddate();

    /** Column name collectionremarks */
    public static final String COLUMNNAME_collectionremarks = "collectionremarks";

	/** Set Collection Remarks	  */
	public void setcollectionremarks (String collectionremarks);

	/** Get Collection Remarks	  */
	public String getcollectionremarks();

    /** Column name collector_id_no */
    public static final String COLUMNNAME_collector_id_no = "collector_id_no";

	/** Set Collector ID No:	  */
	public void setcollector_id_no (String collector_id_no);

	/** Get Collector ID No:	  */
	public String getcollector_id_no();

    /** Column name constantrepayamnt */
    public static final String COLUMNNAME_constantrepayamnt = "constantrepayamnt";

	/** Set Cons. Repay Amt	  */
	public void setconstantrepayamnt (BigDecimal constantrepayamnt);

	/** Get Cons. Repay Amt	  */
	public BigDecimal getconstantrepayamnt();

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

    /** Column name date_debited */
    public static final String COLUMNNAME_date_debited = "date_debited";

	/** Set Date Debited	  */
	public void setdate_debited (Timestamp date_debited);

	/** Get Date Debited	  */
	public Timestamp getdate_debited();

    /** Column name dateinformed */
    public static final String COLUMNNAME_dateinformed = "dateinformed";

	/** Set Date Informed	  */
	public void setdateinformed (Timestamp dateinformed);

	/** Get Date Informed	  */
	public Timestamp getdateinformed();

    /** Column name debitfosa */
    public static final String COLUMNNAME_debitfosa = "debitfosa";

	/** Set Debit Fosa	  */
	public void setdebitfosa (boolean debitfosa);

	/** Get Debit Fosa	  */
	public boolean isdebitfosa();

    /** Column name deffered */
    public static final String COLUMNNAME_deffered = "deffered";

	/** Set Deffered	  */
	public void setdeffered (boolean deffered);

	/** Get Deffered	  */
	public boolean isdeffered();

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

    /** Column name existingloan */
    public static final String COLUMNNAME_existingloan = "existingloan";

	/** Set Existing Loan	  */
	public void setexistingloan (boolean existingloan);

	/** Get Existing Loan	  */
	public boolean isexistingloan();

    /** Column name expectedrepaydate */
    public static final String COLUMNNAME_expectedrepaydate = "expectedrepaydate";

	/** Set Expected Repay Date	  */
	public void setexpectedrepaydate (Timestamp expectedrepaydate);

	/** Get Expected Repay Date	  */
	public Timestamp getexpectedrepaydate();

    /** Column name freeshares */
    public static final String COLUMNNAME_freeshares = "freeshares";

	/** Set Free Shares	  */
	public void setfreeshares (BigDecimal freeshares);

	/** Get Free Shares	  */
	public BigDecimal getfreeshares();

    /** Column name generate_schedule */
    public static final String COLUMNNAME_generate_schedule = "generate_schedule";

	/** Set GENERATE SCHEDULE	  */
	public void setgenerate_schedule (String generate_schedule);

	/** Get GENERATE SCHEDULE	  */
	public String getgenerate_schedule();

    /** Column name initial_amount */
    public static final String COLUMNNAME_initial_amount = "initial_amount";

	/** Set Initial Amount	  */
	public void setinitial_amount (BigDecimal initial_amount);

	/** Get Initial Amount	  */
	public BigDecimal getinitial_amount();

    /** Column name insuranceeffectdate */
    public static final String COLUMNNAME_insuranceeffectdate = "insuranceeffectdate";

	/** Set Insurance  Date	  */
	public void setinsuranceeffectdate (Timestamp insuranceeffectdate);

	/** Get Insurance  Date	  */
	public Timestamp getinsuranceeffectdate();

    /** Column name intbalance */
    public static final String COLUMNNAME_intbalance = "intbalance";

	/** Set Interest Balance	  */
	public void setintbalance (BigDecimal intbalance);

	/** Get Interest Balance	  */
	public BigDecimal getintbalance();

    /** Column name interest_recovery */
    public static final String COLUMNNAME_interest_recovery = "interest_recovery";

	/** Set Int. Recovery Mode	  */
	public void setinterest_recovery (String interest_recovery);

	/** Get Int. Recovery Mode	  */
	public String getinterest_recovery();

    /** Column name interestpaid */
    public static final String COLUMNNAME_interestpaid = "interestpaid";

	/** Set Interest Paid	  */
	public void setinterestpaid (BigDecimal interestpaid);

	/** Get Interest Paid	  */
	public BigDecimal getinterestpaid();

    /** Column name interesttype */
    public static final String COLUMNNAME_interesttype = "interesttype";

	/** Set Interest Type	  */
	public void setinteresttype (String interesttype);

	/** Get Interest Type	  */
	public String getinteresttype();

    /** Column name intfirst */
    public static final String COLUMNNAME_intfirst = "intfirst";

	/** Set Recover Int. First	  */
	public void setintfirst (BigDecimal intfirst);

	/** Get Recover Int. First	  */
	public BigDecimal getintfirst();

    /** Column name intperiod */
    public static final String COLUMNNAME_intperiod = "intperiod";

	/** Set Repay Period	  */
	public void setintperiod (int intperiod);

	/** Get Repay Period	  */
	public int getintperiod();

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

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name isrefinancing */
    public static final String COLUMNNAME_isrefinancing = "isrefinancing";

	/** Set Is Refinancing	  */
	public void setisrefinancing (boolean isrefinancing);

	/** Get Is Refinancing	  */
	public boolean isrefinancing();

    /** Column name issuecash */
    public static final String COLUMNNAME_issuecash = "issuecash";

	/** Set Issue Cash	  */
	public void setissuecash (String issuecash);

	/** Get Issue Cash	  */
	public String getissuecash();

    /** Column name issuedby */
    public static final String COLUMNNAME_issuedby = "issuedby";

	/** Set Issued By	  */
	public void setissuedby (String issuedby);

	/** Get Issued By	  */
	public String getissuedby();

    /** Column name last_pay_date */
    public static final String COLUMNNAME_last_pay_date = "last_pay_date";

	/** Set Last Pay Date	  */
	public void setlast_pay_date (Timestamp last_pay_date);

	/** Get Last Pay Date	  */
	public Timestamp getlast_pay_date();

    /** Column name lastrescheduledmonth */
    public static final String COLUMNNAME_lastrescheduledmonth = "lastrescheduledmonth";

	/** Set Last Rescheduled Month	  */
	public void setlastrescheduledmonth (int lastrescheduledmonth);

	/** Get Last Rescheduled Month	  */
	public int getlastrescheduledmonth();

    /** Column name lastrescheduledyear */
    public static final String COLUMNNAME_lastrescheduledyear = "lastrescheduledyear";

	/** Set Last Rescheduled Year	  */
	public void setlastrescheduledyear (int lastrescheduledyear);

	/** Get Last Rescheduled Year	  */
	public int getlastrescheduledyear();

    /** Column name loan_gl_Acct */
    public static final String COLUMNNAME_loan_gl_Acct = "loan_gl_Acct";

	/** Set Loan GL Code	  */
	public void setloan_gl_Acct (int loan_gl_Acct);

	/** Get Loan GL Code	  */
	public int getloan_gl_Acct();

	public I_C_ValidCombination getloan_gl_A() throws RuntimeException;

    /** Column name loanamount */
    public static final String COLUMNNAME_loanamount = "loanamount";

	/** Set Loan Amount	  */
	public void setloanamount (BigDecimal loanamount);

	/** Get Loan Amount	  */
	public BigDecimal getloanamount();

    /** Column name loanamountpaid */
    public static final String COLUMNNAME_loanamountpaid = "loanamountpaid";

	/** Set Amount Paid	  */
	public void setloanamountpaid (BigDecimal loanamountpaid);

	/** Get Amount Paid	  */
	public BigDecimal getloanamountpaid();

    /** Column name loanappdate */
    public static final String COLUMNNAME_loanappdate = "loanappdate";

	/** Set Application Date:	  */
	public void setloanappdate (Timestamp loanappdate);

	/** Get Application Date:	  */
	public Timestamp getloanappdate();

    /** Column name loanbalance */
    public static final String COLUMNNAME_loanbalance = "loanbalance";

	/** Set Loan Balance	  */
	public void setloanbalance (BigDecimal loanbalance);

	/** Get Loan Balance	  */
	public BigDecimal getloanbalance();

    /** Column name loancode */
    public static final String COLUMNNAME_loancode = "loancode";

	/** Set Ref #	  */
	public void setloancode (String loancode);

	/** Get Ref #	  */
	public String getloancode();

    /** Column name loaneffectdate */
    public static final String COLUMNNAME_loaneffectdate = "loaneffectdate";

	/** Set Effect Period	  */
	public void setloaneffectdate (Timestamp loaneffectdate);

	/** Get Effect Period	  */
	public Timestamp getloaneffectdate();

    /** Column name loanenddate */
    public static final String COLUMNNAME_loanenddate = "loanenddate";

	/** Set loanenddate	  */
	public void setloanenddate (Timestamp loanenddate);

	/** Get loanenddate	  */
	public Timestamp getloanenddate();

    /** Column name loangrosspay */
    public static final String COLUMNNAME_loangrosspay = "loangrosspay";

	/** Set Gross Pay	  */
	public void setloangrosspay (BigDecimal loangrosspay);

	/** Get Gross Pay	  */
	public BigDecimal getloangrosspay();

    /** Column name loaninterestamount */
    public static final String COLUMNNAME_loaninterestamount = "loaninterestamount";

	/** Set Interest Amount	  */
	public void setloaninterestamount (BigDecimal loaninterestamount);

	/** Get Interest Amount	  */
	public BigDecimal getloaninterestamount();

    /** Column name loaninterestrate */
    public static final String COLUMNNAME_loaninterestrate = "loaninterestrate";

	/** Set Interest Rate	  */
	public void setloaninterestrate (BigDecimal loaninterestrate);

	/** Get Interest Rate	  */
	public BigDecimal getloaninterestrate();

    /** Column name loanmanualref */
    public static final String COLUMNNAME_loanmanualref = "loanmanualref";

	/** Set Manual Ref #	  */
	public void setloanmanualref (String loanmanualref);

	/** Get Manual Ref #	  */
	public String getloanmanualref();

    /** Column name loannettamount */
    public static final String COLUMNNAME_loannettamount = "loannettamount";

	/** Set loan Nett Amount	  */
	public void setloannettamount (BigDecimal loannettamount);

	/** Get loan Nett Amount	  */
	public BigDecimal getloannettamount();

    /** Column name loannettpay */
    public static final String COLUMNNAME_loannettpay = "loannettpay";

	/** Set Nett Pay	  */
	public void setloannettpay (BigDecimal loannettpay);

	/** Get Nett Pay	  */
	public BigDecimal getloannettpay();

    /** Column name loanorigamount */
    public static final String COLUMNNAME_loanorigamount = "loanorigamount";

	/** Set Loan Original Amount	  */
	public void setloanorigamount (String loanorigamount);

	/** Get Loan Original Amount	  */
	public String getloanorigamount();

    /** Column name loanpaymode_done */
    public static final String COLUMNNAME_loanpaymode_done = "loanpaymode_done";

	/** Set loanpaymode_done	  */
	public void setloanpaymode_done (boolean loanpaymode_done);

	/** Get loanpaymode_done	  */
	public boolean isloanpaymode_done();

    /** Column name loanpenalty */
    public static final String COLUMNNAME_loanpenalty = "loanpenalty";

	/** Set Loan Penalty	  */
	public void setloanpenalty (BigDecimal loanpenalty);

	/** Get Loan Penalty	  */
	public BigDecimal getloanpenalty();

    /** Column name loanpenaltyrate */
    public static final String COLUMNNAME_loanpenaltyrate = "loanpenaltyrate";

	/** Set Penalty Rate	  */
	public void setloanpenaltyrate (int loanpenaltyrate);

	/** Get Penalty Rate	  */
	public int getloanpenaltyrate();

    /** Column name loanrefinanced */
    public static final String COLUMNNAME_loanrefinanced = "loanrefinanced";

	/** Set Loan Refinanced	  */
	public void setloanrefinanced (boolean loanrefinanced);

	/** Get Loan Refinanced	  */
	public boolean isloanrefinanced();

    /** Column name loanrepayamount */
    public static final String COLUMNNAME_loanrepayamount = "loanrepayamount";

	/** Set Repayment Amount	  */
	public void setloanrepayamount (BigDecimal loanrepayamount);

	/** Get Repayment Amount	  */
	public BigDecimal getloanrepayamount();

    /** Column name loanrepayamt */
    public static final String COLUMNNAME_loanrepayamt = "loanrepayamt";

	/** Set Repay Amount	  */
	public void setloanrepayamt (BigDecimal loanrepayamt);

	/** Get Repay Amount	  */
	public BigDecimal getloanrepayamt();

    /** Column name loanrepayperiod */
    public static final String COLUMNNAME_loanrepayperiod = "loanrepayperiod";

	/** Set Repay Period	  */
	public void setloanrepayperiod (int loanrepayperiod);

	/** Get Repay Period	  */
	public int getloanrepayperiod();

    /** Column name loanstatus */
    public static final String COLUMNNAME_loanstatus = "loanstatus";

	/** Set Loan Status	  */
	public void setloanstatus (String loanstatus);

	/** Get Loan Status	  */
	public String getloanstatus();

    /** Column name loantransdate */
    public static final String COLUMNNAME_loantransdate = "loantransdate";

	/** Set loantransdate	  */
	public void setloantransdate (Timestamp loantransdate);

	/** Get loantransdate	  */
	public Timestamp getloantransdate();

    /** Column name lstatus */
    public static final String COLUMNNAME_lstatus = "lstatus";

	/** Set lstatus	  */
	public void setlstatus (String lstatus);

	/** Get lstatus	  */
	public String getlstatus();

    /** Column name maximuminterest */
    public static final String COLUMNNAME_maximuminterest = "maximuminterest";

	/** Set Maximum Interest	  */
	public void setmaximuminterest (BigDecimal maximuminterest);

	/** Get Maximum Interest	  */
	public BigDecimal getmaximuminterest();

    /** Column name maximumloan */
    public static final String COLUMNNAME_maximumloan = "maximumloan";

	/** Set Maximum Loan	  */
	public void setmaximumloan (BigDecimal maximumloan);

	/** Get Maximum Loan	  */
	public BigDecimal getmaximumloan();

    /** Column name member_no */
    public static final String COLUMNNAME_member_no = "member_no";

	/** Set Member NO	  */
	public void setmember_no (String member_no);

	/** Get Member NO	  */
	public String getmember_no();

    /** Column name membershares */
    public static final String COLUMNNAME_membershares = "membershares";

	/** Set Member Shares	  */
	public void setmembershares (BigDecimal membershares);

	/** Get Member Shares	  */
	public BigDecimal getmembershares();

    /** Column name minimumloan */
    public static final String COLUMNNAME_minimumloan = "minimumloan";

	/** Set Minimum Loan	  */
	public void setminimumloan (BigDecimal minimumloan);

	/** Get Minimum Loan	  */
	public BigDecimal getminimumloan();

    /** Column name monthlychargesloaded */
    public static final String COLUMNNAME_monthlychargesloaded = "monthlychargesloaded";

	/** Set Monthly Charges Loaded	  */
	public void setmonthlychargesloaded (BigDecimal monthlychargesloaded);

	/** Get Monthly Charges Loaded	  */
	public BigDecimal getmonthlychargesloaded();

    /** Column name monthlychargesseparate */
    public static final String COLUMNNAME_monthlychargesseparate = "monthlychargesseparate";

	/** Set Monthly Charges Separate	  */
	public void setmonthlychargesseparate (BigDecimal monthlychargesseparate);

	/** Get Monthly Charges Separate	  */
	public BigDecimal getmonthlychargesseparate();

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

    /** Column name newloan */
    public static final String COLUMNNAME_newloan = "newloan";

	/** Set New Loan	  */
	public void setnewloan (boolean newloan);

	/** Get New Loan	  */
	public boolean isnewloan();

    /** Column name newloanrepayamount */
    public static final String COLUMNNAME_newloanrepayamount = "newloanrepayamount";

	/** Set New Loan Repayamount	  */
	public void setnewloanrepayamount (BigDecimal newloanrepayamount);

	/** Get New Loan Repayamount	  */
	public BigDecimal getnewloanrepayamount();

    /** Column name oldbalance */
    public static final String COLUMNNAME_oldbalance = "oldbalance";

	/** Set Old Balance	  */
	public void setoldbalance (BigDecimal oldbalance);

	/** Get Old Balance	  */
	public BigDecimal getoldbalance();

    /** Column name open_repay_amount */
    public static final String COLUMNNAME_open_repay_amount = "open_repay_amount";

	/** Set Open Repay Amount	  */
	public void setopen_repay_amount (boolean open_repay_amount);

	/** Get Open Repay Amount	  */
	public boolean isopen_repay_amount();

    /** Column name open_repay_period */
    public static final String COLUMNNAME_open_repay_period = "open_repay_period";

	/** Set Open Repay Period	  */
	public void setopen_repay_period (boolean open_repay_period);

	/** Get Open Repay Period	  */
	public boolean isopen_repay_period();

    /** Column name othercharges */
    public static final String COLUMNNAME_othercharges = "othercharges";

	/** Set Other Charges	  */
	public void setothercharges (BigDecimal othercharges);

	/** Get Other Charges	  */
	public BigDecimal getothercharges();

    /** Column name paymode */
    public static final String COLUMNNAME_paymode = "paymode";

	/** Set Pay Mode	  */
	public void setpaymode (String paymode);

	/** Get Pay Mode	  */
	public String getpaymode();

    /** Column name payroll_no */
    public static final String COLUMNNAME_payroll_no = "payroll_no";

	/** Set Payroll NO	  */
	public void setpayroll_no (String payroll_no);

	/** Get Payroll NO	  */
	public String getpayroll_no();

    /** Column name paytype */
    public static final String COLUMNNAME_paytype = "paytype";

	/** Set Pay Type	  */
	public void setpaytype (String paytype);

	/** Get Pay Type	  */
	public String getpaytype();

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

    /** Column name postgl */
    public static final String COLUMNNAME_postgl = "postgl";

	/** Set Post To GL	  */
	public void setpostgl (boolean postgl);

	/** Get Post To GL	  */
	public boolean ispostgl();

    /** Column name readycheque */
    public static final String COLUMNNAME_readycheque = "readycheque";

	/** Set Ready Cheque	  */
	public void setreadycheque (boolean readycheque);

	/** Get Ready Cheque	  */
	public boolean isreadycheque();

    /** Column name readychequeno */
    public static final String COLUMNNAME_readychequeno = "readychequeno";

	/** Set Cheque NO	  */
	public void setreadychequeno (String readychequeno);

	/** Get Cheque NO	  */
	public String getreadychequeno();

    /** Column name readydate */
    public static final String COLUMNNAME_readydate = "readydate";

	/** Set Ready Cheque Date	  */
	public void setreadydate (Timestamp readydate);

	/** Get Ready Cheque Date	  */
	public Timestamp getreadydate();

    /** Column name readyremarks */
    public static final String COLUMNNAME_readyremarks = "readyremarks";

	/** Set Ready Cheque Remarks	  */
	public void setreadyremarks (String readyremarks);

	/** Get Ready Cheque Remarks	  */
	public String getreadyremarks();

    /** Column name rejected */
    public static final String COLUMNNAME_rejected = "rejected";

	/** Set Rejected	  */
	public void setrejected (boolean rejected);

	/** Get Rejected	  */
	public boolean isrejected();

    /** Column name rejecteddate */
    public static final String COLUMNNAME_rejecteddate = "rejecteddate";

	/** Set Rejected Date	  */
	public void setrejecteddate (Timestamp rejecteddate);

	/** Get Rejected Date	  */
	public Timestamp getrejecteddate();

    /** Column name repaymode */
    public static final String COLUMNNAME_repaymode = "repaymode";

	/** Set Repay Mode	  */
	public void setrepaymode (String repaymode);

	/** Get Repay Mode	  */
	public String getrepaymode();

    /** Column name s_branch_ID */
    public static final String COLUMNNAME_s_branch_ID = "s_branch_ID";

	/** Set Member Branch	  */
	public void sets_branch_ID (int s_branch_ID);

	/** Get Member Branch	  */
	public int gets_branch_ID();

	public I_s_branch gets_branch() throws RuntimeException;

    /** Column name s_loanpurpose_ID */
    public static final String COLUMNNAME_s_loanpurpose_ID = "s_loanpurpose_ID";

	/** Set Loan Purpose 	  */
	public void sets_loanpurpose_ID (int s_loanpurpose_ID);

	/** Get Loan Purpose 	  */
	public int gets_loanpurpose_ID();

	public I_s_loanpurpose gets_loanpurpose() throws RuntimeException;

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

    /** Column name s_loantype_ID */
    public static final String COLUMNNAME_s_loantype_ID = "s_loantype_ID";

	/** Set Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID);

	/** Get Loan Type	  */
	public int gets_loantype_ID();

	public I_s_loantype gets_loantype() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name seen_documents */
    public static final String COLUMNNAME_seen_documents = "seen_documents";

	/** Set Seen And Checked All Supporting Documents	  */
	public void setseen_documents (boolean seen_documents);

	/** Get Seen And Checked All Supporting Documents	  */
	public boolean isseen_documents();

    /** Column name serialid */
    public static final String COLUMNNAME_serialid = "serialid";

	/** Set serialid	  */
	public void setserialid (int serialid);

	/** Get serialid	  */
	public int getserialid();

    /** Column name statementbal */
    public static final String COLUMNNAME_statementbal = "statementbal";

	/** Set Statement Balance	  */
	public void setstatementbal (BigDecimal statementbal);

	/** Get Statement Balance	  */
	public BigDecimal getstatementbal();

    /** Column name suminterest */
    public static final String COLUMNNAME_suminterest = "suminterest";

	/** Set Sum Interest	  */
	public void setsuminterest (BigDecimal suminterest);

	/** Get Sum Interest	  */
	public BigDecimal getsuminterest();

    /** Column name sumothercharges */
    public static final String COLUMNNAME_sumothercharges = "sumothercharges";

	/** Set Sum Other Charges	  */
	public void setsumothercharges (BigDecimal sumothercharges);

	/** Get Sum Other Charges	  */
	public BigDecimal getsumothercharges();

    /** Column name totalshares */
    public static final String COLUMNNAME_totalshares = "totalshares";

	/** Set Total Shares	  */
	public void settotalshares (BigDecimal totalshares);

	/** Get Total Shares	  */
	public BigDecimal gettotalshares();

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

    /** Column name writeoffdate */
    public static final String COLUMNNAME_writeoffdate = "writeoffdate";

	/** Set Write Off Date	  */
	public void setwriteoffdate (Timestamp writeoffdate);

	/** Get Write Off Date	  */
	public Timestamp getwriteoffdate();

    /** Column name writingdate */
    public static final String COLUMNNAME_writingdate = "writingdate";

	/** Set Writing Date	  */
	public void setwritingdate (Timestamp writingdate);

	/** Get Writing Date	  */
	public Timestamp getwritingdate();

    /** Column name writingremarks */
    public static final String COLUMNNAME_writingremarks = "writingremarks";

	/** Set Writing Remarks	  */
	public void setwritingremarks (String writingremarks);

	/** Get Writing Remarks	  */
	public String getwritingremarks();

    /** Column name written */
    public static final String COLUMNNAME_written = "written";

	/** Set Written	  */
	public void setwritten (boolean written);

	/** Get Written	  */
	public boolean iswritten();

    /** Column name writtenoff */
    public static final String COLUMNNAME_writtenoff = "writtenoff";

	/** Set Written Off	  */
	public void setwrittenoff (boolean writtenoff);

	/** Get Written Off	  */
	public boolean iswrittenoff();
}
