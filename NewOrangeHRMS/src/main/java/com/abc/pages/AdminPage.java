package com.abc.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browser;

public class AdminPage extends HomePage {

	public AdminPage(String username, String password) throws InterruptedException
	{
	 super(username, password);		// classobject.method();.. ye khatam ho gaya in child 
	 getAdminlink().click();
	 Thread.sleep(2000);	}
	
	public AdminPage()
	{
		
	}
	
	// AdminPage adminpage = new AdminPage("Admin", "admin123")
		// variables ADD USER FUNCTIONALITY
		private WebElement  addbutton ;   	
	 	
	 	private WebElement userroledropdown;
	 	private WebElement essopt ;			
	 	
	 	private WebElement adminopt;	
		
	 	private WebElement  statusdropdown	;	
	
	 	private WebElement disabledopt	;	
	 	
	 	private WebElement  enabledopt	;	
	 	private WebElement employeenametxt	;
	 	private WebElement hintlist;		
	
	 	private WebElement usernametxt; 	

	 	private WebElement passwordtxt;
	 //Your password must contain a lower-case letter, 
	//an upper-case letter, a digit and a special character.
	//Try a different password… 8 CHARACTER
	 	private WebElement confirmpasswordtxt;	
	 	private WebElement	cancelbutton ;	
	 	private WebElement savebutton 	;
	 	private WebElement useraddedmessage ; 
	
			
		
	// locators ADD USER FUNCTIONALITY
	public WebElement getAddbutton() {
		addbutton =browser.driver.findElement(By.xpath("//button[@class=\"oxd-button"
				+ " oxd-button--medium oxd-button--secondary\"]"));
		return addbutton;// url change
	}
	public WebElement getUserroledropdown() {
		userroledropdown  =browser.driver.findElement(By.xpath("//div[@class"
				+ "=\"oxd-grid-2 orangehrm-full-width-grid\"]"
				+ "/child::div[1]/div/div[2]/div/div/div[1]"));
		
		return userroledropdown;
	}
	public WebElement getEssopt() {
		essopt =browser.driver.findElement(By.xpath("//span[text()=\"ESS\"]"));
		return essopt;  	// dynamic
	}
	public WebElement getAdminopt() {
		adminopt =browser.driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));//after selecting got this locat 
		return adminopt; 	 // dynamic
	}//span[contains(text(),"Admin")]... by evenlistner stopping
	public WebElement getStatusdropdown() {
		statusdropdown =browser.driver.findElement(By.xpath("//label[text()"
				+ "=\"Status\"]/following::div[4]"));
		return statusdropdown;
	}
	public WebElement getDisabledopt() {
		disabledopt =browser.driver.findElement(By.xpath("//span[contains(text(),'Disabled')]"));
		return disabledopt;		// dynamic
	}
	public WebElement getEnabledopt() {
		enabledopt =browser.driver.findElement(By.xpath("//span[text()=\"Enabled\"]"));
		// you get same locator after selecting too
		return enabledopt;		// dynamic
	}
	public WebElement getEmployeenametxt() {
		employeenametxt =browser.driver.findElement(By.xpath("//input["
				+ "@placeholder='Type for hints...']	"));
		return employeenametxt;
	}
	public WebElement getHintlist() {
		hintlist =browser.driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-option\"]"));
		return hintlist;// wait karna hoga... is par click karna hoga
	}
	public WebElement getUsernametxt() {
		usernametxt =browser.driver.findElement(By.xpath("(//input[@class='oxd-input "
				+ "oxd-input--active'])[2]"));
		return usernametxt;
	}
	public WebElement getPasswordtxt() {
		passwordtxt =browser.driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		return passwordtxt;
	}
	public WebElement getConfirmpasswordtxt() {
		confirmpasswordtxt =browser.driver.findElement(By.xpath("(//"
				+ "input[@type='password'])[2]"));
		return confirmpasswordtxt;
	}
	public WebElement getCancelbutton() {
		cancelbutton =browser.driver.findElement(By.xpath("(//button"
				+ "[normalize-space()='Cancel'])[1]")); 
		return cancelbutton;
	}
	public WebElement getSavebutton() {
		savebutton =browser.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		return savebutton;
	}	
	public WebElement getUseraddedmessage() {
		useraddedmessage=browser.driver.findElement(By.xpath
		("//div[@class=\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]"));
		return useraddedmessage;
	}
	
	// add new Amin or ESS User FUNCTIONALITY
	public void adduserfunctionality(String Employeename ,String Username,
			String Password,String Confirmpassword) throws InterruptedException{
		getAddbutton().click();
		Thread.sleep(2000);
		getUserroledropdown().click();// choose any one
		getEssopt().click();//ESS
		//getAdminopt().click();
		getStatusdropdown().click();// choose any one
		//getDisabledopt().click();
	    getEnabledopt().click();//ENABLED
	    getEmployeenametxt().sendKeys(Employeename);//Paul Collings
	    Thread.sleep(2000);
	    getHintlist().click();
	    getUsernametxt().sendKeys(Username);//Admin
	    getPasswordtxt().sendKeys(Password);//admin123
	    getConfirmpasswordtxt().sendKeys(Confirmpassword);
	   // getCancelbutton().click();// no
	    getSavebutton().click();
	    
	}
	
	//--------------------------------------------------------------------------//
	    
	     // VARIABLES SEARCH USER FUNCTIONALITY
	
		private WebElement searchdropdown ;	//i[@class='oxd-icon bi-caret-up-fill']
		private WebElement usernametxt1	;	
		private WebElement userroledropdown1;		
		private WebElement adminopt1;		
		private WebElement essopt1;		//div[@class='oxd-select-text-input'][normalize-space()='ESS']
		private WebElement employeenametxt1;		
		private WebElement hintoption	;	
		private WebElement statusdropdown1;		
		private WebElement enableddopt;			
		
		private WebElement diableddopt;		
		
		private WebElement searchbutton	;	
		private WebElement resetbutton;		
		private WebElement deleteprofilebutton;		//i[@class="oxd-icon bi-trash"]
		private WebElement editprofilebutton;		//i[@class='oxd-icon bi-pencil-fill']
		private java.util.List<WebElement> fatcheduserdetails;
		
		
		
		// Loactors SEARCH USER FUNCTIONALITY
		
		
		
		
		
		public WebElement getSearchdropdown() {
			searchdropdown = browser.driver.findElement(By.xpath("//i[@class"
					+ "='oxd-icon bi-caret-up-fill']"));
			return searchdropdown;
		}
		public WebElement getUsernametxt1() {
			usernametxt1 = browser.driver.findElement(By.xpath("(//input"
					+ "[@class='oxd-input oxd-input--active'])[2]"));
			return usernametxt1;
		}
		public WebElement getUserroledropdown1() {
			userroledropdown1= browser.driver.findElement(By.xpath("//label[text()=\"User Role\"]//following::div[4]"));
			return userroledropdown1;
		}
		public WebElement getAdminopt1() {
			adminopt1= browser.driver.findElement(By.xpath("(//div"
					+ "[@class='oxd-select-text-input'][normalize-"
					+ "space()='Admin'])[1]"));
			return adminopt1;
		}
		public WebElement getEssopt1() {
			essopt1 = browser.driver.findElement(By.xpath("//span[text()=\"ESS\"]"));
			return essopt1;
		}
		public WebElement getEmployeenametxt1() {
			employeenametxt1 = browser.driver.findElement(By.xpath("//input"
					+ "[@placeholder='Type for hints...']"));
			return employeenametxt1;
		}
		public WebElement getHintoption() {
			hintoption = browser.driver.findElement(By.xpath(
					"//div[@class='oxd-autocomplete-option']"));
			return hintoption;
		}
		public WebElement getStatusdropdown1() {
			statusdropdown1 = browser.driver.findElement(By.xpath("//"
					+ "label[text()=\"Status\"]/following::div[4]"));
			return statusdropdown1;
		}
		public WebElement getEnableddopt() {
			enableddopt = browser.driver.findElement(By.xpath("//div[@role=\"listbox\"]//child::div[2]"));
			return enableddopt;
		}
		public WebElement getDiableddopt() {
			diableddopt = browser.driver.findElement(By.xpath("//div"
					+ "[@class='oxd-select-text-input']"
					+ "[normalize-space()='Disabled']"));
			return diableddopt;
		}
		public WebElement getSearchbutton() {
			searchbutton = browser.driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
			return searchbutton;
		}
		public WebElement getResetbutton() {
			resetbutton = browser.driver.findElement(By.xpath("//"
					+ "button[normalize-space()='Reset']"));
			return resetbutton;
		}
		public WebElement getDeleteprofilebutton() {
			deleteprofilebutton = browser.driver.findElement(By.xpath
					("//i[@class=\"oxd-icon bi-trash\"]"));
			return deleteprofilebutton;
		}
		public WebElement getEditprofilebutton() {
			editprofilebutton= browser.driver.findElement(By.xpath
					("//i[@class='oxd-icon bi-pencil-fill']"));
			return editprofilebutton;
		}
		public java.util.List<WebElement> getfatcheduserdetails() {
			fatcheduserdetails= browser.driver.findElements(By.xpath("//div[@class=\"oxd-table-body\"]"));
			return fatcheduserdetails;
		}//div[@class=\"data\"]
		  
		// USER SEARCH FUNCTIONALITY
		public void usersearchfunctionality(String Usernametxt,String Employeename) throws InterruptedException {
			
			//getSearchdropdown().click();
			getUsernametxt1().sendKeys(Usernametxt);
			
			getUserroledropdown1().click();
			Thread.sleep(2000);
			//getAdminopt1().click();
			getEssopt1().click();
			getEmployeenametxt1().sendKeys(Employeename);
			Thread.sleep(2000);
			getHintoption().click();
			getStatusdropdown1().click();
			Thread.sleep(1000);
			getEnableddopt().click();
			//getDiableddopt().click();
			getSearchbutton().click();
			//getResetbutton().click();
		}
		// User EDIT FUNCTIONALITY
			public void deleteProfileFunctionality() {
			getDeleteprofilebutton().click();
			}
		// DELETE FUNCTIONALITY
			public void editprofilefunctionality() {
			getEditprofilebutton().click();
		
		}    
	    
		}   
	    
	    
	    
	    





	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

