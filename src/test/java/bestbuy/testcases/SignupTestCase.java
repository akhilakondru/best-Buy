
package bestbuy.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.SignupPage;

@Test
public class SignupTestCase extends BaseClass {

	SignupPage sp;

	@BeforeClass
	public void beforeClass() {
		sp = new SignupPage();
	}

	
	  @Test
	  public void tc001_Signup_fName_Validation() { 
		  sp.signup("", "Naden", "thaswi999@gmail.com", "Thaswi@12345","Thaswi@12345", "9988771122");
	  Assert.assertEquals("Please enter your first name.",sp.getfnameErrorMsg()); 
	  driver.navigate().back();
	  }
	  
	  @Test 
	  public void tc002_Signup_lName_Validation() { 
		 sp.signup("Akhila", "", "thaswi999@gmail.com", "Thaswi@12345","Thaswi@12345", "9988771122");
	  Assert.assertEquals("Please enter your last name.",sp.getlnameErrorMsg()); 
	  driver.navigate().back();
	  }
	  
		/*
		 * @Test public void tc003_Signup_email_Validation() { sp.signup("Akhila",
		 * "Nade", "thaswi999", "Thaswi@12345","Thaswi@12345", "9988771122");
		 * Assert.assertEquals("Please enter a valid email address.",sp.getEmailErrorMsg
		 * ()); driver.navigate().back(); }
		 */
	  
	  @Test 
	  public void tc004_Signup_Pwd_Validation() { 
		  sp.signup("Akhila","Nade", "thaswi999@gmail.com", "", "Thaswi@12345", "9988771122");
	  Assert.assertEquals("Please enter a strong password.",sp.getPwdErrorMsg()); 
	  driver.navigate().back();
	  }
	  
	  
		/*
		 * @Test public void tc005_Signup_RePwd_Validation() { sp.signup("Akhila",
		 * "Nade", "thaswi999@gmail.com","Thaswi@12345", "", "9988771122");
		 * Assert.assertEquals("Please reenter your password.",sp.getReenterPwdErrorMsg(
		 * )); driver.navigate().back(); }
		 */
	  
	  
	  @Test 
	  public void tc005_Signup_RePwd_Validation2() { 
		   sp.signup("Akhila", "Name", "thaswi999@gmail.com","Thaswi@12345", "Thaswi", "9988771122");
	  Assert.assertEquals("Passwords do not match.",sp.getPwdNotMatchErrormsg()); 
	  driver.navigate().back();
	  }
	  
	  @Test 
	  public void tc006_Signup_Phone_Validation() { 
		  sp.signup("Akhila", "Name", "thaswi999@gmail.com","Thaswi@12345", "Thaswi", "");
	  Assert.assertEquals("Please enter a valid mobile phone number.",sp.getPhoneNumberErrorMsg()); 
	  driver.navigate().back();
	  }
	 

	@Test
	public void tc007_Signup_Flow() {
		sp.signup("sivaram", "Naden", "sivaramk888@gmail.com", "Kittu@526", "Kittu@526", "9988771133");
		Assert.assertEquals("Account Home - Best Buy", driver.getTitle());
		driver.navigate().back();
	}

}
