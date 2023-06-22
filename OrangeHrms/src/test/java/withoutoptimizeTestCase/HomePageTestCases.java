package withoutoptimizeTestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;
import com.abc.pages.HomePage;
import com.abc.pages.LogInPage;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomePageTestCases {
	@BeforeClass
	public void precondition() throws InterruptedException {	
		// create test
		Reporter reporter=new Reporter();
		reporter.generateReport();
		// browser launch and login page
		browser browserobj=new browser();
		browserobj.browserLaunch();
		// login and come to homepage
		LogInPage loginpage=new LogInPage();
		loginpage.loginfunctionality("Admin","admin123");
		Thread.sleep(5000);	
	}

		@Test(description="User should be able to click on logo of Orange HRM",priority=0)
		public void TC1() throws InterruptedException {
		ExtentTest test=Reporter.report.createTest
				("User should be able to click on logo of Orange HRM");
		HomePage homepage=new HomePage();
		homepage.logofunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://www.orangehrm.com/"))
		{test.log(Status.PASS,"User is navigate to company homepage");
		}
		else {
			test.log(Status.FAIL,"User is navigate to company homepage");	
		}
		browser.driver.close();
		}
		
		/*@BeforeTest
		public void preTC2() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
		}*/
		@Test(description="User should be able to search by enetering into search bar")
		public void TC2() {
		ExtentTest test=Reporter.report.createTest
		("User should be able to search by enetering into search bar");
		HomePage homepage=new HomePage();
		homepage.searchbarfunctionality("abcd");
		// validation
		if(homepage.getAdminlink().isDisplayed())
		{test.log(Status.FAIL,"Test case is fail,User is unable to search");
		}
		else {
			test.log(Status.PASS,"Test case is pass,User is able to search");	
		}
		
		
		}
@AfterTest
public void postTC2()
{ browser.driver.navigate().refresh();
	}

		/*@BeforeTest
		public void preTC3() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
			
		}*/
		
		@Test(description="User should be able to contract and expand the menu")
		public void TC3() throws InterruptedException {
		ExtentTest test=Reporter.report.createTest
		("User should be able to contract and expand the menu");
		HomePage homepage=new HomePage();
		homepage.arrowfunctionality();
		// validation-------> test step me hi hai
		}
		
		/* @BeforeTest
		public void preTC4() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
		}*/
		@Test(description="User should be able to navigate to about section")
		public void TC4() {
		ExtentTest test=Reporter.report.createTest
		("User should be able to navigate to about section");
		HomePage homepage=new HomePage();
		homepage.aboutFunctionality();
		// validation
		if(homepage.getCancelbutton().isDisplayed())
		{test.log(Status.PASS,"Test case is pass,User is navigate to about section");
		}
		else {
			test.log(Status.FAIL,"Test case is fail,User is not navigate to about section");	
		}
		
		
		}
		/*
		@BeforeTest
		public void preTC5() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
		}*/
		@Test(description="User should be able to use support section")
		public void TC5() {
		ExtentTest test=Reporter.report.createTest
		("User should be able to use support section");
		HomePage homepage=new HomePage();
		homepage.supportFunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://opensource-demo.orangehrmlive.com/web/index.php/help/support  "))
		
		{test.log(Status.PASS,"Test case is pass,User is on search page");
		}
		else {
			test.log(Status.FAIL,"Test case is fail,User is not on search page");	
		}
		
		
		}
	/*	@BeforeTest
		public void preTC6() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
		}*/
		@Test(description="User should be able to change his login passsword")
		public void TC6() throws InterruptedException {
		ExtentTest test=Reporter.report.createTest
		("User should be able to change his login passsword");
		HomePage homepage=new HomePage();
		homepage.changePasswordFunctionality("admin123","Shubham1@");
		// validation
		if(homepage.getSuccessmessage().isDisplayed())
		{test.log(Status.PASS,"Test case is pass,Userpassword is changed");
		}
		else {
			test.log(Status.FAIL,"Test case is fail,User is unable to chahnge his password");	
		}
		
		
		}
		/*@BeforeTest
		public void preTC7() throws InterruptedException {
			browser browserobj=new browser();
			browserobj.browserLaunch();
			// login and come to homepage
			LogInPage loginpage=new LogInPage();
			loginpage.loginfunctionality("Admin","admin123");
			Thread.sleep(5000);	
		}*/
		@Test(description="User should be able to LogOut")
		public void TC7() {
		ExtentTest test=Reporter.report.createTest
		("pass,Userpassword is changed");
		HomePage homepage=new HomePage();
		homepage.logOutFunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
		{test.log(Status.PASS,"Test case is pass, user is able to logout");
		}
		else {
			test.log(Status.FAIL,"Test case is fail, user is unable to logout");	
		}
		
		
		}
		
	

	@AfterClass
	public void postcondition() {
		Reporter.report.flush();		
	}







	}
