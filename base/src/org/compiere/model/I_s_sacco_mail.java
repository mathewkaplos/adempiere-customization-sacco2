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

/** Generated Interface for s_sacco_mail
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_sacco_mail 
{

    /** TableName=s_sacco_mail */
    public static final String Table_Name = "s_sacco_mail";

    /** AD_Table_ID=1000022 */
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

    /** Column name Password */
    public static final String COLUMNNAME_Password = "Password";

	/** Set Password.
	  * Password of any length (case sensitive)
	  */
	public void setPassword (String Password);

	/** Get Password.
	  * Password of any length (case sensitive)
	  */
	public String getPassword();

    /** Column name s_sacco_mail_ID */
    public static final String COLUMNNAME_s_sacco_mail_ID = "s_sacco_mail_ID";

	/** Set s_sacco_mail ID	  */
	public void sets_sacco_mail_ID (int s_sacco_mail_ID);

	/** Get s_sacco_mail ID	  */
	public int gets_sacco_mail_ID();

    /** Column name smtp_auth */
    public static final String COLUMNNAME_smtp_auth = "smtp_auth";

	/** Set SMTP Authenticate	  */
	public void setsmtp_auth (boolean smtp_auth);

	/** Get SMTP Authenticate	  */
	public boolean issmtp_auth();

    /** Column name smtp_host */
    public static final String COLUMNNAME_smtp_host = "smtp_host";

	/** Set SMTP HOST	  */
	public void setsmtp_host (String smtp_host);

	/** Get SMTP HOST	  */
	public String getsmtp_host();

    /** Column name smtp_port */
    public static final String COLUMNNAME_smtp_port = "smtp_port";

	/** Set SMTP PORT	  */
	public void setsmtp_port (int smtp_port);

	/** Get SMTP PORT	  */
	public int getsmtp_port();

    /** Column name smtp_socketfactory_port */
    public static final String COLUMNNAME_smtp_socketfactory_port = "smtp_socketfactory_port";

	/** Set SMTP Socket Port	  */
	public void setsmtp_socketfactory_port (int smtp_socketfactory_port);

	/** Get SMTP Socket Port	  */
	public int getsmtp_socketfactory_port();

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
