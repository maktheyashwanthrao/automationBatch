package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		WebElement products = driver.findElement(By.xpath("//*[@id=\"menu-item-27\"]/div/a"));
		WebElement testcasestudio = driver.findElement(By.xpath("//li[@id='menu-item-2280']/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(products).build().perform();
		driver.findElement(By.xpath("//li[@id='menu-item-2280']/a")).click();
		

	}

}
