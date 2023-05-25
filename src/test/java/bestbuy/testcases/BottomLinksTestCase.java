package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddBottomLinks;

public class BottomLinksTestCase extends BaseClass {
	
	AddBottomLinks al;
	
	@BeforeClass
	public void beforeClass() {
		al=new AddBottomLinks();
	}
	@Test
	public void tc001_bottom_flow() {
		al.bottomLinks();
		
	}

}
