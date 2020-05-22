package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverBase {
	public WebDriver driver;


	// Parameter will get browser from testng.xml on which browser test to run
	// @Parameters({ "platform", "browserName" })
	// @BeforeTest
	public void selectBrowser(String platform, String browserName) {
		DesiredCapabilities caps = new DesiredCapabilities();
		if (platform.equalsIgnoreCase("Windows")) {
			caps.setPlatform(Platform.WINDOWS);
		} else if (platform.equalsIgnoreCase("Mac")) {
			caps.setPlatform(Platform.MAC);
		}

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", Utils.getRootPath() + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
			// caps.setBrowserName("Chrome");
			//caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
			//caps = DesiredCapabilities.chrome();

		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Utils.getRootPath() + "/driver/geckodriver.exe");
			driver = new FirefoxDriver();
			//caps.setBrowserName("Firefox");
			//caps = DesiredCapabilities.firefox();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Utils.sleep(1000);
	}

}
