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

/** Generated Model for GenLedger
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_GenLedger extends PO implements I_GenLedger, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190122L;

    /** Standard Constructor */
    public X_GenLedger (Properties ctx, int GenLedger_ID, String trxName)
    {
      super (ctx, GenLedger_ID, trxName);
      /** if (GenLedger_ID == 0)
        {
			setGenLedger_ID (0);
        } */
    }

    /** Load Constructor */
    public X_GenLedger (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_GenLedger[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_ValidCombination getAccNo_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getAccNo_Acct(), get_TrxName());	}

	/** Set Account No.
		@param AccNo_Acct Account No	  */
	public void setAccNo_Acct (int AccNo_Acct)
	{
		set_Value (COLUMNNAME_AccNo_Acct, Integer.valueOf(AccNo_Acct));
	}

	/** Get Account No.
		@return Account No	  */
	public int getAccNo_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AccNo_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getC_Period_ID(), get_TrxName());	}

	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1) 
			set_Value (COLUMNNAME_C_Period_ID, null);
		else 
			set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_C_ValidCombination getContraAcc_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getContraAcc_Acct(), get_TrxName());	}

	/** Set Contra Account.
		@param ContraAcc_Acct Contra Account	  */
	public void setContraAcc_Acct (int ContraAcc_Acct)
	{
		set_Value (COLUMNNAME_ContraAcc_Acct, Integer.valueOf(ContraAcc_Acct));
	}

	/** Get Contra Account.
		@return Contra Account	  */
	public int getContraAcc_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ContraAcc_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CR.
		@param CR CR	  */
	public void setCR (BigDecimal CR)
	{
		set_Value (COLUMNNAME_CR, CR);
	}

	/** Get CR.
		@return CR	  */
	public BigDecimal getCR () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CR);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Date Reconciled.
		@param DateReconciled Date Reconciled	  */
	public void setDateReconciled (Timestamp DateReconciled)
	{
		set_Value (COLUMNNAME_DateReconciled, DateReconciled);
	}

	/** Get Date Reconciled.
		@return Date Reconciled	  */
	public Timestamp getDateReconciled () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReconciled);
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

	/** Set DR.
		@param DR DR	  */
	public void setDR (BigDecimal DR)
	{
		set_Value (COLUMNNAME_DR, DR);
	}

	/** Get DR.
		@return DR	  */
	public BigDecimal getDR () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DR);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set GenLedger ID.
		@param GenLedger_ID GenLedger ID	  */
	public void setGenLedger_ID (int GenLedger_ID)
	{
		if (GenLedger_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GenLedger_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GenLedger_ID, Integer.valueOf(GenLedger_ID));
	}

	/** Get GenLedger ID.
		@return GenLedger ID	  */
	public int getGenLedger_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GenLedger_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GroupAccount.
		@param GroupAccount GroupAccount	  */
	public void setGroupAccount (boolean GroupAccount)
	{
		set_Value (COLUMNNAME_GroupAccount, Boolean.valueOf(GroupAccount));
	}

	/** Get GroupAccount.
		@return GroupAccount	  */
	public boolean isGroupAccount () 
	{
		Object oo = get_Value(COLUMNNAME_GroupAccount);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set OBal.
		@param OBal OBal	  */
	public void setOBal (BigDecimal OBal)
	{
		set_Value (COLUMNNAME_OBal, OBal);
	}

	/** Get OBal.
		@return OBal	  */
	public BigDecimal getOBal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OBal);
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

	/** Set Reconciled.
		@param Reconciled Reconciled	  */
	public void setReconciled (boolean Reconciled)
	{
		set_Value (COLUMNNAME_Reconciled, Boolean.valueOf(Reconciled));
	}

	/** Get Reconciled.
		@return Reconciled	  */
	public boolean isReconciled () 
	{
		Object oo = get_Value(COLUMNNAME_Reconciled);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ReconNo.
		@param ReconNo ReconNo	  */
	public void setReconNo (String ReconNo)
	{
		set_Value (COLUMNNAME_ReconNo, ReconNo);
	}

	/** Get ReconNo.
		@return ReconNo	  */
	public String getReconNo () 
	{
		return (String)get_Value(COLUMNNAME_ReconNo);
	}

	/** Set RunningBal.
		@param RunningBal RunningBal	  */
	public void setRunningBal (BigDecimal RunningBal)
	{
		set_Value (COLUMNNAME_RunningBal, RunningBal);
	}

	/** Get RunningBal.
		@return RunningBal	  */
	public BigDecimal getRunningBal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RunningBal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Employer.
		@param s_employers_ID Employer	  */
	public void sets_employers_ID (int s_employers_ID)
	{
		if (s_employers_ID < 1) 
			set_Value (COLUMNNAME_s_employers_ID, null);
		else 
			set_Value (COLUMNNAME_s_employers_ID, Integer.valueOf(s_employers_ID));
	}

	/** Get Employer.
		@return Employer	  */
	public int gets_employers_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_employers_ID);
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

	/** Set Subledger.
		@param Subledger Subledger	  */
	public void setSubledger (boolean Subledger)
	{
		set_Value (COLUMNNAME_Subledger, Boolean.valueOf(Subledger));
	}

	/** Get Subledger.
		@return Subledger	  */
	public boolean isSubledger () 
	{
		Object oo = get_Value(COLUMNNAME_Subledger);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set TransactionNo.
		@param TransactionNo TransactionNo	  */
	public void setTransactionNo (String TransactionNo)
	{
		set_Value (COLUMNNAME_TransactionNo, TransactionNo);
	}

	/** Get TransactionNo.
		@return TransactionNo	  */
	public String getTransactionNo () 
	{
		return (String)get_Value(COLUMNNAME_TransactionNo);
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

	/** Set Transaction Time.
		@param TransTime Transaction Time	  */
	public void setTransTime (Timestamp TransTime)
	{
		set_Value (COLUMNNAME_TransTime, TransTime);
	}

	/** Get Transaction Time.
		@return Transaction Time	  */
	public Timestamp getTransTime () 
	{
		return (Timestamp)get_Value(COLUMNNAME_TransTime);
	}

	/** Set Transaction Type.
		@param TransType Transaction Type	  */
	public void setTransType (String TransType)
	{
		set_Value (COLUMNNAME_TransType, TransType);
	}

	/** Get Transaction Type.
		@return Transaction Type	  */
	public String getTransType () 
	{
		return (String)get_Value(COLUMNNAME_TransType);
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