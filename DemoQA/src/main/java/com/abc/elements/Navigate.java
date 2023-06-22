package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        
        driver.findElement(By.id("userName"));
       WebElement FullNametxt=driver.findElement(By.id("userName"));
       FullNametxt.sendKeys("shubham kanojiya");
       
       driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
         WebElement Emailtxt = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
        Emailtxt.sendKeys("shubhamrk@gmail.com");
        
        
        // NAVIGATION
        
        driver.navigate().back();// successfull
        
      driver.navigate().forward();
      
      driver.navigate().refresh();
      
      driver.navigate().to("https://i.imgur.com/prO9Nhp.jpg");// mera khud ka screenshot
      
      // myntra ka url
      driver.navigate().to(" https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAiAhKycBhAQEiwAgf19ekncntoYXmSel7aQEUXQSqI87zeAYKAxTsONk4nwSRKtePy8OhYNfxoClHUQAvD_BwE");
      
	}

}
