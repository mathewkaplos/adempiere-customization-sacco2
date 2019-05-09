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

/** Generated Interface for s_shamba
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_shamba 
{

    /** TableName=s_shamba */
    public static final String Table_Name = "s_shamba";

    /** AD_Table_ID=1000042 */
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

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

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

    /** Column name location */
    public static final String COLUMNNAME_location = "location";

	/** Set Location	  */
	public void setlocation (String location);

	/** Get Location	  */
	public String getlocation();

    /** Column name net_gain_gl_Acct */
    public static final String COLUMNNAME_net_gain_gl_Acct = "net_gain_gl_Acct";

	/** Set Net Gain GL Account	  */
	public void setnet_gain_gl_Acct (int net_gain_gl_Acct);

	/** Get Net Gain GL Account	  */
	public int getnet_gain_gl_Acct();

	public I_C_ValidCombination getnet_gain_gl_A() throws RuntimeException;

    /** Column name number_of_plots */
    public static final String COLUMNNAME_number_of_plots = "number_of_plots";

	/** Set Number of Plots	  */
	public void setnumber_of_plots (int number_of_plots);

	/** Get Number of Plots	  */
	public int getnumber_of_plots();

    /** Column name numbering_sequence */
    public static final String COLUMNNAME_numbering_sequence = "numbering_sequence";

	/** Set Numbering Sequence(start number)	  */
	public void setnumbering_sequence (int numbering_sequence);

	/** Get Numbering Sequence(start number)	  */
	public int getnumbering_sequence();

    /** Column name plot_gl_Acct */
    public static final String COLUMNNAME_plot_gl_Acct = "plot_gl_Acct";

	/** Set Asset GL Account	  */
	public void setplot_gl_Acct (int plot_gl_Acct);

	/** Get Asset GL Account	  */
	public int getplot_gl_Acct();

	public I_C_ValidCombination getplot_gl_A() throws RuntimeException;

    /** Column name plots_sold */
    public static final String COLUMNNAME_plots_sold = "plots_sold";

	/** Set Plots Sold	  */
	public void setplots_sold (int plots_sold);

	/** Get Plots Sold	  */
	public int getplots_sold();

    /** Column name s_shamba_ID */
    public static final String COLUMNNAME_s_shamba_ID = "s_shamba_ID";

	/** Set Shamba	  */
	public void sets_shamba_ID (int s_shamba_ID);

	/** Get Shamba	  */
	public int gets_shamba_ID();

    /** Column name size */
    public static final String COLUMNNAME_size = "size";

	/** Set Size (Hectares)	  */
	public void setsize (BigDecimal size);

	/** Get Size (Hectares)	  */
	public BigDecimal getsize();

    /** Column name total_purchase_price */
    public static final String COLUMNNAME_total_purchase_price = "total_purchase_price";

	/** Set Total Purchase Price	  */
	public void settotal_purchase_price (BigDecimal total_purchase_price);

	/** Get Total Purchase Price	  */
	public BigDecimal gettotal_purchase_price();

    /** Column name total_selling_price */
    public static final String COLUMNNAME_total_selling_price = "total_selling_price";

	/** Set Total Selling Price	  */
	public void settotal_selling_price (BigDecimal total_selling_price);

	/** Get Total Selling Price	  */
	public BigDecimal gettotal_selling_price();

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
}
