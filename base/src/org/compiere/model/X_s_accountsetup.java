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

/** Generated Model for s_accountsetup
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_accountsetup extends PO implements I_s_accountsetup, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190505L;

    /** Standard Constructor */
    public X_s_accountsetup (Properties ctx, int s_accountsetup_ID, String trxName)
    {
      super (ctx, s_accountsetup_ID, trxName);
      /** if (s_accountsetup_ID == 0)
        {
			setaccountscode (null);
			setblocked (false);
// N
			setDescription (null);
			setglcode_Acct (0);
			sets_accountsetup_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_accountsetup (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_accountsetup[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Ref # / Code.
		@param accountscode Ref # / Code	  */
	public void setaccountscode (String accountscode)
	{
		set_Value (COLUMNNAME_accountscode, accountscode);
	}

	/** Get Ref # / Code.
		@return Ref # / Code	  */
	public String getaccountscode () 
	{
		return (String)get_Value(COLUMNNAME_accountscode);
	}

	/** Set Additional Amount Value.
		@param additionalamt Additional Amount Value	  */
	public void setadditionalamt (BigDecimal additionalamt)
	{
		set_Value (COLUMNNAME_additionalamt, additionalamt);
	}

	/** Get Additional Amount Value.
		@return Additional Amount Value	  */
	public BigDecimal getadditionalamt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_additionalamt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAmount()));
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

	/** Set Post Service Charges.
		@param btn_post_charges Post Service Charges	  */
	public void setbtn_post_charges (String btn_post_charges)
	{
		set_Value (COLUMNNAME_btn_post_charges, btn_post_charges);
	}

	/** Get Post Service Charges.
		@return Post Service Charges	  */
	public String getbtn_post_charges () 
	{
		return (String)get_Value(COLUMNNAME_btn_post_charges);
	}

	/** Set Print Charge List.
		@param btn_print_chargelist Print Charge List	  */
	public void setbtn_print_chargelist (String btn_print_chargelist)
	{
		set_Value (COLUMNNAME_btn_print_chargelist, btn_print_chargelist);
	}

	/** Get Print Charge List.
		@return Print Charge List	  */
	public String getbtn_print_chargelist () 
	{
		return (String)get_Value(COLUMNNAME_btn_print_chargelist);
	}

	/** Set Charge Formula.
		@param chargeformula 
		"P"=LoanAmount, "I"=SumInterest, "T" =LoanRepaymentPeriod, "L"=OldLoanBalance. For Example 0.049/100*[P]*[T]
	  */
	public void setchargeformula (String chargeformula)
	{
		set_Value (COLUMNNAME_chargeformula, chargeformula);
	}

	/** Get Charge Formula.
		@return "P"=LoanAmount, "I"=SumInterest, "T" =LoanRepaymentPeriod, "L"=OldLoanBalance. For Example 0.049/100*[P]*[T]
	  */
	public String getchargeformula () 
	{
		return (String)get_Value(COLUMNNAME_chargeformula);
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

	/** Set glcode.
		@param glcode glcode	  */
	public void setglcode (String glcode)
	{
		set_Value (COLUMNNAME_glcode, glcode);
	}

	/** Get glcode.
		@return glcode	  */
	public String getglcode () 
	{
		return (String)get_Value(COLUMNNAME_glcode);
	}

	public I_C_ValidCombination getglcode_A() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getglcode_Acct(), get_TrxName());	}

	/** Set GL Account.
		@param glcode_Acct GL Account	  */
	public void setglcode_Acct (int glcode_Acct)
	{
		set_Value (COLUMNNAME_glcode_Acct, Integer.valueOf(glcode_Acct));
	}

	/** Get GL Account.
		@return GL Account	  */
	public int getglcode_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_glcode_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Has Additiona Calculation.
		@param hasadditionalcalculation Has Additiona Calculation	  */
	public void sethasadditionalcalculation (boolean hasadditionalcalculation)
	{
		set_Value (COLUMNNAME_hasadditionalcalculation, Boolean.valueOf(hasadditionalcalculation));
	}

	/** Get Has Additiona Calculation.
		@return Has Additiona Calculation	  */
	public boolean ishasadditionalcalculation () 
	{
		Object oo = get_Value(COLUMNNAME_hasadditionalcalculation);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Percentage.
		@param ispercentage Is Percentage	  */
	public void setispercentage (boolean ispercentage)
	{
		set_Value (COLUMNNAME_ispercentage, Boolean.valueOf(ispercentage));
	}

	/** Get Is Percentage.
		@return Is Percentage	  */
	public boolean ispercentage () 
	{
		Object oo = get_Value(COLUMNNAME_ispercentage);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Operator.
		@param operator Operator	  */
	public void setoperator (String operator)
	{
		set_Value (COLUMNNAME_operator, operator);
	}

	/** Get Operator.
		@return Operator	  */
	public String getoperator () 
	{
		return (String)get_Value(COLUMNNAME_operator);
	}

	/** Set Overdue Penalty Fomula.
		@param overdue_penalty_formula Overdue Penalty Fomula	  */
	public void setoverdue_penalty_formula (String overdue_penalty_formula)
	{
		set_Value (COLUMNNAME_overdue_penalty_formula, overdue_penalty_formula);
	}

	/** Get Overdue Penalty Fomula.
		@return Overdue Penalty Fomula	  */
	public String getoverdue_penalty_formula () 
	{
		return (String)get_Value(COLUMNNAME_overdue_penalty_formula);
	}

	/** Set Other Charge.
		@param s_accountsetup_ID Other Charge	  */
	public void sets_accountsetup_ID (int s_accountsetup_ID)
	{
		if (s_accountsetup_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_accountsetup_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_accountsetup_ID, Integer.valueOf(s_accountsetup_ID));
	}

	/** Get Other Charge.
		@return Other Charge	  */
	public int gets_accountsetup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_accountsetup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_ID(), get_TrxName());	}

	/** Set Share Type To Post Service Charge.
		@param s_sharetype_ID 
		Share Type To Post Service Charge
	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
	}

	/** Get Share Type To Post Service Charge.
		@return Share Type To Post Service Charge
	  */
	public int gets_sharetype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Use Formula.
		@param useformula Use Formula	  */
	public void setuseformula (boolean useformula)
	{
		set_Value (COLUMNNAME_useformula, Boolean.valueOf(useformula));
	}

	/** Get Use Formula.
		@return Use Formula	  */
	public boolean isuseformula () 
	{
		Object oo = get_Value(COLUMNNAME_useformula);
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