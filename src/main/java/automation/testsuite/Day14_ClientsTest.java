package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocation.Day14_ClientsPage;
import automation.PageLocation.Day14_DashboardPage_Factory;
import automation.PageLocation.Day14_LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.Day14_CT_Account;

public class Day14_ClientsTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void initChrome() {
		driver = initChromeDirvier(Day14_CT_Account.webURL);
	}

	@Test
	public void addClient() {
		Day14_LoginPage_Factory loginPage_Factory = new Day14_LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo");

		// sau khi login thanh cong > click Clients linh trong Dashboard > Click button
		// Add client

		WebElement clientLinkElement = driver.findElement(Day14_DashboardPage_Factory.clientsLinkBy);
		clientLinkElement.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement btnAddClientElement = driver.findElement(Day14_DashboardPage_Factory.btnAddClientBy);
		btnAddClientElement.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Day14_ClientsPage addClients_Infor = new Day14_ClientsPage(driver);
		addClients_Infor.addClient("abv", "HN");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
}
