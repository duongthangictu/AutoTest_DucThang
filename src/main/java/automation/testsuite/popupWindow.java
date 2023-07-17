package automation.testsuite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class popupWindow extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.guru99.com/popup.php");
	}

	@Test
	public void testPopupWindow() {
		click(By.xpath("//*[contains(@href,'popup.php')]"));

		String mainWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			System.out.println(window);
			if (!mainWindow.equals(window)) {
				driver.switchTo().window(window);
				pause(2000);
				System.out.println("Da chuyen den lop Window con");

				System.out.println("Title " + driver.switchTo().window(window).getTitle());
				System.out.println("CurrentTitle " + driver.switchTo().window(window).getCurrentUrl());
				type(By.name("emailid"), "duongthangDemo@gmail.com");
				click(By.name("btnLogin"));

				String text = driver.findElement(By.xpath("//table//td/h2")).getText();
				System.out.println(text);
				Assert.assertEquals(text, "Access details to demo site.");

				driver.close();

				// Switching to Parent window (main window)

				driver.switchTo().window(mainWindow);
				System.out.println("Chuyen ve Window chinh: " + driver.getCurrentUrl());
			}

		}

	}

	@AfterTest
	public void closeChrome() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // reset thành 0
		quitDriver(driver);
	}
}
