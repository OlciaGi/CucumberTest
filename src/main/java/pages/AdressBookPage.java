package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BasePage;




public class AdressBookPage extends BasePage{
	
	@FindBy(xpath="//a[contains(text(),'dodaj nowy adres')]")
	WebElement addNewAdress;
	
	@FindBy(xpath="//input[@id='inputName']")
	WebElement addname;
	
	@FindBy(xpath="//input[@id='inputLastName']")
	WebElement addSurname;
	
	@FindBy(xpath ="//input[@id='inputNumber']")
	WebElement streetHouseNumber;
	
	@FindBy(xpath ="//input[@id='inputZipcode']")
	WebElement zipCode;
	
	@FindBy(xpath ="//input[@id='inputCity']")
	WebElement newCity;
	
	@FindBy(xpath ="//input[@id='inputPhone']")
	WebElement addPhoneNumber;
	
	@FindBy(xpath ="//button[contains(text(),'Zapisz adres')]")
	WebElement safeAdress;
	
	
	public AdressBookPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Tania książka", driver.getTitle());
	}
	


	public void addNewAdresslink() {
		addNewAdress.click();
	}
	public void typeName(String name) {
		addname.sendKeys(name);
	}
	public void typeSurname(String surname) {
		addSurname.sendKeys(surname);
	}
	public void typeStreetHouseNumber(String streetHouse) {
		streetHouseNumber.sendKeys(streetHouse);
	}
	public void typePostcode(String postcode) {
		zipCode.sendKeys(postcode);
	}
	public void typeCity(String city) {
		newCity.sendKeys(city);
	}
	public void typePhoneNumber(String phone) {
		addPhoneNumber.sendKeys(phone);
	}
	public void safeAdresschanges() {
		safeAdress.click();
		
	}

}
