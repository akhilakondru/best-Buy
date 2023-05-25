package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddBottomLinks;
import bestbuy.pages.BrokenLinks;

public class BrokenLinksTestCases extends BaseClass {
	
	BrokenLinks bl;	
	@BeforeClass
	public void beforeClass() {
		bl=new BrokenLinks();
	}
	@Test
	public void tc001_broken_flow() {
		bl.brokenLinks();
		
	}

}
