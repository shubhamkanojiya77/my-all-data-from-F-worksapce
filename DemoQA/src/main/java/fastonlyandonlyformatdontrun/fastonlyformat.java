package fastonlyandonlyformatdontrun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fastonlyformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\java eclipse"
				+ "\\OrangeHrms\\src\\main\\resources\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     List<WebElement> columnlist = driver.findElements(By.xpath(""));
	     
	     List<WebElement> rowlist = driver.findElements(By.xpath(""));
	     
	     WebElement eachcell =driver.findElement(By.xpath(""));
	     
	     for( int r=1;r<rowlist.size();r++)
	     {
	    	 for (int c=1;c<columnlist.size();c++)
	    	 {
	    		 WebElement eachcell1 =driver.findElement(By.xpath("tr["+r+"]/th ["+c+"]"));
	    		 if(eachcell1.getText().equals("record"))
	    		 {
	    			System.out.println("row no.:" +r); 
	    			System.out.println("column no.:" +c); 
	    			System.out.println(+r +""+ c); 
	    		 }
	    		 //or   delete that row 
	    		 if(eachcell1.getText().contains("hello"))
	    		 {
	    			 List<WebElement> deletebutton = driver.findElements(By.xpath(""));
	    			 for (int i=0;i<= deletebutton.size(); i++)
	    			 {
	    				 WebElement deletebutton1 = driver.findElement(By.xpath("["+i+"]"));
	    				 deletebutton1.click() ;
	    			 }
	    		 }
	     
	    	 }break;
	     }
	     
	
	//**********************************************************************

	String  firsttab = driver.getWindowHandle();    
	Set<String>firstandsecondtab= driver.getWindowHandles();
	 
	//1) iterator
	
	Iterator<String> bothtabID= firstandsecondtab.iterator();
		while  (bothtabID.hasNext())
			{
		
		String secondtab = bothtabID.next();
		if(!secondtab.contentEquals(firsttab));
		{
			driver.switchTo().window(secondtab);
		}
			
		
			}
	
		//2)
		 List<String> firstandsecondtabID = new ArrayList(firstandsecondtab);
		 
		String firsttab1= firstandsecondtabID.get(0);
		String secondtab= firstandsecondtabID.get(1);
		
		// 3)
		
		for (int k=1;k<+2;k++)
		{
			firstandsecondtabID.get(k).equalsIgnoreCase(firsttab);
		System.out.println();	
			
		}


	}

}




