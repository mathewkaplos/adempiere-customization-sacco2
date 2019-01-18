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
import org.compiere.util.KeyNamePair;

/** Generated Model for s_shareremittance
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_shareremittance extends PO implements I_s_shareremittance, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190118L;

    /** Standard Constructor */
    public X_s_shareremittance (Properties ctx, int s_shareremittance_ID, String trxName)
    {
      super (ctx, s_shareremittance_ID, trxName);
      /** if (s_shareremittance_ID == 0)
        {
			setremittancedate (new Timestamp( System.currentTimeMillis() ));
// @Date@
			sets_member_ID (0);
			sets_membershares_ID (0);
			sets_shareremittance_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_shareremittance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_shareremittance[")
        .append(get_ID()).append("]");
      return sb.toString();
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
		@param BankAccount_Acct Bank Account	  */
	public void setBankAccount_Acct (String BankAccount_Acct)
	{
		set_Value (COLUMNNAME_BankAccount_Acct, BankAccount_Acct);
	}

	/** Get Bank Account.
		@return Bank Account	  */
	public String getBankAccount_Acct () 
	{
		return (String)get_Value(COLUMNNAME_BankAccount_Acct);
	}

	/** Set Save.
		@param btn_save_deposit Save	  */
	public void setbtn_save_deposit (String btn_save_deposit)
	{
		set_Value (COLUMNNAME_btn_save_deposit, btn_save_deposit);
	}

	/** Get Save.
		@return Save	  */
	public String getbtn_save_deposit () 
	{
		return (String)get_Value(COLUMNNAME_btn_save_deposit);
	}

	/** Set Save Withdrawal.
		@param btn_save_share_remittance Save Withdrawal	  */
	public void setbtn_save_share_remittance (String btn_save_share_remittance)
	{
		set_Value (COLUMNNAME_btn_save_share_remittance, btn_save_share_remittance);
	}

	/** Get Save Withdrawal.
		@return Save Withdrawal	  */
	public String getbtn_save_share_remittance () 
	{
		return (String)get_Value(COLUMNNAME_btn_save_share_remittance);
	}

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

	/** Set Cheque Date.
		@param ChequeDate Cheque Date	  */
	public void setChequeDate (Timestamp ChequeDate)
	{
		set_Value (COLUMNNAME_ChequeDate, ChequeDate);
	}

	/** Get Cheque Date.
		@return Cheque Date	  */
	public Timestamp getChequeDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ChequeDate);
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

	/** Set Commission Amount.
		@param CommissionAmt 
		Commission Amount
	  */
	public void setCommissionAmt (BigDecimal CommissionAmt)
	{
		set_Value (COLUMNNAME_CommissionAmt, CommissionAmt);
	}

	/** Get Commission Amount.
		@return Commission Amount
	  */
	public BigDecimal getCommissionAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommissionAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Contribution Rate.
		@param contributionrate Contribution Rate	  */
	public void setcontributionrate (BigDecimal contributionrate)
	{
		set_Value (COLUMNNAME_contributionrate, contributionrate);
	}

	/** Get Contribution Rate.
		@return Contribution Rate	  */
	public BigDecimal getcontributionrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_contributionrate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Affects Monthly Debit Raise.
		@param DebitRaiseAffected Affects Monthly Debit Raise	  */
	public void setDebitRaiseAffected (boolean DebitRaiseAffected)
	{
		set_Value (COLUMNNAME_DebitRaiseAffected, Boolean.valueOf(DebitRaiseAffected));
	}

	/** Get Affects Monthly Debit Raise.
		@return Affects Monthly Debit Raise	  */
	public boolean isDebitRaiseAffected () 
	{
		Object oo = get_Value(COLUMNNAME_DebitRaiseAffected);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Is Withdrawal.
		@param is_withdrawal Is Withdrawal	  */
	public void setis_withdrawal (boolean is_withdrawal)
	{
		set_Value (COLUMNNAME_is_withdrawal, Boolean.valueOf(is_withdrawal));
	}

	/** Get Is Withdrawal.
		@return Is Withdrawal	  */
	public boolean is_withdrawal () 
	{
		Object oo = get_Value(COLUMNNAME_is_withdrawal);
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

	/** Set Month Closing Balance.
		@param monthclosingbal Month Closing Balance	  */
	public void setmonthclosingbal (BigDecimal monthclosingbal)
	{
		set_Value (COLUMNNAME_monthclosingbal, monthclosingbal);
	}

	/** Get Month Closing Balance.
		@return Month Closing Balance	  */
	public BigDecimal getmonthclosingbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthclosingbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Receipt Amount.
		@param receiptamount Receipt Amount	  */
	public void setreceiptamount (BigDecimal receiptamount)
	{
		set_Value (COLUMNNAME_receiptamount, receiptamount);
	}

	/** Get Receipt Amount.
		@return Receipt Amount	  */
	public BigDecimal getreceiptamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_receiptamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Receipt Mode.
		@param receiptmode Receipt Mode	  */
	public void setreceiptmode (String receiptmode)
	{
		set_Value (COLUMNNAME_receiptmode, receiptmode);
	}

	/** Get Receipt Mode.
		@return Receipt Mode	  */
	public String getreceiptmode () 
	{
		return (String)get_Value(COLUMNNAME_receiptmode);
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

	/** Set Recover Total Amount From Share Transfer.
		@param recover_from_share_transfer Recover Total Amount From Share Transfer	  */
	public void setrecover_from_share_transfer (boolean recover_from_share_transfer)
	{
		set_Value (COLUMNNAME_recover_from_share_transfer, Boolean.valueOf(recover_from_share_transfer));
	}

	/** Get Recover Total Amount From Share Transfer.
		@return Recover Total Amount From Share Transfer	  */
	public boolean isrecover_from_share_transfer () 
	{
		Object oo = get_Value(COLUMNNAME_recover_from_share_transfer);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Remarks.
		@param Remarks 
		Remarks
	  */
	public void setRemarks (String Remarks)
	{
		set_Value (COLUMNNAME_Remarks, Remarks);
	}

	/** Get Remarks.
		@return Remarks
	  */
	public String getRemarks () 
	{
		return (String)get_Value(COLUMNNAME_Remarks);
	}

	/** Set Remittance Date.
		@param remittancedate Remittance Date	  */
	public void setremittancedate (Timestamp remittancedate)
	{
		set_Value (COLUMNNAME_remittancedate, remittancedate);
	}

	/** Get Remittance Date.
		@return Remittance Date	  */
	public Timestamp getremittancedate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_remittancedate);
	}

	/** Set Remittance Period.
		@param remittanceper Remittance Period	  */
	public void setremittanceper (int remittanceper)
	{
		set_Value (COLUMNNAME_remittanceper, Integer.valueOf(remittanceper));
	}

	/** Get Remittance Period.
		@return Remittance Period	  */
	public int getremittanceper () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_remittanceper);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remittance Remarks.
		@param remittanceremarks Remittance Remarks	  */
	public void setremittanceremarks (String remittanceremarks)
	{
		set_Value (COLUMNNAME_remittanceremarks, remittanceremarks);
	}

	/** Get Remittance Remarks.
		@return Remittance Remarks	  */
	public String getremittanceremarks () 
	{
		return (String)get_Value(COLUMNNAME_remittanceremarks);
	}

	/** Set Remittance Year.
		@param remittanceyear Remittance Year	  */
	public void setremittanceyear (int remittanceyear)
	{
		set_Value (COLUMNNAME_remittanceyear, Integer.valueOf(remittanceyear));
	}

	/** Get Remittance Year.
		@return Remittance Year	  */
	public int getremittanceyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_remittanceyear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set s_shareremittance ID.
		@param s_shareremittance_ID s_shareremittance ID	  */
	public void sets_shareremittance_ID (int s_shareremittance_ID)
	{
		if (s_shareremittance_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_shareremittance_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_shareremittance_ID, Integer.valueOf(s_shareremittance_ID));
	}

	/** Get s_shareremittance ID.
		@return s_shareremittance ID	  */
	public int gets_shareremittance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shareremittance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_ID);
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

	/** Set Share Balance.
		@param ShareBalance Share Balance	  */
	public void setShareBalance (BigDecimal ShareBalance)
	{
		set_Value (COLUMNNAME_ShareBalance, ShareBalance);
	}

	/** Get Share Balance.
		@return Share Balance	  */
	public BigDecimal getShareBalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ShareBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getsharegl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsharegl_Acct(), get_TrxName());	}

	/** Set Share Type GL Code.
		@param sharegl_Acct Share Type GL Code	  */
	public void setsharegl_Acct (int sharegl_Acct)
	{
		set_Value (COLUMNNAME_sharegl_Acct, Integer.valueOf(sharegl_Acct));
	}

	/** Get Share Type GL Code.
		@return Share Type GL Code	  */
	public int getsharegl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharegl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Time.
		@param TransactionTime Transaction Time	  */
	public void setTransactionTime (Timestamp TransactionTime)
	{
		set_Value (COLUMNNAME_TransactionTime, TransactionTime);
	}

	/** Get Transaction Time.
		@return Transaction Time	  */
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
}