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

/** Generated Model for z_payroll_csv
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_z_payroll_csv extends PO implements I_z_payroll_csv, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190325L;

    /** Standard Constructor */
    public X_z_payroll_csv (Properties ctx, int z_payroll_csv_ID, String trxName)
    {
      super (ctx, z_payroll_csv_ID, trxName);
      /** if (z_payroll_csv_ID == 0)
        {
			setz_payroll_csv_ID (0);
        } */
    }

    /** Load Constructor */
    public X_z_payroll_csv (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_z_payroll_csv[")
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

	/** Set Balance.
		@param Balance Balance	  */
	public void setBalance (BigDecimal Balance)
	{
		set_Value (COLUMNNAME_Balance, Balance);
	}

	/** Get Balance.
		@return Balance	  */
	public BigDecimal getBalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Balance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest.
		@param Interest Interest	  */
	public void setInterest (BigDecimal Interest)
	{
		set_Value (COLUMNNAME_Interest, Interest);
	}

	/** Get Interest.
		@return Interest	  */
	public BigDecimal getInterest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Interest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Item.
		@param Item Item	  */
	public void setItem (String Item)
	{
		set_Value (COLUMNNAME_Item, Item);
	}

	/** Get Item.
		@return Item	  */
	public String getItem () 
	{
		return (String)get_Value(COLUMNNAME_Item);
	}

	/** Set Item_Code.
		@param Item_Code Item_Code	  */
	public void setItem_Code (String Item_Code)
	{
		set_Value (COLUMNNAME_Item_Code, Item_Code);
	}

	/** Get Item_Code.
		@return Item_Code	  */
	public String getItem_Code () 
	{
		return (String)get_Value(COLUMNNAME_Item_Code);
	}

	/** Set Month.
		@param Month Month	  */
	public void setMonth (String Month)
	{
		set_Value (COLUMNNAME_Month, Month);
	}

	/** Get Month.
		@return Month	  */
	public String getMonth () 
	{
		return (String)get_Value(COLUMNNAME_Month);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
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

	/** Set Payroll_Code.
		@param Payroll_Code Payroll_Code	  */
	public void setPayroll_Code (String Payroll_Code)
	{
		set_Value (COLUMNNAME_Payroll_Code, Payroll_Code);
	}

	/** Get Payroll_Code.
		@return Payroll_Code	  */
	public String getPayroll_Code () 
	{
		return (String)get_Value(COLUMNNAME_Payroll_Code);
	}

	/** Set s_payrol_interface ID.
		@param s_payrol_interface_ID s_payrol_interface ID	  */
	public void sets_payrol_interface_ID (int s_payrol_interface_ID)
	{
		if (s_payrol_interface_ID < 1) 
			set_Value (COLUMNNAME_s_payrol_interface_ID, null);
		else 
			set_Value (COLUMNNAME_s_payrol_interface_ID, Integer.valueOf(s_payrol_interface_ID));
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

	/** Set Year.
		@param Year Year	  */
	public void setYear (String Year)
	{
		set_Value (COLUMNNAME_Year, Year);
	}

	/** Get Year.
		@return Year	  */
	public String getYear () 
	{
		return (String)get_Value(COLUMNNAME_Year);
	}

	/** Set z_payroll_csv ID.
		@param z_payroll_csv_ID z_payroll_csv ID	  */
	public void setz_payroll_csv_ID (int z_payroll_csv_ID)
	{
		if (z_payroll_csv_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_z_payroll_csv_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_z_payroll_csv_ID, Integer.valueOf(z_payroll_csv_ID));
	}

	/** Get z_payroll_csv ID.
		@return z_payroll_csv ID	  */
	public int getz_payroll_csv_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_z_payroll_csv_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}