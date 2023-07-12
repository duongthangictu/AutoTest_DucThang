package automation.PageLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	public static By textDashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");
	public static By titleSuccessDashboardBy = By.xpath("//span[normalize-space()='Dashboard']");
//	public static By clientsLinkBy = By.xpath("//span[normalize-space()='Clients']");
//	public static By btnAddClientBy = By.xpath("//a[@title='Add client']");

	@FindBy(xpath = "//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")
	public static By textDashboard2;

	@FindBy(xpath = "//span[@class='menu-text ' and normalize-space()='Clients']")
	public static WebElement clientsLink;

	public DashboardPage(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this); // this thay thế cho 3 objec email, pass, btn trên
	}
}
