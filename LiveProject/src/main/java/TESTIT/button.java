package TESTIT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver" , ".\\resources\\chromedriver.exe");
        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        
        /*driver.findElement(By.xpath("//button[@id=\"CMdcd\"]"));// dynamic 
        WebElement clickmetbtn =driver.findElement(By.xpath("//button[@id=\"CMdcd\"]"));
        clickmetbtn.click();// dynamic click*/
       
        
        
        driver.findElement(By.xpath("//button[text()='Click Me']"));
        WebElement clickmetbtn= driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickmetbtn.click();
        
        
      /*  
        driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        WebElement doubleclickmetbtn= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        doubleclickmetbtn.click();
       
        driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        WebElement rightclickmetbtn= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        rightclickmetbtn.click();
        
        
       /* driver.findElement(By.xpath("//button[@type=\"button\"]"));// teeno buttpon me common to pahale wali button hi click hogi
        WebElement clickmetbtn1 =driver.findElement(By.xpath("//button[@type=\"button\"]"));
        clickmetbtn1.click();
       */
        
        driver.manage().window().maximize();
        
        driver.manage().window().minimize();
        
        driver.manage().window().fullscreen();
        
        driver.close();
       
        driver.quit();
      
       
        /*
        driver.findElements (By.xpath("//button"));
        List <WebElement> listofElements= driver.findElements(By.xpath("//button"));
      
        
      System.out.print(listofElements.size());*/
      
        
        
        
	}

	
	}


