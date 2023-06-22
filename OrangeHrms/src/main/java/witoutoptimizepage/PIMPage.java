package witoutoptimizepage;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;

public class PIMPage extends HomePage{
		
	/*public PIMPage (String username, String password)
	{
		super(username,password );
		getPimlink().click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// classobject.method();.. ye khatam ho gaya in child 
	}*/
	// PIMPage pimpage=new PIMPage ("Admin","admin123");
	// variables 
	private WebElement addbutton;
	
	
	private WebElement  firstnametxt;
	
	private WebElement	middlenametxt;
	

	private WebElement lastnametxt;

	

	private WebElement	logincheckbox ;
	

			private WebElement	usernametxt;
	

			private WebElement	passwordtxt	;
	

			private WebElement confirmpasswordtxt;
	

	private WebElement	savebutton ;
	
	
	private WebElement cancelbutton1 ;
	private WebElement newuseraddedmessage;
	private WebElement newemployeedetail;//label[text()="Employee Id"]/following::input[1][@class="oxd-input oxd-input--active"]
	
	// LOACTORS
	
	
	public WebElement getAddbutton() {
		addbutton = browser.driver.findElement(By.xpath
	("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
		return addbutton;
		}//url change
	public WebElement getFirstnametxt() {
		firstnametxt = browser.driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]"));
		return firstnametxt;
	}
	public WebElement getMiddlenametxt() {
		middlenametxt = browser.driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]"));
		return middlenametxt;
	}
	public WebElement getLastnametxt() {
		lastnametxt = browser.driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]"));
		return lastnametxt;
	}
	public WebElement getLogincheckbox() {
		logincheckbox = browser.driver.findElement(By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"));
		return logincheckbox;
	}// dyanmic element will comeup
	public WebElement getUsernametxt() {
		usernametxt = browser.driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		return usernametxt;// Should be at least 5 characters
	}
	public WebElement getPasswordtxt() {
		passwordtxt = browser.driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		return passwordtxt;
	}
	//Your password must contain a lower-case letter, 
	//an upper-case letter, a digit and a special character
	// 8 character length
	
	public WebElement getConfirmpasswordtxt() {
		confirmpasswordtxt = browser.driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		return confirmpasswordtxt;
	}
	public WebElement getSavebutton() {
		savebutton = browser.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		return savebutton;
	}
	public WebElement getCancelbutton1() {
		cancelbutton1 = browser.driver.findElement(By.xpath("//button[normalize-space()='cancel']"));
		return cancelbutton1;
	}
	public WebElement getNewuseraddedmessage() {
		newuseraddedmessage= browser.driver.findElement(By.xpath
		("//h6[text()=\"Personal Details\"]"));
		return newuseraddedmessage;
	}
	

	public java.util.List<WebElement> getNewemployeedetail() {
		java.util.List<WebElement> newemployeedetail =browser.driver.findElements(By.xpath("//div[@class=\"--name-grouped-field\"]"));
		return newemployeedetail;
	}
		// FUNCTIONALITY
		public void addemployeefunctionality(String Firstname,String Middlename,String Lastname
				,String Username,String Password,String Confirmpassword ) throws InterruptedException
		{
			getAddbutton().click();
			Thread.sleep(2000);
			getFirstnametxt().sendKeys(Firstname);
			getMiddlenametxt().sendKeys(Middlename);
			getLastnametxt().sendKeys(Lastname);
			getLogincheckbox().click();
			getUsernametxt().sendKeys(Username);
			getPasswordtxt().sendKeys(Password);
			getConfirmpasswordtxt().sendKeys(Confirmpassword);
			getSavebutton().click();
			Thread.sleep(5000);// for loading new page .. validation

		}
	
	
	
	
	
	
	
	
	
	
}
