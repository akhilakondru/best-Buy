package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddItemsInBrand;

public class BrandItemsToCartTestCase extends BaseClass{
	AddItemsInBrand ai;
	
	@BeforeClass
	public void beforClass() {
		ai=new AddItemsInBrand();
	}
	
	@Test
	
	public void tc001_cart_flow() {
		ai.addItems();
	}

}
