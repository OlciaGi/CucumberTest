package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class CupBoardPage extends BasePage {
	
	@FindBy(xpath= "//h2[contains(text(),'Dodano produkt do schowka!')]")
	WebElement checkCupboard;
	
	public void prodAdded() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Dodano produkt do schowka!",checkCupboard.getText());
	}

}
