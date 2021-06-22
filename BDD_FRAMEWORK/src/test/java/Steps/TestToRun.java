package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PAGE.Form_Page;
import UTIL.Browser;
import UTIL.basepage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestToRun {
WebDriver driver;
Form_Page page;
Browser browser;
basepage BasePage;

@Given("^User wants to go to login site$")
public void user_wants_to_go_to_login_site() throws Throwable {
driver=	Browser.LaunchBrowser();
   page=PageFactory.initElements(driver, Form_Page.class);
   
}

@When("^user enter \"([^\"]*)\"   and \"([^\"]*)\"$")
public void user_enter_and(String firstname, String lastname) throws Throwable {
	page=PageFactory.initElements(driver, Form_Page.class);
	page.name_button(firstname);
	page.Last_name(lastname);
}


@When("^fill up all the credentilas and pass date \"([^\"]*)\"$")
public void fill_up_all_the_credentilas_and_pass_date(String date) throws Throwable {
	page=PageFactory.initElements(driver, Form_Page.class);
	page.radioButton();
	page.experienceButton();
	page.Date_Method(date+basepage.randomNumGenerator1());
	page.profession();
	page.toolmethod();
}

@When("^fill up other forms$")
public void fill_up_other_forms() throws Throwable {
	page=PageFactory.initElements(driver, Form_Page.class);
	page.continentsmethod();
	page.commandsmethod();
}

@Then("^user should able to go next page$")
public void user_should_able_to_go_next_page() throws Throwable {
	page=PageFactory.initElements(driver, Form_Page.class); 
	page.lastlysubmit();
	
}


 } 


