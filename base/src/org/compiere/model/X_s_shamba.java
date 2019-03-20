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

/** Generated Model for s_shamba
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_shamba extends PO implements I_s_shamba, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190320L;

    /** Standard Constructor */
    public X_s_shamba (Properties ctx, int s_shamba_ID, String trxName)
    {
      super (ctx, s_shamba_ID, trxName);
      /** if (s_shamba_ID == 0)
        {
			setlocation (null);
			sets_shamba_ID (0);
			setsize (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_s_shamba (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_shamba[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Location.
		@param location Location	  */
	public void setlocation (String location)
	{
		set_Value (COLUMNNAME_location, location);
	}

	/** Get Location.
		@return Location	  */
	public String getlocation () 
	{
		return (String)get_Value(COLUMNNAME_location);
	}

	/** Set Shamba.
		@param s_shamba_ID Shamba	  */
	public void sets_shamba_ID (int s_shamba_ID)
	{
		if (s_shamba_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_shamba_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_shamba_ID, Integer.valueOf(s_shamba_ID));
	}

	/** Get Shamba.
		@return Shamba	  */
	public int gets_shamba_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shamba_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Size (Hectares).
		@param size Size (Hectares)	  */
	public void setsize (BigDecimal size)
	{
		set_Value (COLUMNNAME_size, size);
	}

	/** Get Size (Hectares).
		@return Size (Hectares)	  */
	public BigDecimal getsize () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_size);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}