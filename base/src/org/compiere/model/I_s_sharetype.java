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

/** Generated Interface for s_sharetype
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_sharetype 
{

    /** TableName=s_sharetype */
    public static final String Table_Name = "s_sharetype";

    /** AD_Table_ID=1000007 */
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

    /** Column name annualinterestrate */
    public static final String COLUMNNAME_annualinterestrate = "annualinterestrate";

	/** Set Annual Interest Rate	  */
	public void setannualinterestrate (int annualinterestrate);

	/** Get Annual Interest Rate	  */
	public int getannualinterestrate();

    /** Column name blocked */
    public static final String COLUMNNAME_blocked = "blocked";

	/** Set Blocked	  */
	public void setblocked (boolean blocked);

	/** Get Blocked	  */
	public boolean isblocked();

    /** Column name canbewithdrawn */
    public static final String COLUMNNAME_canbewithdrawn = "canbewithdrawn";

	/** Set Can Be Withdrawn	  */
	public void setcanbewithdrawn (boolean canbewithdrawn);

	/** Get Can Be Withdrawn	  */
	public boolean iscanbewithdrawn();

    /** Column name canearnannaulinterest */
    public static final String COLUMNNAME_canearnannaulinterest = "canearnannaulinterest";

	/** Set Can Earn Annual Interest	  */
	public void setcanearnannaulinterest (boolean canearnannaulinterest);

	/** Get Can Earn Annual Interest	  */
	public boolean iscanearnannaulinterest();

    /** Column name canearndividends */
    public static final String COLUMNNAME_canearndividends = "canearndividends";

	/** Set Can Earn Dividends	  */
	public void setcanearndividends (boolean canearndividends);

	/** Get Can Earn Dividends	  */
	public boolean iscanearndividends();

    /** Column name canguaranteeloan */
    public static final String COLUMNNAME_canguaranteeloan = "canguaranteeloan";

	/** Set Can Guarantee Loan	  */
	public void setcanguaranteeloan (boolean canguaranteeloan);

	/** Get Can Guarantee Loan	  */
	public boolean iscanguaranteeloan();

    /** Column name chargecode */
    public static final String COLUMNNAME_chargecode = "chargecode";

	/** Set chargecode	  */
	public void setchargecode (String chargecode);

	/** Get chargecode	  */
	public String getchargecode();

    /** Column name chequedays */
    public static final String COLUMNNAME_chequedays = "chequedays";

	/** Set Cheque Days	  */
	public void setchequedays (int chequedays);

	/** Get Cheque Days	  */
	public int getchequedays();

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

    /** Column name display */
    public static final String COLUMNNAME_display = "display";

	/** Set Display In Statement	  */
	public void setdisplay (boolean display);

	/** Get Display In Statement	  */
	public boolean isdisplay();

    /** Column name dividendgl_Acct */
    public static final String COLUMNNAME_dividendgl_Acct = "dividendgl_Acct";

	/** Set Dividen GL Code	  */
	public void setdividendgl_Acct (int dividendgl_Acct);

	/** Get Dividen GL Code	  */
	public int getdividendgl_Acct();

	public I_C_ValidCombination getdividendgl_A() throws RuntimeException;

    /** Column name hasmaxshares */
    public static final String COLUMNNAME_hasmaxshares = "hasmaxshares";

	/** Set Has Maximum Shares	  */
	public void sethasmaxshares (boolean hasmaxshares);

	/** Get Has Maximum Shares	  */
	public boolean ishasmaxshares();

    /** Column name hasminshares */
    public static final String COLUMNNAME_hasminshares = "hasminshares";

	/** Set Has Minimum Shares	  */
	public void sethasminshares (boolean hasminshares);

	/** Get Has Minimum Shares	  */
	public boolean ishasminshares();

    /** Column name interestgl_Acct */
    public static final String COLUMNNAME_interestgl_Acct = "interestgl_Acct";

	/** Set Interest GL Code	  */
	public void setinterestgl_Acct (int interestgl_Acct);

	/** Get Interest GL Code	  */
	public int getinterestgl_Acct();

	public I_C_ValidCombination getinterestgl_A() throws RuntimeException;

    /** Column name intfrequency */
    public static final String COLUMNNAME_intfrequency = "intfrequency";

	/** Set Interest Frequency(M)	  */
	public void setintfrequency (int intfrequency);

	/** Get Interest Frequency(M)	  */
	public int getintfrequency();

    /** Column name intrate */
    public static final String COLUMNNAME_intrate = "intrate";

	/** Set Interest Rate(PM)	  */
	public void setintrate (int intrate);

	/** Get Interest Rate(PM)	  */
	public int getintrate();

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

    /** Column name isbenevolent */
    public static final String COLUMNNAME_isbenevolent = "isbenevolent";

	/** Set Is Benevolent	  */
	public void setisbenevolent (boolean isbenevolent);

	/** Get Is Benevolent	  */
	public boolean isbenevolent();

    /** Column name isdefaultaccount */
    public static final String COLUMNNAME_isdefaultaccount = "isdefaultaccount";

	/** Set Is Default Account	  */
	public void setisdefaultaccount (boolean isdefaultaccount);

	/** Get Is Default Account	  */
	public boolean isdefaultaccount();

    /** Column name isfixeddeposit */
    public static final String COLUMNNAME_isfixeddeposit = "isfixeddeposit";

	/** Set Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit);

	/** Get Is Fixed Deposit	  */
	public boolean isfixeddeposit();

    /** Column name isfosa */
    public static final String COLUMNNAME_isfosa = "isfosa";

	/** Set Is FOSA	  */
	public void setisfosa (boolean isfosa);

	/** Get Is FOSA	  */
	public boolean isfosa();

    /** Column name minbalance */
    public static final String COLUMNNAME_minbalance = "minbalance";

	/** Set Minimum Balance	  */
	public void setminbalance (BigDecimal minbalance);

	/** Get Minimum Balance	  */
	public BigDecimal getminbalance();

    /** Column name mincount */
    public static final String COLUMNNAME_mincount = "mincount";

	/** Set Min Contribution	  */
	public void setmincount (BigDecimal mincount);

	/** Get Min Contribution	  */
	public BigDecimal getmincount();

    /** Column name minshares */
    public static final String COLUMNNAME_minshares = "minshares";

	/** Set Minimum Shares	  */
	public void setminshares (BigDecimal minshares);

	/** Get Minimum Shares	  */
	public BigDecimal getminshares();

    /** Column name noticedays */
    public static final String COLUMNNAME_noticedays = "noticedays";

	/** Set Notice Days	  */
	public void setnoticedays (int noticedays);

	/** Get Notice Days	  */
	public int getnoticedays();

    /** Column name payrollcodeid */
    public static final String COLUMNNAME_payrollcodeid = "payrollcodeid";

	/** Set payrollcodeid	  */
	public void setpayrollcodeid (int payrollcodeid);

	/** Get payrollcodeid	  */
	public int getpayrollcodeid();

    /** Column name priority_ */
    public static final String COLUMNNAME_priority_ = "priority_";

	/** Set priority_	  */
	public void setpriority_ (int priority_);

	/** Get priority_	  */
	public int getpriority_();

    /** Column name reqnotice */
    public static final String COLUMNNAME_reqnotice = "reqnotice";

	/** Set Require Refund/Withdrawal Notice	  */
	public void setreqnotice (boolean reqnotice);

	/** Get Require Refund/Withdrawal Notice	  */
	public boolean isreqnotice();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

    /** Column name sharecapital */
    public static final String COLUMNNAME_sharecapital = "sharecapital";

	/** Set Share Capital	  */
	public void setsharecapital (BigDecimal sharecapital);

	/** Get Share Capital	  */
	public BigDecimal getsharecapital();

    /** Column name sharecode */
    public static final String COLUMNNAME_sharecode = "sharecode";

	/** Set Share Code / Ref #	  */
	public void setsharecode (String sharecode);

	/** Get Share Code / Ref #	  */
	public String getsharecode();

    /** Column name sharedividendrate */
    public static final String COLUMNNAME_sharedividendrate = "sharedividendrate";

	/** Set Dividen Rate	  */
	public void setsharedividendrate (int sharedividendrate);

	/** Get Dividen Rate	  */
	public int getsharedividendrate();

    /** Column name sharegl_Acct */
    public static final String COLUMNNAME_sharegl_Acct = "sharegl_Acct";

	/** Set Share Type GL Code	  */
	public void setsharegl_Acct (int sharegl_Acct);

	/** Get Share Type GL Code	  */
	public int getsharegl_Acct();

	public I_C_ValidCombination getsharegl_A() throws RuntimeException;

    /** Column name sharemaxbalance */
    public static final String COLUMNNAME_sharemaxbalance = "sharemaxbalance";

	/** Set Maximum Capital	  */
	public void setsharemaxbalance (BigDecimal sharemaxbalance);

	/** Get Maximum Capital	  */
	public BigDecimal getsharemaxbalance();

    /** Column name sharename */
    public static final String COLUMNNAME_sharename = "sharename";

	/** Set Share Type Description	  */
	public void setsharename (String sharename);

	/** Get Share Type Description	  */
	public String getsharename();

    /** Column name sharewithholdingtax */
    public static final String COLUMNNAME_sharewithholdingtax = "sharewithholdingtax";

	/** Set Withholding Tax %	  */
	public void setsharewithholdingtax (int sharewithholdingtax);

	/** Get Withholding Tax %	  */
	public int getsharewithholdingtax();

    /** Column name smschargecode_Acct */
    public static final String COLUMNNAME_smschargecode_Acct = "smschargecode_Acct";

	/** Set SMS Charge GL Code	  */
	public void setsmschargecode_Acct (int smschargecode_Acct);

	/** Get SMS Charge GL Code	  */
	public int getsmschargecode_Acct();

	public I_C_ValidCombination getsmschargecode_A() throws RuntimeException;

    /** Column name taxcode_Acct */
    public static final String COLUMNNAME_taxcode_Acct = "taxcode_Acct";

	/** Set Tax GL Account	  */
	public void settaxcode_Acct (int taxcode_Acct);

	/** Get Tax GL Account	  */
	public int gettaxcode_Acct();

	public I_C_ValidCombination gettaxcode_A() throws RuntimeException;

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

    /** Column name useforsms */
    public static final String COLUMNNAME_useforsms = "useforsms";

	/** Set Use For SMS	  */
	public void setuseforsms (boolean useforsms);

	/** Get Use For SMS	  */
	public boolean isuseforsms();

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();
}
