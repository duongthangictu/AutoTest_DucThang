package flights_OneWay_ver2;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.CommonBase;

public class FlightPage extends CommonBase {
	WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='City or airport'])[1]")
	private WebElement flyingFromElement;

	@FindBy(xpath = "(//input[@placeholder='City or airport'])[2]")
	private WebElement flyingToElement;

	@FindBy(xpath = "(//label[text()='Departing']/following::input)[1]")
	private WebElement departingElement;

	public FlightPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	}

	public void searchFlight(String _flyingFrom, String _flyingTo, String _departing) {
		flyingFromElement.sendKeys(_flyingFrom);
		pause(3000);
		flyingToElement.sendKeys(_flyingTo);
		pause(3000);
		departingElement.sendKeys(_departing);
	}

}
