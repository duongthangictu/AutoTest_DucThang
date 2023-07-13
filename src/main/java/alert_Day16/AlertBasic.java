package alert_Day16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertBasic extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDirvier("https://demo.guru99.com/test/delete_customer.php");
	}

	@Test
	public void TestAlert() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.name("submit")).submit();

		// Khai bao chuyen huong den doi tuong
		Alert alert = driver.switchTo().alert();

		// get message tren alert
		String alertMessage = driver.switchTo().alert().getText();

		// Hien ra tren console noi dung cua alert message
		System.out.println(alertMessage);
		Thread.sleep(2000);

//		driver.switchTo().alert().accept(); // cach 1 > ko can dung: Alert alert = driver.switchTo().alert();
//		alert.accept(); // Cachs 2 > can dung: Alert alert = driver.switchTo().alert();

		alert.dismiss();
		Thread.sleep(2000);
	}
}
