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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for s_dividends
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_s_dividends 
{

    /** TableName=s_dividends */
    public static final String Table_Name = "s_dividends";

    /** AD_Table_ID=1000112 */
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

    /** Column name DateFrom */
    public static final String COLUMNNAME_DateFrom = "DateFrom";

	/** Set Date From.
	  * Starting date for a range
	  */
	public void setDateFrom (Timestamp DateFrom);

	/** Get Date From.
	  * Starting date for a range
	  */
	public Timestamp getDateFrom();

    /** Column name DateTo */
    public static final String COLUMNNAME_DateTo = "DateTo";

	/** Set Date To.
	  * End date of a date range
	  */
	public void setDateTo (Timestamp DateTo);

	/** Get Date To.
	  * End date of a date range
	  */
	public Timestamp getDateTo();

    /** Column name DividendAmount */
    public static final String COLUMNNAME_DividendAmount = "DividendAmount";

	/** Set Dividend Amount	  */
	public void setDividendAmount (BigDecimal DividendAmount);

	/** Get Dividend Amount	  */
	public BigDecimal getDividendAmount();

    /** Column name DividendDate */
    public static final String COLUMNNAME_DividendDate = "DividendDate";

	/** Set Dividend Date	  */
	public void setDividendDate (Timestamp DividendDate);

	/** Get Dividend Date	  */
	public Timestamp getDividendDate();

    /** Column name dividend_rate */
    public static final String COLUMNNAME_dividend_rate = "dividend_rate";

	/** Set Dividend Rate	  */
	public void setdividend_rate (BigDecimal dividend_rate);

	/** Get Dividend Rate	  */
	public BigDecimal getdividend_rate();

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

    /** Column name NetDividend */
    public static final String COLUMNNAME_NetDividend = "NetDividend";

	/** Set Net Dividend	  */
	public void setNetDividend (BigDecimal NetDividend);

	/** Get Net Dividend	  */
	public BigDecimal getNetDividend();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name s_dividend_manager_ID */
    public static final String COLUMNNAME_s_dividend_manager_ID = "s_dividend_manager_ID";

	/** Set s_dividend_manager ID	  */
	public void sets_dividend_manager_ID (int s_dividend_manager_ID);

	/** Get s_dividend_manager ID	  */
	public int gets_dividend_manager_ID();

    /** Column name s_dividends_ID */
    public static final String COLUMNNAME_s_dividends_ID = "s_dividends_ID";

	/** Set s_dividends ID	  */
	public void sets_dividends_ID (int s_dividends_ID);

	/** Get s_dividends ID	  */
	public int gets_dividends_ID();

    /** Column name selected */
    public static final String COLUMNNAME_selected = "selected";

	/** Set Select	  */
	public void setselected (boolean selected);

	/** Get Select	  */
	public boolean isselected();

    /** Column name sharestodate */
    public static final String COLUMNNAME_sharestodate = "sharestodate";

	/** Set Shares To Date	  */
	public void setsharestodate (BigDecimal sharestodate);

	/** Get Shares To Date	  */
	public BigDecimal getsharestodate();

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

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

    /** Column name WithhodingTax */
    public static final String COLUMNNAME_WithhodingTax = "WithhodingTax";

	/** Set Withhoding Tax	  */
	public void setWithhodingTax (BigDecimal WithhodingTax);

	/** Get Withhoding Tax	  */
	public BigDecimal getWithhodingTax();

    /** Column name WithholdingTaxRate */
    public static final String COLUMNNAME_WithholdingTaxRate = "WithholdingTaxRate";

	/** Set Withholding Tax Rate	  */
	public void setWithholdingTaxRate (BigDecimal WithholdingTaxRate);

	/** Get Withholding Tax Rate	  */
	public BigDecimal getWithholdingTaxRate();
}
