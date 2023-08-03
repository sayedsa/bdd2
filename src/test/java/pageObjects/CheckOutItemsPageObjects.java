package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class CheckOutItemsPageObjects extends BaseClass {

	public CheckOutItemsPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement MyAccount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement Login;

	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement Email;

	@FindBy(how = How.XPATH, using = "(//input[@class='form-control'])[2]")
	private WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[@id='signinbtn']")
	private WebElement LoginButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Cameras']")
	private WebElement Cameras;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"menu\\\"]/div[2]/ul/li[1]/div/div/ul/li[4]/a")
	private WebElement SonyItem;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\"shopdata\\\"]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement AddToCart;

	@FindBy(how = How.XPATH, using = "//button[@type='button' and @class='btn btn-inverse btn-block btn-lg ']")
	private WebElement clickItemsBttn;

	@FindBy(how = How.XPATH, using = "//a[text()='Checkout' and @class='btn btn-primary']")
	private WebElement clickCheckout;

	@FindBy(how = How.XPATH, using = "//input[@name='first_name']\"")
	private WebElement firstName;
	@FindBy(how = How.XPATH, using = "//input[@name='last_name']")
	private WebElement lastName;
	@FindBy(how = How.CSS, using = "input[name='conutry']")
	private WebElement country;
	@FindBy(how = How.XPATH, using = "//input[@name='street_address']")
	private WebElement street;

	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	private WebElement city;
	@FindBy(how = How.CSS, using = "input[name='state']")
	private WebElement state;
	@FindBy(how = How.XPATH, using = "//input[@name='zip_code']")
	private WebElement zipCode;
	@FindBy(how = How.XPATH, using = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(how = How.XPATH, using = "//button[@id='btn']")
	private WebElement placeOrder;

	@FindBy(how = How.XPATH, using = "(//a[text()='My Account'])[2]")
	private WebElement myAccount2;

	@FindBy(how = How.XPATH, using = "//a[text()='logout']")
	private WebElement LogoutButton;

	public void clickmyAccount() {
		MyAccount.click();
	}

	public void clickLogin() {
		Login.click();

	}

	public void enterEmail(String email, String password) {
		Email.sendKeys(email);
		Password.sendKeys(password);
	}

	public void clickLogginBttn() {
		LoginButton.click();
	}

	public void clickCamera() {
		Actions a = new Actions(driver);

		a.moveToElement(Cameras).build().perform();
		a.moveToElement(SonyItem).click().build().perform();
	}

	public void clickSonyItem() {
		Actions a = new Actions(driver);
		a.moveToElement(SonyItem).click().build().perform();
	}

	public void AddItemToCart() {

		AddToCart.click();
	}

	public void clickItemsButton() {
		clickItemsBttn.click();

	}

	public void clickCheckOutButton() {

		clickCheckout.click();
	}

	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void enterLastName(String lName) {
		lastName.sendKeys(lName);

	}

	public void enterCountry(String countryName) {
		country.sendKeys(countryName);
	}

	public void enterStreetName(String streetName) {
		street.sendKeys(streetName);
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);

	}

	public void enterStateName(String stateName) {
		state.sendKeys(stateName);
	}

	public void enterZipCodeNo(String ZipCode) {
		zipCode.sendKeys(ZipCode);
	}

	public void enterPhoneNo(String phoneNo) {
		phone.sendKeys(phoneNo);
	}

	public void clickPlaceOrderBttn() {
		placeOrder.click();
	}

	public void clickMyAccount2() {
		myAccount2.click();
	}

	public void clickLogoutBttn() {
		LogoutButton.click();
	}
}
