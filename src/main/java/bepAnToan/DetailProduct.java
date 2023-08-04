package bepAnToan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.common.CommonBase;

public class DetailProduct extends CommonBase {
	private By outer_Click = By.xpath("//span[text()='tại sao mua hàng ở bếp an toàn']");
	private By muaNgay = By.xpath("(//span[text()='Giao hàng và lắp đặt miễn phí 100%'])[1]");

	public DetailProduct(WebDriver driver) {
		this.driver = driver;
	}

	// Chuc nang Mua ngay
	public void buyNow() {
		click(outer_Click); // click ra 1 cho bat ki
//		pause(500);
		click(muaNgay);
	}

}
