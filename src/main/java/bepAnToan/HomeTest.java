package bepAnToan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class HomeTest extends CommonBase {
//	WebDriver driver;
	
	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver("https://bepantoan.vn/");
	}
	
	@Test
	public void filterTes_HomePage() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();
		
		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProductSuccess("abc", "0998878555", "123", "123");
		
	}
	
	@AfterTest
	public void closeChome() {
		pause(4000);
		quitDriver(driver);
	}

}
