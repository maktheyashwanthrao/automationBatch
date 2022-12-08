package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirmButton")).click();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message is  " + alertMessage);
		Thread.sleep(3000);		
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//
		//driver.switchTo().alert().
		
		
//driver.quit();


	}

}
