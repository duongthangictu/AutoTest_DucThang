package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.DashboardPage;
import automation.PageLocation.LoginPage_Factory_Day14;
import automation.common.CommonBase;
import automation.constant.Day14_CT_Account;

public class LoginTest_Factory_Day14 extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day14_CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		LoginPage_Factory_Day14 loginPage = new LoginPage_Factory_Day14(driver);
		loginPage.LoginFunction("admin@demo.com", "riseDemo");

		WebElement titleLoginSuccesfully = driver.findElement(DashboardPage.titleSuccessDashboardBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectPass() {
		LoginPage_Factory_Day14 loginPage_Factory = new LoginPage_Factory_Day14(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo_Incorrect");

		WebElement errElement = driver.findElement(LoginPage_Factory_Day14.errAuthen);
		assertTrue(errElement.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		quitDriver(driver);
	}
}
