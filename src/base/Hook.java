package base;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	BaseClass baseClass;

	@Before
	public void setUp() {
		baseClass = new BaseClass();
		baseClass.setUp();

	}

	@After
	public void close_browser() {
		baseClass.closingBrowser();
	}
}