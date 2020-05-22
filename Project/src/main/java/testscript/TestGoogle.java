package testscript;

import org.testng.annotations.Test;

import pageObject.pageobject.PageCommon;

public class TestGoogle extends TestCase {

	@Test
	public void testGoogle() {
		PageCommon pageCommon = new PageCommon(base.driver);
		pageCommon.enterSearchGoogle("Hau");
		pageCommon.clickOnFirstSuggestion();
	}
}