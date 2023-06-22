package com.abc.elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\java eclipse\\LiveProject\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver() ;
		driver.get("https://demoqa.com/checkbox");
	
		// check box button
		WebElement checkboxbtn=driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")) ;
		checkboxbtn.click();
		
		// selection message
		WebElement messgae=driver.findElement(By.xpath("//span[text()='You have selected :']"));
		System.out.println(messgae.getText());
		
		if (messgae.getText().isBlank())
		{
			System.out.println("test case is fail");
		}else 
		{System.out.println("test case is pass");
	}

		
		// double click
		WebElement checkboxbtn1=driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")) ;
		checkboxbtn1.click();
		checkboxbtn1.click();
		      // selected check box 
		System.out.println(checkboxbtn1.isEnabled());
		System.out.println(checkboxbtn1.isDisplayed());
		System.out.println(checkboxbtn1.isSelected());
		
		WebElement messgae1=driver.findElement(By.xpath("//span[text()='You have selected :']"));
		System.out.println(messgae1.getText());
		
		// label se locator... label pr click kiya to bhi click hoga check button pr
		WebElement checkboxbtn2=driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]")) ;
		checkboxbtn2.click();// click hoga 5th number
		System.out.println(checkboxbtn2.isEnabled());
}}
