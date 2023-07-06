package automation.PageLocation_ThangDuong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day13_LoginPage {
	WebDriver driver;
	private By textEmail = By.id("email");
	private By textPass = By.id("password");
	private By buttonLogin = By.xpath("//button[@type='submit']");
	public static By errorAuthenticationBy = By.xpath("//div[@class='alert alert-danger']");

	// constructor
	public Day13_LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}

	public void Login(String email, String pass) {
		// input Email
		WebElement txtEmail = driver.findElement(textEmail);
		if (txtEmail.isDisplayed()) {
			txtEmail.clear();
			txtEmail.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}

		// input pass
		WebElement txtPass = driver.findElement(textPass);
		if (txtPass.isDisplayed()) {
			txtPass.clear();
			txtPass.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}

		// Click button Login
		WebElement btnLogin = driver.findElement(buttonLogin);
		if (btnLogin.isDisplayed()) {
			btnLogin.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}

		// Kiem tra text cua trang Dashboard duoc hien thi sau khi dang nhap thanh cong
		/* >> Di chuyen sang Day13_LoginTest để vào case Login succesfully
		 * WebElement titleDashboard =
		 * driver.findElement(Day13_DashboardPage.textDashboard);
		 * assertTrue(titleDashboard.isDisplayed());
		 */
	}

}
