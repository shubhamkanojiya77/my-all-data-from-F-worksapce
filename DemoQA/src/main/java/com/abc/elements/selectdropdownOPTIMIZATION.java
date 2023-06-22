package com.abc.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.abc.commomfunctionality.browser;

public class selectdropdownOPTIMIZATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		}
	
	public static void getmethod()
	{
		WebElement dropdown = browser.driver.findElement(By.xpath("mere framework ke according"));
	}
	
	// OR
	public static WebElement getmethod(String locator)
	{
		WebElement dropdown = browser.driver.findElement(By.xpath(locator));
		return dropdown;
	}
	// OR
	public static WebElement getmethod(By locator)
	{
		return browser.driver.findElement(locator);
	}
	//By locator=  by.xpath
	
	
	
	//   over loaded method of select drop down
	
	public static void dropdown (WebElement getmethod ,int index  )
	{
		Select select=new Select(getmethod );
		select.selectByIndex(index);
	}
	public static void dropdown  (WebElement getmethod , String visibletext)
	{
		Select select=new Select(getmethod );
		select.selectByVisibleText(visibletext);
	}
	public static void dropdown  (String valueattribute ,  WebElement getmethod )
	{
		Select select=new Select(getmethod );
		select.selectByValue(valueattribute);
		}

	
	//***************************
	
	
	public static void dropdown(WebElement getmethod, String value
			,int index,String valueattribute , String visibletext )
	{
		//UNABLE TO SELECT ONLY 2 OPTIONS ... YOU WILL HAVE TO USE ALL PARAMETER
	}
	
	
	
	//****** NOT USING ALL PARAMETER.. SWITCH CASE******
	
	public static void dropdown(WebElement getmethod , String value , String type)
	{
		switch(type) {
		
		case "index":
			Select select=new Select(getmethod );
			select.selectByIndex(Integer.parseInt(type));
			break;
		case "visisbleText" :
			Select select1=new Select(getmethod );
			select1.selectByVisibleText(value);
			break;
		case "value" :
			Select select2=new Select(getmethod );
			select2.selectByValue(value);
			break;
			default :
				System.out.println("please use correct selection criteria");
				break;
				
	}
	


}

	
}
