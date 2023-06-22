package com.abc.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;
import com.abc.pages.AdminPage;
import com.abc.pages.HomePage;
import com.abc.pages.LogInPage;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AdminPageTestCase {
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
		HomePage homepage=new HomePage();
		homepage.getAdminlink().click();;
		Thread.sleep(2000);

	}
	
	@Test(description="Admin should be able to Add new the Admin or ESS user from employee list", groups= {"smoke","sanity","regression"} )
	public void TC1() throws InterruptedException, IOException{
		Reporter reporter=new Reporter();
		reporter.createTest("Admin should be able to Add Admin or ESS user from employee list");
		AdminPage adminpage=new AdminPage();
	adminpage.adduserfunctionality("Nina Patel", "shubhamkanojiya", "Sourabh1232@", "Sourabh1232@");
	if(adminpage.getUseraddedmessage().isDisplayed() )
	{
		reporter.pass("Admin is able to add a user");
	}
	else {	
		reporter.fail("Admin is able to add a user");	
	}	
		
		
	}


	@Test(description="Admin should be able to search the user",groups= {"smoke","sanity","regression"})
	public void TC2() throws InterruptedException{
	ExtentTest test=Reporter.report.createTest("Admin should be able to search the user");
	AdminPage adminpage=new AdminPage();
	adminpage.usersearchfunctionality("Goutam.Ganesh", "Goutam Ganesh");
	//adminpage.usersearchfunctionality("shubham.kanojiya", null);
	
	if(adminpage.getfatcheduserdetails().size()>0)
	{
		for(int i=0;i<adminpage.getfatcheduserdetails().size();i++)
		{System.out.println(adminpage.getfatcheduserdetails().get(i).getText());
		test.log(Status.PASS,"Admin is unable to search the user");}
	}
		
	else{
		test.log(Status.FAIL,"Admin is able to search the user");	
	}

			
	}
		
		
		
	
	/*
	@Test(description="Admin should be able to edit the user profile",groups= {"smoke","sanity","regression"})
	public void TC3() throws InterruptedException{
	ExtentTest test=Reporter.report.createTest("Admin should be able to delete the user  profile");
	AdminPage adminpage=new AdminPage();
	adminpage.deleteProfileFunctionality();
	if() {
	test.log(Status.PASS,"");
	}	
	else{
		test.log(Status.FAIL,"");	
	}
			
	}

	@Test(description="Admin should be able to delete the user profile",groups= {"smoke","sanity","regression"})
	public void TC4() throws InterruptedException{
	ExtentTest test=Reporter.report.createTest("Admin should be able to edit the user  profile");
	AdminPage adminpage=new AdminPage();
	adminpage.editprofilefunctionality();
	if() {
	test.log(Status.PASS,"");
	}	
	else{
		test.log(Status.FAIL,"");	
	}
		
		
		
	}
	*/

	@AfterClass
	public void postcondition() {
		
	}







	}
