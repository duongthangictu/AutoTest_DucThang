package automation.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ZZZ_automation.PageLocation.Day13.LoginPage;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class LoginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}

	@Test
	public void loginSuccesfulluy() {
		LoginPage login = new LoginPage(driver);
		login.Login("admin@demo.com", "riseDemo");
	}

	@AfterTest
	public void closeChromeBrowser() {
		quitDriver(driver);
	}

}
               