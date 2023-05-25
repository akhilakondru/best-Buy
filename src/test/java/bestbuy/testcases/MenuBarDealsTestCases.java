package bestbuy.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddAllMenu;

public class MenuBarDealsTestCases extends BaseClass {
	AddAllMenu aa;
	
	@BeforeClass
	public void beforClass() {
		aa = new AddAllMenu();
	}
	
	@Test
	public void tc001_Deals_TopDeals_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.topDeals);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc002_Deals_DealOfTheDay_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.dealaoftheday);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc003_Deals_ToralTechMemberOffers_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.toraltechmemberoffers);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Top Deals on Totaltech - Best Buy",driver.getTitle());
	}
	@Test
	
	public void tc004_Deals_giftideas_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.giftideas);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy",driver.getTitle());
	}
	@Test
	public void tc004_Deals_bestbyoutlet_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.bestbyoutlet);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc004_Deals_appleshoppingevent_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.appleshoppingevent);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Apple Shopping Event – Best Buy",driver.getTitle());
	}
	public void tc005_Deals_appleshoppingevent_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.deals);
		elements.add(aa.appleshoppingevent);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Apple Shopping Event – Best Buy",driver.getTitle());
	}
	
	

}
