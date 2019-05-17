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
import org.compiere.util.KeyNamePair;

/** Generated Model for s_loanpurpose
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_loanpurpose extends PO implements I_s_loanpurpose, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190321L;

    /** Standard Constructor */
    public X_s_loanpurpose (Properties ctx, int s_loanpurpose_ID, String trxName)
    {
      super (ctx, s_loanpurpose_ID, trxName);
      /** if (s_loanpurpose_ID == 0)
        {
			sets_loanpurpose_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_loanpurpose (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_loanpurpose[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Ref Number:.
		@param purposecode Ref Number:	  */
	public void setpurposecode (String purposecode)
	{
		set_Value (COLUMNNAME_purposecode, purposecode);
	}

	/** Get Ref Number:.
		@return Ref Number:	  */
	public String getpurposecode () 
	{
		return (String)get_Value(COLUMNNAME_purposecode);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getpurposecode());
    }

	/** Set Description.
		@param purposename Description	  */
	public void setpurposename (String purposename)
	{
		set_Value (COLUMNNAME_purposename, purposename);
	}

	/** Get Description.
		@return Description	  */
	public String getpurposename () 
	{
		return (String)get_Value(COLUMNNAME_purposename);
	}

	/** Set Loan Purpose .
		@param s_loanpurpose_ID Loan Purpose 	  */
	public void sets_loanpurpose_ID (int s_loanpurpose_ID)
	{
		if (s_loanpurpose_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_loanpurpose_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_loanpurpose_ID, Integer.valueOf(s_loanpurpose_ID));
	}

	/** Get Loan Purpose .
		@return Loan Purpose 	  */
	public int gets_loanpurpose_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loanpurpose_ID);
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