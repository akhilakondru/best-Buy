package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddToCartByDepartment;

public class DepartmentToCartTestCase extends BaseClass{
	AddToCartByDepartment ad;
	
	@BeforeClass
	public void beforClass() {
		 ad= new AddToCartByDepartment();
	}
	
	@Test
	public void AddToCartByDepartment() {
		ad.addCart();
	}

}
