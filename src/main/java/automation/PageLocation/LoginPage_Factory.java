package automation.PageLocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Factory {
	WebDriver driver;
	@FindBy(id = "email")
	private WebElement txtEmailElement;

	@FindBy(id = "password")
	private WebElement txtPassworElement;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	private WebElement btnSubmitElement;

	@FindBy(xpath = "//div[normalize-space()='Authentication failed!']")
	public static WebElement errAuthenElement;

	public static By errAuthen = By.xpath("//div[normalize-space()='Authentication failed!']");

	public LoginPage_Factory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String email, String pass) {
		txtEmailElement.clear();
		txtEmailElement.sendKeys(email);
		txtPassworElement.clear();
		txtPassworElement.sendKeys(pass);
		btnSubmitElement.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
