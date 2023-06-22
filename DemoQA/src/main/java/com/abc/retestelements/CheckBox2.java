package com.abc.retestelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
		
		// Test case 	- User should be able to click on Command check box under Desktop toggle
		// Test steps 	-  open the browser , enter url (https://demoqa.com/checkbox), click on search button
		//				   click on home check box TOGGLE
		// 				   Click on Desktop check box Toggle
		// 				   click on Command Check Box
		// Prerequisite  -	User should be on checkbox page  url (https://demoqa.com/checkbox)
		// Expected Result- Checkbox is clicked and User got the message
		
		System.setProperty("WebDriver.Chrome.Driver", "F:\\java eclipse\\DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		
		//  home check box toggle
		// wrong locator do not identify uniquely when it is opened.
		//WebElement homecheckboxtoggle= driver.findElement(By.xpath("// button[@aria-label=\"Toggle\"]"));
		//homecheckboxtoggle.click();
		
		WebElement homecheckboxtoggle= driver.findElement(By.xpath
				("//label[@for=\"tree-node-home\"]/preceding-sibling::button"));
		homecheckboxtoggle.click();
		
		// desktop button toggle
		WebElement desktoptoggle= driver.findElement(By.xpath
				("//label[@for=\"tree-node-desktop\"]/preceding-sibling::button"));
		
		desktoptoggle.click();
		// click on command check box
		
		WebElement commandcheckbox=driver.findElement(By.xpath("//input"
				+ "[@id=\"tree-node-desktop\"]/following-sibling::span[@class=\"rct-checkbox\"]"));
		commandcheckbox.click();
	}

}
