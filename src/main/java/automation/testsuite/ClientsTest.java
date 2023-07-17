package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.ClientsPage;
import automation.PageLocation.DashboardPage;
import automation.PageLocation.LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class ClientsTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDriver(CT_Account.webURL);
	}

	@Test
	public void addClientSuccesfully() {
		LoginPage_Factory loginPage_Factory = new LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo");

		DashboardPage dashboardPage = new DashboardPage(driver);

		ClientsPage addClients_Infor = new ClientsPage(driver);
		addClients_Infor.addClient("thangduong@demo.com", 0, "TN", "TN2", "TN3", "321", "TN", "0987588688",
				"ThangDuong2.com", "VAT_321", "GST_312");
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeChrome() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);  // reset thành 0
		quitDriver(driver);
	}

}
