package practice;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createworkbook {

	public static void main(String[] args) throws Exception {
		File file =new File(".\\src\\test\\java\\createWb.xlsx");
		FileOutputStream fos =new FileOutputStream(file);
		XSSFWorkbook wb =new XSSFWorkbook();
		wb.close();
		fos.close();
	}

}
