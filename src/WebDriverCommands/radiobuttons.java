package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='yesRadio']//following-sibling::label")).click();
		

	}

}
