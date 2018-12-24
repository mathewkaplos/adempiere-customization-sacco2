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

/** Generated Interface for s_branch
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_branch 
{

    /** TableName=s_branch */
    public static final String Table_Name = "s_branch";

    /** AD_Table_ID=1000012 */
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

    /** Column name branchaddress */
    public static final String COLUMNNAME_branchaddress = "branchaddress";

	/** Set Physical Location	  */
	public void setbranchaddress (String branchaddress);

	/** Get Physical Location	  */
	public String getbranchaddress();

    /** Column name branchcity */
    public static final String COLUMNNAME_branchcity = "branchcity";

	/** Set City/Town	  */
	public void setbranchcity (String branchcity);

	/** Get City/Town	  */
	public String getbranchcity();

    /** Column name branchcode */
    public static final String COLUMNNAME_branchcode = "branchcode";

	/** Set Ref # / Code:	  */
	public void setbranchcode (String branchcode);

	/** Get Ref # / Code:	  */
	public String getbranchcode();

    /** Column name branchcontactperson */
    public static final String COLUMNNAME_branchcontactperson = "branchcontactperson";

	/** Set Branch Contact Person	  */
	public void setbranchcontactperson (String branchcontactperson);

	/** Get Branch Contact Person	  */
	public String getbranchcontactperson();

    /** Column name branchcountry */
    public static final String COLUMNNAME_branchcountry = "branchcountry";

	/** Set Country:	  */
	public void setbranchcountry (String branchcountry);

	/** Get Country:	  */
	public String getbranchcountry();

    /** Column name branchname */
    public static final String COLUMNNAME_branchname = "branchname";

	/** Set Branch Name	  */
	public void setbranchname (String branchname);

	/** Get Branch Name	  */
	public String getbranchname();

    /** Column name branchpobox */
    public static final String COLUMNNAME_branchpobox = "branchpobox";

	/** Set P.O Box #	  */
	public void setbranchpobox (String branchpobox);

	/** Get P.O Box #	  */
	public String getbranchpobox();

    /** Column name branchpostalcode */
    public static final String COLUMNNAME_branchpostalcode = "branchpostalcode";

	/** Set Postal Code:	  */
	public void setbranchpostalcode (String branchpostalcode);

	/** Get Postal Code:	  */
	public String getbranchpostalcode();

    /** Column name branchrefcode */
    public static final String COLUMNNAME_branchrefcode = "branchrefcode";

	/** Set branchrefcode	  */
	public void setbranchrefcode (String branchrefcode);

	/** Get branchrefcode	  */
	public String getbranchrefcode();

    /** Column name branchtel1 */
    public static final String COLUMNNAME_branchtel1 = "branchtel1";

	/** Set Tel # 1	  */
	public void setbranchtel1 (String branchtel1);

	/** Get Tel # 1	  */
	public String getbranchtel1();

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

    /** Column name iscostcenter */
    public static final String COLUMNNAME_iscostcenter = "iscostcenter";

	/** Set Is Costcenter	  */
	public void setiscostcenter (boolean iscostcenter);

	/** Get Is Costcenter	  */
	public boolean iscostcenter();

    /** Column name s_branch_ID */
    public static final String COLUMNNAME_s_branch_ID = "s_branch_ID";

	/** Set Member Branch	  */
	public void sets_branch_ID (int s_branch_ID);

	/** Get Member Branch	  */
	public int gets_branch_ID();

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
