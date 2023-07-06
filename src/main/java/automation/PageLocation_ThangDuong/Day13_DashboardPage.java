package automation.PageLocation_ThangDuong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day13_DashboardPage {
	WebDriver driver;

	public static By textDashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");

	@FindBy(xpath = "//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")
	public static By textDashboard2;


	public Day13_DashboardPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this); // this thay thế cho 3 objec email, pass, btn trên
	}
}
