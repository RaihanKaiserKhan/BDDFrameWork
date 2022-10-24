package stepsDefinationHome;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsHome extends BaseClass {

	public StepsHome() {
		initClasses();
	}
	
	
	
	@Given("user in the home page")
	public void user_in_the_home_page() {
	System.out.println("User is at HomePage");
	}

	@When("selecting {string} from product dropdown")
	public void selecting_from_product_dropdown(String string) {
		commonAction.scrollDownByJs(null);
	homePage.typeInsurance(commonAction, string);
	}

	@When("Entering {string} in zip code")
	public void entering_in_zip_code(String string) {
	homePage.zipInput(commonAction, string);
	}

	@When("click start qoute button")
	public void click_start_qoute_button() {
	homePage.startQoute(commonAction);
	}

	@When("User enters all personal info")
	public void user_enters_all_personal_info() {
	   homeOwnerInfo.homeOwnerSteps(commonAction, "abiu", "abullah", 'A',"JR", "Modonpur", "33e","10/15/2000", true);
	}


	@Then("User will see the quote")
	public void user_will_see_the_quote() {
	 System.out.println("OMG cant believe its my qoute");
	}
	
	
	
}
