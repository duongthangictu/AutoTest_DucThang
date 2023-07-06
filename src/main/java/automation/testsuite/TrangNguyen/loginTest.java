package automation.testsuite.TrangNguyen;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocatorTrangNTH.*;

public class loginTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}

	@Test
	public void LoginSS() {
		LoginPage login = new LoginPage(driver);
		login.Login("admin@demo.com", "riseDemo");
	}	
	@Test
	public void LoginUnSS_not_Exist() {
		LoginPage login = new LoginPage(driver);
		login.Login("a1@demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage.errorAuthentication);
		assertTrue(txtError.isDisplayed());
	}

	@Test
	public void LoginUnSS_not_valid_username () {
		LoginPage login = new LoginPage(driver);
		login.Login("admin1@demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage.errorAuthentication);
		assertTrue(txtError.isDisplayed());
	}
	@Test
	public void LoginUnSS_username_is_Blank () {
		LoginPage login = new LoginPage(driver);
		login.Login("", "riseDemo"); 
		WebElement txtError = driver.findElement(LoginPage.Emailisrequired);
		assertTrue(txtError.isDisplayed());
	}

	@Test
	public void LoginUnSS_username_have_space_between () {
		LoginPage login = new LoginPage(driver);
		login.Login("admin @demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage.Emailisinvalid);
		assertTrue(txtError.isDisplayed());
	}

	@Test
	public void LoginUnSS_not_valid_password () {
		LoginPage login = new LoginPage(driver);
		login.Login("admin@demo.com", "rise1Dem1o");
		WebElement txtError = driver.findElement(LoginPage.errorAuthentication);
		assertTrue(txtError.isDisplayed());
	}
	@Test
	public void LoginUnSS_password_is_Blank () {
		LoginPage login = new LoginPage(driver);
		login.Login("admin@demo.com", "");
		WebElement txtError = driver.findElement(LoginPage.PWisrequired);
		assertTrue(txtError.isDisplayed());
	}
	
	@Test
	public void LoginUnSS_password_have_space_between () {
		LoginPage login = new LoginPage(driver);
		login.Login("admin@demo.com", "rise Demo");
		WebElement txtError = driver.findElement(LoginPage.errorAuthentication);
		assertTrue(txtError.isDisplayed());
	}
	@AfterTest
	public void closeChromeBrower() {
		quitDriver(driver);
	}
}