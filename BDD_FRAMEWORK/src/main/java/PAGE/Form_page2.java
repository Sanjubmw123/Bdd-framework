package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import UTIL.basepage;





public class Form_page2 {
	WebDriver driver;
	public Form_page2(WebDriver driver) {
		this.driver=driver;
	}
	//creating locator repository
	@FindBy (how=How.XPATH,using="//input[@name='firstname']")
	WebElement FirstNAme_TEXT;
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	WebElement LastNAme_TEXT;
//	@FindBy(how=How.XPATH,using="//input[@value=\"Female\"]")
//	WebElement RADIO_BUTTON_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@value=\"7\"]")
	WebElement EXPERIENCE_LOCATOR;


	@FindBy(how=How.XPATH,using="//tr[5]/td/input[@type='text']")
	WebElement Date;
	@FindBy(how=How.XPATH,using="//input[@value='Automation Tester']")
	WebElement Automation_checkbox ;
	@FindBy(how=How.XPATH,using="//span/input[@value='Selenium IDE']")
	WebElement Selenium_CheckBox;
	@FindBy(how=How.XPATH,using="//select[@name='continents']")
	WebElement DropDown;
	@FindBy(how=How.XPATH,using="//button[@name='submit']")
	WebElement Submit_button;

public void first_name(String firstname) {
		
		FirstNAme_TEXT.sendKeys(firstname+basepage.randomNumGenerator1());
	}
    public void last_name(String lastname) {
    	LastNAme_TEXT.sendKeys(lastname);
	}
//    public void radioButton() {
//		RADIO_BUTTON_LOCATOR.click();
//	}
    public void experienceButton() {
    	
    	EXPERIENCE_LOCATOR.click();
    }
   
   
   public void date(String date) {
		
	   Date.sendKeys(date);
	}
   public void radio_automation_button() {
	   Automation_checkbox.click();
	}
   public void radio_selenium_button() {
	   Selenium_CheckBox.click();
	}
   public void Dropdown() {
	   Select sel=new Select( DropDown);
	   sel.selectByVisibleText("Europe");
	   DropDown.click();
  	}
   public void Submit_button() {
	 //  Submit_button.click();
	}



	
}
