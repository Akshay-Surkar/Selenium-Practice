package selenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practicesExcel {

	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Book2.xlsx";
		
		File fle = new File(path);
		FileInputStream fis = new FileInputStream(fle);
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		DataFormatter df = new DataFormatter();
		df.formatCellValue(sh1.getRow(0).getCell(0));
		
		

	}
	//------------------GENERALISE METHOD----------------------------------------------
  public static void read(int row, int column) throws IOException {
	  
  
	String path="C:\\Users\\Akshay\\Desktop\\Book2.xlsx";
	
	File fle = new File(path);
	FileInputStream fis = new FileInputStream(fle);
	XSSFWorkbook wb  = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheetAt(0);
	DataFormatter df = new DataFormatter();
	String value = df.formatCellValue(sh1.getRow(row).getCell(column));
	System.out.println(value);
	
}}
