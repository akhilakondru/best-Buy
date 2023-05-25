package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath = "(//img[@alt='United States'])[1]")
	 WebElement unitedStates;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void homePage() {
		unitedStates.click();
	}

}
