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

/** Generated Model for s_interest_rate_history
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_interest_rate_history extends PO implements I_s_interest_rate_history, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190409L;

    /** Standard Constructor */
    public X_s_interest_rate_history (Properties ctx, int s_interest_rate_history_ID, String trxName)
    {
      super (ctx, s_interest_rate_history_ID, trxName);
      /** if (s_interest_rate_history_ID == 0)
        {
			sets_interest_rate_history_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_interest_rate_history (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_interest_rate_history[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Effect Date.
		@param EffectDate Effect Date	  */
	public void setEffectDate (Timestamp EffectDate)
	{
		set_Value (COLUMNNAME_EffectDate, EffectDate);
	}

	/** Get Effect Date.
		@return Effect Date	  */
	public Timestamp getEffectDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EffectDate);
	}

	/** Set New Rate.
		@param new_rate New Rate	  */
	public void setnew_rate (BigDecimal new_rate)
	{
		set_Value (COLUMNNAME_new_rate, new_rate);
	}

	/** Get New Rate.
		@return New Rate	  */
	public BigDecimal getnew_rate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_new_rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Old Rate.
		@param old_rate Old Rate	  */
	public void setold_rate (BigDecimal old_rate)
	{
		set_Value (COLUMNNAME_old_rate, old_rate);
	}

	/** Get Old Rate.
		@return Old Rate	  */
	public BigDecimal getold_rate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_old_rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set s_interest_rate_history ID.
		@param s_interest_rate_history_ID s_interest_rate_history ID	  */
	public void sets_interest_rate_history_ID (int s_interest_rate_history_ID)
	{
		if (s_interest_rate_history_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_interest_rate_history_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_interest_rate_history_ID, Integer.valueOf(s_interest_rate_history_ID));
	}

	/** Get s_interest_rate_history ID.
		@return s_interest_rate_history ID	  */
	public int gets_interest_rate_history_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_interest_rate_history_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Loan Type.
		@param s_loantype_ID Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID)
	{
		if (s_loantype_ID < 1) 
			set_Value (COLUMNNAME_s_loantype_ID, null);
		else 
			set_Value (COLUMNNAME_s_loantype_ID, Integer.valueOf(s_loantype_ID));
	}

	/** Get Loan Type.
		@return Loan Type	  */
	public int gets_loantype_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_loantype_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}