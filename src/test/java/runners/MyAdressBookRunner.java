package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import util.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/MyAdressBook.feature",
		glue = {"stepDefinitions"},
		strict=true
		)
public class MyAdressBookRunner {
	@AfterClass
	public static void tearDown() {
		BasePage.quitBrowser();
}
}