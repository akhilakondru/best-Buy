package bestbuy.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bestbuy.baseclass.BaseClass;
import bestbuy.pages.AddAllMenu;

public class MenuBarSupportTestCases extends BaseClass{
	AddAllMenu aa;
	
	@BeforeClass
	public void beforeClass() {
		aa = new AddAllMenu();
	}
		
	@Test
	public void tc001_servicesVisitCenter_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.visitoursupportcenter);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Best Buy Support & Customer Service",driver.getTitle());
	}
	
	@Test
	public void tc002_services_ScheduleService_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.scheduleaservices);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Schedule a Service - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc003_services_ScheduleService_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.onlinesupport);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Remote Support: Geek Squad - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc004_services_ManageAppointment_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.manageanappointment);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Appointment Finder - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc005_services_shopwithanexpert_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.shopwithanexpert);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Shop with an Expert - Best Buy",driver.getTitle());
	}
	@Test
	public void tc005_services_checkrepairstatus_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.checkrepairstatus);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Track Your Repair - Best Buy",driver.getTitle());
	}
	
	@Test
	public void tc006_services_freehomeconsultation_flow() {
		List<WebElement> elements=new ArrayList<>();
		elements.add(aa.menu);
		elements.add(aa.supportservices);
		elements.add(aa.freehomeconsultation);
		aa.clickMenuElements(elements);
		Assert.assertEquals("Best Buy Home: Virtual and In-Home Consultation - Best Buy",driver.getTitle());
	}
	

	
}
