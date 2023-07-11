package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite.ExistingSuite;

import automation.PageLocation.DashboardPage;
import automation.PageLocation.ClientsPage_Day14;
import automation.PageLocation.LoginPage_Factory_Day14;
import automation.common.CommonBase;
import automation.constant.Day14_CT_Account;
import net.sourceforge.htmlunit.corejs.javascript.commonjs.module.provider.StrongCachingModuleScriptProvider;

public class ClientsTest_Day14 extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day14_CT_Account.webURL);
	}

	@Test
	public void addClientSuccesfully() {
		LoginPage_Factory_Day14 loginPage_Factory = new LoginPage_Factory_Day14(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo");

		ClientsPage_Day14 addClients_Infor = new ClientsPage_Day14(driver);
		addClients_Infor.addClient("Thang Duong 3", "TN", "TN2", "TN3", "321", "TN", "0987588688", "ThangDuong2.com",
				"321", "312");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeChrome() {
		quitDriver(driver);
	}

}
