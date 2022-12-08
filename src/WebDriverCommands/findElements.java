package WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		int linkscount = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links in this page " + linkscount);
		
		
		for(int i=0;i<linkscount;i++) {
			System.out.println(links.get(i).getText());
		}
		
		

	}

}
