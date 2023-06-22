package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","F:\\java eclipse\\LiveProject\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement frameelement =driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(frameelement);
		
		WebElement page=driver.findElement(By.xpath("//h1[text()=\"This is a sample page\"]"));
		System.out.println(page.getText());
	
		driver.switchTo().parentFrame();
		WebElement parentframeelement =driver.findElement(By.xpath("//div[@class=\"main-header\"]"));
		
		System.out.println(parentframeelement.isDisplayed());
		
		// NESTED FRAME
		//*******************************************************
		
		//
		//driver.switchTo().parentFrame();
				
	}

}
