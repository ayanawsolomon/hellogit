package testNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginLogout {

	WebDriver driver;

	@BeforeSuite
	public void suiteBefore(){
		System.out.println("I am before Suite master from Loginout ");
	}
	@AfterSuite
	public void suiteAfter(){
		System.out.println("I am after Suite master from Loginout");
	}

	
	@BeforeTest
	public void setup(){
		System.out.println("Setup environment and I am running from loginlogout class");
	}
	@AfterTest
	public void clearingSetup(){
		System.out.println("Clear the environment and I am running from loginlogout class");
	}
	
	//BeforeMethod will run before each test method run
	//@BeforeMethod
      @BeforeClass
	public void openUrl(){
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver-v0.17.0-win64\\geckodriver.exe");

	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		    
	    
	    driver.get("http://newtours.demoaut.com/");			
	    Assert.assertTrue(1==2);
    	

      }
	

      @DataProvider
      public Object[][] gettingCorrectData() {
        return new Object[][] {
          new Object[] { "a", "a" },  ///Always use correct credentials
          new Object[] { "b", "b" },  ///Always use correct credentials
          new Object[] { "c", "c" }   ///Always use correct credentials
        };
      }


      

      @DataProvider
      public Object[][] gettingInCorrectData() {
        return new Object[][] {
          new Object[] { "a", "1" },  ///Always use incorrect credentials
          new Object[] { "b", "2" },  ///Always use incorrect credentials
          new Object[] { "c", "3" }   ///Always use incorrect credentials
        };
      }

      
	//BeforeMethod will run after each test method run
	
	//@AfterMethod
      @AfterClass
	public void closingBrowser(){
        driver.quit();
  
	}
	
     
      
	   //this is for correct
		@Test(dataProvider = "gettingCorrectData", priority=0)
  public void loginTest(String user, String pass) {	
		            driver.findElement(By.name("userName")).sendKeys(user);
            driver.findElement(By.name("password")).sendKeys(pass);
            driver.findElement(By.name("login")).click();
        	Assert.assertTrue(false);
            Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
                      
            driver.findElement(By.linkText("SIGN-OFF")).click();
    	}
  

		   //this is for incorrect
			@Test(dataProvider = "gettingInCorrectData", priority=1, enabled=false)
	  public void loginIncorrect(String user, String pass) {	
			            driver.findElement(By.name("userName")).sendKeys(user);
	            driver.findElement(By.name("password")).sendKeys(pass);
	            driver.findElement(By.name("login")).click();
	            //Assert.assertFalse(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());

	           try{
	            	driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	            }catch (Exception ex)
	            {
	            	Assert.assertTrue(1==1);
	            	
	            }
	            
	            
	            //driver.findElement(By.linkText("SIGN-ON")).click();
	    	}
	  
		
		
		/*
		@Test
  public void loginTest2() {	
	            driver.findElement(By.name("userName")).sendKeys("b");
            driver.findElement(By.name("password")).sendKeys("b");
            driver.findElement(By.name("login")).click();
            Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
            
            driver.findElement(By.linkText("SIGN-OFF")).click();
        
		}
  
        //test case
		@Test
  public void loginTest3() {	
	            driver.findElement(By.name("userName")).sendKeys("b");
            driver.findElement(By.name("password")).sendKeys("c");
            
            //assert.assertEquals(arg0, arg1)    
            
            
            driver.findElement(By.name("login")).click();
            Assert.assertTrue(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());
            
            driver.findElement(By.linkText("SIGN-OFF")).click();
    
        
		}
  */
  
}
