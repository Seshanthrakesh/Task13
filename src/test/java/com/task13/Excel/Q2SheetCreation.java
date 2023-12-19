package com.task13.Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2SheetCreation {

	public static void main(String[] args) throws IOException {
		//Creation of new Workbook
		XSSFWorkbook wb =new XSSFWorkbook();
		//Creation of new Sheet
		wb.createSheet("Sheet1");
		File file =new File(".\\src\\test\\java\\com\\task13\\ExcelFiles\\Q2SheetCreation.xlsx");
		FileOutputStream fos =new FileOutputStream(file);
		wb.write(fos);
		wb.close();


	}

}
