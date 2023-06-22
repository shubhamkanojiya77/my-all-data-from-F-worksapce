package com.abc.elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class waitclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		 
		
		// implicit wait
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Username=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		WebElement Password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		WebElement Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	
	// explicit wait
		
		WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys("hi");	
		
		/*
		waitclass.Sendvalue(driver, Username, 10, "Admin");
		waitclass.Sendvalue(driver, Password, 15, "admin123");
		waitclass.clickOn(Loginbtn, driver, 10);
		*/
	}

	
	
	public static void clickOn(WebElement element, WebDriver driver, int time)
	{
		WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	 	public static void Sendvalue (WebDriver driver, WebElement element,int time, String message)
	 	{
	 		WebDriverWait wait= new WebDriverWait( driver, Duration.ofSeconds(time));
	 		wait.until(ExpectedConditions.visibilityOf(element));
	 		element.sendKeys(message);
	 	}




}




