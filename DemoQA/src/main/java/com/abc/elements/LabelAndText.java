package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelAndText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        
        // full name label ka locator
		 driver.findElements(By.xpath(" //label[@id=\"userName-label\"]"));
	        WebElement fullnamelabel =driver.findElement(By.xpath("//label[@id=\"userName-label\"]"));
	        System.out.println(fullnamelabel.getText());
	        
	//full name field or element ka locator... find value of attribute.. value itself is also an attribute
	        
	        driver.findElement(By.xpath("//input[@type=\"text\"]"));
	        WebElement FullNamefield=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	        System.out.println(FullNamefield.getAttribute("id"));
	        System.out.println(FullNamefield.getAttribute("autocomplete"));
	        System.out.println(FullNamefield.getAttribute("placeholder"));
	        System.out.println(FullNamefield.getAttribute("type"));
	        System.out.println(FullNamefield.getAttribute("class"));
	        
	  // email label ka locator
	        driver.findElement(By.xpath("//label[@id=\"userEmail-label\"]"));
	        WebElement emaillabel=driver.findElement(By.xpath("//label[@id=\"userEmail-label\"]"));
	        System.out.println(emaillabel.getText());
	        
	       // email ka field locator
	        WebElement emailfield=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	        System.out.println(emailfield.getAttribute("value"));
	        System.out.println(emailfield.getAttribute("placeholder"));
	        System.out.println(emailfield.getAttribute("type"));
	        
 // button ka locator
	        
	        driver.get("https://demoqa.com/buttons");
	        WebElement BUTTONTEXT = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"] ")) ;
	        System.out.println(BUTTONTEXT.getText());
	        System.out.println(BUTTONTEXT.getAttribute("id"));
	        
	        }

}
