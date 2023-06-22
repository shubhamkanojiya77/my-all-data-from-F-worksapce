package witoutoptimizepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;
import com.abc.reporter.Reporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomePage extends LogInPage {
		
	
	
	 // HomePage homepage=new HomePage("Admin","admin123") ;    // constructor calling 
	 
	
	//variables dashborad
	
	 private  WebElement logoimg	  ;			//img[@alt="client brand banner"]
	 private  WebElement Searchbartxt	;	//input[@placeholder="Search"]
	 private  WebElement contractarrowbutton	;	//i[@class="oxd-icon bi-chevron-left"]
	 private  WebElement Expandarrow		;	//i[@class="oxd-icon bi-chevron-right"]
	 private  WebElement adminlink	;	//a[@class="oxd-main-menu-item active"]
	 private  WebElement pimlink	;	//a[@class="oxd-main-menu-item active"]
	 private  WebElement leavelink 	;	//a[@href="/web/index.php/leave/viewLeaveModule"]
	 private  WebElement timelink	;  //span[text()="Time"]	
	 private  WebElement recruitmentlink ;//a[@href="/web/index.php/recruitment/viewRecruitmentModule"]
	 private  WebElement myinfolink ;		//a[@class="oxd-main-menu-item active"]
	 private  WebElement performancelink ;		//span[text()="Performance"]
	 private  WebElement dashboardlink	;	//a[@href="/web/index.php/dashboard/index"]
	 private  WebElement directorylink	;	//a[@href="/web/index.php/directory/viewDirectory"]
	 private  WebElement Maintenancelink ;      //a[@href="/web/index.php/maintenance/viewMaintenanceModule"]
	 private  WebElement buzzlink	;	//a[@href="/web/index.php/buzz/viewBuzz"]
	 private  WebElement candidateoptiondropdown ;		//img[@alt="profile picture"]
	 private  WebElement Aboutlink	; //a[text()="About"]
	 private  WebElement supporlink	;	//a[text()="Support"]
	 private  WebElement changepasswordlink	;	//a[text()="Change Password"]
	 private  WebElement logoutlink	;	//a[text()="Logout"]
	 private  WebElement cancelbutton;		
	 private  WebElement updatepasswordmessage;		
	 
	 private  WebElement currentpasswordtxt ;			
	 private  WebElement newpasswordtxt;		
	 private  WebElement savepasswordbutton ;		
	 private  WebElement successmessage ;		
	 // locators dashboard
	 
	
	public WebElement getCurrentpasswordtxt() {
		currentpasswordtxt = browser.driver.findElement(By.xpath
				("(//input[@type='password'])[1]"));
		return currentpasswordtxt;
	}
	public WebElement getNewpasswordtxt() {
		newpasswordtxt = browser.driver.findElement(By.xpath(""
				+ "(//input[@type='password'])[2]"));
		return newpasswordtxt;
	}
	public WebElement getSavepasswordbutton() {
		savepasswordbutton = browser.driver.findElement(By.xpath
				("//button[normalize-space()='Save']"));
		return savepasswordbutton;
	}
	public WebElement getLogoimg() {
		logoimg=browser.driver.findElement(By.xpath("//img"
				+ "[@alt=\"client brand banner\"]"));
		return logoimg;
	}
	public WebElement getSearchbartxt() {
		Searchbartxt=browser.driver.findElement(By.xpath("//"
				+ "input[@placeholder=\"Search\"]"));
		return Searchbartxt;
	}
	public WebElement getContractarrowbutton() {
		contractarrowbutton=browser.driver.findElement(By.xpath(""
				+ "//i[@class=\"oxd-icon bi-chevron-left\"]"));
		return contractarrowbutton;
	}
	public WebElement getExpandarrow() {
		Expandarrow=browser.driver.findElement(By.xpath("//"
				+ "i[@class=\"oxd-icon bi-chevron-right\"]"));
		return Expandarrow;
	}
	public WebElement getAdminlink() {
		adminlink=browser.driver.findElement(By.xpath("//span[text()=\"Admin\"]"));
		return adminlink;
	}
	public WebElement getPimlink() {
		pimlink=browser.driver.findElement(By.xpath("//span[text()=\"PIM\"]"));
		return pimlink;//a[@class="oxd-main-menu-item active toggle"]
	}
	public WebElement getLeavelink() {
		leavelink=browser.driver.findElement(By.xpath("//a"
				+ "[@href=\"/web/index.php/leave/viewLeaveModule\"]"));
		return leavelink;
	}
	public WebElement getTimelink() {
		timelink=browser.driver.findElement(By.xpath(""
				+ "//span[text()=\"Time\"]"));
		return timelink;
	}
	public WebElement getRecruitmentlink() {
		recruitmentlink=browser.driver.findElement(By.xpath("//a[@href="
				+ "\"/web/index.php/recruitment/viewRecruitmentModule\"]"));
		return recruitmentlink;
	}
	public WebElement getMyinfolink() {
		myinfolink=browser.driver.findElement(By.xpath("//a[@class="
				+ "\"oxd-main-menu-item active\"]"));
		return myinfolink;
	}
	public WebElement getPerformancelink() {
		performancelink=browser.driver.findElement(By.xpath(""
				+ "//span[text()=\"Performance\"]"));
		return performancelink;
	}
	public WebElement getDashboardlink() {
		dashboardlink=browser.driver.findElement(By.xpath("//a"
				+ "[@href=\"/web/index.php/dashboard/index\"]"));
		return dashboardlink;
	}
	public WebElement getDirectorylink() {
		directorylink=browser.driver.findElement(By.xpath("//a"
				+ "[@href=\"/web/index.php/directory/viewDirectory\"]"));
		return directorylink;
	}
	public WebElement getMaintenancelink() {
		Maintenancelink=browser.driver.findElement(By.xpath("//a[@href"
				+ "=\"/web/index.php/maintenance/viewMaintenanceModule\"]"));
		return Maintenancelink;
	}
	public WebElement getBuzzlink() {
		buzzlink=browser.driver.findElement(By.xpath("//a[@href="
				+ "\"/web/index.php/buzz/viewBuzz\"]"));
		return buzzlink;
	}
	public WebElement getCandidateoptiondropdown() {
		candidateoptiondropdown=browser.driver.findElement(By.xpath("//"
				+ "img[@alt=\"profile picture\"]"));
		return candidateoptiondropdown;
	}
	public WebElement getAboutlink() {
		Aboutlink=browser.driver.findElement(By.xpath("//a[text()=\"About\"]"));
		return Aboutlink;
	}
	 public WebElement getCancelbutton() {
		 cancelbutton=browser.driver.findElement(By.xpath("//button[@class="
		 + "\"oxd-dialog-close-button oxd-dialog-close-button-position\"]"));
		 return cancelbutton;
	 }
	public WebElement getSupporlink() {
		supporlink=browser.driver.findElement(By.xpath("//a[text()=\"Support\"]"));
		return supporlink;
	}
	public WebElement getChangepasswordlink() {
		changepasswordlink=browser.driver.findElement(By.xpath(""
				+ "//a[text()=\"Change Password\"]"));
		return changepasswordlink;
	}
	public WebElement getUpdatepasswordmessage() {
		updatepasswordmessage=browser.driver.findElement(By.xpath
				("//h6[contains(.,'Update Password')]"));
		return updatepasswordmessage;
	}
	public WebElement getSuccessmessage() {
		successmessage =browser.driver.findElement(By.xpath
		("//div[@class=\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]"));
		return successmessage;
	}
	public WebElement getLogoutlink() {
		logoutlink=browser.driver.findElement(By.xpath("//"
				+ "a[text()=\"Logout\"]"));
		return logoutlink;
	}
	 
	// logo functionality
	public void logofunctionality() {
		getLogoimg().click();
	}
	 
	// searchbar functionality
	public void searchbarfunctionality(String search) {
	getSearchbartxt().sendKeys(search);
	}
	// arrow functionality
	public void arrowfunctionality() throws InterruptedException {
		Reporter reporter=new Reporter();
		reporter.generateReport();
		ExtentTest test = Reporter.report.createTest("Arrow Button Functionality");
		
	getContractarrowbutton().click();//*
	if(getContractarrowbutton().getAttribute("class").contains("left"))
	{
		test.log(Status.PASS,"menu is contract, button is moved to left");
	}
	else
	{
		test.log(Status.PASS,"menu is not contract, button is not moved to left");	
	}
	Thread.sleep(1000);
	getContractarrowbutton().click();//*
	if(getContractarrowbutton().getAttribute("class").contains("right"))
	{
		test.log(Status.PASS,"menu is expand, button is moved to right");
	}
	else
	{
		test.log(Status.PASS,"menu is not expand, button is not moved to right");	
	}
	}
	
	// candidateoptionfunctionality
	
	public void aboutFunctionality() {
		
		getCandidateoptiondropdown().click();
		getAboutlink().click();
		//getCancelbutton().click();
		}
	
	// support functionality
	public void supportFunctionality(){
		
		getCandidateoptiondropdown().click();
		getSupporlink().click();
		}

	// change password functionality
	public void changePasswordFunctionality
	(String Currentpassword,String Newpassword ) throws InterruptedException{
		
		getCandidateoptiondropdown().click();
		getChangepasswordlink().click();
		Thread.sleep(5000);
		getCurrentpasswordtxt().sendKeys(Currentpassword);
		getNewpasswordtxt().sendKeys(Newpassword);
		getSavepasswordbutton() .click();
		}

	// logout functionalitty
	public void logOutFunctionality(){
		
		getCandidateoptiondropdown().click();
		getLogoutlink().click();
		}






}
	 

