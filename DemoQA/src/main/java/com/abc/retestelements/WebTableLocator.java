package com.abc.retestelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableLocator {

	public static void main(String[] args) {
		
		//Test Case- User should be able to calculate number of columns
		// Test steps 	-  open the browser , enter url (https://demoqa.com/webtables), click on search button 
		// Prerequiste  - User should be on web table page	
		// Expected Result - User should get the LIST OF number of column
			
		System.setProperty("WebDriver.Chrome.Driver", "F:\\java eclipse\\DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
				
		
		
	}

}
