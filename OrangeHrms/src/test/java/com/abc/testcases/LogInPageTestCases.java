package com.abc.testcases;

import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;

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
	  Reporter reporter=new Reporter();
      reporter.generateReport();
      browser browserobj=new browser();
      browserobj.browserLaunch();
      Thread.sleep(5000);
      }

	@Test(description="User should be able to login with valid credential",priority=0, groups= {"smoke","sanity","regression"})
  public void TC1() throws InterruptedException {
	/*ExtentTest test = Reporter.report.createTest(""
			+ "User should be able to login with valid credential"); // null pointer exception
     
		LogInPage loginpage=new LogInPage();
		loginpage.loginfunctionality("Admin","admin123");	// null pointer exception*/
		  Reporter reporter=new Reporter();
	      reporter.generateReport();
	      reporter.createTest("User should be able to login with valid credential");
	      LogInPage loginpage=new LogInPage("Admin","admin123");
  }
	 
	 // TEST CASE 2
	  @Test(description="User should not be able to login with invalid credential",priority=1,groups= {"smoke","sanity","regression"})
	  public void TC2() throws InterruptedException {
		/*  ExtentTest test =Reporter.report.createTest(""
		  		+ "User should be unable to login with invalid credential"); // null pointer exception
	      
		  LogInPage loginpage=new LogInPage("sAdmin","admin123");
		  loginpage.loginfunctionality("sAdmin","admin123");	 // null pointer exception
		  Thread.sleep(5000);*/
		  Reporter reporter=new Reporter();
	      reporter.createTest("User should be unable to login with invalid credential");
	      LogInPage loginpage=new LogInPage("sAdmin","admin123");
	      Thread.sleep(5000);
	  }
	  @BeforeTest
	  public void preTC3() throws InterruptedException {
		  browser browserobj=new browser();
	      browserobj.browserLaunch();
	  }
	  
	  @Test(description="User should be able to navigate to social media",groups= {"regression"})
	  public void TC3() throws InterruptedException {
	      /*ExtentTest test = Reporter.report.createTest(""
	      + "User should be able to navigate to social media "); // null pointer exception*/
		  Reporter reporter=new Reporter();
	      reporter.createTest("User should be unable to login with invalid credential");
	      // 2nd constructor call 
	      LogInPage loginpage=new LogInPage();// default constructor ko call karega
	      loginpage.socialmediafunctionality();
		  reporter.pass("new tab of social media is opened");
		  // validation----> new tab open
	       
	  }
	  @BeforeTest
	  public void preTC4() throws InterruptedException {
		  browser browserobj=new browser();
	      browserobj.browserLaunch();
	  }
	  
	  @Test(description="User should be able to read the policy",groups= {"regression"})
	  public void TC4() throws InterruptedException {
		  Reporter reporter=new Reporter();
		  reporter.createTest("User should be able to read the policy  "); // null pointer exception
	     
		  LogInPage loginpage=new LogInPage();// default constructor ko call karega
		  loginpage.getPolicylink();
		  reporter.pass("new tab of policy page is opened") ;
		  // validation----> new tab open
		  
	  }
	 
}	  

