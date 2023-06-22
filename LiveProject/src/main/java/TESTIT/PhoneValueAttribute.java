package TESTIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneValueAttribute {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAiAhKycBhAQEiwAgf19ekncntoYXmSel7aQEUXQSqI87zeAYKAxTsONk4nwSRKtePy8OhYNfxoClHUQAvD_BwE");

        
        WebElement MobileNoFetch=driver.findElement(By.xpath(" //INPUT[@type=\"tel\"]"));
        
        MobileNoFetch.sendKeys("9373372754");
        
        System.out.println(MobileNoFetch.getAttribute("value"));
        
        
        
        System.out.println(MobileNoFetch.getAttribute("value").length()); 
        
        if(MobileNoFetch.getAttribute("value").length()<=10)
        {
        	System.out.println("test case is pass");
        }
        else
        {
        	System.out.print("test case is fail");
        }
	// continue par click
      WebElement continuebtn=driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]"));
      continuebtn.click();
	
	}


}
