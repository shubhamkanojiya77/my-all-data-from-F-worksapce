package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\chromedriver.exe");
ChromeDriver obj=new ChromeDriver();

obj.get("https://www.youtube.com/");

WebElement naveenvideolink = obj.findElement(By.xpath("//yt-icon[@class=\"guide-icon style-scope ytd-mini-guide-entry-renderer]"));
naveenvideolink.click();
	}

}
