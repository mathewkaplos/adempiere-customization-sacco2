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

/** Generated Model for s_branch
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_branch extends PO implements I_s_branch, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181218L;

    /** Standard Constructor */
    public X_s_branch (Properties ctx, int s_branch_ID, String trxName)
    {
      super (ctx, s_branch_ID, trxName);
      /** if (s_branch_ID == 0)
        {
			sets_branch_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_branch (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_branch[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Physical Location.
		@param branchaddress Physical Location	  */
	public void setbranchaddress (String branchaddress)
	{
		set_Value (COLUMNNAME_branchaddress, branchaddress);
	}

	/** Get Physical Location.
		@return Physical Location	  */
	public String getbranchaddress () 
	{
		return (String)get_Value(COLUMNNAME_branchaddress);
	}

	/** Set City/Town.
		@param branchcity City/Town	  */
	public void setbranchcity (String branchcity)
	{
		set_Value (COLUMNNAME_branchcity, branchcity);
	}

	/** Get City/Town.
		@return City/Town	  */
	public String getbranchcity () 
	{
		return (String)get_Value(COLUMNNAME_branchcity);
	}

	/** Set Ref # / Code:.
		@param branchcode Ref # / Code:	  */
	public void setbranchcode (String branchcode)
	{
		set_Value (COLUMNNAME_branchcode, branchcode);
	}

	/** Get Ref # / Code:.
		@return Ref # / Code:	  */
	public String getbranchcode () 
	{
		return (String)get_Value(COLUMNNAME_branchcode);
	}

	/** Set Branch Contact Person.
		@param branchcontactperson Branch Contact Person	  */
	public void setbranchcontactperson (String branchcontactperson)
	{
		set_Value (COLUMNNAME_branchcontactperson, branchcontactperson);
	}

	/** Get Branch Contact Person.
		@return Branch Contact Person	  */
	public String getbranchcontactperson () 
	{
		return (String)get_Value(COLUMNNAME_branchcontactperson);
	}

	/** Set Country:.
		@param branchcountry Country:	  */
	public void setbranchcountry (String branchcountry)
	{
		set_Value (COLUMNNAME_branchcountry, branchcountry);
	}

	/** Get Country:.
		@return Country:	  */
	public String getbranchcountry () 
	{
		return (String)get_Value(COLUMNNAME_branchcountry);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getbranchname());
    }

	/** Set P.O Box #.
		@param branchpobox P.O Box #	  */
	public void setbranchpobox (String branchpobox)
	{
		set_Value (COLUMNNAME_branchpobox, branchpobox);
	}

	/** Get P.O Box #.
		@return P.O Box #	  */
	public String getbranchpobox () 
	{
		return (String)get_Value(COLUMNNAME_branchpobox);
	}

	/** Set Postal Code:.
		@param branchpostalcode Postal Code:	  */
	public void setbranchpostalcode (String branchpostalcode)
	{
		set_Value (COLUMNNAME_branchpostalcode, branchpostalcode);
	}

	/** Get Postal Code:.
		@return Postal Code:	  */
	public String getbranchpostalcode () 
	{
		return (String)get_Value(COLUMNNAME_branchpostalcode);
	}

	/** Set branchrefcode.
		@param branchrefcode branchrefcode	  */
	public void setbranchrefcode (String branchrefcode)
	{
		set_Value (COLUMNNAME_branchrefcode, branchrefcode);
	}

	/** Get branchrefcode.
		@return branchrefcode	  */
	public String getbranchrefcode () 
	{
		return (String)get_Value(COLUMNNAME_branchrefcode);
	}

	/** Set Tel # 1.
		@param branchtel1 Tel # 1	  */
	public void setbranchtel1 (String branchtel1)
	{
		set_Value (COLUMNNAME_branchtel1, branchtel1);
	}

	/** Get Tel # 1.
		@return Tel # 1	  */
	public String getbranchtel1 () 
	{
		return (String)get_Value(COLUMNNAME_branchtel1);
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

	/** Set Is Costcenter.
		@param iscostcenter Is Costcenter	  */
	public void setiscostcenter (boolean iscostcenter)
	{
		set_Value (COLUMNNAME_iscostcenter, Boolean.valueOf(iscostcenter));
	}

	/** Get Is Costcenter.
		@return Is Costcenter	  */
	public boolean iscostcenter () 
	{
		Object oo = get_Value(COLUMNNAME_iscostcenter);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Member Branch.
		@param s_branch_ID Member Branch	  */
	public void sets_branch_ID (int s_branch_ID)
	{
		if (s_branch_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_branch_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_branch_ID, Integer.valueOf(s_branch_ID));
	}

	/** Get Member Branch.
		@return Member Branch	  */
	public int gets_branch_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_branch_ID);
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