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
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for s_shamba_plot
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_shamba_plot extends PO implements I_s_shamba_plot, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190320L;

    /** Standard Constructor */
    public X_s_shamba_plot (Properties ctx, int s_shamba_plot_ID, String trxName)
    {
      super (ctx, s_shamba_plot_ID, trxName);
      /** if (s_shamba_plot_ID == 0)
        {
			sets_shamba_plot_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_shamba_plot (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_shamba_plot[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Plot Number.
		@param plot_number Plot Number	  */
	public void setplot_number (String plot_number)
	{
		set_Value (COLUMNNAME_plot_number, plot_number);
	}

	/** Get Plot Number.
		@return Plot Number	  */
	public String getplot_number () 
	{
		return (String)get_Value(COLUMNNAME_plot_number);
	}

	/** Set Plot size (Hectares).
		@param plot_size Plot size (Hectares)	  */
	public void setplot_size (BigDecimal plot_size)
	{
		set_Value (COLUMNNAME_plot_size, plot_size);
	}

	/** Get Plot size (Hectares).
		@return Plot size (Hectares)	  */
	public BigDecimal getplot_size () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_plot_size);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shamba.
		@param s_shamba_ID Shamba	  */
	public void sets_shamba_ID (int s_shamba_ID)
	{
		if (s_shamba_ID < 1) 
			set_Value (COLUMNNAME_s_shamba_ID, null);
		else 
			set_Value (COLUMNNAME_s_shamba_ID, Integer.valueOf(s_shamba_ID));
	}

	/** Get Shamba.
		@return Shamba	  */
	public int gets_shamba_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shamba_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Shamba Plot.
		@param s_shamba_plot_ID Shamba Plot	  */
	public void sets_shamba_plot_ID (int s_shamba_plot_ID)
	{
		if (s_shamba_plot_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_shamba_plot_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_shamba_plot_ID, Integer.valueOf(s_shamba_plot_ID));
	}

	/** Get Shamba Plot.
		@return Shamba Plot	  */
	public int gets_shamba_plot_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_shamba_plot_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Status AD_Reference_ID=1000032 */
	public static final int STATUS_AD_Reference_ID=1000032;
	/** Not Available = 0 */
	public static final String STATUS_NotAvailable = "0";
	/** Available = 1 */
	public static final String STATUS_Available = "1";
	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{

		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}
}