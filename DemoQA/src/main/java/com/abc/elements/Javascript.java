package com.abc.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.formats.html.markup.Script;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		//	js.executeScript("window.scrollBy(0,1000)");
		//	js.executeScript("window.scrollBy(2000,600)");
		
		WebElement selenium =driver.findElement(By.xpath("//a[@href=\"/selenium-webdriver/selenium-tutorial/\"]"));
		int y=selenium.getLocation().getY(); 
		//js.executeScript("window.scrollBy(0,"+ y +")");
		
		js.executeScript("arguments[0].scrollIntoView()" ,selenium);// important
		//scrollintoview(driver, selenium);
		selenium .click();
		
		
		
		WebElement robotclasslink =driver.findElement(By.xpath("//a[@href=\"https://www.toolsqa.com/selenium-webdriver/robot-class/\"]"));	
		js.executeScript("arguments[0].scrollIntoView()",robotclasslink);
		//scrollby(driver,robotclasslink);
		robotclasslink.click();
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// important
		scrollheight(driver);
	}

	
	public static void  scrollintoview(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
	public static void scrollby(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int y= element.getLocation().getY();
		js.executeScript("window.scrollBy(0, "+ y +")");
	}
	public static void scrollheight(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
