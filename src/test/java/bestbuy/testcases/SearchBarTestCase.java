package bestbuy.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.SearchBarItemsToCart;

public class SearchBarTestCase extends BaseClass {
	
	SearchBarItemsToCart ai;
	
	@BeforeClass
	public void beforClass() {
		ai=new SearchBarItemsToCart();
	}
	
	@Test
	public void tc001_cart_flow() {
		
		
		ai.addCart("fridge");
		Assert.assertEquals("fridge - Best Buy", driver.getTitle());
		
	}
	

}
