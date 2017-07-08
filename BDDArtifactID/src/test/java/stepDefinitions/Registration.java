package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	WebDriver driver;
	@Given("^your are in registraion page \"(.*?)\"$")
	public void your_are_in_registraion_page(String url) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
				
	}

	@Given("^Add correct data to registration form$")
	public void add_correct_data_to_registration_form(DataTable credencials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		//List<List<String>> data = credencials.raw();
		//driver.findElement(By.name("lastName")).sendKeys(data.get(0).get(1));

		List<Map<String, String>> data = credencials.asMaps(String.class, String.class);
		driver.findElement(By.name("firstName")).sendKeys(data.get(0).get("firstName"));
		driver.findElement(By.name("lastName")).sendKeys(data.get(0).get("lastName"));
		driver.findElement(By.name("phone")).sendKeys(data.get(0).get("phone"));
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.name("address1")).sendKeys(data.get(0).get("address"));
		driver.findElement(By.name("city")).sendKeys(data.get(0).get("city"));
		driver.findElement(By.name("state")).sendKeys(data.get(0).get("state"));
		driver.findElement(By.name("postalCode")).sendKeys(data.get(0).get("postalCode"));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("userName"));
		
	   // throw new PendingException();
	}

	@When("^I insert password \"(.*?)\" and confirm password  \"(.*?)\"$")
	public void i_insert_password_and_confirm_password(String pass, String confirm) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirm);
	    //throw new PendingException();
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
		driver.findElement(By.name("register")).click();
		// throw new PendingException();
	}

	@Then("^\"(.*?)\" page should be seen$")
	public void page_should_be_seen(String url) throws Throwable {
		try{
			Assert.assertTrue(driver.getCurrentUrl().contains(url));
		}catch(Exception e){
			driver.quit();

			//Assert.fail();
		}
		
	    
	   // throw new PendingException();
	}



}
