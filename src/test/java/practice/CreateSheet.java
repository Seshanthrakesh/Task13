package practice;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet sheet =wb.createSheet("Practice_Sheet1");
		File file =new File(".\\src\\test\\java\\createSheet.xlsx");
		FileOutputStream fos =new FileOutputStream(file);
		   wb.write(fos);
	
	
	}

}
