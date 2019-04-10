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

/** Generated Interface for s_loanappraisal
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_loanappraisal 
{

    /** TableName=s_loanappraisal */
    public static final String Table_Name = "s_loanappraisal";

    /** AD_Table_ID=1000017 */
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

    /** Column name amountapproved */
    public static final String COLUMNNAME_amountapproved = "amountapproved";

	/** Set Approved Amount	  */
	public void setamountapproved (BigDecimal amountapproved);

	/** Get Approved Amount	  */
	public BigDecimal getamountapproved();

    /** Column name appraisalid */
    public static final String COLUMNNAME_appraisalid = "appraisalid";

	/** Set appraisalid	  */
	public void setappraisalid (int appraisalid);

	/** Get appraisalid	  */
	public int getappraisalid();

    /** Column name approvedby */
    public static final String COLUMNNAME_approvedby = "approvedby";

	/** Set Checked By	  */
	public void setapprovedby (String approvedby);

	/** Get Checked By	  */
	public String getapprovedby();

    /** Column name approving_member_ID */
    public static final String COLUMNNAME_approving_member_ID = "approving_member_ID";

	/** Set Member(Approving)	  */
	public void setapproving_member_ID (int approving_member_ID);

	/** Get Member(Approving)	  */
	public int getapproving_member_ID();

	public I_s_member getapproving_member() throws RuntimeException;

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

    /** Column name chairman_ID */
    public static final String COLUMNNAME_chairman_ID = "chairman_ID";

	/** Set Chairman	  */
	public void setchairman_ID (int chairman_ID);

	/** Get Chairman	  */
	public int getchairman_ID();

	public I_s_member getchairman() throws RuntimeException;

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

    /** Column name dateapproved */
    public static final String COLUMNNAME_dateapproved = "dateapproved";

	/** Set Date Approved	  */
	public void setdateapproved (Timestamp dateapproved);

	/** Get Date Approved	  */
	public Timestamp getdateapproved();

    /** Column name datechecked */
    public static final String COLUMNNAME_datechecked = "datechecked";

	/** Set Date Checked	  */
	public void setdatechecked (Timestamp datechecked);

	/** Get Date Checked	  */
	public Timestamp getdatechecked();

    /** Column name datedetails */
    public static final String COLUMNNAME_datedetails = "datedetails";

	/** Set Details Date	  */
	public void setdatedetails (Timestamp datedetails);

	/** Get Details Date	  */
	public Timestamp getdatedetails();

    /** Column name freeshares */
    public static final String COLUMNNAME_freeshares = "freeshares";

	/** Set Free Shares	  */
	public void setfreeshares (String freeshares);

	/** Get Free Shares	  */
	public String getfreeshares();

    /** Column name guarantors */
    public static final String COLUMNNAME_guarantors = "guarantors";

	/** Set Has Enough Guarantors	  */
	public void setguarantors (boolean guarantors);

	/** Get Has Enough Guarantors	  */
	public boolean isguarantors();

    /** Column name guarmsg */
    public static final String COLUMNNAME_guarmsg = "guarmsg";

	/** Set guarmsg	  */
	public void setguarmsg (String guarmsg);

	/** Get guarmsg	  */
	public String getguarmsg();

    /** Column name incomefactor */
    public static final String COLUMNNAME_incomefactor = "incomefactor";

	/** Set Income Factor Ok	  */
	public void setincomefactor (boolean incomefactor);

	/** Get Income Factor Ok	  */
	public boolean isincomefactor();

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

    /** Column name iswithinlimit */
    public static final String COLUMNNAME_iswithinlimit = "iswithinlimit";

	/** Set Is Within Limit	  */
	public void setiswithinlimit (boolean iswithinlimit);

	/** Get Is Within Limit	  */
	public boolean iswithinlimit();

    /** Column name iswithinmsg */
    public static final String COLUMNNAME_iswithinmsg = "iswithinmsg";

	/** Set iswithinmsg	  */
	public void setiswithinmsg (String iswithinmsg);

	/** Get iswithinmsg	  */
	public String getiswithinmsg();

    /** Column name lapproved */
    public static final String COLUMNNAME_lapproved = "lapproved";

	/** Set lapproved	  */
	public void setlapproved (int lapproved);

	/** Get lapproved	  */
	public int getlapproved();

    /** Column name loan_no */
    public static final String COLUMNNAME_loan_no = "loan_no";

	/** Set loan_no	  */
	public void setloan_no (String loan_no);

	/** Get loan_no	  */
	public String getloan_no();

    /** Column name loanamount */
    public static final String COLUMNNAME_loanamount = "loanamount";

	/** Set Loan Amount	  */
	public void setloanamount (BigDecimal loanamount);

	/** Get Loan Amount	  */
	public BigDecimal getloanamount();

    /** Column name loancode */
    public static final String COLUMNNAME_loancode = "loancode";

	/** Set Ref #	  */
	public void setloancode (String loancode);

	/** Get Ref #	  */
	public String getloancode();

    /** Column name loanremarks */
    public static final String COLUMNNAME_loanremarks = "loanremarks";

	/** Set Remarks	  */
	public void setloanremarks (String loanremarks);

	/** Get Remarks	  */
	public String getloanremarks();

    /** Column name loanstatus */
    public static final String COLUMNNAME_loanstatus = "loanstatus";

	/** Set Loan Status	  */
	public void setloanstatus (String loanstatus);

	/** Get Loan Status	  */
	public String getloanstatus();

    /** Column name maxallowed */
    public static final String COLUMNNAME_maxallowed = "maxallowed";

	/** Set maxallowed	  */
	public void setmaxallowed (String maxallowed);

	/** Get maxallowed	  */
	public String getmaxallowed();

    /** Column name member_no */
    public static final String COLUMNNAME_member_no = "member_no";

	/** Set Member NO	  */
	public void setmember_no (String member_no);

	/** Get Member NO	  */
	public String getmember_no();

    /** Column name memberid */
    public static final String COLUMNNAME_memberid = "memberid";

	/** Set memberid	  */
	public void setmemberid (int memberid);

	/** Get memberid	  */
	public int getmemberid();

    /** Column name minrefno */
    public static final String COLUMNNAME_minrefno = "minrefno";

	/** Set Minute Ref No	  */
	public void setminrefno (String minrefno);

	/** Get Minute Ref No	  */
	public String getminrefno();

    /** Column name mperiodmsg */
    public static final String COLUMNNAME_mperiodmsg = "mperiodmsg";

	/** Set mperiodmsg	  */
	public void setmperiodmsg (String mperiodmsg);

	/** Get mperiodmsg	  */
	public String getmperiodmsg();

    /** Column name mperiodok */
    public static final String COLUMNNAME_mperiodok = "mperiodok";

	/** Set Membership Period Ok	  */
	public void setmperiodok (boolean mperiodok);

	/** Get Membership Period Ok	  */
	public boolean ismperiodok();

    /** Column name paymethod */
    public static final String COLUMNNAME_paymethod = "paymethod";

	/** Set Payment Method	  */
	public void setpaymethod (String paymethod);

	/** Get Payment Method	  */
	public String getpaymethod();

    /** Column name payroll_no */
    public static final String COLUMNNAME_payroll_no = "payroll_no";

	/** Set Payroll NO	  */
	public void setpayroll_no (String payroll_no);

	/** Get Payroll NO	  */
	public String getpayroll_no();

    /** Column name reasons */
    public static final String COLUMNNAME_reasons = "reasons";

	/** Set Reason	  */
	public void setreasons (String reasons);

	/** Get Reason	  */
	public String getreasons();

    /** Column name s_loanappraisal_ID */
    public static final String COLUMNNAME_s_loanappraisal_ID = "s_loanappraisal_ID";

	/** Set s_loanappraisal ID	  */
	public void sets_loanappraisal_ID (int s_loanappraisal_ID);

	/** Get s_loanappraisal ID	  */
	public int gets_loanappraisal_ID();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name secretary_ID */
    public static final String COLUMNNAME_secretary_ID = "secretary_ID";

	/** Set Secretary	  */
	public void setsecretary_ID (int secretary_ID);

	/** Get Secretary	  */
	public int getsecretary_ID();

	public I_s_member getsecretary() throws RuntimeException;

    /** Column name sharefactor */
    public static final String COLUMNNAME_sharefactor = "sharefactor";

	/** Set Share/Savings Factor Ok	  */
	public void setsharefactor (boolean sharefactor);

	/** Get Share/Savings Factor Ok	  */
	public boolean issharefactor();

    /** Column name sharefactormsg */
    public static final String COLUMNNAME_sharefactormsg = "sharefactormsg";

	/** Set sharefactormsg	  */
	public void setsharefactormsg (String sharefactormsg);

	/** Get sharefactormsg	  */
	public String getsharefactormsg();

    /** Column name suitableage */
    public static final String COLUMNNAME_suitableage = "suitableage";

	/** Set suitableage	  */
	public void setsuitableage (String suitableage);

	/** Get suitableage	  */
	public String getsuitableage();

    /** Column name tiedshares */
    public static final String COLUMNNAME_tiedshares = "tiedshares";

	/** Set Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares);

	/** Get Tied Shares	  */
	public BigDecimal gettiedshares();

    /** Column name treasurer */
    public static final String COLUMNNAME_treasurer = "treasurer";

	/** Set Treasurer	  */
	public void settreasurer (String treasurer);

	/** Get Treasurer	  */
	public String gettreasurer();

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
}
