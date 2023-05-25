package bestbuy.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddAllMenu;

public class MenuBarBrandsTestCase extends BaseClass {
	AddAllMenu aa;
	
	@BeforeClass
	public void beforClass() {
		aa = new AddAllMenu();
	}
	@Test
	public void tc001_brands_bestbybrands_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.bestbybrands);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Insignia, Rocketfish, Dynex, Platinum and Modal - Best Buy", driver.getTitle());
	}

	@Test
	public void tc002_brands_apple_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.apple);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Apple – Best Buy", driver.getTitle());
	}

	@Test
	public void tc003_brands_samsung_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.samsung);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Samsung Store – Best Buy", driver.getTitle());
	}

	@Test
	public void tc004_brands_microsoft_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.microsoft);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Microsoft Brand Store - Best Buy", driver.getTitle());
	}

	@Test
	public void tc005_brands_sony_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.sony);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Sony Store: Sony Electronics & Entertainment - Best Buy", driver.getTitle());
	}

	@Test
	public void tc005_brands_intel_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.intel);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Intel: Intel Powered Laptops & Desktops - Best Buy", driver.getTitle());
	}

	@Test
	public void tc005_brands_yardbird_flow() {
		List<WebElement> elements = new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.brands);
		elements.add(aa.yardbird);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Yardbird – Best Buy", driver.getTitle());
	}

}
