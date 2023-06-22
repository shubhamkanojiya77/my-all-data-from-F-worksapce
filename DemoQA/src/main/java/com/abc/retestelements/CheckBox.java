package com.abc.retestelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		// Test Case -      verify that user should get navigate to website homepage url (https://demoqa.com)
		// Prerequisite -	User should have internet connection, user should have  browser
		// Test Step -      open the browser
		//					Enter the URL
		//					Click on search button or press enter
	    // Expected Result-	User should be navigate to element page url(https://demoqa.com/elements)
		
		System.setProperty("WebDriver.Chrome.Driver", "F:\\java eclipse\\"
				+ "DemoQA\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/");
	    
	    //----------------------------------------------------------------------
	    // we have 3 pages - homepage, elements page , checkbox page
	    //----------------------------------------------------------------
	    
	    // Test Case -		User should be able to click on ElementButton on home page.
	    // Prerequisite -	User be on home page 
	    // Test Step -      click on ElementButton on home page.
	    // Expected Result-	User should be navigate to element page url(https://demoqa.com/elements)
	   
        WebElement elementbtn= driver.findElement(By.xpath("//h5[text()=\"Elements\"]"));
	    elementbtn.click();
	    
		// validation
	    if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/elements"))
	    { System.out.println(" test case is pass,  user is on elemnt web page");}
	    else { System.out.println("Test Case is fail, user is on home page");}
	  //-------------------------------------------------------------------------------  
	    
	    // Test Case - 		User should be able to click on check box button.
	    // Prerequisite -	User be on element page url(https://demoqa.com/elements) 
	    // Test Step -      click on check box button.
	    // Expected Result-	User will redirect to checkbox page  url (https://demoqa.com/checkbox)
	    
	    WebElement checkboxbtn=driver.findElement(By.xpath("//span[text()=\"Text Box\"]"));
	    checkboxbtn.click();
	   // validation
	    if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/checkbox"))
	    { System.out.println(" test case is pass,  user is navigate to checkbox web page");}
	    else { System.out.println("Test Case is fail, user is on element page");}
	    
	    //----------------------------------------------------------------------
	    
	    // Test Case -      User should be able to click on logo "TOOLS QA"
	    // Prerequisite -	User should be on checkbox page  url (https://demoqa.com/checkbox)
	    // 					Logo should be clickable
	    // Test Step -      check that the logo is enable
	    //					click on the logo
	    // Expected Result-	User will navigate back to homepage
	    
	    
	    WebElement toolsqalogo = driver.findElement(By.xpath("img[@src=\""
	    		+ "/images/Toolsqa.jpg\"]"));
	    System.out.println(toolsqalogo.isEnabled());
	    System.out.println(" Logo is clickable");
	    toolsqalogo.click();
	    
	 // validation
	    if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/"))
	    { System.out.println(" test case is pass, Logo is Clickable, "
	    		+ "user is on home web page");}
	    else { System.out.println("Test Case is fail, "
	    		+ "Logo is inactive/ non clickable ,user is on checkbox page");}
	    
	    
//----------------------------------------------------------------------
	    
	    // Test Case 		- 	User should be able to click on Home check box by clicking on label 
	 // Prerequisite -	    -   User should be on checkbox page  url (https://demoqa.com/checkbox)
	    // Test Step  		-   User should be on check box page 
	    // Expected Result	-	1) User will get the message " you have selected"
	    //						2) Tester will notice change in class atrribute value uncheck to check.
	    
	    
	    driver.navigate().back(); // return to check box page
	    
	    WebElement homecheckboxbutton= driver.findElement(By.xpath(
	    		"//span[@class=\"rct-checkbox\"]"));
	    homecheckboxbutton.click();	// 1 time click
	    
	    // 1 st validation by message
	    WebElement youhaveselectedmessage =driver.findElement(By.xpath(
	    		"class=\"display-result mt-4\"")) ;
	    youhaveselectedmessage.getText();	
	    
	    if(youhaveselectedmessage.isDisplayed())
	    { System.out.println(" test case is pass,Home check box is Clicked, user got the messge");}
	    
	    else { System.out.println("test case is fail ,Home check box is not Clicked, user didnpt get message");}
	 
	 // 2nd  validation by attribute value
	    
	    if ( homecheckboxbutton.getAttribute("class").contains("check"))
	    {
	    	System.out.println("test case is pass,Home check box is Clicked, user got the messge");
	    }
	    else { System.out.println("test case is fail ,Home check box is not Clicked, user didnot get message");}
//----------------------------------------------------------------------
	// Misteke se 2 bar click kiya ... not cliked on check box    
	    homecheckboxbutton.click(); // unclick
	    homecheckboxbutton.click();
	    homecheckboxbutton.click();// uncheck ho gya... TEST CASE IS FAIL 
	    
	    WebElement youhaveselectedmessage1 =driver.findElement(By.xpath
	    		("class=\"display-result mt-4\"")) ;// yaha no such element.. program terminated
	    
	    // THIS IS THE PROGRAMMING ERROR.. YOU MUST GET THAT YOUR TEST CASE IS FAIL
	    // validation will no happen because programme is terminated... BUT I WANT TO KNOW KI TEST CASE PASS HAI YA FAIL
	    
	    if ( homecheckboxbutton.getAttribute("class").contains("check"))
	    {
	    	System.out.println("test case is pass,Home check box is Clicked, user got the messge");
	    }
	    else { System.out.println("test case is fail ,Home check box is not Clicked, user didnot get message");}
	    
	  //-----------------------------------------------------------------------------------------
	    
	 // Misteke se 2 bar click kiya ... not cliked on check box    
	    homecheckboxbutton.click(); // click
	    homecheckboxbutton.click(); // uncheck ho gya... TEST CASE IS FAIL 
	    
	    
	    // Expected Result	-	1) User will NOT get the message " you have selected"
	    //						2) Tester will NOT notice change in class atrribute value uncheck to check.
	    
	     List <WebElement> youhaveselectedmessage2 =driver.findElements(By.xpath// nhi hua locate 
	    		("class=\"display-result mt-4\"")) ;// no programme terminate 
	    
	    
	    // validation will happen because programme is not terminated..
	    
	        youhaveselectedmessage.getText();	// nahi milega.. firbhi no termination 
		    
		    if(youhaveselectedmessage.isDisplayed())
		    { System.out.println(" test case is pass,Home check box is Clicked, user got the messge");}
		    
		    else { System.out.println("test case is fail ,Home check box is not Clicked, user didnpt get message");}
		 
		 // 2nd  validation by attribute value
		    
		    if ( homecheckboxbutton.getAttribute("class").contains("check"))
		    {
		    	System.out.println("test case is pass,Home check box is Clicked, user got the messge");
		    }
		    else { System.out.println("test case is fail ,Home check box is not Clicked, user didnot get message");}
	
	// ---------------------------------------------------------------------------------------------------
		    // Test case- 
	
	}}
