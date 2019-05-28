package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class CategoriePage extends BasePage{
	
	@FindBy(xpath="//input[@id='params_price_from']")
	WebElement minPrice;
	
	@FindBy(xpath="//input[@id='params_price_to']")
	WebElement maxPrice;
	
	@FindBy(xpath="//div[@class='col-sm-9']//li[1]//div[1]//div[1]//a[1]//img[1]")
	WebElement selectedBook;


	public CategoriePage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Fantastyka i fantasy", driver.getTitle());
	}
	public void addMinPrice(String minprice) {
		minPrice.sendKeys(minprice);
	}
	public void addMaxPrice(String maxprice) {
		maxPrice.sendKeys(maxprice);
		
	}
	public void pressEnter1() {
		maxPrice.sendKeys(Keys.ENTER);
	}
	public void pressEnter2() {
		minPrice.sendKeys(Keys.ENTER);
	}
	   public void clickBook1() {
	    	selectedBook.click();

}
}
