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

/** Generated Interface for s_saccoinfo
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_saccoinfo 
{

    /** TableName=s_saccoinfo */
    public static final String Table_Name = "s_saccoinfo";

    /** AD_Table_ID=1000000 */
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

    /** Column name agmshares */
    public static final String COLUMNNAME_agmshares = "agmshares";

	/** Set AGM Shares	  */
	public void setagmshares (String agmshares);

	/** Get AGM Shares	  */
	public String getagmshares();

    /** Column name agmsharetype */
    public static final String COLUMNNAME_agmsharetype = "agmsharetype";

	/** Set AGM Share Type	  */
	public void setagmsharetype (String agmsharetype);

	/** Get AGM Share Type	  */
	public String getagmsharetype();

    /** Column name allowzeroguarantors */
    public static final String COLUMNNAME_allowzeroguarantors = "allowzeroguarantors";

	/** Set Allow Zero Guarantors	  */
	public void setallowzeroguarantors (boolean allowzeroguarantors);

	/** Get Allow Zero Guarantors	  */
	public boolean isallowzeroguarantors();

    /** Column name backuppath */
    public static final String COLUMNNAME_backuppath = "backuppath";

	/** Set backuppath	  */
	public void setbackuppath (String backuppath);

	/** Get backuppath	  */
	public String getbackuppath();

    /** Column name baddebtsacc */
    public static final String COLUMNNAME_baddebtsacc = "baddebtsacc";

	/** Set Bad Debts Account	  */
	public void setbaddebtsacc (int baddebtsacc);

	/** Get Bad Debts Account	  */
	public int getbaddebtsacc();

	public I_C_ValidCombination getbaddebts() throws RuntimeException;

    /** Column name balanceroutinerun */
    public static final String COLUMNNAME_balanceroutinerun = "balanceroutinerun";

	/** Set balanceroutinerun	  */
	public void setbalanceroutinerun (boolean balanceroutinerun);

	/** Get balanceroutinerun	  */
	public boolean isbalanceroutinerun();

    /** Column name beginwithshares */
    public static final String COLUMNNAME_beginwithshares = "beginwithshares";

	/** Set Recovery Period: Begin With Shares	  */
	public void setbeginwithshares (boolean beginwithshares);

	/** Get Recovery Period: Begin With Shares	  */
	public boolean isbeginwithshares();

    /** Column name cashonly */
    public static final String COLUMNNAME_cashonly = "cashonly";

	/** Set Cash Only Remittance	  */
	public void setcashonly (boolean cashonly);

	/** Get Cash Only Remittance	  */
	public boolean iscashonly();

    /** Column name countryf */
    public static final String COLUMNNAME_countryf = "countryf";

	/** Set countryf	  */
	public void setcountryf (String countryf);

	/** Get countryf	  */
	public String getcountryf();

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

    /** Column name crregglcode */
    public static final String COLUMNNAME_crregglcode = "crregglcode";

	/** Set crregglcode	  */
	public void setcrregglcode (String crregglcode);

	/** Get crregglcode	  */
	public String getcrregglcode();

    /** Column name defaultchequedays */
    public static final String COLUMNNAME_defaultchequedays = "defaultchequedays";

	/** Set Default Cheque Clearance Days	  */
	public void setdefaultchequedays (int defaultchequedays);

	/** Get Default Cheque Clearance Days	  */
	public int getdefaultchequedays();

    /** Column name departmentsort */
    public static final String COLUMNNAME_departmentsort = "departmentsort";

	/** Set departmentsort	  */
	public void setdepartmentsort (boolean departmentsort);

	/** Get departmentsort	  */
	public boolean isdepartmentsort();

    /** Column name divglcracc */
    public static final String COLUMNNAME_divglcracc = "divglcracc";

	/** Set Dividend GL Credit Account	  */
	public void setdivglcracc (int divglcracc);

	/** Get Dividend GL Credit Account	  */
	public int getdivglcracc();

	public I_C_ValidCombination getdivglcr() throws RuntimeException;

    /** Column name divgldracc */
    public static final String COLUMNNAME_divgldracc = "divgldracc";

	/** Set Dividend GL Drebit Account	  */
	public void setdivgldracc (int divgldracc);

	/** Get Dividend GL Drebit Account	  */
	public int getdivgldracc();

	public I_C_ValidCombination getdivgldr() throws RuntimeException;

    /** Column name emailsubject */
    public static final String COLUMNNAME_emailsubject = "emailsubject";

	/** Set emailsubject	  */
	public void setemailsubject (String emailsubject);

	/** Get emailsubject	  */
	public String getemailsubject();

    /** Column name emailtext */
    public static final String COLUMNNAME_emailtext = "emailtext";

	/** Set emailtext	  */
	public void setemailtext (String emailtext);

	/** Get emailtext	  */
	public String getemailtext();

    /** Column name endyearbalancingac */
    public static final String COLUMNNAME_endyearbalancingac = "endyearbalancingac";

	/** Set End Year Balancing Account	  */
	public void setendyearbalancingac (int endyearbalancingac);

	/** Get End Year Balancing Account	  */
	public int getendyearbalancingac();

	public I_C_ValidCombination getendyearbalancin() throws RuntimeException;

    /** Column name endyearmonth */
    public static final String COLUMNNAME_endyearmonth = "endyearmonth";

	/** Set End Year Month	  */
	public void setendyearmonth (int endyearmonth);

	/** Get End Year Month	  */
	public int getendyearmonth();

    /** Column name eomprocesson */
    public static final String COLUMNNAME_eomprocesson = "eomprocesson";

	/** Set End Of Month Processing Ongoing	  */
	public void seteomprocesson (boolean eomprocesson);

	/** Get End Of Month Processing Ongoing	  */
	public boolean iseomprocesson();

    /** Column name ignoreoverpaidint */
    public static final String COLUMNNAME_ignoreoverpaidint = "ignoreoverpaidint";

	/** Set Ignore OverPaid Interest	  */
	public void setignoreoverpaidint (boolean ignoreoverpaidint);

	/** Get Ignore OverPaid Interest	  */
	public boolean isignoreoverpaidint();

    /** Column name ignorepenaltyforsto */
    public static final String COLUMNNAME_ignorepenaltyforsto = "ignorepenaltyforsto";

	/** Set Ignore Penalty For Standing Order Loans	  */
	public void setignorepenaltyforsto (boolean ignorepenaltyforsto);

	/** Get Ignore Penalty For Standing Order Loans	  */
	public boolean isignorepenaltyforsto();

    /** Column name incomingmailserver */
    public static final String COLUMNNAME_incomingmailserver = "incomingmailserver";

	/** Set incomingmailserver	  */
	public void setincomingmailserver (String incomingmailserver);

	/** Get incomingmailserver	  */
	public String getincomingmailserver();

    /** Column name InterestReceivable_Acct */
    public static final String COLUMNNAME_InterestReceivable_Acct = "InterestReceivable_Acct";

	/** Set Interest Receivable GL A/C	  */
	public void setInterestReceivable_Acct (int InterestReceivable_Acct);

	/** Get Interest Receivable GL A/C	  */
	public int getInterestReceivable_Acct();

	public I_C_ValidCombination getInterestReceivable_A() throws RuntimeException;

    /** Column name IsAccrual */
    public static final String COLUMNNAME_IsAccrual = "IsAccrual";

	/** Set Accrual.
	  * Indicates if Accrual or Cash Based accounting will be used
	  */
	public void setIsAccrual (boolean IsAccrual);

	/** Get Accrual.
	  * Indicates if Accrual or Cash Based accounting will be used
	  */
	public boolean isAccrual();

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

    /** Column name lastpayableno */
    public static final String COLUMNNAME_lastpayableno = "lastpayableno";

	/** Set lastpayableno	  */
	public void setlastpayableno (String lastpayableno);

	/** Get lastpayableno	  */
	public String getlastpayableno();

    /** Column name lastreceivableno */
    public static final String COLUMNNAME_lastreceivableno = "lastreceivableno";

	/** Set lastreceivableno	  */
	public void setlastreceivableno (String lastreceivableno);

	/** Get lastreceivableno	  */
	public String getlastreceivableno();

    /** Column name loansposted */
    public static final String COLUMNNAME_loansposted = "loansposted";

	/** Set loansposted	  */
	public void setloansposted (String loansposted);

	/** Get loansposted	  */
	public String getloansposted();

    /** Column name mcodelength */
    public static final String COLUMNNAME_mcodelength = "mcodelength";

	/** Set MCode Length	  */
	public void setmcodelength (int mcodelength);

	/** Get MCode Length	  */
	public int getmcodelength();

    /** Column name mcodeprefix */
    public static final String COLUMNNAME_mcodeprefix = "mcodeprefix";

	/** Set MCode Prefix	  */
	public void setmcodeprefix (String mcodeprefix);

	/** Get MCode Prefix	  */
	public String getmcodeprefix();

    /** Column name membersgl */
    public static final String COLUMNNAME_membersgl = "membersgl";

	/** Set membersgl	  */
	public void setmembersgl (String membersgl);

	/** Get membersgl	  */
	public String getmembersgl();

    /** Column name minconsistentcontrib */
    public static final String COLUMNNAME_minconsistentcontrib = "minconsistentcontrib";

	/** Set Minimum Consistent Contribution	  */
	public void setminconsistentcontrib (int minconsistentcontrib);

	/** Get Minimum Consistent Contribution	  */
	public int getminconsistentcontrib();

    /** Column name minfreeshares */
    public static final String COLUMNNAME_minfreeshares = "minfreeshares";

	/** Set Min Free Shares	  */
	public void setminfreeshares (BigDecimal minfreeshares);

	/** Get Min Free Shares	  */
	public BigDecimal getminfreeshares();

    /** Column name mpayrollprefix */
    public static final String COLUMNNAME_mpayrollprefix = "mpayrollprefix";

	/** Set MPayroll Prefix	  */
	public void setmpayrollprefix (String mpayrollprefix);

	/** Get MPayroll Prefix	  */
	public String getmpayrollprefix();

    /** Column name newid */
    public static final String COLUMNNAME_newid = "newid";

	/** Set newid	  */
	public void setnewid (int newid);

	/** Get newid	  */
	public int getnewid();

    /** Column name outgoingmailserver */
    public static final String COLUMNNAME_outgoingmailserver = "outgoingmailserver";

	/** Set outgoingmailserver	  */
	public void setoutgoingmailserver (String outgoingmailserver);

	/** Get outgoingmailserver	  */
	public String getoutgoingmailserver();

    /** Column name overdue_penalty_days */
    public static final String COLUMNNAME_overdue_penalty_days = "overdue_penalty_days";

	/** Set Overdue Penalty Days	  */
	public void setoverdue_penalty_days (int overdue_penalty_days);

	/** Get Overdue Penalty Days	  */
	public int getoverdue_penalty_days();

    /** Column name overdue_penalty_formula */
    public static final String COLUMNNAME_overdue_penalty_formula = "overdue_penalty_formula";

	/** Set Overdue Penalty Fomula	  */
	public void setoverdue_penalty_formula (String overdue_penalty_formula);

	/** Get Overdue Penalty Fomula	  */
	public String getoverdue_penalty_formula();

    /** Column name provisionacc */
    public static final String COLUMNNAME_provisionacc = "provisionacc";

	/** Set Provision Account	  */
	public void setprovisionacc (int provisionacc);

	/** Get Provision Account	  */
	public int getprovisionacc();

	public I_C_ValidCombination getprovision() throws RuntimeException;

    /** Column name regfee */
    public static final String COLUMNNAME_regfee = "regfee";

	/** Set Registration Fee	  */
	public void setregfee (BigDecimal regfee);

	/** Get Registration Fee	  */
	public BigDecimal getregfee();

    /** Column name regglcode */
    public static final String COLUMNNAME_regglcode = "regglcode";

	/** Set regglcode	  */
	public void setregglcode (String regglcode);

	/** Get regglcode	  */
	public String getregglcode();

    /** Column name reportsorttype */
    public static final String COLUMNNAME_reportsorttype = "reportsorttype";

	/** Set reportsorttype	  */
	public void setreportsorttype (String reportsorttype);

	/** Get reportsorttype	  */
	public String getreportsorttype();

    /** Column name s_saccoinfo_ID */
    public static final String COLUMNNAME_s_saccoinfo_ID = "s_saccoinfo_ID";

	/** Set s_saccoinfo ID	  */
	public void sets_saccoinfo_ID (int s_saccoinfo_ID);

	/** Get s_saccoinfo ID	  */
	public int gets_saccoinfo_ID();

    /** Column name saccoactivatedebit */
    public static final String COLUMNNAME_saccoactivatedebit = "saccoactivatedebit";

	/** Set saccoactivatedebit	  */
	public void setsaccoactivatedebit (boolean saccoactivatedebit);

	/** Get saccoactivatedebit	  */
	public boolean issaccoactivatedebit();

    /** Column name saccoaddress */
    public static final String COLUMNNAME_saccoaddress = "saccoaddress";

	/** Set Physical Address:	  */
	public void setsaccoaddress (String saccoaddress);

	/** Get Physical Address:	  */
	public String getsaccoaddress();

    /** Column name saccocity */
    public static final String COLUMNNAME_saccocity = "saccocity";

	/** Set City/Location:	  */
	public void setsaccocity (String saccocity);

	/** Get City/Location:	  */
	public String getsaccocity();

    /** Column name saccocontactperson */
    public static final String COLUMNNAME_saccocontactperson = "saccocontactperson";

	/** Set Contact Person:	  */
	public void setsaccocontactperson (String saccocontactperson);

	/** Get Contact Person:	  */
	public String getsaccocontactperson();

    /** Column name saccocountry */
    public static final String COLUMNNAME_saccocountry = "saccocountry";

	/** Set Country	  */
	public void setsaccocountry (String saccocountry);

	/** Get Country	  */
	public String getsaccocountry();

    /** Column name saccocurrent */
    public static final String COLUMNNAME_saccocurrent = "saccocurrent";

	/** Set saccocurrent	  */
	public void setsaccocurrent (int saccocurrent);

	/** Get saccocurrent	  */
	public int getsaccocurrent();

    /** Column name saccodatabasename */
    public static final String COLUMNNAME_saccodatabasename = "saccodatabasename";

	/** Set saccodatabasename	  */
	public void setsaccodatabasename (String saccodatabasename);

	/** Get saccodatabasename	  */
	public String getsaccodatabasename();

    /** Column name saccodormancyage */
    public static final String COLUMNNAME_saccodormancyage = "saccodormancyage";

	/** Set saccodormancyage	  */
	public void setsaccodormancyage (int saccodormancyage);

	/** Get saccodormancyage	  */
	public int getsaccodormancyage();

    /** Column name saccoemail */
    public static final String COLUMNNAME_saccoemail = "saccoemail";

	/** Set Email Address:	  */
	public void setsaccoemail (String saccoemail);

	/** Get Email Address:	  */
	public String getsaccoemail();

    /** Column name saccofax */
    public static final String COLUMNNAME_saccofax = "saccofax";

	/** Set Sacco Fax	  */
	public void setsaccofax (String saccofax);

	/** Get Sacco Fax	  */
	public String getsaccofax();

    /** Column name saccofrequency */
    public static final String COLUMNNAME_saccofrequency = "saccofrequency";

	/** Set saccofrequency	  */
	public void setsaccofrequency (String saccofrequency);

	/** Get saccofrequency	  */
	public String getsaccofrequency();

    /** Column name saccoimage */
    public static final String COLUMNNAME_saccoimage = "saccoimage";

	/** Set saccoimage	  */
	public void setsaccoimage (String saccoimage);

	/** Get saccoimage	  */
	public String getsaccoimage();

    /** Column name saccointerestcalculation */
    public static final String COLUMNNAME_saccointerestcalculation = "saccointerestcalculation";

	/** Set saccointerestcalculation	  */
	public void setsaccointerestcalculation (String saccointerestcalculation);

	/** Get saccointerestcalculation	  */
	public String getsaccointerestcalculation();

    /** Column name saccolastprint */
    public static final String COLUMNNAME_saccolastprint = "saccolastprint";

	/** Set saccolastprint	  */
	public void setsaccolastprint (Timestamp saccolastprint);

	/** Get saccolastprint	  */
	public Timestamp getsaccolastprint();

    /** Column name saccolinkfosa */
    public static final String COLUMNNAME_saccolinkfosa = "saccolinkfosa";

	/** Set Link To FOSA	  */
	public void setsaccolinkfosa (boolean saccolinkfosa);

	/** Get Link To FOSA	  */
	public boolean issaccolinkfosa();

    /** Column name saccolinkgeneralledger */
    public static final String COLUMNNAME_saccolinkgeneralledger = "saccolinkgeneralledger";

	/** Set Link To Accounting	  */
	public void setsaccolinkgeneralledger (boolean saccolinkgeneralledger);

	/** Get Link To Accounting	  */
	public boolean issaccolinkgeneralledger();

    /** Column name saccomaxnokage */
    public static final String COLUMNNAME_saccomaxnokage = "saccomaxnokage";

	/** Set saccomaxnokage	  */
	public void setsaccomaxnokage (int saccomaxnokage);

	/** Get saccomaxnokage	  */
	public int getsaccomaxnokage();

    /** Column name saccomaxtoguarantee */
    public static final String COLUMNNAME_saccomaxtoguarantee = "saccomaxtoguarantee";

	/** Set Max No Of Loans To Be Guaranteed	  */
	public void setsaccomaxtoguarantee (int saccomaxtoguarantee);

	/** Get Max No Of Loans To Be Guaranteed	  */
	public int getsaccomaxtoguarantee();

    /** Column name saccominmbrage */
    public static final String COLUMNNAME_saccominmbrage = "saccominmbrage";

	/** Set saccominmbrage	  */
	public void setsaccominmbrage (int saccominmbrage);

	/** Get saccominmbrage	  */
	public int getsaccominmbrage();

    /** Column name saccominnokage */
    public static final String COLUMNNAME_saccominnokage = "saccominnokage";

	/** Set saccominnokage	  */
	public void setsaccominnokage (int saccominnokage);

	/** Get saccominnokage	  */
	public int getsaccominnokage();

    /** Column name sacconame */
    public static final String COLUMNNAME_sacconame = "sacconame";

	/** Set Sacco Name/Description	  */
	public void setsacconame (String sacconame);

	/** Get Sacco Name/Description	  */
	public String getsacconame();

    /** Column name saccoperiod */
    public static final String COLUMNNAME_saccoperiod = "saccoperiod";

	/** Set saccoperiod	  */
	public void setsaccoperiod (int saccoperiod);

	/** Get saccoperiod	  */
	public int getsaccoperiod();

    /** Column name saccoperiod_ID */
    public static final String COLUMNNAME_saccoperiod_ID = "saccoperiod_ID";

	/** Set Current Period	  */
	public void setsaccoperiod_ID (int saccoperiod_ID);

	/** Get Current Period	  */
	public int getsaccoperiod_ID();


    /** Column name saccopobox */
    public static final String COLUMNNAME_saccopobox = "saccopobox";

	/** Set P.O Box Number:	  */
	public void setsaccopobox (String saccopobox);

	/** Get P.O Box Number:	  */
	public String getsaccopobox();

    /** Column name saccopostalcode */
    public static final String COLUMNNAME_saccopostalcode = "saccopostalcode";

	/** Set Postal Code:	  */
	public void setsaccopostalcode (String saccopostalcode);

	/** Get Postal Code:	  */
	public String getsaccopostalcode();

    /** Column name saccoretirementage */
    public static final String COLUMNNAME_saccoretirementage = "saccoretirementage";

	/** Set saccoretirementage	  */
	public void setsaccoretirementage (int saccoretirementage);

	/** Get saccoretirementage	  */
	public int getsaccoretirementage();

    /** Column name saccoroundcurrency */
    public static final String COLUMNNAME_saccoroundcurrency = "saccoroundcurrency";

	/** Set Round Currency:	  */
	public void setsaccoroundcurrency (BigDecimal saccoroundcurrency);

	/** Get Round Currency:	  */
	public BigDecimal getsaccoroundcurrency();

    /** Column name saccotel1 */
    public static final String COLUMNNAME_saccotel1 = "saccotel1";

	/** Set Telephone # 1:	  */
	public void setsaccotel1 (String saccotel1);

	/** Get Telephone # 1:	  */
	public String getsaccotel1();

    /** Column name saccotel2 */
    public static final String COLUMNNAME_saccotel2 = "saccotel2";

	/** Set Telephone # 2:	  */
	public void setsaccotel2 (String saccotel2);

	/** Get Telephone # 2:	  */
	public String getsaccotel2();

    /** Column name saccotel3 */
    public static final String COLUMNNAME_saccotel3 = "saccotel3";

	/** Set Telephone # 3:	  */
	public void setsaccotel3 (String saccotel3);

	/** Get Telephone # 3:	  */
	public String getsaccotel3();

    /** Column name saccotel4 */
    public static final String COLUMNNAME_saccotel4 = "saccotel4";

	/** Set Telephone # 4:	  */
	public void setsaccotel4 (String saccotel4);

	/** Get Telephone # 4:	  */
	public String getsaccotel4();

    /** Column name saccototalrepaymentconstant */
    public static final String COLUMNNAME_saccototalrepaymentconstant = "saccototalrepaymentconstant";

	/** Set saccototalrepaymentconstant	  */
	public void setsaccototalrepaymentconstant (int saccototalrepaymentconstant);

	/** Get saccototalrepaymentconstant	  */
	public int getsaccototalrepaymentconstant();

    /** Column name saccoweb */
    public static final String COLUMNNAME_saccoweb = "saccoweb";

	/** Set Website http://	  */
	public void setsaccoweb (String saccoweb);

	/** Get Website http://	  */
	public String getsaccoweb();

    /** Column name senderaddress */
    public static final String COLUMNNAME_senderaddress = "senderaddress";

	/** Set senderaddress	  */
	public void setsenderaddress (String senderaddress);

	/** Get senderaddress	  */
	public String getsenderaddress();

    /** Column name senderuserid */
    public static final String COLUMNNAME_senderuserid = "senderuserid";

	/** Set senderuserid	  */
	public void setsenderuserid (String senderuserid);

	/** Get senderuserid	  */
	public String getsenderuserid();

    /** Column name setaccdormance */
    public static final String COLUMNNAME_setaccdormance = "setaccdormance";

	/** Set Set Account Dormance	  */
	public void setsetaccdormance (int setaccdormance);

	/** Get Set Account Dormance	  */
	public int getsetaccdormance();

    /** Column name setkinage */
    public static final String COLUMNNAME_setkinage = "setkinage";

	/** Set Set Next of Kin Age Limit(Years)	  */
	public void setsetkinage (int setkinage);

	/** Get Set Next of Kin Age Limit(Years)	  */
	public int getsetkinage();

    /** Column name setmembershipage */
    public static final String COLUMNNAME_setmembershipage = "setmembershipage";

	/** Set Set Membership Age Limit	  */
	public void setsetmembershipage (int setmembershipage);

	/** Get Set Membership Age Limit	  */
	public int getsetmembershipage();

    /** Column name setretireage */
    public static final String COLUMNNAME_setretireage = "setretireage";

	/** Set setretireage	  */
	public void setsetretireage (int setretireage);

	/** Get setretireage	  */
	public int getsetretireage();

    /** Column name sharecode */
    public static final String COLUMNNAME_sharecode = "sharecode";

	/** Set Share Code / Ref #	  */
	public void setsharecode (String sharecode);

	/** Get Share Code / Ref #	  */
	public String getsharecode();

    /** Column name shareid */
    public static final String COLUMNNAME_shareid = "shareid";

	/** Set shareid	  */
	public void setshareid (int shareid);

	/** Get shareid	  */
	public int getshareid();

    /** Column name sharesposted */
    public static final String COLUMNNAME_sharesposted = "sharesposted";

	/** Set sharesposted	  */
	public void setsharesposted (String sharesposted);

	/** Get sharesposted	  */
	public String getsharesposted();

    /** Column name systemidletime */
    public static final String COLUMNNAME_systemidletime = "systemidletime";

	/** Set System Idle Time	  */
	public void setsystemidletime (int systemidletime);

	/** Get System Idle Time	  */
	public int getsystemidletime();

    /** Column name templatelocation */
    public static final String COLUMNNAME_templatelocation = "templatelocation";

	/** Set templatelocation	  */
	public void settemplatelocation (String templatelocation);

	/** Get templatelocation	  */
	public String gettemplatelocation();

    /** Column name transportsacco */
    public static final String COLUMNNAME_transportsacco = "transportsacco";

	/** Set transportsacco	  */
	public void settransportsacco (int transportsacco);

	/** Get transportsacco	  */
	public int gettransportsacco();

    /** Column name UnEarnedInterest_Acct */
    public static final String COLUMNNAME_UnEarnedInterest_Acct = "UnEarnedInterest_Acct";

	/** Set Unearned Interest GL A/C.
	  * Account for unearned revenue
	  */
	public void setUnEarnedInterest_Acct (int UnEarnedInterest_Acct);

	/** Get Unearned Interest GL A/C.
	  * Account for unearned revenue
	  */
	public int getUnEarnedInterest_Acct();

	public I_C_ValidCombination getUnEarnedInterest_A() throws RuntimeException;

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

    /** Column name updatedsharebal */
    public static final String COLUMNNAME_updatedsharebal = "updatedsharebal";

	/** Set updatedsharebal	  */
	public void setupdatedsharebal (boolean updatedsharebal);

	/** Get updatedsharebal	  */
	public boolean isupdatedsharebal();

    /** Column name usepayrollcode */
    public static final String COLUMNNAME_usepayrollcode = "usepayrollcode";

	/** Set Use MPayroll For General Ledger Referencing	  */
	public void setusepayrollcode (boolean usepayrollcode);

	/** Get Use MPayroll For General Ledger Referencing	  */
	public boolean isusepayrollcode();

    /** Column name usesum */
    public static final String COLUMNNAME_usesum = "usesum";

	/** Set Use Sum Of All Savings/Shares	  */
	public void setusesum (boolean usesum);

	/** Get Use Sum Of All Savings/Shares	  */
	public boolean isusesum();

    /** Column name uuid */
    public static final String COLUMNNAME_uuid = "uuid";

	/** Set uuid	  */
	public void setuuid (String uuid);

	/** Get uuid	  */
	public String getuuid();

    /** Column name withdrawalnotice */
    public static final String COLUMNNAME_withdrawalnotice = "withdrawalnotice";

	/** Set Withdrawal Notice	  */
	public void setwithdrawalnotice (int withdrawalnotice);

	/** Get Withdrawal Notice	  */
	public int getwithdrawalnotice();
}
