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
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_employers
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_employers 
{

    /** TableName=s_employers */
    public static final String Table_Name = "s_employers";

    /** AD_Table_ID=1000001 */
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

    /** Column name City */
    public static final String COLUMNNAME_City = "City";

	/** Set City.
	  * Identifies a City
	  */
	public void setCity (String City);

	/** Get City.
	  * Identifies a City
	  */
	public String getCity();

    /** Column name country */
    public static final String COLUMNNAME_country = "country";

	/** Set country	  */
	public void setcountry (String country);

	/** Get country	  */
	public String getcountry();

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

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

    /** Column name disp002 */
    public static final String COLUMNNAME_disp002 = "disp002";

	/** Set disp002	  */
	public void setdisp002 (boolean disp002);

	/** Get disp002	  */
	public boolean isdisp002();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name empcode */
    public static final String COLUMNNAME_empcode = "empcode";

	/** Set Code #	  */
	public void setempcode (String empcode);

	/** Get Code #	  */
	public String getempcode();

    /** Column name employer */
    public static final String COLUMNNAME_employer = "employer";

	/** Set Description	  */
	public void setemployer (String employer);

	/** Get Description	  */
	public String getemployer();

    /** Column name Fax */
    public static final String COLUMNNAME_Fax = "Fax";

	/** Set Fax.
	  * Facsimile number
	  */
	public void setFax (String Fax);

	/** Get Fax.
	  * Facsimile number
	  */
	public String getFax();

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

    /** Column name mobile */
    public static final String COLUMNNAME_mobile = "mobile";

	/** Set Telephone #2	  */
	public void setmobile (String mobile);

	/** Get Telephone #2	  */
	public String getmobile();

    /** Column name pinno */
    public static final String COLUMNNAME_pinno = "pinno";

	/** Set Cell Number	  */
	public void setpinno (String pinno);

	/** Get Cell Number	  */
	public String getpinno();

    /** Column name postalcode */
    public static final String COLUMNNAME_postalcode = "postalcode";

	/** Set Postal Address	  */
	public void setpostalcode (String postalcode);

	/** Get Postal Address	  */
	public String getpostalcode();

    /** Column name province */
    public static final String COLUMNNAME_province = "province";

	/** Set province	  */
	public void setprovince (String province);

	/** Get province	  */
	public String getprovince();

    /** Column name s_employers_ID */
    public static final String COLUMNNAME_s_employers_ID = "s_employers_ID";

	/** Set Employer	  */
	public void sets_employers_ID (int s_employers_ID);

	/** Get Employer	  */
	public int gets_employers_ID();

    /** Column name street */
    public static final String COLUMNNAME_street = "street";

	/** Set street	  */
	public void setstreet (String street);

	/** Get street	  */
	public String getstreet();

    /** Column name telephone */
    public static final String COLUMNNAME_telephone = "telephone";

	/** Set Telephone #1	  */
	public void settelephone (String telephone);

	/** Get Telephone #1	  */
	public String gettelephone();

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

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();
}
