package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.DashboardPage;
import automation.PageLocation.LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class LoginTest_Factory extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		LoginPage_Factory loginPage = new LoginPage_Factory(driver);
		loginPage.LoginFunction("admin@demo.com", "riseDemo");

		WebElement titleLoginSuccesfully = driver.findElement(DashboardPage.titleSuccessDashboardBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectPass() {
		LoginPage_Factory loginPage_Factory = new LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo_Incorrect");

		WebElement errElement = driver.findElement(LoginPage_Factory.errAuthen);
		assertTrue(errElement.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		quitDriver(driver);
	}
}
