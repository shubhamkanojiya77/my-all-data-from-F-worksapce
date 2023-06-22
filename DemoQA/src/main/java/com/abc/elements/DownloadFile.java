package com.abc.elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
		
		 WebDriver  driver=new ChromeDriver();	
		driver.get("https://convertjpgtopdf.org/");
		
		
			Robot robot=new Robot();
			
			robot.keyPress(KeyEvent.VK_DOWN);
			
			
			robot.keyPress(KeyEvent.VK_TAB);
			  //robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_TAB);
			// robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			 //robot.keyRelease(KeyEvent.VK_ENTER);
			
	}

}
