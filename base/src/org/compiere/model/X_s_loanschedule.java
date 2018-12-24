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

/** Generated Model for s_loanschedule
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loanschedule extends PO implements I_s_loanschedule, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181224L;

    /** Standard Constructor */
    public X_s_loanschedule (Properties ctx, int s_loanschedule_ID, String trxName)
    {
      super (ctx, s_loanschedule_ID, trxName);
      /** if (s_loanschedule_ID == 0)
        {
			sets_loans_ID (0);
			sets_loanschedule_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_loanschedule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loanschedule[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set amountdue.
		@param amountdue amountdue	  */
	public void setamountdue (BigDecimal amountdue)
	{
		set_Value (COLUMNNAME_amountdue, amountdue);
	}

	/** Get amountdue.
		@return amountdue	  */
	public BigDecimal getamountdue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountdue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amountpaid.
		@param amountpaid amountpaid	  */
	public void setamountpaid (BigDecimal amountpaid)
	{
		set_Value (COLUMNNAME_amountpaid, amountpaid);
	}

	/** Get amountpaid.
		@return amountpaid	  */
	public BigDecimal getamountpaid () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountpaid);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set chargeintfirst.
		@param chargeintfirst chargeintfirst	  */
	public void setchargeintfirst (int chargeintfirst)
	{
		set_Value (COLUMNNAME_chargeintfirst, Integer.valueOf(chargeintfirst));
	}

	/** Get chargeintfirst.
		@return chargeintfirst	  */
	public int getchargeintfirst () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_chargeintfirst);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set expinterest.
		@param expinterest expinterest	  */
	public void setexpinterest (BigDecimal expinterest)
	{
		set_Value (COLUMNNAME_expinterest, expinterest);
	}

	/** Get expinterest.
		@return expinterest	  */
	public BigDecimal getexpinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_expinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set expprincipal.
		@param expprincipal expprincipal	  */
	public void setexpprincipal (BigDecimal expprincipal)
	{
		set_Value (COLUMNNAME_expprincipal, expprincipal);
	}

	/** Get expprincipal.
		@return expprincipal	  */
	public BigDecimal getexpprincipal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_expprincipal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest Due.
		@param interest_due Interest Due	  */
	public void setinterest_due (BigDecimal interest_due)
	{
		set_Value (COLUMNNAME_interest_due, interest_due);
	}

	/** Get Interest Due.
		@return Interest Due	  */
	public BigDecimal getinterest_due () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interest_due);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set interestamount.
		@param interestamount interestamount	  */
	public void setinterestamount (BigDecimal interestamount)
	{
		set_Value (COLUMNNAME_interestamount, interestamount);
	}

	/** Get interestamount.
		@return interestamount	  */
	public BigDecimal getinterestamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interestamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set interestrate.
		@param interestrate interestrate	  */
	public void setinterestrate (BigDecimal interestrate)
	{
		set_Value (COLUMNNAME_interestrate, interestrate);
	}

	/** Get interestrate.
		@return interestrate	  */
	public BigDecimal getinterestrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interestrate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set interestrepayment.
		@param interestrepayment interestrepayment	  */
	public void setinterestrepayment (BigDecimal interestrepayment)
	{
		set_Value (COLUMNNAME_interestrepayment, interestrepayment);
	}

	/** Get interestrepayment.
		@return interestrepayment	  */
	public BigDecimal getinterestrepayment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interestrepayment);
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

	/** Set Repay Period.
		@param intperiod Repay Period	  */
	public void setintperiod (BigDecimal intperiod)
	{
		set_Value (COLUMNNAME_intperiod, intperiod);
	}

	/** Get Repay Period.
		@return Repay Period	  */
	public BigDecimal getintperiod () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_intperiod);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Effect Period.
		@param loaneffectdate Effect Period	  */
	public void setloaneffectdate (Timestamp loaneffectdate)
	{
		set_Value (COLUMNNAME_loaneffectdate, loaneffectdate);
	}

	/** Get Effect Period.
		@return Effect Period	  */
	public Timestamp getloaneffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loaneffectdate);
	}

	/** Set loanpaydate.
		@param loanpaydate loanpaydate	  */
	public void setloanpaydate (Timestamp loanpaydate)
	{
		set_Value (COLUMNNAME_loanpaydate, loanpaydate);
	}

	/** Get loanpaydate.
		@return loanpaydate	  */
	public Timestamp getloanpaydate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_loanpaydate);
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

	/** Set monthlyrepayment.
		@param monthlyrepayment monthlyrepayment	  */
	public void setmonthlyrepayment (BigDecimal monthlyrepayment)
	{
		set_Value (COLUMNNAME_monthlyrepayment, monthlyrepayment);
	}

	/** Get monthlyrepayment.
		@return monthlyrepayment	  */
	public BigDecimal getmonthlyrepayment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthlyrepayment);
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

	/** Set monthperiod.
		@param monthperiod monthperiod	  */
	public void setmonthperiod (int monthperiod)
	{
		set_Value (COLUMNNAME_monthperiod, Integer.valueOf(monthperiod));
	}

	/** Get monthperiod.
		@return monthperiod	  */
	public int getmonthperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_monthperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set oldinterest.
		@param oldinterest oldinterest	  */
	public void setoldinterest (BigDecimal oldinterest)
	{
		set_Value (COLUMNNAME_oldinterest, oldinterest);
	}

	/** Get oldinterest.
		@return oldinterest	  */
	public BigDecimal getoldinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_oldinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Openning Loan Balance.
		@param openning_loanbalance Openning Loan Balance	  */
	public void setopenning_loanbalance (BigDecimal openning_loanbalance)
	{
		set_Value (COLUMNNAME_openning_loanbalance, openning_loanbalance);
	}

	/** Get Openning Loan Balance.
		@return Openning Loan Balance	  */
	public BigDecimal getopenning_loanbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_openning_loanbalance);
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

	/** Set principalrepayment.
		@param principalrepayment principalrepayment	  */
	public void setprincipalrepayment (BigDecimal principalrepayment)
	{
		set_Value (COLUMNNAME_principalrepayment, principalrepayment);
	}

	/** Get principalrepayment.
		@return principalrepayment	  */
	public BigDecimal getprincipalrepayment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_principalrepayment);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set recurringadj.
		@param recurringadj recurringadj	  */
	public void setrecurringadj (int recurringadj)
	{
		set_Value (COLUMNNAME_recurringadj, Integer.valueOf(recurringadj));
	}

	/** Get recurringadj.
		@return recurringadj	  */
	public int getrecurringadj () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_recurringadj);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set repayamount.
		@param repayamount repayamount	  */
	public void setrepayamount (BigDecimal repayamount)
	{
		set_Value (COLUMNNAME_repayamount, repayamount);
	}

	/** Get repayamount.
		@return repayamount	  */
	public BigDecimal getrepayamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_repayamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set repayperiod.
		@param repayperiod repayperiod	  */
	public void setrepayperiod (int repayperiod)
	{
		set_Value (COLUMNNAME_repayperiod, Integer.valueOf(repayperiod));
	}

	/** Get repayperiod.
		@return repayperiod	  */
	public int getrepayperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_repayperiod);
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

	/** Set s_loanschedule ID.
		@param s_loanschedule_ID s_loanschedule ID	  */
	public void sets_loanschedule_ID (int s_loanschedule_ID)
	{
		if (s_loanschedule_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loanschedule_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loanschedule_ID, Integer.valueOf(s_loanschedule_ID));
	}

	/** Get s_loanschedule ID.
		@return s_loanschedule ID	  */
	public int gets_loanschedule_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loanschedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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