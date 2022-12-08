package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		
		String alerttext = driver.switchTo().alert().getText();
		System.out.println("alert message is " + alerttext);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		action.contextClick(rightclick).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
