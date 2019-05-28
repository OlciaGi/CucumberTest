package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import util.BasePage;

public class LogInPage extends BasePage {
	
	@FindBy(css="#loginEmail")
	WebElement emailTextBox;

	@FindBy(css="#loginPassword")
	WebElement passwordTextBox;
	
	@FindBy(css="div.container.with-below-header:nth-child(8) section.main:nth-child(3) div.col-big form.order-login.prevent-double-click p.login-buttons:nth-child(4) > button:nth-child(1)")
	WebElement loginButton;
	
	@FindBy(xpath = "//ul[@id='main-menu']//a[contains(text(),'Nowości')]")
	WebElement clickNew;

	public LogInPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Logowanie › TaniaKsiazka.pl", driver.getTitle());
	}
	
	public void typeEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void typePassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void clickNowosciButton() {
		clickNew.click();
	}
}
