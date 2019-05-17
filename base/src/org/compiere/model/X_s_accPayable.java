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

/** Generated Model for s_accPayable
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_accPayable extends PO implements I_s_accPayable, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190107L;

    /** Standard Constructor */
    public X_s_accPayable (Properties ctx, int s_accPayable_ID, String trxName)
    {
      super (ctx, s_accPayable_ID, trxName);
      /** if (s_accPayable_ID == 0)
        {
			sets_accPayable_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_accPayable (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_accPayable[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Credit Amount.
		@param CrAmount Credit Amount	  */
	public void setCrAmount (BigDecimal CrAmount)
	{
		set_Value (COLUMNNAME_CrAmount, CrAmount);
	}

	/** Get Credit Amount.
		@return Credit Amount	  */
	public BigDecimal getCrAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CrAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getCredit_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getCredit_Acct(), get_TrxName());	}

	/** Set Credit Account.
		@param Credit_Acct Credit Account	  */
	public void setCredit_Acct (int Credit_Acct)
	{
		set_Value (COLUMNNAME_Credit_Acct, Integer.valueOf(Credit_Acct));
	}

	/** Get Credit Account.
		@return Credit Account	  */
	public int getCredit_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Credit_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Deposit.
		@param Deposit Deposit	  */
	public void setDeposit (BigDecimal Deposit)
	{
		set_Value (COLUMNNAME_Deposit, Deposit);
	}

	/** Get Deposit.
		@return Deposit	  */
	public BigDecimal getDeposit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Deposit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set GLID.
		@param GLID GLID	  */
	public void setGLID (int GLID)
	{
		set_Value (COLUMNNAME_GLID, Integer.valueOf(GLID));
	}

	/** Get GLID.
		@return GLID	  */
	public int getGLID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GLID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set invoicedate.
		@param invoicedate invoicedate	  */
	public void setinvoicedate (Timestamp invoicedate)
	{
		set_Value (COLUMNNAME_invoicedate, invoicedate);
	}

	/** Get invoicedate.
		@return invoicedate	  */
	public Timestamp getinvoicedate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_invoicedate);
	}

	/** Set invoicenumber.
		@param invoicenumber invoicenumber	  */
	public void setinvoicenumber (String invoicenumber)
	{
		set_Value (COLUMNNAME_invoicenumber, invoicenumber);
	}

	/** Get invoicenumber.
		@return invoicenumber	  */
	public String getinvoicenumber () 
	{
		return (String)get_Value(COLUMNNAME_invoicenumber);
	}

	/** Set LoanShare.
		@param LoanShare LoanShare	  */
	public void setLoanShare (String LoanShare)
	{
		set_Value (COLUMNNAME_LoanShare, LoanShare);
	}

	/** Get LoanShare.
		@return LoanShare	  */
	public String getLoanShare () 
	{
		return (String)get_Value(COLUMNNAME_LoanShare);
	}

	/** Set Member #.
		@param mcode Member #	  */
	public void setmcode (String mcode)
	{
		set_Value (COLUMNNAME_mcode, mcode);
	}

	/** Get Member #.
		@return Member #	  */
	public String getmcode () 
	{
		return (String)get_Value(COLUMNNAME_mcode);
	}

	/** Set ncChargeAmt.
		@param ncChargeAmt ncChargeAmt	  */
	public void setncChargeAmt (BigDecimal ncChargeAmt)
	{
		set_Value (COLUMNNAME_ncChargeAmt, ncChargeAmt);
	}

	/** Get ncChargeAmt.
		@return ncChargeAmt	  */
	public BigDecimal getncChargeAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ncChargeAmt);
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
	/** Error Detection = 5 */
	public static final String PAYMODE_ErrorDetection = "5";
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

	/** Set Reference.
		@param Reference 
		Reference for this record
	  */
	public void setReference (String Reference)
	{
		set_Value (COLUMNNAME_Reference, Reference);
	}

	/** Get Reference.
		@return Reference for this record
	  */
	public String getReference () 
	{
		return (String)get_Value(COLUMNNAME_Reference);
	}

	/** Set s_accPayable ID.
		@param s_accPayable_ID s_accPayable ID	  */
	public void sets_accPayable_ID (int s_accPayable_ID)
	{
		if (s_accPayable_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_accPayable_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_accPayable_ID, Integer.valueOf(s_accPayable_ID));
	}

	/** Get s_accPayable ID.
		@return s_accPayable ID	  */
	public int gets_accPayable_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_accPayable_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_bank ID.
		@param s_bank_ID s_bank ID	  */
	public void sets_bank_ID (int s_bank_ID)
	{
		if (s_bank_ID < 1) 
			set_Value (COLUMNNAME_s_bank_ID, null);
		else 
			set_Value (COLUMNNAME_s_bank_ID, Integer.valueOf(s_bank_ID));
	}

	/** Get s_bank ID.
		@return s_bank ID	  */
	public int gets_bank_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_bank_ID);
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

	/** Set suppliername.
		@param suppliername suppliername	  */
	public void setsuppliername (String suppliername)
	{
		set_Value (COLUMNNAME_suppliername, suppliername);
	}

	/** Get suppliername.
		@return suppliername	  */
	public String getsuppliername () 
	{
		return (String)get_Value(COLUMNNAME_suppliername);
	}

	/** Set To Apply.
		@param ToApply To Apply	  */
	public void setToApply (BigDecimal ToApply)
	{
		set_Value (COLUMNNAME_ToApply, ToApply);
	}

	/** Get To Apply.
		@return To Apply	  */
	public BigDecimal getToApply () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ToApply);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Transaction Amount.
		@param TransAmount Transaction Amount	  */
	public void setTransAmount (BigDecimal TransAmount)
	{
		set_Value (COLUMNNAME_TransAmount, TransAmount);
	}

	/** Get Transaction Amount.
		@return Transaction Amount	  */
	public BigDecimal getTransAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TransAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Transaction Code.
		@param Transcode Transaction Code	  */
	public void setTranscode (String Transcode)
	{
		set_Value (COLUMNNAME_Transcode, Transcode);
	}

	/** Get Transaction Code.
		@return Transaction Code	  */
	public String getTranscode () 
	{
		return (String)get_Value(COLUMNNAME_Transcode);
	}

	/** Set Transaction Date.
		@param TransDate Transaction Date	  */
	public void setTransDate (Timestamp TransDate)
	{
		set_Value (COLUMNNAME_TransDate, TransDate);
	}

	/** Get Transaction Date.
		@return Transaction Date	  */
	public Timestamp getTransDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_TransDate);
	}

	/** Set Period.
		@param transperiod Period	  */
	public void settransperiod (int transperiod)
	{
		set_Value (COLUMNNAME_transperiod, Integer.valueOf(transperiod));
	}

	/** Get Period.
		@return Period	  */
	public int gettransperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Year.
		@param transyear Transaction Year	  */
	public void settransyear (int transyear)
	{
		set_Value (COLUMNNAME_transyear, Integer.valueOf(transyear));
	}

	/** Get Transaction Year.
		@return Transaction Year	  */
	public int gettransyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transyear);
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
}