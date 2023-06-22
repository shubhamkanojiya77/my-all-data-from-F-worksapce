package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("//the-internet.herokuapp.com");
	     
	     driver.findElement(By.xpath("//a[text()=\"Digest Authentication\"]")).click();
	     
	     //  got pop up
	   //  driver.switchTo().alert().sendKeys("admin");
	     //driver.switchTo().alert().sendKeys("admin");
	     //driver.switchTo().alert().accept();
	     
	     
	     
	     driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	   
	     // http:username:password@url
	     WebElement text=driver.findElement(By.tagName("p"));
		    System.out.println(text.getText()); 
		    
		    
	



//************* demo qa********


	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
	
	driver.switchTo().alert().accept();
	System.out.println("i have clicked ");
}	
}