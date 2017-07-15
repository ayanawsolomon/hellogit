package BDDGroupIID.BDDArtifactID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Drivers {
	// singlton method to instantiate the driver just one time only
    private static boolean initialized = false;
    private static WebDriver driver;

    @Before
    public void initialize(){
        if (!initialized){
            initialized = true;
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("http://newtours.demoaut.com/mercuryregister.php");
    		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try
    		
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }   
}