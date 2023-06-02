package JavaPrograms;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		File XLFile = new File("C:\\Users\\subas\\Desktop\\Subash.xlsx");
		
		FileInputStream input = new FileInputStream(XLFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row2 = sheet.getRow(0);
		
		XSSFCell Cdata = row2.getCell(0);
		
		System.out.println(Cdata.getStringCellValue());
		

	}

}
