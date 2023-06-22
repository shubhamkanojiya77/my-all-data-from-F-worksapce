package com.abc.elements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.commomfunctionality.browser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class MyScreenshot{
	
	//public static WebDriver driver;
	public static String main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();		
	      
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	    WebElement  Usernametxt=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	    WebElement Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	    WebElement   Loginbtn=browser.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	
	    */
	  
		ExtentReports report= new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("/Result.html");
		spark.config().setTheme(Theme.DARK);
		
		
	 public static  File  screenshotcapture(WebDriver driver)
	  {
	 
		// i created my date and its  format
		  String date= new SimpleDateFormat("ddmmyyhhmm").format(new Date());
		 
		  // i will use take screenshot interface.. jisko chromedriver class extend nahi karta
		  
		  TakesScreenshot srcshot= (TakesScreenshot) driver;
		  
		  //  now make one file class... SIRF EK TEMPLATE screenshot ka
		  File sourcefile= srcshot.getScreenshotAs(OutputType.FILE);
		  
		  
		  // i created one folder RESULT
		  String path = "F:\\java eclipse\\OrangeHrms\\SCREENSHOT RESULT"+"/"+date+" .png " ;
		
		  // object banakr file ko jinda kardo.. real ka screenshot
		  File destinationfile= new File (path );
		  
		  // copy the captured file to destination folder
		  FileUtils.copyFile(sourcefile, destinationfile);
		// APACHE IO JAR DOWNLOAD KARNA PADTA HAI ISKE LIYE
	  
		  return destinationfile.getAbsolutePath();
	  }
	  
	}


}
