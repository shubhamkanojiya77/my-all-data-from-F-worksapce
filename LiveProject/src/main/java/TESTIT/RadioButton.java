package TESTIT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.Driver","F:\\java eclipse\\LiveProject\\src\\main\\resources\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/radio-button");
	
	WebElement yesbutton = driver.findElement(By.xpath("//label[@for=\"yesRadio\"]"));
	yesbutton.click();
	
	
	WebElement youhaveselectedyes=driver.findElement(By.xpath("//p[@class=\"mt-3\"]"));
	
	WebElement youhaveselectedyes1=driver.findElement(By.xpath("//span[@class=\"text-success\"]"));
	
	System.out.println(youhaveselectedyes.isEnabled());
	
	if (youhaveselectedyes.isEnabled())
	{
		System.out.println("test case is pass");
	}
	System.out.println(youhaveselectedyes.isDisplayed());
	System.out.println(youhaveselectedyes.isSelected());
	// impressive button 
	
	/*WebElement impressivebutton = driver.findElement(By.xpath("//input[@id=\"impressiveRadio\"]"));
	yesbutton.click();
	
	
	WebElement youhaveselectedimpressive=driver.findElement(By.xpath("//p[@class=\"mt-3\"]"));
	
	WebElement youhaveselectedimpressive1=driver.findElement(By.xpath("//span[@class=\"text-success\"]"));
	
	System.out.println(youhaveselectedimpressive.isEnabled());
	
	if (youhaveselectedimpressive.isEnabled())
	{
		System.out.println("test case is pass");*/
	
	
	
	// no radio button ... input se locator
	
	WebElement noradiobutton=driver.findElement(By.xpath("//input[@id=\"noRadio\"]"));
	
	System.out.println(noradiobutton.isEnabled());
	
	System.out.println(noradiobutton.isDisplayed());
	
	System.out.println(noradiobutton.isSelected());
	
	if(noradiobutton.isEnabled())
	{
		System.out.println("test case is failed");
	}else 
	{System.out.println("test case is pass");
	}
	
	
	// label se locator
	WebElement noradiobutton1=driver.findElement(By.xpath("//label[@for=\"noRadio\"]"));
	
	System.out.println(noradiobutton1.isEnabled());
	
	System.out.println(noradiobutton1.isDisplayed());
	
	System.out.println(noradiobutton1.isSelected());
	}
}
	
	

