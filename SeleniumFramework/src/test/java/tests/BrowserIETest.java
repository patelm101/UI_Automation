package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserIETest {

		WebDriver driver;

		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Starting Test On IE Browser");
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\IEDriverServer.exe");
		}

		@AfterMethod
		public void afterMethod() {
			driver.close();
			System.out.println("Finished Test On IE Browser");
		}

		@Test
		public void firstTest() {
			String baseUrl = "https://www.toolsqa.com/";
			System.out.println("Launching IE browser");
			driver = new InternetExplorerDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			String testTitle = "Tools QA";
			String originalTitle = driver.getTitle();
			// verify the title
			Assert.assertEquals(originalTitle, testTitle);
		}
	
}
