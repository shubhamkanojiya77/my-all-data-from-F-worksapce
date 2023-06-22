package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("i am tc1");
  }
  
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am precondition");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am tc post condition");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am for only class before");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("i am only class after ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am before test");
  }

  @AfterTest
  public void afterTest() {System.out.println("i am tc");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am after suite");
  }

}
