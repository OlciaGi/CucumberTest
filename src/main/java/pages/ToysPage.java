package pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class ToysPage extends BasePage {
	
	@FindBy(xpath = "//div[@class='col-sm-9']//li[1]//div[1]//div[1]//a[1]//img[1]")
	WebElement selectProduct;
	
	public ToysPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Zabawki dla dzieci", driver.getTitle());
	}

	public void scrollD() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
	}
	public void selectP() {
		selectProduct.click();
	}
}

