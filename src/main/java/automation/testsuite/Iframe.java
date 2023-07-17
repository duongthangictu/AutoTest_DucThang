package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Iframe extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://codestar.vn/");
	}

	@Test
	public void handleIframe() {
		System.out.println("Iframe total: " + driver.findElements(By.tagName("iframe")).size());
		By locator = By.xpath("//h2[text()='Đội ngũ giảng viên']");
		scrollToElement(locator);
		driver.switchTo().frame(1);
		type(By.id("account_phone"), "098999999");
		click(By.xpath("//button[text()='Gửi ngay']"));
	}

	@Test
	public void findIframe() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("So luong iframe " + size);
		for (int i = 0; i < size; i++) {
			driver.switchTo().frame(i);
			int numberOfIframe = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			System.out.println("Element can tim o vi tri: " + numberOfIframe);

			// Tro ve trang cha de tim kiem den het
			driver.switchTo().defaultContent();
		}
	}

	/*
	 * @AfterTest public void closeChrome() {
	 * driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // reset
	 * thành 0 quitDriver(driver); }
	 */

}
