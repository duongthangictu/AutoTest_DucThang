package automation.PageLocation_ThangDuong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Factory {
	public WebDriver driver;
	@FindBy(id="email")
	private WebElement textEmail;
	
	@FindBy(id="password")
	private WebElement textPass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement authenError;
	
	public LoginPage_Factory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this); // this thay thế cho 3 objec email, pass, btn trên
	}

	public void LoginFunction(String email, String pass) {
		textEmail.clear();
		textEmail.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		textPass.clear();
		textPass.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		btnSubmit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
