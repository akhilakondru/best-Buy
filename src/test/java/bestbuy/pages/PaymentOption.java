package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class PaymentOption extends BaseClass {

	@FindBy(xpath = "(//h3[@class='navigation-section-heading body-copy-lg v-text-tech-black'])[2]")
	WebElement paymentOptions;

	@FindBy(xpath = "//a[@data-lid='ft_pay_my_best_buy_credit_card']")
	WebElement bestBuyCreditCard;

	@FindBy(xpath = "//a[text()='Pay Your Bill at Citibank']")
	WebElement payYourBill;

	@FindBy(xpath = "//a[text()='Lease to Own']")
	WebElement payLeaseToOwn;

	public PaymentOption() {
		PageFactory.initElements(driver, this);
	}

	public void addPayment() {
		paymentOptions.click();
		bestBuyCreditCard.click();
		payYourBill.click();
		payLeaseToOwn.click();

	}

}
