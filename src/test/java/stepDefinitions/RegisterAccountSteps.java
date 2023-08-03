package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterAccountPageObjects;

public class RegisterAccountSteps extends BaseClass {
	RegisterAccountPageObjects RegObject = new RegisterAccountPageObjects();

	@Given("user test Register funtionality using data table")
	public void user_test_Register_functionality_using_data_table() {
		BaseClass.initializeDriver();
	}

	@When("User clicks on MyAccount")
	public void Users_clicks_on_MyAccount() throws InterruptedException {

		logger.info("clicking on MyAccount");
		RegObject.clickOnMyAccount();
		
	}

	@When("user click on Register")
	public void user_click_on_register() throws InterruptedException {
		RegObject.clickRegister();
	}

	@When("user fills out the following information")
	public void user_fills_out_the_following_information(io.cucumber.datatable.DataTable personalInfo) {
		logger.info("filling personal info");
		
		
		List<Map<String, String>> data = personalInfo.asMaps(String.class, String.class);
		RegObject.enterFirstName(data.get(0).get("FirstName"));
		RegObject.enteLastName(data.get(0).get("LastName"));
		RegObject.enterEmail(data.get(0).get("Email"));
		RegObject.enterTelephone(data.get(0).get("Telephone"));
		RegObject.selectCountry();
		RegObject.enterPassword(data.get(0).get("Password"));
		RegObject.enterConfPassword(data.get(0).get("ConfirmPassword"));
		/*
		List<List<String>> data = personalInfo.asLists();

		RegObject.enterFirstName(data.get(0).get(0));
		RegObject.enteLastName(data.get(0).get(1));
		RegObject.enterEmail(data.get(0).get(2));
		RegObject.enterTelephone(data.get(0).get(3));
		RegObject.selectCountry();
		RegObject.enterPassword(data.get(0).get(5));
		RegObject.enterConfPassword(data.get(0).get(6));
		*/
	}

	@When("user subscribes to newsletter")
	public void user_subscribes_to_newsletter() {
		logger.info("subscribing to newsletter");
		RegObject.clickSubscribe();
	}

	@When("user  checks the Privacy Policy checkbox")
	public void user_checks_the_privacy_policy_checkbox() {
		logger.info("checking the privacy policy");
		RegObject.clickPrivacyPolicy();
	}

	@Then("user clicks the Continue button")
	public void user_clicks_the_continue_button() {
		logger.info("clicking continue button");
		RegObject.clickContinueBttn();
	}

	@Then("user is registerd and received the following message {string}")
	public void user_is_registerd_and_received_the_following_message(String message) {
		
		logger.info("account succesfully created");
		RegObject.accountCreated(message);
		
		BaseClass.tearDown();
	}

}
