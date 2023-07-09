package day13_ver3;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day13_ver3_LoginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day13_ver3_CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		Day13_ver3_LoginPage loginPage = new Day13_ver3_LoginPage(driver);
		loginPage.login("admin@demo.com", "riseDemo");

		WebElement titleDashboardLoginSuccessElement = driver.findElement(Day13_ver3_DashboardPage.textSuccessLogin);
		assertTrue(titleDashboardLoginSuccessElement.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectEmail() {
		Day13_ver3_LoginPage loginPage = new Day13_ver3_LoginPage(driver);
		loginPage.login("IncorrectEmail_admin@demo.com", "riseDemo");

		WebElement errElement = driver.findElement(Day13_ver3_LoginPage.errAuthenticaion);
		assertTrue(errElement.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectPass() {
		Day13_ver3_LoginPage loginPage = new Day13_ver3_LoginPage(driver);
		loginPage.login("admin@demo.com", "riseDemo_Incorrect");

		WebElement errElement = driver.findElement(Day13_ver3_LoginPage.errAuthenticaion);
		assertTrue(errElement.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		driver.close();
	}

}
