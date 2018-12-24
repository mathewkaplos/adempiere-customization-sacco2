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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

import mat.mathew.SendMailSSL;

/** Generated Model for s_member
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_member extends PO implements I_s_member, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181219L;

    /** Standard Constructor */
    public X_s_member (Properties ctx, int s_member_ID, String trxName)
    {
      super (ctx, s_member_ID, trxName);
      /** if (s_member_ID == 0)
        {
			setDocumentNo (null);
			setmdate (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setmfirstname (null);
			setmothername (null);
			setmsurname (null);
			sets_member_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_member (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_s_member[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Physical Address.
		@param address Physical Address	  */
	public void setaddress (String address)
	{
		set_Value (COLUMNNAME_address, address);
	}

	/** Get Physical Address.
		@return Physical Address	  */
	public String getaddress () 
	{
		return (String)get_Value(COLUMNNAME_address);
	}

	/** Set Bank Account No..
		@param bankaccno Bank Account No.	  */
	public void setbankaccno (String bankaccno)
	{
		set_Value (COLUMNNAME_bankaccno, bankaccno);
	}

	/** Get Bank Account No..
		@return Bank Account No.	  */
	public String getbankaccno () 
	{
		return (String)get_Value(COLUMNNAME_bankaccno);
	}

	/** Set Blocked.
		@param blocked Blocked	  */
	public void setblocked (boolean blocked)
	{
		set_Value (COLUMNNAME_blocked, Boolean.valueOf(blocked));
	}

	/** Get Blocked.
		@return Blocked	  */
	public boolean isblocked () 
	{
		Object oo = get_Value(COLUMNNAME_blocked);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Capacity.
		@param capacity Capacity	  */
	public void setcapacity (BigDecimal capacity)
	{
		set_Value (COLUMNNAME_capacity, capacity);
	}

	/** Get Capacity.
		@return Capacity	  */
	public BigDecimal getcapacity () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_capacity);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set certno.
		@param certno certno	  */
	public void setcertno (String certno)
	{
		set_Value (COLUMNNAME_certno, certno);
	}

	/** Get certno.
		@return certno	  */
	public String getcertno () 
	{
		return (String)get_Value(COLUMNNAME_certno);
	}

	/** contributionmode AD_Reference_ID=1000002 */
	public static final int CONTRIBUTIONMODE_AD_Reference_ID=1000002;
	/** Cash = C */
	public static final String CONTRIBUTIONMODE_Cash = "C";
	/** Direct Deposit = D */
	public static final String CONTRIBUTIONMODE_DirectDeposit = "D";
	/** Payroll = P */
	public static final String CONTRIBUTIONMODE_Payroll = "P";
	/** Set Contribution Mode.
		@param contributionmode Contribution Mode	  */
	public void setcontributionmode (String contributionmode)
	{

		set_Value (COLUMNNAME_contributionmode, contributionmode);
	}

	/** Get Contribution Mode.
		@return Contribution Mode	  */
	public String getcontributionmode () 
	{
		return (String)get_Value(COLUMNNAME_contributionmode);
	}

	/** Set Date Paid.
		@param datepaid Date Paid	  */
	public void setdatepaid (Timestamp datepaid)
	{
		set_Value (COLUMNNAME_datepaid, datepaid);
	}

	/** Get Date Paid.
		@return Date Paid	  */
	public Timestamp getdatepaid () 
	{
		return (Timestamp)get_Value(COLUMNNAME_datepaid);
	}

	/** Set defaultamount.
		@param defaultamount defaultamount	  */
	public void setdefaultamount (BigDecimal defaultamount)
	{
		set_Value (COLUMNNAME_defaultamount, defaultamount);
	}

	/** Get defaultamount.
		@return defaultamount	  */
	public BigDecimal getdefaultamount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_defaultamount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set disp001.
		@param disp001 disp001	  */
	public void setdisp001 (boolean disp001)
	{
		set_Value (COLUMNNAME_disp001, Boolean.valueOf(disp001));
	}

	/** Get disp001.
		@return disp001	  */
	public boolean isdisp001 () 
	{
		Object oo = get_Value(COLUMNNAME_disp001);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set disp002.
		@param disp002 disp002	  */
	public void setdisp002 (boolean disp002)
	{
		set_Value (COLUMNNAME_disp002, Boolean.valueOf(disp002));
	}

	/** Get disp002.
		@return disp002	  */
	public boolean isdisp002 () 
	{
		Object oo = get_Value(COLUMNNAME_disp002);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Member Number.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Member Number.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set dormancydate.
		@param dormancydate dormancydate	  */
	public void setdormancydate (Timestamp dormancydate)
	{
		set_Value (COLUMNNAME_dormancydate, dormancydate);
	}

	/** Get dormancydate.
		@return dormancydate	  */
	public Timestamp getdormancydate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_dormancydate);
	}

	/** Set Driver.
		@param driver Driver	  */
	public void setdriver (String driver)
	{
		set_Value (COLUMNNAME_driver, driver);
	}

	/** Get Driver.
		@return Driver	  */
	public String getdriver () 
	{
		return (String)get_Value(COLUMNNAME_driver);
	}

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Fosa Member ?.
		@param fosamember Fosa Member ?	  */
	public void setfosamember (boolean fosamember)
	{
		set_Value (COLUMNNAME_fosamember, Boolean.valueOf(fosamember));
	}

	/** Get Fosa Member ?.
		@return Fosa Member ?	  */
	public boolean isfosamember () 
	{
		Object oo = get_Value(COLUMNNAME_fosamember);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Fosa No.
		@param fosano Fosa No	  */
	public void setfosano (String fosano)
	{
		set_Value (COLUMNNAME_fosano, fosano);
	}

	/** Get Fosa No.
		@return Fosa No	  */
	public String getfosano () 
	{
		return (String)get_Value(COLUMNNAME_fosano);
	}

	/** Set ID No:.
		@param id_no ID No:	  */
	public void setid_no (String id_no)
	{
		set_Value (COLUMNNAME_id_no, id_no);
	}

	/** Get ID No:.
		@return ID No:	  */
	public String getid_no () 
	{
		return (String)get_Value(COLUMNNAME_id_no);
	}

	/** Set introducerid.
		@param introducerid introducerid	  */
	public void setintroducerid (int introducerid)
	{
		set_Value (COLUMNNAME_introducerid, Integer.valueOf(introducerid));
	}

	/** Get introducerid.
		@return introducerid	  */
	public int getintroducerid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_introducerid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Group Account.
		@param isgroupacc Group Account	  */
	public void setisgroupacc (boolean isgroupacc)
	{
		set_Value (COLUMNNAME_isgroupacc, Boolean.valueOf(isgroupacc));
	}

	/** Get Group Account.
		@return Group Account	  */
	public boolean isgroupacc () 
	{
		Object oo = get_Value(COLUMNNAME_isgroupacc);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Joint Account.
		@param isjointacc Joint Account	  */
	public void setisjointacc (boolean isjointacc)
	{
		set_Value (COLUMNNAME_isjointacc, Boolean.valueOf(isjointacc));
	}

	/** Get Joint Account.
		@return Joint Account	  */
	public boolean isjointacc () 
	{
		Object oo = get_Value(COLUMNNAME_isjointacc);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Junior Account.
		@param isjunioracc Junior Account	  */
	public void setisjunioracc (boolean isjunioracc)
	{
		set_Value (COLUMNNAME_isjunioracc, Boolean.valueOf(isjunioracc));
	}

	/** Get Junior Account.
		@return Junior Account	  */
	public boolean isjunioracc () 
	{
		Object oo = get_Value(COLUMNNAME_isjunioracc);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_m_designation getm_designation() throws RuntimeException
    {
		return (I_m_designation)MTable.get(getCtx(), I_m_designation.Table_Name)
			.getPO(getm_designation_ID(), get_TrxName());	}

	/** Set Sacco Designation.
		@param m_designation_ID Sacco Designation	  */
	public void setm_designation_ID (int m_designation_ID)
	{
		if (m_designation_ID < 1) 
			set_Value (COLUMNNAME_m_designation_ID, null);
		else 
			set_Value (COLUMNNAME_m_designation_ID, Integer.valueOf(m_designation_ID));
	}

	/** Get Sacco Designation.
		@return Sacco Designation	  */
	public int getm_designation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_m_designation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Cell Number:.
		@param mcell Cell Number:	  */
	public void setmcell (String mcell)
	{
		set_Value (COLUMNNAME_mcell, mcell);
	}

	/** Get Cell Number:.
		@return Cell Number:	  */
	public String getmcell () 
	{
		return (String)get_Value(COLUMNNAME_mcell);
	}

	/** Set Member #.
		@param mcode Member #	  */
	public void setmcode (String mcode)
	{
		set_Value (COLUMNNAME_mcode, mcode);
	}

	/** Get Member #.
		@return Member #	  */
	public String getmcode () 
	{
		return (String)get_Value(COLUMNNAME_mcode);
	}

	/** Set Remarks / Comments:.
		@param mcomments Remarks / Comments:	  */
	public void setmcomments (String mcomments)
	{
		set_Value (COLUMNNAME_mcomments, mcomments);
	}

	/** Get Remarks / Comments:.
		@return Remarks / Comments:	  */
	public String getmcomments () 
	{
		return (String)get_Value(COLUMNNAME_mcomments);
	}

	/** Set Member Registration Date.
		@param mdate Member Registration Date	  */
	public void setmdate (Timestamp mdate)
	{
		set_Value (COLUMNNAME_mdate, mdate);
	}

	/** Get Member Registration Date.
		@return Member Registration Date	  */
	public Timestamp getmdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_mdate);
	}

	/** Set Date Of Birth:.
		@param mdob Date Of Birth:	  */
	public void setmdob (Timestamp mdob)
	{
		set_Value (COLUMNNAME_mdob, mdob);
	}

	/** Get Date Of Birth:.
		@return Date Of Birth:	  */
	public Timestamp getmdob () 
	{
		return (Timestamp)get_Value(COLUMNNAME_mdob);
	}

	/** Set memberimage.
		@param memberimage memberimage	  */
	public void setmemberimage (String memberimage)
	{
		set_Value (COLUMNNAME_memberimage, memberimage);
	}

	/** Get memberimage.
		@return memberimage	  */
	public String getmemberimage () 
	{
		return (String)get_Value(COLUMNNAME_memberimage);
	}

	/** Set membersignature.
		@param membersignature membersignature	  */
	public void setmembersignature (String membersignature)
	{
		set_Value (COLUMNNAME_membersignature, membersignature);
	}

	/** Get membersignature.
		@return membersignature	  */
	public String getmembersignature () 
	{
		return (String)get_Value(COLUMNNAME_membersignature);
	}

	/** Set membertype.
		@param membertype membertype	  */
	public void setmembertype (String membertype)
	{
		set_Value (COLUMNNAME_membertype, membertype);
	}

	/** Get membertype.
		@return membertype	  */
	public String getmembertype () 
	{
		return (String)get_Value(COLUMNNAME_membertype);
	}

	/** Set Termination Date:.
		@param menddate Termination Date:	  */
	public void setmenddate (Timestamp menddate)
	{
		set_Value (COLUMNNAME_menddate, menddate);
	}

	/** Get Termination Date:.
		@return Termination Date:	  */
	public Timestamp getmenddate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_menddate);
	}

	/** Set mfax.
		@param mfax mfax	  */
	public void setmfax (String mfax)
	{
		set_Value (COLUMNNAME_mfax, mfax);
	}

	/** Get mfax.
		@return mfax	  */
	public String getmfax () 
	{
		return (String)get_Value(COLUMNNAME_mfax);
	}

	/** Set First Name.
		@param mfirstname First Name	  */
	public void setmfirstname (String mfirstname)
	{
		set_Value (COLUMNNAME_mfirstname, mfirstname);
	}

	/** Get First Name.
		@return First Name	  */
	public String getmfirstname () 
	{
		return (String)get_Value(COLUMNNAME_mfirstname);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getmfirstname());
    }

	/** mgender AD_Reference_ID=53612 */
	public static final int MGENDER_AD_Reference_ID=53612;
	/** Female = Female */
	public static final String MGENDER_Female = "Female";
	/** Male = Male */
	public static final String MGENDER_Male = "Male";
	/** Set Gender.
		@param mgender Gender	  */
	public void setmgender (String mgender)
	{

		set_Value (COLUMNNAME_mgender, mgender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getmgender () 
	{
		return (String)get_Value(COLUMNNAME_mgender);
	}

	/** Set Gross Salary:.
		@param mgross Gross Salary:	  */
	public void setmgross (BigDecimal mgross)
	{
		set_Value (COLUMNNAME_mgross, mgross);
	}

	/** Get Gross Salary:.
		@return Gross Salary:	  */
	public BigDecimal getmgross () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_mgross);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** mmarital AD_Reference_ID=53614 */
	public static final int MMARITAL_AD_Reference_ID=53614;
	/** Divorced = Divorced */
	public static final String MMARITAL_Divorced = "Divorced";
	/** Live-in = Live-in */
	public static final String MMARITAL_Live_In = "Live-in";
	/** Married = Married */
	public static final String MMARITAL_Married = "Married";
	/** Single = Single */
	public static final String MMARITAL_Single = "Single";
	/** Widow = Widow */
	public static final String MMARITAL_Widow = "Widow";
	/** Windower = Windower */
	public static final String MMARITAL_Windower = "Windower";
	/** Set Marital Status.
		@param mmarital Marital Status	  */
	public void setmmarital (String mmarital)
	{

		set_Value (COLUMNNAME_mmarital, mmarital);
	}

	/** Get Marital Status.
		@return Marital Status	  */
	public String getmmarital () 
	{
		return (String)get_Value(COLUMNNAME_mmarital);
	}

	/** Set Nett Salary:.
		@param mnett Nett Salary:	  */
	public void setmnett (BigDecimal mnett)
	{
		set_Value (COLUMNNAME_mnett, mnett);
	}

	/** Get Nett Salary:.
		@return Nett Salary:	  */
	public BigDecimal getmnett () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_mnett);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Date Last Modified.
		@param modificationdate Date Last Modified	  */
	public void setmodificationdate (Timestamp modificationdate)
	{
		set_Value (COLUMNNAME_modificationdate, modificationdate);
	}

	/** Get Date Last Modified.
		@return Date Last Modified	  */
	public Timestamp getmodificationdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_modificationdate);
	}

	/** Set Middle Name.
		@param mothername Middle Name	  */
	public void setmothername (String mothername)
	{
		set_Value (COLUMNNAME_mothername, mothername);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getmothername () 
	{
		return (String)get_Value(COLUMNNAME_mothername);
	}

	/** Set Payroll #.
		@param mpayroll Payroll #	  */
	public void setmpayroll (String mpayroll)
	{
		set_Value (COLUMNNAME_mpayroll, mpayroll);
	}

	/** Get Payroll #.
		@return Payroll #	  */
	public String getmpayroll () 
	{
		return (String)get_Value(COLUMNNAME_mpayroll);
	}

	/** Set Postal Address.
		@param mpostaladdress Postal Address	  */
	public void setmpostaladdress (String mpostaladdress)
	{
		set_Value (COLUMNNAME_mpostaladdress, mpostaladdress);
	}

	/** Get Postal Address.
		@return Postal Address	  */
	public String getmpostaladdress () 
	{
		return (String)get_Value(COLUMNNAME_mpostaladdress);
	}

	/** Set Start Date:.
		@param mstartdate Start Date:	  */
	public void setmstartdate (Timestamp mstartdate)
	{
		set_Value (COLUMNNAME_mstartdate, mstartdate);
	}

	/** Get Start Date:.
		@return Start Date:	  */
	public Timestamp getmstartdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_mstartdate);
	}

	/** mstatus AD_Reference_ID=1000001 */
	public static final int MSTATUS_AD_Reference_ID=1000001;
	/** Active = A */
	public static final String MSTATUS_Active = "A";
	/** Dormant = D */
	public static final String MSTATUS_Dormant = "D";
	/** Set Member Status.
		@param mstatus Member Status	  */
	public void setmstatus (String mstatus)
	{

		set_Value (COLUMNNAME_mstatus, mstatus);
	}

	/** Get Member Status.
		@return Member Status	  */
	public String getmstatus () 
	{
		return (String)get_Value(COLUMNNAME_mstatus);
	}

	/** Set Surname.
		@param msurname Surname	  */
	public void setmsurname (String msurname)
	{
		set_Value (COLUMNNAME_msurname, msurname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getmsurname () 
	{
		return (String)get_Value(COLUMNNAME_msurname);
	}

	/** Set Telephone #1.
		@param mtel1 Telephone #1	  */
	public void setmtel1 (String mtel1)
	{
		set_Value (COLUMNNAME_mtel1, mtel1);
	}

	/** Get Telephone #1.
		@return Telephone #1	  */
	public String getmtel1 () 
	{
		return (String)get_Value(COLUMNNAME_mtel1);
	}

	/** Set Telephone #2.
		@param mtel2 Telephone #2	  */
	public void setmtel2 (String mtel2)
	{
		set_Value (COLUMNNAME_mtel2, mtel2);
	}

	/** Get Telephone #2.
		@return Telephone #2	  */
	public String getmtel2 () 
	{
		return (String)get_Value(COLUMNNAME_mtel2);
	}

	/** Set mtel3.
		@param mtel3 mtel3	  */
	public void setmtel3 (String mtel3)
	{
		set_Value (COLUMNNAME_mtel3, mtel3);
	}

	/** Get mtel3.
		@return mtel3	  */
	public String getmtel3 () 
	{
		return (String)get_Value(COLUMNNAME_mtel3);
	}

	/** Set Title.
		@param mtitle Title	  */
	public void setmtitle (String mtitle)
	{
		set_Value (COLUMNNAME_mtitle, mtitle);
	}

	/** Get Title.
		@return Title	  */
	public String getmtitle () 
	{
		return (String)get_Value(COLUMNNAME_mtitle);
	}

	/** Set Withdrawal Date:.
		@param mwithdrawaldate Withdrawal Date:	  */
	public void setmwithdrawaldate (Timestamp mwithdrawaldate)
	{
		set_Value (COLUMNNAME_mwithdrawaldate, mwithdrawaldate);
	}

	/** Get Withdrawal Date:.
		@return Withdrawal Date:	  */
	public Timestamp getmwithdrawaldate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_mwithdrawaldate);
	}

	/** Set newmember.
		@param newmember newmember	  */
	public void setnewmember (boolean newmember)
	{
		set_Value (COLUMNNAME_newmember, Boolean.valueOf(newmember));
	}

	/** Get newmember.
		@return newmember	  */
	public boolean isnewmember () 
	{
		Object oo = get_Value(COLUMNNAME_newmember);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Owner.
		@param owner Owner	  */
	public void setowner (String owner)
	{
		set_Value (COLUMNNAME_owner, owner);
	}

	/** Get Owner.
		@return Owner	  */
	public String getowner () 
	{
		return (String)get_Value(COLUMNNAME_owner);
	}

	/** Set ownernames.
		@param ownernames ownernames	  */
	public void setownernames (String ownernames)
	{
		set_Value (COLUMNNAME_ownernames, ownernames);
	}

	/** Get ownernames.
		@return ownernames	  */
	public String getownernames () 
	{
		return (String)get_Value(COLUMNNAME_ownernames);
	}

	/** Set picked.
		@param picked picked	  */
	public void setpicked (boolean picked)
	{
		set_Value (COLUMNNAME_picked, Boolean.valueOf(picked));
	}

	/** Get picked.
		@return picked	  */
	public boolean ispicked () 
	{
		Object oo = get_Value(COLUMNNAME_picked);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Reason.
		@param reason Reason	  */
	public void setreason (String reason)
	{
		set_Value (COLUMNNAME_reason, reason);
	}

	/** Get Reason.
		@return Reason	  */
	public String getreason () 
	{
		return (String)get_Value(COLUMNNAME_reason);
	}

	/** Set Registration Fee.
		@param regfee Registration Fee	  */
	public void setregfee (BigDecimal regfee)
	{
		set_Value (COLUMNNAME_regfee, regfee);
	}

	/** Get Registration Fee.
		@return Registration Fee	  */
	public BigDecimal getregfee () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_regfee);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Route.
		@param route Route	  */
	public void setroute (String route)
	{
		set_Value (COLUMNNAME_route, route);
	}

	/** Get Route.
		@return Route	  */
	public String getroute () 
	{
		return (String)get_Value(COLUMNNAME_route);
	}

	public I_s_branch gets_branch() throws RuntimeException
    {
		return (I_s_branch)MTable.get(getCtx(), I_s_branch.Table_Name)
			.getPO(gets_branch_ID(), get_TrxName());	}

	/** Set Member Branch.
		@param s_branch_ID Member Branch	  */
	public void sets_branch_ID (int s_branch_ID)
	{
		if (s_branch_ID < 1) 
			set_Value (COLUMNNAME_s_branch_ID, null);
		else 
			set_Value (COLUMNNAME_s_branch_ID, Integer.valueOf(s_branch_ID));
	}

	/** Get Member Branch.
		@return Member Branch	  */
	public int gets_branch_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_branch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_department gets_department() throws RuntimeException
    {
		return (I_s_department)MTable.get(getCtx(), I_s_department.Table_Name)
			.getPO(gets_department_ID(), get_TrxName());	}

	/** Set Sacco Department.
		@param s_department_ID Sacco Department	  */
	public void sets_department_ID (int s_department_ID)
	{
		if (s_department_ID < 1) 
			set_Value (COLUMNNAME_s_department_ID, null);
		else 
			set_Value (COLUMNNAME_s_department_ID, Integer.valueOf(s_department_ID));
	}

	/** Get Sacco Department.
		@return Sacco Department	  */
	public int gets_department_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_department_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_employers gets_employers() throws RuntimeException
    {
		return (I_s_employers)MTable.get(getCtx(), I_s_employers.Table_Name)
			.getPO(gets_employers_ID(), get_TrxName());	}

	/** Set Employer.
		@param s_employers_ID Employer	  */
	public void sets_employers_ID (int s_employers_ID)
	{
		if (s_employers_ID < 1) 
			set_Value (COLUMNNAME_s_employers_ID, null);
		else 
			set_Value (COLUMNNAME_s_employers_ID, Integer.valueOf(s_employers_ID));
	}

	/** Get Employer.
		@return Employer	  */
	public int gets_employers_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_employers_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_grade gets_grade() throws RuntimeException
    {
		return (I_s_grade)MTable.get(getCtx(), I_s_grade.Table_Name)
			.getPO(gets_grade_ID(), get_TrxName());	}

	/** Set Sacco Grade.
		@param s_grade_ID Sacco Grade	  */
	public void sets_grade_ID (int s_grade_ID)
	{
		if (s_grade_ID < 1) 
			set_Value (COLUMNNAME_s_grade_ID, null);
		else 
			set_Value (COLUMNNAME_s_grade_ID, Integer.valueOf(s_grade_ID));
	}

	/** Get Sacco Grade.
		@return Sacco Grade	  */
	public int gets_grade_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_grade_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Member Description.
		@param s_member_ID Member Description	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_member_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
	}

	/** Get Member Description.
		@return Member Description	  */
	public int gets_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_station gets_station() throws RuntimeException
    {
		return (I_s_station)MTable.get(getCtx(), I_s_station.Table_Name)
			.getPO(gets_station_ID(), get_TrxName());	}

	/** Set Station.
		@param s_station_ID Station	  */
	public void sets_station_ID (int s_station_ID)
	{
		if (s_station_ID < 1) 
			set_Value (COLUMNNAME_s_station_ID, null);
		else 
			set_Value (COLUMNNAME_s_station_ID, Integer.valueOf(s_station_ID));
	}

	/** Get Station.
		@return Station	  */
	public int gets_station_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_station_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sacco Official?.
		@param saccoofficial Sacco Official?	  */
	public void setsaccoofficial (boolean saccoofficial)
	{
		set_Value (COLUMNNAME_saccoofficial, Boolean.valueOf(saccoofficial));
	}

	/** Get Sacco Official?.
		@return Sacco Official?	  */
	public boolean issaccoofficial () 
	{
		Object oo = get_Value(COLUMNNAME_saccoofficial);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set sharestodateinowords.
		@param sharestodateinowords sharestodateinowords	  */
	public void setsharestodateinowords (String sharestodateinowords)
	{
		set_Value (COLUMNNAME_sharestodateinowords, sharestodateinowords);
	}

	/** Get sharestodateinowords.
		@return sharestodateinowords	  */
	public String getsharestodateinowords () 
	{
		return (String)get_Value(COLUMNNAME_sharestodateinowords);
	}

	/** Set tiedshares.
		@param tiedshares tiedshares	  */
	public void settiedshares (BigDecimal tiedshares)
	{
		set_Value (COLUMNNAME_tiedshares, tiedshares);
	}

	/** Get tiedshares.
		@return tiedshares	  */
	public BigDecimal gettiedshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_tiedshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Membership Period.
		@param transperiod Membership Period	  */
	public void settransperiod (String transperiod)
	{
		set_Value (COLUMNNAME_transperiod, transperiod);
	}

	/** Get Membership Period.
		@return Membership Period	  */
	public String gettransperiod () 
	{
		return (String)get_Value(COLUMNNAME_transperiod);
	}

	/** Set transyear.
		@param transyear transyear	  */
	public void settransyear (boolean transyear)
	{
		set_Value (COLUMNNAME_transyear, Boolean.valueOf(transyear));
	}

	/** Get transyear.
		@return transyear	  */
	public boolean istransyear () 
	{
		Object oo = get_Value(COLUMNNAME_transyear);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set uuid.
		@param uuid uuid	  */
	public void setuuid (String uuid)
	{
		set_Value (COLUMNNAME_uuid, uuid);
	}

	/** Get uuid.
		@return uuid	  */
	public String getuuid () 
	{
		return (String)get_Value(COLUMNNAME_uuid);
	}
	@Override
	public boolean afterSave(boolean newRecord, boolean success) {
		if (newRecord) {
			String email = this.getEMail();
			if (email != null) {
				I_s_saccoinfo info = new X_s_saccoinfo(getCtx(), 1000000, get_TrxName());
				String saccoName = info.getsacconame();
				String subject = saccoName + " Registration";
				String message = "Dear " + this.getmfirstname() + ", \n\n" + " Thank you for registering at "
						+ info.getsacconame() + ".Welcome";
				SaccoMail sm = SaccoMail.get();

				SendMailSSL send = new SendMailSSL(sm.getsmtp_host(), sm.getsmtp_port(),
						sm.getsmtp_socketfactory_port(), sm.issmtp_auth(), sm.getEMail(), sm.getPassword(), email,
						subject, message);
				send.send();
			}
		}
		return super.afterSave(newRecord, success);
	}
}