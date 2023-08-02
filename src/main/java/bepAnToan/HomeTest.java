package bepAnToan;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ZZZ_day13_ver3.Day13_ver3_DashboardPage;
import automation.common.CommonBase;

public class HomeTest extends CommonBase {

	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver("https://bepantoan.vn/");
	}

	@Test
	public void orderProduc_Success() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();

		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProduct("abc", "0998878555", "123", "123");

		WebElement titleSuccess = driver.findElement(OrderDetail.titleOrderDetailSuccess);
		assertTrue(titleSuccess.isDisplayed());
	}

	@Test
	public void orderProduc_Fail_BlankHoVaTen() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();

		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProduct("", "0998878555", "123", "123");

		WebElement titleFAIL = driver.findElement(OrderDetail.titleOrderDetail_FAIL_HoVaTen);
		assertTrue(titleFAIL.isDisplayed());
	}

	@Test
	public void orderProduc_Fail_BlankSDT() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();

		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProduct("abc", "", "123", "123");

		WebElement titleFAIL = driver.findElement(OrderDetail.titleOrderDetail_FAIL_SDT);
		assertTrue(titleFAIL.isDisplayed());
	}

	@Test
	public void orderProduc_Fail_BlankDiaChi() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();

		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProduct("abc", "0998878555", "", "123");

		WebElement titleFAIL = driver.findElement(OrderDetail.titleOrderDetail_FAIL_DiaChi);
		assertTrue(titleFAIL.isDisplayed());
	}

	@Test
	public void orderProduc_Fail_BlankAll() {
		HomePage homePage = new HomePage(driver);
		homePage.filterHomePage();

		DetailProduct detailProduct = new DetailProduct(driver);
		detailProduct.buyNow();

		OrderDetail orderDetail = new OrderDetail(driver);
		orderDetail.orderProduct("", "", "", "123");

		WebElement titleFAIL_HoTen = driver.findElement(OrderDetail.titleOrderDetail_FAIL_HoVaTen);
		assertTrue(titleFAIL_HoTen.isDisplayed());

		WebElement titleFAIL_SDT = driver.findElement(OrderDetail.titleOrderDetail_FAIL_SDT);
		assertTrue(titleFAIL_SDT.isDisplayed());

		WebElement titleFAIL_DiaChi = driver.findElement(OrderDetail.titleOrderDetail_FAIL_DiaChi);
		assertTrue(titleFAIL_DiaChi.isDisplayed());
	}

	@AfterTest
	public void closeChome() {
		pause(4000);
		quitDriver(driver);
	}

}
