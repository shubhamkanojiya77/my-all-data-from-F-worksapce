package com.threadup.commomfunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePagecomonFunctionality {

	public static void sugessionclick(List<WebElement> sugessionlist ,String suggestedname)
	{	
	
		for (int i=0; i<sugessionlist.size(); i++)
	{
			sugessionlist.get(i).getText().equalsIgnoreCase(suggestedname);
			sugessionlist.get(i).click();
	}
	
}
//************* or
	public static boolean sugessionclick1 (List<WebElement> sugessionlist ,String suggestedname)
	{
		boolean flag = false;
		
		for  (int i=0; i<sugessionlist.size(); i++)
		{
				if(sugessionlist.get(i).getText().equalsIgnoreCase(suggestedname))
				{
					flag = true;
					sugessionlist.get(i).click();
				}
				else {
					flag = false;  // screenshot
					System.out.println(" there is no such sugession");
		}
	}
		return flag;
	}
//***************************************
	

	// cart functionality 
		public static void cartnumber (WebElement getmethod ,CharSequence addeditems)
		{ 
			getmethod.getAttribute("").contains(addeditems);// validation
			System.out.println("items are matching in add to cart");
		}

//****************** move to element**************
		 public static void moveandclick (WebElement getsectionmethod , WebElement getlinkmethod)
		 {
			 Actions action = new Actions(Browser.driver);	
			 action.moveToElement(getsectionmethod).moveToElement(getsectionmethod).click().build().perform();
		 }
		
		


		/* 
		  public static void moveandclick(String sectionlocator ,String linklocator)
		{
			
		Actions action = new Actions(Browser.driver);	
		WebElement section = Browser.driver.findElement(By.xpath(sectionlocator));
		WebElement link = Browser.driver.findElement(By.xpath(linklocator));
		
		action.moveToElement(section).moveToElement(link).click().build().perform();
		}
		 */
		


}




