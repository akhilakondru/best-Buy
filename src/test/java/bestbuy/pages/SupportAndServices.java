package bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportAndServices {
	
	@FindBy(xpath="(//h3[@class='navigation-section-heading body-copy-lg v-text-tech-black'])[3]")
	WebElement supportAndService;

}
