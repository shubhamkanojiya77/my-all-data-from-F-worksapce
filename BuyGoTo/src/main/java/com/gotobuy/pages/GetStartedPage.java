package com.gotobuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;

public class GetStartedPage extends LogInPage  {
	
	// list of all element
	private WebElement startedlink;
	
	// locators
	
	public WebElement getStartedlink() {
		WebElement startedlink= com.gotobuy.commonfunctionality.browser.driver.findElement(By.xpath("//button[@id=\"pendo-button-9ac6d056\"] "));
		
		return startedlink;
	}

	
	
	// functionality
	public void getstartedaccept()
	{
		getStartedlink().click();
	}

}
