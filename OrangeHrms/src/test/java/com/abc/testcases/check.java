package com.abc.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.abc.commonfunctionality.browser;

public class check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//common functionality
			driver.manage().window().maximize();	
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			Thread.sleep(5000);
			WebElement  Usernametxt=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
			WebElement  Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
			WebElement  Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			 Usernametxt.sendKeys("Admin");
			 Passwordtxt.sendKeys("admin123");
			 Loginbtn.click();
	}

}
