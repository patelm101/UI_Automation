package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	WebDriver driver;
	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	    @Test
	    public  void test(){
	        driver.get("https://demoqa.com/");
	    }
	  

}
