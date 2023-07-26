package flights_OneWay;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Flight_Test extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver(CT_Account.webURL_Flight);
	}

	@Test
	public void flight() {
		Fill_InforSearchFlight search = new Fill_InforSearchFlight(driver);
		search.fillDataSearch("TN", "HCM", "05012024");

		// Check search thanh cong

		WebElement flightSearchResult = driver.findElement(By.xpath("//h2[text()='Flight Search Result']"));
		assertTrue(flightSearchResult.isDisplayed());
		System.out.println("Search OK");

		// (//a[text()='View Details'])[1]

		/*
		 * WebElement scrollTo =
		 * driver.findElement(By.xpath("(//a[text()='View Details'])[1]"));
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true)", scrollTo);
		 */

	}

	@AfterTest
	public void closeChrome() {
		// quitDriver(driver);
	}

}
