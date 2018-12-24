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

/** Generated Model for s_sacco_mail
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_sacco_mail extends PO implements I_s_sacco_mail, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181220L;

    /** Standard Constructor */
    public X_s_sacco_mail (Properties ctx, int s_sacco_mail_ID, String trxName)
    {
      super (ctx, s_sacco_mail_ID, trxName);
      /** if (s_sacco_mail_ID == 0)
        {
			sets_sacco_mail_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_sacco_mail (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_sacco_mail[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Password.
		@param Password 
		Password of any length (case sensitive)
	  */
	public void setPassword (String Password)
	{
		set_Value (COLUMNNAME_Password, Password);
	}

	/** Get Password.
		@return Password of any length (case sensitive)
	  */
	public String getPassword () 
	{
		return (String)get_Value(COLUMNNAME_Password);
	}

	/** Set s_sacco_mail ID.
		@param s_sacco_mail_ID s_sacco_mail ID	  */
	public void sets_sacco_mail_ID (int s_sacco_mail_ID)
	{
		if (s_sacco_mail_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_sacco_mail_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_sacco_mail_ID, Integer.valueOf(s_sacco_mail_ID));
	}

	/** Get s_sacco_mail ID.
		@return s_sacco_mail ID	  */
	public int gets_sacco_mail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sacco_mail_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SMTP Authenticate.
		@param smtp_auth SMTP Authenticate	  */
	public void setsmtp_auth (boolean smtp_auth)
	{
		set_Value (COLUMNNAME_smtp_auth, Boolean.valueOf(smtp_auth));
	}

	/** Get SMTP Authenticate.
		@return SMTP Authenticate	  */
	public boolean issmtp_auth () 
	{
		Object oo = get_Value(COLUMNNAME_smtp_auth);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set SMTP HOST.
		@param smtp_host SMTP HOST	  */
	public void setsmtp_host (String smtp_host)
	{
		set_Value (COLUMNNAME_smtp_host, smtp_host);
	}

	/** Get SMTP HOST.
		@return SMTP HOST	  */
	public String getsmtp_host () 
	{
		return (String)get_Value(COLUMNNAME_smtp_host);
	}

	/** Set SMTP PORT.
		@param smtp_port SMTP PORT	  */
	public void setsmtp_port (int smtp_port)
	{
		set_Value (COLUMNNAME_smtp_port, Integer.valueOf(smtp_port));
	}

	/** Get SMTP PORT.
		@return SMTP PORT	  */
	public int getsmtp_port () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_smtp_port);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SMTP Socket Port.
		@param smtp_socketfactory_port SMTP Socket Port	  */
	public void setsmtp_socketfactory_port (int smtp_socketfactory_port)
	{
		set_Value (COLUMNNAME_smtp_socketfactory_port, Integer.valueOf(smtp_socketfactory_port));
	}

	/** Get SMTP Socket Port.
		@return SMTP Socket Port	  */
	public int getsmtp_socketfactory_port () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_smtp_socketfactory_port);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}