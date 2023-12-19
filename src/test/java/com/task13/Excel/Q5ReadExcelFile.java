package com.task13.Excel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q5ReadExcelFile {
	public static void main(String[] args) throws Exception  {
		XSSFWorkbook wb =new XSSFWorkbook(".\\src\\test\\java\\\\com\\task13\\ExcelFiles\\Q3WriteDataToExcel.xlsx");
		XSSFSheet sheet =wb.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
				{
			XSSFRow row =sheet.getRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell cell =row.getCell(c);
				switch(cell.getCellType()) {
				case STRING : System.out.print(cell.getStringCellValue());break;
				case NUMERIC : System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				default:
					break;
				}
				System.out.print("  \t   ");
			}
			System.out.println();
		}
		wb.close();		
	}
	
}

		
    
