package alert_Day16;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertSenkeys extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}

	@Test
	public void TestAlert() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"))
				.click();
		Thread.sleep(2000);

		driver.switchTo().alert().sendKeys("====Hey boy=====");
		System.out.println();

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
}
