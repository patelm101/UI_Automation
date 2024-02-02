package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserFFTest {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On FF Browser");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\geckodriver.exe");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Finished Test On FF Browser");
	}

	@Test
	public void firstTest() {
		String baseUrl = "https://www.toolsqa.com/";
		System.out.println("Launching FF browser");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	    capabilities.setCapability("marionette",true); 
		driver = new FirefoxDriver(capabilities);  
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String testTitle = "Tools QA";
		String originalTitle = driver.getTitle();
		// verify the title
		Assert.assertEquals(originalTitle, testTitle);
	}
	
}
