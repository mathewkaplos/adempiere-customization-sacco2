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

/** Generated Interface for s_share_tranfer
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_share_tranfer 
{

    /** TableName=s_share_tranfer */
    public static final String Table_Name = "s_share_tranfer";

    /** AD_Table_ID=1000046 */
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

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name btn_tranfer */
    public static final String COLUMNNAME_btn_tranfer = "btn_tranfer";

	/** Set Tranfer	  */
	public void setbtn_tranfer (String btn_tranfer);

	/** Get Tranfer	  */
	public String getbtn_tranfer();

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

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name s_member_receiver_ID */
    public static final String COLUMNNAME_s_member_receiver_ID = "s_member_receiver_ID";

	/** Set Recepient	  */
	public void sets_member_receiver_ID (int s_member_receiver_ID);

	/** Get Recepient	  */
	public int gets_member_receiver_ID();

	public I_s_member gets_member_receiver() throws RuntimeException;

    /** Column name s_member_sender_ID */
    public static final String COLUMNNAME_s_member_sender_ID = "s_member_sender_ID";

	/** Set Transferor	  */
	public void sets_member_sender_ID (int s_member_sender_ID);

	/** Get Transferor	  */
	public int gets_member_sender_ID();

	public I_s_member gets_member_sender() throws RuntimeException;

    /** Column name s_membershares_receiver_ID */
    public static final String COLUMNNAME_s_membershares_receiver_ID = "s_membershares_receiver_ID";

	/** Set Recepient Account	  */
	public void sets_membershares_receiver_ID (int s_membershares_receiver_ID);

	/** Get Recepient Account	  */
	public int gets_membershares_receiver_ID();

	public I_s_membershares gets_membershares_receiver() throws RuntimeException;

    /** Column name s_membershares_sender_ID */
    public static final String COLUMNNAME_s_membershares_sender_ID = "s_membershares_sender_ID";

	/** Set Transferor Account	  */
	public void sets_membershares_sender_ID (int s_membershares_sender_ID);

	/** Get Transferor Account	  */
	public int gets_membershares_sender_ID();

	public I_s_membershares gets_membershares_sender() throws RuntimeException;

    /** Column name s_share_tranfer_ID */
    public static final String COLUMNNAME_s_share_tranfer_ID = "s_share_tranfer_ID";

	/** Set s_share_tranfer ID	  */
	public void sets_share_tranfer_ID (int s_share_tranfer_ID);

	/** Get s_share_tranfer ID	  */
	public int gets_share_tranfer_ID();

    /** Column name s_sharetype_receiver_ID */
    public static final String COLUMNNAME_s_sharetype_receiver_ID = "s_sharetype_receiver_ID";

	/** Set Share Type	  */
	public void sets_sharetype_receiver_ID (int s_sharetype_receiver_ID);

	/** Get Share Type	  */
	public int gets_sharetype_receiver_ID();

	public I_s_sharetype gets_sharetype_receiver() throws RuntimeException;

    /** Column name s_sharetype_sender_ID */
    public static final String COLUMNNAME_s_sharetype_sender_ID = "s_sharetype_sender_ID";

	/** Set Share Type	  */
	public void sets_sharetype_sender_ID (int s_sharetype_sender_ID);

	/** Get Share Type	  */
	public int gets_sharetype_sender_ID();

	public I_s_sharetype gets_sharetype_sender() throws RuntimeException;

    /** Column name tranferable_amount */
    public static final String COLUMNNAME_tranferable_amount = "tranferable_amount";

	/** Set Transferable Amount	  */
	public void settranferable_amount (BigDecimal tranferable_amount);

	/** Get Transferable Amount	  */
	public BigDecimal gettranferable_amount();

    /** Column name transactiondate */
    public static final String COLUMNNAME_transactiondate = "transactiondate";

	/** Set Transaction Date	  */
	public void settransactiondate (Timestamp transactiondate);

	/** Get Transaction Date	  */
	public Timestamp gettransactiondate();

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
