package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PAGE.Form_page2;
import UTIL.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def {
	WebDriver driver;
	Browser browser;
	//Form_Page page;
	Form_page2 page;
		
		 
	@Given("^I should be able to login on tutorial site as a valid user$")
	public void i_should_be_able_to_login_on_tutorial_site_as_a_valid_user() throws Throwable {
		driver = browser.LaunchBrowser();
		 page = PageFactory.initElements(driver, Form_page2.class);
     System.out.println("On Tutorial page");
	}
	
		
	@When("^I enterd Firstname \"([^\"]*)\" LastName \"([^\"]*)\"$")
	public void i_enterd_Firstname_LastName(String FirstName, String Lastname) throws Throwable {
		page = PageFactory.initElements(driver, Form_page2.class);
		page.first_name(FirstName);
		page.last_name(Lastname);

	}

	@When("^I filled all text field and entered date \"([^\"]*)\"$")
	public void i_filled_all_text_field_and_entered_date(String date) throws Throwable {
		page = PageFactory.initElements(driver, Form_page2.class);
		Thread.sleep(2000);
		//page.radioButton();
		page.date(date);
		page.radio_automation_button();
		page.radio_selenium_button();
		page.Dropdown();
	}

	@Then("^I lande on next page$")
	public void i_lande_on_next_page() throws Throwable {
	    System.out.println("landed om next page");
	    
	}

	

}
