package bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bestbuy.baseclass.BaseClass;

public class CheckOutItems extends BaseClass{
	
	@FindBy(xpath = "//div[@class='bby-cart gvp-cart-icon-lv']")
	public WebElement cart;
	
	@FindBy(xpath = "//button[@data-track='Checkout - Top']")
	public WebElement checkOut;
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	public WebElement paymentInfo;
	
	@FindBy(xpath = "//input[@id='number']")
	public WebElement ccNumber;
	
	@FindBy(xpath = "(\"//div[@id='ui-monthpicker-div']//select[1]\"))")
	public WebElement expMonth;
	
	@FindBy(xpath = "(\"//div[@id='ui-monthpicker-div']//select[1]\"))")
	public WebElement expYear;
	
	@FindBy(xpath = "//input[@id='cvv']")
	public WebElement cvv;
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	WebElement goToCart;
	
	public CheckOutItems() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void checkOutItems(String ccNumber, Object expMonth, Object
	 * expYear,String cvv) { cart.click(); checkOut.click(); paymentInfo.click();
	 * this.ccNumber.sendKeys(ccNumber);
	 * this.expMonth.sendKeys(expMonth.toString());
	 * this.expYear.sendKeys(expYear.toString()); this.cvv.sendKeys(cvv);
	 * 
	 * }
	 */
	
	/*Select select = new Select(driver. findElement(By. xpath("//select")));
	WebElement option = select. getFirstSelectedOption();
	String defaultItem = option. getText();
	//System.out.println(defaultItem );
	*/
		

	

	public void checkOutItems(String ccNumber,String cvv) {
		goToCart.click();
		cart.click();
		checkOut.click();
		paymentInfo.click();
		this.ccNumber.sendKeys(ccNumber);
		//this.expMonth.sendKeys(expMonth.toString());
		//this.expYear.sendKeys(expYear.toString());
		this.cvv.sendKeys(cvv);
	}
}
