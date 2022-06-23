package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import junit.framework.Assert;
import pages.BackgroundColorPage;
import pages.TestBasePage;

@SuppressWarnings("deprecation")
public class BackgroundColorStepDefinition extends TestBasePage {
	
  BackgroundColorPage backgroundColorPage;
	
	@Given("^User is on the provided webpage$")
	public void user_is_on_the_provided_webpage()  {
		
		initDriver();
		driver.get(" http://techfios.com/test/101/");
	    
	}

	@When("^the user clicks set skyblue background button$")
	public void the_user_clicks_set_skyblue_background_button()  {
	   
		backgroundColorPage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundColorPage.clickSetSkyBlueBackground();
		
	}

	@Then("^the background color should change to blue$")
	public void the_background_color_should_change_to_blue()  {
		Assert.assertTrue(backgroundColorPage.BackgroundSkyBlue.isDisplayed());
	   
	    takeScreenShot(driver);
	}

	@When("^the user clicks set white background button$")
	public void the_user_clicks_set_white_background_button()  {
		backgroundColorPage = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundColorPage.clickSetWhiteBackground();
	}

	@SuppressWarnings("deprecation")
	@Then("^the background color should change to white$")
	public void the_background_color_should_change_to_white()  {
		Assert.assertTrue(backgroundColorPage.BackgroundWhite.isDisplayed());
		 
		    takeScreenShot(driver);
	}



}
