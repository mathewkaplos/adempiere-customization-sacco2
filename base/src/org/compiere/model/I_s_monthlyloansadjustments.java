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

/** Generated Interface for s_monthlyloansadjustments
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_monthlyloansadjustments 
{

    /** TableName=s_monthlyloansadjustments */
    public static final String Table_Name = "s_monthlyloansadjustments";

    /** AD_Table_ID=1000025 */
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

    /** Column name btn_save */
    public static final String COLUMNNAME_btn_save = "btn_save";

	/** Set Save	  */
	public void setbtn_save (String btn_save);

	/** Get Save	  */
	public String getbtn_save();

    /** Column name closingbalance */
    public static final String COLUMNNAME_closingbalance = "closingbalance";

	/** Set Closing Balance	  */
	public void setclosingbalance (BigDecimal closingbalance);

	/** Get Closing Balance	  */
	public BigDecimal getclosingbalance();

    /** Column name ConstantAmount */
    public static final String COLUMNNAME_ConstantAmount = "ConstantAmount";

	/** Set Constant Amount	  */
	public void setConstantAmount (BigDecimal ConstantAmount);

	/** Get Constant Amount	  */
	public BigDecimal getConstantAmount();

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

    /** Column name expectedamount */
    public static final String COLUMNNAME_expectedamount = "expectedamount";

	/** Set Expected Amount	  */
	public void setexpectedamount (BigDecimal expectedamount);

	/** Get Expected Amount	  */
	public BigDecimal getexpectedamount();

    /** Column name expectedinterest */
    public static final String COLUMNNAME_expectedinterest = "expectedinterest";

	/** Set Expected Interest	  */
	public void setexpectedinterest (BigDecimal expectedinterest);

	/** Get Expected Interest	  */
	public BigDecimal getexpectedinterest();

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

    /** Column name loaneffectdate */
    public static final String COLUMNNAME_loaneffectdate = "loaneffectdate";

	/** Set Effect Period	  */
	public void setloaneffectdate (Timestamp loaneffectdate);

	/** Get Effect Period	  */
	public Timestamp getloaneffectdate();

    /** Column name newamount */
    public static final String COLUMNNAME_newamount = "newamount";

	/** Set New Amount	  */
	public void setnewamount (BigDecimal newamount);

	/** Get New Amount	  */
	public BigDecimal getnewamount();

    /** Column name newinterest */
    public static final String COLUMNNAME_newinterest = "newinterest";

	/** Set New Interest	  */
	public void setnewinterest (BigDecimal newinterest);

	/** Get New Interest	  */
	public BigDecimal getnewinterest();

    /** Column name NewOtherCharges */
    public static final String COLUMNNAME_NewOtherCharges = "NewOtherCharges";

	/** Set NewOtherCharges	  */
	public void setNewOtherCharges (BigDecimal NewOtherCharges);

	/** Get NewOtherCharges	  */
	public BigDecimal getNewOtherCharges();

    /** Column name onemonthadjustment */
    public static final String COLUMNNAME_onemonthadjustment = "onemonthadjustment";

	/** Set One Month Adjustment	  */
	public void setonemonthadjustment (boolean onemonthadjustment);

	/** Get One Month Adjustment	  */
	public boolean isonemonthadjustment();

    /** Column name openingbalance */
    public static final String COLUMNNAME_openingbalance = "openingbalance";

	/** Set Opening Balance	  */
	public void setopeningbalance (BigDecimal openingbalance);

	/** Get Opening Balance	  */
	public BigDecimal getopeningbalance();

    /** Column name recurring */
    public static final String COLUMNNAME_recurring = "recurring";

	/** Set Recurring	  */
	public void setrecurring (boolean recurring);

	/** Get Recurring	  */
	public boolean isrecurring();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

    /** Column name s_loantype_ID */
    public static final String COLUMNNAME_s_loantype_ID = "s_loantype_ID";

	/** Set Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID);

	/** Get Loan Type	  */
	public int gets_loantype_ID();

	public I_s_loantype gets_loantype() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_monthlyloansadjustments_ID */
    public static final String COLUMNNAME_s_monthlyloansadjustments_ID = "s_monthlyloansadjustments_ID";

	/** Set s_monthlyloansadjustments ID	  */
	public void sets_monthlyloansadjustments_ID (int s_monthlyloansadjustments_ID);

	/** Get s_monthlyloansadjustments ID	  */
	public int gets_monthlyloansadjustments_ID();

    /** Column name transactiondate */
    public static final String COLUMNNAME_transactiondate = "transactiondate";

	/** Set Transaction Date	  */
	public void settransactiondate (Timestamp transactiondate);

	/** Get Transaction Date	  */
	public Timestamp gettransactiondate();

    /** Column name TransactionPer */
    public static final String COLUMNNAME_TransactionPer = "TransactionPer";

	/** Set Transaction Period	  */
	public void setTransactionPer (int TransactionPer);

	/** Get Transaction Period	  */
	public int getTransactionPer();

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
}
