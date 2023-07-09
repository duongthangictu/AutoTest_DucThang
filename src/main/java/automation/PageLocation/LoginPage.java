package automation.PageLocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	private By textEmail = By.id("email");
	private By textPass = By.id("password");
	private By buttonLogin = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}

	public void Login(String email, String pass) {
		// Nhap textbox email
		WebElement txtEmail = driver.findElement(textEmail);
		if (txtEmail.isDisplayed()) {
			txtEmail.clear();
			txtEmail.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // cho doi
		}

		// Tuong tu password
		// Nhap textbox password
		WebElement txtPass = driver.findElement(textPass);
		if (txtPass.isDisplayed()) {
			txtPass.clear();
			txtPass.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // cho doi
		}
		
		// Click to button Login
		WebElement btnLogin = driver.findElement(buttonLogin);
		if(btnLogin.isDisplayed()) {
			btnLogin.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // cho doi
		}
		
		//Kiem tra text cua trang Dashboard duoc hien thi sau khi dang nhap thanh cong
		
		WebElement titleDashboard = driver.findElement(DashboardPage.textDashboard);
		Assert.assertTrue(titleDashboard.isDisplayed());

	}

}