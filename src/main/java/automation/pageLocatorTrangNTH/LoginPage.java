package automation.pageLocatorTrangNTH;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage { 
	private static final String DashboardPage = null;
	WebDriver driver;
	private By textEmail = By.xpath("//input[@id='email']");
	private By textPass = By.xpath("//input[@id='password']");
	private By buttonLogin = By.xpath("//button[contains(text(),'Sign in')]");
	public static By errorAuthentication = By.xpath("//div[@class='alert alert-danger']");
	public static By ErrorUsername = By.xpath("//span[@class='Please enter a valid email address"); 
	public static By Emailisrequired = By.xpath("//span[@id='email-error']");
	public static By Emailisinvalid = By.xpath("//span[@id='email-error']");
	public static By PWisrequired = By.xpath("//span[@id='email-error']");
	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}
	public void Login(String email, String Pass) {
		// Nhập vào text box email
		WebElement txtEmail = driver.findElement(textEmail);
		if (txtEmail.isDisplayed()) {
			txtEmail.clear();
			txtEmail.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} 
		// Nhập vào text box Pass
		WebElement txtPass = driver.findElement(textEmail);
		if (txtPass.isDisplayed()) {
			txtPass.clear();
			txtEmail.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		// nhấp chuột vào button login
		WebElement btnLogin = driver.findElement(buttonLogin);
		if (btnLogin.isDisplayed()) {
			btnLogin.click();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		}
		// Kiểm tra text của trang dashboard được hiện thị sau khi đăng nhập thành cong
		//assertEquals(true,driver.findElement(By.xpath(DashboardPage))
		//.isDisplayed());	
	 }
}
