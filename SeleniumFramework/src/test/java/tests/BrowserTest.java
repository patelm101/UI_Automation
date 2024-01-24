package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args){
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Documents\\Myworkspace\\UI_Automation\\SeleniumFramework\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev");
	}

}