package z.mathew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel2 {

	private static Workbook wb;
	private static FileInputStream fis;
	private static Sheet sheet;
	private static Row row ;
	private static Cell cell ;

	public static void main(String[] args) {
		try {
			fis = new FileInputStream("./Book1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = wb.getSheet("Sheet1");
		int numOfRows =sheet.getLastRowNum();
		for (int i = 0; i < numOfRows; i++) {
			System.out.println("dd");
			
		}

	}

}
