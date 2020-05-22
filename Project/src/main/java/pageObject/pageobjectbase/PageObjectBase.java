package pageObject.pageobjectbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Utils;
import common.WebDriverBase;
import model.Locator;

public class PageObjectBase {
	protected WebDriverBase base;

	public PageObjectBase() {
		base = new WebDriverBase();
	}

	public PageObjectBase(WebDriver driver) {
		this();
		this.base.driver = driver;
	}

	private WebElement getWebElement(Locator locator) {
		try {
			switch (locator.getType()) {
			case XPATH:
				return base.driver.findElement(By.xpath(locator.getLocator()));
			case ID:
				return base.driver.findElement(By.id(locator.getLocator()));
			case NAME:
				return base.driver.findElement(By.name(locator.getLocator()));
			case CLASS:
				return base.driver.findElement(By.className(locator.getLocator()));
			case TAG_NAME:
				return base.driver.findElement(By.tagName(locator.getLocator()));
			case LINK_TEXT:
				return base.driver.findElement(By.linkText(locator.getLocator()));
			case CSS:
				return base.driver.findElement(By.cssSelector(locator.getLocator()));
			default:
				return null;
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.err.println(">>Could not found element: " + locator.toString());
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unused")
	private void click() {

	}

	protected void clickElement(Locator locator) {
		WebElement element = this.getWebElement(locator);
		element.click();

	}

	@SuppressWarnings("unused")
	private void enter() {

	}

	protected void enterText(Locator locator, String value) {
		WebElement element = this.getWebElement(locator);
		System.out.println(locator);
		element.sendKeys(value);
		Utils.sleep(200);
	}

}
