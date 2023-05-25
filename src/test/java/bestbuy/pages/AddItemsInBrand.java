package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class AddItemsInBrand extends BaseClass {
	
	@FindBy(xpath = "//button[@aria-label='Menu']")
	public WebElement menu;
	
	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	public WebElement brands;
	
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	public WebElement apple;
	
	@FindBy(xpath="//a[@class='link-element']")
	WebElement mac;
	
	@FindBy(xpath="(//a[@class='link-element'])[2]")
	WebElement macBookPro;
	
	@FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[1]")
	WebElement addToCart;
	
	public AddItemsInBrand() {
		PageFactory.initElements(driver, this);
	}
	
	public void addItems() {
		menu.click();
		brands.click();
		apple.click();
		mac.click();
		macBookPro.click();
		addToCart.click();
	}

}
