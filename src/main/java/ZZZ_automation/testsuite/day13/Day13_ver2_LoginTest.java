package ZZZ_automation.testsuite.day13;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ZZZ_automation.PageLocation.Day13.Day13_ver2_LoginPage;
import ZZZ_automation.constant.day13.Day13_ver2_CT_Acount;
import automation.PageLocation.DashboardPage;
import automation.common.CommonBase;

public class Day13_ver2_LoginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day13_ver2_CT_Acount.webURL);
	}

	@Test
	public void LoginSuccesfully() {
		Day13_ver2_LoginPage loginPage = new Day13_ver2_LoginPage(driver);
		loginPage.Login("admin@demo.com", "riseDemo");
		WebElement titleDashboardElement = driver.findElement(DashboardPage.textDashboard);
		assertTrue(titleDashboardElement.isDisplayed());
	}

	@Test
	public void LoginFail_IncorrectPass() {
		Day13_ver2_LoginPage loginPage = new Day13_ver2_LoginPage(driver);
		loginPage.Login("admin@demo.com", "riseDemo_IncorrectPass");
		WebElement errElement = driver.findElement(Day13_ver2_LoginPage.errAuthenticationBy);
		assertTrue(errElement.isDisplayed());
	}

	@Test
	public void loginFail_IncorrectEmail() {
		Day13_ver2_LoginPage loginPage = new Day13_ver2_LoginPage(driver);
		loginPage.Login("Incorrect_admin@demo.com", "riseDemo");
		WebElement errElement = driver.findElement(Day13_ver2_LoginPage.errAuthenticationBy);
		assertTrue(errElement.isDisplayed());
	}

	@AfterTest
	public void closeChrome() {
		driver.close();
	}

}
