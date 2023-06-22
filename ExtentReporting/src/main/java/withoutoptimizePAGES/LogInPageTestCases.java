package withoutoptimizePAGES;

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
	  Reporter reporter=new Reporter();
      reporter.generateReport();
      browser browserobj=new browser();
      browserobj.browserLaunch();
      Thread.sleep(5000);}

	@Test(description="User should be able to login with valid credential",priority=1)
  public void TC1() {
	ExtentTest test = Reporter.report.createTest(""
			+ "User should be able to login with valid credential"); // null pointer exception
     
		LogInPage loginpage=new LogInPage();
		loginpage.loginfunctionality("Admin","admin123");	// null pointer exception
  }
	 
	 // TEST CASE 2
	  @Test(description="User should not be able to login with invalid credential",priority=0)
	  public void TC2() throws InterruptedException {
		  ExtentTest test =Reporter.report.createTest(""
		  		+ "User should be unable to login with invalid credential"); // null pointer exception
	      
		  LogInPage loginpage=new LogInPage();
		  loginpage.loginfunctionality("sAdmin","admin123");	 // null pointer exception
		  Thread.sleep(5000);
	  }
	  @BeforeTest
	  public void preTC3() throws InterruptedException {
		  browser browserobj=new browser();
	      browserobj.browserLaunch();
	  }
	  
	  @Test(description="User should be able to navigate to social media")
	  public void TC3() {
	      ExtentTest test = Reporter.report.createTest(""
	      + "User should be able to navigate to social media "); // null pointer exception
	
	      LogInPage loginpage=new LogInPage();
		  loginpage.socialmediafunctionality();
		  test.log(Status.PASS,"new tab of social media is opened");
		  // validation----> new tab open
	       
	  }
	  @BeforeTest
	  public void preTC4() throws InterruptedException {
		  browser browserobj=new browser();
	      browserobj.browserLaunch();
	  }
	  
	  @Test(description="User should be able to read the policy")
	  public void TC4() {
		  ExtentTest test = Reporter.report.createTest(
		 "User should be able to read the policy  "); // null pointer exception
	     
	      LogInPage loginpage=new LogInPage();
		  loginpage.policityfunctionality();
		  test.log(Status.PASS,"new tab of policy page is opened");
		  // validation----> new tab open
		  
	  }
	 
}	  

