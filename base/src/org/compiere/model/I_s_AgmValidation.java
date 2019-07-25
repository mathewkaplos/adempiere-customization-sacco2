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

/** Generated Interface for s_AgmValidation
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_s_AgmValidation 
{

    /** TableName=s_AgmValidation */
    public static final String Table_Name = "s_AgmValidation";

    /** AD_Table_ID=1000084 */
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

    /** Column name AgmDate */
    public static final String COLUMNNAME_AgmDate = "AgmDate";

	/** Set Agm Date	  */
	public void setAgmDate (Timestamp AgmDate);

	/** Get Agm Date	  */
	public Timestamp getAgmDate();

    /** Column name AgmMonth */
    public static final String COLUMNNAME_AgmMonth = "AgmMonth";

	/** Set Agm Month	  */
	public void setAgmMonth (int AgmMonth);

	/** Get Agm Month	  */
	public int getAgmMonth();

    /** Column name AgmYear */
    public static final String COLUMNNAME_AgmYear = "AgmYear";

	/** Set Agm Year	  */
	public void setAgmYear (int AgmYear);

	/** Get Agm Year	  */
	public int getAgmYear();

    /** Column name Amt */
    public static final String COLUMNNAME_Amt = "Amt";

	/** Set Amount.
	  * Amount
	  */
	public void setAmt (BigDecimal Amt);

	/** Get Amount.
	  * Amount
	  */
	public BigDecimal getAmt();

    /** Column name Attendanceno */
    public static final String COLUMNNAME_Attendanceno = "Attendanceno";

	/** Set Attendance No	  */
	public void setAttendanceno (String Attendanceno);

	/** Get Attendance No	  */
	public String getAttendanceno();

    /** Column name Balance */
    public static final String COLUMNNAME_Balance = "Balance";

	/** Set Balance	  */
	public void setBalance (BigDecimal Balance);

	/** Get Balance	  */
	public BigDecimal getBalance();

    /** Column name btn_print_attendance_list */
    public static final String COLUMNNAME_btn_print_attendance_list = "btn_print_attendance_list";

	/** Set Print Attendance List	  */
	public void setbtn_print_attendance_list (String btn_print_attendance_list);

	/** Get Print Attendance List	  */
	public String getbtn_print_attendance_list();

    /** Column name btn_print_invatation_card */
    public static final String COLUMNNAME_btn_print_invatation_card = "btn_print_invatation_card";

	/** Set Print Invitation Card	  */
	public void setbtn_print_invatation_card (String btn_print_invatation_card);

	/** Get Print Invitation Card	  */
	public String getbtn_print_invatation_card();

    /** Column name btn_validate */
    public static final String COLUMNNAME_btn_validate = "btn_validate";

	/** Set VALIDATE	  */
	public void setbtn_validate (String btn_validate);

	/** Get VALIDATE	  */
	public String getbtn_validate();

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

    /** Column name mcode */
    public static final String COLUMNNAME_mcode = "mcode";

	/** Set Member #	  */
	public void setmcode (String mcode);

	/** Get Member #	  */
	public String getmcode();

    /** Column name s_AgmInvitation_ID */
    public static final String COLUMNNAME_s_AgmInvitation_ID = "s_AgmInvitation_ID";

	/** Set s_AgmInvitation ID	  */
	public void sets_AgmInvitation_ID (int s_AgmInvitation_ID);

	/** Get s_AgmInvitation ID	  */
	public int gets_AgmInvitation_ID();

    /** Column name s_AgmValidation_ID */
    public static final String COLUMNNAME_s_AgmValidation_ID = "s_AgmValidation_ID";

	/** Set s_AgmValidation ID	  */
	public void sets_AgmValidation_ID (int s_AgmValidation_ID);

	/** Get s_AgmValidation ID	  */
	public int gets_AgmValidation_ID();

    /** Column name sharecode */
    public static final String COLUMNNAME_sharecode = "sharecode";

	/** Set Share Code / Ref #	  */
	public void setsharecode (String sharecode);

	/** Get Share Code / Ref #	  */
	public String getsharecode();

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

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

    /** Column name UserName */
    public static final String COLUMNNAME_UserName = "UserName";

	/** Set Staff User Name.
	  * Email of the responsible for the System
	  */
	public void setUserName (String UserName);

	/** Get Staff User Name.
	  * Email of the responsible for the System
	  */
	public String getUserName();

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

    /** Column name validated */
    public static final String COLUMNNAME_validated = "validated";

	/** Set Validated	  */
	public void setvalidated (boolean validated);

	/** Get Validated	  */
	public boolean isvalidated();

    /** Column name validated_on */
    public static final String COLUMNNAME_validated_on = "validated_on";

	/** Set Validated On	  */
	public void setvalidated_on (Timestamp validated_on);

	/** Get Validated On	  */
	public Timestamp getvalidated_on();

    /** Column name validShares */
    public static final String COLUMNNAME_validShares = "validShares";

	/** Set Valid Shares	  */
	public void setvalidShares (BigDecimal validShares);

	/** Get Valid Shares	  */
	public BigDecimal getvalidShares();
}
