package bestbuy.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilClass.UtilClass;

public class BaseClass extends UtilClass {
	
	public static WebDriver driver;

	@BeforeSuite
	public void start() throws Exception {

		File file = new File("D:\\Practice\\akhila-workspace\\BestBuy\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fileInput);
		String browser = pro.getProperty("browser");
		String url = pro.getProperty("url");

		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.bestbuy.com/");
		} else if (browser.contentEquals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			driver.get(url);

		} else if (browser.contentEquals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(url);

			driver.manage().window().maximize();
			driver.get(url);
		}

	}

	//@AfterSuite
	public void closeUp() {
		driver.close();
	}

}
