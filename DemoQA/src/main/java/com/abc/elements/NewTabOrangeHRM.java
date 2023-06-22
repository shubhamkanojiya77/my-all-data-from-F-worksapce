package com.abc.elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTabOrangeHRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	// get this current tab handler ID ( only 1 tab)
	System.out.println(driver.getWindowHandle());//driver.getWindowHandle();
	//}

		String orangehrmtabID =driver.getWindowHandle();// 1st tab
		
		// new tab operation perform facebook page
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement facebooklink =driver.findElement(By.xpath("//a[@href=\\\"https://www.facebook.com/OrangeHRM/\\\"]"));
		facebooklink.click();
		// for validation switch to facebook tab 
		//System.out.println(driver.getWindowHandles());
		Set<String> orangeandfbtabID=driver.getWindowHandles();
		Iterator<String>eachtabID= orangeandfbtabID.iterator();
		while(eachtabID.hasNext())// SINGLE ID PRESENCE
			{String facebooktabID=eachtabID.next();// SINGLE ID
			if(!facebooktabID.equalsIgnoreCase(orangehrmtabID)); // SINGLE ID
			driver.switchTo().window(facebooktabID);
				
			}
		// validation
		WebElement faceboologo =driver.findElement(By.xpath("//a[@aria-label=\"Facebook\"]"));
		if(faceboologo .isDisplayed())
		{System.out.println("you are on facebookpage : " +faceboologo .getText());
		}
		
		
		// from facebook to orangehrms
		driver.switchTo().window(orangehrmtabID);
		
		//-----------------------------------------------------------------------------------//
		
		WebElement twitterlink =driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]"));
		twitterlink.click();
		// for validation switch to twittertab
		Set<String> orangeandtwitterID=driver.getWindowHandles();
		Iterator<String> eachtabID1=orangeandtwitterID.iterator();
		while(eachtabID1.hasNext())
		{
		String twittertabID=eachtabID1.next();	
		if(!twittertabID.equalsIgnoreCase(orangehrmtabID));	
		driver.switchTo().window(twittertabID);
		}	
		// validation
				WebElement twitterbutton =driver.findElement(By.xpath("//a[@aria-label=\"Twitter\"]"));
				if(twitterbutton.isEnabled())
				{System.out.println("you are on twitterpage : " +twitterbutton.getText());
				}
		
		// move selenium from twitter tab to orangehrms tab
				driver.switchTo().window(orangehrmtabID);
				
		WebElement linkedinlink =driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]"));
		linkedinlink.click();
		
		// for validation move selenium to kinkedin tab
		Set<String> orangeandlinkedtab = driver.getWindowHandles();
		Iterator<String> eachtabid2= orangeandlinkedtab.iterator();
		while(eachtabid2.hasNext())
		{
		String linkedtabid=eachtabid2.next();
		if(!linkedtabid.equalsIgnoreCase(orangehrmtabID));
		driver.switchTo().window(linkedtabid);
		}
		// validation
		WebElement linkedinlogo =driver.findElement(By.xpath("//h1[text()=\"Join LinkedIn\"]"));
		if(linkedinlogo.isDisplayed())
		{System.out.println("you are on twitterpage : " +linkedinlogo.getText());
		}
	/*	WebElement youtubelink =driver.findElement(By.xpath("//a[href=\"https://www.youtube.com/c/OrangeHRMInc\""));
		youtubelink.click();
		WebElement orangehrmpolicylink =driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]"));
		orangehrmpolicylink.click();
		*/
	
	
	
	
	}
}