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

/** Generated Interface for s_loantype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_loantype 
{

    /** TableName=s_loantype */
    public static final String Table_Name = "s_loantype";

    /** AD_Table_ID=1000004 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name acceptable */
    public static final String COLUMNNAME_acceptable = "acceptable";

	/** Set Collateral Acceptable	  */
	public void setacceptable (boolean acceptable);

	/** Get Collateral Acceptable	  */
	public boolean isacceptable();

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

    /** Column name adjustable_interest_rates */
    public static final String COLUMNNAME_adjustable_interest_rates = "adjustable_interest_rates";

	/** Set Adjustable Interest Rates	  */
	public void setadjustable_interest_rates (boolean adjustable_interest_rates);

	/** Get Adjustable Interest Rates	  */
	public boolean isadjustable_interest_rates();

    /** Column name allow_partial_dispursement */
    public static final String COLUMNNAME_allow_partial_dispursement = "allow_partial_dispursement";

	/** Set Allow Partial Dispursement	  */
	public void setallow_partial_dispursement (boolean allow_partial_dispursement);

	/** Get Allow Partial Dispursement	  */
	public boolean isallow_partial_dispursement();

    /** Column name allow_zero_value_guarantors */
    public static final String COLUMNNAME_allow_zero_value_guarantors = "allow_zero_value_guarantors";

	/** Set Allow Zero Value Guarantors	  */
	public void setallow_zero_value_guarantors (boolean allow_zero_value_guarantors);

	/** Get Allow Zero Value Guarantors	  */
	public boolean isallow_zero_value_guarantors();

    /** Column name annualinterest */
    public static final String COLUMNNAME_annualinterest = "annualinterest";

	/** Set Annual Int Rate	  */
	public void setannualinterest (BigDecimal annualinterest);

	/** Get Annual Int Rate	  */
	public BigDecimal getannualinterest();

    /** Column name approvingofficers */
    public static final String COLUMNNAME_approvingofficers = "approvingofficers";

	/** Set MIn No Of Approving Officials	  */
	public void setapprovingofficers (int approvingofficers);

	/** Get MIn No Of Approving Officials	  */
	public int getapprovingofficers();

    /** Column name blocked */
    public static final String COLUMNNAME_blocked = "blocked";

	/** Set Blocked	  */
	public void setblocked (boolean blocked);

	/** Get Blocked	  */
	public boolean isblocked();

    /** Column name calculateonperiod */
    public static final String COLUMNNAME_calculateonperiod = "calculateonperiod";

	/** Set Calculate Interest On Original Period	  */
	public void setcalculateonperiod (boolean calculateonperiod);

	/** Get Calculate Interest On Original Period	  */
	public boolean iscalculateonperiod();

    /** Column name can_be_refinanced */
    public static final String COLUMNNAME_can_be_refinanced = "can_be_refinanced";

	/** Set Can Be Refinanced	  */
	public void setcan_be_refinanced (boolean can_be_refinanced);

	/** Get Can Be Refinanced	  */
	public boolean iscan_be_refinanced();

    /** Column name can_be_topped_up */
    public static final String COLUMNNAME_can_be_topped_up = "can_be_topped_up";

	/** Set Can Be Topped Up	  */
	public void setcan_be_topped_up (boolean can_be_topped_up);

	/** Get Can Be Topped Up	  */
	public boolean iscan_be_topped_up();

    /** Column name change_interest_if_clearing */
    public static final String COLUMNNAME_change_interest_if_clearing = "change_interest_if_clearing";

	/** Set Change Interest If Clearing Loan	  */
	public void setchange_interest_if_clearing (boolean change_interest_if_clearing);

	/** Get Change Interest If Clearing Loan	  */
	public boolean ischange_interest_if_clearing();

    /** Column name charges_apply_when_transacting */
    public static final String COLUMNNAME_charges_apply_when_transacting = "charges_apply_when_transacting";

	/** Set Transaction Charges Apply When Transacting	  */
	public void setcharges_apply_when_transacting (boolean charges_apply_when_transacting);

	/** Get Transaction Charges Apply When Transacting	  */
	public boolean ischarges_apply_when_transacting();

    /** Column name considertiedshares */
    public static final String COLUMNNAME_considertiedshares = "considertiedshares";

	/** Set Consider Tied Shares	  */
	public void setconsidertiedshares (boolean considertiedshares);

	/** Get Consider Tied Shares	  */
	public boolean isconsidertiedshares();

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

    /** Column name fortyfivedaysrule */
    public static final String COLUMNNAME_fortyfivedaysrule = "fortyfivedaysrule";

	/** Set 45 Days Rule?	  */
	public void setfortyfivedaysrule (boolean fortyfivedaysrule);

	/** Get 45 Days Rule?	  */
	public boolean isfortyfivedaysrule();

    /** Column name haspenalty */
    public static final String COLUMNNAME_haspenalty = "haspenalty";

	/** Set Has Penalty	  */
	public void sethaspenalty (boolean haspenalty);

	/** Get Has Penalty	  */
	public boolean ishaspenalty();

    /** Column name intaspenalty */
    public static final String COLUMNNAME_intaspenalty = "intaspenalty";

	/** Set Unpaid Interest As Penalty	  */
	public void setintaspenalty (boolean intaspenalty);

	/** Get Unpaid Interest As Penalty	  */
	public boolean isintaspenalty();

    /** Column name interestformula */
    public static final String COLUMNNAME_interestformula = "interestformula";

	/** Set Interest Calculation Formula	  */
	public void setinterestformula (String interestformula);

	/** Get Interest Calculation Formula	  */
	public String getinterestformula();

    /** Column name interestlimit */
    public static final String COLUMNNAME_interestlimit = "interestlimit";

	/** Set Do Not Exceed Interest Limit	  */
	public void setinterestlimit (boolean interestlimit);

	/** Get Do Not Exceed Interest Limit	  */
	public boolean isinterestlimit();

    /** Column name interestprc */
    public static final String COLUMNNAME_interestprc = "interestprc";

	/** Set interestprc	  */
	public void setinterestprc (String interestprc);

	/** Get interestprc	  */
	public String getinterestprc();

    /** Column name intreceivableasset */
    public static final String COLUMNNAME_intreceivableasset = "intreceivableasset";

	/** Set intreceivableasset	  */
	public void setintreceivableasset (String intreceivableasset);

	/** Get intreceivableasset	  */
	public String getintreceivableasset();

    /** Column name intreceivableincome */
    public static final String COLUMNNAME_intreceivableincome = "intreceivableincome";

	/** Set intreceivableincome	  */
	public void setintreceivableincome (String intreceivableincome);

	/** Get intreceivableincome	  */
	public String getintreceivableincome();

    /** Column name is13th */
    public static final String COLUMNNAME_is13th = "is13th";

	/** Set is13th	  */
	public void setis13th (boolean is13th);

	/** Get is13th	  */
	public boolean is13th();

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

    /** Column name isfosa */
    public static final String COLUMNNAME_isfosa = "isfosa";

	/** Set Is FOSA	  */
	public void setisfosa (boolean isfosa);

	/** Get Is FOSA	  */
	public boolean isfosa();

    /** Column name linkedgl */
    public static final String COLUMNNAME_linkedgl = "linkedgl";

	/** Set Linked To Saving Type	  */
	public void setlinkedgl (String linkedgl);

	/** Get Linked To Saving Type	  */
	public String getlinkedgl();

    /** Column name loan_product_type */
    public static final String COLUMNNAME_loan_product_type = "loan_product_type";

	/** Set Loan Product Type	  */
	public void setloan_product_type (String loan_product_type);

	/** Get Loan Product Type	  */
	public String getloan_product_type();

    /** Column name loanprc */
    public static final String COLUMNNAME_loanprc = "loanprc";

	/** Set loanprc	  */
	public void setloanprc (String loanprc);

	/** Get loanprc	  */
	public String getloanprc();

    /** Column name loansfactor */
    public static final String COLUMNNAME_loansfactor = "loansfactor";

	/** Set Loans Factor	  */
	public void setloansfactor (BigDecimal loansfactor);

	/** Get Loans Factor	  */
	public BigDecimal getloansfactor();

    /** Column name loantypecode */
    public static final String COLUMNNAME_loantypecode = "loantypecode";

	/** Set Ref # / Code	  */
	public void setloantypecode (String loantypecode);

	/** Get Ref # / Code	  */
	public String getloantypecode();

    /** Column name loantypeincomefactor */
    public static final String COLUMNNAME_loantypeincomefactor = "loantypeincomefactor";

	/** Set Income Factor	  */
	public void setloantypeincomefactor (BigDecimal loantypeincomefactor);

	/** Get Income Factor	  */
	public BigDecimal getloantypeincomefactor();

    /** Column name loantypeinterestgl_Acct */
    public static final String COLUMNNAME_loantypeinterestgl_Acct = "loantypeinterestgl_Acct";

	/** Set Interest(GL Code)	  */
	public void setloantypeinterestgl_Acct (int loantypeinterestgl_Acct);

	/** Get Interest(GL Code)	  */
	public int getloantypeinterestgl_Acct();

	public I_C_ValidCombination getloantypeinterestgl_A() throws RuntimeException;

    /** Column name loantypeinterestrate */
    public static final String COLUMNNAME_loantypeinterestrate = "loantypeinterestrate";

	/** Set Monthly Int Rate	  */
	public void setloantypeinterestrate (BigDecimal loantypeinterestrate);

	/** Get Monthly Int Rate	  */
	public BigDecimal getloantypeinterestrate();

    /** Column name loantypeinterestraterate */
    public static final String COLUMNNAME_loantypeinterestraterate = "loantypeinterestraterate";

	/** Set loantypeinterestraterate	  */
	public void setloantypeinterestraterate (int loantypeinterestraterate);

	/** Get loantypeinterestraterate	  */
	public int getloantypeinterestraterate();

    /** Column name loantypeinteresttype */
    public static final String COLUMNNAME_loantypeinteresttype = "loantypeinteresttype";

	/** Set Interest Pay Method	  */
	public void setloantypeinteresttype (String loantypeinteresttype);

	/** Get Interest Pay Method	  */
	public String getloantypeinteresttype();

    /** Column name loantypeloangl_Acct */
    public static final String COLUMNNAME_loantypeloangl_Acct = "loantypeloangl_Acct";

	/** Set Loan(GL Code)	  */
	public void setloantypeloangl_Acct (int loantypeloangl_Acct);

	/** Get Loan(GL Code)	  */
	public int getloantypeloangl_Acct();

	public I_C_ValidCombination getloantypeloangl_A() throws RuntimeException;

    /** Column name loantypemaxamount */
    public static final String COLUMNNAME_loantypemaxamount = "loantypemaxamount";

	/** Set Max Loan Amount	  */
	public void setloantypemaxamount (BigDecimal loantypemaxamount);

	/** Get Max Loan Amount	  */
	public BigDecimal getloantypemaxamount();

    /** Column name loantypemaxguarantorloans */
    public static final String COLUMNNAME_loantypemaxguarantorloans = "loantypemaxguarantorloans";

	/** Set loantypemaxguarantorloans	  */
	public void setloantypemaxguarantorloans (int loantypemaxguarantorloans);

	/** Get loantypemaxguarantorloans	  */
	public int getloantypemaxguarantorloans();

    /** Column name loantypemaxguarantors */
    public static final String COLUMNNAME_loantypemaxguarantors = "loantypemaxguarantors";

	/** Set Max Guarantors:	  */
	public void setloantypemaxguarantors (int loantypemaxguarantors);

	/** Get Max Guarantors:	  */
	public int getloantypemaxguarantors();

    /** Column name loantypemaxperiod */
    public static final String COLUMNNAME_loantypemaxperiod = "loantypemaxperiod";

	/** Set Maximum Loan Period	  */
	public void setloantypemaxperiod (int loantypemaxperiod);

	/** Get Maximum Loan Period	  */
	public int getloantypemaxperiod();

    /** Column name loantypeminage */
    public static final String COLUMNNAME_loantypeminage = "loantypeminage";

	/** Set loantypeminage	  */
	public void setloantypeminage (int loantypeminage);

	/** Get loantypeminage	  */
	public int getloantypeminage();

    /** Column name loantypeminamount */
    public static final String COLUMNNAME_loantypeminamount = "loantypeminamount";

	/** Set Min Loan Amt:	  */
	public void setloantypeminamount (BigDecimal loantypeminamount);

	/** Get Min Loan Amt:	  */
	public BigDecimal getloantypeminamount();

    /** Column name loantypemincontribution */
    public static final String COLUMNNAME_loantypemincontribution = "loantypemincontribution";

	/** Set loantypemincontribution	  */
	public void setloantypemincontribution (int loantypemincontribution);

	/** Get loantypemincontribution	  */
	public int getloantypemincontribution();

    /** Column name loantypeminguarantors */
    public static final String COLUMNNAME_loantypeminguarantors = "loantypeminguarantors";

	/** Set Min Guarantors:	  */
	public void setloantypeminguarantors (int loantypeminguarantors);

	/** Get Min Guarantors:	  */
	public int getloantypeminguarantors();

    /** Column name loantypeminmembership */
    public static final String COLUMNNAME_loantypeminmembership = "loantypeminmembership";

	/** Set Minimum Mbrship Period(Months)	  */
	public void setloantypeminmembership (int loantypeminmembership);

	/** Get Minimum Mbrship Period(Months)	  */
	public int getloantypeminmembership();

    /** Column name loantypeminshares */
    public static final String COLUMNNAME_loantypeminshares = "loantypeminshares";

	/** Set Minimum Shares	  */
	public void setloantypeminshares (BigDecimal loantypeminshares);

	/** Get Minimum Shares	  */
	public BigDecimal getloantypeminshares();

    /** Column name loantypename */
    public static final String COLUMNNAME_loantypename = "loantypename";

	/** Set Description	  */
	public void setloantypename (String loantypename);

	/** Get Description	  */
	public String getloantypename();

    /** Column name loantypepaymentfrequency */
    public static final String COLUMNNAME_loantypepaymentfrequency = "loantypepaymentfrequency";

	/** Set Repayment Frequency	  */
	public void setloantypepaymentfrequency (String loantypepaymentfrequency);

	/** Get Repayment Frequency	  */
	public String getloantypepaymentfrequency();

    /** Column name loantypepaymentmethod */
    public static final String COLUMNNAME_loantypepaymentmethod = "loantypepaymentmethod";

	/** Set Repayment Method	  */
	public void setloantypepaymentmethod (String loantypepaymentmethod);

	/** Get Repayment Method	  */
	public String getloantypepaymentmethod();

    /** Column name loantypepenalty */
    public static final String COLUMNNAME_loantypepenalty = "loantypepenalty";

	/** Set Penalty Amt	  */
	public void setloantypepenalty (BigDecimal loantypepenalty);

	/** Get Penalty Amt	  */
	public BigDecimal getloantypepenalty();

    /** Column name loantypepenaltygl_Acct */
    public static final String COLUMNNAME_loantypepenaltygl_Acct = "loantypepenaltygl_Acct";

	/** Set Penalty GL Code	  */
	public void setloantypepenaltygl_Acct (int loantypepenaltygl_Acct);

	/** Get Penalty GL Code	  */
	public int getloantypepenaltygl_Acct();

	public I_C_ValidCombination getloantypepenaltygl_A() throws RuntimeException;

    /** Column name loantypepenaltyrate */
    public static final String COLUMNNAME_loantypepenaltyrate = "loantypepenaltyrate";

	/** Set loantypepenaltyrate	  */
	public void setloantypepenaltyrate (int loantypepenaltyrate);

	/** Get loantypepenaltyrate	  */
	public int getloantypepenaltyrate();

    /** Column name loantyperemarks */
    public static final String COLUMNNAME_loantyperemarks = "loantyperemarks";

	/** Set Remarks	  */
	public void setloantyperemarks (String loantyperemarks);

	/** Get Remarks	  */
	public String getloantyperemarks();

    /** Column name loantypesharesfactor */
    public static final String COLUMNNAME_loantypesharesfactor = "loantypesharesfactor";

	/** Set Savings Factor	  */
	public void setloantypesharesfactor (BigDecimal loantypesharesfactor);

	/** Get Savings Factor	  */
	public BigDecimal getloantypesharesfactor();

    /** Column name max_grace_period */
    public static final String COLUMNNAME_max_grace_period = "max_grace_period";

	/** Set Maximum Grace Period(Months)	  */
	public void setmax_grace_period (int max_grace_period);

	/** Get Maximum Grace Period(Months)	  */
	public int getmax_grace_period();

    /** Column name minimumcontributions */
    public static final String COLUMNNAME_minimumcontributions = "minimumcontributions";

	/** Set Min No. Of Conts(Months)	  */
	public void setminimumcontributions (int minimumcontributions);

	/** Get Min No. Of Conts(Months)	  */
	public int getminimumcontributions();

    /** Column name monthlyintcalc */
    public static final String COLUMNNAME_monthlyintcalc = "monthlyintcalc";

	/** Set Interest Mode	  */
	public void setmonthlyintcalc (String monthlyintcalc);

	/** Get Interest Mode	  */
	public String getmonthlyintcalc();

    /** Column name overdue_penalty */
    public static final String COLUMNNAME_overdue_penalty = "overdue_penalty";

	/** Set Overdue Penalty	  */
	public void setoverdue_penalty (boolean overdue_penalty);

	/** Get Overdue Penalty	  */
	public boolean isoverdue_penalty();

    /** Column name penaltyprc */
    public static final String COLUMNNAME_penaltyprc = "penaltyprc";

	/** Set penaltyprc	  */
	public void setpenaltyprc (String penaltyprc);

	/** Get penaltyprc	  */
	public String getpenaltyprc();

    /** Column name perofloanbal */
    public static final String COLUMNNAME_perofloanbal = "perofloanbal";

	/** Set % Of Loan Bal	  */
	public void setperofloanbal (boolean perofloanbal);

	/** Get % Of Loan Bal	  */
	public boolean isperofloanbal();

    /** Column name Prefix */
    public static final String COLUMNNAME_Prefix = "Prefix";

	/** Set Prefix.
	  * Prefix before the sequence number
	  */
	public void setPrefix (String Prefix);

	/** Get Prefix.
	  * Prefix before the sequence number
	  */
	public String getPrefix();

    /** Column name Priority */
    public static final String COLUMNNAME_Priority = "Priority";

	/** Set Priority.
	  * Indicates if this request is of a high, medium or low priority.
	  */
	public void setPriority (int Priority);

	/** Get Priority.
	  * Indicates if this request is of a high, medium or low priority.
	  */
	public int getPriority();

    /** Column name ratebased */
    public static final String COLUMNNAME_ratebased = "ratebased";

	/** Set Rate Based	  */
	public void setratebased (boolean ratebased);

	/** Get Rate Based	  */
	public boolean isratebased();

    /** Column name recoveryyear */
    public static final String COLUMNNAME_recoveryyear = "recoveryyear";

	/** Set Recover In Current Year	  */
	public void setrecoveryyear (boolean recoveryyear);

	/** Get Recover In Current Year	  */
	public boolean isrecoveryyear();

    /** Column name s_loantype_ID */
    public static final String COLUMNNAME_s_loantype_ID = "s_loantype_ID";

	/** Set Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID);

	/** Get Loan Type	  */
	public int gets_loantype_ID();

    /** Column name selfglimit */
    public static final String COLUMNNAME_selfglimit = "selfglimit";

	/** Set Self Guarantee Limit	  */
	public void setselfglimit (int selfglimit);

	/** Get Self Guarantee Limit	  */
	public int getselfglimit();

    /** Column name shareloanrule */
    public static final String COLUMNNAME_shareloanrule = "shareloanrule";

	/** Set Share/Loan Rule	  */
	public void setshareloanrule (int shareloanrule);

	/** Get Share/Loan Rule	  */
	public int getshareloanrule();

    /** Column name should_be_guaranteed */
    public static final String COLUMNNAME_should_be_guaranteed = "should_be_guaranteed";

	/** Set Should Be Guaranteed	  */
	public void setshould_be_guaranteed (boolean should_be_guaranteed);

	/** Get Should Be Guaranteed	  */
	public boolean isshould_be_guaranteed();

    /** Column name showonstatement */
    public static final String COLUMNNAME_showonstatement = "showonstatement";

	/** Set showonstatement	  */
	public void setshowonstatement (boolean showonstatement);

	/** Get showonstatement	  */
	public boolean isshowonstatement();

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
