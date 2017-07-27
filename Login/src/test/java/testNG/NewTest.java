package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  */
	
	CalCulator aCal = new CalCulator();
	
	

	@BeforeSuite
	public void suiteBefore(){
		System.out.println("I am before Suite master from NewTest ");
	}
	@AfterSuite
	public void suiteAfter(){
		System.out.println("I am after Suite master from NewTest");
	}
	
	@BeforeTest
	public void setup(){
		System.out.println("Setup environment and I am running from NewTest class");
	}
	@AfterTest
	public void clearingSetup(){
		System.out.println("Clear the environment and I am running from NewTest class");
	}
	
	
	@BeforeClass
	public void open(){
		System.out.println("I am before class from NewTest class");
      }


	@AfterClass
	public void close(){
		System.out.println("I am after class from NewTest class");
      }

@Test
public void add(){
	int result=aCal.add(6, 7);
	Assert.assertEquals(result, 13);
	System.out.println("This is addition");
}


@Test
public void sub(){
	int result=aCal.subtract(6, 7);
	Assert.assertEquals(result, -1);
	System.out.println("This is subtraction");
}

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
