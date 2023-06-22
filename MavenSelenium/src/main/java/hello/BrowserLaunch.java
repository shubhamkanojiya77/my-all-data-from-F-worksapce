package hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
    public static ChromeDriver driver;
	public static Properties prop;
	 public static EdgeDriver ed;
	public void initiatebrowser() {
		String browsername = "Chrome";
		readproperty();
		
			//if(browsername.equalsIgnoreCase("chrome"))
			if(prop.getProperty("browsername").equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver" ,"F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//System.out.print(driver.getTitle());// get title is method of webdriver interface --->isko chrome driver class ne 
		
			}
			//else if(browsername.equalsIgnoreCase("edge"))
			else if(prop.getProperty("browsername").equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.edge.driver" , " F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://demoqa.com");
		System.out.print(ed.getTitle());
		}
	}
	
	public void readproperty() {
		
		 prop=new Properties();
		/*FileInputStream inobject=new FileInputStream("F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\application.properties");
		
		prop.load(inobject);*/
		
	try {
		prop.load(new FileInputStream("F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\application.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	
	}
	/*
	 public static void main(String[] args) {
		String browsername = "chrome" ;
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver" ,"F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		}
		else if(browsername.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver" , " F:\\java eclipse\\MavenSelenium\\src\\main\\resources\\msedgedriver.exe");
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://demoqa.com");
		}
	}	
	}
	*/

	

}
