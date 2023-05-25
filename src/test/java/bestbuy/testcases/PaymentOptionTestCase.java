package bestbuy.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.PaymentOption;

public class PaymentOptionTestCase extends BaseClass {
	PaymentOption po;
	
	@BeforeClass
	public void beforClass() {
		po= new PaymentOption();
	}
	
	@Test
	public void tc001_payment_flow() {
		po.addPayment();
	}

}
