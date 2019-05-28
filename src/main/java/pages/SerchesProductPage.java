package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class SerchesProductPage extends BasePage {

	
	public SerchesProductPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Igrzyska smierci", driver.getTitle());
	}
}
