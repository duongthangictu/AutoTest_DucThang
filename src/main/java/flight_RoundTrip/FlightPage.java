package flight_RoundTrip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.CommonBase;

public class FlightPage extends CommonBase {
	WebDriver driver;

	@FindBy(xpath = "//a[@id='round-trip-tab']")
	private WebElement rdoRoundTripElement;

	@FindBy(xpath = "(//input[@placeholder='City or airport'])[3]")
	private WebElement flyingFromElement;

	@FindBy(xpath = "(//input[@placeholder='City or airport'])[4]")
	private WebElement flyingToElement;

	// Departing - Returning ---------------
	@FindBy(xpath = "(//label[text()='Departing - Returning']/following::input)[1]")
	private WebElement departingReturningElement;

	@FindBy(xpath = "(//table[@class='table-condensed'])[1]")
	private WebElement calendarLeft;

	@FindBy(xpath = "(//table[@class='table-condensed'])[2]")
	private WebElement calendarRight;

	// 09072023
	@FindBy(xpath = "((//table[@class='table-condensed'])[1] )//tr[3]/td[1]")
	private WebElement leftValueElement;

	// 13082023
	@FindBy(xpath = "((//table[@class='table-condensed'])[2] )//tr[3]/td[1]")
	private WebElement rightValueElement;

	// Passengers ------------
	@FindBy(xpath = "((//label[text()='Passengers'])[2]//following::span)[1]")
	private WebElement passengersElement;
	@FindBy(xpath = "(//div[@class='qtyInc'])[4]")
	private WebElement adults_Add;
	@FindBy(xpath = "(//div[@class='qtyInc'])[5]")
	private WebElement children_Add;
	@FindBy(xpath = "(//div[@class='qtyInc'])[6]")
	private WebElement infants_Add;

	// Coach --------------
	@FindBy(xpath = "((//label[normalize-space()='Coach'])[2]/following::div)[3]")
	private WebElement coachElement;
	@FindBy(xpath = "(//div[@id='bs-select-4']/descendant::span)[2]")
	private WebElement businessElement;

	@FindBy(xpath = "(//button[text()='Apply'])[1]")
	private WebElement btnApply;

	@FindBy(xpath = "(//a[text()='Search Now'])[2]")
	private WebElement btnSearchElement;

	@FindBy(xpath = "(//a[normalize-space()='Advanced options'])[1]")
	private WebElement advancedOptionsElement;
	
	@FindBy(xpath = "(//div[text()='No preference'])[1]")
	private WebElement droElement;
	
	

	@FindBy(xpath = "//span[text()='Aegean']")
	private WebElement Aegean_Value;

	public FlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillDataSearch(String flyingFrom, String flyingTo) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", rdoRoundTripElement);
		pause(1000);

		flyingFromElement.clear();
		flyingFromElement.sendKeys(flyingFrom);

		flyingToElement.clear();
		flyingToElement.sendKeys(flyingTo);
		
		pause(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", departingReturningElement);
		departingReturningElement.clear();
		pause(500);
		leftValueElement.click();  // OK
//		leftValueElement.sendKeys("02022023"); // Not OK
//		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','02022023')", leftValueElement); / Not OK
		
		pause(500);
		rightValueElement.click();  // OK
		pause(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", btnApply);
		pause(500);

		passengersElement.click();
		pause(500);
		adults_Add.click();
		children_Add.click();
		infants_Add.click();
		pause(500);

		coachElement.click();
		pause(500);
		businessElement.click();
		pause(500);

		((JavascriptExecutor) driver).executeScript("arguments[0].click()", advancedOptionsElement);
		pause(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", droElement);
		pause(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", Aegean_Value);
		pause(500);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click()", btnSearchElement);
		pause(1000);
	}

}
