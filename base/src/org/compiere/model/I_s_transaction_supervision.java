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

/** Generated Interface for s_transaction_supervision
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_transaction_supervision 
{

    /** TableName=s_transaction_supervision */
    public static final String Table_Name = "s_transaction_supervision";

    /** AD_Table_ID=1000048 */
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

    /** Column name cash_withdrawal_amount */
    public static final String COLUMNNAME_cash_withdrawal_amount = "cash_withdrawal_amount";

	/** Set Cash Withdrawal Amount	  */
	public void setcash_withdrawal_amount (BigDecimal cash_withdrawal_amount);

	/** Get Cash Withdrawal Amount	  */
	public BigDecimal getcash_withdrawal_amount();

    /** Column name cash_withdrawal_supervised */
    public static final String COLUMNNAME_cash_withdrawal_supervised = "cash_withdrawal_supervised";

	/** Set Cash Withdrawal Supervised	  */
	public void setcash_withdrawal_supervised (boolean cash_withdrawal_supervised);

	/** Get Cash Withdrawal Supervised	  */
	public boolean iscash_withdrawal_supervised();

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

    /** Column name deduction_schedule_supervised */
    public static final String COLUMNNAME_deduction_schedule_supervised = "deduction_schedule_supervised";

	/** Set Deduction Schedule Supervised(Debit Raise)	  */
	public void setdeduction_schedule_supervised (boolean deduction_schedule_supervised);

	/** Get Deduction Schedule Supervised(Debit Raise)	  */
	public boolean isdeduction_schedule_supervised();

    /** Column name deposit_amount */
    public static final String COLUMNNAME_deposit_amount = "deposit_amount";

	/** Set Deposit Amount	  */
	public void setdeposit_amount (BigDecimal deposit_amount);

	/** Get Deposit Amount	  */
	public BigDecimal getdeposit_amount();

    /** Column name deposit_supervised */
    public static final String COLUMNNAME_deposit_supervised = "deposit_supervised";

	/** Set Deposit Supervised	  */
	public void setdeposit_supervised (boolean deposit_supervised);

	/** Get Deposit Supervised	  */
	public boolean isdeposit_supervised();

    /** Column name fixed_deposit_amount */
    public static final String COLUMNNAME_fixed_deposit_amount = "fixed_deposit_amount";

	/** Set Fixed Deposit Amount	  */
	public void setfixed_deposit_amount (BigDecimal fixed_deposit_amount);

	/** Get Fixed Deposit Amount	  */
	public BigDecimal getfixed_deposit_amount();

    /** Column name fixed_deposit_supervised */
    public static final String COLUMNNAME_fixed_deposit_supervised = "fixed_deposit_supervised";

	/** Set Fixed Deposit Supervised	  */
	public void setfixed_deposit_supervised (boolean fixed_deposit_supervised);

	/** Get Fixed Deposit Supervised	  */
	public boolean isfixed_deposit_supervised();

    /** Column name import_transactions_supervised */
    public static final String COLUMNNAME_import_transactions_supervised = "import_transactions_supervised";

	/** Set Import Transactions Supervised(Payrol Imports)	  */
	public void setimport_transactions_supervised (boolean import_transactions_supervised);

	/** Get Import Transactions Supervised(Payrol Imports)	  */
	public boolean isimport_transactions_supervised();

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

    /** Column name loan_repayment_amount */
    public static final String COLUMNNAME_loan_repayment_amount = "loan_repayment_amount";

	/** Set Loan Repayment Amount	  */
	public void setloan_repayment_amount (BigDecimal loan_repayment_amount);

	/** Get Loan Repayment Amount	  */
	public BigDecimal getloan_repayment_amount();

    /** Column name loan_repayment_supervised */
    public static final String COLUMNNAME_loan_repayment_supervised = "loan_repayment_supervised";

	/** Set Loan Repayment Supervised	  */
	public void setloan_repayment_supervised (boolean loan_repayment_supervised);

	/** Get Loan Repayment Supervised	  */
	public boolean isloan_repayment_supervised();

    /** Column name partial_disburs_amount */
    public static final String COLUMNNAME_partial_disburs_amount = "partial_disburs_amount";

	/** Set Partial Disbursement Amount	  */
	public void setpartial_disburs_amount (BigDecimal partial_disburs_amount);

	/** Get Partial Disbursement Amount	  */
	public BigDecimal getpartial_disburs_amount();

    /** Column name partial_disburs_supervised */
    public static final String COLUMNNAME_partial_disburs_supervised = "partial_disburs_supervised";

	/** Set Partial Disbursement Supervised	  */
	public void setpartial_disburs_supervised (boolean partial_disburs_supervised);

	/** Get Partial Disbursement Supervised	  */
	public boolean ispartial_disburs_supervised();

    /** Column name product_transfer_amount */
    public static final String COLUMNNAME_product_transfer_amount = "product_transfer_amount";

	/** Set Product Transfer Amount	  */
	public void setproduct_transfer_amount (BigDecimal product_transfer_amount);

	/** Get Product Transfer Amount	  */
	public BigDecimal getproduct_transfer_amount();

    /** Column name product_transfer_supervised */
    public static final String COLUMNNAME_product_transfer_supervised = "product_transfer_supervised";

	/** Set Product Transfer Supervised	  */
	public void setproduct_transfer_supervised (boolean product_transfer_supervised);

	/** Get Product Transfer Supervised	  */
	public boolean isproduct_transfer_supervised();

    /** Column name s_transaction_supervision_ID */
    public static final String COLUMNNAME_s_transaction_supervision_ID = "s_transaction_supervision_ID";

	/** Set s_transaction_supervision ID	  */
	public void sets_transaction_supervision_ID (int s_transaction_supervision_ID);

	/** Get s_transaction_supervision ID	  */
	public int gets_transaction_supervision_ID();

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
