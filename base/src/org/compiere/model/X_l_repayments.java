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

/** Generated Model for l_repayments
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_l_repayments extends PO implements I_l_repayments, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190115L;

    /** Standard Constructor */
    public X_l_repayments (Properties ctx, int l_repayments_ID, String trxName)
    {
      super (ctx, l_repayments_ID, trxName);
      /** if (l_repayments_ID == 0)
        {
			setIsComplete (false);
// N
			setl_repayments_ID (0);
			setLoanNo (null);
        } */
    }

    /** Load Constructor */
    public X_l_repayments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_l_repayments[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AdditionalCharges.
		@param AdditionalCharges AdditionalCharges	  */
	public void setAdditionalCharges (BigDecimal AdditionalCharges)
	{
		set_Value (COLUMNNAME_AdditionalCharges, AdditionalCharges);
	}

	/** Get AdditionalCharges.
		@return AdditionalCharges	  */
	public BigDecimal getAdditionalCharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AdditionalCharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Affects Monthly Debit Raise.
		@param affects_debit_raise Affects Monthly Debit Raise	  */
	public void setaffects_debit_raise (boolean affects_debit_raise)
	{
		set_Value (COLUMNNAME_affects_debit_raise, Boolean.valueOf(affects_debit_raise));
	}

	/** Get Affects Monthly Debit Raise.
		@return Affects Monthly Debit Raise	  */
	public boolean isaffects_debit_raise () 
	{
		Object oo = get_Value(COLUMNNAME_affects_debit_raise);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Affects DR.
		@param affectsdr Affects DR	  */
	public void setaffectsdr (int affectsdr)
	{
		set_Value (COLUMNNAME_affectsdr, Integer.valueOf(affectsdr));
	}

	/** Get Affects DR.
		@return Affects DR	  */
	public int getaffectsdr () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_affectsdr);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AmountInWords.
		@param AmountInWords AmountInWords	  */
	public void setAmountInWords (String AmountInWords)
	{
		set_Value (COLUMNNAME_AmountInWords, AmountInWords);
	}

	/** Get AmountInWords.
		@return AmountInWords	  */
	public String getAmountInWords () 
	{
		return (String)get_Value(COLUMNNAME_AmountInWords);
	}

	/** Set Bank Account.
		@param BankAccount Bank Account	  */
	public void setBankAccount (String BankAccount)
	{
		set_Value (COLUMNNAME_BankAccount, BankAccount);
	}

	/** Get Bank Account.
		@return Bank Account	  */
	public String getBankAccount () 
	{
		return (String)get_Value(COLUMNNAME_BankAccount);
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

	/** Set Branch ID.
		@param BranchID 
		Bank Branch ID
	  */
	public void setBranchID (int BranchID)
	{
		set_Value (COLUMNNAME_BranchID, Integer.valueOf(BranchID));
	}

	/** Get Branch ID.
		@return Bank Branch ID
	  */
	public int getBranchID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BranchID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Save.
		@param btn_save Save	  */
	public void setbtn_save (String btn_save)
	{
		set_Value (COLUMNNAME_btn_save, btn_save);
	}

	/** Get Save.
		@return Save	  */
	public String getbtn_save () 
	{
		return (String)get_Value(COLUMNNAME_btn_save);
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

	public org.compiere.model.I_C_Bank getC_Bank() throws RuntimeException
    {
		return (org.compiere.model.I_C_Bank)MTable.get(getCtx(), org.compiere.model.I_C_Bank.Table_Name)
			.getPO(getC_Bank_ID(), get_TrxName());	}

	/** Set Bank.
		@param C_Bank_ID 
		Bank
	  */
	public void setC_Bank_ID (int C_Bank_ID)
	{
		if (C_Bank_ID < 1) 
			set_Value (COLUMNNAME_C_Bank_ID, null);
		else 
			set_Value (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
	}

	/** Get Bank.
		@return Bank
	  */
	public int getC_Bank_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Cheque No.
		@param ChequeNo Cheque No	  */
	public void setChequeNo (String ChequeNo)
	{
		set_Value (COLUMNNAME_ChequeNo, ChequeNo);
	}

	/** Get Cheque No.
		@return Cheque No	  */
	public String getChequeNo () 
	{
		return (String)get_Value(COLUMNNAME_ChequeNo);
	}

	/** Set Clear.
		@param clear Clear	  */
	public void setclear (boolean clear)
	{
		set_Value (COLUMNNAME_clear, Boolean.valueOf(clear));
	}

	/** Get Clear.
		@return Clear	  */
	public boolean isclear () 
	{
		Object oo = get_Value(COLUMNNAME_clear);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
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

	/** Set Expected Interest.
		@param expectedinterest Expected Interest	  */
	public void setexpectedinterest (BigDecimal expectedinterest)
	{
		set_Value (COLUMNNAME_expectedinterest, expectedinterest);
	}

	/** Get Expected Interest.
		@return Expected Interest	  */
	public BigDecimal getexpectedinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_expectedinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Extra Interest.
		@param ExtraInterest Extra Interest	  */
	public void setExtraInterest (BigDecimal ExtraInterest)
	{
		set_Value (COLUMNNAME_ExtraInterest, ExtraInterest);
	}

	/** Get Extra Interest.
		@return Extra Interest	  */
	public BigDecimal getExtraInterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ExtraInterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set GLAccount.
		@param GLAccount GLAccount	  */
	public void setGLAccount (String GLAccount)
	{
		set_Value (COLUMNNAME_GLAccount, GLAccount);
	}

	/** Get GLAccount.
		@return GLAccount	  */
	public String getGLAccount () 
	{
		return (String)get_Value(COLUMNNAME_GLAccount);
	}

	/** Set Gross Amount Due.
		@param gross_amount_due Gross Amount Due	  */
	public void setgross_amount_due (BigDecimal gross_amount_due)
	{
		set_Value (COLUMNNAME_gross_amount_due, gross_amount_due);
	}

	/** Get Gross Amount Due.
		@return Gross Amount Due	  */
	public BigDecimal getgross_amount_due () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_gross_amount_due);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest.
		@param Interest Interest	  */
	public void setInterest (BigDecimal Interest)
	{
		set_Value (COLUMNNAME_Interest, Interest);
	}

	/** Get Interest.
		@return Interest	  */
	public BigDecimal getInterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Interest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Interest Due.
		@param interest_due Total Interest Due	  */
	public void setinterest_due (BigDecimal interest_due)
	{
		set_Value (COLUMNNAME_interest_due, interest_due);
	}

	/** Get Total Interest Due.
		@return Total Interest Due	  */
	public BigDecimal getinterest_due () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interest_due);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getinterestgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getinterestgl_Acct(), get_TrxName());	}

	/** Set Interest GL Code.
		@param interestgl_Acct Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct)
	{
		set_Value (COLUMNNAME_interestgl_Acct, Integer.valueOf(interestgl_Acct));
	}

	/** Get Interest GL Code.
		@return Interest GL Code	  */
	public int getinterestgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_interestgl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Is Refund.
		@param is_refund Is Refund	  */
	public void setis_refund (boolean is_refund)
	{
		set_Value (COLUMNNAME_is_refund, Boolean.valueOf(is_refund));
	}

	/** Get Is Refund.
		@return Is Refund	  */
	public boolean is_refund () 
	{
		Object oo = get_Value(COLUMNNAME_is_refund);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Repayment.
		@param is_repayment Is Repayment	  */
	public void setis_repayment (boolean is_repayment)
	{
		set_Value (COLUMNNAME_is_repayment, Boolean.valueOf(is_repayment));
	}

	/** Get Is Repayment.
		@return Is Repayment	  */
	public boolean is_repayment () 
	{
		Object oo = get_Value(COLUMNNAME_is_repayment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Top Up.
		@param is_topup Is Top Up	  */
	public void setis_topup (boolean is_topup)
	{
		set_Value (COLUMNNAME_is_topup, Boolean.valueOf(is_topup));
	}

	/** Get Is Top Up.
		@return Is Top Up	  */
	public boolean is_topup () 
	{
		Object oo = get_Value(COLUMNNAME_is_topup);
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

	/** Set l_repayments ID.
		@param l_repayments_ID l_repayments ID	  */
	public void setl_repayments_ID (int l_repayments_ID)
	{
		if (l_repayments_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_l_repayments_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_l_repayments_ID, Integer.valueOf(l_repayments_ID));
	}

	/** Get l_repayments ID.
		@return l_repayments ID	  */
	public int getl_repayments_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_l_repayments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LAmount.
		@param LAmount LAmount	  */
	public void setLAmount (BigDecimal LAmount)
	{
		set_Value (COLUMNNAME_LAmount, LAmount);
	}

	/** Get LAmount.
		@return LAmount	  */
	public BigDecimal getLAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Last Pay Date.
		@param last_pay_date Last Pay Date	  */
	public void setlast_pay_date (Timestamp last_pay_date)
	{
		throw new IllegalArgumentException ("last_pay_date is virtual column");	}

	/** Get Last Pay Date.
		@return Last Pay Date	  */
	public Timestamp getlast_pay_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_last_pay_date);
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

	/** Set Loan Interest Balance.
		@param loan_interest_balance Loan Interest Balance	  */
	public void setloan_interest_balance (BigDecimal loan_interest_balance)
	{
		set_Value (COLUMNNAME_loan_interest_balance, loan_interest_balance);
	}

	/** Get Loan Interest Balance.
		@return Loan Interest Balance	  */
	public BigDecimal getloan_interest_balance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loan_interest_balance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set LoanNo.
		@param LoanNo LoanNo	  */
	public void setLoanNo (String LoanNo)
	{
		set_Value (COLUMNNAME_LoanNo, LoanNo);
	}

	/** Get LoanNo.
		@return LoanNo	  */
	public String getLoanNo () 
	{
		return (String)get_Value(COLUMNNAME_LoanNo);
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

	/** Set Offset Total Amt From Shares/Share Transfer.
		@param offset_from_shares Offset Total Amt From Shares/Share Transfer	  */
	public void setoffset_from_shares (boolean offset_from_shares)
	{
		set_Value (COLUMNNAME_offset_from_shares, Boolean.valueOf(offset_from_shares));
	}

	/** Get Offset Total Amt From Shares/Share Transfer.
		@return Offset Total Amt From Shares/Share Transfer	  */
	public boolean isoffset_from_shares () 
	{
		Object oo = get_Value(COLUMNNAME_offset_from_shares);
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

	/** Set Pay Additional Charges Only.
		@param pay_additional_charges_only Pay Additional Charges Only	  */
	public void setpay_additional_charges_only (boolean pay_additional_charges_only)
	{
		set_Value (COLUMNNAME_pay_additional_charges_only, Boolean.valueOf(pay_additional_charges_only));
	}

	/** Get Pay Additional Charges Only.
		@return Pay Additional Charges Only	  */
	public boolean ispay_additional_charges_only () 
	{
		Object oo = get_Value(COLUMNNAME_pay_additional_charges_only);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Pay Penalty Only.
		@param pay_penalty_only Pay Penalty Only	  */
	public void setpay_penalty_only (boolean pay_penalty_only)
	{
		set_Value (COLUMNNAME_pay_penalty_only, Boolean.valueOf(pay_penalty_only));
	}

	/** Get Pay Penalty Only.
		@return Pay Penalty Only	  */
	public boolean ispay_penalty_only () 
	{
		Object oo = get_Value(COLUMNNAME_pay_penalty_only);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Payment Amount.
		@param PaymentAmount Payment Amount	  */
	public void setPaymentAmount (BigDecimal PaymentAmount)
	{
		set_Value (COLUMNNAME_PaymentAmount, PaymentAmount);
	}

	/** Get Payment Amount.
		@return Payment Amount	  */
	public BigDecimal getPaymentAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PaymentAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Payment Date.
		@param PaymentDate Payment Date	  */
	public void setPaymentDate (Timestamp PaymentDate)
	{
		set_Value (COLUMNNAME_PaymentDate, PaymentDate);
	}

	/** Get Payment Date.
		@return Payment Date	  */
	public Timestamp getPaymentDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_PaymentDate);
	}

	/** Set Payment No.
		@param PaymentNo Payment No	  */
	public void setPaymentNo (String PaymentNo)
	{
		set_Value (COLUMNNAME_PaymentNo, PaymentNo);
	}

	/** Get Payment No.
		@return Payment No	  */
	public String getPaymentNo () 
	{
		return (String)get_Value(COLUMNNAME_PaymentNo);
	}

	/** paymode AD_Reference_ID=1000010 */
	public static final int PAYMODE_AD_Reference_ID=1000010;
	/** CASH PERMIT = CASH PERMIT */
	public static final String PAYMODE_CASHPERMIT = "CASH PERMIT";
	/** DIRECT BANKING = DIRECT BANKING */
	public static final String PAYMODE_DIRECTBANKING = "DIRECT BANKING";
	/** FOSA = FOSA */
	public static final String PAYMODE_FOSA = "FOSA";
	/** SALARY DEDS = SALARY DEDS */
	public static final String PAYMODE_SALARYDEDS = "SALARY DEDS";
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

	/** Set Penalty Due.
		@param penalty_due Penalty Due	  */
	public void setpenalty_due (BigDecimal penalty_due)
	{
		set_Value (COLUMNNAME_penalty_due, penalty_due);
	}

	/** Get Penalty Due.
		@return Penalty Due	  */
	public BigDecimal getpenalty_due () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_penalty_due);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getpenaltyglcode_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getpenaltyglcode_Acct(), get_TrxName());	}

	/** Set Penalty GL Code.
		@param penaltyglcode_Acct Penalty GL Code	  */
	public void setpenaltyglcode_Acct (int penaltyglcode_Acct)
	{
		set_Value (COLUMNNAME_penaltyglcode_Acct, Integer.valueOf(penaltyglcode_Acct));
	}

	/** Get Penalty GL Code.
		@return Penalty GL Code	  */
	public int getpenaltyglcode_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_penaltyglcode_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Expected Principal.
		@param Principal Expected Principal	  */
	public void setPrincipal (BigDecimal Principal)
	{
		set_Value (COLUMNNAME_Principal, Principal);
	}

	/** Get Expected Principal.
		@return Expected Principal	  */
	public BigDecimal getPrincipal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Principal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Receipt No.
		@param ReceiptNo Receipt No	  */
	public void setReceiptNo (String ReceiptNo)
	{
		set_Value (COLUMNNAME_ReceiptNo, ReceiptNo);
	}

	/** Get Receipt No.
		@return Receipt No	  */
	public String getReceiptNo () 
	{
		return (String)get_Value(COLUMNNAME_ReceiptNo);
	}

	/** Set Receipt No Issued.
		@param ReceiptNoIssued Receipt No Issued	  */
	public void setReceiptNoIssued (String ReceiptNoIssued)
	{
		set_Value (COLUMNNAME_ReceiptNoIssued, ReceiptNoIssued);
	}

	/** Get Receipt No Issued.
		@return Receipt No Issued	  */
	public String getReceiptNoIssued () 
	{
		return (String)get_Value(COLUMNNAME_ReceiptNoIssued);
	}

	public org.compiere.model.I_AD_User getrefund_approvedby() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getrefund_approvedby_ID(), get_TrxName());	}

	/** Set Refund/Top-Up Approved By.
		@param refund_approvedby_ID Refund/Top-Up Approved By	  */
	public void setrefund_approvedby_ID (int refund_approvedby_ID)
	{
		if (refund_approvedby_ID < 1) 
			set_Value (COLUMNNAME_refund_approvedby_ID, null);
		else 
			set_Value (COLUMNNAME_refund_approvedby_ID, Integer.valueOf(refund_approvedby_ID));
	}

	/** Get Refund/Top-Up Approved By.
		@return Refund/Top-Up Approved By	  */
	public int getrefund_approvedby_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_refund_approvedby_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reversed.
		@param Reversed Reversed	  */
	public void setReversed (String Reversed)
	{
		set_Value (COLUMNNAME_Reversed, Reversed);
	}

	/** Get Reversed.
		@return Reversed	  */
	public String getReversed () 
	{
		return (String)get_Value(COLUMNNAME_Reversed);
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

	/** Set Loan Type.
		@param s_loantype_ID Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID)
	{
		if (s_loantype_ID < 1) 
			set_Value (COLUMNNAME_s_loantype_ID, null);
		else 
			set_Value (COLUMNNAME_s_loantype_ID, Integer.valueOf(s_loantype_ID));
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

	/** Set Total O/C Due.
		@param total_oc_due Total O/C Due	  */
	public void settotal_oc_due (BigDecimal total_oc_due)
	{
		set_Value (COLUMNNAME_total_oc_due, total_oc_due);
	}

	/** Get Total O/C Due.
		@return Total O/C Due	  */
	public BigDecimal gettotal_oc_due () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_total_oc_due);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Transaction Period.
		@param TransactionPer Transaction Period	  */
	public void setTransactionPer (int TransactionPer)
	{
		set_Value (COLUMNNAME_TransactionPer, Integer.valueOf(TransactionPer));
	}

	/** Get Transaction Period.
		@return Transaction Period	  */
	public int getTransactionPer () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TransactionPer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TransactionTime.
		@param TransactionTime TransactionTime	  */
	public void setTransactionTime (Timestamp TransactionTime)
	{
		set_Value (COLUMNNAME_TransactionTime, TransactionTime);
	}

	/** Get TransactionTime.
		@return TransactionTime	  */
	public Timestamp getTransactionTime () 
	{
		return (Timestamp)get_Value(COLUMNNAME_TransactionTime);
	}

	/** Set Transaction Type.
		@param TransactionType Transaction Type	  */
	public void setTransactionType (String TransactionType)
	{
		set_Value (COLUMNNAME_TransactionType, TransactionType);
	}

	/** Get Transaction Type.
		@return Transaction Type	  */
	public String getTransactionType () 
	{
		return (String)get_Value(COLUMNNAME_TransactionType);
	}

	/** Set Transaction Year.
		@param transactionyear Transaction Year	  */
	public void settransactionyear (int transactionyear)
	{
		set_Value (COLUMNNAME_transactionyear, Integer.valueOf(transactionyear));
	}

	/** Get Transaction Year.
		@return Transaction Year	  */
	public int gettransactionyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transactionyear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transid.
		@param Transid Transid	  */
	public void setTransid (int Transid)
	{
		set_Value (COLUMNNAME_Transid, Integer.valueOf(Transid));
	}

	/** Get Transid.
		@return Transid	  */
	public int getTransid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Transid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set User Code.
		@param UserCode User Code	  */
	public void setUserCode (String UserCode)
	{
		set_Value (COLUMNNAME_UserCode, UserCode);
	}

	/** Get User Code.
		@return User Code	  */
	public String getUserCode () 
	{
		return (String)get_Value(COLUMNNAME_UserCode);
	}

	/** Set Voucher No.
		@param VoucherNo Voucher No	  */
	public void setVoucherNo (String VoucherNo)
	{
		set_Value (COLUMNNAME_VoucherNo, VoucherNo);
	}

	/** Get Voucher No.
		@return Voucher No	  */
	public String getVoucherNo () 
	{
		return (String)get_Value(COLUMNNAME_VoucherNo);
	}
}