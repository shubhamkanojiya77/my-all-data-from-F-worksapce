package com.abc.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browser;
import com.abc.pages.LogInPage;
import com.abc.pages.ResetPasswordPage;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ResetPasswordTestCase {
public static ExtentTest test;		
@BeforeClass
public void precondiotion() throws InterruptedException {	
// create test
Reporter reporter=new Reporter();
reporter.generateReport();
// login page 
browser browserobj=new browser() ;
browserobj.browserLaunch();

}


@Test(description="User should be able to reset the password",groups= {"smoke","regression","sanity"})
	public void TC1 () throws InterruptedException, IOException{
	Reporter reporter=new Reporter();
	reporter.createTest("User should be able to reset the password");
	LogInPage loginpage=new LogInPage();
	loginpage.forgotpasswordfunctionality();
	Thread.sleep(5000);
	ResetPasswordPage resetpasswordpage =new ResetPasswordPage();
	resetpasswordpage.resetpassordFunctionality("Admin");
	Thread.sleep(5000);
	//validation
	if(resetpasswordpage.getPasswordresetrmessage().isDisplayed())
	{
		
		reporter.pass("Test case is pass");
	}
	else {
		//test=Reporter.report.createTest("TEST case is fail");
		reporter.fail("user is unable to get reset password link");
	}
}
	
	@Test(description="User should not be able to reset the password if entered wrong username", groups={"smoke","regression","sanity"})
	public void TC2 () throws InterruptedException, IOException{
		Reporter reporter=new Reporter();
		reporter.createTest("User should not be able to reset the password if entered wrong username");
	LogInPage loginpage=new LogInPage();
	loginpage.forgotpasswordfunctionality();
	Thread.sleep(5000);
	ResetPasswordPage resetpasswordpage=new ResetPasswordPage();
	resetpasswordpage.resetpassordFunctionality("SAdmin");
	Thread.sleep(5000);
	//validation
	if(resetpasswordpage.getPasswordresetrmessage().isDisplayed())
	{
		//test=Reporter.report.createTest("Test case is pass");
		reporter.pass("Test case is fail, user got the reset password link send message");
	}
	else {
		//test=Reporter.report.createTest("TEST case is fail");
		reporter.fail( "Test case is pass,user is unable to get reset password link");
	}
	
	
}



@AfterClass
public void postcondition() {
	browser.driver.close();
	Reporter.report.flush();
	
}







}