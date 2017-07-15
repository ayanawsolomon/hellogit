package seleniumAdvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotToDownlaodAFile {

	public static void main(String[] args) throws AWTException {
		// This program is to download a file with the help of Robot Java class
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\solomon\\workspace\\MyDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		// write the code to type http://newtours.demoaut.com/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/test/testPage2.php");
		driver.findElement(By.partialLinkText("click to download")).click();
		Robot robot = new Robot();
		robot.delay(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(400);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
