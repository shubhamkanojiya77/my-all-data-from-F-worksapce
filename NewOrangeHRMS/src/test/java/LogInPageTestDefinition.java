import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.commonfunctionality.browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInPageTestDefinition {
	
	public static WebDriver driver;
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		System.setProperty("webdriver.chrome.driver","F:\\java eclipse\\NewOrangeHRMS\\src\\main\\resources"
				+ "\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter username")
	public void enter_username() {
		WebElement Usernametxt=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		Usernametxt.sendKeys("Admin");
	}

	@When("eneter password")
	public void eneter_password() {
		WebElement Passwordtxt=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		Passwordtxt.sendKeys("admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement Loginbtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Loginbtn.click();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	@Then("user is on loginpage")
	public void user_is_on_loginpage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
