package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ResetPasswordPage extends LogInPage  {

	// my mistake
	/*public ResetPasswordPage (String username, String password) throws InterruptedException
			{
		super(username,password);
		  
		 getFogotyourpasswordlink().click();
		 Thread.sleep(5000);
			}*/ 
	
	private WebElement usernametxt; 	
	private WebElement cancelbutton	;
	private WebElement resetpasswordbutton;		
	private WebElement passwordresetrmessage;
	
	public WebElement getUsernametxt() {
		usernametxt = browser.driver.findElement(By.xpath("//input"
				+ "[@placeholder=\"Username\"]"));
		return usernametxt;
	}
	public WebElement getCancelbutton() {
		cancelbutton = browser.driver.findElement(By.xpath("//"
				+ "button[@type=\"button\"]"));
		return cancelbutton;
	}
	public WebElement getResetpasswordbutton() {
		resetpasswordbutton= browser.driver.findElement(By.xpath("//"
				+ "button[@type=\"submit\"]"));
		return resetpasswordbutton;
	}
	public WebElement getPasswordresetrmessage() {
		passwordresetrmessage= browser.driver.findElement(By.xpath("//div"
				+ "[@class=\"orangehrm-card-container\"]"));
		return passwordresetrmessage;
	}
	
	public void resetpassordFunctionality(String Username) {
		
		getUsernametxt().sendKeys(Username);
		
		getResetpasswordbutton().click();
		
		//getCancelbutton().click();
		
	}

	
	
	}
	
	
/*Reporter reporter=new Reporter();
reporter.generateReport();
ExtentTest test = Reporter.report.createTest("Reset Password Functionality");*/

//test.log(Status.PASS,"Enter the username");
//test.log(Status.PASS,"click the reset button");	
//test.log(Status.PASS,"Enter the cancel button");*

