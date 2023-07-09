package automation.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import automation.PageLocation.LoginPage_Factory;
import automation.common.CommonBase;
import automation.constant.Day13_CT_Account;

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
