package pageObject.pageobject;

import org.openqa.selenium.WebDriver;

import pageObject.pageconst.PageCommonLocator;
import pageObject.pageobjectbase.PageObjectBase;

public class PageResult extends PageObjectBase {

	public PageResult(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickOnHyperlink(int number) {
		clickElement(PageCommonLocator.txtLink.addParams(number));
	}

}
