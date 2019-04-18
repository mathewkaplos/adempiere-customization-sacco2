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

/** Generated Model for s_payment_mode
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_payment_mode extends PO implements I_s_payment_mode, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190418L;

    /** Standard Constructor */
    public X_s_payment_mode (Properties ctx, int s_payment_mode_ID, String trxName)
    {
      super (ctx, s_payment_mode_ID, trxName);
      /** if (s_payment_mode_ID == 0)
        {
			setName (null);
			sets_payment_mode_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_payment_mode (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_payment_mode[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		throw new IllegalArgumentException ("Record_ID is virtual column");	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Repayment Mode.
		@param s_payment_mode_ID Repayment Mode	  */
	public void sets_payment_mode_ID (int s_payment_mode_ID)
	{
		if (s_payment_mode_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_payment_mode_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_payment_mode_ID, Integer.valueOf(s_payment_mode_ID));
	}

	/** Get Repayment Mode.
		@return Repayment Mode	  */
	public int gets_payment_mode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payment_mode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Applicable During Disbursement.
		@param used_in_disbursement Applicable During Disbursement	  */
	public void setused_in_disbursement (boolean used_in_disbursement)
	{
		set_Value (COLUMNNAME_used_in_disbursement, Boolean.valueOf(used_in_disbursement));
	}

	/** Get Applicable During Disbursement.
		@return Applicable During Disbursement	  */
	public boolean isused_in_disbursement () 
	{
		Object oo = get_Value(COLUMNNAME_used_in_disbursement);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Applicable During  Remittance.
		@param used_in_remittance Applicable During  Remittance	  */
	public void setused_in_remittance (boolean used_in_remittance)
	{
		set_Value (COLUMNNAME_used_in_remittance, Boolean.valueOf(used_in_remittance));
	}

	/** Get Applicable During  Remittance.
		@return Applicable During  Remittance	  */
	public boolean isused_in_remittance () 
	{
		Object oo = get_Value(COLUMNNAME_used_in_remittance);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}