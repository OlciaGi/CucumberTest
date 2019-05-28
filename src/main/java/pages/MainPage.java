package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import util.BasePage;

public class MainPage extends BasePage {
	
	@FindBy(id ="logo")
	WebElement taniaksiazkaLogo;
	
	@FindBy(className="user-not-logged")
	WebElement login;
	
	@FindBy(xpath =".//*[@class='user']//a[contains(text(),'Wyloguj')]")
	WebElement logout;
	
	@FindBy(xpath="//a[@id='logo']//img")
	WebElement titleHeader;

	@FindBy(xpath ="//a[contains(text(),'Nowości')]")
	WebElement nowosciButton;
	
	@FindBy(xpath="//a[contains(text(),'Książka adresowa')]")
	WebElement adressBook;
	
	@FindBy(xpath="//strong[contains(text(),'Twoje konto')]")
	WebElement youAccount1;
	
	@FindBy(xpath = "//a[@class='arrow']")
	WebElement clickKategorie;
	
	@FindBy(xpath = "//ul[@class='vertical-col']//a[contains(text(),'Fantastyka')]")
	WebElement clickFantastyka;
	
	@FindBy(xpath="//input[@id='inputSearch']")
	WebElement searchArea;
	
	@FindBy(xpath="//button[@class='button']")
	WebElement searchButton;
	
	@FindBy(xpath="//li[@id='for-the-kids']//a//img")
	WebElement childCategorie;
	
	@FindBy(xpath="//div[@id='path-top']//a[contains(text(),'Zabawki')]")
	WebElement toysCategorie;
	
	@FindBy(css="div.container.with-below-header:nth-child(8) section.main:nth-child(3) div.col-big form.form.background-grey div.user-links:nth-child(9) > a:nth-child(1)")
	WebElement changePassword;

	public void nowosciButton() {
		nowosciButton.click();
	}
	
/*	@FindBy(xpath="//div[@id='p-personal']")
	WebElement personalHeader;*/
	
	public MainPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Tania książka - Tanie Książki i podręczniki", driver.getTitle());
	}
	
	public boolean taniaksiazkaIsVisible() {
		return taniaksiazkaLogo.isDisplayed();
	}
	
	public void goToHomePage() {
		taniaksiazkaLogo.click();
	}
	
	public void goToLoginPage() {		
		login.click();
	}
	
	public void logOut() {
		logout.click();
	}
	public void clickAdressBook() {
		Actions action = new Actions(driver);
		action.moveToElement(youAccount1).perform();
		adressBook.click();
	}

	public void clickfantastyka() {
		Actions action = new Actions(driver);
		action.moveToElement(clickKategorie).perform();
		clickFantastyka.click();
	}
	/*public void searchAreaclick() {
	searchArea.click();
	}*/
	public void searchAreaTypes() {
		searchArea.sendKeys("Igrzyska smierci");
	}
	public void searchButtonclick() {
		searchButton.click();
	}
	public void clickToys() {
		childCategorie.click();
		toysCategorie.click();
	}
	public void changePass() {
		changePassword.click();
	}
	public void scrollD() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
	}
}
