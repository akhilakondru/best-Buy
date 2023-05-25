package bestbuy.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.HomePage;

public class HomeTestCase extends BaseClass {
	

	HomePage home;
	
	@BeforeClass
	public void beforeClass() {
		home=new HomePage();
	}
	
	@Test
	public void tc001_home_flow() {
		home.homePage();

		}
		
	}

