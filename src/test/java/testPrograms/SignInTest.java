package testPrograms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Pages.ClearTripHomePage;

public class SignInTest extends BaseTest {

	@Test

	public void testErrorMessageForMissingSignInDetails() {

		ClearTripHomePage chp = new ClearTripHomePage(driver);
		// Open the browser and enter the URL done by @BeforeMethod annotated method in
		// BaseTest class

		// Wait for sometime
		waitFor(2000);

		// Click on Your trips option
		chp.clickYourTripsOption();

		waitFor(2000);

		// Click on sign in option
		chp.clickSignInOption();

		waitFor(2000);

		// Switch to frame
		driver.switchTo().frame("modal_window");

		// Without filling in the details click on sign in button
		chp.clickSignInButton();

		waitFor(2000);
		
		//Check for and verify the error message
		Assert.assertTrue(
				driver.findElement(By.id("errors1")).getText().contains("There were errors in your submission"));

		Reporter.log("Error Message is successfully displayed",true);
	}

}
