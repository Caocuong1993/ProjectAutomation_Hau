package testscript;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import common.WebDriverBase;

public class TestCase {
	protected WebDriverBase base;

	public TestCase() {
		base = new WebDriverBase();
	}

	public TestCase(WebDriver driver) {
		super();
		this.base.driver = driver;
	}

	// Parameter will get browser from testng.xml on which browser test to run
	@Parameters({ "platform", "browserName" })
	@BeforeMethod
	public void openBrowser(String platform, String browserName) throws MalformedURLException {
		System.out.println(browserName);
		base.selectBrowser(platform, browserName);
	}

	@AfterMethod
	void closeBrowser() {
		base.driver.manage().deleteAllCookies();
		// thoat han cache
		base.driver.quit();
	}

}
