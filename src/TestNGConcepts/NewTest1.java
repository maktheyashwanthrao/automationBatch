package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("I am the actual test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am the beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am the after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am the beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am the AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am the BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am the AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am the BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am the AfterSuite");
  }

}
