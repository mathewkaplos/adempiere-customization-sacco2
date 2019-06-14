package org.sacco.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;

import org.compiere.model.Payroll_Interface;
import org.compiere.model.Payroll_csv;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class ImportPayroll extends SvrProcess {

	String p_file = null;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("file"))
				p_file = (String) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {
		deleteExisting();
		saveToDb(p_file);
		Payroll_Interface payroll_Interface = new Payroll_Interface(getCtx(), getRecord_ID(), get_TrxName());
		payroll_Interface.setcsv_imported(true);
		payroll_Interface.save();

		return null;
	}

	private void deleteExisting() {
		String sql = "DELETE FROM adempiere.z_payroll_csv WHERE s_payrol_interface_ID =" + getRecord_ID();
		DB.executeUpdate(sql, get_TrxName());
	}

	// // / CSV Headings and order
	// Payroll_Code
	// Item
	// Item_Code
	// Amount
	// Month
	// Year
	// Balance
	// Interest
	// Othercharges

	private void saveToDb(String file) {

		String csvFile = file;
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			int x = 0;
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] row = line.split(cvsSplitBy);
				// System.out.println(row.length);
				if (x > 0) {
					String Payroll_Code = row[0];
					String Item = row[1];
					String Item_Code = row[2];
					BigDecimal Amount = new BigDecimal(row[3]);
					String Month = row[4];
					String Year = row[5];
					BigDecimal Balance = new BigDecimal(row[6]);

					Payroll_csv csv = new Payroll_csv(getCtx(), 0, get_TrxName());
					csv.sets_payrol_interface_ID(getRecord_ID());
					csv.setPayroll_Code(Payroll_Code);
					csv.setItem(Item);
					csv.setItem_Code(Item_Code);
					csv.setAmount(Amount);
					csv.setMonth(Month);
					csv.setYear(Year);
					csv.setBalance(Balance);
					if (Item.equalsIgnoreCase("LOAN")) {
						BigDecimal Interest = new BigDecimal(row[7]);
						BigDecimal Othercharges = new BigDecimal(row[8]);
						csv.setInterest(Interest);
						csv.setothercharges(Othercharges);
					}
					csv.sets_payrol_interface_ID(getRecord_ID());
					csv.save();
				}
				x++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
