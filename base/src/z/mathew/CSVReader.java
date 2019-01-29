package z.mathew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {

		String csvFile = "E:/380/Book1.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			int x = 0;
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] row = line.split(cvsSplitBy);
				// System.out.println(row.length);
				if (x >0)
					System.out.println("payroll: " + row[0] + " name=" + row[1] + "type="+row[2]+"Amount="+row[3]);
				x++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
