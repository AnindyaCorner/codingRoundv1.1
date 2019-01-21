package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnlineHotelBookingPage {
	
	//Declaration
	@FindBy(id = "Tags")
	private WebElement localityTextBox;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']/li[@class = 'list']")
	private List<WebElement> localityAutosuggestions;
	
	@FindBy(id="CheckInDate")
	private WebElement checkInDateBox;
	
	@FindBy(xpath = "//span[.='February']/../../..//a[.='23']")
	private WebElement checkInDate;
	
	@FindBy(id="CheckOutDate")
	private WebElement checkOutDateBox;
	
	@FindBy(xpath = "//span[.='February']/../../..//a[.='25']")
	private WebElement checkOutDate;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;
	
	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;
	
	//Initialization
	public OnlineHotelBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void enterLocality(String locality) {
		localityTextBox.clear();
		localityTextBox.sendKeys(locality);
	}
	
	public void selectFromLocalityAutosuggestions() {
		localityAutosuggestions.get(0).click();
	}
	
	public void pickCheckInDate() {
		checkInDateBox.click();
		checkInDate.click();
	}
	
	public void pickCheckOutDate() {
		checkOutDateBox.click();
		checkOutDate.click();
	}
	
	public void selectMembers() {
		new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
}
