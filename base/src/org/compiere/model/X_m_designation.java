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

/** Generated Model for m_designation
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_m_designation extends PO implements I_m_designation, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181219L;

    /** Standard Constructor */
    public X_m_designation (Properties ctx, int m_designation_ID, String trxName)
    {
      super (ctx, m_designation_ID, trxName);
      /** if (m_designation_ID == 0)
        {
			setm_designation_ID (0);
        } */
    }

    /** Load Constructor */
    public X_m_designation (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_m_designation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set designationname.
		@param designationname designationname	  */
	public void setdesignationname (String designationname)
	{
		set_Value (COLUMNNAME_designationname, designationname);
	}

	/** Get designationname.
		@return designationname	  */
	public String getdesignationname () 
	{
		return (String)get_Value(COLUMNNAME_designationname);
	}

	/** Set Sacco Designation.
		@param m_designation_ID Sacco Designation	  */
	public void setm_designation_ID (int m_designation_ID)
	{
		if (m_designation_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_m_designation_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_m_designation_ID, Integer.valueOf(m_designation_ID));
	}

	/** Get Sacco Designation.
		@return Sacco Designation	  */
	public int getm_designation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_m_designation_ID);
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