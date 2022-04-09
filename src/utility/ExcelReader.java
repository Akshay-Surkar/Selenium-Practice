package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
public static void main(String[] args) throws IOException {
	String path = System.getProperty("user.dir")+"\\TestData\\Book2.xlsx";//we take the XL file path  
	File fle = new File(path);                                             // that 'path' we 'store' in the file object
	FileInputStream fis = new FileInputStream(fle); //this object we create to take data from the XL file
	XSSFWorkbook wb = new XSSFWorkbook(fis);       //we create this object to go to the XLSheet workbook
	// XSSFSheet sheet2 = wb.getSheet("Sheet1");//this is for to select the sheet at the basis of it's name
   XSSFSheet sheet1 = wb.getSheetAt(0);//this is for to select the sheet at the basis of it's index value 
       int count = sheet1.getLastRowNum();//to know the last number of row
       System.out.println(count);
      
   String value = sheet1.getRow(0).getCell(1).getStringCellValue();//it is used to fetch the data from the row and column
   System.out.println(value);
}
//---------------------Generalizing above method and can be use as in another class by calling just -------------------------
public static String readData(int row,int column) throws IOException {
	String path = System.getProperty("user.dir")+"\\TestData\\Book2.xlsx";
	File fle = new File(path);
	FileInputStream fis = new FileInputStream(fle);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
   XSSFSheet sheet1 = wb.getSheetAt(0);
       int count = sheet1.getLastRowNum();
       System.out.println(count);
      
   String value = sheet1.getRow(row).getCell(column).getStringCellValue();
   System.out.println(value);
	return value;
	
}
}
