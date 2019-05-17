package org.sacco.callout;

import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.X_s_account_activity_report;
import org.compiere.util.Env;

public class AccountActivityReportCallout extends CalloutEngine {
	public String print(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		int s_account_activity_report_ID = (int) mTab.getValue("s_account_activity_report_ID");
		X_s_account_activity_report report = new X_s_account_activity_report(Env.getCtx(), s_account_activity_report_ID,
				null);
		StringBuilder whereClause = new StringBuilder();
		whereClause.append("select  distinct account_id from adempiere.fact_acct WHERE 1=1 ");

		boolean select_multiple = (boolean) mTab.getValue("select_multiple");
		if (select_multiple) {
			whereClause.append(getMultipleAccountsWhereClause(s_account_activity_report_ID));
		} else {
			int C_ElementValue_ID = (int) mTab.getValue("C_ElementValue_ID");
			String s = " AND account_id=" + C_ElementValue_ID + " ";
			whereClause.append(s);
		}
		boolean select_date = (boolean) mTab.getValue("select_date");
		if (select_date) {
			Timestamp date = (Timestamp) mTab.getValue("Date1");

			String dateStr = "'" + date.toString() + "'" + "::date ";

			String s = " AND dateacct::date=" + dateStr;
			whereClause.append(s);
		} else {

		}
		report.setWhereClause(whereClause.toString());
		//report.save();
		mTab.setValue("WhereClause", whereClause.toString());
		
		System.out.println(whereClause.toString());

		return null;
	}

	private String getMultipleAccountsWhereClause(int s_account_activity_report_ID) {
		String sql = " AND account_id IN (SELECT c_elementvalue_id FROM adempiere.s_selected_report_accounts"
				+ " WHERE s_account_activity_report_ID = " + 1000000 + ")";
		return sql;
	}
}
