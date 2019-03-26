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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_change_req
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_change_req 
{

    /** TableName=s_change_req */
    public static final String Table_Name = "s_change_req";

    /** AD_Table_ID=1000065 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name address */
    public static final String COLUMNNAME_address = "address";

	/** Set Physical Address	  */
	public void setaddress (String address);

	/** Get Physical Address	  */
	public String getaddress();

    /** Column name bankaccno */
    public static final String COLUMNNAME_bankaccno = "bankaccno";

	/** Set Bank Account No.	  */
	public void setbankaccno (String bankaccno);

	/** Get Bank Account No.	  */
	public String getbankaccno();

    /** Column name btn_save */
    public static final String COLUMNNAME_btn_save = "btn_save";

	/** Set Save	  */
	public void setbtn_save (String btn_save);

	/** Get Save	  */
	public String getbtn_save();

    /** Column name btn_update */
    public static final String COLUMNNAME_btn_update = "btn_update";

	/** Set Update	  */
	public void setbtn_update (String btn_update);

	/** Get Update	  */
	public String getbtn_update();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name department */
    public static final String COLUMNNAME_department = "department";

	/** Set Department	  */
	public void setdepartment (String department);

	/** Get Department	  */
	public String getdepartment();

    /** Column name employer */
    public static final String COLUMNNAME_employer = "employer";

	/** Set Employer	  */
	public void setemployer (String employer);

	/** Get Employer	  */
	public String getemployer();

    /** Column name is_updated */
    public static final String COLUMNNAME_is_updated = "is_updated";

	/** Set Is Updated	  */
	public void setis_updated (boolean is_updated);

	/** Get Is Updated	  */
	public boolean is_updated();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name m_memberkin_ID */
    public static final String COLUMNNAME_m_memberkin_ID = "m_memberkin_ID";

	/** Set Next Of Kin	  */
	public void setm_memberkin_ID (int m_memberkin_ID);

	/** Get Next Of Kin	  */
	public int getm_memberkin_ID();

    /** Column name mfirstname */
    public static final String COLUMNNAME_mfirstname = "mfirstname";

	/** Set First Name	  */
	public void setmfirstname (String mfirstname);

	/** Get First Name	  */
	public String getmfirstname();

    /** Column name mothername */
    public static final String COLUMNNAME_mothername = "mothername";

	/** Set Middle Name	  */
	public void setmothername (String mothername);

	/** Get Middle Name	  */
	public String getmothername();

    /** Column name msurname */
    public static final String COLUMNNAME_msurname = "msurname";

	/** Set Surname	  */
	public void setmsurname (String msurname);

	/** Get Surname	  */
	public String getmsurname();

    /** Column name mtel1 */
    public static final String COLUMNNAME_mtel1 = "mtel1";

	/** Set Telephone #1	  */
	public void setmtel1 (String mtel1);

	/** Get Telephone #1	  */
	public String getmtel1();

    /** Column name next_of_kin */
    public static final String COLUMNNAME_next_of_kin = "next_of_kin";

	/** Set Next Of Kin	  */
	public void setnext_of_kin (String next_of_kin);

	/** Get Next Of Kin	  */
	public String getnext_of_kin();

    /** Column name other_employer */
    public static final String COLUMNNAME_other_employer = "other_employer";

	/** Set Other Employer	  */
	public void setother_employer (boolean other_employer);

	/** Get Other Employer	  */
	public boolean isother_employer();

    /** Column name other_next_of_kin */
    public static final String COLUMNNAME_other_next_of_kin = "other_next_of_kin";

	/** Set Other Next Of Kin	  */
	public void setother_next_of_kin (boolean other_next_of_kin);

	/** Get Other Next Of Kin	  */
	public boolean isother_next_of_kin();

    /** Column name s_change_req_ID */
    public static final String COLUMNNAME_s_change_req_ID = "s_change_req_ID";

	/** Set s_change_req ID	  */
	public void sets_change_req_ID (int s_change_req_ID);

	/** Get s_change_req ID	  */
	public int gets_change_req_ID();

    /** Column name s_department_ID */
    public static final String COLUMNNAME_s_department_ID = "s_department_ID";

	/** Set Department	  */
	public void sets_department_ID (int s_department_ID);

	/** Get Department	  */
	public int gets_department_ID();

	public I_s_department gets_department() throws RuntimeException;

    /** Column name s_employers_ID */
    public static final String COLUMNNAME_s_employers_ID = "s_employers_ID";

	/** Set Employer	  */
	public void sets_employers_ID (int s_employers_ID);

	/** Get Employer	  */
	public int gets_employers_ID();

	public I_s_employers gets_employers() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_station_ID */
    public static final String COLUMNNAME_s_station_ID = "s_station_ID";

	/** Set Station	  */
	public void sets_station_ID (int s_station_ID);

	/** Get Station	  */
	public int gets_station_ID();

	public I_s_station gets_station() throws RuntimeException;

    /** Column name select_employer */
    public static final String COLUMNNAME_select_employer = "select_employer";

	/** Set Select Employer	  */
	public void setselect_employer (boolean select_employer);

	/** Get Select Employer	  */
	public boolean isselect_employer();

    /** Column name select_next_of_kin */
    public static final String COLUMNNAME_select_next_of_kin = "select_next_of_kin";

	/** Set Select Next Of Kin	  */
	public void setselect_next_of_kin (boolean select_next_of_kin);

	/** Get Select Next Of Kin	  */
	public boolean isselect_next_of_kin();

    /** Column name station */
    public static final String COLUMNNAME_station = "station";

	/** Set Station	  */
	public void setstation (String station);

	/** Get Station	  */
	public String getstation();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
