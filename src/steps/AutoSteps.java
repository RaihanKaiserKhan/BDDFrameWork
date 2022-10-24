package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends BaseClass {

	public AutoSteps() {
		initClasses();
	}
	
	@Given("user click the cookies cancel")
	public void user_click_the_cookies_cancel() {
		homePage.dismissingAlert(commonAction);
	}

	@When("user select {string} in the prodactDropDown")
	public void user_select_in_the_prodact_drop_down(String string) {
	homePage.typeInsurance(commonAction, "Auto");
}

	@When("user input {string} into the zipCode field")
public void user_input_into_the_zip_code_field(String string) {
   homePage.zipInput(commonAction, "11219");
	}

	@Then("user click startQoute button")
	public void user_click_start_qoute_button() {
	homePage.startQoute(commonAction);
	}
	@When("user enters their personal info")
	public void user_enters_their_personal_info() {
		customerInfo.customerInfoSteps(commonAction, "Raihan", "Ali", 'K',"1430" , "3A","10/10/1995");
	}
	
	@Then("user will navigate to vehicle page")
	public void user_will_navigate_to_vehicle_page() {
		System.out.println("Going to vehicle page");
	}
	
	
}
