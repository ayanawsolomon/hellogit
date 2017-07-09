/**
 * 
 */
package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

/**
 * @author Raju
 *
 */          
public class VerifyWordPressLogin {

	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Solomon\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLoginButton();
		driver.quit();
		
	}
	
}
