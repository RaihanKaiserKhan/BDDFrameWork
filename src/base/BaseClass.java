package base;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import common.CommonAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.CustomerInfo;
import object.HomeOwnerInfo;
import object.HomePage;
import object.PracticePage;

import utils.ReadConfigFile;

public class BaseClass {

	public static WebDriver driver;

	public CommonAction commonAction;
	public HomePage homePage;
	public CustomerInfo customerInfo;
	public HomeOwnerInfo homeOwnerInfo;
	public PracticePage practicePage;
	public ReadConfigFile readConfigFile;

	public WebDriver setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ReadConfigFile.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ReadConfigFile.getInstance().getPageLoadTime()));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(ReadConfigFile.getInstance().getImplicitlyWaitTime()));
		// initClasses();
		return driver;
	}

	public void initClasses() {
		homePage = new HomePage(driver);
		customerInfo = new CustomerInfo(driver);
		commonAction = new CommonAction();
		homeOwnerInfo = new HomeOwnerInfo(driver);
		practicePage = new PracticePage(driver); // For additional page to do any experiment
	}

	public void closingBrowser() {
		driver.quit();
	}
}