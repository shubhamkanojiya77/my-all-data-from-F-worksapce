package com.abc.retestelements;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		//Test Case-      User should be able to calculate number of columns
		// Test steps 	-  open the browser , enter url (https://demoqa.com/webtables), click on search button 
		// Prerequiste  - User should be on web table page	
		// Expected Result - User should get the LIST OF number of column
	
		System.setProperty("WebDriver.Chrome.Driver", "F:\\java eclipse\\DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(" hello shubhyam");
		
		
			
		
		
	// find number of ROWS
		//div[@class="rt-table"]//div[@class="rt-tbody"]/div/div
		List<WebElement> allrow =driver.findElements(By.xpath("//div[@class=\"rt-table\"]//div[@class=\"rt-tbody\"]/div/div/*"));
		
		System.out.println(	allrow.size());
	 java.util.Iterator<WebElement> allrowlist = allrow.iterator();
	 while(allrowlist.hasNext())  // ISSE ALL DATA BHI MILA
	 {
		 WebElement eachrowdata=allrowlist.next();
		 System.out.println("Total number of ROWS " +eachrowdata.getSize());//
		 
	 }  

	
	 // FIND NUMBER OF COLUMNS 
	//div[@class="rt-tr"]
	 List<WebElement> allcolumn =driver.findElements(By.xpath("//div[@class=\"rt-tr\"]/*"));
		
		System.out.println(	 allcolumn.size());
	 java.util.Iterator<WebElement> allcolumnlist = allcolumn.iterator();
	 while(allcolumnlist.hasNext())
	 {
		 WebElement eachcolumndata=allcolumnlist.next();
		 System.out.print("Total number of COLUMNS " +eachcolumndata.getSize());//
		 
	 }

	
	 // find the all data of row
	//div[@class="rt-tbody"]
	 List<WebElement> allrow1 =driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]"));
		System.out.println(	allrow1.size());
	 java.util.Iterator<WebElement> allrowlist1 = allrow1.iterator();
	 while(allrowlist1.hasNext()) // ISSE ALL DATA BHI MILA
	 {
		 WebElement eachrowdata1=allrowlist1.next();
		 System.out.print("ALL THE DATA OF ROW: " + eachrowdata1.getText());//
		 
	 }

	 
	 // print whole table
	//div[@class="rt-table"]
	 
List<WebElement> table =driver.findElements(By.xpath("//div[@class=\"rt-table\"]"));
		
		System.out.println(	table.size());
	 java.util.Iterator<WebElement> tablelist = table.iterator();
	 while(tablelist.hasNext())
	 {
		 WebElement eachtabledata=tablelist.next();
		 System.out.println("REALLY PRINTED THE WHOLE TABLE DATA: "+eachtabledata.getText());//
		 
	 } 
	 
		}
	}
	
	

	/*
		
		//---------------------------****----------------------------------
	
		//DYNAMIC XPATH each cell --->> //div[@class="rt-table"]//div/div/descendant::div//div[@class="rt-table"]//div/div/descendant::div
		
		// ABSOLUTE X PATH w/o column header each cell ----> /html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[r]/div[1]/div[c]

	// 1) 	using ABSOLUTE X PATH------------->>>>   find element
	// FIND THE ROW AND COLUMN NUMBER WHICH HAS "VEGA"	
		
		List<WebElement> columnlist = driver.findElements(By.xpath("//div[@class=\"rt-tr\"]"));
		columnlist.size();
		List<WebElement> rowlist = driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]"));
		rowlist.size();
	/*	WebElement eachcellabspath = driver.findElement (By.xpath("/html[1]"
				+ "/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"
				+ "/div[1]/div[2]/div[r]/div[1]/div[c]"));
		
		for (int r=1; r<=rowlist.size();r++)
		{
			for (int c=1;c<columnlist.size();c++)
			{
				WebElement eachcellabspath1 = driver.findElement(By.xpath("/html[1]"
						+ "/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"
						+ "/div[1]/div[2]/div["+r+"]/div[1]/div["+c+"]"));
				
				if(eachcellabspath1.getText().contains("Vega"))
				{	
				System.out.println(+ r + c);
				System.out.println("row no. :"+ r );
				System.out.println("column no. :"+ c);
				break;
				}
			}
		
		}*/
