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

/** Generated Model for s_sharetype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_sharetype extends PO implements I_s_sharetype, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190117L;

    /** Standard Constructor */
    public X_s_sharetype (Properties ctx, int s_sharetype_ID, String trxName)
    {
      super (ctx, s_sharetype_ID, trxName);
      /** if (s_sharetype_ID == 0)
        {
			sets_sharetype_ID (0);
			setsharecode (null);
			setsharename (null);
        } */
    }

    /** Load Constructor */
    public X_s_sharetype (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_sharetype[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Annual Interest Rate.
		@param annualinterestrate Annual Interest Rate	  */
	public void setannualinterestrate (int annualinterestrate)
	{
		set_Value (COLUMNNAME_annualinterestrate, Integer.valueOf(annualinterestrate));
	}

	/** Get Annual Interest Rate.
		@return Annual Interest Rate	  */
	public int getannualinterestrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_annualinterestrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Blocked.
		@param blocked Blocked	  */
	public void setblocked (boolean blocked)
	{
		set_Value (COLUMNNAME_blocked, Boolean.valueOf(blocked));
	}

	/** Get Blocked.
		@return Blocked	  */
	public boolean isblocked () 
	{
		Object oo = get_Value(COLUMNNAME_blocked);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Withdrawn.
		@param canbewithdrawn Can Be Withdrawn	  */
	public void setcanbewithdrawn (boolean canbewithdrawn)
	{
		set_Value (COLUMNNAME_canbewithdrawn, Boolean.valueOf(canbewithdrawn));
	}

	/** Get Can Be Withdrawn.
		@return Can Be Withdrawn	  */
	public boolean iscanbewithdrawn () 
	{
		Object oo = get_Value(COLUMNNAME_canbewithdrawn);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Earn Annual Interest.
		@param canearnannaulinterest Can Earn Annual Interest	  */
	public void setcanearnannaulinterest (boolean canearnannaulinterest)
	{
		set_Value (COLUMNNAME_canearnannaulinterest, Boolean.valueOf(canearnannaulinterest));
	}

	/** Get Can Earn Annual Interest.
		@return Can Earn Annual Interest	  */
	public boolean iscanearnannaulinterest () 
	{
		Object oo = get_Value(COLUMNNAME_canearnannaulinterest);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Earn Dividends.
		@param canearndividends Can Earn Dividends	  */
	public void setcanearndividends (boolean canearndividends)
	{
		set_Value (COLUMNNAME_canearndividends, Boolean.valueOf(canearndividends));
	}

	/** Get Can Earn Dividends.
		@return Can Earn Dividends	  */
	public boolean iscanearndividends () 
	{
		Object oo = get_Value(COLUMNNAME_canearndividends);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Guarantee Loan.
		@param canguaranteeloan Can Guarantee Loan	  */
	public void setcanguaranteeloan (boolean canguaranteeloan)
	{
		set_Value (COLUMNNAME_canguaranteeloan, Boolean.valueOf(canguaranteeloan));
	}

	/** Get Can Guarantee Loan.
		@return Can Guarantee Loan	  */
	public boolean iscanguaranteeloan () 
	{
		Object oo = get_Value(COLUMNNAME_canguaranteeloan);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set chargecode.
		@param chargecode chargecode	  */
	public void setchargecode (String chargecode)
	{
		set_Value (COLUMNNAME_chargecode, chargecode);
	}

	/** Get chargecode.
		@return chargecode	  */
	public String getchargecode () 
	{
		return (String)get_Value(COLUMNNAME_chargecode);
	}

	/** Set Cheque Days.
		@param chequedays Cheque Days	  */
	public void setchequedays (int chequedays)
	{
		set_Value (COLUMNNAME_chequedays, Integer.valueOf(chequedays));
	}

	/** Get Cheque Days.
		@return Cheque Days	  */
	public int getchequedays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_chequedays);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_C_ValidCombination getdividendgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdividendgl_Acct(), get_TrxName());	}

	/** Set Dividen GL Code.
		@param dividendgl_Acct Dividen GL Code	  */
	public void setdividendgl_Acct (int dividendgl_Acct)
	{
		set_Value (COLUMNNAME_dividendgl_Acct, Integer.valueOf(dividendgl_Acct));
	}

	/** Get Dividen GL Code.
		@return Dividen GL Code	  */
	public int getdividendgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_dividendgl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Has Maximum Shares.
		@param hasmaxshares Has Maximum Shares	  */
	public void sethasmaxshares (boolean hasmaxshares)
	{
		set_Value (COLUMNNAME_hasmaxshares, Boolean.valueOf(hasmaxshares));
	}

	/** Get Has Maximum Shares.
		@return Has Maximum Shares	  */
	public boolean ishasmaxshares () 
	{
		Object oo = get_Value(COLUMNNAME_hasmaxshares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Has Minimum Shares.
		@param hasminshares Has Minimum Shares	  */
	public void sethasminshares (boolean hasminshares)
	{
		set_Value (COLUMNNAME_hasminshares, Boolean.valueOf(hasminshares));
	}

	/** Get Has Minimum Shares.
		@return Has Minimum Shares	  */
	public boolean ishasminshares () 
	{
		Object oo = get_Value(COLUMNNAME_hasminshares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Interest Frequency(M).
		@param intfrequency Interest Frequency(M)	  */
	public void setintfrequency (int intfrequency)
	{
		set_Value (COLUMNNAME_intfrequency, Integer.valueOf(intfrequency));
	}

	/** Get Interest Frequency(M).
		@return Interest Frequency(M)	  */
	public int getintfrequency () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_intfrequency);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Interest Rate(PM).
		@param intrate Interest Rate(PM)	  */
	public void setintrate (int intrate)
	{
		set_Value (COLUMNNAME_intrate, Integer.valueOf(intrate));
	}

	/** Get Interest Rate(PM).
		@return Interest Rate(PM)	  */
	public int getintrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_intrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Is Benevolent.
		@param isbenevolent Is Benevolent	  */
	public void setisbenevolent (boolean isbenevolent)
	{
		set_Value (COLUMNNAME_isbenevolent, Boolean.valueOf(isbenevolent));
	}

	/** Get Is Benevolent.
		@return Is Benevolent	  */
	public boolean isbenevolent () 
	{
		Object oo = get_Value(COLUMNNAME_isbenevolent);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Default Account.
		@param isdefaultaccount Is Default Account	  */
	public void setisdefaultaccount (boolean isdefaultaccount)
	{
		set_Value (COLUMNNAME_isdefaultaccount, Boolean.valueOf(isdefaultaccount));
	}

	/** Get Is Default Account.
		@return Is Default Account	  */
	public boolean isdefaultaccount () 
	{
		Object oo = get_Value(COLUMNNAME_isdefaultaccount);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Fixed Deposit.
		@param isfixeddeposit Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit)
	{
		set_Value (COLUMNNAME_isfixeddeposit, Boolean.valueOf(isfixeddeposit));
	}

	/** Get Is Fixed Deposit.
		@return Is Fixed Deposit	  */
	public boolean isfixeddeposit () 
	{
		Object oo = get_Value(COLUMNNAME_isfixeddeposit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is FOSA.
		@param isfosa Is FOSA	  */
	public void setisfosa (boolean isfosa)
	{
		set_Value (COLUMNNAME_isfosa, Boolean.valueOf(isfosa));
	}

	/** Get Is FOSA.
		@return Is FOSA	  */
	public boolean isfosa () 
	{
		Object oo = get_Value(COLUMNNAME_isfosa);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Minimum Balance.
		@param minbalance Minimum Balance	  */
	public void setminbalance (BigDecimal minbalance)
	{
		set_Value (COLUMNNAME_minbalance, minbalance);
	}

	/** Get Minimum Balance.
		@return Minimum Balance	  */
	public BigDecimal getminbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Min Contribution.
		@param mincount Min Contribution	  */
	public void setmincount (BigDecimal mincount)
	{
		set_Value (COLUMNNAME_mincount, mincount);
	}

	/** Get Min Contribution.
		@return Min Contribution	  */
	public BigDecimal getmincount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_mincount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Minimum Shares.
		@param minshares Minimum Shares	  */
	public void setminshares (BigDecimal minshares)
	{
		set_Value (COLUMNNAME_minshares, minshares);
	}

	/** Get Minimum Shares.
		@return Minimum Shares	  */
	public BigDecimal getminshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Notice Days.
		@param noticedays Notice Days	  */
	public void setnoticedays (int noticedays)
	{
		set_Value (COLUMNNAME_noticedays, Integer.valueOf(noticedays));
	}

	/** Get Notice Days.
		@return Notice Days	  */
	public int getnoticedays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_noticedays);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set payrollcodeid.
		@param payrollcodeid payrollcodeid	  */
	public void setpayrollcodeid (int payrollcodeid)
	{
		set_Value (COLUMNNAME_payrollcodeid, Integer.valueOf(payrollcodeid));
	}

	/** Get payrollcodeid.
		@return payrollcodeid	  */
	public int getpayrollcodeid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_payrollcodeid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set priority_.
		@param priority_ priority_	  */
	public void setpriority_ (int priority_)
	{
		set_Value (COLUMNNAME_priority_, Integer.valueOf(priority_));
	}

	/** Get priority_.
		@return priority_	  */
	public int getpriority_ () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_priority_);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Require Refund/Withdrawal Notice.
		@param reqnotice Require Refund/Withdrawal Notice	  */
	public void setreqnotice (boolean reqnotice)
	{
		set_Value (COLUMNNAME_reqnotice, Boolean.valueOf(reqnotice));
	}

	/** Get Require Refund/Withdrawal Notice.
		@return Require Refund/Withdrawal Notice	  */
	public boolean isreqnotice () 
	{
		Object oo = get_Value(COLUMNNAME_reqnotice);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
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

	/** Set Share Capital.
		@param sharecapital Share Capital	  */
	public void setsharecapital (BigDecimal sharecapital)
	{
		set_Value (COLUMNNAME_sharecapital, sharecapital);
	}

	/** Get Share Capital.
		@return Share Capital	  */
	public BigDecimal getsharecapital () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharecapital);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Share Code / Ref #.
		@param sharecode Share Code / Ref #	  */
	public void setsharecode (String sharecode)
	{
		set_Value (COLUMNNAME_sharecode, sharecode);
	}

	/** Get Share Code / Ref #.
		@return Share Code / Ref #	  */
	public String getsharecode () 
	{
		return (String)get_Value(COLUMNNAME_sharecode);
	}

	/** Set Dividen Rate.
		@param sharedividendrate Dividen Rate	  */
	public void setsharedividendrate (int sharedividendrate)
	{
		set_Value (COLUMNNAME_sharedividendrate, Integer.valueOf(sharedividendrate));
	}

	/** Get Dividen Rate.
		@return Dividen Rate	  */
	public int getsharedividendrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharedividendrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Maximum Capital.
		@param sharemaxbalance Maximum Capital	  */
	public void setsharemaxbalance (BigDecimal sharemaxbalance)
	{
		set_Value (COLUMNNAME_sharemaxbalance, sharemaxbalance);
	}

	/** Get Maximum Capital.
		@return Maximum Capital	  */
	public BigDecimal getsharemaxbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharemaxbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Share Type Description.
		@param sharename Share Type Description	  */
	public void setsharename (String sharename)
	{
		set_Value (COLUMNNAME_sharename, sharename);
	}

	/** Get Share Type Description.
		@return Share Type Description	  */
	public String getsharename () 
	{
		return (String)get_Value(COLUMNNAME_sharename);
	}

	/** Set Withholding Tax %.
		@param sharewithholdingtax Withholding Tax %	  */
	public void setsharewithholdingtax (int sharewithholdingtax)
	{
		set_Value (COLUMNNAME_sharewithholdingtax, Integer.valueOf(sharewithholdingtax));
	}

	/** Get Withholding Tax %.
		@return Withholding Tax %	  */
	public int getsharewithholdingtax () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sharewithholdingtax);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getsmschargecode_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getsmschargecode_Acct(), get_TrxName());	}

	/** Set SMS Charge GL Code.
		@param smschargecode_Acct SMS Charge GL Code	  */
	public void setsmschargecode_Acct (int smschargecode_Acct)
	{
		set_Value (COLUMNNAME_smschargecode_Acct, Integer.valueOf(smschargecode_Acct));
	}

	/** Get SMS Charge GL Code.
		@return SMS Charge GL Code	  */
	public int getsmschargecode_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_smschargecode_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination gettaxcode_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(gettaxcode_Acct(), get_TrxName());	}

	/** Set Tax GL Account.
		@param taxcode_Acct Tax GL Account	  */
	public void settaxcode_Acct (int taxcode_Acct)
	{
		set_Value (COLUMNNAME_taxcode_Acct, Integer.valueOf(taxcode_Acct));
	}

	/** Get Tax GL Account.
		@return Tax GL Account	  */
	public int gettaxcode_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_taxcode_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Use For SMS.
		@param useforsms Use For SMS	  */
	public void setuseforsms (boolean useforsms)
	{
		set_Value (COLUMNNAME_useforsms, Boolean.valueOf(useforsms));
	}

	/** Get Use For SMS.
		@return Use For SMS	  */
	public boolean isuseforsms () 
	{
		Object oo = get_Value(COLUMNNAME_useforsms);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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