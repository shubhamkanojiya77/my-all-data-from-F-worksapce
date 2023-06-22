package com.abc.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;
import com.abc.pages.AdminPage;
import com.abc.pages.HomePage;
import com.abc.pages.LogInPage;
import com.abc.pages.PIMPage;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class PIMPageTestCase {
	
	public void precondition() throws InterruptedException {	
		// create test
		Reporter reporter=new Reporter();
		reporter.generateReport();
		// browser launch and login page
		browser browserobj=new browser();
		browserobj.browserLaunch();
		// login and come to homepage
		//LogInPage loginpage=new LogInPage("Admin","admin123");
		//Thread.sleep(5000);
		
	}
	
	@Test(description="Admin should be able to Add new employee",groups= {"smoke","sanity","regression"})
	public void TC1() throws InterruptedException, IOException{
	//ExtentTest test=Reporter.report.createTest("Admin should be able to Add new employee");
		Reporter reporter=new Reporter();
		reporter.createTest("Admin should be able to Add new employee");
	/*HomePage homepage=new HomePage();
	homepage.getPimlink().click();
	Thread.sleep(2000);*/
	PIMPage pimpage=new PIMPage ("Admin","admin123");
	pimpage.addemployeefunctionality("mahendra", "ramesh", "kanojiya", "mahendra.kanojiya","Mnop@123","Mnop@123");
	
	if(pimpage.getNewuseraddedmessage().isDisplayed())
	{
		pimpage.getNewemployeedetail().get(2);
	//test.log(Status.PASS,"Admin is able to add new employee");
		reporter.pass("Admin is able to add new employee");
	}
	else {	
		
		reporter.fail("Admin is able to add new employee");
	}	
		
		
	}
	@AfterClass
	public void postcondition() {
	Reporter.report.flush();	
	}







	}
