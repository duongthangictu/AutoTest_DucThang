package automation.PageLocation;

import org.openqa.selenium.By;

public class Day14_DashboardPage_Factory {
	public static By titleSuccessDashboardBy = By.xpath("//span[normalize-space()='Dashboard']");
	public static By clientsLinkBy = By.xpath("(//ul[@id='sidebar-menu']/descendant::li)[3]");

	public static By btnAddClientBy = By.xpath("//a[@title='Add client']");
}
