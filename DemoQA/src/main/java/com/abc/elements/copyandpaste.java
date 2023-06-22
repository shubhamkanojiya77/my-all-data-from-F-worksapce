package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class copyandpaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\java eclipse\\LiveProject\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver() ;
		driver.get("https://demoqa.com/text-box");
		
	//	WebElement username=driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
		//PageFactory.initElements(driver,null );
		@FindBy(How=how.XPATH, using="//input[@placeholder=\\\"Full Name\\\"]")
		WebElement username;
		username.sendKeys("shubham");// value enter
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform(); // copied shubham
		
		WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		email.click();	
		
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	
	
	
	
	}

}
