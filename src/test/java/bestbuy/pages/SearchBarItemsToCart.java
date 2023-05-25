package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class SearchBarItemsToCart extends BaseClass {

	@FindBy(xpath = "//input[@name='st']")
	WebElement search;

	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement fridge;

	@FindBy(xpath = "//button[@data-button-state='ADD_TO_CART']")
	WebElement addToCart;
	
	@FindBy(xpath = "//button[@title='submit search']")
	WebElement submitSearch;

	public SearchBarItemsToCart() {
		PageFactory.initElements(driver, this);
	}

	public void addCart(String search) {
		this.search.sendKeys(search);
		submitSearch.click();
		//fridge.click();
		addToCart.click();

	}

}
