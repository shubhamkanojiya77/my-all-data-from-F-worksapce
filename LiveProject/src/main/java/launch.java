import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "F:\\java eclipse\\LiveProject\\src\\main\\resources\\msedgedriver.exe");  // to register driver path
		
		ChromeDriver driver=new ChromeDriver();  // constructor call browser luanch
		
		driver.get("url");
		driver.
		
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();
		
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
	}

}
