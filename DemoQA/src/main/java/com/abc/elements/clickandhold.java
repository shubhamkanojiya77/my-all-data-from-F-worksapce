package com.abc.elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement menu2 =driver.findElement(By.xpath("//a[text()=\"Main Item 2\"]"));
		
		
		WebElement sublist =driver.findElement(By.xpath("//a[text()=\"SUB SUB LIST »\"]"));
		Actions action=new Actions(driver);
		action.clickAndHold(menu2).clickAndHold(sublist).build().perform();
		//	action.clickAndHold().click().perform();
		WebElement sublistitem1 =driver.findElement(By.xpath("//a[text()=\"Sub Sub Item 1\"]"));
		action.clickAndHold(menu2).clickAndHold(sublist).click(sublistitem1).perform();
		//
	}

}
