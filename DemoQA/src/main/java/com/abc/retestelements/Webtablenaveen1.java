package com.abc.retestelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablenaveen1 {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver", "F:\\java eclipse\\DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		 
	
	
	
	 
	//DYNAMIC XPATH each cell --->> //div[@class="rt-table"]//div/div/descendant::div//div[@class="rt-table"]//div/div/descendant::div
	
	// ABSOLUTE X PATH w/o column header each cell ----> /html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[r]/div[1]/div[c]

	 
	 
// 1) 	using ABSOLUTE X PATH------------->>>>   find element
// FIND THE ROW AND COLUMN NUMBER WHICH HAS "VEGA"	
	
	List<WebElement> columnlist = driver.findElements(By.xpath("//div[@class=\"rt-tr\"]/*"));
	
	List<WebElement> rowlist = driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]"));
	
	/*WebElement eachcellabspath = driver.findElement (By.xpath("/html[1]"
			+ "/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"
			+ "/div[1]/div[2]/div[r]/div[1]/div[c]"));*/
	
	
	 for (int r=1; r<=rowlist.size();r++)
	{
		for (int c=1;c<columnlist.size();c++)
		{
			WebElement eachcellabspath1 = driver.findElement(By.xpath("/html[1]"
					+ "/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"
					+ "/div[1]/div[2]/div["+r+"]/div[1]/div["+c+"]"));
			
			if(eachcellabspath1.getText().contains("Vega"))
			{	
			
			System.out.println("row no. :"+ r );
			System.out.println("column no. :"+ c);
			break;
			}
		}
	
	}

		 
		//  2) 
		//demo qa ... delete where salary= 10000

		//dynamic x path

			List<WebElement> eachcell = driver.findElements(By.xpath("//div"
				+ "[@class=\"rt-table\"]//div/div/descendant::div//div[@class=\"rt-table\"]"
				+ "//div/div/descendant::div"));
			for (int i=0;i<eachcell.size();i++)
			{
		if(eachcell.get(i).getText().equals("2000"))
		{
			WebElement deletebutton= driver.findElement(By.xpath("//span[@title=\"Delete\"]"));
			deletebutton.click();
			
		}	
		break;
			}
	}
			
	//  3)  method making in same code 
	public boolean rowandcolumn (String name) {
	List<WebElement> columnlist = driver.findElements(By.xpath("//div[@class=\"rt-tr\"]/*"));
	List<WebElement> rowlist = driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]"));
	
	boolean flag = false ;
	for (int r=1; r<=rowlist.size();r++)
	{
		for (int c=1;c<columnlist.size();c++)
		{
			WebElement eachcellabspath1 = driver.findElement(By.xpath("/html[1]"
					+ "/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"
					+ "/div[1]/div[2]/div["+r+"]/div[1]/div["+c+"]"));
			
			if(eachcellabspath1.getText().contains(name))
			{	
			flag=true; //only remember this
			System.out.println("row no. :"+ r );
			System.out.println("column no. :"+ c);
			break;
			}
		}
	}
	/*if(flag)
	{
	return true;	
	}
	else {
		return false;
	}*/
		return flag;
	}
	
	}
	




