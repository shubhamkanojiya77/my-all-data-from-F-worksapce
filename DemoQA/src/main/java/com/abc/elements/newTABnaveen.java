package com.abc.elements;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTABnaveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        
        driver.get("https://www.google.co.in/?gws_rd=ssl"); // ABHI YAHA HAIDRIVER
        
        System.out.println(driver.getTitle());
        
        driver.switchTo().newWindow(WindowType.TAB); // it will open blank TAB.. DRIVE
        
        Set<String> bothtabID = driver.getWindowHandles();
        
        List<String> bothIDlist = new ArrayList<String>(bothtabID);
        
         String parentID = bothIDlist.get(0);
         String  childID= bothIDlist.get(1);
         
         System.out.println(parentID);// old tab actual wala 
         System.out.println(childID); 	// new tab jispar switch kiya tha 
         
        System.out.println("balnk page title is invisible" + driver.getTitle());
        
        driver.get("https://www.facebook.com/"); 	// driver usi blank tab me facebook open karega
        System.out.println(driver.getTitle());
	
        driver.close(); // jis tab me driver hai wo close... driver bhi LOSSED HO GYA
         
       driver.switchTo().window(parentID); // BACK TO 1ST TAB
       System.out.println(parentID);
       System.out.println(driver.getTitle());
        // QUESTION --> HOW TO GET MY DRIVER
        
	}

}
