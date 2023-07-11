package automation.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import ZZZ_automation.PageLocation.Day13.LoginPage_Factory;
import ZZZ_automation.constant.day13.Day13_CT_Account;
import automation.common.CommonBase;

public class ClientTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initDriverTest(Day13_CT_Account.webURL);
	}
	
	public void addClient() {
		LoginPage_Factory loginPage_Factory = new LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo");
		
		//gọi hàm addClient bên ClientPage
		
	}
	
	
}
