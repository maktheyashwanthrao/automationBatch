package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		System.out.println("Page title is "+ driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.navigate().to("https://www.google.com/");
		System.out.println("Page title is "+ driver.getTitle());
		Thread.sleep(3000);

		driver.navigate().back();
		System.out.println("Page title is "+ driver.getTitle());
		Thread.sleep(3000);

		driver.navigate().forward();
		System.out.println("Page title is "+ driver.getTitle());
		
		driver.quit();

	}

}
