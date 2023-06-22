package TESTIT;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class newtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        
        
       String PARENTWIBDOW=driver.getWindowHandle(); // 1st tab ka variable 
        
       WebElement newtab= driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
        
        //WebElement newtab1=driver.findElement(By.xpath("//button[text()='New Tab']"));// text function se locator
	
        newtab.click();
        //new tab
        Set <String>bothwindow=driver.getWindowHandles();
        
        java.util.Iterator<String> bothtabIDlist =bothwindow.iterator();
        
        	while (bothtabIDlist.hasNext())
        		{ String getnewtabID=bothtabIDlist.next();
        		
        		if(!getnewtabID.equalsIgnoreCase("PARENTWIBDOW"))// you will get secondtab id
        		{
        		driver.switchTo().window(getnewtabID);
        		}
        
        }
       
        // new tab par jo bhi hai uska locator bana raha hu
        WebElement samplepage= driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
        samplepage.getText();
        
        
	}

}
