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

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for s_receipt_print_line
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_s_receipt_print_line extends PO implements I_s_receipt_print_line, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190322L;

    /** Standard Constructor */
    public X_s_receipt_print_line (Properties ctx, int s_receipt_print_line_ID, String trxName)
    {
      super (ctx, s_receipt_print_line_ID, trxName);
      /** if (s_receipt_print_line_ID == 0)
        {
			sets_receipt_print_line_ID (0);
        } */
    }

    /** Load Constructor */
    public X_s_receipt_print_line (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_s_receipt_print_line[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set s_receipt_print ID.
		@param s_receipt_print_ID s_receipt_print ID	  */
	public void sets_receipt_print_ID (int s_receipt_print_ID)
	{
		if (s_receipt_print_ID < 1) 
			set_Value (COLUMNNAME_s_receipt_print_ID, null);
		else 
			set_Value (COLUMNNAME_s_receipt_print_ID, Integer.valueOf(s_receipt_print_ID));
	}

	/** Get s_receipt_print ID.
		@return s_receipt_print ID	  */
	public int gets_receipt_print_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_receipt_print_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set s_receipt_print_line ID.
		@param s_receipt_print_line_ID s_receipt_print_line ID	  */
	public void sets_receipt_print_line_ID (int s_receipt_print_line_ID)
	{
		if (s_receipt_print_line_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_s_receipt_print_line_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_s_receipt_print_line_ID, Integer.valueOf(s_receipt_print_line_ID));
	}

	/** Get s_receipt_print_line ID.
		@return s_receipt_print_line ID	  */
	public int gets_receipt_print_line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_s_receipt_print_line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** transaction_type_remmittance AD_Reference_ID=1000034 */
	public static final int TRANSACTION_TYPE_REMMITTANCE_AD_Reference_ID=1000034;
	/** Loan Remmittancee = LR */
	public static final String TRANSACTION_TYPE_REMMITTANCE_LoanRemmittancee = "LR";
	/** Sahre Remmittancee = SR */
	public static final String TRANSACTION_TYPE_REMMITTANCE_SahreRemmittancee = "SR";
	/** Set Transaction Type (Loan / Share Remmittance).
		@param transaction_type_remmittance Transaction Type (Loan / Share Remmittance)	  */
	public void settransaction_type_remmittance (String transaction_type_remmittance)
	{

		set_Value (COLUMNNAME_transaction_type_remmittance, transaction_type_remmittance);
	}

	/** Get Transaction Type (Loan / Share Remmittance).
		@return Transaction Type (Loan / Share Remmittance)	  */
	public String gettransaction_type_remmittance () 
	{
		return (String)get_Value(COLUMNNAME_transaction_type_remmittance);
	}

	/** Set transactionid.
		@param transactionid transactionid	  */
	public void settransactionid (int transactionid)
	{
		set_Value (COLUMNNAME_transactionid, Integer.valueOf(transactionid));
	}

	/** Get transactionid.
		@return transactionid	  */
	public int gettransactionid () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_transactionid);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}