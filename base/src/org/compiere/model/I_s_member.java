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

/** Generated Interface for s_member
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_member 
{

    /** TableName=s_member */
    public static final String Table_Name = "s_member";

    /** AD_Table_ID=1000010 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

    /** Column name address */
    public static final String COLUMNNAME_address = "address";

	/** Set Physical Address	  */
	public void setaddress (String address);

	/** Get Physical Address	  */
	public String getaddress();

    /** Column name bankaccno */
    public static final String COLUMNNAME_bankaccno = "bankaccno";

	/** Set Bank Account No.	  */
	public void setbankaccno (String bankaccno);

	/** Get Bank Account No.	  */
	public String getbankaccno();

    /** Column name blocked */
    public static final String COLUMNNAME_blocked = "blocked";

	/** Set Blocked	  */
	public void setblocked (boolean blocked);

	/** Get Blocked	  */
	public boolean isblocked();

    /** Column name capacity */
    public static final String COLUMNNAME_capacity = "capacity";

	/** Set Capacity	  */
	public void setcapacity (BigDecimal capacity);

	/** Get Capacity	  */
	public BigDecimal getcapacity();

    /** Column name certno */
    public static final String COLUMNNAME_certno = "certno";

	/** Set certno	  */
	public void setcertno (String certno);

	/** Get certno	  */
	public String getcertno();

    /** Column name contributionmode */
    public static final String COLUMNNAME_contributionmode = "contributionmode";

	/** Set Contribution Mode	  */
	public void setcontributionmode (String contributionmode);

	/** Get Contribution Mode	  */
	public String getcontributionmode();

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

    /** Column name datepaid */
    public static final String COLUMNNAME_datepaid = "datepaid";

	/** Set Date Paid	  */
	public void setdatepaid (Timestamp datepaid);

	/** Get Date Paid	  */
	public Timestamp getdatepaid();

    /** Column name defaultamount */
    public static final String COLUMNNAME_defaultamount = "defaultamount";

	/** Set defaultamount	  */
	public void setdefaultamount (BigDecimal defaultamount);

	/** Get defaultamount	  */
	public BigDecimal getdefaultamount();

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

    /** Column name disp004 */
    public static final String COLUMNNAME_disp004 = "disp004";

	/** Set disp004	  */
	public void setdisp004 (boolean disp004);

	/** Get disp004	  */
	public boolean isdisp004();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Member Number.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Member Number.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name dormancydate */
    public static final String COLUMNNAME_dormancydate = "dormancydate";

	/** Set dormancydate	  */
	public void setdormancydate (Timestamp dormancydate);

	/** Get dormancydate	  */
	public Timestamp getdormancydate();

    /** Column name driver */
    public static final String COLUMNNAME_driver = "driver";

	/** Set Driver	  */
	public void setdriver (String driver);

	/** Get Driver	  */
	public String getdriver();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name fosamember */
    public static final String COLUMNNAME_fosamember = "fosamember";

	/** Set Fosa Member ?	  */
	public void setfosamember (boolean fosamember);

	/** Get Fosa Member ?	  */
	public boolean isfosamember();

    /** Column name fosano */
    public static final String COLUMNNAME_fosano = "fosano";

	/** Set Fosa No	  */
	public void setfosano (String fosano);

	/** Get Fosa No	  */
	public String getfosano();

    /** Column name id_no */
    public static final String COLUMNNAME_id_no = "id_no";

	/** Set ID No:	  */
	public void setid_no (String id_no);

	/** Get ID No:	  */
	public String getid_no();

    /** Column name introduced */
    public static final String COLUMNNAME_introduced = "introduced";

	/** Set Introduced	  */
	public void setintroduced (boolean introduced);

	/** Get Introduced	  */
	public boolean isintroduced();

    /** Column name introducer_ID */
    public static final String COLUMNNAME_introducer_ID = "introducer_ID";

	/** Set Introducer	  */
	public void setintroducer_ID (int introducer_ID);

	/** Get Introducer	  */
	public int getintroducer_ID();

	public I_s_member getintroducer() throws RuntimeException;

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

    /** Column name isgroupacc */
    public static final String COLUMNNAME_isgroupacc = "isgroupacc";

	/** Set Group Account	  */
	public void setisgroupacc (boolean isgroupacc);

	/** Get Group Account	  */
	public boolean isgroupacc();

    /** Column name isjointacc */
    public static final String COLUMNNAME_isjointacc = "isjointacc";

	/** Set Joint Account	  */
	public void setisjointacc (boolean isjointacc);

	/** Get Joint Account	  */
	public boolean isjointacc();

    /** Column name isjunioracc */
    public static final String COLUMNNAME_isjunioracc = "isjunioracc";

	/** Set Junior Account	  */
	public void setisjunioracc (boolean isjunioracc);

	/** Get Junior Account	  */
	public boolean isjunioracc();

    /** Column name job_title */
    public static final String COLUMNNAME_job_title = "job_title";

	/** Set Job Title	  */
	public void setjob_title (String job_title);

	/** Get Job Title	  */
	public String getjob_title();

    /** Column name m_designation_ID */
    public static final String COLUMNNAME_m_designation_ID = "m_designation_ID";

	/** Set Sacco Designation	  */
	public void setm_designation_ID (int m_designation_ID);

	/** Get Sacco Designation	  */
	public int getm_designation_ID();

	public I_m_designation getm_designation() throws RuntimeException;

    /** Column name mcell */
    public static final String COLUMNNAME_mcell = "mcell";

	/** Set Cell Number:	  */
	public void setmcell (String mcell);

	/** Get Cell Number:	  */
	public String getmcell();

    /** Column name mcode */
    public static final String COLUMNNAME_mcode = "mcode";

	/** Set Member #	  */
	public void setmcode (String mcode);

	/** Get Member #	  */
	public String getmcode();

    /** Column name mcomments */
    public static final String COLUMNNAME_mcomments = "mcomments";

	/** Set Remarks / Comments:	  */
	public void setmcomments (String mcomments);

	/** Get Remarks / Comments:	  */
	public String getmcomments();

    /** Column name mdate */
    public static final String COLUMNNAME_mdate = "mdate";

	/** Set Member Registration Date	  */
	public void setmdate (Timestamp mdate);

	/** Get Member Registration Date	  */
	public Timestamp getmdate();

    /** Column name mdob */
    public static final String COLUMNNAME_mdob = "mdob";

	/** Set Date Of Birth:	  */
	public void setmdob (Timestamp mdob);

	/** Get Date Of Birth:	  */
	public Timestamp getmdob();

    /** Column name memberimage_ID */
    public static final String COLUMNNAME_memberimage_ID = "memberimage_ID";

	/** Set Member Image	  */
	public void setmemberimage_ID (int memberimage_ID);

	/** Get Member Image	  */
	public int getmemberimage_ID();

    /** Column name membersignature_ID */
    public static final String COLUMNNAME_membersignature_ID = "membersignature_ID";

	/** Set Member Signature	  */
	public void setmembersignature_ID (int membersignature_ID);

	/** Get Member Signature	  */
	public int getmembersignature_ID();

    /** Column name membertype */
    public static final String COLUMNNAME_membertype = "membertype";

	/** Set membertype	  */
	public void setmembertype (String membertype);

	/** Get membertype	  */
	public String getmembertype();

    /** Column name menddate */
    public static final String COLUMNNAME_menddate = "menddate";

	/** Set Termination Date:	  */
	public void setmenddate (Timestamp menddate);

	/** Get Termination Date:	  */
	public Timestamp getmenddate();

    /** Column name mfax */
    public static final String COLUMNNAME_mfax = "mfax";

	/** Set mfax	  */
	public void setmfax (String mfax);

	/** Get mfax	  */
	public String getmfax();

    /** Column name mfirstname */
    public static final String COLUMNNAME_mfirstname = "mfirstname";

	/** Set First Name	  */
	public void setmfirstname (String mfirstname);

	/** Get First Name	  */
	public String getmfirstname();

    /** Column name mgender */
    public static final String COLUMNNAME_mgender = "mgender";

	/** Set Gender	  */
	public void setmgender (String mgender);

	/** Get Gender	  */
	public String getmgender();

    /** Column name mgross */
    public static final String COLUMNNAME_mgross = "mgross";

	/** Set Gross Salary:	  */
	public void setmgross (BigDecimal mgross);

	/** Get Gross Salary:	  */
	public BigDecimal getmgross();

    /** Column name mmarital */
    public static final String COLUMNNAME_mmarital = "mmarital";

	/** Set Marital Status	  */
	public void setmmarital (String mmarital);

	/** Get Marital Status	  */
	public String getmmarital();

    /** Column name mnett */
    public static final String COLUMNNAME_mnett = "mnett";

	/** Set Nett Salary:	  */
	public void setmnett (BigDecimal mnett);

	/** Get Nett Salary:	  */
	public BigDecimal getmnett();

    /** Column name modificationdate */
    public static final String COLUMNNAME_modificationdate = "modificationdate";

	/** Set Date Last Modified	  */
	public void setmodificationdate (Timestamp modificationdate);

	/** Get Date Last Modified	  */
	public Timestamp getmodificationdate();

    /** Column name mothername */
    public static final String COLUMNNAME_mothername = "mothername";

	/** Set Middle Name	  */
	public void setmothername (String mothername);

	/** Get Middle Name	  */
	public String getmothername();

    /** Column name mpayroll */
    public static final String COLUMNNAME_mpayroll = "mpayroll";

	/** Set Payroll #	  */
	public void setmpayroll (String mpayroll);

	/** Get Payroll #	  */
	public String getmpayroll();

    /** Column name mpostaladdress */
    public static final String COLUMNNAME_mpostaladdress = "mpostaladdress";

	/** Set Postal Address	  */
	public void setmpostaladdress (String mpostaladdress);

	/** Get Postal Address	  */
	public String getmpostaladdress();

    /** Column name mstartdate */
    public static final String COLUMNNAME_mstartdate = "mstartdate";

	/** Set Start Date:	  */
	public void setmstartdate (Timestamp mstartdate);

	/** Get Start Date:	  */
	public Timestamp getmstartdate();

    /** Column name mstatus */
    public static final String COLUMNNAME_mstatus = "mstatus";

	/** Set Member Status	  */
	public void setmstatus (String mstatus);

	/** Get Member Status	  */
	public String getmstatus();

    /** Column name msurname */
    public static final String COLUMNNAME_msurname = "msurname";

	/** Set Surname	  */
	public void setmsurname (String msurname);

	/** Get Surname	  */
	public String getmsurname();

    /** Column name mtel1 */
    public static final String COLUMNNAME_mtel1 = "mtel1";

	/** Set Telephone #1	  */
	public void setmtel1 (String mtel1);

	/** Get Telephone #1	  */
	public String getmtel1();

    /** Column name mtel2 */
    public static final String COLUMNNAME_mtel2 = "mtel2";

	/** Set Telephone #2	  */
	public void setmtel2 (String mtel2);

	/** Get Telephone #2	  */
	public String getmtel2();

    /** Column name mtel3 */
    public static final String COLUMNNAME_mtel3 = "mtel3";

	/** Set mtel3	  */
	public void setmtel3 (String mtel3);

	/** Get mtel3	  */
	public String getmtel3();

    /** Column name mtitle */
    public static final String COLUMNNAME_mtitle = "mtitle";

	/** Set Title	  */
	public void setmtitle (String mtitle);

	/** Get Title	  */
	public String getmtitle();

    /** Column name mwithdrawaldate */
    public static final String COLUMNNAME_mwithdrawaldate = "mwithdrawaldate";

	/** Set Withdrawal Date:	  */
	public void setmwithdrawaldate (Timestamp mwithdrawaldate);

	/** Get Withdrawal Date:	  */
	public Timestamp getmwithdrawaldate();

    /** Column name newmember */
    public static final String COLUMNNAME_newmember = "newmember";

	/** Set newmember	  */
	public void setnewmember (boolean newmember);

	/** Get newmember	  */
	public boolean isnewmember();

    /** Column name owner */
    public static final String COLUMNNAME_owner = "owner";

	/** Set Owner	  */
	public void setowner (String owner);

	/** Get Owner	  */
	public String getowner();

    /** Column name ownernames */
    public static final String COLUMNNAME_ownernames = "ownernames";

	/** Set ownernames	  */
	public void setownernames (String ownernames);

	/** Get ownernames	  */
	public String getownernames();

    /** Column name picked */
    public static final String COLUMNNAME_picked = "picked";

	/** Set picked	  */
	public void setpicked (boolean picked);

	/** Get picked	  */
	public boolean ispicked();

    /** Column name reason */
    public static final String COLUMNNAME_reason = "reason";

	/** Set Reason	  */
	public void setreason (String reason);

	/** Get Reason	  */
	public String getreason();

    /** Column name regfee */
    public static final String COLUMNNAME_regfee = "regfee";

	/** Set Registration Fee	  */
	public void setregfee (BigDecimal regfee);

	/** Get Registration Fee	  */
	public BigDecimal getregfee();

    /** Column name route */
    public static final String COLUMNNAME_route = "route";

	/** Set Route	  */
	public void setroute (String route);

	/** Get Route	  */
	public String getroute();

    /** Column name s_branch_ID */
    public static final String COLUMNNAME_s_branch_ID = "s_branch_ID";

	/** Set Member Branch	  */
	public void sets_branch_ID (int s_branch_ID);

	/** Get Member Branch	  */
	public int gets_branch_ID();

	public I_s_branch gets_branch() throws RuntimeException;

    /** Column name s_department_ID */
    public static final String COLUMNNAME_s_department_ID = "s_department_ID";

	/** Set Department	  */
	public void sets_department_ID (int s_department_ID);

	/** Get Department	  */
	public int gets_department_ID();

	public I_s_department gets_department() throws RuntimeException;

    /** Column name s_employers_ID */
    public static final String COLUMNNAME_s_employers_ID = "s_employers_ID";

	/** Set Employer	  */
	public void sets_employers_ID (int s_employers_ID);

	/** Get Employer	  */
	public int gets_employers_ID();

	public I_s_employers gets_employers() throws RuntimeException;

    /** Column name s_grade_ID */
    public static final String COLUMNNAME_s_grade_ID = "s_grade_ID";

	/** Set Sacco Grade	  */
	public void sets_grade_ID (int s_grade_ID);

	/** Get Sacco Grade	  */
	public int gets_grade_ID();

	public I_s_grade gets_grade() throws RuntimeException;

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

    /** Column name s_station_ID */
    public static final String COLUMNNAME_s_station_ID = "s_station_ID";

	/** Set Station	  */
	public void sets_station_ID (int s_station_ID);

	/** Get Station	  */
	public int gets_station_ID();

	public I_s_station gets_station() throws RuntimeException;

    /** Column name saccoofficial */
    public static final String COLUMNNAME_saccoofficial = "saccoofficial";

	/** Set Sacco Official?	  */
	public void setsaccoofficial (boolean saccoofficial);

	/** Get Sacco Official?	  */
	public boolean issaccoofficial();

    /** Column name senior_member */
    public static final String COLUMNNAME_senior_member = "senior_member";

	/** Set Senior Member Account	  */
	public void setsenior_member (int senior_member);

	/** Get Senior Member Account	  */
	public int getsenior_member();

	public I_s_member getsenior_mem() throws RuntimeException;

    /** Column name sharestodateinowords */
    public static final String COLUMNNAME_sharestodateinowords = "sharestodateinowords";

	/** Set sharestodateinowords	  */
	public void setsharestodateinowords (String sharestodateinowords);

	/** Get sharestodateinowords	  */
	public String getsharestodateinowords();

    /** Column name tiedshares */
    public static final String COLUMNNAME_tiedshares = "tiedshares";

	/** Set Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares);

	/** Get Tied Shares	  */
	public BigDecimal gettiedshares();

    /** Column name transperiod */
    public static final String COLUMNNAME_transperiod = "transperiod";

	/** Set Period	  */
	public void settransperiod (String transperiod);

	/** Get Period	  */
	public String gettransperiod();

    /** Column name transyear */
    public static final String COLUMNNAME_transyear = "transyear";

	/** Set Transaction Year	  */
	public void settransyear (boolean transyear);

	/** Get Transaction Year	  */
	public boolean istransyear();

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
