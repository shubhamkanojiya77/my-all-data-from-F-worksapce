package com.abc.elements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.sjavac.CopyFile;

public class ScreenShot {

	public static ChromeDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        
      // 1
       File src = driver.getScreenshotAs(OutputType.FILE);
        
       File outputfile=new File("F:\\java eclipse\\DemoQA\\target/shubham.jpg"); 
       
       FileUtils.copyFile(src, outputfile); 

       // 2 
       ScreenShot.screenshotcapture("meera");
      
      
	}
	// new method 
		public static void screenshotcapture(String filename) throws IOException  // checked exception for file path 
		{ 
		// captured the screen and made it as file
		File source= /*((TakesScreeenshot)*/driver.getScreenshotAs(OutputType.FILE); // OutputType.FILE ... not a variable 
		// gave the storage path and name of screenshot
		File destination = new File ("F:\\java eclipse\\DemoQA\\src\\test\\java\\screenshot by selenum apache IO/ "+filename+"jpg+");
		
		// copying my sreenshot to its storage folder
		FileUtils.copyFile(source, destination)  ; //(source,destination);
		}
		
}
/*
// wrong method
public static <X> void scrrenshot( OutputType<T>   ,String path) 
{
	File src =driver.getScreenshotAs(OutputType.FILE); // sabhi file format me rahega
	File destination = new File(path); // hr file ka path dena too wiered
	try {
		FileUtils.copyFile(src, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}  */
	

