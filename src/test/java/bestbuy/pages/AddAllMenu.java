package bestbuy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.baseclass.BaseClass;

public class AddAllMenu extends BaseClass {

	@FindBy(xpath = "//button[@aria-label='Menu']")
	public WebElement menu;

	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[1]")
	public WebElement deals;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	public WebElement topDeals;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[1]")
	public WebElement featureddeals;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[2]]")
	public WebElement totaltechmemeberdeals;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[3]]")
	public WebElement computersloptops;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[4]]")
	public WebElement tvsprojecters;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[5]]")
	public WebElement videogames;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[6]]")
	public WebElement Apple;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[7]]")
	public WebElement tablets;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[8]]")
	public WebElement pcgamingvr;
	
	@FindBy(xpath="(//p[@class='cn-item-copy'])[9]]")
	public WebElement headphones;
	

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	public WebElement dealaoftheday;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[3]")
	public WebElement toraltechmemberoffers;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[4]")
	public WebElement giftideas;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[5]")
	public WebElement bestbyoutlet;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[6]")
	public WebElement appleshoppingevent;

	@FindBy(xpath = "//button[@class='c-button-unstyled close-button-sidecar']")
	public WebElement close;

	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[2]")
	public WebElement supportservices;

	//@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	@FindBy(xpath = "//a[@href='/support'] ")
	public WebElement visitoursupportcenter;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	public WebElement scheduleaservices;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[3]")
	public WebElement onlinesupport;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[4]")
	public WebElement manageanappointment;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[5]")
	public WebElement shopwithanexpert;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[6]")
	public WebElement checkrepairstatus;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[7]")
	public WebElement freehomeconsultation;

	@FindBy(xpath = "//button[@class='c-button-unstyled close-button-sidecar']")
	public WebElement close1;

	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	public WebElement brands;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	public WebElement bestbybrands;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	public WebElement apple;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[3]")
	public WebElement samsung;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[4]")
	public WebElement microsoft;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[5]")
	public WebElement sony;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[6]")
	public WebElement intel;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[7]")
	public WebElement yardbird;

	@FindBy(xpath = "//button[@class='c-button-unstyled close-button-sidecar']")
	public WebElement close2;

	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[4]")
	public WebElement featured;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	public WebElement aapiheritagemonth;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[2]")
	public WebElement graduationgifts;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[3]")
	public WebElement gearofcontentcreators;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[4]")
	public WebElement legotoys;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[5]")
	public WebElement teentechcenter;

	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[6]")
	public WebElement homesecuritysolutions;

	@FindBy(xpath = "//button[@class='c-button-unstyled close-button-sidecar']")
	public WebElement close3;

	public AddAllMenu() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMenuElements(List<WebElement> clickElement) {
		for(WebElement element:clickElement) {
			element.click();
		}
		
	}

	public void menu() {
		menu.click();
		// Deals
		deals.click();
		topDeals.click();
		dealaoftheday.click();
		toraltechmemberoffers.click();
		giftideas.click();
		bestbyoutlet.click();
		appleshoppingevent.click();
		close.click();
		// SupportSerivce
		supportservices.click();
		visitoursupportcenter.click();
		scheduleaservices.click();

		onlinesupport.click();
		manageanappointment.click();
		shopwithanexpert.click();
		checkrepairstatus.click();
		freehomeconsultation.click();
		close1.click();
		// Brands
		brands.click();
		bestbybrands.click();
		apple.click();
		samsung.click();
		microsoft.click();
		sony.click();
		intel.click();
		yardbird.click();
		close2.click();
		// Featured
		featured.click();
		aapiheritagemonth.click();
		graduationgifts.click();
		gearofcontentcreators.click();
		legotoys.click();
		teentechcenter.click();
		homesecuritysolutions.click();
		close3.click();

	}
}
