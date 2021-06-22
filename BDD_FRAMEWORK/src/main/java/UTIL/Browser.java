package UTIL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Browser {

	 static WebDriver driver;
	@Before
	public static WebDriver LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "Drove\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	return driver;
		
	}
	@After public void cleanUp(){ 
	      driver.close(); 
	   } 		
}
