package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AdressBookPage;
import pages.ChangePasswordPage;
import pages.LogInPage;
import pages.MainPage;
import pages.NowosciPage;
import util.BasePage;
import util.Utils;

public class StepDefinitions {
	

	LogInPage loginPage;
	MainPage mainPage;
	NowosciPage nowosciPage;
	AdressBookPage adressBookPage;
	ChangePasswordPage changePasswordPage;
	
	/*------------------Login StepDefinition--------------------*/
	@Given("^User is on TaniaKsiazka main page$")
	public void user_is_on_TaniaKsiazka_main_page() throws Throwable {
		BasePage.initialize();
		mainPage = new MainPage();
	}

	@When("^User clicks on Log In link$")
	public void user_clicks_on_Log_In_link() throws Throwable {
		mainPage.goToLoginPage();
	}	

	@Then("^Log In page is displayed$")
	public void log_In_page_is_displayed() throws Throwable {
		loginPage = new LogInPage();
	}

	@When("^User types email$")
	public void user_types_email() throws Throwable {
		loginPage.typeEmail(Utils.email);
	}
	@And("^User types password$")
	public void user_types_password() throws Throwable {
		loginPage.typePassword(Utils.password);
	}

	@And("^User clicks Log in button$")
	public void user_clicks_Log_in_button() throws Throwable {
		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}
	@Then("^User is logged and username is displayed$")
	public void user_is_logged_and_username_is_displayed() throws Throwable {
		Assert.assertEquals("Twoje konto",BasePage.driver.findElement(By.xpath(".//*[contains(text(),'Twoje konto')]")).getText());
		}
	
	
	/*----------------------My AdressBook ----------------*/
	@When ("^User click on KsiazkaAdresowa link$")
	public void user_click_on_KsiazkaAdresowa_link() throws Throwable {
		mainPage.clickAdressBook();
	}
	@Then("^KsiazkaAdresowa page is displayed$")
	public void ksiazkaAdresowa_page_is_displayed() throws Throwable {
		adressBookPage = new AdressBookPage();
	}
	@When ("^User click add new adress button$")
	public void user_click_add_new_adress_button() throws Throwable {
		adressBookPage.addNewAdresslink();
	}	
	@And ("^User types name$")
	public void user_types_name()throws Throwable {
		adressBookPage.typeName(Utils.name);
	}
	@And ("^User types surname$")
	public void user_types_surname() throws Throwable {
		adressBookPage.typeSurname(Utils.surname);
	}
	@And ("^User types street and house number$")
	public void user_types_street_and_house_number() throws Throwable {
		adressBookPage.typeStreetHouseNumber(Utils.streetHouse);
	}
	@And("^User types postcode$")
	public void user_types_postcode() throws Throwable {
		adressBookPage.typePostcode(Utils.postcode);
	}
	@And ("^User types city$")
	public void user_types_city() throws Throwable {
		adressBookPage.typeCity(Utils.city);
	}
	@And ("^User enter phone number$")
	public void user_enter_phone_number() throws Throwable {
		adressBookPage.typePhoneNumber(Utils.phone);
	}
	@And ("^User click safe adress button$")
	public void user_click_safe_adress_button() throws Throwable {
		adressBookPage.safeAdresschanges();
	}
	
	/*------------------Your Account------------------*/

	@And ("^User click on Nowoci button$")
	public void user_click_on_Nowosci_button() throws Throwable {	
		mainPage.nowosciButton();
	}
	@Then ("^Nowoci page is displayed$")
	public void nowosci_page_is_displayed() throws Throwable {
		nowosciPage = new NowosciPage();
	}
	@And ("^User click TwojProfil Link$")
	public void user_click_TwojProfil_Link()throws Throwable {
		nowosciPage.goMyAccount();
	}
	@Then ("^Twoj profil page is displayed$") 
	public void twoj_profil_page_is_displayed() throws Throwable {
		Assert.assertEquals("Twoje konto",BasePage.driver.findElement(By.xpath(".//*[contains(text(),'Twoje konto')]")).getText());
	}
	
	/*-------------Change Password----------------*/
	
	@And ("^User click change pasword link$")
	public void user_click_change_pasword_link() throws Throwable {
		mainPage.scrollD();
		Thread.sleep(3000);
		mainPage.changePass();
		
	}
	@Then ("^Change password page is displayed$")
	public void change_password_page_is_displayed() throws Throwable {
		changePasswordPage = new ChangePasswordPage();
		
	}
	@And ("^User type and confirm the new password$")
	public void user_type_and_confirm_the_new_password() throws Throwable {
		Assert.assertEquals("Uzupełnij trzy poniższe pola, żeby zmienić hasło",BasePage.driver.findElement(By.xpath("//div[contains(text(),'Uzupełnij trzy poniższe pola, żeby zmienić hasło')]")).getText());
		changePasswordPage.typeOldPassword(Utils.password);
		Thread.sleep(2000);
		changePasswordPage.typeNewPassword(Utils.Npassword);
		Thread.sleep(2000);
		changePasswordPage.repeatNewPassword(Utils.Npassword);
		Thread.sleep(2000);
		changePasswordPage.scrollD();
		changePasswordPage.safeP();
		Thread.sleep(2000);
	}
	@Then ("^The password is changed$")
	public void the_password_is_changed() throws Throwable {
		Assert.assertEquals("Hasło zostało zmienione.",BasePage.driver.findElement(By.xpath("//div[@class='error accept']")).getText());
	}

	




}
