package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class Form_Page {

	WebDriver driver;
	public Form_Page() {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@name=\"firstname\"]")
	WebElement NAME_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@name=\"lastname\"]")
	WebElement LASTNAME_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@value=\"Male\"]")
	WebElement RADIO_BUTTON_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@value=\"7\"]")
	WebElement EXPERIENCE_LOCATOR;
	@FindBy(how=How.XPATH,using="//tr[5]/td[2]/input[@type=\"text\"]")
	WebElement DATE_LOCATOR;
	@FindBy(how=How.XPATH,using="//span/input[@value=\"Automation Tester\"]")
			WebElement TESTER_LOCATOR;
	@FindBy(how=How.XPATH,using="//span/input[@value=\"Selenium Webdriver\"]")
	WebElement TOOL_LOCATOR;
	@FindBy(how=How.XPATH,using="//select[@name=\"continents\"]")
	WebElement CONTINENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//select[@name=\"selenium_commands\"]")
	WebElement COMMANDS_LOCATOR;
	@FindBy(how=How.XPATH,using="//button[@name=\"submit\"]")
	WebElement SUBMIT_BUTTON_LOCATOR;
	public void name_button(String firstname) {
		NAME_LOCATOR.sendKeys(firstname);
	}
	public void Last_name(String lastname) {
		LASTNAME_LOCATOR.sendKeys(lastname);
	}
	public void radioButton() {
		RADIO_BUTTON_LOCATOR.click();
	}
	public void experienceButton() {
		EXPERIENCE_LOCATOR.click();
	}
	public void Date_Method(String date) {
		DATE_LOCATOR.sendKeys(date);
	}
	public void profession() {
		TESTER_LOCATOR.click();
	}
	public void toolmethod() {
		TOOL_LOCATOR.click();
	}
	public void continentsmethod() {
		Select sel=new Select(CONTINENT_LOCATOR);
		sel.selectByVisibleText("Europe");
	}
	public void commandsmethod() {
		Select select=new Select(COMMANDS_LOCATOR);
		select.selectByVisibleText("WebElement Commands");
	}
	public void lastlysubmit() {
	//	SUBMIT_BUTTON_LOCATOR.click();	
	}
	
		
	}

