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

/** Generated Model for s_petty_cash
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_petty_cash extends PO implements I_s_petty_cash, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190604L;

    /** Standard Constructor */
    public X_s_petty_cash (Properties ctx, int s_petty_cash_ID, String trxName)
    {
      super (ctx, s_petty_cash_ID, trxName);
      /** if (s_petty_cash_ID == 0)
        {
			setDocStatus (null);
// DR
			setPosted (false);
// N
			sets_petty_cash_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_petty_cash (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_petty_cash[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set authorizedby.
		@param authorizedby authorizedby	  */
	public void setauthorizedby (String authorizedby)
	{
		set_Value (COLUMNNAME_authorizedby, authorizedby);
	}

	/** Get authorizedby.
		@return authorizedby	  */
	public String getauthorizedby () 
	{
		return (String)get_Value(COLUMNNAME_authorizedby);
	}

	/** Set Print.
		@param btn_print Print	  */
	public void setbtn_print (String btn_print)
	{
		set_Value (COLUMNNAME_btn_print, btn_print);
	}

	/** Get Print.
		@return Print	  */
	public String getbtn_print () 
	{
		return (String)get_Value(COLUMNNAME_btn_print);
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

	public I_C_ValidCombination getCr_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getCr_Acct(), get_TrxName());	}

	/** Set Cr. Account.
		@param Cr_Acct Cr. Account	  */
	public void setCr_Acct (int Cr_Acct)
	{
		set_Value (COLUMNNAME_Cr_Acct, Integer.valueOf(Cr_Acct));
	}

	/** Get Cr. Account.
		@return Cr. Account	  */
	public int getCr_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Cr_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_C_ValidCombination getDr_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getDr_Acct(), get_TrxName());	}

	/** Set Dr. Account.
		@param Dr_Acct Dr. Account	  */
	public void setDr_Acct (int Dr_Acct)
	{
		set_Value (COLUMNNAME_Dr_Acct, Integer.valueOf(Dr_Acct));
	}

	/** Get Dr. Account.
		@return Dr. Account	  */
	public int getDr_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Dr_Acct);
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

	/** Set Is Benevolent.
		@param isBenevolent Is Benevolent	  */
	public void setisBenevolent (boolean isBenevolent)
	{
		set_Value (COLUMNNAME_isBenevolent, Boolean.valueOf(isBenevolent));
	}

	/** Get Is Benevolent.
		@return Is Benevolent	  */
	public boolean isBenevolent () 
	{
		Object oo = get_Value(COLUMNNAME_isBenevolent);
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

	/** Set paidby.
		@param paidby paidby	  */
	public void setpaidby (String paidby)
	{
		set_Value (COLUMNNAME_paidby, paidby);
	}

	/** Get paidby.
		@return paidby	  */
	public String getpaidby () 
	{
		return (String)get_Value(COLUMNNAME_paidby);
	}

	/** Set Payee.
		@param payee Payee	  */
	public void setpayee (String payee)
	{
		set_Value (COLUMNNAME_payee, payee);
	}

	/** Get Payee.
		@return Payee	  */
	public String getpayee () 
	{
		return (String)get_Value(COLUMNNAME_payee);
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

	/** Set Pending Disbursement.
		@param pending_disbursement Pending Disbursement	  */
	public void setpending_disbursement (BigDecimal pending_disbursement)
	{
		set_Value (COLUMNNAME_pending_disbursement, pending_disbursement);
	}

	/** Get Pending Disbursement.
		@return Pending Disbursement	  */
	public BigDecimal getpending_disbursement () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_pending_disbursement);
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

	/** Set s_petty_cash ID.
		@param s_petty_cash_ID s_petty_cash ID	  */
	public void sets_petty_cash_ID (int s_petty_cash_ID)
	{
		if (s_petty_cash_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_petty_cash_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_petty_cash_ID, Integer.valueOf(s_petty_cash_ID));
	}

	/** Get s_petty_cash ID.
		@return s_petty_cash ID	  */
	public int gets_petty_cash_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_petty_cash_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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