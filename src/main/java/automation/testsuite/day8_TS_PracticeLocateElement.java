package automation.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day8_TS_PracticeLocateElement extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://bepantoan.vn/danh-muc/may-hut-mui"); // open link
		// initDriverTest da co trong automation.common.CommonBase
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}

	@Test
	public void Demo_TestCase() {
		//WebElement userEmail = driver.findElement(By.id("userId"));
		
		// WebElement password = driver.findElement(By.name("Password"));
		
		// Bep tu OK
		WebElement urlEmail = driver.findElement(By.className("object-contain w-auto h-full"));
		// may hut mui OK
		//WebElement mayHutmui = driver.findElement(By.className("nuxt-link-exact-active"));
	//	WebElement mayHutmui = driver.findElement(By.partialLinkText(" Máy Rửa"));
		
		
		// Lay theo Hyperlink
		WebElement hyper = driver.findElement(By.partialLinkText("Máy Hút Mùi Ống Khói"));
		System.out.println("User email is: " + hyper.toString());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	System.out.println("User email is: " + urlEmail.toString());
		//System.out.println("User email is: " + mayHutmui.toString());
	}

}
