package com.abc.elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));

	// day
		System.out.println(" i am in day dropdown");
		Select select=new Select(day)	;
		
		
		System.out.println(select.isMultiple());	
		select.selectByIndex(6);
		select.selectByValue("12");
		select.selectByVisibleText("15");
	// 	select.getAllSelectedOptions(); // multiple selection me
	//	select.deselectAll(); // multiple selection me	
	//	System.out.println(select.getFirstSelectedOption());
		
		
	// month
		System.out.println(" i am in month dropdown");
		Select select1=new Select (month);
		
	
		System.out.println(select1.isMultiple());
		select1.selectByVisibleText("Feb");
		select1.selectByIndex(2);
		select1.selectByValue("12");// value is an attribute  WATCH THIS
		
		//select1.selectByValue("january"); //value = january is wrong
		//System.out.println(select1.getFirstSelectedOption());
		
		
	
	// 	year
		System.out.println(" i am in year dropdown");
		Select select2=new Select(year);
		
		select2.isMultiple();
		select2.selectByVisibleText("1996");
		select2.selectByIndex(25);
		select2.selectByValue("2021");
		//System.out.println(select2.getFirstSelectedOption());
		
	
	//  get all options value... bekar hai pura
		List<WebElement> daylist = select.getOptions();
		List<WebElement> monthlist = select1.getOptions();
		List<WebElement> yearlist = select2.getOptions();
		
		System.out.println(daylist);
		System.out.println(monthlist);
		System.out.println(yearlist);
		
		
		
		//************************************** optimization by methods************
		
		
	}}