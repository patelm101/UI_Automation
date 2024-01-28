package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	
	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://hgtv.com/sweepstakes/hgtv-dream-home/sweepstakes");
		
		// Find the email input field and enter an email
		
		WebElement emailInput = driver.findElement(By.cssSelector("#xReturningUserEmail"));
		
		// Replace "email" with the actual ID of the email input field
		//emailInput.sendKeys("patelm2002@gmail.com");
		// Find the submit button and click it
		//WebElement submitButton = driver.findElement(By.id("xCheckUser"));
		// Replace "submit" with the actual ID of the submit button
		//submitButton.click();

		driver.quit();
	}
}
