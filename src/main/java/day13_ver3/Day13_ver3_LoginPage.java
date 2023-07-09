package day13_ver3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day13_ver3_LoginPage {
	WebDriver driver;
	private By textEmailBy = By.id("email");
	private By textPassBy = By.id("password");
	private By btnSignInBy = By.xpath("//button[normalize-space()='Sign in']");
	public static By errAuthenticaion = By.xpath("//div[normalize-space()='Authentication failed!']");

	public Day13_ver3_LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String email, String pass) {

		// Email
		WebElement textEmailElement = driver.findElement(textEmailBy);
		if (textEmailElement.isDisplayed()) {
			textEmailElement.clear();
			textEmailElement.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		// Pass
		WebElement textPassElement = driver.findElement(textPassBy);
		if (textPassElement.isDisplayed()) {
			textPassElement.clear();
			textPassElement.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		// Buton Sign In
		WebElement btnSignInElement = driver.findElement(btnSignInBy);
		if (btnSignInElement.isDisplayed()) {
			btnSignInElement.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}
}
