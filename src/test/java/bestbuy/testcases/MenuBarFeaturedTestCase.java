package bestbuy.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddAllMenu;

public class MenuBarFeaturedTestCase extends BaseClass {
	
	AddAllMenu aa;
	
	@BeforeClass
	public void beforClass() {
		aa = new AddAllMenu();
	}
	
	@Test
	public void tc001_featured_aapiheritagemonth_flow() {
		
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.aapiheritagemonth);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Asian American Pacific Islander Heritage Month",driver.getTitle());
	}
	
	@Test
	public void tc002_featured_graduationgifts_flow() {
		AddAllMenu aa = new AddAllMenu();
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.graduationgifts);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Graduation Gifts: Best Gifts For Grads & College Students - Best Buy",driver.getTitle());
	}
    
	@Test
	public void tc003_featured_gearofcontentcreators_flow() {
		AddAllMenu aa = new AddAllMenu();
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.gearofcontentcreators);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Content Creator Cameras, Lights & Mics - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc004_featured_legotoys_flow() {
		AddAllMenu aa = new AddAllMenu();
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.legotoys);
		aa.clickMenuElements(elements);
		Assert.assertEquals("LEGO - Best Buy",driver.getTitle());
	}
	

	@Test
	public void tc005_featured_teentechcenter_flow() {
		AddAllMenu aa = new AddAllMenu();
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.teentechcenter);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Teen Tech Centers - Best Buy",driver.getTitle());
	}
	@Test
	public void tc006_featured_homesecuritysolutions_flow() {
		AddAllMenu aa = new AddAllMenu();
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.featured);
		elements.add(aa.homesecuritysolutions);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Home Security Solutions - Best Buy",driver.getTitle());
	}

}
