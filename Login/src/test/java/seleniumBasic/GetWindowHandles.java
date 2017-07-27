package seleniumBasic;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.17.0-win64\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();

	    //timeout works only if it won't find element
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("http://letef.com/testPage.php");
	    //homepage of letef
	    String homepPageID = driver.getWindowHandle();
	    String yahooPageID = null;
	    
	    
	   // driver.findElement(By.linkText("Open Yahoo page"));
	    
	    System.out.println("ID of the main page"+homepPageID);
	    
	    driver.findElement(By.partialLinkText("Yahoo page")).click();
	   
	    //WebDriverWait wait = new WebDriverWait();
	    Thread.sleep(3000);
	    
	    System.out.println("ID of the main page"+driver.getWindowHandle());
	    
	    Set<String> allID = driver.getWindowHandles();
	    
	    
	    //saving yahooPageID
	    for(String str: allID){
	    	//System.out.println(str);
	    	if(!str.equals(homepPageID)){
	    		 yahooPageID = str;
	    		System.out.println("It is the Yahoo page"+yahooPageID);
	    		break;		
	    	}
	    
	    }
	   //Thread.sleep(3000);
	   driver.switchTo().window(yahooPageID);
	   String yahoo = driver.getWindowHandle();
	    
	    
	   System.out.println("Yahoo ID: "+yahoo);
	   
	   driver.switchTo().window(homepPageID);
	   //driver.switchTo().defaultContent();
	   //System.out.println("main page: "+driver.getTitle());
	   driver.findElement(By.name("name")).clear();
	   driver.findElement(By.name("name")).sendKeys("Raju");
	   
	   //driver.quit();
	   
	   driver.findElement(By.id("alert")).click();
	   String myAlert = driver.switchTo().alert().getText();
	   System.out.println("Alert "+myAlert);
	   driver.switchTo().alert().dismiss();
	   /*try{
	   Assert.assertTrue(myAlert.contains("Raju"));
	   }catch(Exception ex){
		   System.out.println("Alert fail");
	   }
	   */
	   
		   Assert.assertTrue(myAlert.contains("Raju"));
	      IOException e = new IOException();
	      throw e;
	      //More Statements
	    
	  Select sel = new Select(driver

	}

}
