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

/** Generated Model for s_membershares
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_membershares extends PO implements I_s_membershares, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190511L;

    /** Standard Constructor */
    public X_s_membershares (Properties ctx, int s_membershares_ID, String trxName)
    {
      super (ctx, s_membershares_ID, trxName);
      /** if (s_membershares_ID == 0)
        {
			setDocStatus (null);
// DR
			setIsComplete (false);
// N
			setlinked_to_dependants (false);
// N
			setPosted (false);
// N
			sets_member_ID (0);
			sets_membershares_ID (0);
			sets_sharetype_ID (0);
			setsharedate (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setshareeffectdate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_s_membershares (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_membershares[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Affects DR.
		@param affectsdr Affects DR	  */
	public void setaffectsdr (boolean affectsdr)
	{
		set_Value (COLUMNNAME_affectsdr, Boolean.valueOf(affectsdr));
	}

	/** Get Affects DR.
		@return Affects DR	  */
	public boolean isaffectsdr () 
	{
		Object oo = get_Value(COLUMNNAME_affectsdr);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Contribution Rate.
		@param contributionrate Contribution Rate	  */
	public void setcontributionrate (BigDecimal contributionrate)
	{
		set_Value (COLUMNNAME_contributionrate, contributionrate);
	}

	/** Get Contribution Rate.
		@return Contribution Rate	  */
	public BigDecimal getcontributionrate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_contributionrate);
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

	/** Set disp003.
		@param disp003 disp003	  */
	public void setdisp003 (boolean disp003)
	{
		set_Value (COLUMNNAME_disp003, Boolean.valueOf(disp003));
	}

	/** Get disp003.
		@return disp003	  */
	public boolean isdisp003 () 
	{
		Object oo = get_Value(COLUMNNAME_disp003);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Free Shares.
		@param freeshares Free Shares	  */
	public void setfreeshares (BigDecimal freeshares)
	{
		set_Value (COLUMNNAME_freeshares, freeshares);
	}

	/** Get Free Shares.
		@return Free Shares	  */
	public BigDecimal getfreeshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_freeshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Interest To Date.
		@param interesttodate Interest To Date	  */
	public void setinteresttodate (BigDecimal interesttodate)
	{
		set_Value (COLUMNNAME_interesttodate, interesttodate);
	}

	/** Get Interest To Date.
		@return Interest To Date	  */
	public BigDecimal getinteresttodate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_interesttodate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Complete.
		@param IsComplete 
		It is complete
	  */
	public void setIsComplete (boolean IsComplete)
	{
		set_Value (COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
	}

	/** Get Complete.
		@return It is complete
	  */
	public boolean isComplete () 
	{
		Object oo = get_Value(COLUMNNAME_IsComplete);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Fixed Deposit.
		@param isfixeddeposit Is Fixed Deposit	  */
	public void setisfixeddeposit (boolean isfixeddeposit)
	{
		set_Value (COLUMNNAME_isfixeddeposit, Boolean.valueOf(isfixeddeposit));
	}

	/** Get Is Fixed Deposit.
		@return Is Fixed Deposit	  */
	public boolean isfixeddeposit () 
	{
		Object oo = get_Value(COLUMNNAME_isfixeddeposit);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Last Deposit Date.
		@param last_deposit_date Last Deposit Date	  */
	public void setlast_deposit_date (Timestamp last_deposit_date)
	{
		set_Value (COLUMNNAME_last_deposit_date, last_deposit_date);
	}

	/** Get Last Deposit Date.
		@return Last Deposit Date	  */
	public Timestamp getlast_deposit_date () 
	{
		return (Timestamp)get_Value(COLUMNNAME_last_deposit_date);
	}

	/** Set Linked to Dependants/Next of kin.
		@param linked_to_dependants Linked to Dependants/Next of kin	  */
	public void setlinked_to_dependants (boolean linked_to_dependants)
	{
		set_Value (COLUMNNAME_linked_to_dependants, Boolean.valueOf(linked_to_dependants));
	}

	/** Get Linked to Dependants/Next of kin.
		@return Linked to Dependants/Next of kin	  */
	public boolean islinked_to_dependants () 
	{
		Object oo = get_Value(COLUMNNAME_linked_to_dependants);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Next Of Kin.
		@param m_memberkin_ID Next Of Kin	  */
	public void setm_memberkin_ID (int m_memberkin_ID)
	{
		if (m_memberkin_ID < 1) 
			set_Value (COLUMNNAME_m_memberkin_ID, null);
		else 
			set_Value (COLUMNNAME_m_memberkin_ID, Integer.valueOf(m_memberkin_ID));
	}

	/** Get Next Of Kin.
		@return Next Of Kin	  */
	public int getm_memberkin_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_m_memberkin_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Member NO.
		@param member_no Member NO	  */
	public void setmember_no (String member_no)
	{
		set_Value (COLUMNNAME_member_no, member_no);
	}

	/** Get Member NO.
		@return Member NO	  */
	public String getmember_no () 
	{
		return (String)get_Value(COLUMNNAME_member_no);
	}

	/** Set member_userid.
		@param member_userid member_userid	  */
	public void setmember_userid (int member_userid)
	{
		set_ValueNoCheck (COLUMNNAME_member_userid, Integer.valueOf(member_userid));
	}

	/** Get member_userid.
		@return member_userid	  */
	public int getmember_userid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_member_userid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Month Closing Balance.
		@param monthclosingbal Month Closing Balance	  */
	public void setmonthclosingbal (BigDecimal monthclosingbal)
	{
		set_Value (COLUMNNAME_monthclosingbal, monthclosingbal);
	}

	/** Get Month Closing Balance.
		@return Month Closing Balance	  */
	public BigDecimal getmonthclosingbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_monthclosingbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Month Effect Date.
		@param montheffectdate Month Effect Date	  */
	public void setmontheffectdate (Timestamp montheffectdate)
	{
		set_Value (COLUMNNAME_montheffectdate, montheffectdate);
	}

	/** Get Month Effect Date.
		@return Month Effect Date	  */
	public Timestamp getmontheffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_montheffectdate);
	}

	/** Set New Contribution.
		@param newcontribution New Contribution	  */
	public void setnewcontribution (BigDecimal newcontribution)
	{
		set_Value (COLUMNNAME_newcontribution, newcontribution);
	}

	/** Get New Contribution.
		@return New Contribution	  */
	public BigDecimal getnewcontribution () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newcontribution);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Opening Shares.
		@param openingshares Opening Shares	  */
	public void setopeningshares (BigDecimal openingshares)
	{
		set_ValueNoCheck (COLUMNNAME_openingshares, openingshares);
	}

	/** Get Opening Shares.
		@return Opening Shares	  */
	public BigDecimal getopeningshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_openingshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** paymode AD_Reference_ID=1000010 */
	public static final int PAYMODE_AD_Reference_ID=1000010;
	/** CASH PERMIT = CASH PERMIT */
	public static final String PAYMODE_CASHPERMIT = "CASH PERMIT";
	/** DIRECT BANKING = DIRECT BANKING */
	public static final String PAYMODE_DIRECTBANKING = "DIRECT BANKING";
	/** FOSA = FOSA */
	public static final String PAYMODE_FOSA = "FOSA";
	/** SALARY DEDS = SALARY DEDS */
	public static final String PAYMODE_SALARYDEDS = "SALARY DEDS";
	/** Set Pay Mode.
		@param paymode Pay Mode	  */
	public void setpaymode (String paymode)
	{

		set_Value (COLUMNNAME_paymode, paymode);
	}

	/** Get Pay Mode.
		@return Pay Mode	  */
	public String getpaymode () 
	{
		return (String)get_Value(COLUMNNAME_paymode);
	}

	/** Set Payroll NO.
		@param payroll_no Payroll NO	  */
	public void setpayroll_no (String payroll_no)
	{
		set_Value (COLUMNNAME_payroll_no, payroll_no);
	}

	/** Get Payroll NO.
		@return Payroll NO	  */
	public String getpayroll_no () 
	{
		return (String)get_Value(COLUMNNAME_payroll_no);
	}

	/** Set Posted.
		@param Posted 
		Posting status
	  */
	public void setPosted (boolean Posted)
	{
		set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
	}

	/** Get Posted.
		@return Posting status
	  */
	public boolean isPosted () 
	{
		Object oo = get_Value(COLUMNNAME_Posted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Refrence.
		@param refrence Refrence	  */
	public void setrefrence (String refrence)
	{
		set_Value (COLUMNNAME_refrence, refrence);
	}

	/** Get Refrence.
		@return Refrence	  */
	public String getrefrence () 
	{
		return (String)get_Value(COLUMNNAME_refrence);
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

	public I_s_member gets_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_ID(), get_TrxName());	}

	/** Set Member.
		@param s_member_ID Member	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_member_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
	}

	/** Get Member.
		@return Member	  */
	public int gets_member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Member Shares.
		@param s_membershares_ID Member Shares	  */
	public void sets_membershares_ID (int s_membershares_ID)
	{
		if (s_membershares_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_membershares_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_membershares_ID, Integer.valueOf(s_membershares_ID));
	}

	/** Get Member Shares.
		@return Member Shares	  */
	public int gets_membershares_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_membershares_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_payment_mode gets_payment_mode() throws RuntimeException
    {
		return (I_s_payment_mode)MTable.get(getCtx(), I_s_payment_mode.Table_Name)
			.getPO(gets_payment_mode_ID(), get_TrxName());	}

	/** Set Payment Mode.
		@param s_payment_mode_ID Payment Mode	  */
	public void sets_payment_mode_ID (int s_payment_mode_ID)
	{
		if (s_payment_mode_ID < 1) 
			set_Value (COLUMNNAME_s_payment_mode_ID, null);
		else 
			set_Value (COLUMNNAME_s_payment_mode_ID, Integer.valueOf(s_payment_mode_ID));
	}

	/** Get Payment Mode.
		@return Payment Mode	  */
	public int gets_payment_mode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_payment_mode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_s_sharetype gets_sharetype() throws RuntimeException
    {
		return (I_s_sharetype)MTable.get(getCtx(), I_s_sharetype.Table_Name)
			.getPO(gets_sharetype_ID(), get_TrxName());	}

	/** Set Share Type.
		@param s_sharetype_ID Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID)
	{
		if (s_sharetype_ID < 1) 
			set_Value (COLUMNNAME_s_sharetype_ID, null);
		else 
			set_Value (COLUMNNAME_s_sharetype_ID, Integer.valueOf(s_sharetype_ID));
	}

	/** Get Share Type.
		@return Share Type	  */
	public int gets_sharetype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_sharetype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(gets_sharetype_ID()));
    }

	/** Set Share Code.
		@param share_code Share Code	  */
	public void setshare_code (String share_code)
	{
		set_Value (COLUMNNAME_share_code, share_code);
	}

	/** Get Share Code.
		@return Share Code	  */
	public String getshare_code () 
	{
		return (String)get_Value(COLUMNNAME_share_code);
	}

	/** Set Share Date.
		@param sharedate Share Date	  */
	public void setsharedate (Timestamp sharedate)
	{
		set_Value (COLUMNNAME_sharedate, sharedate);
	}

	/** Get Share Date.
		@return Share Date	  */
	public Timestamp getsharedate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_sharedate);
	}

	/** Set Share Effect Date.
		@param shareeffectdate Share Effect Date	  */
	public void setshareeffectdate (Timestamp shareeffectdate)
	{
		set_Value (COLUMNNAME_shareeffectdate, shareeffectdate);
	}

	/** Get Share Effect Date.
		@return Share Effect Date	  */
	public Timestamp getshareeffectdate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_shareeffectdate);
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

	/** Set Share Month Bal.
		@param sharemonthbal Share Month Bal	  */
	public void setsharemonthbal (BigDecimal sharemonthbal)
	{
		set_Value (COLUMNNAME_sharemonthbal, sharemonthbal);
	}

	/** Get Share Month Bal.
		@return Share Month Bal	  */
	public BigDecimal getsharemonthbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharemonthbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shares To Date.
		@param sharestodate Shares To Date	  */
	public void setsharestodate (BigDecimal sharestodate)
	{
		set_Value (COLUMNNAME_sharestodate, sharestodate);
	}

	/** Get Shares To Date.
		@return Shares To Date	  */
	public BigDecimal getsharestodate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_sharestodate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shares To Date In Words.
		@param sharetodateinwords Shares To Date In Words	  */
	public void setsharetodateinwords (String sharetodateinwords)
	{
		set_Value (COLUMNNAME_sharetodateinwords, sharetodateinwords);
	}

	/** Get Shares To Date In Words.
		@return Shares To Date In Words	  */
	public String getsharetodateinwords () 
	{
		return (String)get_Value(COLUMNNAME_sharetodateinwords);
	}

	/** Set Statement Balance.
		@param statementbal Statement Balance	  */
	public void setstatementbal (BigDecimal statementbal)
	{
		set_Value (COLUMNNAME_statementbal, statementbal);
	}

	/** Get Statement Balance.
		@return Statement Balance	  */
	public BigDecimal getstatementbal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_statementbal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Tied Shares.
		@param tiedshares Tied Shares	  */
	public void settiedshares (BigDecimal tiedshares)
	{
		set_Value (COLUMNNAME_tiedshares, tiedshares);
	}

	/** Get Tied Shares.
		@return Tied Shares	  */
	public BigDecimal gettiedshares () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_tiedshares);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Transaction Period.
		@param transactionperiod Transaction Period	  */
	public void settransactionperiod (int transactionperiod)
	{
		set_Value (COLUMNNAME_transactionperiod, Integer.valueOf(transactionperiod));
	}

	/** Get Transaction Period.
		@return Transaction Period	  */
	public int gettransactionperiod () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transactionperiod);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Transaction Year.
		@param transactionyear Transaction Year	  */
	public void settransactionyear (int transactionyear)
	{
		set_Value (COLUMNNAME_transactionyear, Integer.valueOf(transactionyear));
	}

	/** Get Transaction Year.
		@return Transaction Year	  */
	public int gettransactionyear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transactionyear);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
}