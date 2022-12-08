package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("cars"));
		
		Select s = new Select(element);
		
		
		s.selectByVisibleText("Opel");
		
		Thread.sleep(3000);
		s.selectByValue("audi");
		
		Thread.sleep(3000);
		s.selectByIndex(2);
		

		
		driver.quit();
	}

}
