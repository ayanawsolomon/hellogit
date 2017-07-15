package SeleniumBasicGroupID.SeleniumBasicArtifactID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SeleniumAssertByTitle {

	public static void main(String[] args) {
		// Selenium getTitle() command and assertion 
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
 
		driver.get("http://newtours.demoaut.com/"); // opening a website
		String title = driver.getTitle();
		if(title.contains("Welcome Mercury Tours")){
			System.out.println("I am in the right page");
		}else{
			System.out.println("I am in the wrong page");
		}
 // special way of assertion 
		Assert.assertTrue(title.contains("Welcome: cccc Mercury Tours"));

		System.out.println(title);
		
		

	}

}
