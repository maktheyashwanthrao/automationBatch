package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;

	@Test(enabled=false)
	public void testcase1() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

		String alerttext = driver.switchTo().alert().getText();
		System.out.println("alert message is " + alerttext);
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		

	}

	@Test(priority=4)
	public void testcase2() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

		String alerttext = driver.switchTo().alert().getText();
		System.out.println("alert message is " + alerttext);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		

	}
	
	@Test(priority=2)
	public void testcase() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

		String alerttext = driver.switchTo().alert().getText();
		System.out.println("alert message is " + alerttext);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		

	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
