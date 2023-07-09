package day13_ver4;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day13_ver4_LoginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day13_ver4_CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		Day13_ver4_LoginPage loginPage = new Day13_ver4_LoginPage(driver);
		loginPage.Login("admin@demo.com", "riseDemo");

		WebElement titleLoginSuccesfully = driver.findElement(Day13_ver4_DashboardPage.titleSuccessDashboardBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectEmail() {
		Day13_ver4_LoginPage loginPage = new Day13_ver4_LoginPage(driver);
		loginPage.Login("Incorrect_admin@demo.com", "riseDemo");

		WebElement titleLoginSuccesfully = driver.findElement(Day13_ver4_LoginPage.errAuthenBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@Test
	public void loginFail_Incorrectpass() {
		Day13_ver4_LoginPage loginPage = new Day13_ver4_LoginPage(driver);
		loginPage.Login("admin@demo.com", "riseDemo_Incorrect");

		WebElement titleLoginSuccesfully = driver.findElement(Day13_ver4_LoginPage.errAuthenBy);
		assertTrue(titleLoginSuccesfully.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		driver.close();
	}

}
