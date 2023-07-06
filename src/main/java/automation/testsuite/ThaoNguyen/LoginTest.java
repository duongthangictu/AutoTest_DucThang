package automation.testsuite.ThaoNguyen;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.PageLocatorThaoNguyen.*;
public class LoginTest extends CommonBase {
	WebDriver driver;
	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}
	@Test
	public void Loginsucessfully() {
		LoginPage login = new LoginPage(driver);
		login.LoginFuntion("admin@demo.com", "riseDemo");
		WebElement dashboard= driver.findElement(DashboardPage.textDashboard);
		assertTrue(dashboard.isDisplayed());
	}
	@Test
	public void Loginfail() {
		LoginPage login1 = new LoginPage(driver);
		login1.LoginFuntion("admin1@demo.com", "riseDemo");
		WebElement loginfail= driver.findElement(Loginfail.textErr);
		assertTrue(loginfail.isDisplayed());
	}
	@AfterTest
	public void closechromeDriver() {
		quitDriver(driver);
	}
	
}
