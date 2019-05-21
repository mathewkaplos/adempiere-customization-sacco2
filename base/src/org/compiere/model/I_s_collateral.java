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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_collateral
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_s_collateral 
{

    /** TableName=s_collateral */
    public static final String Table_Name = "s_collateral";

    /** AD_Table_ID=1000071 */
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

    /** Column name DateValue */
    public static final String COLUMNNAME_DateValue = "DateValue";

	/** Set Valuation Date.
	  * Date of valuation
	  */
	public void setDateValue (Timestamp DateValue);

	/** Get Valuation Date.
	  * Date of valuation
	  */
	public Timestamp getDateValue();

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

    /** Column name location_of_owner_doc */
    public static final String COLUMNNAME_location_of_owner_doc = "location_of_owner_doc";

	/** Set Location Of Owner Document	  */
	public void setlocation_of_owner_doc (String location_of_owner_doc);

	/** Get Location Of Owner Document	  */
	public String getlocation_of_owner_doc();

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

    /** Column name owner */
    public static final String COLUMNNAME_owner = "owner";

	/** Set Owner	  */
	public void setowner (String owner);

	/** Get Owner	  */
	public String getowner();

    /** Column name owner_document */
    public static final String COLUMNNAME_owner_document = "owner_document";

	/** Set Owner Document	  */
	public void setowner_document (String owner_document);

	/** Get Owner Document	  */
	public String getowner_document();

    /** Column name Remarks */
    public static final String COLUMNNAME_Remarks = "Remarks";

	/** Set Remarks.
	  * Remarks
	  */
	public void setRemarks (String Remarks);

	/** Get Remarks.
	  * Remarks
	  */
	public String getRemarks();

    /** Column name s_collateral_ID */
    public static final String COLUMNNAME_s_collateral_ID = "s_collateral_ID";

	/** Set s_collateral ID	  */
	public void sets_collateral_ID (int s_collateral_ID);

	/** Get s_collateral ID	  */
	public int gets_collateral_ID();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

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

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name ValueNumber */
    public static final String COLUMNNAME_ValueNumber = "ValueNumber";

	/** Set Value.
	  * Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber);

	/** Get Value.
	  * Numeric Value
	  */
	public BigDecimal getValueNumber();
}
