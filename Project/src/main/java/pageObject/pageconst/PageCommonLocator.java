package pageObject.pageconst;
import model.Locator;
import model.LocatorType;

public class PageCommonLocator {

	public static final Locator txtFakebox = new Locator("//input[@class='gLFyf gsfi']", LocatorType.XPATH);
	
	public static final Locator txtSuggestion = new Locator("//ul[@jsname='erkvQe']//li[1]",LocatorType.XPATH);
	
	public static final Locator txtLink = new Locator("(//div[@class='r']/a)[%]",LocatorType.XPATH);

}
