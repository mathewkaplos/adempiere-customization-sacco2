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

/** Generated Interface for s_loanschedule
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_loanschedule 
{

    /** TableName=s_loanschedule */
    public static final String Table_Name = "s_loanschedule";

    /** AD_Table_ID=1000016 */
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

    /** Column name amountdue */
    public static final String COLUMNNAME_amountdue = "amountdue";

	/** Set amountdue	  */
	public void setamountdue (BigDecimal amountdue);

	/** Get amountdue	  */
	public BigDecimal getamountdue();

    /** Column name amountpaid */
    public static final String COLUMNNAME_amountpaid = "amountpaid";

	/** Set amountpaid	  */
	public void setamountpaid (BigDecimal amountpaid);

	/** Get amountpaid	  */
	public BigDecimal getamountpaid();

    /** Column name chargeintfirst */
    public static final String COLUMNNAME_chargeintfirst = "chargeintfirst";

	/** Set chargeintfirst	  */
	public void setchargeintfirst (int chargeintfirst);

	/** Get chargeintfirst	  */
	public int getchargeintfirst();

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

    /** Column name expinterest */
    public static final String COLUMNNAME_expinterest = "expinterest";

	/** Set expinterest	  */
	public void setexpinterest (BigDecimal expinterest);

	/** Get expinterest	  */
	public BigDecimal getexpinterest();

    /** Column name expprincipal */
    public static final String COLUMNNAME_expprincipal = "expprincipal";

	/** Set expprincipal	  */
	public void setexpprincipal (BigDecimal expprincipal);

	/** Get expprincipal	  */
	public BigDecimal getexpprincipal();

    /** Column name interest_due */
    public static final String COLUMNNAME_interest_due = "interest_due";

	/** Set Interest Due	  */
	public void setinterest_due (BigDecimal interest_due);

	/** Get Interest Due	  */
	public BigDecimal getinterest_due();

    /** Column name interestamount */
    public static final String COLUMNNAME_interestamount = "interestamount";

	/** Set interestamount	  */
	public void setinterestamount (BigDecimal interestamount);

	/** Get interestamount	  */
	public BigDecimal getinterestamount();

    /** Column name interestrate */
    public static final String COLUMNNAME_interestrate = "interestrate";

	/** Set interestrate	  */
	public void setinterestrate (BigDecimal interestrate);

	/** Get interestrate	  */
	public BigDecimal getinterestrate();

    /** Column name interestrepayment */
    public static final String COLUMNNAME_interestrepayment = "interestrepayment";

	/** Set interestrepayment	  */
	public void setinterestrepayment (BigDecimal interestrepayment);

	/** Get interestrepayment	  */
	public BigDecimal getinterestrepayment();

    /** Column name interesttype */
    public static final String COLUMNNAME_interesttype = "interesttype";

	/** Set Interest Type	  */
	public void setinteresttype (String interesttype);

	/** Get Interest Type	  */
	public String getinteresttype();

    /** Column name intperiod */
    public static final String COLUMNNAME_intperiod = "intperiod";

	/** Set Repay Period	  */
	public void setintperiod (BigDecimal intperiod);

	/** Get Repay Period	  */
	public BigDecimal getintperiod();

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

    /** Column name loanamount */
    public static final String COLUMNNAME_loanamount = "loanamount";

	/** Set Loan Amount	  */
	public void setloanamount (BigDecimal loanamount);

	/** Get Loan Amount	  */
	public BigDecimal getloanamount();

    /** Column name loanappdate */
    public static final String COLUMNNAME_loanappdate = "loanappdate";

	/** Set Application Date:	  */
	public void setloanappdate (Timestamp loanappdate);

	/** Get Application Date:	  */
	public Timestamp getloanappdate();

    /** Column name loanbalance */
    public static final String COLUMNNAME_loanbalance = "loanbalance";

	/** Set Loan Balance	  */
	public void setloanbalance (BigDecimal loanbalance);

	/** Get Loan Balance	  */
	public BigDecimal getloanbalance();

    /** Column name loaneffectdate */
    public static final String COLUMNNAME_loaneffectdate = "loaneffectdate";

	/** Set Effect Period	  */
	public void setloaneffectdate (Timestamp loaneffectdate);

	/** Get Effect Period	  */
	public Timestamp getloaneffectdate();

    /** Column name loanpaydate */
    public static final String COLUMNNAME_loanpaydate = "loanpaydate";

	/** Set loanpaydate	  */
	public void setloanpaydate (Timestamp loanpaydate);

	/** Get loanpaydate	  */
	public Timestamp getloanpaydate();

    /** Column name loanpenalty */
    public static final String COLUMNNAME_loanpenalty = "loanpenalty";

	/** Set Loan Penalty	  */
	public void setloanpenalty (BigDecimal loanpenalty);

	/** Get Loan Penalty	  */
	public BigDecimal getloanpenalty();

    /** Column name monthlyrepayment */
    public static final String COLUMNNAME_monthlyrepayment = "monthlyrepayment";

	/** Set monthlyrepayment	  */
	public void setmonthlyrepayment (BigDecimal monthlyrepayment);

	/** Get monthlyrepayment	  */
	public BigDecimal getmonthlyrepayment();

    /** Column name monthopeningbal */
    public static final String COLUMNNAME_monthopeningbal = "monthopeningbal";

	/** Set Month Opening Bal	  */
	public void setmonthopeningbal (BigDecimal monthopeningbal);

	/** Get Month Opening Bal	  */
	public BigDecimal getmonthopeningbal();

    /** Column name monthperiod */
    public static final String COLUMNNAME_monthperiod = "monthperiod";

	/** Set monthperiod	  */
	public void setmonthperiod (int monthperiod);

	/** Get monthperiod	  */
	public int getmonthperiod();

    /** Column name newinterest */
    public static final String COLUMNNAME_newinterest = "newinterest";

	/** Set New Interest	  */
	public void setnewinterest (BigDecimal newinterest);

	/** Get New Interest	  */
	public BigDecimal getnewinterest();

    /** Column name oldinterest */
    public static final String COLUMNNAME_oldinterest = "oldinterest";

	/** Set oldinterest	  */
	public void setoldinterest (BigDecimal oldinterest);

	/** Get oldinterest	  */
	public BigDecimal getoldinterest();

    /** Column name openning_loanbalance */
    public static final String COLUMNNAME_openning_loanbalance = "openning_loanbalance";

	/** Set Openning Loan Balance	  */
	public void setopenning_loanbalance (BigDecimal openning_loanbalance);

	/** Get Openning Loan Balance	  */
	public BigDecimal getopenning_loanbalance();

    /** Column name othercharges */
    public static final String COLUMNNAME_othercharges = "othercharges";

	/** Set Other Charges	  */
	public void setothercharges (BigDecimal othercharges);

	/** Get Other Charges	  */
	public BigDecimal getothercharges();

    /** Column name principalrepayment */
    public static final String COLUMNNAME_principalrepayment = "principalrepayment";

	/** Set principalrepayment	  */
	public void setprincipalrepayment (BigDecimal principalrepayment);

	/** Get principalrepayment	  */
	public BigDecimal getprincipalrepayment();

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

    /** Column name recurringadj */
    public static final String COLUMNNAME_recurringadj = "recurringadj";

	/** Set recurringadj	  */
	public void setrecurringadj (int recurringadj);

	/** Get recurringadj	  */
	public int getrecurringadj();

    /** Column name repayamount */
    public static final String COLUMNNAME_repayamount = "repayamount";

	/** Set repayamount	  */
	public void setrepayamount (BigDecimal repayamount);

	/** Get repayamount	  */
	public BigDecimal getrepayamount();

    /** Column name repayperiod */
    public static final String COLUMNNAME_repayperiod = "repayperiod";

	/** Set repayperiod	  */
	public void setrepayperiod (int repayperiod);

	/** Get repayperiod	  */
	public int getrepayperiod();

    /** Column name s_loans_ID */
    public static final String COLUMNNAME_s_loans_ID = "s_loans_ID";

	/** Set Loan Ref	  */
	public void sets_loans_ID (int s_loans_ID);

	/** Get Loan Ref	  */
	public int gets_loans_ID();

	public I_s_loans gets_loans() throws RuntimeException;

    /** Column name s_loanschedule_ID */
    public static final String COLUMNNAME_s_loanschedule_ID = "s_loanschedule_ID";

	/** Set s_loanschedule ID	  */
	public void sets_loanschedule_ID (int s_loanschedule_ID);

	/** Get s_loanschedule ID	  */
	public int gets_loanschedule_ID();

    /** Column name suminterest */
    public static final String COLUMNNAME_suminterest = "suminterest";

	/** Set Sum Interest	  */
	public void setsuminterest (BigDecimal suminterest);

	/** Get Sum Interest	  */
	public BigDecimal getsuminterest();

    /** Column name sumothercharges */
    public static final String COLUMNNAME_sumothercharges = "sumothercharges";

	/** Set Sum Other Charges	  */
	public void setsumothercharges (BigDecimal sumothercharges);

	/** Get Sum Other Charges	  */
	public BigDecimal getsumothercharges();

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
