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

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for s_other_loan_charges
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_other_loan_charges extends PO implements I_s_other_loan_charges, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190511L;

    /** Standard Constructor */
    public X_s_other_loan_charges (Properties ctx, int s_other_loan_charges_ID, String trxName)
    {
      super (ctx, s_other_loan_charges_ID, trxName);
      /** if (s_other_loan_charges_ID == 0)
        {
			sets_accountsetup_ID (0);
			sets_other_loan_charges_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_other_loan_charges (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_other_loan_charges[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Apply In Repayment.
		@param apply_in_repayment Apply In Repayment	  */
	public void setapply_in_repayment (boolean apply_in_repayment)
	{
		set_Value (COLUMNNAME_apply_in_repayment, Boolean.valueOf(apply_in_repayment));
	}

	/** Get Apply In Repayment.
		@return Apply In Repayment	  */
	public boolean isapply_in_repayment () 
	{
		Object oo = get_Value(COLUMNNAME_apply_in_repayment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Apply In Top -Up.
		@param apply_in_topup Apply In Top -Up	  */
	public void setapply_in_topup (boolean apply_in_topup)
	{
		set_Value (COLUMNNAME_apply_in_topup, Boolean.valueOf(apply_in_topup));
	}

	/** Get Apply In Top -Up.
		@return Apply In Top -Up	  */
	public boolean isapply_in_topup () 
	{
		Object oo = get_Value(COLUMNNAME_apply_in_topup);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Apply In Tracking.
		@param apply_in_tracking Apply In Tracking	  */
	public void setapply_in_tracking (boolean apply_in_tracking)
	{
		set_Value (COLUMNNAME_apply_in_tracking, Boolean.valueOf(apply_in_tracking));
	}

	/** Get Apply In Tracking.
		@return Apply In Tracking	  */
	public boolean isapply_in_tracking () 
	{
		Object oo = get_Value(COLUMNNAME_apply_in_tracking);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_s_accountsetup gets_accountsetup() throws RuntimeException
    {
		return (I_s_accountsetup)MTable.get(getCtx(), I_s_accountsetup.Table_Name)
			.getPO(gets_accountsetup_ID(), get_TrxName());	}

	/** Set Other Charge.
		@param s_accountsetup_ID Other Charge	  */
	public void sets_accountsetup_ID (int s_accountsetup_ID)
	{
		if (s_accountsetup_ID < 1) 
			set_Value (COLUMNNAME_s_accountsetup_ID, null);
		else 
			set_Value (COLUMNNAME_s_accountsetup_ID, Integer.valueOf(s_accountsetup_ID));
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

	/** Set s_other_loan_charges ID.
		@param s_other_loan_charges_ID s_other_loan_charges ID	  */
	public void sets_other_loan_charges_ID (int s_other_loan_charges_ID)
	{
		if (s_other_loan_charges_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_other_loan_charges_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_other_loan_charges_ID, Integer.valueOf(s_other_loan_charges_ID));
	}

	/** Get s_other_loan_charges ID.
		@return s_other_loan_charges ID	  */
	public int gets_other_loan_charges_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_other_loan_charges_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}