package bepAnToan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import automation.common.CommonBase;

public class OrderDetail extends CommonBase {

//	WebDriver driver;
//	private By txtHoVaTen = By.xpath("//input[@placeholder='Nhập họ và tên']");
	@FindBy(xpath = "//input[@placeholder='Nhập họ và tên']")
	private WebElement txtHoVaTen;

	@FindBy(xpath = "//input[@placeholder='Nhập số điện thoại']")
	private WebElement txtSDT;

	@FindBy(xpath = "//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']")
	private WebElement txtDiaChi;

	@FindBy(xpath = "//textarea[@placeholder='Nhập lưu ý']")
	private WebElement txtLuuY;

	@FindBy(xpath = "//input[@placeholder='Nhập họ và tên']")
	private WebElement nhapHoVaTen;
	
	@FindBy(xpath = "//span[text()='Thanh toán']")
	private WebElement btnThanhToan;
	
	private By btnTHanhToan1 = By.xpath("//span[text()='Thanh toán']");
	
//	@FindBy(xpath = "//h1[text()='Đặt Hàng Thành Công']")
//	private WebElement titleOrderDetailSuccess;
	public static By titleOrderDetailSuccess = By.xpath("//h1[text()='Đặt Hàng Thành Công']");
	
	public static By titleOrderDetail_FAIL_HoVaTen = By.xpath("//small[normalize-space()='Họ và tên không hợp lệ']");
	public static By titleOrderDetail_FAIL_SDT = By.xpath("//small[normalize-space()='Số điện thoại không hợp lệ']");
	public static By titleOrderDetail_FAIL_DiaChi = By.xpath("//small[normalize-space()='Địa chỉ không hợp lệ']");
	
	public OrderDetail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void orderProduct(String hoVaTen, String SDT, String diaChi, String luuY) {
//		pause(2000);
		txtHoVaTen.sendKeys(hoVaTen);
		txtSDT.sendKeys(SDT);
		txtDiaChi.sendKeys(diaChi);
		txtLuuY.sendKeys(luuY);
		
//		pause(2000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].click()", btnThanhToan);
		clickJavaScript(btnTHanhToan1);
		btnThanhToan.click();
//		pause(2000);
		
	}

}
