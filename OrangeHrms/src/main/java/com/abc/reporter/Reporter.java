package com.abc.reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.abc.commonfunctionality.browser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {
	 public static ExtentReports report;
	 public ExtentTest extenttest;
	 public static WebDriver driver;
public void generateReport() {
    
	 report=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("F:\\java eclipse\\OrangeHrms\\Result//Result.html");
	
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("Title - OrangeHRMS AUTOMATION");
	spark.config().setReportName("My Client -OrangeHRMS ");
	report.attachReporter(spark);
	
	// ISKE BAD CREATE TEST ... 
	// EXTENT TEST RETURN TYPE MILEGA
	// EXTENT TEST SE LOG METHOD CALL HOGI... FOR TEST STEPS
	}

	public void createTest(String TestCaseDescription) 
	{
		extenttest=report.createTest(TestCaseDescription);
	}
	public void pass(String testStep) 
	{
		extenttest.log(Status.PASS,testStep); //test.log(Status.PASS,testStep);
	}

	public void fail(String testStep) throws IOException
	{
		extenttest.log(Status.FAIL,testStep);//test.log(Status.FAIL,testStep);
		MediaEntityBuilder.createScreenCaptureFromPath(screenshotcapture(driver));//.createscrencapturefrompath().build();
	}

	 public static  String screenshotcapture(WebDriver driver) throws IOException
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
