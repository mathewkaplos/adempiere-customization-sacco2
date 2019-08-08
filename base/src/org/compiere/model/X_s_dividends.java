/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_dividends
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_s_dividends extends PO implements I_s_dividends, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190807L;

    /** Standard Constructor */
    public X_s_dividends (Properties ctx, int s_dividends_ID, String trxName)
    {
      super (ctx, s_dividends_ID, trxName);
      /** if (s_dividends_ID == 0)
        {
			sets_dividend_manager_ID (0);
			sets_dividends_ID (0);
			setselected (false);
// N
        } */
    }

    /** Load Constructor */
    public X_s_dividends (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_dividends[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Date From.
		@param DateFrom 
		Starting date for a range
	  */
	public void setDateFrom (Timestamp DateFrom)
	{
		set_Value (COLUMNNAME_DateFrom, DateFrom);
	}

	/** Get Date From.
		@return Starting date for a range
	  */
	public Timestamp getDateFrom () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFrom);
	}

	/** Set Date To.
		@param DateTo 
		End date of a date range
	  */
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
	}

	/** Set Dividend Amount.
		@param DividendAmount Dividend Amount	  */
	public void setDividendAmount (BigDecimal DividendAmount)
	{
		set_Value (COLUMNNAME_DividendAmount, DividendAmount);
	}

	/** Get Dividend Amount.
		@return Dividend Amount	  */
	public BigDecimal getDividendAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DividendAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Dividend Date.
		@param DividendDate Dividend Date	  */
	public void setDividendDate (Timestamp DividendDate)
	{
		set_Value (COLUMNNAME_DividendDate, DividendDate);
	}

	/** Get Dividend Date.
		@return Dividend Date	  */
	public Timestamp getDividendDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DividendDate);
	}

	/** Set Dividend Rate.
		@param dividend_rate Dividend Rate	  */
	public void setdividend_rate (BigDecimal dividend_rate)
	{
		set_Value (COLUMNNAME_dividend_rate, dividend_rate);
	}

	/** Get Dividend Rate.
		@return Dividend Rate	  */
	public BigDecimal getdividend_rate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_dividend_rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Net Dividend.
		@param NetDividend Net Dividend	  */
	public void setNetDividend (BigDecimal NetDividend)
	{
		set_Value (COLUMNNAME_NetDividend, NetDividend);
	}

	/** Get Net Dividend.
		@return Net Dividend	  */
	public BigDecimal getNetDividend () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NetDividend);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set s_dividend_manager ID.
		@param s_dividend_manager_ID s_dividend_manager ID	  */
	public void sets_dividend_manager_ID (int s_dividend_manager_ID)
	{
		if (s_dividend_manager_ID < 1) 
			set_Value (COLUMNNAME_s_dividend_manager_ID, null);
		else 
			set_Value (COLUMNNAME_s_dividend_manager_ID, Integer.valueOf(s_dividend_manager_ID));
	}

	/** Get s_dividend_manager ID.
		@return s_dividend_manager ID	  */
	public int gets_dividend_manager_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_dividend_manager_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_dividends ID.
		@param s_dividends_ID s_dividends ID	  */
	public void sets_dividends_ID (int s_dividends_ID)
	{
		if (s_dividends_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_dividends_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_dividends_ID, Integer.valueOf(s_dividends_ID));
	}

	/** Get s_dividends ID.
		@return s_dividends ID	  */
	public int gets_dividends_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_dividends_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Select.
		@param selected Select	  */
	public void setselected (boolean selected)
	{
		set_Value (COLUMNNAME_selected, Boolean.valueOf(selected));
	}

	/** Get Select.
		@return Select	  */
	public boolean isselected () 
	{
		Object oo = get_Value(COLUMNNAME_selected);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	public I_s_member gets_member() throws RuntimeException
    {
		return (I_s_member)MTable.get(getCtx(), I_s_member.Table_Name)
			.getPO(gets_member_ID(), get_TrxName());	}

	/** Set Member.
		@param s_member_ID Member	  */
	public void sets_member_ID (int s_member_ID)
	{
		if (s_member_ID < 1) 
			set_Value (COLUMNNAME_s_member_ID, null);
		else 
			set_Value (COLUMNNAME_s_member_ID, Integer.valueOf(s_member_ID));
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

	/** Set Withhoding Tax.
		@param WithhodingTax Withhoding Tax	  */
	public void setWithhodingTax (BigDecimal WithhodingTax)
	{
		set_Value (COLUMNNAME_WithhodingTax, WithhodingTax);
	}

	/** Get Withhoding Tax.
		@return Withhoding Tax	  */
	public BigDecimal getWithhodingTax () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithhodingTax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Withholding Tax Rate.
		@param WithholdingTaxRate Withholding Tax Rate	  */
	public void setWithholdingTaxRate (BigDecimal WithholdingTaxRate)
	{
		set_Value (COLUMNNAME_WithholdingTaxRate, WithholdingTaxRate);
	}

	/** Get Withholding Tax Rate.
		@return Withholding Tax Rate	  */
	public BigDecimal getWithholdingTaxRate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WithholdingTaxRate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}