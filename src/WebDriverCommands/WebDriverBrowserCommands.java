package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		String pageTitle = driver.getTitle();
		System.out.println("Page title is "+ pageTitle);
		
		String pagecurrentURL = driver.getCurrentUrl();
		System.out.println("Page current URL is "+ pagecurrentURL);
		
		String pagesource =driver.getPageSource();
		System.out.println("Page current URL is "+ pagesource);
		
		
		driver.quit();

	}

}
