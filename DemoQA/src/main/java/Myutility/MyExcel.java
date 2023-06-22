package Myutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.abc.commomfunctionality.browser;
import com.abc.elements.DROPDOWN;
import com.abc.elements.selectdropdownOPTIMIZATION;

public class MyExcel   {

	public static void main(String[] args)throws IOException {
		
		FileInputStream file = new  FileInputStream ("F:\\java eclipse\\DemoQA\\src\\main\\resources//shubham.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook (file);
		 	
		XSSFSheet sheet =workbook.getSheet("mahi");
		
		int rowcount = sheet.getLastRowNum();  // int rowcount = sheet.getLastRowNum();
	
		// get cell values
		
		for (int i=1 ; i<rowcount; i++) // for (i=0 ; i<rowcount; i++) 
		{
			XSSFRow currentrow= sheet.getRow(i);
			
			// get the column or cell
			//XSSFCell cell= currentrow.getCell(i-1);
			
		//	String namecolumn = currentrow.getCell(0).getStringCellValue();
		
			
			String name = currentrow.getCell(0).toString();   // column
			//String age = currentrow.getCell(1).toString();    // column
			int age = (int) currentrow.getCell(1).getNumericCellValue(); // returns double hence type cast
		//	String phonenumber = currentrow.getCell(2).toString();
			int phonenumber = (int) currentrow.getCell(2).getNumericCellValue();// returns double hence type cast 
		//  String percentage = currentrow.getCell(3).toString();
			double percentage =  currentrow.getCell(3).getNumericCellValue(); // returns double hence type cast
	
			// note --->>
			//.sendkeys(String.valueOf(phonenumber));        // convert from double/int into string format
			// Double.parseInt(phonenumber);				//  double to string convert
			// Integer.parseInt(phonenumber);				//  integer to string convert
			
			
			//*************************
			System.out.println(name);
			System.out.println(age);
			System.out.println(phonenumber);
			System.out.println(percentage);
			
			
			//*************************************
			
			browser.driver.findElement(By.xpath("")).sendKeys(name);
			browser.driver.findElement(By.xpath("")).sendKeys(String.valueOf(age));
			browser.driver.findElement(By.xpath("")).sendKeys(String.valueOf(phonenumber));
			browser.driver.findElement(By.xpath("")).sendKeys(String.valueOf(percentage));
		
			//   bootstrap dropdown
			List<WebElement> 	studentdropdown = browser.driver.findElements(By.xpath(""));
			 DROPDOWN.dropdownselect(studentdropdown, name); // meri utility
			
			// select dropdown 
			 
			 WebElement studentdropdown2 = browser.driver.findElement(By.xpath("")); 
			Select select = new Select((WebElement) browser.driver);
			
			selectdropdownOPTIMIZATION.dropdown(studentdropdown2, String.valueOf(age), "VisisbleText");
			
		
		}	
			
	}	
	
	
	public static void excelreader(String path, String sheetname, int j, String type) throws IOException
	
	{
	FileInputStream file = new  FileInputStream (path);
	
	XSSFWorkbook workbook= new XSSFWorkbook (file);
	 	
	XSSFSheet sheet =workbook.getSheet(sheetname);
	
	int rowcount = sheet.getLastRowNum();  // int rowcount = sheet.getLastRowNum();

	// get cell values
	
	for (int i=1 ; i<rowcount; i++) // for (i=0 ; i<rowcount; i++) 
	{
		XSSFRow currentrow= sheet.getRow(i);
		switch (type)
		{
		case "String":
			System.out.println(currentrow.getCell(j).getStringCellValue());
		case "integer":
			System.out.println(currentrow.getCell(j).getNumericCellValue());
		case "Formula":
			System.out.println(currentrow.getCell(j).getCellFormula());
		}	
	}
	
	}
	
	
	
}
		
	
	


