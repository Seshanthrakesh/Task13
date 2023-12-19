package com.task13.Excel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q4WriteExcelFile {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		sheet.createRow(0);
		//Writing Data to Excel File
	      sheet.getRow(0).createCell(0).setCellValue("Name");
	      sheet.getRow(0).createCell(1).setCellValue("Age");
	      sheet.getRow(0).createCell(2).setCellValue("Email");
	      File file =new File(".\\src\\test\\java\\com\\task13\\ExcelFiles\\Q4WriteExcelFile.xlsx");
	      FileOutputStream fos =new FileOutputStream(file);
	      wb.write(fos );
	      wb.close();
	}

}
