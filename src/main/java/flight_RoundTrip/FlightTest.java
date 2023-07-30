package flight_RoundTrip;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class FlightTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
	}

	@Test
	public void flight() {
		FlightPage flightPage = new FlightPage(driver);
		flightPage.fillDataSearch("Pari", "Chiness");

//		WebElement searchResult = driver.findElement(FlightSearchResult.seachSuccesBy);
//		Assert.assertTrue(searchResult.isDisplayed());
		
	}

	@AfterTest
	public void closeChrome() {
//		quitDriver(driver);
	}
}
