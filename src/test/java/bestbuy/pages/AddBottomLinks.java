package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class AddBottomLinks extends BaseClass {

	@FindBy(xpath = "//a[text()='Accessibility']")
	WebElement accessibility;

	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement termaAndConditions;

	@FindBy(xpath = "//a[text()='Privacy']")
	WebElement privacy;

	@FindBy(xpath = "//a[text()='Interest-Based Ads']")
	WebElement interestBrandsAds;

	@FindBy(xpath = "//a[text()='State Privacy Rights']")
	WebElement statePrivacyRights;

	@FindBy(xpath = "//a[text()='CA Do Not Sell/Share My Personal Information']")
	WebElement caPersonalInformation;

	@FindBy(xpath = "(//a[@class='body-copy-sm mr-200'])[7]")
	WebElement limitsensitivePersonalInformation;

	@FindBy(xpath = "//a[text()='Targeted Advertising Opt Out']")
	WebElement targeted;

	@FindBy(xpath = "//a[text()='CA Supply Chain Transparency Act']")
	WebElement caTransparency;

	public AddBottomLinks() {
		PageFactory.initElements(driver, this);
	}

	public void bottomLinks() {
		accessibility.click();
		termaAndConditions.click();
		privacy.click();
		interestBrandsAds.click();
		statePrivacyRights.click();
		caPersonalInformation.click();
		// limitsensitivePersonalInformation.click();
		//targeted.click();
		//caTransparency.click();

	}
}
