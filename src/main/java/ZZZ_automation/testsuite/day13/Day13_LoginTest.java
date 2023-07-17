package ZZZ_automation.testsuite.day13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ZZZ_automation.PageLocation.Day13.Day13_LoginPage;
import ZZZ_automation.constant.day13.Day13_CT_Account;
import automation.PageLocation.DashboardPage;
import automation.common.CommonBase;

public class Day13_LoginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initChromeDriver(Day13_CT_Account.webURL);
	}

	@Test
	public void loginSuccesfully() {
		Day13_LoginPage login = new Day13_LoginPage(driver);
		login.Login("admin@demo.com", "riseDemo");

		// Kiem tra text cua trang Dashboard duoc hien thi sau khi dang nhap thanh cong
		WebElement titleDashboard = driver.findElement(DashboardPage.textDashboard);
		assertTrue(titleDashboard.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectPass() {
		Day13_LoginPage login = new Day13_LoginPage(driver);
		login.Login("admin@demo.com", "riseDemo_incorrect");

		// Kiem tra text Authentication cua trang Dashboard duoc hien thi sau khi dang
		// nhap thanh cong
		WebElement extError = driver.findElement(Day13_LoginPage.errorAuthenticationBy);
		assertTrue(extError.isDisplayed());
	}
	
	
	/*
	 * @Test public void loginFail_Email() { Day13_LoginPage login = new
	 * Day13_LoginPage(driver); login.Login("admin@demo.com_Incorrect", "riseDemo");
	 * }
	 */

	@AfterTest
	public void closeChromeDriver() {
		quitDriver(driver);

	}

}
