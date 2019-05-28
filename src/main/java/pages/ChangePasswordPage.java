package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;

public class ChangePasswordPage extends BasePage {
	
	@FindBy(xpath = "//input[@id='oldPass']")
	WebElement oldPassword;
	
	@FindBy(xpath = "//input[@id='newPass']")
	WebElement newPassword;
	
	@FindBy(xpath = "//input[@id='rptPass']")
	WebElement repeatPassword;
	
	@FindBy(xpath = "//button[contains(text(),'zapisz')]")
	WebElement safePassword;
	public ChangePasswordPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Moje konto › TaniaKsiazka.pl", driver.getTitle());
	}
	
	public void typeOldPassword (String password) {
		oldPassword.sendKeys(password);
	}
	public void typeNewPassword (String Npassword) {
		newPassword.sendKeys(Npassword);
	}
	public void repeatNewPassword (String Npassword) {
		repeatPassword.sendKeys(Npassword);
	}
	public void scrollD() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
	}
	public void safeP() {
		safePassword.click();
	}

}
