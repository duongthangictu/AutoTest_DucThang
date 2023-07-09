package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.Day14_DashboardPage_Factory;
import automation.PageLocation.Day14_LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.Day14_CT_Account;

public class Day14_LoginTest_Factory extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day14_CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		Day14_LoginPage_Factory loginPage = new Day14_LoginPage_Factory(driver);
		loginPage.LoginFunction("admin@demo.com", "riseDemo");

		WebElement titleLoginSuccesfully = driver.findElement(Day14_DashboardPage_Factory.titleSuccessDashboardBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectPass() {
		Day14_LoginPage_Factory loginPage_Factory = new Day14_LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo_Incorrect");

		WebElement errElement = driver.findElement(Day14_LoginPage_Factory.errAuthen);
		assertTrue(errElement.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		quitDriver(driver);
	}
}
