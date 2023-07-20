package alert_Day16;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertBasic_1 extends CommonBase {
	
	@BeforeTest
	public void openChrome() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}

	
	@Test
	public void TestAlert() {
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.name("submit")).submit();
		
//		driver.switchTo().alert().accept();  // Cach 1
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
}
