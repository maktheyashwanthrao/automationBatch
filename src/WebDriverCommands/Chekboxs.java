package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chekboxs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\OnlineClasses\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//form[@id='checkboxes']//input")).click();
		driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]")).click();
		
		
		WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input"));
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		System.out.println(checkbox1.isSelected());
		

	}

}
