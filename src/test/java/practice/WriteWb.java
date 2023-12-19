package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteWb {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Practice_Write");
		List <String[]> data = new ArrayList<>();
		data.add(new String[] {"Aby","30","aby123@gmail.com"});
		data.add(new String[] {"rakesh","25","Rakesh2346@gmail.com"});
		data.add(new String[] {"seshanth","25","Seshanthrakesh1901@gmail.com"});
		data.add(new String[] {"rakesh","25","Seshanth2346@gmail.com"});
		int rownum=0;
		for(String[] rowdata : data) {
			XSSFRow row =sheet.createRow(rownum++);
			int cellnum=0;
			for(String celldata: rowdata) {
			XSSFCell cell=row.createCell(cellnum++);
			cell.setCellValue(celldata);
			}
		}
		File file =new File(".\\src\\test\\java\\Writewb.xlsx");
		FileOutputStream fos =new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
	
}