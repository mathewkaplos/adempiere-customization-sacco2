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

/** Generated Interface for s_membershares
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
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

    /** Column name activation_count */
    public static final String COLUMNNAME_activation_count = "activation_count";

	/** Set Activation Count	  */
	public void setactivation_count (int activation_count);

	/** Get Activation Count	  */
	public int getactivation_count();

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

    /** Column name disp003 */
    public static final String COLUMNNAME_disp003 = "disp003";

	/** Set disp003	  */
	public void setdisp003 (boolean disp003);

	/** Get disp003	  */
	public boolean isdisp003();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

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

    /** Column name freeshares */
    public static final String COLUMNNAME_freeshares = "freeshares";

	/** Set Free Shares	  */
	public void setfreeshares (BigDecimal freeshares);

	/** Get Free Shares	  */
	public BigDecimal getfreeshares();

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

    /** Column name IsComplete */
    public static final String COLUMNNAME_IsComplete = "IsComplete";

	/** Set Complete.
	  * It is complete
	  */
	public void setIsComplete (boolean IsComplete);

	/** Get Complete.
	  * It is complete
	  */
	public boolean isComplete();

    /** Column name isfixeddeposit */
    public static final String COLUMNNAME_isfixeddeposit = "isfixeddeposit";

	/** Set Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit);

	/** Get Is Fixed Deposit	  */
	public boolean isfixeddeposit();

    /** Column name last_deposit_date */
    public static final String COLUMNNAME_last_deposit_date = "last_deposit_date";

	/** Set Last Deposit Date	  */
	public void setlast_deposit_date (Timestamp last_deposit_date);

	/** Get Last Deposit Date	  */
	public Timestamp getlast_deposit_date();

    /** Column name linked_to_dependants */
    public static final String COLUMNNAME_linked_to_dependants = "linked_to_dependants";

	/** Set Linked to Dependants/Next of kin	  */
	public void setlinked_to_dependants (boolean linked_to_dependants);

	/** Get Linked to Dependants/Next of kin	  */
	public boolean islinked_to_dependants();

    /** Column name member_no */
    public static final String COLUMNNAME_member_no = "member_no";

	/** Set Member NO	  */
	public void setmember_no (String member_no);

	/** Get Member NO	  */
	public String getmember_no();

    /** Column name member_userid */
    public static final String COLUMNNAME_member_userid = "member_userid";

	/** Set member_userid	  */
	public void setmember_userid (int member_userid);

	/** Get member_userid	  */
	public int getmember_userid();

    /** Column name m_memberkin_ID */
    public static final String COLUMNNAME_m_memberkin_ID = "m_memberkin_ID";

	/** Set Next Of Kin	  */
	public void setm_memberkin_ID (int m_memberkin_ID);

	/** Get Next Of Kin	  */
	public int getm_memberkin_ID();

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

    /** Column name Posted */
    public static final String COLUMNNAME_Posted = "Posted";

	/** Set Posted.
	  * Posting status
	  */
	public void setPosted (boolean Posted);

	/** Get Posted.
	  * Posting status
	  */
	public boolean isPosted();

    /** Column name prev_balance */
    public static final String COLUMNNAME_prev_balance = "prev_balance";

	/** Set Previous Balance	  */
	public void setprev_balance (BigDecimal prev_balance);

	/** Get Previous Balance	  */
	public BigDecimal getprev_balance();

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

    /** Column name s_payment_mode_ID */
    public static final String COLUMNNAME_s_payment_mode_ID = "s_payment_mode_ID";

	/** Set Payment Mode	  */
	public void sets_payment_mode_ID (int s_payment_mode_ID);

	/** Get Payment Mode	  */
	public int gets_payment_mode_ID();

	public I_s_payment_mode gets_payment_mode() throws RuntimeException;

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

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
}
