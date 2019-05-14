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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

/** Generated Model for s_day
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_day extends PO implements I_s_day, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190514L;

    /** Standard Constructor */
    public X_s_day (Properties ctx, int s_day_ID, String trxName)
    {
      super (ctx, s_day_ID, trxName);
      /** if (s_day_ID == 0)
        {
			setIsNonWorkingDay (false);
// N
			setOpenForSome (false);
// N
			sets_day_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_day (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_day[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Closed Status.
		@param IsClosed 
		The status is closed
	  */
	public void setIsClosed (boolean IsClosed)
	{
		set_Value (COLUMNNAME_IsClosed, Boolean.valueOf(IsClosed));
	}

	/** Get Closed Status.
		@return The status is closed
	  */
	public boolean isClosed () 
	{
		Object oo = get_Value(COLUMNNAME_IsClosed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Non Working Day.
		@param IsNonWorkingDay Is Non Working Day	  */
	public void setIsNonWorkingDay (boolean IsNonWorkingDay)
	{
		set_Value (COLUMNNAME_IsNonWorkingDay, Boolean.valueOf(IsNonWorkingDay));
	}

	/** Get Is Non Working Day.
		@return Is Non Working Day	  */
	public boolean isNonWorkingDay () 
	{
		Object oo = get_Value(COLUMNNAME_IsNonWorkingDay);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open Status.
		@param IsOpen 
		The status is closed
	  */
	public void setIsOpen (boolean IsOpen)
	{
		set_Value (COLUMNNAME_IsOpen, Boolean.valueOf(IsOpen));
	}

	/** Get Open Status.
		@return The status is closed
	  */
	public boolean isOpen () 
	{
		Object oo = get_Value(COLUMNNAME_IsOpen);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Weekend.
		@param IsWeekend Is Weekend	  */
	public void setIsWeekend (boolean IsWeekend)
	{
		set_Value (COLUMNNAME_IsWeekend, Boolean.valueOf(IsWeekend));
	}

	/** Get Is Weekend.
		@return Is Weekend	  */
	public boolean isWeekend () 
	{
		Object oo = get_Value(COLUMNNAME_IsWeekend);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Open For Some Users.
		@param OpenForSome Open For Some Users	  */
	public void setOpenForSome (boolean OpenForSome)
	{
		set_Value (COLUMNNAME_OpenForSome, Boolean.valueOf(OpenForSome));
	}

	/** Get Open For Some Users.
		@return Open For Some Users	  */
	public boolean isOpenForSome () 
	{
		Object oo = get_Value(COLUMNNAME_OpenForSome);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set s_day ID.
		@param s_day_ID s_day ID	  */
	public void sets_day_ID (int s_day_ID)
	{
		if (s_day_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_day_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_day_ID, Integer.valueOf(s_day_ID));
	}

	/** Get s_day ID.
		@return s_day ID	  */
	public int gets_day_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_day_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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