package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class PuzzlePage extends BasePage{
	
	@FindBy(xpath ="//div[@class='add-to-wishlist']//a[contains(text(),'dodaj do schowka')]")
	WebElement addCupBoard;

	public PuzzlePage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Puzzle - Pucio. Co tu pasuje? Nasza Księgarnia w TaniaKsiazka.pl", driver.getTitle());
	}
	public void addCupBoardClick() {
		addCupBoard.click();
	}

}


