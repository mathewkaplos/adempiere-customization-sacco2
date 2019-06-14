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

/** Generated Model for s_grade
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_grade extends PO implements I_s_grade, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181218L;

    /** Standard Constructor */
    public X_s_grade (Properties ctx, int s_grade_ID, String trxName)
    {
      super (ctx, s_grade_ID, trxName);
      /** if (s_grade_ID == 0)
        {
			sets_grade_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_grade (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_grade[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set gradename.
		@param gradename gradename	  */
	public void setgradename (String gradename)
	{
		set_Value (COLUMNNAME_gradename, gradename);
	}

	/** Get gradename.
		@return gradename	  */
	public String getgradename () 
	{
		return (String)get_Value(COLUMNNAME_gradename);
	}

	/** Set Sacco Grade.
		@param s_grade_ID Sacco Grade	  */
	public void sets_grade_ID (int s_grade_ID)
	{
		if (s_grade_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_grade_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_grade_ID, Integer.valueOf(s_grade_ID));
	}

	/** Get Sacco Grade.
		@return Sacco Grade	  */
	public int gets_grade_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_grade_ID);
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