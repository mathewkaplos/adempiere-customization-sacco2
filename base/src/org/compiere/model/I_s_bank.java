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

/** Generated Interface for s_bank
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_bank 
{

    /** TableName=s_bank */
    public static final String Table_Name = "s_bank";

    /** AD_Table_ID=1000009 */
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

    /** Column name bankaddress */
    public static final String COLUMNNAME_bankaddress = "bankaddress";

	/** Set bankaddress	  */
	public void setbankaddress (String bankaddress);

	/** Get bankaddress	  */
	public String getbankaddress();

    /** Column name bankcode */
    public static final String COLUMNNAME_bankcode = "bankcode";

	/** Set bankcode	  */
	public void setbankcode (String bankcode);

	/** Get bankcode	  */
	public String getbankcode();

    /** Column name bankcountry */
    public static final String COLUMNNAME_bankcountry = "bankcountry";

	/** Set bankcountry	  */
	public void setbankcountry (String bankcountry);

	/** Get bankcountry	  */
	public String getbankcountry();

    /** Column name bankentrydate */
    public static final String COLUMNNAME_bankentrydate = "bankentrydate";

	/** Set bankentrydate	  */
	public void setbankentrydate (Timestamp bankentrydate);

	/** Get bankentrydate	  */
	public Timestamp getbankentrydate();

    /** Column name bankfax */
    public static final String COLUMNNAME_bankfax = "bankfax";

	/** Set bankfax	  */
	public void setbankfax (String bankfax);

	/** Get bankfax	  */
	public String getbankfax();

    /** Column name bankgl_Acct */
    public static final String COLUMNNAME_bankgl_Acct = "bankgl_Acct";

	/** Set Bank GL Code	  */
	public void setbankgl_Acct (String bankgl_Acct);

	/** Get Bank GL Code	  */
	public String getbankgl_Acct();

    /** Column name bankmanager */
    public static final String COLUMNNAME_bankmanager = "bankmanager";

	/** Set bankmanager	  */
	public void setbankmanager (String bankmanager);

	/** Get bankmanager	  */
	public String getbankmanager();

    /** Column name bankpostaladdress */
    public static final String COLUMNNAME_bankpostaladdress = "bankpostaladdress";

	/** Set bankpostaladdress	  */
	public void setbankpostaladdress (String bankpostaladdress);

	/** Get bankpostaladdress	  */
	public String getbankpostaladdress();

    /** Column name bankpostalcode */
    public static final String COLUMNNAME_bankpostalcode = "bankpostalcode";

	/** Set bankpostalcode	  */
	public void setbankpostalcode (String bankpostalcode);

	/** Get bankpostalcode	  */
	public String getbankpostalcode();

    /** Column name bankrefcode */
    public static final String COLUMNNAME_bankrefcode = "bankrefcode";

	/** Set bankrefcode	  */
	public void setbankrefcode (String bankrefcode);

	/** Get bankrefcode	  */
	public String getbankrefcode();

    /** Column name banktel1 */
    public static final String COLUMNNAME_banktel1 = "banktel1";

	/** Set banktel1	  */
	public void setbanktel1 (String banktel1);

	/** Get banktel1	  */
	public String getbanktel1();

    /** Column name banktel2 */
    public static final String COLUMNNAME_banktel2 = "banktel2";

	/** Set banktel2	  */
	public void setbanktel2 (String banktel2);

	/** Get banktel2	  */
	public String getbanktel2();

    /** Column name banktel3 */
    public static final String COLUMNNAME_banktel3 = "banktel3";

	/** Set banktel3	  */
	public void setbanktel3 (String banktel3);

	/** Get banktel3	  */
	public String getbanktel3();

    /** Column name banktel4 */
    public static final String COLUMNNAME_banktel4 = "banktel4";

	/** Set banktel4	  */
	public void setbanktel4 (String banktel4);

	/** Get banktel4	  */
	public String getbanktel4();

    /** Column name BranchID */
    public static final String COLUMNNAME_BranchID = "BranchID";

	/** Set Branch ID.
	  * Bank Branch ID
	  */
	public void setBranchID (int BranchID);

	/** Get Branch ID.
	  * Bank Branch ID
	  */
	public int getBranchID();

    /** Column name branchname */
    public static final String COLUMNNAME_branchname = "branchname";

	/** Set Branch Name	  */
	public void setbranchname (String branchname);

	/** Get Branch Name	  */
	public String getbranchname();

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

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

    /** Column name curyearbalance */
    public static final String COLUMNNAME_curyearbalance = "curyearbalance";

	/** Set curyearbalance	  */
	public void setcuryearbalance (BigDecimal curyearbalance);

	/** Get curyearbalance	  */
	public BigDecimal getcuryearbalance();

    /** Column name cyb */
    public static final String COLUMNNAME_cyb = "cyb";

	/** Set cyb	  */
	public void setcyb (BigDecimal cyb);

	/** Get cyb	  */
	public BigDecimal getcyb();

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

    /** Column name groupid */
    public static final String COLUMNNAME_groupid = "groupid";

	/** Set groupid	  */
	public void setgroupid (String groupid);

	/** Get groupid	  */
	public String getgroupid();

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

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name prevyearbalance */
    public static final String COLUMNNAME_prevyearbalance = "prevyearbalance";

	/** Set prevyearbalance	  */
	public void setprevyearbalance (BigDecimal prevyearbalance);

	/** Get prevyearbalance	  */
	public BigDecimal getprevyearbalance();

    /** Column name pyb */
    public static final String COLUMNNAME_pyb = "pyb";

	/** Set pyb	  */
	public void setpyb (BigDecimal pyb);

	/** Get pyb	  */
	public BigDecimal getpyb();

    /** Column name s_bank_ID */
    public static final String COLUMNNAME_s_bank_ID = "s_bank_ID";

	/** Set s_bank ID	  */
	public void sets_bank_ID (int s_bank_ID);

	/** Get s_bank ID	  */
	public int gets_bank_ID();

    /** Column name type_ */
    public static final String COLUMNNAME_type_ = "type_";

	/** Set type_	  */
	public void settype_ (String type_);

	/** Get type_	  */
	public String gettype_();

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
