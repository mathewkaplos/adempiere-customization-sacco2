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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_AgmInvitation
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_AgmInvitation extends PO implements I_s_AgmInvitation, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190725L;

    /** Standard Constructor */
    public X_s_AgmInvitation (Properties ctx, int s_AgmInvitation_ID, String trxName)
    {
      super (ctx, s_AgmInvitation_ID, trxName);
      /** if (s_AgmInvitation_ID == 0)
        {
			sets_AgmInvitation_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_AgmInvitation (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_AgmInvitation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Agm Date.
		@param AgmDate Agm Date	  */
	public void setAgmDate (Timestamp AgmDate)
	{
		set_Value (COLUMNNAME_AgmDate, AgmDate);
	}

	/** Get Agm Date.
		@return Agm Date	  */
	public Timestamp getAgmDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_AgmDate);
	}

	/** Set Agm Month.
		@param AgmMonth Agm Month	  */
	public void setAgmMonth (int AgmMonth)
	{
		set_Value (COLUMNNAME_AgmMonth, Integer.valueOf(AgmMonth));
	}

	/** Get Agm Month.
		@return Agm Month	  */
	public int getAgmMonth () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AgmMonth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Agm Year.
		@param AgmYear Agm Year	  */
	public void setAgmYear (int AgmYear)
	{
		set_Value (COLUMNNAME_AgmYear, Integer.valueOf(AgmYear));
	}

	/** Get Agm Year.
		@return Agm Year	  */
	public int getAgmYear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AgmYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Attendance No.
		@param Attendanceno Attendance No	  */
	public void setAttendanceno (String Attendanceno)
	{
		set_Value (COLUMNNAME_Attendanceno, Attendanceno);
	}

	/** Get Attendance No.
		@return Attendance No	  */
	public String getAttendanceno () 
	{
		return (String)get_Value(COLUMNNAME_Attendanceno);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Member #.
		@param mcode Member #	  */
	public void setmcode (String mcode)
	{
		set_Value (COLUMNNAME_mcode, mcode);
	}

	/** Get Member #.
		@return Member #	  */
	public String getmcode () 
	{
		return (String)get_Value(COLUMNNAME_mcode);
	}

	/** Set s_AgmInvitation ID.
		@param s_AgmInvitation_ID s_AgmInvitation ID	  */
	public void sets_AgmInvitation_ID (int s_AgmInvitation_ID)
	{
		if (s_AgmInvitation_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_AgmInvitation_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_AgmInvitation_ID, Integer.valueOf(s_AgmInvitation_ID));
	}

	/** Get s_AgmInvitation ID.
		@return s_AgmInvitation ID	  */
	public int gets_AgmInvitation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_AgmInvitation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_AgmValidation ID.
		@param s_AgmValidation_ID s_AgmValidation ID	  */
	public void sets_AgmValidation_ID (int s_AgmValidation_ID)
	{
		if (s_AgmValidation_ID < 1) 
			set_Value (COLUMNNAME_s_AgmValidation_ID, null);
		else 
			set_Value (COLUMNNAME_s_AgmValidation_ID, Integer.valueOf(s_AgmValidation_ID));
	}

	/** Get s_AgmValidation ID.
		@return s_AgmValidation ID	  */
	public int gets_AgmValidation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_AgmValidation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_member gets_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_ID(), get_TrxName());	}

	/** Set Member.
		@param s_member_ID Member	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_Value (COLUMNNAME_s_member_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
	}

	/** Get Member.
		@return Member	  */
	public int gets_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Registered EMail.
		@param UserName 
		Email of the responsible for the System
	  */
	public void setUserName (String UserName)
	{
		set_Value (COLUMNNAME_UserName, UserName);
	}

	/** Get Registered EMail.
		@return Email of the responsible for the System
	  */
	public String getUserName () 
	{
		return (String)get_Value(COLUMNNAME_UserName);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set Validated.
		@param validated Validated	  */
	public void setvalidated (boolean validated)
	{
		set_Value (COLUMNNAME_validated, Boolean.valueOf(validated));
	}

	/** Get Validated.
		@return Validated	  */
	public boolean isvalidated () 
	{
		Object oo = get_Value(COLUMNNAME_validated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Valid Shares.
		@param validShares Valid Shares	  */
	public void setvalidShares (BigDecimal validShares)
	{
		set_Value (COLUMNNAME_validShares, validShares);
	}

	/** Get Valid Shares.
		@return Valid Shares	  */
	public BigDecimal getvalidShares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_validShares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}