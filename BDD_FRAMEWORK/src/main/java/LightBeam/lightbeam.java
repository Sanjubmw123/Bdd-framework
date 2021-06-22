package LightBeam;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lightbeam {
  WebDriver driver;
 // @Test
 public void   init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://lightbeamhealth.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		WebElement web= driver.findElement(By.xpath("//*[@id='menu-item-657']/a/span[1]"));
		  String Expected=web.getText();
		  String Actual="WHY LIGHTBEAM >";
		  Assert.assertEquals(Expected, Actual);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/span")).click();
		
     //   Actions action=new Actions(driver);
     //  action.moveToElement(web).build().perform();
        Select select=new Select(web);
        select.selectByVisibleText("Industry Leading");
        

      // driver.findElement(By.xpath("//*[@id='menu-item-657']/a/span[1]"));

     

		
		//driver.findElement(By.xpath("//*[@id='menu-item-657']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-118\"]/a/span")).click();

		

		 
		
		  String actualString =
		  driver.findElement(By.xpath("//*[text()='info@lightbeamhealth.com']")).
		  getText();
		  
		  String expectedString = "info@lightbeamhealth.com";
		  
		  assertTrue(actualString.contains(expectedString));
		  
		  
		  driver.close(); driver.quit();
		 
}
}