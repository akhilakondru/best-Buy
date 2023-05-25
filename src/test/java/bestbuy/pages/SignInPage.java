package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class SignInPage extends BaseClass {
	
	@FindBy(xpath = "(//button[@type='button'])[7]")
	WebElement account;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement signin;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[contains(text(),'Please enter a valid email address.')]")
	WebElement emailErrormsg;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your password.')]")
	WebElement passwordErrormsg;

	public SignInPage() {
		PageFactory.initElements(driver, this);

	}

	public void signIn(String email, String password) {
		account.click();
		signin.click();
		this.email.sendKeys(email);
		this.password.sendKeys( password);
		submit.click();
	}
	public String getemailerromsg() {
		return emailErrormsg.getText();
	}
	public String getpasswordErrormsg() {
		return passwordErrormsg.getText();
	}
}