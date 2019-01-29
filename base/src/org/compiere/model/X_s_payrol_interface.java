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
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_payrol_interface
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_payrol_interface extends PO implements I_s_payrol_interface, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190125L;

    /** Standard Constructor */
    public X_s_payrol_interface (Properties ctx, int s_payrol_interface_ID, String trxName)
    {
      super (ctx, s_payrol_interface_ID, trxName);
      /** if (s_payrol_interface_ID == 0)
        {
			setC_Period_ID (0);
			sets_payrol_interface_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_payrol_interface (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_payrol_interface[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Compare.
		@param btn_compare Compare	  */
	public void setbtn_compare (String btn_compare)
	{
		set_Value (COLUMNNAME_btn_compare, btn_compare);
	}

	/** Get Compare.
		@return Compare	  */
	public String getbtn_compare () 
	{
		return (String)get_Value(COLUMNNAME_btn_compare);
	}

	/** Set Import.
		@param btn_import Import	  */
	public void setbtn_import (String btn_import)
	{
		set_Value (COLUMNNAME_btn_import, btn_import);
	}

	/** Get Import.
		@return Import	  */
	public String getbtn_import () 
	{
		return (String)get_Value(COLUMNNAME_btn_import);
	}

	/** Set List.
		@param btn_list List	  */
	public void setbtn_list (String btn_list)
	{
		set_Value (COLUMNNAME_btn_list, btn_list);
	}

	/** Get List.
		@return List	  */
	public String getbtn_list () 
	{
		return (String)get_Value(COLUMNNAME_btn_list);
	}

	/** Set Merge.
		@param btn_merge Merge	  */
	public void setbtn_merge (String btn_merge)
	{
		set_Value (COLUMNNAME_btn_merge, btn_merge);
	}

	/** Get Merge.
		@return Merge	  */
	public String getbtn_merge () 
	{
		return (String)get_Value(COLUMNNAME_btn_merge);
	}

	/** Set Post.
		@param btn_post Post	  */
	public void setbtn_post (String btn_post)
	{
		set_Value (COLUMNNAME_btn_post, btn_post);
	}

	/** Get Post.
		@return Post	  */
	public String getbtn_post () 
	{
		return (String)get_Value(COLUMNNAME_btn_post);
	}

	/** Set Process.
		@param btn_process Process	  */
	public void setbtn_process (String btn_process)
	{
		set_Value (COLUMNNAME_btn_process, btn_process);
	}

	/** Get Process.
		@return Process	  */
	public String getbtn_process () 
	{
		return (String)get_Value(COLUMNNAME_btn_process);
	}

	/** Set Update.
		@param btn_update Update	  */
	public void setbtn_update (String btn_update)
	{
		set_Value (COLUMNNAME_btn_update, btn_update);
	}

	/** Get Update.
		@return Update	  */
	public String getbtn_update () 
	{
		return (String)get_Value(COLUMNNAME_btn_update);
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

	/** Set Compared.
		@param compared Compared	  */
	public void setcompared (boolean compared)
	{
		set_Value (COLUMNNAME_compared, Boolean.valueOf(compared));
	}

	/** Get Compared.
		@return Compared	  */
	public boolean iscompared () 
	{
		Object oo = get_Value(COLUMNNAME_compared);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set CSV Imported.
		@param csv_imported CSV Imported	  */
	public void setcsv_imported (boolean csv_imported)
	{
		set_Value (COLUMNNAME_csv_imported, Boolean.valueOf(csv_imported));
	}

	/** Get CSV Imported.
		@return CSV Imported	  */
	public boolean iscsv_imported () 
	{
		Object oo = get_Value(COLUMNNAME_csv_imported);
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

	public I_C_ValidCombination getgr() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getgross(), get_TrxName());	}

	/** Set Gross Amount.
		@param gross Gross Amount	  */
	public void setgross (int gross)
	{
		set_Value (COLUMNNAME_gross, Integer.valueOf(gross));
	}

	/** Get Gross Amount.
		@return Gross Amount	  */
	public int getgross () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_gross);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Number of Records.
		@param number_of_records Number of Records	  */
	public void setnumber_of_records (int number_of_records)
	{
		set_Value (COLUMNNAME_number_of_records, Integer.valueOf(number_of_records));
	}

	/** Get Number of Records.
		@return Number of Records	  */
	public int getnumber_of_records () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_number_of_records);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Department.
		@param s_department_ID Department	  */
	public void sets_department_ID (int s_department_ID)
	{
		if (s_department_ID < 1) 
			set_Value (COLUMNNAME_s_department_ID, null);
		else 
			set_Value (COLUMNNAME_s_department_ID, Integer.valueOf(s_department_ID));
	}

	/** Get Department.
		@return Department	  */
	public int gets_department_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_department_ID);
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

	/** Set s_payrol_interface ID.
		@param s_payrol_interface_ID s_payrol_interface ID	  */
	public void sets_payrol_interface_ID (int s_payrol_interface_ID)
	{
		if (s_payrol_interface_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_payrol_interface_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_payrol_interface_ID, Integer.valueOf(s_payrol_interface_ID));
	}

	/** Get s_payrol_interface ID.
		@return s_payrol_interface ID	  */
	public int gets_payrol_interface_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payrol_interface_ID);
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

	/** Set Station.
		@param s_station_ID Station	  */
	public void sets_station_ID (int s_station_ID)
	{
		if (s_station_ID < 1) 
			set_Value (COLUMNNAME_s_station_ID, null);
		else 
			set_Value (COLUMNNAME_s_station_ID, Integer.valueOf(s_station_ID));
	}

	/** Get Station.
		@return Station	  */
	public int gets_station_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_station_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Time Taken To Load The List.
		@param time_taken Time Taken To Load The List	  */
	public void settime_taken (String time_taken)
	{
		set_Value (COLUMNNAME_time_taken, time_taken);
	}

	/** Get Time Taken To Load The List.
		@return Time Taken To Load The List	  */
	public String gettime_taken () 
	{
		return (String)get_Value(COLUMNNAME_time_taken);
	}

	/** Set Total Contribution.
		@param total_contribution Total Contribution	  */
	public void settotal_contribution (BigDecimal total_contribution)
	{
		set_Value (COLUMNNAME_total_contribution, total_contribution);
	}

	/** Get Total Contribution.
		@return Total Contribution	  */
	public BigDecimal gettotal_contribution () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_total_contribution);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Other Charges.
		@param total_othercharges Total Other Charges	  */
	public void settotal_othercharges (BigDecimal total_othercharges)
	{
		set_Value (COLUMNNAME_total_othercharges, total_othercharges);
	}

	/** Get Total Other Charges.
		@return Total Other Charges	  */
	public BigDecimal gettotal_othercharges () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_total_othercharges);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** TransactionType AD_Reference_ID=1000023 */
	public static final int TRANSACTIONTYPE_AD_Reference_ID=1000023;
	/** LOANS = LOANS */
	public static final String TRANSACTIONTYPE_LOANS = "LOANS";
	/** SHARES = SHARES */
	public static final String TRANSACTIONTYPE_SHARES = "SHARES";
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
}