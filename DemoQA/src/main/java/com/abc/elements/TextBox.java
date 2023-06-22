package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        
        driver.findElement(By.id("userName"));
       WebElement FullNametxt=driver.findElement(By.id("userName"));
       FullNametxt.sendKeys("shubham kanojiya");
       
       driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
         WebElement Emailtxt = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
        Emailtxt.sendKeys("shubhamrk@gmail.com");
        
       driver.findElement(By.xpath(" //textarea[@placeholder=\"Current Address\"]"));
        WebElement CurrentAddresstxt= driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
        CurrentAddresstxt.sendKeys("plot no 468, sugat nagar, nagpur-440014");
        
        driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        WebElement PermanentAddresstxt = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        PermanentAddresstxt.sendKeys("same as above");
        
        driver.findElements(By.xpath(" //button[@id=\"submit\"]"));
        WebElement submitbtn =driver.findElement(By.xpath("//button[@id=\"submit\"]"));
        submitbtn.click();
        
        FullNametxt.getText(); 
        /*driver.findElement(By.xpath("//button[@id=\"CMdcd\"]"));
        WebElement clickmetbtn =(WebElement) driver.findElements(By.xpath("//button[@id=\"CMdcd\"]"));
        clickmetbtn.click();*/
	
	// read your label
        
        driver.findElements(By.xpath(" //label[@id=\"userName-label\"]"));
        WebElement fullnamelabel =driver.findElement(By.xpath("//label[@id=\"userName-label\"]"));
        fullnamelabel.getText(); 
	}

}

