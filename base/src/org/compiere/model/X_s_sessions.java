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

/** Generated Model for s_sessions
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_sessions extends PO implements I_s_sessions, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190516L;

    /** Standard Constructor */
    public X_s_sessions (Properties ctx, int s_sessions_ID, String trxName)
    {
      super (ctx, s_sessions_ID, trxName);
      /** if (s_sessions_ID == 0)
        {
			setsession_user_ID (0);
			sets_sessions_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_sessions (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_sessions[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
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

	public org.compiere.model.I_AD_User getsession_user() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getsession_user_ID(), get_TrxName());	}

	/** Set Session User.
		@param session_user_ID Session User	  */
	public void setsession_user_ID (int session_user_ID)
	{
		if (session_user_ID < 1) 
			set_Value (COLUMNNAME_session_user_ID, null);
		else 
			set_Value (COLUMNNAME_session_user_ID, Integer.valueOf(session_user_ID));
	}

	/** Get Session User.
		@return Session User	  */
	public int getsession_user_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_session_user_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_session_setup ID.
		@param s_session_setup_ID s_session_setup ID	  */
	public void sets_session_setup_ID (int s_session_setup_ID)
	{
		if (s_session_setup_ID < 1) 
			set_Value (COLUMNNAME_s_session_setup_ID, null);
		else 
			set_Value (COLUMNNAME_s_session_setup_ID, Integer.valueOf(s_session_setup_ID));
	}

	/** Get s_session_setup ID.
		@return s_session_setup ID	  */
	public int gets_session_setup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_session_setup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_sessions ID.
		@param s_sessions_ID s_sessions ID	  */
	public void sets_sessions_ID (int s_sessions_ID)
	{
		if (s_sessions_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_sessions_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_sessions_ID, Integer.valueOf(s_sessions_ID));
	}

	/** Get s_sessions ID.
		@return s_sessions ID	  */
	public int gets_sessions_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sessions_ID);
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