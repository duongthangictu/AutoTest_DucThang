package flights_OneWay_ver2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;

public class FlightTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver(CT_Account.webURL_Flight);
	}
	
	@Test
	public void searchFlight() {
		FlightPage flightPage = new FlightPage(driver);
		flightPage.searchFlight("American", "Tokio", "01012023");
	}
	
	@AfterTest
	public void closeChrome() {
//		quitDriver(driver);
	}

}
