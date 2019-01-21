package testPrograms;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Pages.ClearTripHomePage;
import Pages.HotelSearchPage;
import Pages.OnlineHotelBookingPage;

public class HotelBookingTest extends BaseTest {

	@Test

	public void testHotelListPageDisplay() {

		ClearTripHomePage chp = new ClearTripHomePage(driver);
		OnlineHotelBookingPage hbp = new OnlineHotelBookingPage(driver);
		HotelSearchPage hsp = new HotelSearchPage(driver);

		// Open the browser and enter the URL done by @BeforeMethod annotated method in
		// BaseTest class

		// Wait for sometime
		waitFor(2000);

		// Click on hotels link
		chp.clickHotelLink();

		// Enter locality in the where text box
		hbp.enterLocality("Indiranagar, Bangalore");
		
		waitFor(3000);
		
		//Select suitable option from autosuggestions
		hbp.selectFromLocalityAutosuggestions();
		
		//Pick check in date
		hbp.pickCheckInDate();
		
		//Pick check out date
		hbp.pickCheckOutDate();

		//Select Travellers as 1 room, 2 adults
		hbp.selectMembers();

		//click on search button
		hbp.clickOnSearchButton();
		
		waitFor(5000);

		//verify whether hotel search page is displayed or not
		Assert.assertTrue(hsp.isSearchPageDisplayed());
		Reporter.log("Hotels search page is successfully displayed", true);
	}

}
