package com.abc.commomfunctionality;

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
	/*public  browser() throws InterruptedException    //my mistake... 	this is the default constructor
	{
		this.browserLaunch();		 // default constructor nahi banana hai sirf aur sirf parametrized constructor banana hai
	}*/
	
	public static Properties prop;
	public static WebDriver driver;
	public String OrangeHRMUrl;
    public String browsername;	
   
	
   /* public static void main(String[]args) throws InterruptedException
    {
    	BrowserUtility browserobj=new BrowserUtility();
        browserobj.browserLaunch();
    }*/
    public void browserLaunch() throws InterruptedException   {
    	String browsername = "Chrome"; 
		ReadProperty();
	       
			if(prop.getProperty("browsername").equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
						+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
			     driver=new ChromeDriver();
		        
			}
			else 
			{
				System.setProperty("webdriver.edge.driver","F:\\java eclipse\\"
					+ "OrangeHrms\\src\\main\\resources\\msedgedriver.exe");
		     driver=new EdgeDriver();
	        
			}
			/*else if (prop.getProperty("browsername").equalsIgnoreCase("Opera"))
			{ System.setProperty("WebDriver.Opera.Driver", "F:\\java eclipse\\"
					+ "OrangeHrms\\src\\main\\resources\\operadriver.exe");
	        driver = new OperaDriver();
			}
			else if (prop.getProperty("browsername").equalsIgnoreCase("Gecko"))
			{System.setProperty("webdriver.gecko.driver","F:\\java eclipse\\"
					+ "OrangeHrms\\src\\main\\resources\\geckodriver.exe");
			  driver=new GeckoDriver();
	        
			}*/
			
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//common functionality
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



