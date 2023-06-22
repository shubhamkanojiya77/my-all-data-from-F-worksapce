package com.abc.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandle {
public static WebDriver driver;
	public static void main(String[] args) {
		 	
		
			System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
					+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
		      driver=new ChromeDriver();		
		      
		    //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    driver.manage().window().maximize();
		
			 
	
	}
}
	/*
		    Alertshandle obj=new Alertshandle();
		    obj.alert1("Please enter a valid user name");
		   
		     or static method
		    
		  Alertshandle.alert1( "Please enter a valid user name")
		  
		  */
	//***************//////////////////////////////////	general way *********/
/*	//  1)

	// ALERT CAME 
    
    driver.switchTo().alert();
    
    Alert alert = driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	if(alert.getText().equals("Please enter a valid user name"))
	{
		driver.switchTo().alert().accept();
	}
	else
	{
		driver.switchTo().alert().dismiss();
	}
// validation that you have handle the alert


WebElement usernametxtbox =driver.findElement(By.xpath("//input[@id=\"login1\"]"));	
if(usernametxtbox.isDisplayed())
{
	System.out.println("i have handled that alert" );
}
	    
		
///    2)
	//***************---------------*****************************
	public  boolean alert1(String Message) {
		
		boolean judge;
		driver.switchTo().alert();
		
		Alert alert2 = Alertshandle.driver.switchTo().alert();
		
		String textValue =alert2.getText();
		if(textValue.equals(Message))
		{
			judge=true; // rememeber this 
			driver.switchTo().alert().accept();
			System.out.println("you have clicked , i am validating" );
		}
		else 
		{
		judge = false; // rememeber this 
		driver.switchTo().alert().dismiss();
		}
		/*if(judge)
		{
			judge=true;
		}
		else
		{
			judge=false;
		}
		return judge;
		}

/*
	// 	 3) UPLOAD ANY FILE 
//****************************************************************************
			driver.get("https://html.com/input-type-file/");
             WebElement choosefilebutton = driver.findElement(By.xpath("//input[@name=\"fileupload\"]"));
		    choosefilebutton.sendKeys("F:\\quick heal Product Key.txt");
		   System.out.println("you have uploaded , i am validating" );
		   
		 driver.get("https://www.ilovepdf.com/word_to_pdf");
		 WebElement choosefilebutton = driver.findElement(By.xpath("//a[@id="pickfiles"]"));
		choosefilebutton.sendKeys("C:/Users/USER/Doc4.docx");
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	