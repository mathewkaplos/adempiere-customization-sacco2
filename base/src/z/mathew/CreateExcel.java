package z.mathew;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("firstSheet"); 
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell= row.createCell(0);
		cell.setCellValue("1 cell ndjk");
		
		wb.write(new FileOutputStream("new.xls"));
		
		
	}

}
