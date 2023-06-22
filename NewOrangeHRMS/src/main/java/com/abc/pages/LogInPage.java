package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;

public class LogInPage extends browser  {
	
	
	public LogInPage(String username , String password ) 
	{	
		// super.browserLaunch();
		//super.browser();		 ye wrong hai.. my mistake
		loginfunctionality(username, password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public LogInPage() {
		
	// har page ka default constructor banao		
	}
	
	
	

	



	private WebElement Usernametxt;
	private WebElement Passwordtxt;
	private WebElement Loginbtn;
	
	// variables forgotpasswordfunctionality
	private WebElement fogotyourpasswordlink ;  
	
	// variable socialmediafunctionality
	private WebElement linkedinlink;
	private WebElement facebooklink;
	private WebElement twitterlink;
	private WebElement youtubelink;
	

	// variable policy
	private WebElement Policylink;
	
	//------------------------------------------------------------------------------------
	
	//Locator loginfunctionality
	
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
		
		
		//locator forgotpasswordfunctionality
		public WebElement getFogotyourpasswordlink() {
			fogotyourpasswordlink=browser.driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]"));
			return fogotyourpasswordlink;
		}
		// locator socialmediafunctionality
		public WebElement getLinkedinlink() {
			linkedinlink=browser.driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]"));
			return linkedinlink;
		}

		public WebElement getFacebooklink() {
			facebooklink=browser.driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]"));
			return facebooklink;
		}

		public WebElement getTwitterlink() {
			twitterlink=browser.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]"));
			return twitterlink;
		}

		public WebElement getYoutubelink() {
			youtubelink=browser.driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]"));
			return youtubelink;
		}

		// locator policy
		public WebElement getPolicylink() {
			Policylink=browser.driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]"));
			return Policylink;
		}
		
		

		
		// FUNCTIONALITY...... LOGIN THE APPLICATION
		public void loginfunctionality(String username, String Password)
		{
			getUsernametxt().sendKeys(username);
			getPasswordtxt().sendKeys(Password);
			getLoginbtn().click();}

		// FUNCTIONALITY forgotpasswordfunctionality
		public void forgotpasswordfunctionality()
		{
			getFogotyourpasswordlink().click();
		}

		// FUNCTIONALITY socialmediafunctionality
		public void socialmediafunctionality() 
		{
			getLinkedinlink().click();
			getFacebooklink().click();
			getTwitterlink().click();
			getYoutubelink().click();
		}
		
		// FUNCTIONALITY
		public void policityfunctionality()
		{
		getPolicylink().click();
		}
}






