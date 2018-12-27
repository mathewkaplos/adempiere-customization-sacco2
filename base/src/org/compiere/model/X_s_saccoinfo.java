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

/** Generated Model for s_saccoinfo
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_saccoinfo extends PO implements I_s_saccoinfo, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181226L;

    /** Standard Constructor */
    public X_s_saccoinfo (Properties ctx, int s_saccoinfo_ID, String trxName)
    {
      super (ctx, s_saccoinfo_ID, trxName);
      /** if (s_saccoinfo_ID == 0)
        {
			setcashonly (false);
// N
			sets_saccoinfo_ID (0);
			setsacconame (null);
			setsaccoroundcurrency (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_s_saccoinfo (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_saccoinfo[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AGM Shares.
		@param agmshares AGM Shares	  */
	public void setagmshares (String agmshares)
	{
		set_Value (COLUMNNAME_agmshares, agmshares);
	}

	/** Get AGM Shares.
		@return AGM Shares	  */
	public String getagmshares () 
	{
		return (String)get_Value(COLUMNNAME_agmshares);
	}

	/** Set AGM Share Type.
		@param agmsharetype AGM Share Type	  */
	public void setagmsharetype (String agmsharetype)
	{
		set_Value (COLUMNNAME_agmsharetype, agmsharetype);
	}

	/** Get AGM Share Type.
		@return AGM Share Type	  */
	public String getagmsharetype () 
	{
		return (String)get_Value(COLUMNNAME_agmsharetype);
	}

	/** Set Allow Zero Guarantors.
		@param allowzeroguarantors Allow Zero Guarantors	  */
	public void setallowzeroguarantors (boolean allowzeroguarantors)
	{
		set_Value (COLUMNNAME_allowzeroguarantors, Boolean.valueOf(allowzeroguarantors));
	}

	/** Get Allow Zero Guarantors.
		@return Allow Zero Guarantors	  */
	public boolean isallowzeroguarantors () 
	{
		Object oo = get_Value(COLUMNNAME_allowzeroguarantors);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set backuppath.
		@param backuppath backuppath	  */
	public void setbackuppath (String backuppath)
	{
		set_Value (COLUMNNAME_backuppath, backuppath);
	}

	/** Get backuppath.
		@return backuppath	  */
	public String getbackuppath () 
	{
		return (String)get_Value(COLUMNNAME_backuppath);
	}

	public I_C_ValidCombination getbaddebts() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getbaddebtsacc(), get_TrxName());	}

	/** Set Bad Debts Account.
		@param baddebtsacc Bad Debts Account	  */
	public void setbaddebtsacc (int baddebtsacc)
	{
		set_Value (COLUMNNAME_baddebtsacc, Integer.valueOf(baddebtsacc));
	}

	/** Get Bad Debts Account.
		@return Bad Debts Account	  */
	public int getbaddebtsacc () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_baddebtsacc);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set balanceroutinerun.
		@param balanceroutinerun balanceroutinerun	  */
	public void setbalanceroutinerun (boolean balanceroutinerun)
	{
		set_Value (COLUMNNAME_balanceroutinerun, Boolean.valueOf(balanceroutinerun));
	}

	/** Get balanceroutinerun.
		@return balanceroutinerun	  */
	public boolean isbalanceroutinerun () 
	{
		Object oo = get_Value(COLUMNNAME_balanceroutinerun);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Recovery Period: Begin With Shares.
		@param beginwithshares Recovery Period: Begin With Shares	  */
	public void setbeginwithshares (boolean beginwithshares)
	{
		set_Value (COLUMNNAME_beginwithshares, Boolean.valueOf(beginwithshares));
	}

	/** Get Recovery Period: Begin With Shares.
		@return Recovery Period: Begin With Shares	  */
	public boolean isbeginwithshares () 
	{
		Object oo = get_Value(COLUMNNAME_beginwithshares);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Cash Only.
		@param cashonly Cash Only	  */
	public void setcashonly (boolean cashonly)
	{
		set_Value (COLUMNNAME_cashonly, Boolean.valueOf(cashonly));
	}

	/** Get Cash Only.
		@return Cash Only	  */
	public boolean iscashonly () 
	{
		Object oo = get_Value(COLUMNNAME_cashonly);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set countryf.
		@param countryf countryf	  */
	public void setcountryf (String countryf)
	{
		set_Value (COLUMNNAME_countryf, countryf);
	}

	/** Get countryf.
		@return countryf	  */
	public String getcountryf () 
	{
		return (String)get_Value(COLUMNNAME_countryf);
	}

	/** Set crregglcode.
		@param crregglcode crregglcode	  */
	public void setcrregglcode (String crregglcode)
	{
		set_Value (COLUMNNAME_crregglcode, crregglcode);
	}

	/** Get crregglcode.
		@return crregglcode	  */
	public String getcrregglcode () 
	{
		return (String)get_Value(COLUMNNAME_crregglcode);
	}

	/** Set Default Cheque Clearance Days.
		@param defaultchequedays Default Cheque Clearance Days	  */
	public void setdefaultchequedays (int defaultchequedays)
	{
		set_Value (COLUMNNAME_defaultchequedays, Integer.valueOf(defaultchequedays));
	}

	/** Get Default Cheque Clearance Days.
		@return Default Cheque Clearance Days	  */
	public int getdefaultchequedays () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_defaultchequedays);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set departmentsort.
		@param departmentsort departmentsort	  */
	public void setdepartmentsort (boolean departmentsort)
	{
		set_Value (COLUMNNAME_departmentsort, Boolean.valueOf(departmentsort));
	}

	/** Get departmentsort.
		@return departmentsort	  */
	public boolean isdepartmentsort () 
	{
		Object oo = get_Value(COLUMNNAME_departmentsort);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_C_ValidCombination getdivglcr() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdivglcracc(), get_TrxName());	}

	/** Set Dividend GL Credit Account.
		@param divglcracc Dividend GL Credit Account	  */
	public void setdivglcracc (int divglcracc)
	{
		set_Value (COLUMNNAME_divglcracc, Integer.valueOf(divglcracc));
	}

	/** Get Dividend GL Credit Account.
		@return Dividend GL Credit Account	  */
	public int getdivglcracc () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_divglcracc);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getdivgldr() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getdivgldracc(), get_TrxName());	}

	/** Set Dividend GL Drebit Account.
		@param divgldracc Dividend GL Drebit Account	  */
	public void setdivgldracc (int divgldracc)
	{
		set_Value (COLUMNNAME_divgldracc, Integer.valueOf(divgldracc));
	}

	/** Get Dividend GL Drebit Account.
		@return Dividend GL Drebit Account	  */
	public int getdivgldracc () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_divgldracc);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set emailsubject.
		@param emailsubject emailsubject	  */
	public void setemailsubject (String emailsubject)
	{
		set_Value (COLUMNNAME_emailsubject, emailsubject);
	}

	/** Get emailsubject.
		@return emailsubject	  */
	public String getemailsubject () 
	{
		return (String)get_Value(COLUMNNAME_emailsubject);
	}

	/** Set emailtext.
		@param emailtext emailtext	  */
	public void setemailtext (String emailtext)
	{
		set_Value (COLUMNNAME_emailtext, emailtext);
	}

	/** Get emailtext.
		@return emailtext	  */
	public String getemailtext () 
	{
		return (String)get_Value(COLUMNNAME_emailtext);
	}

	public I_C_ValidCombination getendyearbalancin() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getendyearbalancingac(), get_TrxName());	}

	/** Set End Year Balancing Account.
		@param endyearbalancingac End Year Balancing Account	  */
	public void setendyearbalancingac (int endyearbalancingac)
	{
		set_Value (COLUMNNAME_endyearbalancingac, Integer.valueOf(endyearbalancingac));
	}

	/** Get End Year Balancing Account.
		@return End Year Balancing Account	  */
	public int getendyearbalancingac () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_endyearbalancingac);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set End Year Month.
		@param endyearmonth End Year Month	  */
	public void setendyearmonth (int endyearmonth)
	{
		set_Value (COLUMNNAME_endyearmonth, Integer.valueOf(endyearmonth));
	}

	/** Get End Year Month.
		@return End Year Month	  */
	public int getendyearmonth () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_endyearmonth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set End Of Month Processing Ongoing.
		@param eomprocesson End Of Month Processing Ongoing	  */
	public void seteomprocesson (boolean eomprocesson)
	{
		set_Value (COLUMNNAME_eomprocesson, Boolean.valueOf(eomprocesson));
	}

	/** Get End Of Month Processing Ongoing.
		@return End Of Month Processing Ongoing	  */
	public boolean iseomprocesson () 
	{
		Object oo = get_Value(COLUMNNAME_eomprocesson);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Ignore OverPaid Interest.
		@param ignoreoverpaidint Ignore OverPaid Interest	  */
	public void setignoreoverpaidint (boolean ignoreoverpaidint)
	{
		set_Value (COLUMNNAME_ignoreoverpaidint, Boolean.valueOf(ignoreoverpaidint));
	}

	/** Get Ignore OverPaid Interest.
		@return Ignore OverPaid Interest	  */
	public boolean isignoreoverpaidint () 
	{
		Object oo = get_Value(COLUMNNAME_ignoreoverpaidint);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Ignore Penalty For Standing Order Loans.
		@param ignorepenaltyforsto Ignore Penalty For Standing Order Loans	  */
	public void setignorepenaltyforsto (boolean ignorepenaltyforsto)
	{
		set_Value (COLUMNNAME_ignorepenaltyforsto, Boolean.valueOf(ignorepenaltyforsto));
	}

	/** Get Ignore Penalty For Standing Order Loans.
		@return Ignore Penalty For Standing Order Loans	  */
	public boolean isignorepenaltyforsto () 
	{
		Object oo = get_Value(COLUMNNAME_ignorepenaltyforsto);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set incomingmailserver.
		@param incomingmailserver incomingmailserver	  */
	public void setincomingmailserver (String incomingmailserver)
	{
		set_Value (COLUMNNAME_incomingmailserver, incomingmailserver);
	}

	/** Get incomingmailserver.
		@return incomingmailserver	  */
	public String getincomingmailserver () 
	{
		return (String)get_Value(COLUMNNAME_incomingmailserver);
	}

	/** Set Accrual.
		@param IsAccrual 
		Indicates if Accrual or Cash Based accounting will be used
	  */
	public void setIsAccrual (boolean IsAccrual)
	{
		set_Value (COLUMNNAME_IsAccrual, Boolean.valueOf(IsAccrual));
	}

	/** Get Accrual.
		@return Indicates if Accrual or Cash Based accounting will be used
	  */
	public boolean isAccrual () 
	{
		Object oo = get_Value(COLUMNNAME_IsAccrual);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set lastpayableno.
		@param lastpayableno lastpayableno	  */
	public void setlastpayableno (String lastpayableno)
	{
		set_Value (COLUMNNAME_lastpayableno, lastpayableno);
	}

	/** Get lastpayableno.
		@return lastpayableno	  */
	public String getlastpayableno () 
	{
		return (String)get_Value(COLUMNNAME_lastpayableno);
	}

	/** Set lastreceivableno.
		@param lastreceivableno lastreceivableno	  */
	public void setlastreceivableno (String lastreceivableno)
	{
		set_Value (COLUMNNAME_lastreceivableno, lastreceivableno);
	}

	/** Get lastreceivableno.
		@return lastreceivableno	  */
	public String getlastreceivableno () 
	{
		return (String)get_Value(COLUMNNAME_lastreceivableno);
	}

	/** Set loansposted.
		@param loansposted loansposted	  */
	public void setloansposted (String loansposted)
	{
		set_Value (COLUMNNAME_loansposted, loansposted);
	}

	/** Get loansposted.
		@return loansposted	  */
	public String getloansposted () 
	{
		return (String)get_Value(COLUMNNAME_loansposted);
	}

	/** Set MCode Length.
		@param mcodelength MCode Length	  */
	public void setmcodelength (int mcodelength)
	{
		set_Value (COLUMNNAME_mcodelength, Integer.valueOf(mcodelength));
	}

	/** Get MCode Length.
		@return MCode Length	  */
	public int getmcodelength () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_mcodelength);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MCode Prefix.
		@param mcodeprefix MCode Prefix	  */
	public void setmcodeprefix (String mcodeprefix)
	{
		set_Value (COLUMNNAME_mcodeprefix, mcodeprefix);
	}

	/** Get MCode Prefix.
		@return MCode Prefix	  */
	public String getmcodeprefix () 
	{
		return (String)get_Value(COLUMNNAME_mcodeprefix);
	}

	/** Set membersgl.
		@param membersgl membersgl	  */
	public void setmembersgl (String membersgl)
	{
		set_Value (COLUMNNAME_membersgl, membersgl);
	}

	/** Get membersgl.
		@return membersgl	  */
	public String getmembersgl () 
	{
		return (String)get_Value(COLUMNNAME_membersgl);
	}

	/** Set Minimum Consistent Contribution.
		@param minconsistentcontrib Minimum Consistent Contribution	  */
	public void setminconsistentcontrib (int minconsistentcontrib)
	{
		set_Value (COLUMNNAME_minconsistentcontrib, Integer.valueOf(minconsistentcontrib));
	}

	/** Get Minimum Consistent Contribution.
		@return Minimum Consistent Contribution	  */
	public int getminconsistentcontrib () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_minconsistentcontrib);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Free Shares.
		@param minfreeshares Min Free Shares	  */
	public void setminfreeshares (BigDecimal minfreeshares)
	{
		set_Value (COLUMNNAME_minfreeshares, minfreeshares);
	}

	/** Get Min Free Shares.
		@return Min Free Shares	  */
	public BigDecimal getminfreeshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minfreeshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MPayroll Prefix.
		@param mpayrollprefix MPayroll Prefix	  */
	public void setmpayrollprefix (String mpayrollprefix)
	{
		set_Value (COLUMNNAME_mpayrollprefix, mpayrollprefix);
	}

	/** Get MPayroll Prefix.
		@return MPayroll Prefix	  */
	public String getmpayrollprefix () 
	{
		return (String)get_Value(COLUMNNAME_mpayrollprefix);
	}

	/** Set newid.
		@param newid newid	  */
	public void setnewid (int newid)
	{
		set_Value (COLUMNNAME_newid, Integer.valueOf(newid));
	}

	/** Get newid.
		@return newid	  */
	public int getnewid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_newid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set outgoingmailserver.
		@param outgoingmailserver outgoingmailserver	  */
	public void setoutgoingmailserver (String outgoingmailserver)
	{
		set_Value (COLUMNNAME_outgoingmailserver, outgoingmailserver);
	}

	/** Get outgoingmailserver.
		@return outgoingmailserver	  */
	public String getoutgoingmailserver () 
	{
		return (String)get_Value(COLUMNNAME_outgoingmailserver);
	}

	public I_C_ValidCombination getprovision() throws RuntimeException
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getprovisionacc(), get_TrxName());	}

	/** Set Provision Account.
		@param provisionacc Provision Account	  */
	public void setprovisionacc (int provisionacc)
	{
		set_Value (COLUMNNAME_provisionacc, Integer.valueOf(provisionacc));
	}

	/** Get Provision Account.
		@return Provision Account	  */
	public int getprovisionacc () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_provisionacc);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set regglcode.
		@param regglcode regglcode	  */
	public void setregglcode (String regglcode)
	{
		set_Value (COLUMNNAME_regglcode, regglcode);
	}

	/** Get regglcode.
		@return regglcode	  */
	public String getregglcode () 
	{
		return (String)get_Value(COLUMNNAME_regglcode);
	}

	/** Set reportsorttype.
		@param reportsorttype reportsorttype	  */
	public void setreportsorttype (String reportsorttype)
	{
		set_Value (COLUMNNAME_reportsorttype, reportsorttype);
	}

	/** Get reportsorttype.
		@return reportsorttype	  */
	public String getreportsorttype () 
	{
		return (String)get_Value(COLUMNNAME_reportsorttype);
	}

	/** Set s_saccoinfo ID.
		@param s_saccoinfo_ID s_saccoinfo ID	  */
	public void sets_saccoinfo_ID (int s_saccoinfo_ID)
	{
		if (s_saccoinfo_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_saccoinfo_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_saccoinfo_ID, Integer.valueOf(s_saccoinfo_ID));
	}

	/** Get s_saccoinfo ID.
		@return s_saccoinfo ID	  */
	public int gets_saccoinfo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_saccoinfo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set saccoactivatedebit.
		@param saccoactivatedebit saccoactivatedebit	  */
	public void setsaccoactivatedebit (boolean saccoactivatedebit)
	{
		set_Value (COLUMNNAME_saccoactivatedebit, Boolean.valueOf(saccoactivatedebit));
	}

	/** Get saccoactivatedebit.
		@return saccoactivatedebit	  */
	public boolean issaccoactivatedebit () 
	{
		Object oo = get_Value(COLUMNNAME_saccoactivatedebit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Physical Address:.
		@param saccoaddress Physical Address:	  */
	public void setsaccoaddress (String saccoaddress)
	{
		set_Value (COLUMNNAME_saccoaddress, saccoaddress);
	}

	/** Get Physical Address:.
		@return Physical Address:	  */
	public String getsaccoaddress () 
	{
		return (String)get_Value(COLUMNNAME_saccoaddress);
	}

	/** Set City/Location:.
		@param saccocity City/Location:	  */
	public void setsaccocity (String saccocity)
	{
		set_Value (COLUMNNAME_saccocity, saccocity);
	}

	/** Get City/Location:.
		@return City/Location:	  */
	public String getsaccocity () 
	{
		return (String)get_Value(COLUMNNAME_saccocity);
	}

	/** Set Contact Person:.
		@param saccocontactperson Contact Person:	  */
	public void setsaccocontactperson (String saccocontactperson)
	{
		set_Value (COLUMNNAME_saccocontactperson, saccocontactperson);
	}

	/** Get Contact Person:.
		@return Contact Person:	  */
	public String getsaccocontactperson () 
	{
		return (String)get_Value(COLUMNNAME_saccocontactperson);
	}

	/** Set Country.
		@param saccocountry Country	  */
	public void setsaccocountry (String saccocountry)
	{
		set_Value (COLUMNNAME_saccocountry, saccocountry);
	}

	/** Get Country.
		@return Country	  */
	public String getsaccocountry () 
	{
		return (String)get_Value(COLUMNNAME_saccocountry);
	}

	/** Set saccocurrent.
		@param saccocurrent saccocurrent	  */
	public void setsaccocurrent (int saccocurrent)
	{
		set_Value (COLUMNNAME_saccocurrent, Integer.valueOf(saccocurrent));
	}

	/** Get saccocurrent.
		@return saccocurrent	  */
	public int getsaccocurrent () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccocurrent);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set saccodatabasename.
		@param saccodatabasename saccodatabasename	  */
	public void setsaccodatabasename (String saccodatabasename)
	{
		set_Value (COLUMNNAME_saccodatabasename, saccodatabasename);
	}

	/** Get saccodatabasename.
		@return saccodatabasename	  */
	public String getsaccodatabasename () 
	{
		return (String)get_Value(COLUMNNAME_saccodatabasename);
	}

	/** Set saccodormancyage.
		@param saccodormancyage saccodormancyage	  */
	public void setsaccodormancyage (int saccodormancyage)
	{
		set_Value (COLUMNNAME_saccodormancyage, Integer.valueOf(saccodormancyage));
	}

	/** Get saccodormancyage.
		@return saccodormancyage	  */
	public int getsaccodormancyage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccodormancyage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Email Address:.
		@param saccoemail Email Address:	  */
	public void setsaccoemail (String saccoemail)
	{
		set_Value (COLUMNNAME_saccoemail, saccoemail);
	}

	/** Get Email Address:.
		@return Email Address:	  */
	public String getsaccoemail () 
	{
		return (String)get_Value(COLUMNNAME_saccoemail);
	}

	/** Set Sacco Fax.
		@param saccofax Sacco Fax	  */
	public void setsaccofax (String saccofax)
	{
		set_Value (COLUMNNAME_saccofax, saccofax);
	}

	/** Get Sacco Fax.
		@return Sacco Fax	  */
	public String getsaccofax () 
	{
		return (String)get_Value(COLUMNNAME_saccofax);
	}

	/** Set saccofrequency.
		@param saccofrequency saccofrequency	  */
	public void setsaccofrequency (String saccofrequency)
	{
		set_Value (COLUMNNAME_saccofrequency, saccofrequency);
	}

	/** Get saccofrequency.
		@return saccofrequency	  */
	public String getsaccofrequency () 
	{
		return (String)get_Value(COLUMNNAME_saccofrequency);
	}

	/** Set saccoimage.
		@param saccoimage saccoimage	  */
	public void setsaccoimage (String saccoimage)
	{
		set_Value (COLUMNNAME_saccoimage, saccoimage);
	}

	/** Get saccoimage.
		@return saccoimage	  */
	public String getsaccoimage () 
	{
		return (String)get_Value(COLUMNNAME_saccoimage);
	}

	/** Set saccointerestcalculation.
		@param saccointerestcalculation saccointerestcalculation	  */
	public void setsaccointerestcalculation (String saccointerestcalculation)
	{
		set_Value (COLUMNNAME_saccointerestcalculation, saccointerestcalculation);
	}

	/** Get saccointerestcalculation.
		@return saccointerestcalculation	  */
	public String getsaccointerestcalculation () 
	{
		return (String)get_Value(COLUMNNAME_saccointerestcalculation);
	}

	/** Set saccolastprint.
		@param saccolastprint saccolastprint	  */
	public void setsaccolastprint (Timestamp saccolastprint)
	{
		set_Value (COLUMNNAME_saccolastprint, saccolastprint);
	}

	/** Get saccolastprint.
		@return saccolastprint	  */
	public Timestamp getsaccolastprint () 
	{
		return (Timestamp)get_Value(COLUMNNAME_saccolastprint);
	}

	/** Set Link To FOSA.
		@param saccolinkfosa Link To FOSA	  */
	public void setsaccolinkfosa (boolean saccolinkfosa)
	{
		set_Value (COLUMNNAME_saccolinkfosa, Boolean.valueOf(saccolinkfosa));
	}

	/** Get Link To FOSA.
		@return Link To FOSA	  */
	public boolean issaccolinkfosa () 
	{
		Object oo = get_Value(COLUMNNAME_saccolinkfosa);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Link To Accounting.
		@param saccolinkgeneralledger Link To Accounting	  */
	public void setsaccolinkgeneralledger (boolean saccolinkgeneralledger)
	{
		set_Value (COLUMNNAME_saccolinkgeneralledger, Boolean.valueOf(saccolinkgeneralledger));
	}

	/** Get Link To Accounting.
		@return Link To Accounting	  */
	public boolean issaccolinkgeneralledger () 
	{
		Object oo = get_Value(COLUMNNAME_saccolinkgeneralledger);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set saccomaxnokage.
		@param saccomaxnokage saccomaxnokage	  */
	public void setsaccomaxnokage (int saccomaxnokage)
	{
		set_Value (COLUMNNAME_saccomaxnokage, Integer.valueOf(saccomaxnokage));
	}

	/** Get saccomaxnokage.
		@return saccomaxnokage	  */
	public int getsaccomaxnokage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccomaxnokage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Max No Of Loans To Be Guaranteed.
		@param saccomaxtoguarantee Max No Of Loans To Be Guaranteed	  */
	public void setsaccomaxtoguarantee (int saccomaxtoguarantee)
	{
		set_Value (COLUMNNAME_saccomaxtoguarantee, Integer.valueOf(saccomaxtoguarantee));
	}

	/** Get Max No Of Loans To Be Guaranteed.
		@return Max No Of Loans To Be Guaranteed	  */
	public int getsaccomaxtoguarantee () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccomaxtoguarantee);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set saccominmbrage.
		@param saccominmbrage saccominmbrage	  */
	public void setsaccominmbrage (int saccominmbrage)
	{
		set_Value (COLUMNNAME_saccominmbrage, Integer.valueOf(saccominmbrage));
	}

	/** Get saccominmbrage.
		@return saccominmbrage	  */
	public int getsaccominmbrage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccominmbrage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set saccominnokage.
		@param saccominnokage saccominnokage	  */
	public void setsaccominnokage (int saccominnokage)
	{
		set_Value (COLUMNNAME_saccominnokage, Integer.valueOf(saccominnokage));
	}

	/** Get saccominnokage.
		@return saccominnokage	  */
	public int getsaccominnokage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccominnokage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sacco Name/Description.
		@param sacconame Sacco Name/Description	  */
	public void setsacconame (String sacconame)
	{
		set_Value (COLUMNNAME_sacconame, sacconame);
	}

	/** Get Sacco Name/Description.
		@return Sacco Name/Description	  */
	public String getsacconame () 
	{
		return (String)get_Value(COLUMNNAME_sacconame);
	}

	public org.compiere.model.I_C_Period getsaccoperiod() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getsaccoperiod_ID(), get_TrxName());	}

	/** Set Current Period.
		@param saccoperiod_ID Current Period	  */
	public void setsaccoperiod_ID (int saccoperiod_ID)
	{
		if (saccoperiod_ID < 1) 
			set_Value (COLUMNNAME_saccoperiod_ID, null);
		else 
			set_Value (COLUMNNAME_saccoperiod_ID, Integer.valueOf(saccoperiod_ID));
	}

	/** Get Current Period.
		@return Current Period	  */
	public int getsaccoperiod_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccoperiod_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set P.O Box Number:.
		@param saccopobox P.O Box Number:	  */
	public void setsaccopobox (String saccopobox)
	{
		set_Value (COLUMNNAME_saccopobox, saccopobox);
	}

	/** Get P.O Box Number:.
		@return P.O Box Number:	  */
	public String getsaccopobox () 
	{
		return (String)get_Value(COLUMNNAME_saccopobox);
	}

	/** Set Postal Code:.
		@param saccopostalcode Postal Code:	  */
	public void setsaccopostalcode (String saccopostalcode)
	{
		set_Value (COLUMNNAME_saccopostalcode, saccopostalcode);
	}

	/** Get Postal Code:.
		@return Postal Code:	  */
	public String getsaccopostalcode () 
	{
		return (String)get_Value(COLUMNNAME_saccopostalcode);
	}

	/** Set saccoretirementage.
		@param saccoretirementage saccoretirementage	  */
	public void setsaccoretirementage (int saccoretirementage)
	{
		set_Value (COLUMNNAME_saccoretirementage, Integer.valueOf(saccoretirementage));
	}

	/** Get saccoretirementage.
		@return saccoretirementage	  */
	public int getsaccoretirementage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccoretirementage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Round Currency:.
		@param saccoroundcurrency Round Currency:	  */
	public void setsaccoroundcurrency (BigDecimal saccoroundcurrency)
	{
		set_Value (COLUMNNAME_saccoroundcurrency, saccoroundcurrency);
	}

	/** Get Round Currency:.
		@return Round Currency:	  */
	public BigDecimal getsaccoroundcurrency () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_saccoroundcurrency);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Telephone # 1:.
		@param saccotel1 Telephone # 1:	  */
	public void setsaccotel1 (String saccotel1)
	{
		set_Value (COLUMNNAME_saccotel1, saccotel1);
	}

	/** Get Telephone # 1:.
		@return Telephone # 1:	  */
	public String getsaccotel1 () 
	{
		return (String)get_Value(COLUMNNAME_saccotel1);
	}

	/** Set Telephone # 2:.
		@param saccotel2 Telephone # 2:	  */
	public void setsaccotel2 (String saccotel2)
	{
		set_Value (COLUMNNAME_saccotel2, saccotel2);
	}

	/** Get Telephone # 2:.
		@return Telephone # 2:	  */
	public String getsaccotel2 () 
	{
		return (String)get_Value(COLUMNNAME_saccotel2);
	}

	/** Set Telephone # 3:.
		@param saccotel3 Telephone # 3:	  */
	public void setsaccotel3 (String saccotel3)
	{
		set_Value (COLUMNNAME_saccotel3, saccotel3);
	}

	/** Get Telephone # 3:.
		@return Telephone # 3:	  */
	public String getsaccotel3 () 
	{
		return (String)get_Value(COLUMNNAME_saccotel3);
	}

	/** Set Telephone # 4:.
		@param saccotel4 Telephone # 4:	  */
	public void setsaccotel4 (String saccotel4)
	{
		set_Value (COLUMNNAME_saccotel4, saccotel4);
	}

	/** Get Telephone # 4:.
		@return Telephone # 4:	  */
	public String getsaccotel4 () 
	{
		return (String)get_Value(COLUMNNAME_saccotel4);
	}

	/** Set saccototalrepaymentconstant.
		@param saccototalrepaymentconstant saccototalrepaymentconstant	  */
	public void setsaccototalrepaymentconstant (int saccototalrepaymentconstant)
	{
		set_Value (COLUMNNAME_saccototalrepaymentconstant, Integer.valueOf(saccototalrepaymentconstant));
	}

	/** Get saccototalrepaymentconstant.
		@return saccototalrepaymentconstant	  */
	public int getsaccototalrepaymentconstant () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_saccototalrepaymentconstant);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Website http://.
		@param saccoweb Website http://	  */
	public void setsaccoweb (String saccoweb)
	{
		set_Value (COLUMNNAME_saccoweb, saccoweb);
	}

	/** Get Website http://.
		@return Website http://	  */
	public String getsaccoweb () 
	{
		return (String)get_Value(COLUMNNAME_saccoweb);
	}

	/** Set senderaddress.
		@param senderaddress senderaddress	  */
	public void setsenderaddress (String senderaddress)
	{
		set_Value (COLUMNNAME_senderaddress, senderaddress);
	}

	/** Get senderaddress.
		@return senderaddress	  */
	public String getsenderaddress () 
	{
		return (String)get_Value(COLUMNNAME_senderaddress);
	}

	/** Set senderuserid.
		@param senderuserid senderuserid	  */
	public void setsenderuserid (String senderuserid)
	{
		set_Value (COLUMNNAME_senderuserid, senderuserid);
	}

	/** Get senderuserid.
		@return senderuserid	  */
	public String getsenderuserid () 
	{
		return (String)get_Value(COLUMNNAME_senderuserid);
	}

	/** Set Set Account Dormance.
		@param setaccdormance Set Account Dormance	  */
	public void setsetaccdormance (int setaccdormance)
	{
		set_Value (COLUMNNAME_setaccdormance, Integer.valueOf(setaccdormance));
	}

	/** Get Set Account Dormance.
		@return Set Account Dormance	  */
	public int getsetaccdormance () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_setaccdormance);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Set Next of Kin Age Limit(Years).
		@param setkinage Set Next of Kin Age Limit(Years)	  */
	public void setsetkinage (int setkinage)
	{
		set_Value (COLUMNNAME_setkinage, Integer.valueOf(setkinage));
	}

	/** Get Set Next of Kin Age Limit(Years).
		@return Set Next of Kin Age Limit(Years)	  */
	public int getsetkinage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_setkinage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Set Membership Age Limit.
		@param setmembershipage Set Membership Age Limit	  */
	public void setsetmembershipage (int setmembershipage)
	{
		set_Value (COLUMNNAME_setmembershipage, Integer.valueOf(setmembershipage));
	}

	/** Get Set Membership Age Limit.
		@return Set Membership Age Limit	  */
	public int getsetmembershipage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_setmembershipage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set setretireage.
		@param setretireage setretireage	  */
	public void setsetretireage (int setretireage)
	{
		set_Value (COLUMNNAME_setretireage, Integer.valueOf(setretireage));
	}

	/** Get setretireage.
		@return setretireage	  */
	public int getsetretireage () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_setretireage);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set sharecode.
		@param sharecode sharecode	  */
	public void setsharecode (String sharecode)
	{
		set_Value (COLUMNNAME_sharecode, sharecode);
	}

	/** Get sharecode.
		@return sharecode	  */
	public String getsharecode () 
	{
		return (String)get_Value(COLUMNNAME_sharecode);
	}

	/** Set shareid.
		@param shareid shareid	  */
	public void setshareid (int shareid)
	{
		set_Value (COLUMNNAME_shareid, Integer.valueOf(shareid));
	}

	/** Get shareid.
		@return shareid	  */
	public int getshareid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_shareid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set sharesposted.
		@param sharesposted sharesposted	  */
	public void setsharesposted (String sharesposted)
	{
		set_Value (COLUMNNAME_sharesposted, sharesposted);
	}

	/** Get sharesposted.
		@return sharesposted	  */
	public String getsharesposted () 
	{
		return (String)get_Value(COLUMNNAME_sharesposted);
	}

	/** Set System Idle Time.
		@param systemidletime System Idle Time	  */
	public void setsystemidletime (int systemidletime)
	{
		set_Value (COLUMNNAME_systemidletime, Integer.valueOf(systemidletime));
	}

	/** Get System Idle Time.
		@return System Idle Time	  */
	public int getsystemidletime () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_systemidletime);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set templatelocation.
		@param templatelocation templatelocation	  */
	public void settemplatelocation (String templatelocation)
	{
		set_Value (COLUMNNAME_templatelocation, templatelocation);
	}

	/** Get templatelocation.
		@return templatelocation	  */
	public String gettemplatelocation () 
	{
		return (String)get_Value(COLUMNNAME_templatelocation);
	}

	/** Set transportsacco.
		@param transportsacco transportsacco	  */
	public void settransportsacco (int transportsacco)
	{
		set_Value (COLUMNNAME_transportsacco, Integer.valueOf(transportsacco));
	}

	/** Get transportsacco.
		@return transportsacco	  */
	public int gettransportsacco () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transportsacco);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set updatedsharebal.
		@param updatedsharebal updatedsharebal	  */
	public void setupdatedsharebal (boolean updatedsharebal)
	{
		set_Value (COLUMNNAME_updatedsharebal, Boolean.valueOf(updatedsharebal));
	}

	/** Get updatedsharebal.
		@return updatedsharebal	  */
	public boolean isupdatedsharebal () 
	{
		Object oo = get_Value(COLUMNNAME_updatedsharebal);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Use MPayroll For General Ledger Referencing.
		@param usepayrollcode Use MPayroll For General Ledger Referencing	  */
	public void setusepayrollcode (boolean usepayrollcode)
	{
		set_Value (COLUMNNAME_usepayrollcode, Boolean.valueOf(usepayrollcode));
	}

	/** Get Use MPayroll For General Ledger Referencing.
		@return Use MPayroll For General Ledger Referencing	  */
	public boolean isusepayrollcode () 
	{
		Object oo = get_Value(COLUMNNAME_usepayrollcode);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Use Sum Of All Savings/Shares.
		@param usesum Use Sum Of All Savings/Shares	  */
	public void setusesum (boolean usesum)
	{
		set_Value (COLUMNNAME_usesum, Boolean.valueOf(usesum));
	}

	/** Get Use Sum Of All Savings/Shares.
		@return Use Sum Of All Savings/Shares	  */
	public boolean isusesum () 
	{
		Object oo = get_Value(COLUMNNAME_usesum);
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

	/** Set Withdrawal Notice.
		@param withdrawalnotice Withdrawal Notice	  */
	public void setwithdrawalnotice (int withdrawalnotice)
	{
		set_Value (COLUMNNAME_withdrawalnotice, Integer.valueOf(withdrawalnotice));
	}

	/** Get Withdrawal Notice.
		@return Withdrawal Notice	  */
	public int getwithdrawalnotice () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_withdrawalnotice);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}