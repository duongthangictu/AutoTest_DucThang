package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.Day13_ver2_DashboardPage;
import automation.PageLocation.Day13_ver2_LoginPage;
import automation.PageLocation.LoginPage;
import automation.common.CommonBase;
import automation.constant.Day13_ver2_CT_Acount;

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
		WebElement titleDashboardElement = driver.findElement(Day13_ver2_DashboardPage.textBashboardEBy);
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
