package automation.testsuite.ThangDuong;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import automation.PageLocation_ThangDuong.LoginPage_Factory;
import automation.common.CommonBase;
import automation.common.Day13_CT_Account_ThangDuong;

public class ClientTest extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openChromeDriver() {
		driver = initDriverTest(Day13_CT_Account_ThangDuong.webURL);
	}
	
	public void addClient() {
		LoginPage_Factory loginPage_Factory = new LoginPage_Factory(driver);
		loginPage_Factory.LoginFunction("admin@demo.com", "riseDemo");
		
		//gọi hàm addClient bên ClientPage
		
	}
	
	
}
