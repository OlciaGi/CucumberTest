package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class NowosciPage extends BasePage {
	
	@FindBy(xpath ="//a[contains(text(),'Witaj, Aleksandra')]")
	WebElement myAccount;

	
	public void goMyAccount() {
		myAccount.click();
	}
	public NowosciPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Książkowe nowości wydawnicze w TaniaKsiazka.pl", driver.getTitle());
	}
}
