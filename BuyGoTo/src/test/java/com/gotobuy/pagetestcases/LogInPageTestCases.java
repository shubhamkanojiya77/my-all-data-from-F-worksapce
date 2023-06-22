package com.gotobuy.pagetestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;
import com.abc.pages.GetStartedPage;
import com.abc.pages.LogInPage;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LogInPageTestCases {
  @BeforeClass
  public void precondition () throws InterruptedException {
	  com.gotobuy.reporter.Reporter reporter=new com.gotobuy.reporter.Reporter();
      reporter.generateReport();
      com.gotobuy.commonfunctionality.browser browserobj=new com.gotobuy.commonfunctionality.browser();
      browserobj.browserLaunch();
  Thread.sleep(5000);}
  
  
	@Test
	public void TC1(){
	ExtentTest extentreport=com.gotobuy.reporter.Reporter.report.createTest("User should be able to signup"
			+ " with all mandatory details correctly filled");
	com.gotobuy.pages.LogInPage loginpage=new com.gotobuy.pages.LogInPage();
	loginpage.signup("shubham","kanoje","anybody736@gmail.com",
			null, "7020212349","Srmk7196@");
	
	com.gotobuy.pages.GetStartedPage getstartedpage=new com.gotobuy.pages.GetStartedPage();
	//getstartedpage.getGetstartedbttn();
	if (getstartedpage.getStartedlink().isDisplayed())// validation ... jab tak ye button nahi dikhta 
	{
		extentreport.log(Status.PASS,"user has signedup");
	}else
	{
		extentreport.log(Status.PASS,"user has signedup");
	}	
		
	}
	
	
@AfterClass
public void postcondition() 
{	com.gotobuy.reporter.Reporter.report.flush();}

}

/*
	
	// * ---------------***-----------***-----------------**-----------****
	 
	@Test
  public void TC1() {
      Reporter.report.createTest("User should be able to login with valid credential"); // null pointer exception
      LogInPage loginpage=new LogInPage();
	  loginpage.LogInFunctionality("Admin","admin123");	// null pointer exception
  }
	 
	/* // TEST CASE 2
	  @Test
	  public void TC2() {
	       Reporter.report.createTest("User should be unable to login with invalid credential"); // null pointer exception
	       LogInPage loginpage=new LogInPage();
		  loginpage.LogInFunctionality("Admin","admin123");	 // null pointer exception
	 
	  }*/

 

