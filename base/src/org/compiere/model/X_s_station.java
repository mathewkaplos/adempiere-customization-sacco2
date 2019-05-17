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
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for s_station
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_station extends PO implements I_s_station, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181218L;

    /** Standard Constructor */
    public X_s_station (Properties ctx, int s_station_ID, String trxName)
    {
      super (ctx, s_station_ID, trxName);
      /** if (s_station_ID == 0)
        {
			sets_station_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_station (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_station[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Employer.
		@param s_employers_ID Employer	  */
	public void sets_employers_ID (int s_employers_ID)
	{
		if (s_employers_ID < 1) 
			set_Value (COLUMNNAME_s_employers_ID, null);
		else 
			set_Value (COLUMNNAME_s_employers_ID, Integer.valueOf(s_employers_ID));
	}

	/** Get Employer.
		@return Employer	  */
	public int gets_employers_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_employers_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Station.
		@param s_station_ID Station	  */
	public void sets_station_ID (int s_station_ID)
	{
		if (s_station_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_station_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_station_ID, Integer.valueOf(s_station_ID));
	}

	/** Get Station.
		@return Station	  */
	public int gets_station_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_station_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Address.
		@param stationaddress Address	  */
	public void setstationaddress (String stationaddress)
	{
		set_Value (COLUMNNAME_stationaddress, stationaddress);
	}

	/** Get Address.
		@return Address	  */
	public String getstationaddress () 
	{
		return (String)get_Value(COLUMNNAME_stationaddress);
	}

	/** Set Code/ Ref #.
		@param stationcode Code/ Ref #	  */
	public void setstationcode (String stationcode)
	{
		set_Value (COLUMNNAME_stationcode, stationcode);
	}

	/** Get Code/ Ref #.
		@return Code/ Ref #	  */
	public String getstationcode () 
	{
		return (String)get_Value(COLUMNNAME_stationcode);
	}

	/** Set Description.
		@param stationname Description	  */
	public void setstationname (String stationname)
	{
		set_Value (COLUMNNAME_stationname, stationname);
	}

	/** Get Description.
		@return Description	  */
	public String getstationname () 
	{
		return (String)get_Value(COLUMNNAME_stationname);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getstationname());
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