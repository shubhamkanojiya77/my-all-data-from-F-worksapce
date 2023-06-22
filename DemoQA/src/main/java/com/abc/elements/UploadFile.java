package com.abc.elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
		
		 WebDriver  driver=new ChromeDriver();	
		driver.get("https://convertjpgtopdf.org/");
		WebElement choosejpg = driver.findElement(By.xpath("//label[@class=\"InputButton\"]"));
		choosejpg.click();
			
		Robot robot=new Robot();
		
	    StringSelection file = new StringSelection("C:\\Users\\USER\\Desktop\\hi.jpg");// selection of path
	    
	    Toolkit toolkit= Toolkit.getDefaultToolkit(); // called toolkit.. jisme clipbopard rahta hai
	    
	    toolkit.getSystemClipboard(); // calling the toolkit
	    toolkit.getSystemClipboard().setContents(file, null); // copy in clipboard
	    
	    //Thread.sleep(4000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	    
	}

	/*public void login()
	{
			 PageFactory.initElements(driver, this);
			    @FindBy(xpath="//input[@placeholder=\"Username\"]")
			    WebElement    Usernametxt;//=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
			    
			    WebElement    Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
			
			    WebElement  Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	}
}*/
public static void main ()
{
System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
		+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
 WebDriver  driver=new ChromeDriver();		
  
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); no such element
// thread.sleep ... ok 

WebElement    Usernametxt =driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));

WebElement    Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));

WebElement  Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));

Usernametxt.sendKeys("Admin");
Passwordtxt.sendKeys("admin123");
Loginbtn.click();

}}