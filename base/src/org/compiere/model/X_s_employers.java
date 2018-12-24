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

/** Generated Model for s_employers
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_employers extends PO implements I_s_employers, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181218L;

    /** Standard Constructor */
    public X_s_employers (Properties ctx, int s_employers_ID, String trxName)
    {
      super (ctx, s_employers_ID, trxName);
      /** if (s_employers_ID == 0)
        {
			setempcode (null);
			sets_employers_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_employers (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_employers[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Physical Address.
		@param address Physical Address	  */
	public void setaddress (String address)
	{
		set_Value (COLUMNNAME_address, address);
	}

	/** Get Physical Address.
		@return Physical Address	  */
	public String getaddress () 
	{
		return (String)get_Value(COLUMNNAME_address);
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

	/** Set country.
		@param country country	  */
	public void setcountry (String country)
	{
		set_Value (COLUMNNAME_country, country);
	}

	/** Get country.
		@return country	  */
	public String getcountry () 
	{
		return (String)get_Value(COLUMNNAME_country);
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

	/** Set disp002.
		@param disp002 disp002	  */
	public void setdisp002 (boolean disp002)
	{
		set_Value (COLUMNNAME_disp002, Boolean.valueOf(disp002));
	}

	/** Get disp002.
		@return disp002	  */
	public boolean isdisp002 () 
	{
		Object oo = get_Value(COLUMNNAME_disp002);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Code #.
		@param empcode Code #	  */
	public void setempcode (String empcode)
	{
		set_Value (COLUMNNAME_empcode, empcode);
	}

	/** Get Code #.
		@return Code #	  */
	public String getempcode () 
	{
		return (String)get_Value(COLUMNNAME_empcode);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getempcode());
    }

	/** Set Description.
		@param employer Description	  */
	public void setemployer (String employer)
	{
		set_Value (COLUMNNAME_employer, employer);
	}

	/** Get Description.
		@return Description	  */
	public String getemployer () 
	{
		return (String)get_Value(COLUMNNAME_employer);
	}

	/** Set Fax.
		@param Fax 
		Facsimile number
	  */
	public void setFax (String Fax)
	{
		set_Value (COLUMNNAME_Fax, Fax);
	}

	/** Get Fax.
		@return Facsimile number
	  */
	public String getFax () 
	{
		return (String)get_Value(COLUMNNAME_Fax);
	}

	/** Set Telephone #2.
		@param mobile Telephone #2	  */
	public void setmobile (String mobile)
	{
		set_Value (COLUMNNAME_mobile, mobile);
	}

	/** Get Telephone #2.
		@return Telephone #2	  */
	public String getmobile () 
	{
		return (String)get_Value(COLUMNNAME_mobile);
	}

	/** Set Cell Number.
		@param pinno Cell Number	  */
	public void setpinno (String pinno)
	{
		set_Value (COLUMNNAME_pinno, pinno);
	}

	/** Get Cell Number.
		@return Cell Number	  */
	public String getpinno () 
	{
		return (String)get_Value(COLUMNNAME_pinno);
	}

	/** Set Postal Address.
		@param postalcode Postal Address	  */
	public void setpostalcode (String postalcode)
	{
		set_Value (COLUMNNAME_postalcode, postalcode);
	}

	/** Get Postal Address.
		@return Postal Address	  */
	public String getpostalcode () 
	{
		return (String)get_Value(COLUMNNAME_postalcode);
	}

	/** Set province.
		@param province province	  */
	public void setprovince (String province)
	{
		set_Value (COLUMNNAME_province, province);
	}

	/** Get province.
		@return province	  */
	public String getprovince () 
	{
		return (String)get_Value(COLUMNNAME_province);
	}

	/** Set Employer.
		@param s_employers_ID Employer	  */
	public void sets_employers_ID (int s_employers_ID)
	{
		if (s_employers_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_employers_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_employers_ID, Integer.valueOf(s_employers_ID));
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

	/** Set street.
		@param street street	  */
	public void setstreet (String street)
	{
		set_Value (COLUMNNAME_street, street);
	}

	/** Get street.
		@return street	  */
	public String getstreet () 
	{
		return (String)get_Value(COLUMNNAME_street);
	}

	/** Set Telephone #1.
		@param telephone Telephone #1	  */
	public void settelephone (String telephone)
	{
		set_Value (COLUMNNAME_telephone, telephone);
	}

	/** Get Telephone #1.
		@return Telephone #1	  */
	public String gettelephone () 
	{
		return (String)get_Value(COLUMNNAME_telephone);
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