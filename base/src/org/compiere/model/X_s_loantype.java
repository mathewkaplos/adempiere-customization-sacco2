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
import org.compiere.util.KeyNamePair;

/** Generated Model for s_loantype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loantype extends PO implements I_s_loantype, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190321L;

    /** Standard Constructor */
    public X_s_loantype (Properties ctx, int s_loantype_ID, String trxName)
    {
      super (ctx, s_loantype_ID, trxName);
      /** if (s_loantype_ID == 0)
        {
			setadjustable_interest_rates (false);
// N
			setallow_partial_dispursement (false);
// N
			setallow_zero_value_guarantors (false);
// N
			setcan_be_refinanced (false);
// N
			setchange_interest_if_clearing (false);
// N
			setinterestformula (null);
			setloan_product_type (null);
// 1
			setloantypeinteresttype (null);
			setloantypename (null);
			setloantypepaymentfrequency (null);
			setloantypepaymentmethod (null);
			setmonthlyintcalc (null);
			setoverdue_penalty (false);
// N
			sets_loantype_ID (0);
			setshould_be_guaranteed (false);
// N
        } */
    }

    /** Load Constructor */
    public X_s_loantype (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loantype[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Collateral Acceptable.
		@param acceptable Collateral Acceptable	  */
	public void setacceptable (boolean acceptable)
	{
		set_Value (COLUMNNAME_acceptable, Boolean.valueOf(acceptable));
	}

	/** Get Collateral Acceptable.
		@return Collateral Acceptable	  */
	public boolean isacceptable () 
	{
		Object oo = get_Value(COLUMNNAME_acceptable);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Adjustable Interest Rates.
		@param adjustable_interest_rates Adjustable Interest Rates	  */
	public void setadjustable_interest_rates (boolean adjustable_interest_rates)
	{
		set_Value (COLUMNNAME_adjustable_interest_rates, Boolean.valueOf(adjustable_interest_rates));
	}

	/** Get Adjustable Interest Rates.
		@return Adjustable Interest Rates	  */
	public boolean isadjustable_interest_rates () 
	{
		Object oo = get_Value(COLUMNNAME_adjustable_interest_rates);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Allow Partial Dispursement.
		@param allow_partial_dispursement Allow Partial Dispursement	  */
	public void setallow_partial_dispursement (boolean allow_partial_dispursement)
	{
		set_Value (COLUMNNAME_allow_partial_dispursement, Boolean.valueOf(allow_partial_dispursement));
	}

	/** Get Allow Partial Dispursement.
		@return Allow Partial Dispursement	  */
	public boolean isallow_partial_dispursement () 
	{
		Object oo = get_Value(COLUMNNAME_allow_partial_dispursement);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Allow Zero Value Guarantors.
		@param allow_zero_value_guarantors Allow Zero Value Guarantors	  */
	public void setallow_zero_value_guarantors (boolean allow_zero_value_guarantors)
	{
		set_Value (COLUMNNAME_allow_zero_value_guarantors, Boolean.valueOf(allow_zero_value_guarantors));
	}

	/** Get Allow Zero Value Guarantors.
		@return Allow Zero Value Guarantors	  */
	public boolean isallow_zero_value_guarantors () 
	{
		Object oo = get_Value(COLUMNNAME_allow_zero_value_guarantors);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Annual Int Rate.
		@param annualinterest Annual Int Rate	  */
	public void setannualinterest (BigDecimal annualinterest)
	{
		set_Value (COLUMNNAME_annualinterest, annualinterest);
	}

	/** Get Annual Int Rate.
		@return Annual Int Rate	  */
	public BigDecimal getannualinterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_annualinterest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MIn No Of Approving Officials.
		@param approvingofficers MIn No Of Approving Officials	  */
	public void setapprovingofficers (int approvingofficers)
	{
		set_Value (COLUMNNAME_approvingofficers, Integer.valueOf(approvingofficers));
	}

	/** Get MIn No Of Approving Officials.
		@return MIn No Of Approving Officials	  */
	public int getapprovingofficers () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_approvingofficers);
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

	/** Set Calculate Interest On Original Period.
		@param calculateonperiod Calculate Interest On Original Period	  */
	public void setcalculateonperiod (boolean calculateonperiod)
	{
		set_Value (COLUMNNAME_calculateonperiod, Boolean.valueOf(calculateonperiod));
	}

	/** Get Calculate Interest On Original Period.
		@return Calculate Interest On Original Period	  */
	public boolean iscalculateonperiod () 
	{
		Object oo = get_Value(COLUMNNAME_calculateonperiod);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Refinanced.
		@param can_be_refinanced Can Be Refinanced	  */
	public void setcan_be_refinanced (boolean can_be_refinanced)
	{
		set_Value (COLUMNNAME_can_be_refinanced, Boolean.valueOf(can_be_refinanced));
	}

	/** Get Can Be Refinanced.
		@return Can Be Refinanced	  */
	public boolean iscan_be_refinanced () 
	{
		Object oo = get_Value(COLUMNNAME_can_be_refinanced);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Can Be Topped Up.
		@param can_be_topped_up Can Be Topped Up	  */
	public void setcan_be_topped_up (boolean can_be_topped_up)
	{
		set_Value (COLUMNNAME_can_be_topped_up, Boolean.valueOf(can_be_topped_up));
	}

	/** Get Can Be Topped Up.
		@return Can Be Topped Up	  */
	public boolean iscan_be_topped_up () 
	{
		Object oo = get_Value(COLUMNNAME_can_be_topped_up);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Change Interest If Clearing Loan.
		@param change_interest_if_clearing Change Interest If Clearing Loan	  */
	public void setchange_interest_if_clearing (boolean change_interest_if_clearing)
	{
		set_Value (COLUMNNAME_change_interest_if_clearing, Boolean.valueOf(change_interest_if_clearing));
	}

	/** Get Change Interest If Clearing Loan.
		@return Change Interest If Clearing Loan	  */
	public boolean ischange_interest_if_clearing () 
	{
		Object oo = get_Value(COLUMNNAME_change_interest_if_clearing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Transaction Charges Apply When Transacting.
		@param charges_apply_when_transacting Transaction Charges Apply When Transacting	  */
	public void setcharges_apply_when_transacting (boolean charges_apply_when_transacting)
	{
		set_Value (COLUMNNAME_charges_apply_when_transacting, Boolean.valueOf(charges_apply_when_transacting));
	}

	/** Get Transaction Charges Apply When Transacting.
		@return Transaction Charges Apply When Transacting	  */
	public boolean ischarges_apply_when_transacting () 
	{
		Object oo = get_Value(COLUMNNAME_charges_apply_when_transacting);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Consider Tied Shares.
		@param considertiedshares Consider Tied Shares	  */
	public void setconsidertiedshares (boolean considertiedshares)
	{
		set_Value (COLUMNNAME_considertiedshares, Boolean.valueOf(considertiedshares));
	}

	/** Get Consider Tied Shares.
		@return Consider Tied Shares	  */
	public boolean isconsidertiedshares () 
	{
		Object oo = get_Value(COLUMNNAME_considertiedshares);
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

	/** Set 45 Days Rule?.
		@param fortyfivedaysrule 45 Days Rule?	  */
	public void setfortyfivedaysrule (boolean fortyfivedaysrule)
	{
		set_Value (COLUMNNAME_fortyfivedaysrule, Boolean.valueOf(fortyfivedaysrule));
	}

	/** Get 45 Days Rule?.
		@return 45 Days Rule?	  */
	public boolean isfortyfivedaysrule () 
	{
		Object oo = get_Value(COLUMNNAME_fortyfivedaysrule);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Has Penalty.
		@param haspenalty Has Penalty	  */
	public void sethaspenalty (boolean haspenalty)
	{
		set_Value (COLUMNNAME_haspenalty, Boolean.valueOf(haspenalty));
	}

	/** Get Has Penalty.
		@return Has Penalty	  */
	public boolean ishaspenalty () 
	{
		Object oo = get_Value(COLUMNNAME_haspenalty);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Unpaid Interest As Penalty.
		@param intaspenalty Unpaid Interest As Penalty	  */
	public void setintaspenalty (boolean intaspenalty)
	{
		set_Value (COLUMNNAME_intaspenalty, Boolean.valueOf(intaspenalty));
	}

	/** Get Unpaid Interest As Penalty.
		@return Unpaid Interest As Penalty	  */
	public boolean isintaspenalty () 
	{
		Object oo = get_Value(COLUMNNAME_intaspenalty);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** interestformula AD_Reference_ID=1000007 */
	public static final int INTERESTFORMULA_AD_Reference_ID=1000007;
	/** PRT/100 = 1 */
	public static final String INTERESTFORMULA_PRT100 = "1";
	/** (P(T+1)/R)/200 = 2 */
	public static final String INTERESTFORMULA_PTPlus1R200 = "2";
	/** (P(T+R+2))/200 = 3 */
	public static final String INTERESTFORMULA_PTPlusRPlus2200 = "3";
	/** P(1+t)r/100 = 4 */
	public static final String INTERESTFORMULA_P1PlusTR100 = "4";
	/** Set Interest Calculation Formula.
		@param interestformula Interest Calculation Formula	  */
	public void setinterestformula (String interestformula)
	{

		set_Value (COLUMNNAME_interestformula, interestformula);
	}

	/** Get Interest Calculation Formula.
		@return Interest Calculation Formula	  */
	public String getinterestformula () 
	{
		return (String)get_Value(COLUMNNAME_interestformula);
	}

	/** Set Do Not Exceed Interest Limit.
		@param interestlimit Do Not Exceed Interest Limit	  */
	public void setinterestlimit (boolean interestlimit)
	{
		set_Value (COLUMNNAME_interestlimit, Boolean.valueOf(interestlimit));
	}

	/** Get Do Not Exceed Interest Limit.
		@return Do Not Exceed Interest Limit	  */
	public boolean isinterestlimit () 
	{
		Object oo = get_Value(COLUMNNAME_interestlimit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set interestprc.
		@param interestprc interestprc	  */
	public void setinterestprc (String interestprc)
	{
		set_Value (COLUMNNAME_interestprc, interestprc);
	}

	/** Get interestprc.
		@return interestprc	  */
	public String getinterestprc () 
	{
		return (String)get_Value(COLUMNNAME_interestprc);
	}

	/** Set intreceivableasset.
		@param intreceivableasset intreceivableasset	  */
	public void setintreceivableasset (String intreceivableasset)
	{
		set_Value (COLUMNNAME_intreceivableasset, intreceivableasset);
	}

	/** Get intreceivableasset.
		@return intreceivableasset	  */
	public String getintreceivableasset () 
	{
		return (String)get_Value(COLUMNNAME_intreceivableasset);
	}

	/** Set intreceivableincome.
		@param intreceivableincome intreceivableincome	  */
	public void setintreceivableincome (String intreceivableincome)
	{
		set_Value (COLUMNNAME_intreceivableincome, intreceivableincome);
	}

	/** Get intreceivableincome.
		@return intreceivableincome	  */
	public String getintreceivableincome () 
	{
		return (String)get_Value(COLUMNNAME_intreceivableincome);
	}

	/** Set is13th.
		@param is13th is13th	  */
	public void setis13th (boolean is13th)
	{
		set_Value (COLUMNNAME_is13th, Boolean.valueOf(is13th));
	}

	/** Get is13th.
		@return is13th	  */
	public boolean is13th () 
	{
		Object oo = get_Value(COLUMNNAME_is13th);
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

	/** Set Linked To Saving Type.
		@param linkedgl Linked To Saving Type	  */
	public void setlinkedgl (String linkedgl)
	{
		set_Value (COLUMNNAME_linkedgl, linkedgl);
	}

	/** Get Linked To Saving Type.
		@return Linked To Saving Type	  */
	public String getlinkedgl () 
	{
		return (String)get_Value(COLUMNNAME_linkedgl);
	}

	/** loan_product_type AD_Reference_ID=1000026 */
	public static final int LOAN_PRODUCT_TYPE_AD_Reference_ID=1000026;
	/** Normal Loan = 1 */
	public static final String LOAN_PRODUCT_TYPE_NormalLoan = "1";
	/** Shamba Loan = 2 */
	public static final String LOAN_PRODUCT_TYPE_ShambaLoan = "2";
	/** Set Loan Product Type.
		@param loan_product_type Loan Product Type	  */
	public void setloan_product_type (String loan_product_type)
	{

		set_Value (COLUMNNAME_loan_product_type, loan_product_type);
	}

	/** Get Loan Product Type.
		@return Loan Product Type	  */
	public String getloan_product_type () 
	{
		return (String)get_Value(COLUMNNAME_loan_product_type);
	}

	/** Set loanprc.
		@param loanprc loanprc	  */
	public void setloanprc (String loanprc)
	{
		set_Value (COLUMNNAME_loanprc, loanprc);
	}

	/** Get loanprc.
		@return loanprc	  */
	public String getloanprc () 
	{
		return (String)get_Value(COLUMNNAME_loanprc);
	}

	/** Set Loans Factor.
		@param loansfactor Loans Factor	  */
	public void setloansfactor (BigDecimal loansfactor)
	{
		set_Value (COLUMNNAME_loansfactor, loansfactor);
	}

	/** Get Loans Factor.
		@return Loans Factor	  */
	public BigDecimal getloansfactor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loansfactor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Ref # / Code.
		@param loantypecode Ref # / Code	  */
	public void setloantypecode (String loantypecode)
	{
		set_Value (COLUMNNAME_loantypecode, loantypecode);
	}

	/** Get Ref # / Code.
		@return Ref # / Code	  */
	public String getloantypecode () 
	{
		return (String)get_Value(COLUMNNAME_loantypecode);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getloantypecode());
    }

	/** Set Income Factor.
		@param loantypeincomefactor Income Factor	  */
	public void setloantypeincomefactor (BigDecimal loantypeincomefactor)
	{
		set_Value (COLUMNNAME_loantypeincomefactor, loantypeincomefactor);
	}

	/** Get Income Factor.
		@return Income Factor	  */
	public BigDecimal getloantypeincomefactor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypeincomefactor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getloantypeinterestgl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getloantypeinterestgl_Acct(), get_TrxName());	}

	/** Set Interest(GL Code).
		@param loantypeinterestgl_Acct Interest(GL Code)	  */
	public void setloantypeinterestgl_Acct (int loantypeinterestgl_Acct)
	{
		set_Value (COLUMNNAME_loantypeinterestgl_Acct, Integer.valueOf(loantypeinterestgl_Acct));
	}

	/** Get Interest(GL Code).
		@return Interest(GL Code)	  */
	public int getloantypeinterestgl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeinterestgl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Monthly Int Rate.
		@param loantypeinterestrate Monthly Int Rate	  */
	public void setloantypeinterestrate (BigDecimal loantypeinterestrate)
	{
		set_Value (COLUMNNAME_loantypeinterestrate, loantypeinterestrate);
	}

	/** Get Monthly Int Rate.
		@return Monthly Int Rate	  */
	public BigDecimal getloantypeinterestrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypeinterestrate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set loantypeinterestraterate.
		@param loantypeinterestraterate loantypeinterestraterate	  */
	public void setloantypeinterestraterate (int loantypeinterestraterate)
	{
		set_Value (COLUMNNAME_loantypeinterestraterate, Integer.valueOf(loantypeinterestraterate));
	}

	/** Get loantypeinterestraterate.
		@return loantypeinterestraterate	  */
	public int getloantypeinterestraterate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeinterestraterate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** loantypeinteresttype AD_Reference_ID=1000004 */
	public static final int LOANTYPEINTERESTTYPE_AD_Reference_ID=1000004;
	/** Amortised = A */
	public static final String LOANTYPEINTERESTTYPE_Amortised = "A";
	/** Fixed Balance = F */
	public static final String LOANTYPEINTERESTTYPE_FixedBalance = "F";
	/** Modified Armotised = MA */
	public static final String LOANTYPEINTERESTTYPE_ModifiedArmotised = "MA";
	/** Reducing Balance = R */
	public static final String LOANTYPEINTERESTTYPE_ReducingBalance = "R";
	/** Reducing Balance Constant = RC */
	public static final String LOANTYPEINTERESTTYPE_ReducingBalanceConstant = "RC";
	/** Set Interest Pay Method.
		@param loantypeinteresttype Interest Pay Method	  */
	public void setloantypeinteresttype (String loantypeinteresttype)
	{

		set_Value (COLUMNNAME_loantypeinteresttype, loantypeinteresttype);
	}

	/** Get Interest Pay Method.
		@return Interest Pay Method	  */
	public String getloantypeinteresttype () 
	{
		return (String)get_Value(COLUMNNAME_loantypeinteresttype);
	}

	public I_C_ValidCombination getloantypeloangl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getloantypeloangl_Acct(), get_TrxName());	}

	/** Set Loan(GL Code).
		@param loantypeloangl_Acct Loan(GL Code)	  */
	public void setloantypeloangl_Acct (int loantypeloangl_Acct)
	{
		set_Value (COLUMNNAME_loantypeloangl_Acct, Integer.valueOf(loantypeloangl_Acct));
	}

	/** Get Loan(GL Code).
		@return Loan(GL Code)	  */
	public int getloantypeloangl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeloangl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Max Loan Amount.
		@param loantypemaxamount Max Loan Amount	  */
	public void setloantypemaxamount (BigDecimal loantypemaxamount)
	{
		set_Value (COLUMNNAME_loantypemaxamount, loantypemaxamount);
	}

	/** Get Max Loan Amount.
		@return Max Loan Amount	  */
	public BigDecimal getloantypemaxamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypemaxamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set loantypemaxguarantorloans.
		@param loantypemaxguarantorloans loantypemaxguarantorloans	  */
	public void setloantypemaxguarantorloans (int loantypemaxguarantorloans)
	{
		set_Value (COLUMNNAME_loantypemaxguarantorloans, Integer.valueOf(loantypemaxguarantorloans));
	}

	/** Get loantypemaxguarantorloans.
		@return loantypemaxguarantorloans	  */
	public int getloantypemaxguarantorloans () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypemaxguarantorloans);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Max Guarantors:.
		@param loantypemaxguarantors Max Guarantors:	  */
	public void setloantypemaxguarantors (int loantypemaxguarantors)
	{
		set_Value (COLUMNNAME_loantypemaxguarantors, Integer.valueOf(loantypemaxguarantors));
	}

	/** Get Max Guarantors:.
		@return Max Guarantors:	  */
	public int getloantypemaxguarantors () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypemaxguarantors);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Maximum Loan Period.
		@param loantypemaxperiod Maximum Loan Period	  */
	public void setloantypemaxperiod (int loantypemaxperiod)
	{
		set_Value (COLUMNNAME_loantypemaxperiod, Integer.valueOf(loantypemaxperiod));
	}

	/** Get Maximum Loan Period.
		@return Maximum Loan Period	  */
	public int getloantypemaxperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypemaxperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set loantypeminage.
		@param loantypeminage loantypeminage	  */
	public void setloantypeminage (int loantypeminage)
	{
		set_Value (COLUMNNAME_loantypeminage, Integer.valueOf(loantypeminage));
	}

	/** Get loantypeminage.
		@return loantypeminage	  */
	public int getloantypeminage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeminage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Loan Amt:.
		@param loantypeminamount Min Loan Amt:	  */
	public void setloantypeminamount (BigDecimal loantypeminamount)
	{
		set_Value (COLUMNNAME_loantypeminamount, loantypeminamount);
	}

	/** Get Min Loan Amt:.
		@return Min Loan Amt:	  */
	public BigDecimal getloantypeminamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypeminamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set loantypemincontribution.
		@param loantypemincontribution loantypemincontribution	  */
	public void setloantypemincontribution (int loantypemincontribution)
	{
		set_Value (COLUMNNAME_loantypemincontribution, Integer.valueOf(loantypemincontribution));
	}

	/** Get loantypemincontribution.
		@return loantypemincontribution	  */
	public int getloantypemincontribution () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypemincontribution);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Guarantors:.
		@param loantypeminguarantors Min Guarantors:	  */
	public void setloantypeminguarantors (int loantypeminguarantors)
	{
		set_Value (COLUMNNAME_loantypeminguarantors, Integer.valueOf(loantypeminguarantors));
	}

	/** Get Min Guarantors:.
		@return Min Guarantors:	  */
	public int getloantypeminguarantors () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeminguarantors);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minimum Mbrship Period(Months).
		@param loantypeminmembership Minimum Mbrship Period(Months)	  */
	public void setloantypeminmembership (int loantypeminmembership)
	{
		set_Value (COLUMNNAME_loantypeminmembership, Integer.valueOf(loantypeminmembership));
	}

	/** Get Minimum Mbrship Period(Months).
		@return Minimum Mbrship Period(Months)	  */
	public int getloantypeminmembership () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypeminmembership);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Minimum Shares.
		@param loantypeminshares Minimum Shares	  */
	public void setloantypeminshares (BigDecimal loantypeminshares)
	{
		set_Value (COLUMNNAME_loantypeminshares, loantypeminshares);
	}

	/** Get Minimum Shares.
		@return Minimum Shares	  */
	public BigDecimal getloantypeminshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypeminshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Description.
		@param loantypename Description	  */
	public void setloantypename (String loantypename)
	{
		set_Value (COLUMNNAME_loantypename, loantypename);
	}

	/** Get Description.
		@return Description	  */
	public String getloantypename () 
	{
		return (String)get_Value(COLUMNNAME_loantypename);
	}

	/** loantypepaymentfrequency AD_Reference_ID=1000005 */
	public static final int LOANTYPEPAYMENTFREQUENCY_AD_Reference_ID=1000005;
	/** Daily = D */
	public static final String LOANTYPEPAYMENTFREQUENCY_Daily = "D";
	/** Monthly = M */
	public static final String LOANTYPEPAYMENTFREQUENCY_Monthly = "M";
	/** Weekly = W */
	public static final String LOANTYPEPAYMENTFREQUENCY_Weekly = "W";
	/** Yearly = Y */
	public static final String LOANTYPEPAYMENTFREQUENCY_Yearly = "Y";
	/** Set Repayment Frequency.
		@param loantypepaymentfrequency Repayment Frequency	  */
	public void setloantypepaymentfrequency (String loantypepaymentfrequency)
	{

		set_Value (COLUMNNAME_loantypepaymentfrequency, loantypepaymentfrequency);
	}

	/** Get Repayment Frequency.
		@return Repayment Frequency	  */
	public String getloantypepaymentfrequency () 
	{
		return (String)get_Value(COLUMNNAME_loantypepaymentfrequency);
	}

	/** loantypepaymentmethod AD_Reference_ID=1000006 */
	public static final int LOANTYPEPAYMENTMETHOD_AD_Reference_ID=1000006;
	/** Cash = Cash */
	public static final String LOANTYPEPAYMENTMETHOD_Cash = "Cash";
	/** Cheque = Cheque */
	public static final String LOANTYPEPAYMENTMETHOD_Cheque = "Cheque";
	/** Set Repayment Method.
		@param loantypepaymentmethod Repayment Method	  */
	public void setloantypepaymentmethod (String loantypepaymentmethod)
	{

		set_Value (COLUMNNAME_loantypepaymentmethod, loantypepaymentmethod);
	}

	/** Get Repayment Method.
		@return Repayment Method	  */
	public String getloantypepaymentmethod () 
	{
		return (String)get_Value(COLUMNNAME_loantypepaymentmethod);
	}

	/** Set Penalty Amt.
		@param loantypepenalty Penalty Amt	  */
	public void setloantypepenalty (BigDecimal loantypepenalty)
	{
		set_Value (COLUMNNAME_loantypepenalty, loantypepenalty);
	}

	/** Get Penalty Amt.
		@return Penalty Amt	  */
	public BigDecimal getloantypepenalty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypepenalty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getloantypepenaltygl_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getloantypepenaltygl_Acct(), get_TrxName());	}

	/** Set Penalty GL Code.
		@param loantypepenaltygl_Acct Penalty GL Code	  */
	public void setloantypepenaltygl_Acct (int loantypepenaltygl_Acct)
	{
		set_Value (COLUMNNAME_loantypepenaltygl_Acct, Integer.valueOf(loantypepenaltygl_Acct));
	}

	/** Get Penalty GL Code.
		@return Penalty GL Code	  */
	public int getloantypepenaltygl_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypepenaltygl_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set loantypepenaltyrate.
		@param loantypepenaltyrate loantypepenaltyrate	  */
	public void setloantypepenaltyrate (int loantypepenaltyrate)
	{
		set_Value (COLUMNNAME_loantypepenaltyrate, Integer.valueOf(loantypepenaltyrate));
	}

	/** Get loantypepenaltyrate.
		@return loantypepenaltyrate	  */
	public int getloantypepenaltyrate () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_loantypepenaltyrate);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remarks.
		@param loantyperemarks Remarks	  */
	public void setloantyperemarks (String loantyperemarks)
	{
		set_Value (COLUMNNAME_loantyperemarks, loantyperemarks);
	}

	/** Get Remarks.
		@return Remarks	  */
	public String getloantyperemarks () 
	{
		return (String)get_Value(COLUMNNAME_loantyperemarks);
	}

	/** Set Savings Factor.
		@param loantypesharesfactor Savings Factor	  */
	public void setloantypesharesfactor (BigDecimal loantypesharesfactor)
	{
		set_Value (COLUMNNAME_loantypesharesfactor, loantypesharesfactor);
	}

	/** Get Savings Factor.
		@return Savings Factor	  */
	public BigDecimal getloantypesharesfactor () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_loantypesharesfactor);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Maximum Grace Period(Months).
		@param max_grace_period Maximum Grace Period(Months)	  */
	public void setmax_grace_period (int max_grace_period)
	{
		set_Value (COLUMNNAME_max_grace_period, Integer.valueOf(max_grace_period));
	}

	/** Get Maximum Grace Period(Months).
		@return Maximum Grace Period(Months)	  */
	public int getmax_grace_period () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_max_grace_period);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min No. Of Conts(Months).
		@param minimumcontributions Min No. Of Conts(Months)	  */
	public void setminimumcontributions (int minimumcontributions)
	{
		set_Value (COLUMNNAME_minimumcontributions, Integer.valueOf(minimumcontributions));
	}

	/** Get Min No. Of Conts(Months).
		@return Min No. Of Conts(Months)	  */
	public int getminimumcontributions () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_minimumcontributions);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** monthlyintcalc AD_Reference_ID=1000008 */
	public static final int MONTHLYINTCALC_AD_Reference_ID=1000008;
	/** Daily = 0 */
	public static final String MONTHLYINTCALC_Daily = "0";
	/** Monthly = 1 */
	public static final String MONTHLYINTCALC_Monthly = "1";
	/** Set Interest Mode.
		@param monthlyintcalc Interest Mode	  */
	public void setmonthlyintcalc (String monthlyintcalc)
	{

		set_Value (COLUMNNAME_monthlyintcalc, monthlyintcalc);
	}

	/** Get Interest Mode.
		@return Interest Mode	  */
	public String getmonthlyintcalc () 
	{
		return (String)get_Value(COLUMNNAME_monthlyintcalc);
	}

	/** Set Overdue Penalty.
		@param overdue_penalty Overdue Penalty	  */
	public void setoverdue_penalty (boolean overdue_penalty)
	{
		set_Value (COLUMNNAME_overdue_penalty, Boolean.valueOf(overdue_penalty));
	}

	/** Get Overdue Penalty.
		@return Overdue Penalty	  */
	public boolean isoverdue_penalty () 
	{
		Object oo = get_Value(COLUMNNAME_overdue_penalty);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set penaltyprc.
		@param penaltyprc penaltyprc	  */
	public void setpenaltyprc (String penaltyprc)
	{
		set_Value (COLUMNNAME_penaltyprc, penaltyprc);
	}

	/** Get penaltyprc.
		@return penaltyprc	  */
	public String getpenaltyprc () 
	{
		return (String)get_Value(COLUMNNAME_penaltyprc);
	}

	/** Set % Of Loan Bal.
		@param perofloanbal % Of Loan Bal	  */
	public void setperofloanbal (boolean perofloanbal)
	{
		set_Value (COLUMNNAME_perofloanbal, Boolean.valueOf(perofloanbal));
	}

	/** Get % Of Loan Bal.
		@return % Of Loan Bal	  */
	public boolean isperofloanbal () 
	{
		Object oo = get_Value(COLUMNNAME_perofloanbal);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Prefix.
		@param Prefix 
		Prefix before the sequence number
	  */
	public void setPrefix (String Prefix)
	{
		set_Value (COLUMNNAME_Prefix, Prefix);
	}

	/** Get Prefix.
		@return Prefix before the sequence number
	  */
	public String getPrefix () 
	{
		return (String)get_Value(COLUMNNAME_Prefix);
	}

	/** Set Priority.
		@param Priority 
		Indicates if this request is of a high, medium or low priority.
	  */
	public void setPriority (int Priority)
	{
		set_Value (COLUMNNAME_Priority, Integer.valueOf(Priority));
	}

	/** Get Priority.
		@return Indicates if this request is of a high, medium or low priority.
	  */
	public int getPriority () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Priority);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Rate Based.
		@param ratebased Rate Based	  */
	public void setratebased (boolean ratebased)
	{
		set_Value (COLUMNNAME_ratebased, Boolean.valueOf(ratebased));
	}

	/** Get Rate Based.
		@return Rate Based	  */
	public boolean isratebased () 
	{
		Object oo = get_Value(COLUMNNAME_ratebased);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Recover In Current Year.
		@param recoveryyear Recover In Current Year	  */
	public void setrecoveryyear (boolean recoveryyear)
	{
		set_Value (COLUMNNAME_recoveryyear, Boolean.valueOf(recoveryyear));
	}

	/** Get Recover In Current Year.
		@return Recover In Current Year	  */
	public boolean isrecoveryyear () 
	{
		Object oo = get_Value(COLUMNNAME_recoveryyear);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

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

	/** Set Self Guarantee Limit.
		@param selfglimit Self Guarantee Limit	  */
	public void setselfglimit (int selfglimit)
	{
		set_Value (COLUMNNAME_selfglimit, Integer.valueOf(selfglimit));
	}

	/** Get Self Guarantee Limit.
		@return Self Guarantee Limit	  */
	public int getselfglimit () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_selfglimit);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Share/Loan Rule.
		@param shareloanrule Share/Loan Rule	  */
	public void setshareloanrule (int shareloanrule)
	{
		set_Value (COLUMNNAME_shareloanrule, Integer.valueOf(shareloanrule));
	}

	/** Get Share/Loan Rule.
		@return Share/Loan Rule	  */
	public int getshareloanrule () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_shareloanrule);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Should Be Guaranteed.
		@param should_be_guaranteed Should Be Guaranteed	  */
	public void setshould_be_guaranteed (boolean should_be_guaranteed)
	{
		set_Value (COLUMNNAME_should_be_guaranteed, Boolean.valueOf(should_be_guaranteed));
	}

	/** Get Should Be Guaranteed.
		@return Should Be Guaranteed	  */
	public boolean isshould_be_guaranteed () 
	{
		Object oo = get_Value(COLUMNNAME_should_be_guaranteed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set showonstatement.
		@param showonstatement showonstatement	  */
	public void setshowonstatement (boolean showonstatement)
	{
		set_Value (COLUMNNAME_showonstatement, Boolean.valueOf(showonstatement));
	}

	/** Get showonstatement.
		@return showonstatement	  */
	public boolean isshowonstatement () 
	{
		Object oo = get_Value(COLUMNNAME_showonstatement);
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