package com.abc.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
	//	driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		WebElement shape = driver.findElement(By.cssSelector(".ui-resizable-handle"));
		Actions action = new Actions(driver);
		action.clickAndHold(shape).moveByOffset(20, 30);// wrong
		action.clickAndHold(shape).moveByOffset(20, 30).release(shape).perform();
	}

}
