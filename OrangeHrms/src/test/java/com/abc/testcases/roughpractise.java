package com.abc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.abc.commonfunctionality.browser;

public class roughpractise {
//public static EdgeDriver driver;
	public static void main (String[] args) throws InterruptedException {
		
		
			roughpractise obj=new roughpractise();
			obj.brows();
			
	}
		
		
		public void brows() throws InterruptedException    {
			System.setProperty("webdriver.edge.driver","F:\\java eclipse\\"
					+ "OrangeHrms\\src\\main\\resources\\msedgedriver.exe");
			EdgeDriver  driver=new EdgeDriver();
		     
		     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");//common functionality
				
		     driver.manage().window().maximize();	// common functionality
				Thread.sleep(2000);
				WebElement Usernametxt=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
				Usernametxt.sendKeys("Admin");
				WebElement Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
				Passwordtxt.sendKeys("admin123");
				WebElement Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
				 Loginbtn.click();
				 Thread.sleep(5000);
				WebElement logoimg=driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]"));	
				logoimg.click();
				driver.getCurrentUrl();
				driver.navigate().back();
				 Thread.sleep(5000);
				WebElement Searchbartxt=driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
				Searchbartxt.sendKeys("abcd");
		}
		
			
			//WebElement contractarrowbutton=browser.driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-chevron-left\"]"));
			//contractarrowbutton.click();
			
			/*WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement
			WebElement*/
			
		}

	


