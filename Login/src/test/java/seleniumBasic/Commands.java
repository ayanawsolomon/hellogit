package seleniumBasic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.17.0-win64\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();

	    //First time if it doesn't find the element, then wait for this time and try it agaon for second.
	    //It doesn't find it again, then it will throw error message
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    driver.get("http://newtours.demoaut.com/");
	    String title = driver.getTitle();
	    System.out.println("Title of the page: "+title);
	    
	     if( title.contains("Welcome")) {
	    	 System.out.println("Pass"); 
	     }else{
	    	 System.out.println("Fail");
	     }
	    	 
	    String idhome = driver.getWindowHandle();
	    System.out.println("Windows id: ="+ idhome);
        
	    
	    
	    //driver.findElement(By.linkText("SIGN-ON")).click();
	    

		


//List<Foo> foos = ...;
//for (Foo foo : foos)
//{
    //foo.bar();
//}
	    
	    //homepage link
	    List<WebElement> homePageLink = driver.findElements(By.tagName("a"));
	    
	    
	    for(WebElement ele : homePageLink){
	    	//System.out.println(ele.getText()+"----");
	    	//ele.click();
	        //
	    	//driver.findElement(By.linkText(ele.getText())).click();
	         
	   
	    	
	        Thread.sleep(2000);
	    }
	   
	    driver.get("http://letef.com/testPage.php");
	    //homepage of letef
	    String homepPage = driver.getWindowHandle();
	    
	   // driver.findElement(By.linkText("Open Yahoo page"));
	    
	    driver.findElement(By.partialLinkText("Open Yahoo page"));
	    
	    
	    
	    Set<String> allWindowID = driver.getWindowHandles();
	    for(String str: allWindowID){
	    	
	    }
	   
	    driver.close();
	    
	}

}
