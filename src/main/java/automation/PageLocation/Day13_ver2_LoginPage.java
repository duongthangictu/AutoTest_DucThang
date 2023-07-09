package automation.PageLocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day13_ver2_LoginPage {
	WebDriver driver;
	private By textEmailBy = By.id("email");
	private By textPassBy = By.id("password");
	private By buttonLoginBy = By.xpath("//button[@type='submit']");
	public static By errAuthenticationBy = By.xpath("//div[@class='alert alert-danger']");
	
	public Day13_ver2_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Login(String email, String pass) {
		
		//email
		WebElement textEmailElement = driver.findElement(textEmailBy);
		if(textEmailElement.isDisplayed()) {
			textEmailElement.clear();
			textEmailElement.sendKeys(email);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		//pass
		WebElement textPassElement = driver.findElement(textPassBy);
		if(textPassElement.isDisplayed()) {
			textPassElement.clear();
			textPassElement.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		// button click Login
		WebElement btnLoginElement = driver.findElement(buttonLoginBy);
		if (btnLoginElement.isDisplayed()) {
			btnLoginElement.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}
}
