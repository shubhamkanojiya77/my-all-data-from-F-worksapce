package com.abc.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSugession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\java eclipse\\DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp?tab=rw&authuser=0");
		driver.manage().window().maximize();
		
		// enter value in search box
		WebElement searchbox= driver.findElement(By.xpath("//input[@title='Search']"));
		searchbox.sendKeys("hero");
	
		Thread.sleep(2000);
		/*
		 List<WebElement>allsugession =driver.findElements(By.xpath
				("//div[@class=\"erkvQe\"]//li/descendant::div[@class=\"wM6W7d\"]"));
		
		// parent//child//many many grand child
		// grandfather// father// descendant (sabhi ki list)
		System.out.println(allsugession.size());
		
		for(int i=0;i<allsugession.size();i++)
		{
		System.out.println(allsugession.get(i).getText());	
		if(allsugession.get(i).getText().contains("Heropanti 2"))	
		{
			allsugession.get(i).click();
		}
		}*/
		
		//---------------------------------------------------------
		
		List<WebElement>allsugession1 =driver.findElements(By.xpath
				("//div[@class=\"wM6W7d\"]"));
		
		// parent//child//many many grand child
		// grandfather// father// descendant (sabhi ki list)
		System.out.println(allsugession1.size());
		
		for(int i=0;i<allsugession1.size();i++)
		{
		System.out.println(allsugession1.get(i).getText());	
		if(allsugession1.get(i).getText().contains("Heropanti 2"))	
		{
			allsugession1.get(i).click();
		}
		}
		
		
		
		
	
	
	}

}
