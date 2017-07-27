/**
 * 
 */
package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Raju
 *
 *
 *
 *This class will store all the locator and methods of LoginPageY
 *Locator
 */
public class LoginPage {

WebDriver driver = null;
	
By username = By.id("user_login");
By password = By.xpath(".//*[@id='user_pass']");
By loginButton = By.name("wp-submit");


public LoginPage(WebDriver driver)
{
  this.driver = driver;
}


public void typeUserName()
{
 driver.findElement(username).sendKeys("admin");
}

public void typePassword()
{
	driver.findElement(password).sendKeys("demo123");
}

public void clickOnLoginButton()
{
	driver.findElement(loginButton).click();
}

} //class
