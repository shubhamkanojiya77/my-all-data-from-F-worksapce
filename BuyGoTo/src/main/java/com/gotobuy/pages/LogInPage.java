package com.gotobuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;

public class LogInPage  {
		
		// encapsulation ... variable private .. getter and setter method
		private WebElement acceptcookie;
		private WebElement firstnametxt;
		private WebElement lastnametxt;
		private WebElement workemail ;
		private WebElement phonenumber;
		private WebElement createapassword;
		private WebElement companysize;
		private WebElement onetonine;
		private WebElement startforfreebtn;
		
		
		// locator using get method as public.... so we can call it anywhere
		public WebElement getAcceptcookie() {
			 acceptcookie= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//button[text()='Accept Recommended Settings']"));
			return acceptcookie;
		}
		public WebElement getFirstnametxt() {
			WebElement firstnametxt= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
			return firstnametxt;
		}
		public WebElement getLastnametxt() {
			WebElement lastnametxt= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
			return lastnametxt;
		}
		public WebElement getWorkemail() {
			WebElement workemail= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//input[@label=\"Work Email\"]"));
			return workemail;
		}
		public WebElement getPhonenumber() {
			WebElement phonenumber= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//input[@name=\"phone\"]"));
			return phonenumber;
		}
		public WebElement getCreateapassword() {
			WebElement createapassword= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//input[@id=\"password\"]"));
			return createapassword;
		}
		public WebElement getCompanysize() {
			WebElement companysize= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//select[@id=\"companySize\"]"));
			return companysize;
		}
		public WebElement getOnetonine() {
			WebElement onetoninebtn= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//select[@id=\"companySize\"]/option[@value=\" 1 - 9\"]"));
			return onetoninebtn;
		}
		public WebElement getStartforfreebtn() {
			WebElement startforfreebtn= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			return startforfreebtn;
		}

		// FUNCTIONALITY 
		public void  signup (String FirstName,String LastName,String WorkMail,
				CharSequence[] PhoneNumber,// yaha hoga error
				String string,String CreateAPassword )
				
		{
			
			getAcceptcookie().click();
			getFirstnametxt().sendKeys(FirstName);
			getLastnametxt().sendKeys(LastName);
			getWorkemail().sendKeys(WorkMail);
			getPhonenumber().sendKeys(PhoneNumber);
			getCreateapassword().sendKeys(CreateAPassword);
			getCompanysize().click();
			getOnetonine().click();
			getStartforfreebtn().click();
		}
		
}	

		

		
		/*
		//----------------*****-----------*****---------
		//  ORANGE HRMS LOCATORS
		
	
	private WebElement Usernametxt;
	private WebElement Passwordtxt;
	private WebElement Loginbtn;
	
		public WebElement getUsernametxt() {
			//WebElement Usernametxt =browser.driver.findElement(By.xpath("//input[@placeholder="Username"]"));
			 Usernametxt=browser.driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
			return Usernametxt;
		}
		
			
		
		public WebElement getPasswordtxt() {
			 Passwordtxt=browser.driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
			return Passwordtxt;
		}
		
		public WebElement getLoginbtn() {
			 Loginbtn=browser.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			return Loginbtn;}
		
		// FUNCTIONALITY...... LOGIN THE APPLICATION
		public void LogInFunctionality(String username, String Password)
		{
			getUsernametxt().sendKeys(username);
			getPasswordtxt().sendKeys(Password);
			getLoginbtn().click();}
}
	//-------------**-----------**---------------**-------------------**--------------*/
		




