package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.CheckOutItems;

public class CheckOutItemsTestCase extends BaseClass{
	
	CheckOutItems coi;
	
	@BeforeClass
	public void beforClass() {
		coi=new CheckOutItems();
	}
	
	@Test
	public void tc001_checkOut() {
		String cardNum="4893772413084902";
		//Select expMonth = new Select(coi.expMonth);
	    // expMonth.selectByVisibleText("09");
	     //Select expYear = new Select(coi.expYear);
	     //expYear.selectByVisibleText("2024");
	     String cvv="987";
	     coi.checkOutItems(cardNum,cvv);
	     
	}
	//("//div[@id='ui-monthpicker-div']//select[1]")); select.selectByValue("2010");

}
