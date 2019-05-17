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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for s_bank
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_bank extends PO implements I_s_bank, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181224L;

    /** Standard Constructor */
    public X_s_bank (Properties ctx, int s_bank_ID, String trxName)
    {
      super (ctx, s_bank_ID, trxName);
      /** if (s_bank_ID == 0)
        {
			sets_bank_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_bank (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_bank[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set bankaddress.
		@param bankaddress bankaddress	  */
	public void setbankaddress (String bankaddress)
	{
		set_Value (COLUMNNAME_bankaddress, bankaddress);
	}

	/** Get bankaddress.
		@return bankaddress	  */
	public String getbankaddress () 
	{
		return (String)get_Value(COLUMNNAME_bankaddress);
	}

	/** Set bankcode.
		@param bankcode bankcode	  */
	public void setbankcode (String bankcode)
	{
		set_Value (COLUMNNAME_bankcode, bankcode);
	}

	/** Get bankcode.
		@return bankcode	  */
	public String getbankcode () 
	{
		return (String)get_Value(COLUMNNAME_bankcode);
	}

	/** Set bankcountry.
		@param bankcountry bankcountry	  */
	public void setbankcountry (String bankcountry)
	{
		set_Value (COLUMNNAME_bankcountry, bankcountry);
	}

	/** Get bankcountry.
		@return bankcountry	  */
	public String getbankcountry () 
	{
		return (String)get_Value(COLUMNNAME_bankcountry);
	}

	/** Set bankentrydate.
		@param bankentrydate bankentrydate	  */
	public void setbankentrydate (Timestamp bankentrydate)
	{
		set_Value (COLUMNNAME_bankentrydate, bankentrydate);
	}

	/** Get bankentrydate.
		@return bankentrydate	  */
	public Timestamp getbankentrydate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_bankentrydate);
	}

	/** Set bankfax.
		@param bankfax bankfax	  */
	public void setbankfax (String bankfax)
	{
		set_Value (COLUMNNAME_bankfax, bankfax);
	}

	/** Get bankfax.
		@return bankfax	  */
	public String getbankfax () 
	{
		return (String)get_Value(COLUMNNAME_bankfax);
	}

	/** Set Bank GL Code.
		@param bankgl_Acct Bank GL Code	  */
	public void setbankgl_Acct (String bankgl_Acct)
	{
		set_Value (COLUMNNAME_bankgl_Acct, bankgl_Acct);
	}

	/** Get Bank GL Code.
		@return Bank GL Code	  */
	public String getbankgl_Acct () 
	{
		return (String)get_Value(COLUMNNAME_bankgl_Acct);
	}

	/** Set bankmanager.
		@param bankmanager bankmanager	  */
	public void setbankmanager (String bankmanager)
	{
		set_Value (COLUMNNAME_bankmanager, bankmanager);
	}

	/** Get bankmanager.
		@return bankmanager	  */
	public String getbankmanager () 
	{
		return (String)get_Value(COLUMNNAME_bankmanager);
	}

	/** Set bankpostaladdress.
		@param bankpostaladdress bankpostaladdress	  */
	public void setbankpostaladdress (String bankpostaladdress)
	{
		set_Value (COLUMNNAME_bankpostaladdress, bankpostaladdress);
	}

	/** Get bankpostaladdress.
		@return bankpostaladdress	  */
	public String getbankpostaladdress () 
	{
		return (String)get_Value(COLUMNNAME_bankpostaladdress);
	}

	/** Set bankpostalcode.
		@param bankpostalcode bankpostalcode	  */
	public void setbankpostalcode (String bankpostalcode)
	{
		set_Value (COLUMNNAME_bankpostalcode, bankpostalcode);
	}

	/** Get bankpostalcode.
		@return bankpostalcode	  */
	public String getbankpostalcode () 
	{
		return (String)get_Value(COLUMNNAME_bankpostalcode);
	}

	/** Set bankrefcode.
		@param bankrefcode bankrefcode	  */
	public void setbankrefcode (String bankrefcode)
	{
		set_Value (COLUMNNAME_bankrefcode, bankrefcode);
	}

	/** Get bankrefcode.
		@return bankrefcode	  */
	public String getbankrefcode () 
	{
		return (String)get_Value(COLUMNNAME_bankrefcode);
	}

	/** Set banktel1.
		@param banktel1 banktel1	  */
	public void setbanktel1 (String banktel1)
	{
		set_Value (COLUMNNAME_banktel1, banktel1);
	}

	/** Get banktel1.
		@return banktel1	  */
	public String getbanktel1 () 
	{
		return (String)get_Value(COLUMNNAME_banktel1);
	}

	/** Set banktel2.
		@param banktel2 banktel2	  */
	public void setbanktel2 (String banktel2)
	{
		set_Value (COLUMNNAME_banktel2, banktel2);
	}

	/** Get banktel2.
		@return banktel2	  */
	public String getbanktel2 () 
	{
		return (String)get_Value(COLUMNNAME_banktel2);
	}

	/** Set banktel3.
		@param banktel3 banktel3	  */
	public void setbanktel3 (String banktel3)
	{
		set_Value (COLUMNNAME_banktel3, banktel3);
	}

	/** Get banktel3.
		@return banktel3	  */
	public String getbanktel3 () 
	{
		return (String)get_Value(COLUMNNAME_banktel3);
	}

	/** Set banktel4.
		@param banktel4 banktel4	  */
	public void setbanktel4 (String banktel4)
	{
		set_Value (COLUMNNAME_banktel4, banktel4);
	}

	/** Get banktel4.
		@return banktel4	  */
	public String getbanktel4 () 
	{
		return (String)get_Value(COLUMNNAME_banktel4);
	}

	/** Set Branch ID.
		@param BranchID 
		Bank Branch ID
	  */
	public void setBranchID (int BranchID)
	{
		set_Value (COLUMNNAME_BranchID, Integer.valueOf(BranchID));
	}

	/** Get Branch ID.
		@return Bank Branch ID
	  */
	public int getBranchID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BranchID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Branch Name.
		@param branchname Branch Name	  */
	public void setbranchname (String branchname)
	{
		set_Value (COLUMNNAME_branchname, branchname);
	}

	/** Get Branch Name.
		@return Branch Name	  */
	public String getbranchname () 
	{
		return (String)get_Value(COLUMNNAME_branchname);
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set City.
		@param City 
		Identifies a City
	  */
	public void setCity (String City)
	{
		set_Value (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity () 
	{
		return (String)get_Value(COLUMNNAME_City);
	}

	/** Set curyearbalance.
		@param curyearbalance curyearbalance	  */
	public void setcuryearbalance (BigDecimal curyearbalance)
	{
		set_Value (COLUMNNAME_curyearbalance, curyearbalance);
	}

	/** Get curyearbalance.
		@return curyearbalance	  */
	public BigDecimal getcuryearbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_curyearbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set cyb.
		@param cyb cyb	  */
	public void setcyb (BigDecimal cyb)
	{
		set_Value (COLUMNNAME_cyb, cyb);
	}

	/** Get cyb.
		@return cyb	  */
	public BigDecimal getcyb () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_cyb);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set groupid.
		@param groupid groupid	  */
	public void setgroupid (String groupid)
	{
		set_Value (COLUMNNAME_groupid, groupid);
	}

	/** Get groupid.
		@return groupid	  */
	public String getgroupid () 
	{
		return (String)get_Value(COLUMNNAME_groupid);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set prevyearbalance.
		@param prevyearbalance prevyearbalance	  */
	public void setprevyearbalance (BigDecimal prevyearbalance)
	{
		set_Value (COLUMNNAME_prevyearbalance, prevyearbalance);
	}

	/** Get prevyearbalance.
		@return prevyearbalance	  */
	public BigDecimal getprevyearbalance () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_prevyearbalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set pyb.
		@param pyb pyb	  */
	public void setpyb (BigDecimal pyb)
	{
		set_Value (COLUMNNAME_pyb, pyb);
	}

	/** Get pyb.
		@return pyb	  */
	public BigDecimal getpyb () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_pyb);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set s_bank ID.
		@param s_bank_ID s_bank ID	  */
	public void sets_bank_ID (int s_bank_ID)
	{
		if (s_bank_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_bank_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_bank_ID, Integer.valueOf(s_bank_ID));
	}

	/** Get s_bank ID.
		@return s_bank ID	  */
	public int gets_bank_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_bank_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set type_.
		@param type_ type_	  */
	public void settype_ (String type_)
	{
		set_Value (COLUMNNAME_type_, type_);
	}

	/** Get type_.
		@return type_	  */
	public String gettype_ () 
	{
		return (String)get_Value(COLUMNNAME_type_);
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