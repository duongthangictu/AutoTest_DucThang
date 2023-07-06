package automation.testsuite.ThangDuong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day9_Xpath extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://selectorshub.com/xpath-practice-page/"); // open link
	}

	@Test
	public void Demo_TestCase() {
		WebElement element = driver.findElement(By.xpath("//tr[@class='usr_acn'][2] | tr[@class='usr_acn'][3]"));
		System.out.println("User email is: " + element.toString());

	}
}
