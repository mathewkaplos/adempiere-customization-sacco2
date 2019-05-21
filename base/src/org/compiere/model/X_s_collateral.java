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

/** Generated Model for s_collateral
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_collateral extends PO implements I_s_collateral, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190521L;

    /** Standard Constructor */
    public X_s_collateral (Properties ctx, int s_collateral_ID, String trxName)
    {
      super (ctx, s_collateral_ID, trxName);
      /** if (s_collateral_ID == 0)
        {
			sets_collateral_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_collateral (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_collateral[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Valuation Date.
		@param DateValue 
		Date of valuation
	  */
	public void setDateValue (Timestamp DateValue)
	{
		set_Value (COLUMNNAME_DateValue, DateValue);
	}

	/** Get Valuation Date.
		@return Date of valuation
	  */
	public Timestamp getDateValue () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateValue);
	}

	/** Set Location Of Owner Document.
		@param location_of_owner_doc Location Of Owner Document	  */
	public void setlocation_of_owner_doc (String location_of_owner_doc)
	{
		set_Value (COLUMNNAME_location_of_owner_doc, location_of_owner_doc);
	}

	/** Get Location Of Owner Document.
		@return Location Of Owner Document	  */
	public String getlocation_of_owner_doc () 
	{
		return (String)get_Value(COLUMNNAME_location_of_owner_doc);
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

	/** Set Owner.
		@param owner Owner	  */
	public void setowner (String owner)
	{
		set_Value (COLUMNNAME_owner, owner);
	}

	/** Get Owner.
		@return Owner	  */
	public String getowner () 
	{
		return (String)get_Value(COLUMNNAME_owner);
	}

	/** Set Owner Document.
		@param owner_document Owner Document	  */
	public void setowner_document (String owner_document)
	{
		set_Value (COLUMNNAME_owner_document, owner_document);
	}

	/** Get Owner Document.
		@return Owner Document	  */
	public String getowner_document () 
	{
		return (String)get_Value(COLUMNNAME_owner_document);
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

	/** Set s_collateral ID.
		@param s_collateral_ID s_collateral ID	  */
	public void sets_collateral_ID (int s_collateral_ID)
	{
		if (s_collateral_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_collateral_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_collateral_ID, Integer.valueOf(s_collateral_ID));
	}

	/** Get s_collateral ID.
		@return s_collateral ID	  */
	public int gets_collateral_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_collateral_ID);
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

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set Value.
		@param ValueNumber 
		Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber)
	{
		set_Value (COLUMNNAME_ValueNumber, ValueNumber);
	}

	/** Get Value.
		@return Numeric Value
	  */
	public BigDecimal getValueNumber () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValueNumber);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}