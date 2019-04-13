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

/** Generated Interface for s_loanguantordetails
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_loanguantordetails 
{

    /** TableName=s_loanguantordetails */
    public static final String Table_Name = "s_loanguantordetails";

    /** AD_Table_ID=1000019 */
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

    /** Column name amountguaranteed */
    public static final String COLUMNNAME_amountguaranteed = "amountguaranteed";

	/** Set Amount Guaranteed	  */
	public void setamountguaranteed (BigDecimal amountguaranteed);

	/** Get Amount Guaranteed	  */
	public BigDecimal getamountguaranteed();

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

    /** Column name id */
    public static final String COLUMNNAME_id = "id";

	/** Set id	  */
	public void setid (int id);

	/** Get id	  */
	public int getid();

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

    /** Column name loan_approved */
    public static final String COLUMNNAME_loan_approved = "loan_approved";

	/** Set Loan Approved	  */
	public void setloan_approved (boolean loan_approved);

	/** Get Loan Approved	  */
	public boolean isloan_approved();

    /** Column name loan_rejected */
    public static final String COLUMNNAME_loan_rejected = "loan_rejected";

	/** Set Loan Rejected	  */
	public void setloan_rejected (boolean loan_rejected);

	/** Get Loan Rejected	  */
	public boolean isloan_rejected();

    /** Column name member_no */
    public static final String COLUMNNAME_member_no = "member_no";

	/** Set Member NO	  */
	public void setmember_no (String member_no);

	/** Get Member NO	  */
	public String getmember_no();

    /** Column name mpayroll */
    public static final String COLUMNNAME_mpayroll = "mpayroll";

	/** Set Payroll #	  */
	public void setmpayroll (String mpayroll);

	/** Get Payroll #	  */
	public String getmpayroll();

    /** Column name proportion */
    public static final String COLUMNNAME_proportion = "proportion";

	/** Set Proportion	  */
	public void setproportion (BigDecimal proportion);

	/** Get Proportion	  */
	public BigDecimal getproportion();

    /** Column name s_loanguantordetails_ID */
    public static final String COLUMNNAME_s_loanguantordetails_ID = "s_loanguantordetails_ID";

	/** Set s_loanguantordetails ID	  */
	public void sets_loanguantordetails_ID (int s_loanguantordetails_ID);

	/** Get s_loanguantordetails ID	  */
	public int gets_loanguantordetails_ID();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_membershares_ID */
    public static final String COLUMNNAME_s_membershares_ID = "s_membershares_ID";

	/** Set Member Shares	  */
	public void sets_membershares_ID (int s_membershares_ID);

	/** Get Member Shares	  */
	public int gets_membershares_ID();

	public I_s_membershares gets_membershares() throws RuntimeException;

    /** Column name tiedshares */
    public static final String COLUMNNAME_tiedshares = "tiedshares";

	/** Set Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares);

	/** Get Tied Shares	  */
	public BigDecimal gettiedshares();

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
