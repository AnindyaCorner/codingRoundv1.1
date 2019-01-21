package testPrograms;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Pages.ClearTripHomePage;
import Pages.OneWayJourneyResultsPage;

public class FlightBookingTest extends BaseTest {

	@Test

	public void testResultsDisplayForOneWayJourney() {

		
		ClearTripHomePage chp = new ClearTripHomePage(driver);
		OneWayJourneyResultsPage ojr = new OneWayJourneyResultsPage(driver);
		//Open the browser and enter the URL done by @BeforeMethod annotated method in BaseTest class
		
		//Wait for sometime
		waitFor(2000);
		
		//Click on one way radio button
		chp.clickOnOneWayRadioButton();
		
		//Enter city in from text box
		chp.enterTextInSourceTextBox("Bangalore");
		
		//Wait for autosuggestions to load
		waitFor(5000);
		
		//Select origin from autosuggestions
		chp.selectOrigin();
		
		//Enter city in To text box
		chp.enterTextInDestTextBox("Delhi");
		
		//Wait for autosuggestions to load
		waitFor(5000);
		
		//Select destination from autosuggestions
		chp.selectDestination();
		
		//Pick up depart date
		chp.pickUpDepartDate();

		// all fields filled in. Now click on search
		driver.findElement(By.id("SearchBtn")).click();

		waitFor(5000);

		// verify that result appears for the provided journey search

		Assert.assertTrue(ojr.isResultsPageDisplayed());
		Reporter.log("Results page is successfully displayed",true);

		
	}

	
}
