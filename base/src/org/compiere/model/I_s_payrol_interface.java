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

/** Generated Interface for s_payrol_interface
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0
 */
public interface I_s_payrol_interface 
{

    /** TableName=s_payrol_interface */
    public static final String Table_Name = "s_payrol_interface";

    /** AD_Table_ID=1000031 */
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

    /** Column name bankgl_Acct */
    public static final String COLUMNNAME_bankgl_Acct = "bankgl_Acct";

	/** Set Bank GL Code	  */
	public void setbankgl_Acct (int bankgl_Acct);

	/** Get Bank GL Code	  */
	public int getbankgl_Acct();

	public I_C_ValidCombination getbankgl_A() throws RuntimeException;

    /** Column name btn_compare */
    public static final String COLUMNNAME_btn_compare = "btn_compare";

	/** Set Compare	  */
	public void setbtn_compare (String btn_compare);

	/** Get Compare	  */
	public String getbtn_compare();

    /** Column name btn_import */
    public static final String COLUMNNAME_btn_import = "btn_import";

	/** Set Import	  */
	public void setbtn_import (String btn_import);

	/** Get Import	  */
	public String getbtn_import();

    /** Column name btn_list */
    public static final String COLUMNNAME_btn_list = "btn_list";

	/** Set List	  */
	public void setbtn_list (String btn_list);

	/** Get List	  */
	public String getbtn_list();

    /** Column name btn_merge */
    public static final String COLUMNNAME_btn_merge = "btn_merge";

	/** Set Merge	  */
	public void setbtn_merge (String btn_merge);

	/** Get Merge	  */
	public String getbtn_merge();

    /** Column name btn_post */
    public static final String COLUMNNAME_btn_post = "btn_post";

	/** Set Post	  */
	public void setbtn_post (String btn_post);

	/** Get Post	  */
	public String getbtn_post();

    /** Column name btn_process */
    public static final String COLUMNNAME_btn_process = "btn_process";

	/** Set Process	  */
	public void setbtn_process (String btn_process);

	/** Get Process	  */
	public String getbtn_process();

    /** Column name btn_update */
    public static final String COLUMNNAME_btn_update = "btn_update";

	/** Set Update	  */
	public void setbtn_update (String btn_update);

	/** Get Update	  */
	public String getbtn_update();

    /** Column name C_Period_ID */
    public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

	/** Set Period.
	  * Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID);

	/** Get Period.
	  * Period of the Calendar
	  */
	public int getC_Period_ID();

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException;

    /** Column name ChequeNo */
    public static final String COLUMNNAME_ChequeNo = "ChequeNo";

	/** Set Cheque No	  */
	public void setChequeNo (String ChequeNo);

	/** Get Cheque No	  */
	public String getChequeNo();

    /** Column name compared */
    public static final String COLUMNNAME_compared = "compared";

	/** Set Compared	  */
	public void setcompared (boolean compared);

	/** Get Compared	  */
	public boolean iscompared();

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

    /** Column name csv_imported */
    public static final String COLUMNNAME_csv_imported = "csv_imported";

	/** Set CSV Imported	  */
	public void setcsv_imported (boolean csv_imported);

	/** Get CSV Imported	  */
	public boolean iscsv_imported();

    /** Column name disp001 */
    public static final String COLUMNNAME_disp001 = "disp001";

	/** Set disp001	  */
	public void setdisp001 (boolean disp001);

	/** Get disp001	  */
	public boolean isdisp001();

    /** Column name gross */
    public static final String COLUMNNAME_gross = "gross";

	/** Set Gross Amount	  */
	public void setgross (int gross);

	/** Get Gross Amount	  */
	public int getgross();

	public I_C_ValidCombination getgr() throws RuntimeException;

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

    /** Column name IsComplete */
    public static final String COLUMNNAME_IsComplete = "IsComplete";

	/** Set Complete.
	  * It is complete
	  */
	public void setIsComplete (boolean IsComplete);

	/** Get Complete.
	  * It is complete
	  */
	public boolean isComplete();

    /** Column name number_of_records */
    public static final String COLUMNNAME_number_of_records = "number_of_records";

	/** Set Number of Records	  */
	public void setnumber_of_records (int number_of_records);

	/** Get Number of Records	  */
	public int getnumber_of_records();

    /** Column name payroll_no */
    public static final String COLUMNNAME_payroll_no = "payroll_no";

	/** Set Payroll NO	  */
	public void setpayroll_no (String payroll_no);

	/** Get Payroll NO	  */
	public String getpayroll_no();

    /** Column name repaymode */
    public static final String COLUMNNAME_repaymode = "repaymode";

	/** Set Repay Mode	  */
	public void setrepaymode (String repaymode);

	/** Get Repay Mode	  */
	public String getrepaymode();

    /** Column name s_department_ID */
    public static final String COLUMNNAME_s_department_ID = "s_department_ID";

	/** Set Department	  */
	public void sets_department_ID (int s_department_ID);

	/** Get Department	  */
	public int gets_department_ID();

    /** Column name s_employers_ID */
    public static final String COLUMNNAME_s_employers_ID = "s_employers_ID";

	/** Set Employer	  */
	public void sets_employers_ID (int s_employers_ID);

	/** Get Employer	  */
	public int gets_employers_ID();

    /** Column name s_loantype_ID */
    public static final String COLUMNNAME_s_loantype_ID = "s_loantype_ID";

	/** Set Loan Type	  */
	public void sets_loantype_ID (int s_loantype_ID);

	/** Get Loan Type	  */
	public int gets_loantype_ID();

    /** Column name s_member_ID */
    public static final String COLUMNNAME_s_member_ID = "s_member_ID";

	/** Set Member	  */
	public void sets_member_ID (int s_member_ID);

	/** Get Member	  */
	public int gets_member_ID();

	public I_s_member gets_member() throws RuntimeException;

    /** Column name s_payrol_interface_ID */
    public static final String COLUMNNAME_s_payrol_interface_ID = "s_payrol_interface_ID";

	/** Set s_payrol_interface ID	  */
	public void sets_payrol_interface_ID (int s_payrol_interface_ID);

	/** Get s_payrol_interface ID	  */
	public int gets_payrol_interface_ID();

    /** Column name s_sharetype_ID */
    public static final String COLUMNNAME_s_sharetype_ID = "s_sharetype_ID";

	/** Set Share Type	  */
	public void sets_sharetype_ID (int s_sharetype_ID);

	/** Get Share Type	  */
	public int gets_sharetype_ID();

	public I_s_sharetype gets_sharetype() throws RuntimeException;

    /** Column name s_station_ID */
    public static final String COLUMNNAME_s_station_ID = "s_station_ID";

	/** Set Station	  */
	public void sets_station_ID (int s_station_ID);

	/** Get Station	  */
	public int gets_station_ID();

    /** Column name time_taken */
    public static final String COLUMNNAME_time_taken = "time_taken";

	/** Set Time Taken To Load The List	  */
	public void settime_taken (String time_taken);

	/** Get Time Taken To Load The List	  */
	public String gettime_taken();

    /** Column name total_contribution */
    public static final String COLUMNNAME_total_contribution = "total_contribution";

	/** Set Total Contribution	  */
	public void settotal_contribution (BigDecimal total_contribution);

	/** Get Total Contribution	  */
	public BigDecimal gettotal_contribution();

    /** Column name total_othercharges */
    public static final String COLUMNNAME_total_othercharges = "total_othercharges";

	/** Set Total Other Charges	  */
	public void settotal_othercharges (BigDecimal total_othercharges);

	/** Get Total Other Charges	  */
	public BigDecimal gettotal_othercharges();

    /** Column name TransactionType */
    public static final String COLUMNNAME_TransactionType = "TransactionType";

	/** Set Transaction Type	  */
	public void setTransactionType (String TransactionType);

	/** Get Transaction Type	  */
	public String getTransactionType();

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
