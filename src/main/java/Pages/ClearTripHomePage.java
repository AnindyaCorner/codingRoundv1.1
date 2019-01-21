package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearTripHomePage {
	
	//Declaration
	@FindBy(id="OneWay")
	private WebElement oneWayRadioButton;
	
	@FindBy(id= "FromTag")
	private WebElement sourceTextBox;
		
	@FindBy(id = "ToTag")
	private WebElement destTextBox;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']/li")
	private List<WebElement> originOptions;
	
	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	private List<WebElement> destinationOptions;
	
	@FindBy(id = "DepartDate")
	private WebElement departDateBox;
	
	@FindBy(xpath = "//span[.='February']/../../..//a[.='25']")
	private WebElement pickDepartDate;
	
	@FindBy(id="SearchBtn")
	private WebElement searchButton;
	
	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;
	
	@FindBy(xpath = "//span[.='Your trips']")
	private WebElement yourTripsOption;
	
	@FindBy(id = "SignIn")
	private WebElement signInOption;
	
	@FindBy(id = "signInButton")
	private WebElement signInButton;
	
	//Initialization
	public ClearTripHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickOnOneWayRadioButton() {
		if(!(oneWayRadioButton.isSelected()))
			oneWayRadioButton.click();
	}
	
	public void enterTextInSourceTextBox(String source) {
		sourceTextBox.clear();
		sourceTextBox.sendKeys(source);
	}
	
	public void enterTextInDestTextBox(String dest) {
		destTextBox.clear();
		destTextBox.sendKeys(dest);
	}
	
	public void selectOrigin() {
		originOptions.get(0).click();
	}
	
	public void selectDestination() {
		destinationOptions.get(0).click();
	}
	
	public void pickUpDepartDate() {
		departDateBox.click();
		pickDepartDate.click();
	}
	
	public void clickSearchBtn() {
		searchButton.click();
	}
	
	public void clickHotelLink() {
		hotelLink.click();
	}
	
	public void clickYourTripsOption() {
		yourTripsOption.click();
	}
	
	public void clickSignInOption() {
		signInOption.click();
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}

}
