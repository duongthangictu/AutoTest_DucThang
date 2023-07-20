package flights_OneWay;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import automation.common.CommonBase;

public class Fill_InforSearchFlight extends CommonBase {
	WebDriver driver;

	@FindBy(xpath = "(//div[@id='myTabContent3']/descendant::input)[1]")
	private WebElement flyingFrom;

	@FindBy(xpath = "(//div[@id='myTabContent3']/descendant::input)[2]")
	private WebElement flyingTo;

	@FindBy(xpath = "(//input[@name='daterange-single'])[1]")
	private WebElement departing;

	@FindBy(xpath = "(//label[text()='Passengers']/following::div)[2]")
//	@FindBy(xpath = "(//label[text()='Passengers']/following::span)[1]")
	private WebElement passengers;

	@FindBy(xpath = "(//div[@class='qtyInc'])[1]")
	private WebElement adults_Add;

	@FindBy(xpath = "(//div[@class='qtyInc'])[2]")
	private WebElement children_Add;

	@FindBy(xpath = "(//div[@class='qtyInc'])[3]")
	private WebElement infants_Add;

	@FindBy(xpath = "(//div[@class='input-box'])[5]/descendant::button")
	private WebElement coach;

	@FindBy(xpath = "//span[text()='First class']")
//	@FindBy(xpath = "//span[text()='Business']")
	private WebElement coachValue;

//	@FindBy(xpath = "(//a[text()='Search Now']/parent::div)[1]")  // Not clicked
	@FindBy(xpath = "(//a[text()='Search Now'])[1]") // Click OK
	private WebElement btnSearchNow;

	public Fill_InforSearchFlight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillDataSearch(String _flyingFrom, String _flyingTo, String _departing) {
		flyingFrom.sendKeys(_flyingFrom);
		flyingTo.sendKeys(_flyingTo);

		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", departing);
		departing.clear();
		departing.sendKeys(_departing);
		departing.sendKeys(Keys.TAB);

		// Passengers
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", passengers);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", adults_Add);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", children_Add);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", infants_Add);

		// Coach
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", coach);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", coachValue);

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// btn Search Now
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", btnSearchNow);

	}
}
