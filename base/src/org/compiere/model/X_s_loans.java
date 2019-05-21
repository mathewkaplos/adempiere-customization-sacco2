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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for s_loans
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_loans extends PO implements I_s_loans, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190521L;

    /** Standard Constructor */
    public X_s_loans (Properties ctx, int s_loans_ID, String trxName)
    {
      super (ctx, s_loans_ID, trxName);
      /** if (s_loans_ID == 0)
        {
			setappliedamount (Env.ZERO);
// 0
			setapproval_done (false);
// N
			setchequetype (null);
// MANUAL
			setdisbursed (false);
// N
			setDocStatus (null);
// DR
			seteffect_period_ID (0);
			setinterest_recovery (null);
// 1
			setis_refinance (false);
// N
			setIsComplete (false);
// N
			setloanappdate (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setloanstatus (null);
// PENDING
			setnewloan (true);
// Y
			setopen_repay_period (false);
			setpartial_disbursement (false);
// N
			setProcessed (false);
// N
			sets_loanpurpose_ID (0);
			sets_loans_ID (0);
			sets_loantype_ID (0);
			sets_member_ID (0);
			sets_payment_mode_ID (0);
			setsaved (false);
// N
        } */
    }

    /** Load Constructor */
    public X_s_loans (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loans[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Accept Date.
		@param acceptdate Accept Date	  */
	public void setacceptdate (Timestamp acceptdate)
	{
		set_Value (COLUMNNAME_acceptdate, acceptdate);
	}

	/** Get Accept Date.
		@return Accept Date	  */
	public Timestamp getacceptdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_acceptdate);
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Affects DR.
		@param affectsdr Affects DR	  */
	public void setaffectsdr (boolean affectsdr)
	{
		set_Value (COLUMNNAME_affectsdr, Boolean.valueOf(affectsdr));
	}

	/** Get Affects DR.
		@return Affects DR	  */
	public boolean isaffectsdr () 
	{
		Object oo = get_Value(COLUMNNAME_affectsdr);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Amount Qualified.
		@param amountqualified Amount Qualified	  */
	public void setamountqualified (BigDecimal amountqualified)
	{
		set_Value (COLUMNNAME_amountqualified, amountqualified);
	}

	/** Get Amount Qualified.
		@return Amount Qualified	  */
	public BigDecimal getamountqualified () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountqualified);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Annual Charges Loaded.
		@param annualchargesloaded Annual Charges Loaded	  */
	public void setannualchargesloaded (BigDecimal annualchargesloaded)
	{
		set_Value (COLUMNNAME_annualchargesloaded, annualchargesloaded);
	}

	/** Get Annual Charges Loaded.
		@return Annual Charges Loaded	  */
	public BigDecimal getannualchargesloaded () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_annualchargesloaded);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Annual Charges Separate.
		@param annualchargesseparate Annual Charges Separate	  */
	public void setannualchargesseparate (BigDecimal annualchargesseparate)
	{
		set_Value (COLUMNNAME_annualchargesseparate, annualchargesseparate);
	}

	/** Get Annual Charges Separate.
		@return Annual Charges Separate	  */
	public BigDecimal getannualchargesseparate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_annualchargesseparate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Applied Amount.
		@param appliedamount Applied Amount	  */
	public void setappliedamount (BigDecimal appliedamount)
	{
		set_Value (COLUMNNAME_appliedamount, appliedamount);
	}

	/** Get Applied Amount.
		@return Applied Amount	  */
	public BigDecimal getappliedamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_appliedamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set approval_done.
		@param approval_done approval_done	  */
	public void setapproval_done (boolean approval_done)
	{
		set_Value (COLUMNNAME_approval_done, Boolean.valueOf(approval_done));
	}

	/** Get approval_done.
		@return approval_done	  */
	public boolean isapproval_done () 
	{
		Object oo = get_Value(COLUMNNAME_approval_done);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Rejection Remarks.
		@param approvalrejectionremarks Rejection Remarks	  */
	public void setapprovalrejectionremarks (String approvalrejectionremarks)
	{
		set_Value (COLUMNNAME_approvalrejectionremarks, approvalrejectionremarks);
	}

	/** Get Rejection Remarks.
		@return Rejection Remarks	  */
	public String getapprovalrejectionremarks () 
	{
		return (String)get_Value(COLUMNNAME_approvalrejectionremarks);
	}

	/** Set Approved Amount.
		@param approvedamount Approved Amount	  */
	public void setapprovedamount (BigDecimal approvedamount)
	{
		set_Value (COLUMNNAME_approvedamount, approvedamount);
	}

	/** Get Approved Amount.
		@return Approved Amount	  */
	public BigDecimal getapprovedamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_approvedamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Approved Date.
		@param approveddate Approved Date	  */
	public void setapproveddate (Timestamp approveddate)
	{
		set_Value (COLUMNNAME_approveddate, approveddate);
	}

	/** Get Approved Date.
		@return Approved Date	  */
	public Timestamp getapproveddate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_approveddate);
	}

	public I_C_ValidCombination getbankgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getbankgl_Acct(), get_TrxName());	}

	/** Set Bank GL Code.
		@param bankgl_Acct Bank GL Code	  */
	public void setbankgl_Acct (int bankgl_Acct)
	{
		set_Value (COLUMNNAME_bankgl_Acct, Integer.valueOf(bankgl_Acct));
	}

	/** Get Bank GL Code.
		@return Bank GL Code	  */
	public int getbankgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_bankgl_Acct);
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

	/** Set Save Approval/Rejection.
		@param btn_approve_reject_save Save Approval/Rejection	  */
	public void setbtn_approve_reject_save (String btn_approve_reject_save)
	{
		set_Value (COLUMNNAME_btn_approve_reject_save, btn_approve_reject_save);
	}

	/** Get Save Approval/Rejection.
		@return Save Approval/Rejection	  */
	public String getbtn_approve_reject_save () 
	{
		return (String)get_Value(COLUMNNAME_btn_approve_reject_save);
	}

	/** Set Add Charges (Cheque Writing).
		@param btn_cheque_witing_OC Add Charges (Cheque Writing)	  */
	public void setbtn_cheque_witing_OC (String btn_cheque_witing_OC)
	{
		set_Value (COLUMNNAME_btn_cheque_witing_OC, btn_cheque_witing_OC);
	}

	/** Get Add Charges (Cheque Writing).
		@return Add Charges (Cheque Writing)	  */
	public String getbtn_cheque_witing_OC () 
	{
		return (String)get_Value(COLUMNNAME_btn_cheque_witing_OC);
	}

	/** Set Loan Conversion.
		@param btn_convert Loan Conversion	  */
	public void setbtn_convert (String btn_convert)
	{
		set_Value (COLUMNNAME_btn_convert, btn_convert);
	}

	/** Get Loan Conversion.
		@return Loan Conversion	  */
	public String getbtn_convert () 
	{
		return (String)get_Value(COLUMNNAME_btn_convert);
	}

	/** Set Add Charges (Partial Disbursement).
		@param btn_partial_disbur_OC Add Charges (Partial Disbursement)	  */
	public void setbtn_partial_disbur_OC (String btn_partial_disbur_OC)
	{
		set_Value (COLUMNNAME_btn_partial_disbur_OC, btn_partial_disbur_OC);
	}

	/** Get Add Charges (Partial Disbursement).
		@return Add Charges (Partial Disbursement)	  */
	public String getbtn_partial_disbur_OC () 
	{
		return (String)get_Value(COLUMNNAME_btn_partial_disbur_OC);
	}

	/** Set Add Charges (Pay Mode).
		@param btn_paymode_OC Add Charges (Pay Mode)	  */
	public void setbtn_paymode_OC (String btn_paymode_OC)
	{
		set_Value (COLUMNNAME_btn_paymode_OC, btn_paymode_OC);
	}

	/** Get Add Charges (Pay Mode).
		@return Add Charges (Pay Mode)	  */
	public String getbtn_paymode_OC () 
	{
		return (String)get_Value(COLUMNNAME_btn_paymode_OC);
	}

	/** Set Pre-Print Cheques.
		@param btn_preprint_cheque Pre-Print Cheques	  */
	public void setbtn_preprint_cheque (String btn_preprint_cheque)
	{
		set_Value (COLUMNNAME_btn_preprint_cheque, btn_preprint_cheque);
	}

	/** Get Pre-Print Cheques.
		@return Pre-Print Cheques	  */
	public String getbtn_preprint_cheque () 
	{
		return (String)get_Value(COLUMNNAME_btn_preprint_cheque);
	}

	/** Set Print Cheque.
		@param btn_print_cheque Print Cheque	  */
	public void setbtn_print_cheque (String btn_print_cheque)
	{
		set_Value (COLUMNNAME_btn_print_cheque, btn_print_cheque);
	}

	/** Get Print Cheque.
		@return Print Cheque	  */
	public String getbtn_print_cheque () 
	{
		return (String)get_Value(COLUMNNAME_btn_print_cheque);
	}

	/** Set RE-SCHEDULE LOAN.
		@param btn_re_schedule RE-SCHEDULE LOAN	  */
	public void setbtn_re_schedule (String btn_re_schedule)
	{
		set_Value (COLUMNNAME_btn_re_schedule, btn_re_schedule);
	}

	/** Get RE-SCHEDULE LOAN.
		@return RE-SCHEDULE LOAN	  */
	public String getbtn_re_schedule () 
	{
		return (String)get_Value(COLUMNNAME_btn_re_schedule);
	}

	/** Set Reverse Status[Payment Mode].
		@param btn_repaymode_reverse Reverse Status[Payment Mode]	  */
	public void setbtn_repaymode_reverse (String btn_repaymode_reverse)
	{
		set_Value (COLUMNNAME_btn_repaymode_reverse, btn_repaymode_reverse);
	}

	/** Get Reverse Status[Payment Mode].
		@return Reverse Status[Payment Mode]	  */
	public String getbtn_repaymode_reverse () 
	{
		return (String)get_Value(COLUMNNAME_btn_repaymode_reverse);
	}

	/** Set Save [Payment Mode].
		@param btn_repaymode_save Save [Payment Mode]	  */
	public void setbtn_repaymode_save (String btn_repaymode_save)
	{
		set_Value (COLUMNNAME_btn_repaymode_save, btn_repaymode_save);
	}

	/** Get Save [Payment Mode].
		@return Save [Payment Mode]	  */
	public String getbtn_repaymode_save () 
	{
		return (String)get_Value(COLUMNNAME_btn_repaymode_save);
	}

	/** Set Reverse Status[Checque Collection].
		@param btn_reverse_cheque_collection Reverse Status[Checque Collection]	  */
	public void setbtn_reverse_cheque_collection (String btn_reverse_cheque_collection)
	{
		set_Value (COLUMNNAME_btn_reverse_cheque_collection, btn_reverse_cheque_collection);
	}

	/** Get Reverse Status[Checque Collection].
		@return Reverse Status[Checque Collection]	  */
	public String getbtn_reverse_cheque_collection () 
	{
		return (String)get_Value(COLUMNNAME_btn_reverse_cheque_collection);
	}

	/** Set Revers Status[Cheque Writing].
		@param btn_reverse_cheque_writing Revers Status[Cheque Writing]	  */
	public void setbtn_reverse_cheque_writing (String btn_reverse_cheque_writing)
	{
		set_Value (COLUMNNAME_btn_reverse_cheque_writing, btn_reverse_cheque_writing);
	}

	/** Get Revers Status[Cheque Writing].
		@return Revers Status[Cheque Writing]	  */
	public String getbtn_reverse_cheque_writing () 
	{
		return (String)get_Value(COLUMNNAME_btn_reverse_cheque_writing);
	}

	/** Set Save[Cheque Collection].
		@param btn_save_cheque_collection Save[Cheque Collection]	  */
	public void setbtn_save_cheque_collection (String btn_save_cheque_collection)
	{
		set_Value (COLUMNNAME_btn_save_cheque_collection, btn_save_cheque_collection);
	}

	/** Get Save[Cheque Collection].
		@return Save[Cheque Collection]	  */
	public String getbtn_save_cheque_collection () 
	{
		return (String)get_Value(COLUMNNAME_btn_save_cheque_collection);
	}

	/** Set Save [Cheque Writing].
		@param btn_save_cheque_writing Save [Cheque Writing]	  */
	public void setbtn_save_cheque_writing (String btn_save_cheque_writing)
	{
		set_Value (COLUMNNAME_btn_save_cheque_writing, btn_save_cheque_writing);
	}

	/** Get Save [Cheque Writing].
		@return Save [Cheque Writing]	  */
	public String getbtn_save_cheque_writing () 
	{
		return (String)get_Value(COLUMNNAME_btn_save_cheque_writing);
	}

	/** Set View Schedule.
		@param btn_view_schedule View Schedule	  */
	public void setbtn_view_schedule (String btn_view_schedule)
	{
		set_Value (COLUMNNAME_btn_view_schedule, btn_view_schedule);
	}

	/** Get View Schedule.
		@return View Schedule	  */
	public String getbtn_view_schedule () 
	{
		return (String)get_Value(COLUMNNAME_btn_view_schedule);
	}

	/** Set calcfied.
		@param calcfied calcfied	  */
	public void setcalcfied (String calcfied)
	{
		set_Value (COLUMNNAME_calcfied, calcfied);
	}

	/** Get calcfied.
		@return calcfied	  */
	public String getcalcfied () 
	{
		return (String)get_Value(COLUMNNAME_calcfied);
	}

	/** Set Cash Amount.
		@param cashamount Cash Amount	  */
	public void setcashamount (BigDecimal cashamount)
	{
		set_Value (COLUMNNAME_cashamount, cashamount);
	}

	/** Get Cash Amount.
		@return Cash Amount	  */
	public BigDecimal getcashamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_cashamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cheque Collection Date.
		@param cheque_collection_date Cheque Collection Date	  */
	public void setcheque_collection_date (Timestamp cheque_collection_date)
	{
		set_Value (COLUMNNAME_cheque_collection_date, cheque_collection_date);
	}

	/** Get Cheque Collection Date.
		@return Cheque Collection Date	  */
	public Timestamp getcheque_collection_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_cheque_collection_date);
	}

	/** Set cheque_collection_done.
		@param cheque_collection_done cheque_collection_done	  */
	public void setcheque_collection_done (boolean cheque_collection_done)
	{
		set_Value (COLUMNNAME_cheque_collection_done, Boolean.valueOf(cheque_collection_done));
	}

	/** Get cheque_collection_done.
		@return cheque_collection_done	  */
	public boolean ischeque_collection_done () 
	{
		Object oo = get_Value(COLUMNNAME_cheque_collection_done);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set cheque_collector_changed.
		@param cheque_collector_changed cheque_collector_changed	  */
	public void setcheque_collector_changed (boolean cheque_collector_changed)
	{
		set_Value (COLUMNNAME_cheque_collector_changed, Boolean.valueOf(cheque_collector_changed));
	}

	/** Get cheque_collector_changed.
		@return cheque_collector_changed	  */
	public boolean ischeque_collector_changed () 
	{
		Object oo = get_Value(COLUMNNAME_cheque_collector_changed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set cheque_writing_done.
		@param cheque_writing_done cheque_writing_done	  */
	public void setcheque_writing_done (boolean cheque_writing_done)
	{
		set_Value (COLUMNNAME_cheque_writing_done, Boolean.valueOf(cheque_writing_done));
	}

	/** Get cheque_writing_done.
		@return cheque_writing_done	  */
	public boolean ischeque_writing_done () 
	{
		Object oo = get_Value(COLUMNNAME_cheque_writing_done);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Other Charges(cheque writing).
		@param cheque_writing_oc Other Charges(cheque writing)	  */
	public void setcheque_writing_oc (BigDecimal cheque_writing_oc)
	{
		set_Value (COLUMNNAME_cheque_writing_oc, cheque_writing_oc);
	}

	/** Get Other Charges(cheque writing).
		@return Other Charges(cheque writing)	  */
	public BigDecimal getcheque_writing_oc () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_cheque_writing_oc);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cheque Amount.
		@param chequeamount Cheque Amount	  */
	public void setchequeamount (BigDecimal chequeamount)
	{
		set_Value (COLUMNNAME_chequeamount, chequeamount);
	}

	/** Get Cheque Amount.
		@return Cheque Amount	  */
	public BigDecimal getchequeamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_chequeamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** chequetype AD_Reference_ID=1000017 */
	public static final int CHEQUETYPE_AD_Reference_ID=1000017;
	/** MANUAL = MANUAL */
	public static final String CHEQUETYPE_MANUAL = "MANUAL";
	/** COMPUTER = COMPUTER */
	public static final String CHEQUETYPE_COMPUTER = "COMPUTER";
	/** Set Cheque Type.
		@param chequetype Cheque Type	  */
	public void setchequetype (String chequetype)
	{

		set_Value (COLUMNNAME_chequetype, chequetype);
	}

	/** Get Cheque Type.
		@return Cheque Type	  */
	public String getchequetype () 
	{
		return (String)get_Value(COLUMNNAME_chequetype);
	}

	/** Set Collect Cash.
		@param collectcash Collect Cash	  */
	public void setcollectcash (String collectcash)
	{
		set_Value (COLUMNNAME_collectcash, collectcash);
	}

	/** Get Collect Cash.
		@return Collect Cash	  */
	public String getcollectcash () 
	{
		return (String)get_Value(COLUMNNAME_collectcash);
	}

	/** Set Collected.
		@param collected Collected	  */
	public void setcollected (boolean collected)
	{
		set_Value (COLUMNNAME_collected, Boolean.valueOf(collected));
	}

	/** Get Collected.
		@return Collected	  */
	public boolean iscollected () 
	{
		Object oo = get_Value(COLUMNNAME_collected);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Collected By.
		@param collectedby Collected By	  */
	public void setcollectedby (String collectedby)
	{
		set_Value (COLUMNNAME_collectedby, collectedby);
	}

	/** Get Collected By.
		@return Collected By	  */
	public String getcollectedby () 
	{
		return (String)get_Value(COLUMNNAME_collectedby);
	}

	/** Set Collected Cheque Amount.
		@param collectedchequeamount Collected Cheque Amount	  */
	public void setcollectedchequeamount (BigDecimal collectedchequeamount)
	{
		set_Value (COLUMNNAME_collectedchequeamount, collectedchequeamount);
	}

	/** Get Collected Cheque Amount.
		@return Collected Cheque Amount	  */
	public BigDecimal getcollectedchequeamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_collectedchequeamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Collected Date.
		@param collecteddate Collected Date	  */
	public void setcollecteddate (Timestamp collecteddate)
	{
		set_Value (COLUMNNAME_collecteddate, collecteddate);
	}

	/** Get Collected Date.
		@return Collected Date	  */
	public Timestamp getcollecteddate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_collecteddate);
	}

	/** Set Collection Remarks.
		@param collectionremarks Collection Remarks	  */
	public void setcollectionremarks (String collectionremarks)
	{
		set_Value (COLUMNNAME_collectionremarks, collectionremarks);
	}

	/** Get Collection Remarks.
		@return Collection Remarks	  */
	public String getcollectionremarks () 
	{
		return (String)get_Value(COLUMNNAME_collectionremarks);
	}

	/** Set Collector ID No:.
		@param collector_id_no Collector ID No:	  */
	public void setcollector_id_no (String collector_id_no)
	{
		set_Value (COLUMNNAME_collector_id_no, collector_id_no);
	}

	/** Get Collector ID No:.
		@return Collector ID No:	  */
	public String getcollector_id_no () 
	{
		return (String)get_Value(COLUMNNAME_collector_id_no);
	}

	/** Set Cons. Repay Amt.
		@param constantrepayamnt Cons. Repay Amt	  */
	public void setconstantrepayamnt (BigDecimal constantrepayamnt)
	{
		set_Value (COLUMNNAME_constantrepayamnt, constantrepayamnt);
	}

	/** Get Cons. Repay Amt.
		@return Cons. Repay Amt	  */
	public BigDecimal getconstantrepayamnt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_constantrepayamnt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Contract/Offer Returned.
		@param contract_offer_returned Contract/Offer Returned	  */
	public void setcontract_offer_returned (boolean contract_offer_returned)
	{
		set_Value (COLUMNNAME_contract_offer_returned, Boolean.valueOf(contract_offer_returned));
	}

	/** Get Contract/Offer Returned.
		@return Contract/Offer Returned	  */
	public boolean iscontract_offer_returned () 
	{
		Object oo = get_Value(COLUMNNAME_contract_offer_returned);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Contract/Offer Returned Date.
		@param contract_offer_returned_date Contract/Offer Returned Date	  */
	public void setcontract_offer_returned_date (Timestamp contract_offer_returned_date)
	{
		set_Value (COLUMNNAME_contract_offer_returned_date, contract_offer_returned_date);
	}

	/** Get Contract/Offer Returned Date.
		@return Contract/Offer Returned Date	  */
	public Timestamp getcontract_offer_returned_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_contract_offer_returned_date);
	}

	/** Set Contract/Offer Sent.
		@param contract_offer_sent Contract/Offer Sent	  */
	public void setcontract_offer_sent (boolean contract_offer_sent)
	{
		set_Value (COLUMNNAME_contract_offer_sent, Boolean.valueOf(contract_offer_sent));
	}

	/** Get Contract/Offer Sent.
		@return Contract/Offer Sent	  */
	public boolean iscontract_offer_sent () 
	{
		Object oo = get_Value(COLUMNNAME_contract_offer_sent);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Contract/Offer Sent Date.
		@param contract_offer_sent_date Contract/Offer Sent Date	  */
	public void setcontract_offer_sent_date (Timestamp contract_offer_sent_date)
	{
		set_Value (COLUMNNAME_contract_offer_sent_date, contract_offer_sent_date);
	}

	/** Get Contract/Offer Sent Date.
		@return Contract/Offer Sent Date	  */
	public Timestamp getcontract_offer_sent_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_contract_offer_sent_date);
	}

	/** Set Date Debited.
		@param date_debited Date Debited	  */
	public void setdate_debited (Timestamp date_debited)
	{
		set_Value (COLUMNNAME_date_debited, date_debited);
	}

	/** Get Date Debited.
		@return Date Debited	  */
	public Timestamp getdate_debited () 
	{
		return (Timestamp)get_Value(COLUMNNAME_date_debited);
	}

	/** Set Date Informed.
		@param dateinformed Date Informed	  */
	public void setdateinformed (Timestamp dateinformed)
	{
		set_Value (COLUMNNAME_dateinformed, dateinformed);
	}

	/** Get Date Informed.
		@return Date Informed	  */
	public Timestamp getdateinformed () 
	{
		return (Timestamp)get_Value(COLUMNNAME_dateinformed);
	}

	/** Set Debit Fosa.
		@param debitfosa Debit Fosa	  */
	public void setdebitfosa (boolean debitfosa)
	{
		set_Value (COLUMNNAME_debitfosa, Boolean.valueOf(debitfosa));
	}

	/** Get Debit Fosa.
		@return Debit Fosa	  */
	public boolean isdebitfosa () 
	{
		Object oo = get_Value(COLUMNNAME_debitfosa);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Deffered.
		@param deffered Deffered	  */
	public void setdeffered (boolean deffered)
	{
		set_Value (COLUMNNAME_deffered, Boolean.valueOf(deffered));
	}

	/** Get Deffered.
		@return Deffered	  */
	public boolean isdeffered () 
	{
		Object oo = get_Value(COLUMNNAME_deffered);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Disbursed.
		@param disbursed Disbursed	  */
	public void setdisbursed (boolean disbursed)
	{
		set_Value (COLUMNNAME_disbursed, Boolean.valueOf(disbursed));
	}

	/** Get Disbursed.
		@return Disbursed	  */
	public boolean isdisbursed () 
	{
		Object oo = get_Value(COLUMNNAME_disbursed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Disbursed Amount.
		@param disbursed_amount Disbursed Amount	  */
	public void setdisbursed_amount (BigDecimal disbursed_amount)
	{
		set_Value (COLUMNNAME_disbursed_amount, disbursed_amount);
	}

	/** Get Disbursed Amount.
		@return Disbursed Amount	  */
	public BigDecimal getdisbursed_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_disbursed_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Disbursed Cheque Amount.
		@param disbursed_cheque_amount Disbursed Cheque Amount	  */
	public void setdisbursed_cheque_amount (BigDecimal disbursed_cheque_amount)
	{
		set_Value (COLUMNNAME_disbursed_cheque_amount, disbursed_cheque_amount);
	}

	/** Get Disbursed Cheque Amount.
		@return Disbursed Cheque Amount	  */
	public BigDecimal getdisbursed_cheque_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_disbursed_cheque_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Disbursement Date.
		@param disbursement_date Disbursement Date	  */
	public void setdisbursement_date (Timestamp disbursement_date)
	{
		set_Value (COLUMNNAME_disbursement_date, disbursement_date);
	}

	/** Get Disbursement Date.
		@return Disbursement Date	  */
	public Timestamp getdisbursement_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_disbursement_date);
	}

	/** Set Disbursement Installments.
		@param disbursement_installments Disbursement Installments	  */
	public void setdisbursement_installments (int disbursement_installments)
	{
		set_Value (COLUMNNAME_disbursement_installments, Integer.valueOf(disbursement_installments));
	}

	/** Get Disbursement Installments.
		@return Disbursement Installments	  */
	public int getdisbursement_installments () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_disbursement_installments);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set disp001.
		@param disp001 disp001	  */
	public void setdisp001 (boolean disp001)
	{
		set_Value (COLUMNNAME_disp001, Boolean.valueOf(disp001));
	}

	/** Get disp001.
		@return disp001	  */
	public boolean isdisp001 () 
	{
		Object oo = get_Value(COLUMNNAME_disp001);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set disp002.
		@param disp002 disp002	  */
	public void setdisp002 (boolean disp002)
	{
		set_Value (COLUMNNAME_disp002, Boolean.valueOf(disp002));
	}

	/** Get disp002.
		@return disp002	  */
	public boolean isdisp002 () 
	{
		Object oo = get_Value(COLUMNNAME_disp002);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set disp003.
		@param disp003 disp003	  */
	public void setdisp003 (boolean disp003)
	{
		set_Value (COLUMNNAME_disp003, Boolean.valueOf(disp003));
	}

	/** Get disp003.
		@return disp003	  */
	public boolean isdisp003 () 
	{
		Object oo = get_Value(COLUMNNAME_disp003);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Display In Statement.
		@param display Display In Statement	  */
	public void setdisplay (boolean display)
	{
		set_Value (COLUMNNAME_display, Boolean.valueOf(display));
	}

	/** Get Display In Statement.
		@return Display In Statement	  */
	public boolean isdisplay () 
	{
		Object oo = get_Value(COLUMNNAME_display);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	public org.compiere.model.I_C_Period geteffect_period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(geteffect_period_ID(), get_TrxName());	}

	/** Set Effect Period.
		@param effect_period_ID Effect Period	  */
	public void seteffect_period_ID (int effect_period_ID)
	{
		if (effect_period_ID < 1) 
			set_Value (COLUMNNAME_effect_period_ID, null);
		else 
			set_Value (COLUMNNAME_effect_period_ID, Integer.valueOf(effect_period_ID));
	}

	/** Get Effect Period.
		@return Effect Period	  */
	public int geteffect_period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_effect_period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Existing Loan.
		@param existingloan Existing Loan	  */
	public void setexistingloan (boolean existingloan)
	{
		set_Value (COLUMNNAME_existingloan, Boolean.valueOf(existingloan));
	}

	/** Get Existing Loan.
		@return Existing Loan	  */
	public boolean isexistingloan () 
	{
		Object oo = get_Value(COLUMNNAME_existingloan);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Expected Completion Date.
		@param expected_completion_date Expected Completion Date	  */
	public void setexpected_completion_date (Timestamp expected_completion_date)
	{
		set_Value (COLUMNNAME_expected_completion_date, expected_completion_date);
	}

	/** Get Expected Completion Date.
		@return Expected Completion Date	  */
	public Timestamp getexpected_completion_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_expected_completion_date);
	}

	/** Set First Repay Date.
		@param expectedrepaydate First Repay Date	  */
	public void setexpectedrepaydate (Timestamp expectedrepaydate)
	{
		set_Value (COLUMNNAME_expectedrepaydate, expectedrepaydate);
	}

	/** Get First Repay Date.
		@return First Repay Date	  */
	public Timestamp getexpectedrepaydate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_expectedrepaydate);
	}

	/** Set Free Shares.
		@param freeshares Free Shares	  */
	public void setfreeshares (BigDecimal freeshares)
	{
		set_Value (COLUMNNAME_freeshares, freeshares);
	}

	/** Get Free Shares.
		@return Free Shares	  */
	public BigDecimal getfreeshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_freeshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set GENERATE SCHEDULE.
		@param generate_schedule GENERATE SCHEDULE	  */
	public void setgenerate_schedule (String generate_schedule)
	{
		set_Value (COLUMNNAME_generate_schedule, generate_schedule);
	}

	/** Get GENERATE SCHEDULE.
		@return GENERATE SCHEDULE	  */
	public String getgenerate_schedule () 
	{
		return (String)get_Value(COLUMNNAME_generate_schedule);
	}

	/** Set Initial Amount.
		@param initial_amount Initial Amount	  */
	public void setinitial_amount (BigDecimal initial_amount)
	{
		set_Value (COLUMNNAME_initial_amount, initial_amount);
	}

	/** Get Initial Amount.
		@return Initial Amount	  */
	public BigDecimal getinitial_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_initial_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Insurance  Date.
		@param insuranceeffectdate Insurance  Date	  */
	public void setinsuranceeffectdate (Timestamp insuranceeffectdate)
	{
		set_Value (COLUMNNAME_insuranceeffectdate, insuranceeffectdate);
	}

	/** Get Insurance  Date.
		@return Insurance  Date	  */
	public Timestamp getinsuranceeffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_insuranceeffectdate);
	}

	/** Set Interest Balance.
		@param intbalance Interest Balance	  */
	public void setintbalance (BigDecimal intbalance)
	{
		set_Value (COLUMNNAME_intbalance, intbalance);
	}

	/** Get Interest Balance.
		@return Interest Balance	  */
	public BigDecimal getintbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_intbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** interest_recovery AD_Reference_ID=1000015 */
	public static final int INTEREST_RECOVERY_AD_Reference_ID=1000015;
	/** Recover Normally = 1 */
	public static final String INTEREST_RECOVERY_RecoverNormally = "1";
	/** Recover Interest First = 2 */
	public static final String INTEREST_RECOVERY_RecoverInterestFirst = "2";
	/** Set Int. Recovery Mode.
		@param interest_recovery Int. Recovery Mode	  */
	public void setinterest_recovery (String interest_recovery)
	{

		set_Value (COLUMNNAME_interest_recovery, interest_recovery);
	}

	/** Get Int. Recovery Mode.
		@return Int. Recovery Mode	  */
	public String getinterest_recovery () 
	{
		return (String)get_Value(COLUMNNAME_interest_recovery);
	}

	/** Set Interest Paid.
		@param interestpaid Interest Paid	  */
	public void setinterestpaid (BigDecimal interestpaid)
	{
		set_Value (COLUMNNAME_interestpaid, interestpaid);
	}

	/** Get Interest Paid.
		@return Interest Paid	  */
	public BigDecimal getinterestpaid () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interestpaid);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest Type.
		@param interesttype Interest Type	  */
	public void setinteresttype (String interesttype)
	{
		set_Value (COLUMNNAME_interesttype, interesttype);
	}

	/** Get Interest Type.
		@return Interest Type	  */
	public String getinteresttype () 
	{
		return (String)get_Value(COLUMNNAME_interesttype);
	}

	/** Set Recover Int. First.
		@param intfirst Recover Int. First	  */
	public void setintfirst (BigDecimal intfirst)
	{
		set_Value (COLUMNNAME_intfirst, intfirst);
	}

	/** Get Recover Int. First.
		@return Recover Int. First	  */
	public BigDecimal getintfirst () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_intfirst);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Repay Period.
		@param intperiod Repay Period	  */
	public void setintperiod (int intperiod)
	{
		set_Value (COLUMNNAME_intperiod, Integer.valueOf(intperiod));
	}

	/** Get Repay Period.
		@return Repay Period	  */
	public int getintperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_intperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Is Refinance.
		@param is_refinance Is Refinance	  */
	public void setis_refinance (boolean is_refinance)
	{
		set_Value (COLUMNNAME_is_refinance, Boolean.valueOf(is_refinance));
	}

	/** Get Is Refinance.
		@return Is Refinance	  */
	public boolean is_refinance () 
	{
		Object oo = get_Value(COLUMNNAME_is_refinance);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Complete.
		@param IsComplete 
		It is complete
	  */
	public void setIsComplete (boolean IsComplete)
	{
		set_Value (COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
	}

	/** Get Complete.
		@return It is complete
	  */
	public boolean isComplete () 
	{
		Object oo = get_Value(COLUMNNAME_IsComplete);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Refinancing.
		@param isrefinancing Is Refinancing	  */
	public void setisrefinancing (boolean isrefinancing)
	{
		set_Value (COLUMNNAME_isrefinancing, Boolean.valueOf(isrefinancing));
	}

	/** Get Is Refinancing.
		@return Is Refinancing	  */
	public boolean isrefinancing () 
	{
		Object oo = get_Value(COLUMNNAME_isrefinancing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Issue Cash.
		@param issuecash Issue Cash	  */
	public void setissuecash (String issuecash)
	{
		set_Value (COLUMNNAME_issuecash, issuecash);
	}

	/** Get Issue Cash.
		@return Issue Cash	  */
	public String getissuecash () 
	{
		return (String)get_Value(COLUMNNAME_issuecash);
	}

	/** Set Amount To Issue.
		@param issued_amount Amount To Issue	  */
	public void setissued_amount (BigDecimal issued_amount)
	{
		set_Value (COLUMNNAME_issued_amount, issued_amount);
	}

	/** Get Amount To Issue.
		@return Amount To Issue	  */
	public BigDecimal getissued_amount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_issued_amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Issued By.
		@param issuedby Issued By	  */
	public void setissuedby (String issuedby)
	{
		set_Value (COLUMNNAME_issuedby, issuedby);
	}

	/** Get Issued By.
		@return Issued By	  */
	public String getissuedby () 
	{
		return (String)get_Value(COLUMNNAME_issuedby);
	}

	/** Set Last Pay Date.
		@param last_pay_date Last Pay Date	  */
	public void setlast_pay_date (Timestamp last_pay_date)
	{
		set_Value (COLUMNNAME_last_pay_date, last_pay_date);
	}

	/** Get Last Pay Date.
		@return Last Pay Date	  */
	public Timestamp getlast_pay_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_last_pay_date);
	}

	/** Set Last Rescheduled Month.
		@param lastrescheduledmonth Last Rescheduled Month	  */
	public void setlastrescheduledmonth (int lastrescheduledmonth)
	{
		set_Value (COLUMNNAME_lastrescheduledmonth, Integer.valueOf(lastrescheduledmonth));
	}

	/** Get Last Rescheduled Month.
		@return Last Rescheduled Month	  */
	public int getlastrescheduledmonth () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_lastrescheduledmonth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Last Rescheduled Year.
		@param lastrescheduledyear Last Rescheduled Year	  */
	public void setlastrescheduledyear (int lastrescheduledyear)
	{
		set_Value (COLUMNNAME_lastrescheduledyear, Integer.valueOf(lastrescheduledyear));
	}

	/** Get Last Rescheduled Year.
		@return Last Rescheduled Year	  */
	public int getlastrescheduledyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_lastrescheduledyear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getloan_gl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getloan_gl_Acct(), get_TrxName());	}

	/** Set Loan GL Code.
		@param loan_gl_Acct Loan GL Code	  */
	public void setloan_gl_Acct (int loan_gl_Acct)
	{
		set_Value (COLUMNNAME_loan_gl_Acct, Integer.valueOf(loan_gl_Acct));
	}

	/** Get Loan GL Code.
		@return Loan GL Code	  */
	public int getloan_gl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loan_gl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Amount Paid.
		@param loanamountpaid Amount Paid	  */
	public void setloanamountpaid (BigDecimal loanamountpaid)
	{
		set_Value (COLUMNNAME_loanamountpaid, loanamountpaid);
	}

	/** Get Amount Paid.
		@return Amount Paid	  */
	public BigDecimal getloanamountpaid () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanamountpaid);
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

	/** Set Loan Balance.
		@param loanbalance Loan Balance	  */
	public void setloanbalance (BigDecimal loanbalance)
	{
		set_Value (COLUMNNAME_loanbalance, loanbalance);
	}

	/** Get Loan Balance.
		@return Loan Balance	  */
	public BigDecimal getloanbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Effect Date.
		@param loaneffectdate Effect Date	  */
	public void setloaneffectdate (Timestamp loaneffectdate)
	{
		set_Value (COLUMNNAME_loaneffectdate, loaneffectdate);
	}

	/** Get Effect Date.
		@return Effect Date	  */
	public Timestamp getloaneffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loaneffectdate);
	}

	/** Set loanenddate.
		@param loanenddate loanenddate	  */
	public void setloanenddate (Timestamp loanenddate)
	{
		set_Value (COLUMNNAME_loanenddate, loanenddate);
	}

	/** Get loanenddate.
		@return loanenddate	  */
	public Timestamp getloanenddate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loanenddate);
	}

	/** Set Gross Pay.
		@param loangrosspay Gross Pay	  */
	public void setloangrosspay (BigDecimal loangrosspay)
	{
		set_Value (COLUMNNAME_loangrosspay, loangrosspay);
	}

	/** Get Gross Pay.
		@return Gross Pay	  */
	public BigDecimal getloangrosspay () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loangrosspay);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set loanid.
		@param loanid loanid	  */
	public void setloanid (int loanid)
	{
		set_Value (COLUMNNAME_loanid, Integer.valueOf(loanid));
	}

	/** Get loanid.
		@return loanid	  */
	public int getloanid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loanid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Interest Amount.
		@param loaninterestamount Interest Amount	  */
	public void setloaninterestamount (BigDecimal loaninterestamount)
	{
		set_Value (COLUMNNAME_loaninterestamount, loaninterestamount);
	}

	/** Get Interest Amount.
		@return Interest Amount	  */
	public BigDecimal getloaninterestamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loaninterestamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest Rate.
		@param loaninterestrate Interest Rate	  */
	public void setloaninterestrate (BigDecimal loaninterestrate)
	{
		set_Value (COLUMNNAME_loaninterestrate, loaninterestrate);
	}

	/** Get Interest Rate.
		@return Interest Rate	  */
	public BigDecimal getloaninterestrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loaninterestrate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Manual Ref #.
		@param loanmanualref Manual Ref #	  */
	public void setloanmanualref (String loanmanualref)
	{
		set_Value (COLUMNNAME_loanmanualref, loanmanualref);
	}

	/** Get Manual Ref #.
		@return Manual Ref #	  */
	public String getloanmanualref () 
	{
		return (String)get_Value(COLUMNNAME_loanmanualref);
	}

	/** Set loan Nett Amount.
		@param loannettamount loan Nett Amount	  */
	public void setloannettamount (BigDecimal loannettamount)
	{
		set_Value (COLUMNNAME_loannettamount, loannettamount);
	}

	/** Get loan Nett Amount.
		@return loan Nett Amount	  */
	public BigDecimal getloannettamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loannettamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Nett Pay.
		@param loannettpay Nett Pay	  */
	public void setloannettpay (BigDecimal loannettpay)
	{
		set_Value (COLUMNNAME_loannettpay, loannettpay);
	}

	/** Get Nett Pay.
		@return Nett Pay	  */
	public BigDecimal getloannettpay () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loannettpay);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Loan Original Amount.
		@param loanorigamount Loan Original Amount	  */
	public void setloanorigamount (String loanorigamount)
	{
		set_Value (COLUMNNAME_loanorigamount, loanorigamount);
	}

	/** Get Loan Original Amount.
		@return Loan Original Amount	  */
	public String getloanorigamount () 
	{
		return (String)get_Value(COLUMNNAME_loanorigamount);
	}

	/** Set loanpaymode_done.
		@param loanpaymode_done loanpaymode_done	  */
	public void setloanpaymode_done (boolean loanpaymode_done)
	{
		set_Value (COLUMNNAME_loanpaymode_done, Boolean.valueOf(loanpaymode_done));
	}

	/** Get loanpaymode_done.
		@return loanpaymode_done	  */
	public boolean isloanpaymode_done () 
	{
		Object oo = get_Value(COLUMNNAME_loanpaymode_done);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Loan Penalty.
		@param loanpenalty Loan Penalty	  */
	public void setloanpenalty (BigDecimal loanpenalty)
	{
		set_Value (COLUMNNAME_loanpenalty, loanpenalty);
	}

	/** Get Loan Penalty.
		@return Loan Penalty	  */
	public BigDecimal getloanpenalty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanpenalty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Penalty Rate.
		@param loanpenaltyrate Penalty Rate	  */
	public void setloanpenaltyrate (int loanpenaltyrate)
	{
		set_Value (COLUMNNAME_loanpenaltyrate, Integer.valueOf(loanpenaltyrate));
	}

	/** Get Penalty Rate.
		@return Penalty Rate	  */
	public int getloanpenaltyrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loanpenaltyrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Loan Refinanced.
		@param loanrefinanced Loan Refinanced	  */
	public void setloanrefinanced (boolean loanrefinanced)
	{
		set_Value (COLUMNNAME_loanrefinanced, Boolean.valueOf(loanrefinanced));
	}

	/** Get Loan Refinanced.
		@return Loan Refinanced	  */
	public boolean isloanrefinanced () 
	{
		Object oo = get_Value(COLUMNNAME_loanrefinanced);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Repayment Amount.
		@param loanrepayamount Repayment Amount	  */
	public void setloanrepayamount (BigDecimal loanrepayamount)
	{
		set_Value (COLUMNNAME_loanrepayamount, loanrepayamount);
	}

	/** Get Repayment Amount.
		@return Repayment Amount	  */
	public BigDecimal getloanrepayamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanrepayamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Repay Amount.
		@param loanrepayamt Repay Amount	  */
	public void setloanrepayamt (BigDecimal loanrepayamt)
	{
		set_Value (COLUMNNAME_loanrepayamt, loanrepayamt);
	}

	/** Get Repay Amount.
		@return Repay Amount	  */
	public BigDecimal getloanrepayamt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loanrepayamt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Repay Period.
		@param loanrepayperiod Repay Period	  */
	public void setloanrepayperiod (int loanrepayperiod)
	{
		set_Value (COLUMNNAME_loanrepayperiod, Integer.valueOf(loanrepayperiod));
	}

	/** Get Repay Period.
		@return Repay Period	  */
	public int getloanrepayperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loanrepayperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** loanstatus AD_Reference_ID=1000009 */
	public static final int LOANSTATUS_AD_Reference_ID=1000009;
	/** APPROVED = APPROVED */
	public static final String LOANSTATUS_APPROVED = "APPROVED";
	/** COLLECTED = COLLECTED */
	public static final String LOANSTATUS_COLLECTED = "COLLECTED";
	/** PENDING = PENDING */
	public static final String LOANSTATUS_PENDING = "PENDING";
	/** REJECTED = REJECTED */
	public static final String LOANSTATUS_REJECTED = "REJECTED";
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

	/** Set loantransdate.
		@param loantransdate loantransdate	  */
	public void setloantransdate (Timestamp loantransdate)
	{
		set_Value (COLUMNNAME_loantransdate, loantransdate);
	}

	/** Get loantransdate.
		@return loantransdate	  */
	public Timestamp getloantransdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loantransdate);
	}

	/** Set lstatus.
		@param lstatus lstatus	  */
	public void setlstatus (String lstatus)
	{
		set_Value (COLUMNNAME_lstatus, lstatus);
	}

	/** Get lstatus.
		@return lstatus	  */
	public String getlstatus () 
	{
		return (String)get_Value(COLUMNNAME_lstatus);
	}

	/** Set Maximum Interest.
		@param maximuminterest Maximum Interest	  */
	public void setmaximuminterest (BigDecimal maximuminterest)
	{
		set_Value (COLUMNNAME_maximuminterest, maximuminterest);
	}

	/** Get Maximum Interest.
		@return Maximum Interest	  */
	public BigDecimal getmaximuminterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_maximuminterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Maximum Loan.
		@param maximumloan Maximum Loan	  */
	public void setmaximumloan (BigDecimal maximumloan)
	{
		set_Value (COLUMNNAME_maximumloan, maximumloan);
	}

	/** Get Maximum Loan.
		@return Maximum Loan	  */
	public BigDecimal getmaximumloan () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_maximumloan);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set member_userid.
		@param member_userid member_userid	  */
	public void setmember_userid (int member_userid)
	{
		set_Value (COLUMNNAME_member_userid, Integer.valueOf(member_userid));
	}

	/** Get member_userid.
		@return member_userid	  */
	public int getmember_userid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_member_userid);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Member Shares.
		@param membershares Member Shares	  */
	public void setmembershares (BigDecimal membershares)
	{
		set_Value (COLUMNNAME_membershares, membershares);
	}

	/** Get Member Shares.
		@return Member Shares	  */
	public BigDecimal getmembershares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_membershares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Minimum Loan.
		@param minimumloan Minimum Loan	  */
	public void setminimumloan (BigDecimal minimumloan)
	{
		set_Value (COLUMNNAME_minimumloan, minimumloan);
	}

	/** Get Minimum Loan.
		@return Minimum Loan	  */
	public BigDecimal getminimumloan () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minimumloan);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Monthly Charges Loaded.
		@param monthlychargesloaded Monthly Charges Loaded	  */
	public void setmonthlychargesloaded (BigDecimal monthlychargesloaded)
	{
		set_Value (COLUMNNAME_monthlychargesloaded, monthlychargesloaded);
	}

	/** Get Monthly Charges Loaded.
		@return Monthly Charges Loaded	  */
	public BigDecimal getmonthlychargesloaded () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthlychargesloaded);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Monthly Charges Separate.
		@param monthlychargesseparate Monthly Charges Separate	  */
	public void setmonthlychargesseparate (BigDecimal monthlychargesseparate)
	{
		set_Value (COLUMNNAME_monthlychargesseparate, monthlychargesseparate);
	}

	/** Get Monthly Charges Separate.
		@return Monthly Charges Separate	  */
	public BigDecimal getmonthlychargesseparate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthlychargesseparate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Month Opening Bal.
		@param monthopeningbal Month Opening Bal	  */
	public void setmonthopeningbal (BigDecimal monthopeningbal)
	{
		set_Value (COLUMNNAME_monthopeningbal, monthopeningbal);
	}

	/** Get Month Opening Bal.
		@return Month Opening Bal	  */
	public BigDecimal getmonthopeningbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthopeningbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set New Interest.
		@param newinterest New Interest	  */
	public void setnewinterest (BigDecimal newinterest)
	{
		set_Value (COLUMNNAME_newinterest, newinterest);
	}

	/** Get New Interest.
		@return New Interest	  */
	public BigDecimal getnewinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set New Loan.
		@param newloan New Loan	  */
	public void setnewloan (boolean newloan)
	{
		set_Value (COLUMNNAME_newloan, Boolean.valueOf(newloan));
	}

	/** Get New Loan.
		@return New Loan	  */
	public boolean isnewloan () 
	{
		Object oo = get_Value(COLUMNNAME_newloan);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set New Loan Repayamount.
		@param newloanrepayamount New Loan Repayamount	  */
	public void setnewloanrepayamount (BigDecimal newloanrepayamount)
	{
		set_Value (COLUMNNAME_newloanrepayamount, newloanrepayamount);
	}

	/** Get New Loan Repayamount.
		@return New Loan Repayamount	  */
	public BigDecimal getnewloanrepayamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newloanrepayamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Old Balance.
		@param oldbalance Old Balance	  */
	public void setoldbalance (BigDecimal oldbalance)
	{
		set_Value (COLUMNNAME_oldbalance, oldbalance);
	}

	/** Get Old Balance.
		@return Old Balance	  */
	public BigDecimal getoldbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_oldbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Open Repay Amount.
		@param open_repay_amount Open Repay Amount	  */
	public void setopen_repay_amount (boolean open_repay_amount)
	{
		set_Value (COLUMNNAME_open_repay_amount, Boolean.valueOf(open_repay_amount));
	}

	/** Get Open Repay Amount.
		@return Open Repay Amount	  */
	public boolean isopen_repay_amount () 
	{
		Object oo = get_Value(COLUMNNAME_open_repay_amount);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Repay Period.
		@param open_repay_period Open Repay Period	  */
	public void setopen_repay_period (boolean open_repay_period)
	{
		set_Value (COLUMNNAME_open_repay_period, Boolean.valueOf(open_repay_period));
	}

	/** Get Open Repay Period.
		@return Open Repay Period	  */
	public boolean isopen_repay_period () 
	{
		Object oo = get_Value(COLUMNNAME_open_repay_period);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Other Charges.
		@param othercharges Other Charges	  */
	public void setothercharges (BigDecimal othercharges)
	{
		set_Value (COLUMNNAME_othercharges, othercharges);
	}

	/** Get Other Charges.
		@return Other Charges	  */
	public BigDecimal getothercharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_othercharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Is Partial Disbursement.
		@param partial_disbursement Is Partial Disbursement	  */
	public void setpartial_disbursement (boolean partial_disbursement)
	{
		set_Value (COLUMNNAME_partial_disbursement, Boolean.valueOf(partial_disbursement));
	}

	/** Get Is Partial Disbursement.
		@return Is Partial Disbursement	  */
	public boolean ispartial_disbursement () 
	{
		Object oo = get_Value(COLUMNNAME_partial_disbursement);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Other Charges(partial disb.).
		@param partial_disbursement_oc Other Charges(partial disb.)	  */
	public void setpartial_disbursement_oc (BigDecimal partial_disbursement_oc)
	{
		set_Value (COLUMNNAME_partial_disbursement_oc, partial_disbursement_oc);
	}

	/** Get Other Charges(partial disb.).
		@return Other Charges(partial disb.)	  */
	public BigDecimal getpartial_disbursement_oc () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_partial_disbursement_oc);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** paymode AD_Reference_ID=1000016 */
	public static final int PAYMODE_AD_Reference_ID=1000016;
	/** Cash = 1 */
	public static final String PAYMODE_Cash = "1";
	/** Cheque = 2 */
	public static final String PAYMODE_Cheque = "2";
	/** Cash & Cheque = 3 */
	public static final String PAYMODE_CashCheque = "3";
	/** FOSA = 4 */
	public static final String PAYMODE_FOSA = "4";
	/** Error Correction = 5 */
	public static final String PAYMODE_ErrorCorrection = "5";
	/** Payroll Payment = SALARY DEDS */
	public static final String PAYMODE_PayrollPayment = "SALARY DEDS";
	/** MPESA- Cash Remmittance = 6 */
	public static final String PAYMODE_MPESA_CashRemmittance = "6";
	/** MPESA- Cash Withdrawals = 7 */
	public static final String PAYMODE_MPESA_CashWithdrawals = "7";
	/** Title Deed = 8 */
	public static final String PAYMODE_TitleDeed = "8";
	/** Savings Disbursment = 9 */
	public static final String PAYMODE_SavingsDisbursment = "9";
	/** Set Pay Mode.
		@param paymode Pay Mode	  */
	public void setpaymode (String paymode)
	{

		set_Value (COLUMNNAME_paymode, paymode);
	}

	/** Get Pay Mode.
		@return Pay Mode	  */
	public String getpaymode () 
	{
		return (String)get_Value(COLUMNNAME_paymode);
	}

	/** Set Other Charges(paymode).
		@param paymode_oc Other Charges(paymode)	  */
	public void setpaymode_oc (BigDecimal paymode_oc)
	{
		set_Value (COLUMNNAME_paymode_oc, paymode_oc);
	}

	/** Get Other Charges(paymode).
		@return Other Charges(paymode)	  */
	public BigDecimal getpaymode_oc () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_paymode_oc);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Pay Type.
		@param paytype Pay Type	  */
	public void setpaytype (String paytype)
	{
		set_Value (COLUMNNAME_paytype, paytype);
	}

	/** Get Pay Type.
		@return Pay Type	  */
	public String getpaytype () 
	{
		return (String)get_Value(COLUMNNAME_paytype);
	}

	/** Set Pending Disbursement.
		@param pending_disbursement Pending Disbursement	  */
	public void setpending_disbursement (BigDecimal pending_disbursement)
	{
		throw new IllegalArgumentException ("pending_disbursement is virtual column");	}

	/** Get Pending Disbursement.
		@return Pending Disbursement	  */
	public BigDecimal getpending_disbursement () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_pending_disbursement);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shamba Plot Cost.
		@param plot_cost Shamba Plot Cost	  */
	public void setplot_cost (BigDecimal plot_cost)
	{
		set_Value (COLUMNNAME_plot_cost, plot_cost);
	}

	/** Get Shamba Plot Cost.
		@return Shamba Plot Cost	  */
	public BigDecimal getplot_cost () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_plot_cost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Plot Gain.
		@param plot_gain Plot Gain	  */
	public void setplot_gain (BigDecimal plot_gain)
	{
		set_Value (COLUMNNAME_plot_gain, plot_gain);
	}

	/** Get Plot Gain.
		@return Plot Gain	  */
	public BigDecimal getplot_gain () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_plot_gain);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Posted.
		@param Posted 
		Posting status
	  */
	public void setPosted (boolean Posted)
	{
		set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
	}

	/** Get Posted.
		@return Posting status
	  */
	public boolean isPosted () 
	{
		Object oo = get_Value(COLUMNNAME_Posted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Post GL.
		@param postgl Post GL	  */
	public void setpostgl (boolean postgl)
	{
		set_Value (COLUMNNAME_postgl, Boolean.valueOf(postgl));
	}

	/** Get Post GL.
		@return Post GL	  */
	public boolean ispostgl () 
	{
		Object oo = get_Value(COLUMNNAME_postgl);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Ready Cheque.
		@param readycheque Ready Cheque	  */
	public void setreadycheque (boolean readycheque)
	{
		set_Value (COLUMNNAME_readycheque, Boolean.valueOf(readycheque));
	}

	/** Get Ready Cheque.
		@return Ready Cheque	  */
	public boolean isreadycheque () 
	{
		Object oo = get_Value(COLUMNNAME_readycheque);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Cheque NO.
		@param readychequeno Cheque NO	  */
	public void setreadychequeno (String readychequeno)
	{
		set_Value (COLUMNNAME_readychequeno, readychequeno);
	}

	/** Get Cheque NO.
		@return Cheque NO	  */
	public String getreadychequeno () 
	{
		return (String)get_Value(COLUMNNAME_readychequeno);
	}

	/** Set Ready Cheque Date.
		@param readydate Ready Cheque Date	  */
	public void setreadydate (Timestamp readydate)
	{
		set_Value (COLUMNNAME_readydate, readydate);
	}

	/** Get Ready Cheque Date.
		@return Ready Cheque Date	  */
	public Timestamp getreadydate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_readydate);
	}

	/** Set Ready Cheque Remarks.
		@param readyremarks Ready Cheque Remarks	  */
	public void setreadyremarks (String readyremarks)
	{
		set_Value (COLUMNNAME_readyremarks, readyremarks);
	}

	/** Get Ready Cheque Remarks.
		@return Ready Cheque Remarks	  */
	public String getreadyremarks () 
	{
		return (String)get_Value(COLUMNNAME_readyremarks);
	}

	/** Set Rejected.
		@param rejected Rejected	  */
	public void setrejected (boolean rejected)
	{
		set_Value (COLUMNNAME_rejected, Boolean.valueOf(rejected));
	}

	/** Get Rejected.
		@return Rejected	  */
	public boolean isrejected () 
	{
		Object oo = get_Value(COLUMNNAME_rejected);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Rejected Date.
		@param rejecteddate Rejected Date	  */
	public void setrejecteddate (Timestamp rejecteddate)
	{
		set_Value (COLUMNNAME_rejecteddate, rejecteddate);
	}

	/** Get Rejected Date.
		@return Rejected Date	  */
	public Timestamp getrejecteddate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_rejecteddate);
	}

	/** repaymode AD_Reference_ID=1000010 */
	public static final int REPAYMODE_AD_Reference_ID=1000010;
	/** CASH PERMIT = CASH PERMIT */
	public static final String REPAYMODE_CASHPERMIT = "CASH PERMIT";
	/** DIRECT BANKING = DIRECT BANKING */
	public static final String REPAYMODE_DIRECTBANKING = "DIRECT BANKING";
	/** FOSA = FOSA */
	public static final String REPAYMODE_FOSA = "FOSA";
	/** SALARY DEDS = SALARY DEDS */
	public static final String REPAYMODE_SALARYDEDS = "SALARY DEDS";
	/** Set Repay Mode.
		@param repaymode Repay Mode	  */
	public void setrepaymode (String repaymode)
	{

		set_Value (COLUMNNAME_repaymode, repaymode);
	}

	/** Get Repay Mode.
		@return Repay Mode	  */
	public String getrepaymode () 
	{
		return (String)get_Value(COLUMNNAME_repaymode);
	}

	public I_s_branch gets_branch() throws RuntimeException
    {
		return (I_s_branch)MTable.get(getCtx(), I_s_branch.Table_Name)
			.getPO(gets_branch_ID(), get_TrxName());	}

	/** Set Member Branch.
		@param s_branch_ID Member Branch	  */
	public void sets_branch_ID (int s_branch_ID)
	{
		if (s_branch_ID < 1) 
			set_Value (COLUMNNAME_s_branch_ID, null);
		else 
			set_Value (COLUMNNAME_s_branch_ID, Integer.valueOf(s_branch_ID));
	}

	/** Get Member Branch.
		@return Member Branch	  */
	public int gets_branch_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_branch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_payment_mode gets_disbursement_mode() throws RuntimeException
    {
		return (I_s_payment_mode)MTable.get(getCtx(), I_s_payment_mode.Table_Name)
			.getPO(gets_disbursement_mode_ID(), get_TrxName());	}

	/** Set Disbursement Mode.
		@param s_disbursement_mode_ID Disbursement Mode	  */
	public void sets_disbursement_mode_ID (int s_disbursement_mode_ID)
	{
		if (s_disbursement_mode_ID < 1) 
			set_Value (COLUMNNAME_s_disbursement_mode_ID, null);
		else 
			set_Value (COLUMNNAME_s_disbursement_mode_ID, Integer.valueOf(s_disbursement_mode_ID));
	}

	/** Get Disbursement Mode.
		@return Disbursement Mode	  */
	public int gets_disbursement_mode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_disbursement_mode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_loanpurpose gets_loanpurpose() throws RuntimeException
    {
		return (I_s_loanpurpose)MTable.get(getCtx(), I_s_loanpurpose.Table_Name)
			.getPO(gets_loanpurpose_ID(), get_TrxName());	}

	/** Set Loan Purpose .
		@param s_loanpurpose_ID Loan Purpose 	  */
	public void sets_loanpurpose_ID (int s_loanpurpose_ID)
	{
		if (s_loanpurpose_ID < 1) 
			set_Value (COLUMNNAME_s_loanpurpose_ID, null);
		else 
			set_Value (COLUMNNAME_s_loanpurpose_ID, Integer.valueOf(s_loanpurpose_ID));
	}

	/** Get Loan Purpose .
		@return Loan Purpose 	  */
	public int gets_loanpurpose_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loanpurpose_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Loan Ref.
		@param s_loans_ID Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID)
	{
		if (s_loans_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loans_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loans_ID, Integer.valueOf(s_loans_ID));
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

	public I_s_loans gets_loans_refinance() throws RuntimeException
    {
		return (I_s_loans)MTable.get(getCtx(), I_s_loans.Table_Name)
			.getPO(gets_loans_refinance_ID(), get_TrxName());	}

	/** Set Old Loan.
		@param s_loans_refinance_ID Old Loan	  */
	public void sets_loans_refinance_ID (int s_loans_refinance_ID)
	{
		if (s_loans_refinance_ID < 1) 
			set_Value (COLUMNNAME_s_loans_refinance_ID, null);
		else 
			set_Value (COLUMNNAME_s_loans_refinance_ID, Integer.valueOf(s_loans_refinance_ID));
	}

	/** Get Old Loan.
		@return Old Loan	  */
	public int gets_loans_refinance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loans_refinance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_loantype gets_loantype() throws RuntimeException
    {
		return (I_s_loantype)MTable.get(getCtx(), I_s_loantype.Table_Name)
			.getPO(gets_loantype_ID(), get_TrxName());	}

	/** Set Loan Type.
		@param s_loantype_ID Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID)
	{
		if (s_loantype_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loantype_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loantype_ID, Integer.valueOf(s_loantype_ID));
	}

	/** Get Loan Type.
		@return Loan Type	  */
	public int gets_loantype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loantype_ID);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(gets_member_ID()));
    }

	public I_s_membershares gets_membershares() throws RuntimeException
    {
		return (I_s_membershares)MTable.get(getCtx(), I_s_membershares.Table_Name)
			.getPO(gets_membershares_ID(), get_TrxName());	}

	/** Set Member Shares.
		@param s_membershares_ID Member Shares	  */
	public void sets_membershares_ID (int s_membershares_ID)
	{
		if (s_membershares_ID < 1) 
			set_Value (COLUMNNAME_s_membershares_ID, null);
		else 
			set_Value (COLUMNNAME_s_membershares_ID, Integer.valueOf(s_membershares_ID));
	}

	/** Get Member Shares.
		@return Member Shares	  */
	public int gets_membershares_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_membershares_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_payment_mode gets_payment_mode() throws RuntimeException
    {
		return (I_s_payment_mode)MTable.get(getCtx(), I_s_payment_mode.Table_Name)
			.getPO(gets_payment_mode_ID(), get_TrxName());	}

	/** Set Payment Mode.
		@param s_payment_mode_ID Payment Mode	  */
	public void sets_payment_mode_ID (int s_payment_mode_ID)
	{
		if (s_payment_mode_ID < 1) 
			set_Value (COLUMNNAME_s_payment_mode_ID, null);
		else 
			set_Value (COLUMNNAME_s_payment_mode_ID, Integer.valueOf(s_payment_mode_ID));
	}

	/** Get Payment Mode.
		@return Payment Mode	  */
	public int gets_payment_mode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payment_mode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_shamba gets_shamba() throws RuntimeException
    {
		return (I_s_shamba)MTable.get(getCtx(), I_s_shamba.Table_Name)
			.getPO(gets_shamba_ID(), get_TrxName());	}

	/** Set Shamba.
		@param s_shamba_ID Shamba	  */
	public void sets_shamba_ID (int s_shamba_ID)
	{
		if (s_shamba_ID < 1) 
			set_Value (COLUMNNAME_s_shamba_ID, null);
		else 
			set_Value (COLUMNNAME_s_shamba_ID, Integer.valueOf(s_shamba_ID));
	}

	/** Get Shamba.
		@return Shamba	  */
	public int gets_shamba_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shamba_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_shamba_plot gets_shamba_plot() throws RuntimeException
    {
		return (I_s_shamba_plot)MTable.get(getCtx(), I_s_shamba_plot.Table_Name)
			.getPO(gets_shamba_plot_ID(), get_TrxName());	}

	/** Set Shamba Plot.
		@param s_shamba_plot_ID Shamba Plot	  */
	public void sets_shamba_plot_ID (int s_shamba_plot_ID)
	{
		if (s_shamba_plot_ID < 1) 
			set_Value (COLUMNNAME_s_shamba_plot_ID, null);
		else 
			set_Value (COLUMNNAME_s_shamba_plot_ID, Integer.valueOf(s_shamba_plot_ID));
	}

	/** Get Shamba Plot.
		@return Shamba Plot	  */
	public int gets_shamba_plot_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shamba_plot_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Save Loan.
		@param save_loan Save Loan	  */
	public void setsave_loan (String save_loan)
	{
		set_Value (COLUMNNAME_save_loan, save_loan);
	}

	/** Get Save Loan.
		@return Save Loan	  */
	public String getsave_loan () 
	{
		return (String)get_Value(COLUMNNAME_save_loan);
	}

	/** Set Saved.
		@param saved Saved	  */
	public void setsaved (boolean saved)
	{
		set_Value (COLUMNNAME_saved, Boolean.valueOf(saved));
	}

	/** Get Saved.
		@return Saved	  */
	public boolean issaved () 
	{
		Object oo = get_Value(COLUMNNAME_saved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Schedule Adjusted.
		@param schedule_adjusted Schedule Adjusted	  */
	public void setschedule_adjusted (boolean schedule_adjusted)
	{
		set_Value (COLUMNNAME_schedule_adjusted, Boolean.valueOf(schedule_adjusted));
	}

	/** Get Schedule Adjusted.
		@return Schedule Adjusted	  */
	public boolean isschedule_adjusted () 
	{
		Object oo = get_Value(COLUMNNAME_schedule_adjusted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Seen And Checked All Supporting Documents.
		@param seen_documents Seen And Checked All Supporting Documents	  */
	public void setseen_documents (boolean seen_documents)
	{
		set_Value (COLUMNNAME_seen_documents, Boolean.valueOf(seen_documents));
	}

	/** Get Seen And Checked All Supporting Documents.
		@return Seen And Checked All Supporting Documents	  */
	public boolean isseen_documents () 
	{
		Object oo = get_Value(COLUMNNAME_seen_documents);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set serialid.
		@param serialid serialid	  */
	public void setserialid (int serialid)
	{
		set_Value (COLUMNNAME_serialid, Integer.valueOf(serialid));
	}

	/** Get serialid.
		@return serialid	  */
	public int getserialid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_serialid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Statement Balance.
		@param statementbal Statement Balance	  */
	public void setstatementbal (BigDecimal statementbal)
	{
		set_Value (COLUMNNAME_statementbal, statementbal);
	}

	/** Get Statement Balance.
		@return Statement Balance	  */
	public BigDecimal getstatementbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_statementbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Sum Interest.
		@param suminterest Sum Interest	  */
	public void setsuminterest (BigDecimal suminterest)
	{
		set_Value (COLUMNNAME_suminterest, suminterest);
	}

	/** Get Sum Interest.
		@return Sum Interest	  */
	public BigDecimal getsuminterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_suminterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Sum Other Charges.
		@param sumothercharges Sum Other Charges	  */
	public void setsumothercharges (BigDecimal sumothercharges)
	{
		set_Value (COLUMNNAME_sumothercharges, sumothercharges);
	}

	/** Get Sum Other Charges.
		@return Sum Other Charges	  */
	public BigDecimal getsumothercharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sumothercharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Shares.
		@param totalshares Total Shares	  */
	public void settotalshares (BigDecimal totalshares)
	{
		set_Value (COLUMNNAME_totalshares, totalshares);
	}

	/** Get Total Shares.
		@return Total Shares	  */
	public BigDecimal gettotalshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_totalshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set Write Off Date.
		@param writeoffdate Write Off Date	  */
	public void setwriteoffdate (Timestamp writeoffdate)
	{
		set_Value (COLUMNNAME_writeoffdate, writeoffdate);
	}

	/** Get Write Off Date.
		@return Write Off Date	  */
	public Timestamp getwriteoffdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_writeoffdate);
	}

	/** Set Writing Date.
		@param writingdate Writing Date	  */
	public void setwritingdate (Timestamp writingdate)
	{
		set_Value (COLUMNNAME_writingdate, writingdate);
	}

	/** Get Writing Date.
		@return Writing Date	  */
	public Timestamp getwritingdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_writingdate);
	}

	/** Set Writing Remarks.
		@param writingremarks Writing Remarks	  */
	public void setwritingremarks (String writingremarks)
	{
		set_Value (COLUMNNAME_writingremarks, writingremarks);
	}

	/** Get Writing Remarks.
		@return Writing Remarks	  */
	public String getwritingremarks () 
	{
		return (String)get_Value(COLUMNNAME_writingremarks);
	}

	/** Set Written.
		@param written Written	  */
	public void setwritten (boolean written)
	{
		set_Value (COLUMNNAME_written, Boolean.valueOf(written));
	}

	/** Get Written.
		@return Written	  */
	public boolean iswritten () 
	{
		Object oo = get_Value(COLUMNNAME_written);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Written Off.
		@param writtenoff Written Off	  */
	public void setwrittenoff (boolean writtenoff)
	{
		set_Value (COLUMNNAME_writtenoff, Boolean.valueOf(writtenoff));
	}

	/** Get Written Off.
		@return Written Off	  */
	public boolean iswrittenoff () 
	{
		Object oo = get_Value(COLUMNNAME_writtenoff);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}