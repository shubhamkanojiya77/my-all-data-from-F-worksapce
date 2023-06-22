package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","F:\\java eclipse\\DemoQA\\src\\main//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjYoImEw7H8AhU2zzgGHXFlDw4QPAgI");
		driver.manage().window().maximize();

		WebElement camerasearch = driver.findElement(By.xpath("//div[@jsname=\"R5mgy\"]"));
		Actions action=new Actions(driver); // dont need
		action.moveToElement(camerasearch); //dont need
		camerasearch .getAttribute("aria-label");
		System.out.println(camerasearch .getAttribute("aria-label"));
		
	}

}
