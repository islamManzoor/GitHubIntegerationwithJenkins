package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNGAntJenkins {
	@Test
	public void Navigate() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/");

		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("islam");
		
		search.sendKeys(Keys.ENTER);
		
		System.out.println("Webhook Verification");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
