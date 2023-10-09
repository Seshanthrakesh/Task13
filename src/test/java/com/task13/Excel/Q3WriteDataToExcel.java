package com.task13.Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		sheet.createRow(0);
	      sheet.getRow(0).createCell(0).setCellValue("john doe");
	      sheet.getRow(0).createCell(1).setCellValue(30);
	      sheet.getRow(0).createCell(2).setCellValue("John@test.com");
	      
	      sheet.createRow(1);
	      sheet.getRow(1).createCell(0).setCellValue("Jane Doe");
	      sheet.getRow(1).createCell(1).setCellValue(28);
	      sheet.getRow(1).createCell(2).setCellValue("John@test.com");
	      
	      sheet.createRow(2);
	      sheet.getRow(2).createCell(0).setCellValue("Bob smith");
	      sheet.getRow(2).createCell(1).setCellValue(35);
	      sheet.getRow(2).createCell(2).setCellValue("Jacky@example.com");
	      
	      sheet.createRow(3);
	      sheet.getRow(3).createCell(0).setCellValue("Swapnil");
	      sheet.getRow(3).createCell(1).setCellValue(37);
	      sheet.getRow(3).createCell(2).setCellValue("Jacky@example.com");
	      File file =new File(".\\src\\test\\java\\com\\task13\\ExcelFiles\\Q3WriteDataToExcel.xlsx");
	      FileOutputStream fos =new FileOutputStream(file);
	      wb.write(fos );
		
	}

}
