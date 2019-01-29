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
					String payroll_no = row[0];
					String name = row[1];
					String type = row[2];
					BigDecimal amount = new BigDecimal(row[3]);
					Payroll_csv csv = new Payroll_csv(getCtx(), 0, get_TrxName());
					csv.setpayroll_no(payroll_no);
					csv.setName(name);
					csv.setTransactionType(type);
					csv.setAmount(amount);
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
