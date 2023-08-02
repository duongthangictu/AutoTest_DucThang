package bepAnToan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class HomePage extends CommonBase {
//	WebDriver driver;
	private By bepTu = By.xpath("(//div[@id='megaMenu']/following::a)[1]"); // Bếp từ
	private By hangSanXuat = By.xpath("((//div[@class='category-menus'])[2]/descendant::img)[1]"); // Hang san xuat
	private By mucGia = By.xpath("((//div[@class='category-menus'])[3]/descendant::span)[5]"); // Muc gia: >15tr
	private By xemThem = By.xpath("((//div[@class='category-menus'])[4]/descendant::span)[33]");
	private By GermanyValue = By.xpath("((//div[@class='category-menus'])[4]/descendant::span)[19]");
	private By soBepValue = By.xpath("(((//div[@class='category-menus']))[5]/descendant::span)[5]");
	private By sanPhanFirst = By.xpath("((//div[@class='relative'])[4]/descendant::img)[1]");
//	private By sanPhanFirst = By.xpath("(//div[@class='flex flex-wrap product-list']/descendant::div)[4]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void filterHomePage() {
		// Bosch > hon 15tr > Germany > 3 bep

		click(bepTu);
		pause(2000);
		click(hangSanXuat);
		pause(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,350)");
		click(mucGia);
		click(xemThem);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
		click(GermanyValue);
		click(soBepValue);
		pause(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
		click(sanPhanFirst);
		pause(500);

	}

}
