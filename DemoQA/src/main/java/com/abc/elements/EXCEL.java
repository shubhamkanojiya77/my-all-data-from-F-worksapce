package com.abc.elements;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL {
	
	public static void main(String[] args) throws IOException {
		// open workbook
		XSSFWorkbook workbook=new XSSFWorkbook ("F:\\java eclipse\\DemoQA\\src\\main\\resources\\shubham.xlsx");

	// reach to your sheet 	
	XSSFSheet sheet= workbook.getSheet("mahi");
	//	XSSFSheet sheet1=	workbook.getSheetAt(2);
		
		// reach your row
		XSSFRow row = sheet.getRow(4);
		//	XSSFRow row1= sheet1.getRow(9);
		
		
		// reach your column or cell
		
		XSSFCell cell= row.getCell(3);
		//	System.out.println(cell);
		
		
		
		/// fatch or read value from excel
		
		System.out.println(cell.getCellType());// sabse pahale ye karna print karne ke pahale
		
		System.out.println(cell.getRichStringCellValue());
		// cell.getNumericCellValue();
		//	System.out.println(cell.getCellFormula());
	

		//*********************************************************
		public static void cellvalue( String type)
		{
		switch((cell.getCellType().name().equals(type))
		{
		case "String":
			System.out.println(cell.getRichStringCellValue());
		case "integer":
			System.out.println(cell.getNumericCellValue());
		case "Formula":
			System.out.println(cell.getCellFormula());
		}	
		}
		
		public  static void CellType(String type) 
		{
			
			if (cell.getCellType().name().equals(type))
			{return cell.getStringCellValue();}
			else if ((cell.getCellType().name().equals(type))
					{return cell.getNumericCellValue();}
			else if ((cell.getCellType().name().equals(type))
					{return cell.getCellFormula();}
			
		}

		
	//************	FIND OUT NO. OF SHEETS AND NAME
		
		Iterator<Sheet> sheet1=workbook.iterator();
	
		while(sheet1.hasNext())
		{
			System.out.println(sheet1.next().getSheetName());
		}
	
		
		
		//************ get theALL VALUE OF PARTICULAR COLUMN
		public static void columnvalue(List<WebElement> row1)
		{
		Iterator<Row>  row1 =sheet.rowIterator();
		while(row1.hasNext())
		{
			row1.next().getCell(0).getStringCellValue();// got all vALUE OF 1ST COLUMN
			
		}
		}
	

		
	
	


}