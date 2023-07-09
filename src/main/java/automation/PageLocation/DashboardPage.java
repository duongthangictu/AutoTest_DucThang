package automation.PageLocation;

import org.openqa.selenium.By;

public class DashboardPage {
	public static By textDashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");
	public static By ClientsLink = By.xpath("");  // để nhấn vào menu "Clients" bên trái
	
	
	// Day 14
	public static By titleSuccessDashboardBy = By.xpath("//span[normalize-space()='Dashboard']");
	public static By clientsLinkBy = By.xpath("(//ul[@id='sidebar-menu']/descendant::li)[3]");
}
