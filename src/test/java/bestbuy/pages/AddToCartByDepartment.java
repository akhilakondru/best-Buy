package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class AddToCartByDepartment extends BaseClass {

	@FindBy(xpath = "//button[@aria-label='Menu']")
	public WebElement menu;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[2]")
	WebElement tv;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[1]")
	WebElement tvBySize;
	
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	WebElement topTVDeals;
	
	@FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[1]")
	WebElement addToCartTV;

	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[4]")
	WebElement callPhones;

	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[3]")
	WebElement samsung;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[5]")
	WebElement samsungS23;
	
	@FindBy(xpath="(//a[@class='c-button c-button-secondary c-button-md c-button-block river-page-button'])[1]")
	WebElement shopNow;

	@FindBy(xpath = "//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addToCart;

	public AddToCartByDepartment() {
		PageFactory.initElements(driver, this);
	}

	public void addCart() {
		menu.click();
		tv.click();
		tvBySize.click();
		topTVDeals.click();
		addToCartTV.click();
		//callPhones.click();
		//samsung.click();
		//samsungS23.click();
		//shopNow.click();
		//addToCart.click();
	}

}
