package com.abc.testcases;

import java.io.IOException;

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

		@Test(description="User should be able to click on logo of Orange HRM",groups= {"regression"})
		public void TC1() throws InterruptedException, IOException {
		Reporter reporter=new Reporter();
		reporter.createTest("User should be able to click on logo of Orange HRM");
		HomePage homepage=new HomePage();
		homepage.logofunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://www.orangehrm.com/"))
		{reporter.pass("User is navigate to company homepage");
		}
		else {
			reporter.fail("User is not navigate to company homepage");	
		}
		browser.driver.navigate().back();
		}
		@AfterTest
		public void preTC1() throws InterruptedException {
			
		
		}
		
		@BeforeTest
		/*public void preTC2() throws InterruptedException {
			
		}*/
		@Test(description="User should be able to search by enetering into search bar", groups= {"sanity","regression"})
		public void TC2() throws IOException {
			Reporter reporter=new Reporter();
			reporter.createTest("User should be able to search by enetering into search bar");
		HomePage homepage=new HomePage();
		homepage.searchbarfunctionality("abcd");
		// validation
		if(homepage.getAdminlink().isDisplayed())
		{reporter.fail("Test case is fail,User is unable to search");
		}
		else {
			reporter.pass("Test case is pass,User is able to search");	
		}
		
		
		}
		@AfterTest
		public void postTC2() throws InterruptedException
		{ browser.driver.navigate().refresh();
		Thread.sleep(5000);
		}

		@BeforeTest
		public void preTC3() throws InterruptedException {
		
			
		}
		
		@Test(description="User should be able to contract and expand the menu", groups= {"sanity","regression"}, priority=2)
		public void TC3() throws InterruptedException {
			Reporter reporter=new Reporter();
			reporter.createTest("User should be able to contract and expand the menu");
		HomePage homepage=new HomePage();
		homepage.arrowfunctionality();
		// validation-------> test step me hi hai
		}
		@AfterTest
		public void postTC3() throws InterruptedException {
			browser.driver.navigate().refresh();
			Thread.sleep(5000);	
		}
		 @BeforeTest
		public void preTC4() throws InterruptedException {
				
		}
		@Test(description="User should be able to navigate to about section", groups= {"regression"},priority=3)
		public void TC4() throws IOException {
			Reporter reporter=new Reporter();
			reporter.createTest("User should be able to navigate to about section");
		HomePage homepage=new HomePage();
		homepage.aboutFunctionality();
		// validation
		if(homepage.getCancelbutton().isDisplayed())
		{reporter.pass("Test case is pass,User is navigate to about section");
		}
		else {
			reporter.fail("Test case is fail,User is not navigate to about section");	
		}
		}
		@AfterTest
		public void postTC4()  {
			browser.driver.close();
			
		}
		
		

		@BeforeTest
		public void preTC5() throws InterruptedException {
			
		}
		@Test(description="User should be able to use support section",groups= {"regression"})
		public void TC5() throws IOException {
			Reporter reporter=new Reporter();
			reporter.createTest("User should be able to use support section");
		HomePage homepage=new HomePage();
		homepage.supportFunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://opensource-demo.orangehrmlive.com/web/index.php/help/support  "))
		
		{reporter.pass("Test case is pass,User is on search page");
		}
		else {
			reporter.fail("Test case is fail,User is not on search page");	
		}
		}
		
		@AfterTest
		public void postTC5() {
			// TODO Auto-generated method stub
		browser.driver.close();	
		}
		
		

	@BeforeTest
		public void preTC6() throws InterruptedException {
		
		}
		@Test(description="User should be able to change his login passsword",groups= {"sanity","regression"})
		public void TC6() throws InterruptedException, IOException {
			Reporter reporter=new Reporter();
			reporter.createTest("User should be able to change his login passsword");
		HomePage homepage=new HomePage();
		homepage.changePasswordFunctionality("admin123","Shubham1@");
		// validation
		if(homepage.getSuccessmessage().isDisplayed())
		{reporter.pass("Test case is pass,Userpassword is changed");
		}
		else {
			reporter.fail("Test case is fail,User is unable to chahnge his password");	
		}
		browser.driver.close();	
		
		}
		@BeforeTest
		public void preTC7() throws InterruptedException {
			
		}
		@Test(description="User should be able to LogOut", groups= {"smoke","sanity","regression"})
		public void TC7() throws IOException {
			Reporter reporter=new Reporter();
			reporter.createTest("pass,Userpassword is changed");
		HomePage homepage=new HomePage();
		homepage.logOutFunctionality();
		// validation
		if(browser.driver.getCurrentUrl().equalsIgnoreCase
				("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
		{reporter.pass("Test case is pass, user is able to logout");
		}
		else {
			reporter.fail("Test case is fail, user is unable to logout");	
		}
		
		browser.driver.close();	
		}
		
	

	@AfterClass
	public void postcondition() {
		Reporter.report.flush();		
	}







	}
