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

/** Generated Interface for s_membershares
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_membershares 
{

    /** TableName=s_membershares */
    public static final String Table_Name = "s_membershares";

    /** AD_Table_ID=1000014 */
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

    /** Column name affectsdr */
    public static final String COLUMNNAME_affectsdr = "affectsdr";

	/** Set Affects DR	  */
	public void setaffectsdr (boolean affectsdr);

	/** Get Affects DR	  */
	public boolean isaffectsdr();

    /** Column name contributionrate */
    public static final String COLUMNNAME_contributionrate = "contributionrate";

	/** Set Contribution Rate	  */
	public void setcontributionrate (BigDecimal contributionrate);

	/** Get Contribution Rate	  */
	public BigDecimal getcontributionrate();

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

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name interesttodate */
    public static final String COLUMNNAME_interesttodate = "interesttodate";

	/** Set Interest To Date	  */
	public void setinteresttodate (BigDecimal interesttodate);

	/** Get Interest To Date	  */
	public BigDecimal getinteresttodate();

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

    /** Column name isfixeddeposit */
    public static final String COLUMNNAME_isfixeddeposit = "isfixeddeposit";

	/** Set Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit);

	/** Get Is Fixed Deposit	  */
	public boolean isfixeddeposit();

    /** Column name member_no */
    public static final String COLUMNNAME_member_no = "member_no";

	/** Set Member NO	  */
	public void setmember_no (String member_no);

	/** Get Member NO	  */
	public String getmember_no();

    /** Column name monthclosingbal */
    public static final String COLUMNNAME_monthclosingbal = "monthclosingbal";

	/** Set Month Closing Balance	  */
	public void setmonthclosingbal (BigDecimal monthclosingbal);

	/** Get Month Closing Balance	  */
	public BigDecimal getmonthclosingbal();

    /** Column name montheffectdate */
    public static final String COLUMNNAME_montheffectdate = "montheffectdate";

	/** Set Month Effect Date	  */
	public void setmontheffectdate (Timestamp montheffectdate);

	/** Get Month Effect Date	  */
	public Timestamp getmontheffectdate();

    /** Column name newcontribution */
    public static final String COLUMNNAME_newcontribution = "newcontribution";

	/** Set New Contribution	  */
	public void setnewcontribution (BigDecimal newcontribution);

	/** Get New Contribution	  */
	public BigDecimal getnewcontribution();

    /** Column name openingshares */
    public static final String COLUMNNAME_openingshares = "openingshares";

	/** Set Opening Shares	  */
	public void setopeningshares (BigDecimal openingshares);

	/** Get Opening Shares	  */
	public BigDecimal getopeningshares();

    /** Column name paymode */
    public static final String COLUMNNAME_paymode = "paymode";

	/** Set Pay Mode	  */
	public void setpaymode (String paymode);

	/** Get Pay Mode	  */
	public String getpaymode();

    /** Column name payroll_no */
    public static final String COLUMNNAME_payroll_no = "payroll_no";

	/** Set Payroll NO	  */
	public void setpayroll_no (String payroll_no);

	/** Get Payroll NO	  */
	public String getpayroll_no();

    /** Column name refrence */
    public static final String COLUMNNAME_refrence = "refrence";

	/** Set Refrence	  */
	public void setrefrence (String refrence);

	/** Get Refrence	  */
	public String getrefrence();

    /** Column name s_branch_ID */
    public static final String COLUMNNAME_s_branch_ID = "s_branch_ID";

	/** Set Member Branch	  */
	public void sets_branch_ID (int s_branch_ID);

	/** Get Member Branch	  */
	public int gets_branch_ID();

	public I_s_branch gets_branch() throws RuntimeException;

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

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

    /** Column name share_code */
    public static final String COLUMNNAME_share_code = "share_code";

	/** Set Share Code	  */
	public void setshare_code (String share_code);

	/** Get Share Code	  */
	public String getshare_code();

    /** Column name sharedate */
    public static final String COLUMNNAME_sharedate = "sharedate";

	/** Set Share Date	  */
	public void setsharedate (Timestamp sharedate);

	/** Get Share Date	  */
	public Timestamp getsharedate();

    /** Column name shareeffectdate */
    public static final String COLUMNNAME_shareeffectdate = "shareeffectdate";

	/** Set Share Effect Date	  */
	public void setshareeffectdate (Timestamp shareeffectdate);

	/** Get Share Effect Date	  */
	public Timestamp getshareeffectdate();

    /** Column name shareid */
    public static final String COLUMNNAME_shareid = "shareid";

	/** Set shareid	  */
	public void setshareid (int shareid);

	/** Get shareid	  */
	public int getshareid();

    /** Column name sharemonthbal */
    public static final String COLUMNNAME_sharemonthbal = "sharemonthbal";

	/** Set Share Month Bal	  */
	public void setsharemonthbal (BigDecimal sharemonthbal);

	/** Get Share Month Bal	  */
	public BigDecimal getsharemonthbal();

    /** Column name sharestodate */
    public static final String COLUMNNAME_sharestodate = "sharestodate";

	/** Set Shares To Date	  */
	public void setsharestodate (BigDecimal sharestodate);

	/** Get Shares To Date	  */
	public BigDecimal getsharestodate();

    /** Column name sharetodateinwords */
    public static final String COLUMNNAME_sharetodateinwords = "sharetodateinwords";

	/** Set Shares To Date In Words	  */
	public void setsharetodateinwords (String sharetodateinwords);

	/** Get Shares To Date In Words	  */
	public String getsharetodateinwords();

    /** Column name statementbal */
    public static final String COLUMNNAME_statementbal = "statementbal";

	/** Set Statement Balance	  */
	public void setstatementbal (BigDecimal statementbal);

	/** Get Statement Balance	  */
	public BigDecimal getstatementbal();

    /** Column name tiedshares */
    public static final String COLUMNNAME_tiedshares = "tiedshares";

	/** Set Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares);

	/** Get Tied Shares	  */
	public BigDecimal gettiedshares();

    /** Column name transactionperiod */
    public static final String COLUMNNAME_transactionperiod = "transactionperiod";

	/** Set Transaction Period	  */
	public void settransactionperiod (int transactionperiod);

	/** Get Transaction Period	  */
	public int gettransactionperiod();

    /** Column name transactionyear */
    public static final String COLUMNNAME_transactionyear = "transactionyear";

	/** Set Transaction Year	  */
	public void settransactionyear (int transactionyear);

	/** Get Transaction Year	  */
	public int gettransactionyear();

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
