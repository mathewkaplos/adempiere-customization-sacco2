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

/** Generated Model for s_holidays
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_holidays extends PO implements I_s_holidays, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190514L;

    /** Standard Constructor */
    public X_s_holidays (Properties ctx, int s_holidays_ID, String trxName)
    {
      super (ctx, s_holidays_ID, trxName);
      /** if (s_holidays_ID == 0)
        {
			setDate1 (new Timestamp( System.currentTimeMillis() ));
			setName (null);
			sets_holidays_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_holidays (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_holidays[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set s_holiday_setup ID.
		@param s_holiday_setup_ID s_holiday_setup ID	  */
	public void sets_holiday_setup_ID (int s_holiday_setup_ID)
	{
		if (s_holiday_setup_ID < 1) 
			set_Value (COLUMNNAME_s_holiday_setup_ID, null);
		else 
			set_Value (COLUMNNAME_s_holiday_setup_ID, Integer.valueOf(s_holiday_setup_ID));
	}

	/** Get s_holiday_setup ID.
		@return s_holiday_setup ID	  */
	public int gets_holiday_setup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_holiday_setup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_holidays ID.
		@param s_holidays_ID s_holidays ID	  */
	public void sets_holidays_ID (int s_holidays_ID)
	{
		if (s_holidays_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_holidays_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_holidays_ID, Integer.valueOf(s_holidays_ID));
	}

	/** Get s_holidays ID.
		@return s_holidays ID	  */
	public int gets_holidays_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_holidays_ID);
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