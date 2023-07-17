package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Search extends CommonBase {
	
	@BeforeTest
	public void openWeb() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
	}
	
	@Test
	public void ChooseDatePicker() {
		WebElement dateBox = driver.findElement(By.xpath("(//label[text() ='Departing' ]/following-sibling:: div//input[@name='daterange-single'])[1]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", dateBox);
		
		dateBox.clear();
		dateBox.sendKeys("10102024");
		dateBox.sendKeys(Keys.TAB);
		System.out.println("Succesfully");
	}

}
