package bestbuy.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.SignInPage;

public class SignInTestCase extends BaseClass {
	
	SignInPage sp;
	
	@BeforeClass
	public void beforeClass() {
		sp=new SignInPage();
	}
	@Test
	public void tc001_Email_Validation() {
		sp.signIn("", "Thaswi@12345");
		Assert.assertEquals("Please enter a valid email address.", sp.getemailerromsg());
		driver.navigate().back();
	}

	@Test
	public void tc002_Password_Validation() {
		sp.signIn("thaswi999@gmail.com", "");
		Assert.assertEquals("Please enter your password.", sp.getpasswordErrormsg());
		driver.navigate().back();
	}

	@Test
	public void tc003_Validation_Flow() {
		sp.signIn("sivaramk085@gmail.com", "Kittu@526");
		Assert.assertEquals("Sign In to Best Buy", driver.getTitle());

	}

}
