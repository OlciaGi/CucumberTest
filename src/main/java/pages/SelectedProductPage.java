package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class SelectedProductPage extends BasePage{
	
	@FindBy(css="div.container.with-below-header:nth-child(8) section.main:nth-child(3) div.col-right1.col-book:nth-child(3) aside.book-price.updateable:nth-child(1) div.book-price-bg div.our-price:nth-child(5) form.book-details:nth-child(2) > button.add-to-cart:nth-child(2)")
	WebElement addtoCart;
	
	@FindBy(xpath = "//a[contains(text(),'Koszyk')]")
	WebElement goToBasket;
	
	public void goBusket() {
		goToBasket.click();
	}
	public void addToCart ()
	{
		addtoCart.click();
	}
	public void scrollD() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	public  SelectedProductPage() {
			PageFactory.initElements(driver, this);
			Assert.assertEquals("Szklany tron. Tom 6. Królestwo popiołów. Część 1 (Sarah J. Maas) książka w księgarni TaniaKsiazka.pl", driver.getTitle());
		}
	}

