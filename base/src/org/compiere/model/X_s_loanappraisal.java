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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_loanappraisal
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loanappraisal extends PO implements I_s_loanappraisal, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190420L;

    /** Standard Constructor */
    public X_s_loanappraisal (Properties ctx, int s_loanappraisal_ID, String trxName)
    {
      super (ctx, s_loanappraisal_ID, trxName);
      /** if (s_loanappraisal_ID == 0)
        {
			sets_loanappraisal_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_loanappraisal (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_s_loanappraisal[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Approved Amount.
		@param amountapproved Approved Amount	  */
	public void setamountapproved (BigDecimal amountapproved)
	{
		set_Value (COLUMNNAME_amountapproved, amountapproved);
	}

	/** Get Approved Amount.
		@return Approved Amount	  */
	public BigDecimal getamountapproved () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountapproved);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set appraisalid.
		@param appraisalid appraisalid	  */
	public void setappraisalid (int appraisalid)
	{
		set_Value (COLUMNNAME_appraisalid, Integer.valueOf(appraisalid));
	}

	/** Get appraisalid.
		@return appraisalid	  */
	public int getappraisalid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_appraisalid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Checked By.
		@param approvedby Checked By	  */
	public void setapprovedby (String approvedby)
	{
		set_Value (COLUMNNAME_approvedby, approvedby);
	}

	/** Get Checked By.
		@return Checked By	  */
	public String getapprovedby () 
	{
		return (String)get_Value(COLUMNNAME_approvedby);
	}

	public I_s_member getapproving_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(getapproving_member_ID(), get_TrxName());	}

	/** Set Member(Approving).
		@param approving_member_ID Member(Approving)	  */
	public void setapproving_member_ID (int approving_member_ID)
	{
		if (approving_member_ID < 1) 
			set_Value (COLUMNNAME_approving_member_ID, null);
		else 
			set_Value (COLUMNNAME_approving_member_ID, Integer.valueOf(approving_member_ID));
	}

	/** Get Member(Approving).
		@return Member(Approving)	  */
	public int getapproving_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_approving_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Approve Appraisal.
		@param btn_appraisal_approve Approve Appraisal	  */
	public void setbtn_appraisal_approve (String btn_appraisal_approve)
	{
		set_Value (COLUMNNAME_btn_appraisal_approve, btn_appraisal_approve);
	}

	/** Get Approve Appraisal.
		@return Approve Appraisal	  */
	public String getbtn_appraisal_approve () 
	{
		return (String)get_Value(COLUMNNAME_btn_appraisal_approve);
	}

	/** Set Reject Appraisal.
		@param btn_appraisal_reject Reject Appraisal	  */
	public void setbtn_appraisal_reject (String btn_appraisal_reject)
	{
		set_Value (COLUMNNAME_btn_appraisal_reject, btn_appraisal_reject);
	}

	/** Get Reject Appraisal.
		@return Reject Appraisal	  */
	public String getbtn_appraisal_reject () 
	{
		return (String)get_Value(COLUMNNAME_btn_appraisal_reject);
	}

	public I_s_member getchairman() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(getchairman_ID(), get_TrxName());	}

	/** Set Chairman.
		@param chairman_ID Chairman	  */
	public void setchairman_ID (int chairman_ID)
	{
		if (chairman_ID < 1) 
			set_Value (COLUMNNAME_chairman_ID, null);
		else 
			set_Value (COLUMNNAME_chairman_ID, Integer.valueOf(chairman_ID));
	}

	/** Get Chairman.
		@return Chairman	  */
	public int getchairman_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_chairman_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Approved.
		@param dateapproved Date Approved	  */
	public void setdateapproved (Timestamp dateapproved)
	{
		set_Value (COLUMNNAME_dateapproved, dateapproved);
	}

	/** Get Date Approved.
		@return Date Approved	  */
	public Timestamp getdateapproved () 
	{
		return (Timestamp)get_Value(COLUMNNAME_dateapproved);
	}

	/** Set Date Checked.
		@param datechecked Date Checked	  */
	public void setdatechecked (Timestamp datechecked)
	{
		set_Value (COLUMNNAME_datechecked, datechecked);
	}

	/** Get Date Checked.
		@return Date Checked	  */
	public Timestamp getdatechecked () 
	{
		return (Timestamp)get_Value(COLUMNNAME_datechecked);
	}

	/** Set Details Date.
		@param datedetails Details Date	  */
	public void setdatedetails (Timestamp datedetails)
	{
		set_Value (COLUMNNAME_datedetails, datedetails);
	}

	/** Get Details Date.
		@return Details Date	  */
	public Timestamp getdatedetails () 
	{
		return (Timestamp)get_Value(COLUMNNAME_datedetails);
	}

	/** Set Free Shares.
		@param freeshares Free Shares	  */
	public void setfreeshares (String freeshares)
	{
		set_Value (COLUMNNAME_freeshares, freeshares);
	}

	/** Get Free Shares.
		@return Free Shares	  */
	public String getfreeshares () 
	{
		return (String)get_Value(COLUMNNAME_freeshares);
	}

	/** Set Has Enough Guarantors.
		@param guarantors Has Enough Guarantors	  */
	public void setguarantors (boolean guarantors)
	{
		set_Value (COLUMNNAME_guarantors, Boolean.valueOf(guarantors));
	}

	/** Get Has Enough Guarantors.
		@return Has Enough Guarantors	  */
	public boolean isguarantors () 
	{
		Object oo = get_Value(COLUMNNAME_guarantors);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set guarmsg.
		@param guarmsg guarmsg	  */
	public void setguarmsg (String guarmsg)
	{
		set_Value (COLUMNNAME_guarmsg, guarmsg);
	}

	/** Get guarmsg.
		@return guarmsg	  */
	public String getguarmsg () 
	{
		return (String)get_Value(COLUMNNAME_guarmsg);
	}

	/** Set Income Factor Ok.
		@param incomefactor Income Factor Ok	  */
	public void setincomefactor (boolean incomefactor)
	{
		set_Value (COLUMNNAME_incomefactor, Boolean.valueOf(incomefactor));
	}

	/** Get Income Factor Ok.
		@return Income Factor Ok	  */
	public boolean isincomefactor () 
	{
		Object oo = get_Value(COLUMNNAME_incomefactor);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Within Limit.
		@param iswithinlimit Is Within Limit	  */
	public void setiswithinlimit (boolean iswithinlimit)
	{
		set_Value (COLUMNNAME_iswithinlimit, Boolean.valueOf(iswithinlimit));
	}

	/** Get Is Within Limit.
		@return Is Within Limit	  */
	public boolean iswithinlimit () 
	{
		Object oo = get_Value(COLUMNNAME_iswithinlimit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set iswithinmsg.
		@param iswithinmsg iswithinmsg	  */
	public void setiswithinmsg (String iswithinmsg)
	{
		set_Value (COLUMNNAME_iswithinmsg, iswithinmsg);
	}

	/** Get iswithinmsg.
		@return iswithinmsg	  */
	public String getiswithinmsg () 
	{
		return (String)get_Value(COLUMNNAME_iswithinmsg);
	}

	/** Set lapproved.
		@param lapproved lapproved	  */
	public void setlapproved (int lapproved)
	{
		set_Value (COLUMNNAME_lapproved, Integer.valueOf(lapproved));
	}

	/** Get lapproved.
		@return lapproved	  */
	public int getlapproved () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_lapproved);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set loan_no.
		@param loan_no loan_no	  */
	public void setloan_no (String loan_no)
	{
		set_Value (COLUMNNAME_loan_no, loan_no);
	}

	/** Get loan_no.
		@return loan_no	  */
	public String getloan_no () 
	{
		return (String)get_Value(COLUMNNAME_loan_no);
	}

	/** Set Loan Amount.
		@param loanamount Loan Amount	  */
	public void setloanamount (BigDecimal loanamount)
	{
		set_Value (COLUMNNAME_loanamount, loanamount);
	}

	/** Get Loan Amount.
		@return Loan Amount	  */
	public BigDecimal getloanamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Application Date:.
		@param loanappdate Application Date:	  */
	public void setloanappdate (Timestamp loanappdate)
	{
		set_Value (COLUMNNAME_loanappdate, loanappdate);
	}

	/** Get Application Date:.
		@return Application Date:	  */
	public Timestamp getloanappdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loanappdate);
	}

	/** Set Ref #.
		@param loancode Ref #	  */
	public void setloancode (String loancode)
	{
		set_Value (COLUMNNAME_loancode, loancode);
	}

	/** Get Ref #.
		@return Ref #	  */
	public String getloancode () 
	{
		return (String)get_Value(COLUMNNAME_loancode);
	}

	/** Set Remarks.
		@param loanremarks Remarks	  */
	public void setloanremarks (String loanremarks)
	{
		set_Value (COLUMNNAME_loanremarks, loanremarks);
	}

	/** Get Remarks.
		@return Remarks	  */
	public String getloanremarks () 
	{
		return (String)get_Value(COLUMNNAME_loanremarks);
	}

	/** Set Loan Status.
		@param loanstatus Loan Status	  */
	public void setloanstatus (String loanstatus)
	{
		set_Value (COLUMNNAME_loanstatus, loanstatus);
	}

	/** Get Loan Status.
		@return Loan Status	  */
	public String getloanstatus () 
	{
		return (String)get_Value(COLUMNNAME_loanstatus);
	}

	/** Set maxallowed.
		@param maxallowed maxallowed	  */
	public void setmaxallowed (String maxallowed)
	{
		set_Value (COLUMNNAME_maxallowed, maxallowed);
	}

	/** Get maxallowed.
		@return maxallowed	  */
	public String getmaxallowed () 
	{
		return (String)get_Value(COLUMNNAME_maxallowed);
	}

	/** Set Member NO.
		@param member_no Member NO	  */
	public void setmember_no (String member_no)
	{
		set_Value (COLUMNNAME_member_no, member_no);
	}

	/** Get Member NO.
		@return Member NO	  */
	public String getmember_no () 
	{
		return (String)get_Value(COLUMNNAME_member_no);
	}

	/** Set memberid.
		@param memberid memberid	  */
	public void setmemberid (int memberid)
	{
		set_Value (COLUMNNAME_memberid, Integer.valueOf(memberid));
	}

	/** Get memberid.
		@return memberid	  */
	public int getmemberid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_memberid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minute Ref No.
		@param minrefno Minute Ref No	  */
	public void setminrefno (String minrefno)
	{
		set_Value (COLUMNNAME_minrefno, minrefno);
	}

	/** Get Minute Ref No.
		@return Minute Ref No	  */
	public String getminrefno () 
	{
		return (String)get_Value(COLUMNNAME_minrefno);
	}

	/** Set mperiodmsg.
		@param mperiodmsg mperiodmsg	  */
	public void setmperiodmsg (String mperiodmsg)
	{
		set_Value (COLUMNNAME_mperiodmsg, mperiodmsg);
	}

	/** Get mperiodmsg.
		@return mperiodmsg	  */
	public String getmperiodmsg () 
	{
		return (String)get_Value(COLUMNNAME_mperiodmsg);
	}

	/** Set Membership Period Ok.
		@param mperiodok Membership Period Ok	  */
	public void setmperiodok (boolean mperiodok)
	{
		set_Value (COLUMNNAME_mperiodok, Boolean.valueOf(mperiodok));
	}

	/** Get Membership Period Ok.
		@return Membership Period Ok	  */
	public boolean ismperiodok () 
	{
		Object oo = get_Value(COLUMNNAME_mperiodok);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Payment Method.
		@param paymethod Payment Method	  */
	public void setpaymethod (String paymethod)
	{
		set_Value (COLUMNNAME_paymethod, paymethod);
	}

	/** Get Payment Method.
		@return Payment Method	  */
	public String getpaymethod () 
	{
		return (String)get_Value(COLUMNNAME_paymethod);
	}

	/** Set Payroll NO.
		@param payroll_no Payroll NO	  */
	public void setpayroll_no (String payroll_no)
	{
		set_Value (COLUMNNAME_payroll_no, payroll_no);
	}

	/** Get Payroll NO.
		@return Payroll NO	  */
	public String getpayroll_no () 
	{
		return (String)get_Value(COLUMNNAME_payroll_no);
	}

	/** Set Reason.
		@param reasons Reason	  */
	public void setreasons (String reasons)
	{
		set_Value (COLUMNNAME_reasons, reasons);
	}

	/** Get Reason.
		@return Reason	  */
	public String getreasons () 
	{
		return (String)get_Value(COLUMNNAME_reasons);
	}

	/** Set Loan Appraisal.
		@param s_loanappraisal_ID Loan Appraisal	  */
	public void sets_loanappraisal_ID (int s_loanappraisal_ID)
	{
		if (s_loanappraisal_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loanappraisal_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loanappraisal_ID, Integer.valueOf(s_loanappraisal_ID));
	}

	/** Get Loan Appraisal.
		@return Loan Appraisal	  */
	public int gets_loanappraisal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loanappraisal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_loans gets_loans() throws RuntimeException
    {
		return (I_s_loans)MTable.get(getCtx(), I_s_loans.Table_Name)
			.getPO(gets_loans_ID(), get_TrxName());	}

	/** Set Loan Ref.
		@param s_loans_ID Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID)
	{
		if (s_loans_ID < 1) 
			set_Value (COLUMNNAME_s_loans_ID, null);
		else 
			set_Value (COLUMNNAME_s_loans_ID, Integer.valueOf(s_loans_ID));
	}

	/** Get Loan Ref.
		@return Loan Ref	  */
	public int gets_loans_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loans_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_member gets_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_ID(), get_TrxName());	}

	/** Set Member.
		@param s_member_ID Member	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_Value (COLUMNNAME_s_member_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
	}

	/** Get Member.
		@return Member	  */
	public int gets_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_member getsecretary() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(getsecretary_ID(), get_TrxName());	}

	/** Set Secretary.
		@param secretary_ID Secretary	  */
	public void setsecretary_ID (int secretary_ID)
	{
		if (secretary_ID < 1) 
			set_Value (COLUMNNAME_secretary_ID, null);
		else 
			set_Value (COLUMNNAME_secretary_ID, Integer.valueOf(secretary_ID));
	}

	/** Get Secretary.
		@return Secretary	  */
	public int getsecretary_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_secretary_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Share/Savings Factor Ok.
		@param sharefactor Share/Savings Factor Ok	  */
	public void setsharefactor (boolean sharefactor)
	{
		set_Value (COLUMNNAME_sharefactor, Boolean.valueOf(sharefactor));
	}

	/** Get Share/Savings Factor Ok.
		@return Share/Savings Factor Ok	  */
	public boolean issharefactor () 
	{
		Object oo = get_Value(COLUMNNAME_sharefactor);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set sharefactormsg.
		@param sharefactormsg sharefactormsg	  */
	public void setsharefactormsg (String sharefactormsg)
	{
		set_Value (COLUMNNAME_sharefactormsg, sharefactormsg);
	}

	/** Get sharefactormsg.
		@return sharefactormsg	  */
	public String getsharefactormsg () 
	{
		return (String)get_Value(COLUMNNAME_sharefactormsg);
	}

	/** Set suitableage.
		@param suitableage suitableage	  */
	public void setsuitableage (String suitableage)
	{
		set_Value (COLUMNNAME_suitableage, suitableage);
	}

	/** Get suitableage.
		@return suitableage	  */
	public String getsuitableage () 
	{
		return (String)get_Value(COLUMNNAME_suitableage);
	}

	/** Set Tied Shares.
		@param tiedshares Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares)
	{
		set_Value (COLUMNNAME_tiedshares, tiedshares);
	}

	/** Get Tied Shares.
		@return Tied Shares	  */
	public BigDecimal gettiedshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_tiedshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Treasurer.
		@param treasurer Treasurer	  */
	public void settreasurer (String treasurer)
	{
		set_Value (COLUMNNAME_treasurer, treasurer);
	}

	/** Get Treasurer.
		@return Treasurer	  */
	public String gettreasurer () 
	{
		return (String)get_Value(COLUMNNAME_treasurer);
	}

	/** Set uuid.
		@param uuid uuid	  */
	public void setuuid (String uuid)
	{
		set_Value (COLUMNNAME_uuid, uuid);
	}

	/** Get uuid.
		@return uuid	  */
	public String getuuid () 
	{
		return (String)get_Value(COLUMNNAME_uuid);
	}
}