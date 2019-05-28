package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class BasketPage extends BasePage {

	@FindBy(xpath = "//a[@class='more']")
	WebElement addMoreBook;
	
	public void moreBook() {
		addMoreBook.click();
	}
	public BasketPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Twój koszyk › TaniaKsiazka.pl", driver.getTitle());
	}
}
