package com.gotobuy.commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;




public class browser {

	public static Properties prop;
	public static WebDriver driver;
	public String OrangeHRMUrl;
    public String browsername;	
   
	
  /*  public static void main(String[]args)
    {
    	browser browserobj=new browser();
        browserobj.browserLaunch();
    }*/
    public static void browserLaunch() throws InterruptedException   {
    	String browsername = "Chrome"; 
		ReadProperty();
	       
			if(prop.getProperty("browsername").equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","F:\\java eclipse\\BuyGoTo\\src\\main\\resources\\chromedriver.exe");
			     driver=new ChromeDriver();
		        
			}
			else 
			{System.setProperty("webdriver.edge.driver","F:\\java eclipse\\BuyGoTo\\src\\main\\resources"
					+ "\\msedgedriver.exe");
		     driver=new EdgeDriver();
	        
			}
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// common functionality
		    driver.navigate().to("https://buy.goto.com/resolve/free");//common functionality
			driver.manage().window().maximize();	// common functionality
			Thread.sleep(5000);
    }
	 public static void ReadProperty()
	 {
		   prop=new Properties();
		 try {
			prop.load(new FileInputStream("F:\\java eclipse\\OrangeHrms\\src\\main\\resources\\application.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
	 
	 }}



