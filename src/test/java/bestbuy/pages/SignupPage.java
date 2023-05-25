package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class SignupPage extends BaseClass {

	// @FindBy(xpath="//a[@class='bottom-left-links ']")
	// WebElement topDeals;
	
	@FindBy(xpath = "(//button[@type='button'])[7]")
	WebElement account;
	
	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	WebElement signUp;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement reenterPassword;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your first name.')]")
	WebElement firstNameErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your last name.')]")
	WebElement lastNameErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid email address.')]")
	WebElement emailErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please enter a strong password.')]")
	WebElement passwordErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please reenter your password.')]")
	WebElement reenterPasswordErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid mobile phone number.')]")
	WebElement phoneNumberErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Passwords do not match.')]")
	WebElement pwdNotMatchErrormsg;
	

	public SignupPage() {
		PageFactory.initElements(driver, this);

	}

	public void signup(String fname, String lname, String email, String pwd, String repwd, String mobile) {
		account.click();
		signUp.click();
		this.firstName.sendKeys(fname);
		this.lastName.sendKeys(lname);
		this.emailAddress.sendKeys(email);
		this.password.sendKeys(pwd);
		this.reenterPassword.sendKeys(repwd);
		this.phoneNumber.sendKeys(mobile);
		submit.click();
	}
	
	public String getfnameErrorMsg() {
		return firstNameErrormsg.getText();
	}
	
	public String getlnameErrorMsg() {
		return lastNameErrormsg.getText();
	}
	
	public String getEmailErrorMsg() {
		return lastNameErrormsg.getText();
	}
	public String getPwdErrorMsg() {
		return passwordErrormsg.getText();
	}
	public String getReenterPwdErrorMsg() {
		return reenterPasswordErrormsg.getText();
	}
	public String getPhoneNumberErrorMsg() {
		return phoneNumberErrormsg.getText();
	}
	public String getPwdNotMatchErrormsg() {
		return pwdNotMatchErrormsg.getText();
	}

	
}
