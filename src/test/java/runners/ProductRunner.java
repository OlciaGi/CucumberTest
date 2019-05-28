package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import util.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/ProductPage.feature",
		glue = {"stepDefinitions"},
		strict=true
		)
public class ProductRunner {
	@AfterClass
	public static void tearDown() {
		BasePage.quitBrowser();
	}
}
