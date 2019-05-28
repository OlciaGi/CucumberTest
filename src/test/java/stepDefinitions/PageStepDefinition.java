package stepDefinitions;



import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BasketPage;
import pages.CategoriePage;
import pages.CupBoardPage;
import pages.MainPage;
import pages.ProductPage;
import pages.PuzzlePage;
import pages.SelectedProductPage;
import pages.SerchesProductPage;
import pages.ToysPage;
import util.BasePage;
import util.Utils;

public class PageStepDefinition {
	
	CategoriePage categoriePage;
	MainPage mainPage;
	ProductPage productPage;
	SelectedProductPage selPPage;
	SerchesProductPage searchPage;
	BasketPage basketPage;
	ToysPage toysPage;
	CupBoardPage cupboardPage;
	PuzzlePage puzzlePage;
	
	/*----------------Store Structure---------------*/
	
	@Given ("^User open TaniaKsiazka page$")
	public void user_open_TaniaKsiazka_page()throws Throwable {
		BasePage.initialize();
		mainPage = new MainPage();
	}
	@When ("^User chose Fantastyka from categories$")
	public void user_chose_Fantastyka_from_categories() throws Throwable {
		mainPage.clickfantastyka();
		Thread.sleep(3000);
	}
	@Then ("^Page with Fantastyka books is displayed$")
	public void page_with_Fantastyka_books_is_displayed() throws Throwable {
		categoriePage = new CategoriePage();
	}
	
	/*------------Search On Page--------------*/
	
	@When ("^User type searched phrase$")
	public void user_type_searched_phrase() throws Throwable {
		mainPage.searchAreaTypes();
	}
	@And ("^User click enter$")
	public void user_click_enter() throws Throwable {
		mainPage.searchButtonclick();
		Thread.sleep(4000);
	}
	@Then("^Searched phrase is displayed$")
	public void searched_phrase_is_displayed() throws Throwable {
		searchPage = new SerchesProductPage();
	}
	/*-----------Selected Product--------------*/
	
	//Zaczyna sie od tego stepu bo korzysta z store structure
	@And ("^User click on Book$")
	public void user_click_on_Book() throws Throwable {
		categoriePage.clickBook1();
	}
	@Then ("^Product page are displayed$")
	public void product_page_are_displayed() throws Throwable {
		selPPage = new SelectedProductPage();	
		Thread.sleep(3000);
	}
	@And ("^User adds book to the basket$") 
	public void user_adds_book_to_the_basket() throws Throwable {
		selPPage.scrollD();
		selPPage.addToCart ();
	}
	@Then ("^Book added to the basket$") 
	public void book_added_to_thr_basket() throws Throwable {
		Assert.assertEquals("Produkt dodany do koszyka",BasePage.driver.findElement(By.xpath("//article[@class='koszyk-dodaj book-list']//header")).getText());
	}
	
	/*---------------Product Page------------*/
	
	@And ("^User tapes minimum price$") 
	public void user_tapes_minimum_peice() throws Throwable {
		categoriePage.addMinPrice(Utils.minpice);
		categoriePage.pressEnter2();
		Thread.sleep(5000);
	}
	@And ("^User tapes maximum price$") 
	public void user_tapes_maximum_price() throws Throwable {
		categoriePage.addMaxPrice(Utils.maxprice);
		categoriePage.pressEnter1();
		Thread.sleep(5000);
	}	
	@Then ("^Products are displayed$")
	public void products_are_displayed() throws Throwable {
		searchPage = new SerchesProductPage();
	}
	
	/*---------------Basket--------------*/

	@And ("^User go to the my cart page$")
	public void user_go_to_the_my_cart_page() throws Throwable {
		selPPage.goBusket();
	}
	@Then ("^User has increased the number of books$")
	public void user_has_increased_the_number_of_book() throws Throwable {
		basketPage = new BasketPage();
		basketPage.moreBook();
		Thread.sleep(5000);
		basketPage.moreBook();
		Thread.sleep(5000);	
	}
	
	/*--------------------Safe Products---------------------*/
	
	@When ("^User chose categorie and subcategorie$")
	public void user_chose_categorie_and_subcategorie() throws Throwable {
		mainPage = new MainPage();
		mainPage.clickToys();
		toysPage = new ToysPage();
		toysPage.scrollD();
		Thread.sleep(2000);
		toysPage.scrollD();
		Thread.sleep(2000);
		toysPage.scrollD();
		Thread.sleep(2000);
	}
	@And ("^User select the subject and add to cupboard$")
	public void user_select_the_subject_and_add_to_cupboard() throws Throwable {
		toysPage = new ToysPage();
		Thread.sleep(2000);
		toysPage.selectP();
		Thread.sleep(2000);
		puzzlePage = new PuzzlePage();
		puzzlePage.addCupBoardClick();
		Thread.sleep(2000);
	}
	@Then ("^The product has been added to the cupboard$")
	public void The_product_has_been_added_to_the_cupboard() throws Throwable {
		cupboardPage = new CupBoardPage();
		cupboardPage.prodAdded();

	}
}
