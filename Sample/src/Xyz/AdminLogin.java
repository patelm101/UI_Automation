package Xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {
	
public static void main(String[] args){	
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com");
driver.findElement(By.name("Passwd")).sendKeys("test");
}
}
