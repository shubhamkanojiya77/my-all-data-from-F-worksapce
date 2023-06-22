package com.abc.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","F:\\java eclipse\\LiveProject\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		List<WebElement> yesbutton = driver.findElements(By.xpath("//label[@for=\"yesRadio\"]"));
		yesbutton.size();
		//yesbutton
		
	
		
	}

}
