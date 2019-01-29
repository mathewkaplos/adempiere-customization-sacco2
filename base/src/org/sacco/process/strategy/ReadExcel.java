package org.sacco.process.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("new.xls"));
		HSSFSheet sheet = wb.getSheetAt(0);

		HSSFRow row = sheet.getRow(0);
		if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING)
			System.out.println(row.getCell(0).getStringCellValue());
		read2();

	}

	static void  read2() throws FileNotFoundException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("new.xls"));
		XSSFSheet sheet = wb.getSheetAt(0);

		XSSFRow row = sheet.getRow(0);
		if (row.getCell(0).getCellType() == CellType.STRING)
			;
		System.out.println(row.getCell(0).getStringCellValue());
	}

}
