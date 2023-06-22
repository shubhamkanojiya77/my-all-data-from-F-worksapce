package com.abc.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizedragdrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	//	driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		

		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement framelocator = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(framelocator);
		// drag and drop
		WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement destination = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		// no click and hold 
		Actions action=new Actions (driver);
		
		// 1
		action.dragAndDropBy(source, 100, 300).perform();
		
		Thread.sleep(1000);
		
		// 2
		
		action.dragAndDrop(source, destination).perform();
		
		Thread.sleep(1000);
		
		//3 
		action.clickAndHold(source).moveToElement(destination).release().perform();
	
		
		// resizable
		
	
		WebElement shape = driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-s\"]"));
		action.clickAndHold(shape).moveByOffset(20, 30);// wrong
		action.clickAndHold(shape).moveByOffset(20, 30).release(shape).perform();
		
		
		// doubleclick
		WebElement button= driver.findElement(By.xpath(""));
		
		action.doubleClick(button);
		action.contextClick(button);
		
	}

  // driver.get("https://demoqa.com/droppable");
   //WebElement source = driver.findElement(By.id("id=\"draggable\""));



}


