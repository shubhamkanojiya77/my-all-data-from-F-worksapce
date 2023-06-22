package com.abc.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        
       
		driver.findElement(By.xpath("//button"));
        WebElement listofelemen=driver.findElement(By.xpath("//button"));
        
        listofelemen.click();
        
	
     /* driver.findElements(By.xpath("//button"));
      List <WebElement> listofelement=driver.findElements(By.xpath("//button"));
      
      System.out.print(listofelement.size());
      
      ((WebElement) listofelement).click();	*/
	}

}
