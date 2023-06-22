package com.abc.elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	
		
		List<WebElement> dropdown = driver.findElements(By.xpath(""));
		// no select class to use
		
		for (int i=0; i<dropdown.size(); i++ ) // select your value
		{
			dropdown.get(i).getText().contains("");
			//or
			//dropdown.get(i).getText().equals("");
			dropdown.get(i).click();
			break;
		}
		
		for (int i=0; i<dropdown.size(); i++ )  // get all value
		{
			System.out.println(dropdown.get(i).getText());	
		}
		
		
		
		
		
	}

	//*************** optimize**********
	public static void dropdownselect(List<WebElement> getdropdownmethod ,String value)
	
	{
		for (int i=0; i<getdropdownmethod.size(); i++ ) // select your value
		{
			getdropdownmethod.get(i).getText().contains(value);
			//or
			//dropdown.get(i).getText().equals("");
			getdropdownmethod.get(i).click();
			break;
		}
	}
	
public static void dropdownselect(List<WebElement> getdropdownmethod )
	
	{
		for (int i=0; i<getdropdownmethod.size(); i++ ) // get all  value
		{
			getdropdownmethod.get(i).getText();
			
			break;
		}
	}

//get size of dropdown
public static void dropdownsize(List<WebElement> getdropdownmethod )

{
	System.out.println(getdropdownmethod.size());
	}



}
