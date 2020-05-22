package pageObject.pageobject;

import org.openqa.selenium.WebDriver;

import pageObject.pageconst.PageCommonLocator;
import pageObject.pageobjectbase.PageObjectBase;

public class PageCommon extends PageObjectBase {

	public PageCommon(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void enterSearchGoogle(String value) {
		enterText(PageCommonLocator.txtFakebox, value);
		System.out.print("value");
	}
	
	public PageResult clickOnFirstSuggestion() {
		clickElement(PageCommonLocator.txtSuggestion);
		return new PageResult(base.driver);
	}

}
