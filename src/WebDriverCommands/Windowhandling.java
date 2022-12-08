package WebDriverCommands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);

		driver.findElement(By.id("windowButton")).click();
		Set<String> allwindowhandles = driver.getWindowHandles();

		Iterator iterator = allwindowhandles.iterator();

		String paretnWindow = (String) iterator.next();
		String childwindow = (String) iterator.next();

		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		
		String childwindowtext = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(childwindowtext);

		driver.quit();

	}

}
