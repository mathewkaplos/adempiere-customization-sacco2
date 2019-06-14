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

/** Generated Model for s_change_req
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_change_req extends PO implements I_s_change_req, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190326L;

    /** Standard Constructor */
    public X_s_change_req (Properties ctx, int s_change_req_ID, String trxName)
    {
      super (ctx, s_change_req_ID, trxName);
      /** if (s_change_req_ID == 0)
        {
			setother_employer (false);
// N
			setother_next_of_kin (false);
// N
			sets_change_req_ID (0);
			setselect_employer (true);
// Y
			setselect_next_of_kin (true);
// Y
        } */
    }

    /** Load Constructor */
    public X_s_change_req (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_change_req[")
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

	/** Set Bank Account No..
		@param bankaccno Bank Account No.	  */
	public void setbankaccno (String bankaccno)
	{
		set_Value (COLUMNNAME_bankaccno, bankaccno);
	}

	/** Get Bank Account No..
		@return Bank Account No.	  */
	public String getbankaccno () 
	{
		return (String)get_Value(COLUMNNAME_bankaccno);
	}

	/** Set Save.
		@param btn_save Save	  */
	public void setbtn_save (String btn_save)
	{
		set_Value (COLUMNNAME_btn_save, btn_save);
	}

	/** Get Save.
		@return Save	  */
	public String getbtn_save () 
	{
		return (String)get_Value(COLUMNNAME_btn_save);
	}

	/** Set Update.
		@param btn_update Update	  */
	public void setbtn_update (String btn_update)
	{
		set_Value (COLUMNNAME_btn_update, btn_update);
	}

	/** Get Update.
		@return Update	  */
	public String getbtn_update () 
	{
		return (String)get_Value(COLUMNNAME_btn_update);
	}

	/** Set Department.
		@param department Department	  */
	public void setdepartment (String department)
	{
		set_Value (COLUMNNAME_department, department);
	}

	/** Get Department.
		@return Department	  */
	public String getdepartment () 
	{
		return (String)get_Value(COLUMNNAME_department);
	}

	/** Set Employer.
		@param employer Employer	  */
	public void setemployer (String employer)
	{
		set_Value (COLUMNNAME_employer, employer);
	}

	/** Get Employer.
		@return Employer	  */
	public String getemployer () 
	{
		return (String)get_Value(COLUMNNAME_employer);
	}

	/** Set Is Updated.
		@param is_updated Is Updated	  */
	public void setis_updated (boolean is_updated)
	{
		set_Value (COLUMNNAME_is_updated, Boolean.valueOf(is_updated));
	}

	/** Get Is Updated.
		@return Is Updated	  */
	public boolean is_updated () 
	{
		Object oo = get_Value(COLUMNNAME_is_updated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Next Of Kin.
		@param m_memberkin_ID Next Of Kin	  */
	public void setm_memberkin_ID (int m_memberkin_ID)
	{
		if (m_memberkin_ID < 1) 
			set_Value (COLUMNNAME_m_memberkin_ID, null);
		else 
			set_Value (COLUMNNAME_m_memberkin_ID, Integer.valueOf(m_memberkin_ID));
	}

	/** Get Next Of Kin.
		@return Next Of Kin	  */
	public int getm_memberkin_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_m_memberkin_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set First Name.
		@param mfirstname First Name	  */
	public void setmfirstname (String mfirstname)
	{
		set_Value (COLUMNNAME_mfirstname, mfirstname);
	}

	/** Get First Name.
		@return First Name	  */
	public String getmfirstname () 
	{
		return (String)get_Value(COLUMNNAME_mfirstname);
	}

	/** Set Middle Name.
		@param mothername Middle Name	  */
	public void setmothername (String mothername)
	{
		set_Value (COLUMNNAME_mothername, mothername);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getmothername () 
	{
		return (String)get_Value(COLUMNNAME_mothername);
	}

	/** Set Surname.
		@param msurname Surname	  */
	public void setmsurname (String msurname)
	{
		set_Value (COLUMNNAME_msurname, msurname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getmsurname () 
	{
		return (String)get_Value(COLUMNNAME_msurname);
	}

	/** Set Telephone #1.
		@param mtel1 Telephone #1	  */
	public void setmtel1 (String mtel1)
	{
		set_Value (COLUMNNAME_mtel1, mtel1);
	}

	/** Get Telephone #1.
		@return Telephone #1	  */
	public String getmtel1 () 
	{
		return (String)get_Value(COLUMNNAME_mtel1);
	}

	/** Set Next Of Kin.
		@param next_of_kin Next Of Kin	  */
	public void setnext_of_kin (String next_of_kin)
	{
		set_Value (COLUMNNAME_next_of_kin, next_of_kin);
	}

	/** Get Next Of Kin.
		@return Next Of Kin	  */
	public String getnext_of_kin () 
	{
		return (String)get_Value(COLUMNNAME_next_of_kin);
	}

	/** Set Other Employer.
		@param other_employer Other Employer	  */
	public void setother_employer (boolean other_employer)
	{
		set_Value (COLUMNNAME_other_employer, Boolean.valueOf(other_employer));
	}

	/** Get Other Employer.
		@return Other Employer	  */
	public boolean isother_employer () 
	{
		Object oo = get_Value(COLUMNNAME_other_employer);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Other Next Of Kin.
		@param other_next_of_kin Other Next Of Kin	  */
	public void setother_next_of_kin (boolean other_next_of_kin)
	{
		set_Value (COLUMNNAME_other_next_of_kin, Boolean.valueOf(other_next_of_kin));
	}

	/** Get Other Next Of Kin.
		@return Other Next Of Kin	  */
	public boolean isother_next_of_kin () 
	{
		Object oo = get_Value(COLUMNNAME_other_next_of_kin);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set s_change_req ID.
		@param s_change_req_ID s_change_req ID	  */
	public void sets_change_req_ID (int s_change_req_ID)
	{
		if (s_change_req_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_change_req_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_change_req_ID, Integer.valueOf(s_change_req_ID));
	}

	/** Get s_change_req ID.
		@return s_change_req ID	  */
	public int gets_change_req_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_change_req_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_department gets_department() throws RuntimeException
    {
		return (I_s_department)MTable.get(getCtx(), I_s_department.Table_Name)
			.getPO(gets_department_ID(), get_TrxName());	}

	/** Set Department.
		@param s_department_ID Department	  */
	public void sets_department_ID (int s_department_ID)
	{
		if (s_department_ID < 1) 
			set_Value (COLUMNNAME_s_department_ID, null);
		else 
			set_Value (COLUMNNAME_s_department_ID, Integer.valueOf(s_department_ID));
	}

	/** Get Department.
		@return Department	  */
	public int gets_department_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_department_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_employers gets_employers() throws RuntimeException
    {
		return (I_s_employers)MTable.get(getCtx(), I_s_employers.Table_Name)
			.getPO(gets_employers_ID(), get_TrxName());	}

	/** Set Employer.
		@param s_employers_ID Employer	  */
	public void sets_employers_ID (int s_employers_ID)
	{
		if (s_employers_ID < 1) 
			set_Value (COLUMNNAME_s_employers_ID, null);
		else 
			set_Value (COLUMNNAME_s_employers_ID, Integer.valueOf(s_employers_ID));
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

	public I_s_station gets_station() throws RuntimeException
    {
		return (I_s_station)MTable.get(getCtx(), I_s_station.Table_Name)
			.getPO(gets_station_ID(), get_TrxName());	}

	/** Set Station.
		@param s_station_ID Station	  */
	public void sets_station_ID (int s_station_ID)
	{
		if (s_station_ID < 1) 
			set_Value (COLUMNNAME_s_station_ID, null);
		else 
			set_Value (COLUMNNAME_s_station_ID, Integer.valueOf(s_station_ID));
	}

	/** Get Station.
		@return Station	  */
	public int gets_station_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_station_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Select Employer.
		@param select_employer Select Employer	  */
	public void setselect_employer (boolean select_employer)
	{
		set_Value (COLUMNNAME_select_employer, Boolean.valueOf(select_employer));
	}

	/** Get Select Employer.
		@return Select Employer	  */
	public boolean isselect_employer () 
	{
		Object oo = get_Value(COLUMNNAME_select_employer);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Select Next Of Kin.
		@param select_next_of_kin Select Next Of Kin	  */
	public void setselect_next_of_kin (boolean select_next_of_kin)
	{
		set_Value (COLUMNNAME_select_next_of_kin, Boolean.valueOf(select_next_of_kin));
	}

	/** Get Select Next Of Kin.
		@return Select Next Of Kin	  */
	public boolean isselect_next_of_kin () 
	{
		Object oo = get_Value(COLUMNNAME_select_next_of_kin);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Station.
		@param station Station	  */
	public void setstation (String station)
	{
		set_Value (COLUMNNAME_station, station);
	}

	/** Get Station.
		@return Station	  */
	public String getstation () 
	{
		return (String)get_Value(COLUMNNAME_station);
	}
}