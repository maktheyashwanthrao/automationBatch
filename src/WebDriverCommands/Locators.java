package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(3000);
		
		driver.findElement(By.id("input-username")).sendKeys("Admin");
		
		driver.findElement(By.id("input-username")).sendKeys("rao");
		
		
		
		
		driver.findElement(By.name("username")).sendKeys("Rao");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Rao");
		
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Text@gmail.com");
		
		
		driver.findElement(By.linkText("OpenCart Marketplace")).click();
		driver.findElement(By.partialLinkText("OpenCart")).click();
		
		

	}

}
