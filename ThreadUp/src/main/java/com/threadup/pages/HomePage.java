package com.threadup.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.threadup.commomfunctionality.Browser;
import com.threadup.commomfunctionality.HomePagecomonFunctionality;

public class HomePage {

	//  name variable 
	// private WebElement variable;
	//name  validation 
	//name locator
	// name =Browser.driver.findElement(By.xpath(""));  locator.. get method is non static
	//name functionality ... non static method 
	// public void nameFunctionality()    static method me static method hi call hogi
	//{}
	// dono method static ho ya fir dono hi non static ho
	// precondition ;  test steps   ; post condition or validation
	
	 
	// logo
	private WebElement logo;
	//  logo validation
	//
	public WebElement getLogo() {
		logo=Browser.driver.findElement(By.xpath(""));
		return logo;
	}
	// logo functionality 
		public  void logofunctionality ()
		{ 
			getLogo().click(); // validation url
		}
		
	// search
	private WebElement	searchtxt			;
	private WebElement	searchbutton		;
	private WebElement	cancelbutton			;
	private WebElement	sugession			;
	
	// search validation
	
	// locator
	public WebElement getSearchtxt() {
		searchtxt=Browser.driver.findElement(By.xpath(""));
		return searchtxt;
	}


	public WebElement getSearchbutton() {
		searchbutton=Browser.driver.findElement(By.xpath(""));
		return searchbutton;
	}


	public WebElement getCancelbutton() {
		cancelbutton=Browser.driver.findElement(By.xpath(""));
		return cancelbutton;
	}


	public List<WebElement> getSugession() {
		List<WebElement>sugession=Browser.driver.findElements(By.xpath(""));
		return sugession;
	}

	// searchfunctionality  
		public  void searchfunctionality (String input, String suggestedname)
		{ 
			getSearchtxt().sendKeys(input);
			HomePagecomonFunctionality.sugessionclick(getSugession(), suggestedname);
		}
		
	
		// searchfunctionality 
	public  void searchfunctionality(String input)
				{ 
					getSearchtxt().sendKeys(input);
					getSearchbutton().click();
					// validation
					
				}
	// searchfunctionality 
	public  void searchfunctionality1  (String input)
				{ 
					getSearchtxt().sendKeys(input);
					getCancelbutton().click();
					// validation
				}
		// account section 
	private WebElement	accountsection		;
	
	// account section validatioin
	//
	public WebElement getAccountsection() {
		accountsection=Browser.driver.findElement(By.xpath(""));
		return accountsection;
	}
	// accountfunctionality 
	
		public  void accountfunctionality ()
		{ 
			getAccountsection().click();	
		}
	
	//

	// cart section /
	private WebElement	cartsection			;
	// cart section validation
	//
	
	public WebElement getCartsection() {
		cartsection=Browser.driver.findElement(By.xpath(
				"//div[@class=\"u-flex u-items-center u-justify-center "
		+ "u-bg-alert u-text-white u-text-10 u-absolute TjPz2_l62BvowAfXOTQ6\"]"));
		return cartsection;
	}
	// cart functionality 
		public void cartfunctionality (CharSequence addeditems)
		{ 
		HomePagecomonFunctionality.cartnumber(getCartsection(), addeditems);
			
		}
	// checkout
	private WebElement		checkoutbutton		;
	// checkout  validation
	public  WebElement getCheckoutbutton() {
	checkoutbutton=Browser.driver.findElement(By.xpath(""));
	return checkoutbutton;
}
	// functionality 
		public void checkoutfunctionality ()
		{ 
			getCheckoutbutton().click();
		}
	
	// 
	
	///************************************************* woman section
	
	private WebElement    womansection 	;
	//
	public  WebElement getWomansection() {
	 womansection=Browser.driver.findElement(By.xpath(""));
	return womansection;
}
	private WebElement    dresses 	;
	public WebElement getDresses() {
		dresses=Browser.driver.findElement(By.xpath(""));
		return dresses;
	}
	public WebElement getPetite() {
		dresses=Browser.driver.findElement(By.xpath(""));
		return petite;
	}

	private WebElement    petite 	;
	
	// functionality 
		public  void womansectionfunctionality ()
		{ 
			HomePagecomonFunctionality.moveandclick(getWomansection(), getDresses());
			//Actions action = new Actions(Browser.driver);
			//action.moveToElement(getWomansection()).moveToElement(getPetite()).click().build().perform();
		}
	//********** other section
	
	private WebElement    premiumsection 	;
	// *******************
	private WebElement    designersection 	;
	private WebElement     Sweaters			;
	public WebElement getSweaters() {
		Sweaters=Browser.driver.findElement(By.xpath(""));
		return Sweaters;
	}
	//
	public WebElement getDesignersection() {
	designersection=Browser.driver.findElement(By.xpath(""));
	return designersection;
}
	//  functionality 
		public  void designersectionfunctionality ()
		{ 
			Actions action = new Actions(Browser.driver);
			action.moveToElement(getDesignersection()).moveToElement(getSweaters()).click().build().perform();//.moveToElement(getPetite()).click().build().perform();
		}
	
	private WebElement    shoessection 	;
	
	private WebElement    handbagsection 	;
	
	private WebElement    accessoriessection 	;
	
	private WebElement    plussection 	;
	
	private WebElement    maternitysection 	;
	
	private WebElement    kidssection 	;
	
	private WebElement    dealsection 	;
	
	private WebElement    shopbyoutfitsection 	;
	
	private WebElement    shopbybrandbutton 	;
	
	//*************************************************************
	
	
	// discount
	private WebElement    discount	;
	// discount validation
	//
	public WebElement getDiscount() {
		discount=Browser.driver.findElement(By.xpath(""));
		return discount;
	}
	// functionality 
			public  void discountfunctionality ()
			{ 
				getDiscount().click();
			}
			//**************
	private WebElement   newarrival 	;
	//newarrival validation
	//
	public WebElement getNewarrival() {
		newarrival=Browser.driver.findElement(By.xpath(""));
		return newarrival;
	}
//  functionality 
		public  void newarrivalfunctionality ()
		{ 
			getNewarrival().click();
			}
	//
	
	private WebElement    popularfind	;
	//popularfind validation
	//
	public  WebElement getPopularfind() {
		popularfind=Browser.driver.findElement(By.xpath(""));
		return popularfind;
	}
//  functionality 
		public  void popularfindsfunctionality ()
		{ 
			getPopularfind().click();
		}
	private WebElement    downloadapp 	;
	
	//downloadapp validation
	//
	public WebElement getDownloadapp() {
		 downloadapp	=Browser.driver.findElement(By.xpath(""));
		return downloadapp;
	}
	//functionality 
			public  void downloadappfunctionality ()
			{ 
				getDownloadapp().click();
			}


	


	


	
	
	///********************************** locators ************************
	
	


	


	

	


	public WebElement getPremiumsection() {
		premiumsection=Browser.driver.findElement(By.xpath(""));
		return premiumsection;
	}


	

	public WebElement getShoessection() {
		shoessection=Browser.driver.findElement(By.xpath(""));
		return shoessection;
	}


	public WebElement getHandbagsection() {
		handbagsection=Browser.driver.findElement(By.xpath(""));
		return handbagsection;
	}


	public WebElement getAccessoriessection() {
		accessoriessection=Browser.driver.findElement(By.xpath(""));
		return accessoriessection;
	}


	public WebElement getPlussection() {
		plussection=Browser.driver.findElement(By.xpath(""));
		return plussection;
	}


	public WebElement getMaternitysection() {
		maternitysection=Browser.driver.findElement(By.xpath(""));
		return maternitysection;
	}


	public WebElement getKidssection() {
		kidssection=Browser.driver.findElement(By.xpath(""));
		return kidssection;
	}


	public WebElement getDealsection() {
		dealsection=Browser.driver.findElement(By.xpath(""));
		return dealsection;
	}


	public WebElement getShopbyoutfitsection() {
		shopbyoutfitsection=Browser.driver.findElement(By.xpath(""));
		return shopbyoutfitsection;
	}


	public WebElement getShopbybrandbutton() {
		shopbybrandbutton=Browser.driver.findElement(By.xpath(""));
		return shopbybrandbutton;
	}


	
	
	
	//****************** functionality***************************
	
	
	
	
	
	
	
	
	
	// logo functionality 
	public static void premiumsectionfunctionality ()
	{ 
		
	}
	
	
	// logo functionality 
	public static void sectionfunctionality ()
	{ 
		
	}
	
	// logo functionality 
	public static void shoessectionfunctionality ()
	{ 
		
	}
	
	// logo functionality 
	public static void accessoriessectionfunctionality ()
	{ 
		
	}
	
	// logo functionality 
	public static void plussectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void maternitysectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void kidssectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void dealsectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void handbagssectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void shopbyoutfitsectionfunctionality ()
	{ 
		
	}
	// logo functionality 
	public static void shopbybrandfunctionality ()
	{ 
		
	}
	
}
