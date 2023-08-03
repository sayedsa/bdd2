package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutItemsPageObjects;


public class CheckOutItemsSteps extends BaseClass{
	

	CheckOutItemsPageObjects objCheckout = new CheckOutItemsPageObjects();
	
	@Given("user is on test environment")
	public void user_is_on_test_environment() {
		BaseClass.initializeDriver();
	}
	@When("user clicking on My Account")
	public void user_clicking_on_my_account() {
		objCheckout.clickmyAccount();
	}

	@When("user clicking on loginBttn")
	public void user_clicking_on_login_bttn() {
		objCheckout.clickLogoutBttn();
	}

	@When("user entering {string}  and {string}")
	public void user_entering_and(String email, String pass) {
		objCheckout.enterEmail(email, pass);
	}

	@When("user clicking login button")
	public void user_clicking_login_button() {
		objCheckout.clickLogin();
	}

	@When("user clicking on Cameras")
	public void user_clicking_on_cameras() {
		objCheckout.clickCamera();
	}

	@When("user clicking on Sony")
	public void user_clicking_on_sony() {
		objCheckout.clickSonyItem();
	}

	@When("user selecting one item from list")
	public void user_selecting_one_item_from_list() {
		objCheckout.AddItemToCart();
	}

	@When("user  clicking Items button")
	public void user_clicking_items_button() {
		objCheckout.clickItemsButton();
	}

	@Then("user checking out items")
	public void user_checking_out_items() {
		objCheckout.clickCheckOutButton();
	}

	@Then("user  filling out the following information")
	public void user_filling_out_the_following_information(io.cucumber.datatable.DataTable personalInfo) {
		
			
			
			List<Map<String, String>> data = personalInfo.asMaps(String.class, String.class);
			objCheckout.enterFirstName(data.get(0).get("FirstName"));
			objCheckout.enterLastName(data.get(0).get("LastName"));
			objCheckout.enterCountry(data.get(0).get("Country"));
			objCheckout.enterStreetName(data.get(0).get("Street"));
			objCheckout.enterCity(data.get(0).get("City"));
			objCheckout.enterStateName(data.get(0).get("State"));
			objCheckout.enterZipCodeNo(data.get(0).get("ZipCode"));
			objCheckout.enterPhoneNo(data.get(0).get("Phone"));
	}

	@Then("user places order")
	public void user_places_order() {
		objCheckout.clickPlaceOrderBttn();
	}

	@Then("user clicking MyAccount at the bottom of the page")
	public void user_clicking_my_account_at_the_bottom_of_the_page() {
		objCheckout.clickMyAccount2();
	}

	@Then("user loggin out the account")
	public void user_loggin_out_the_account() {
		objCheckout.clickLogoutBttn();
	}

}
