package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogout {
	WebDriver driver;
	// write the code to type http://newtours.demoaut.com/
	
	
	@Given("^I am in new tours website \"(.*?)\"$")
	public void i_am_in_new_tours_website(String URL) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
	    // Write code here that turns the phrase above into concrete actions
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);

		//throw new PendingException(); /sdfdsf /sdf ds
	}
	@When("^I insert user name =\"(.*?)\" and password =\"(.*?)\"$")
	public void i_insert_user_name_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("userName")) .sendKeys(arg1); 
	   driver.findElement(By.name("password")) .sendKeys(arg2);
		//throw new PendingException();
	}
	@When("^press \"(.*?)\" button$")
	public void press_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.name(arg1)).click();
	}

	@Then("^\"(.*?)\" link should be displayed$")
	public void link_should_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
