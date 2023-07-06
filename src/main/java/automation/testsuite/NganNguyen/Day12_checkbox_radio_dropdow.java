package automation.testsuite.NganNguyen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import automation.common.CommonBase;

public class Day12_checkbox_radio_dropdow extends CommonBase {

	// Check box
	@Test
	public void checkboxSelected() {
		// open link
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		WebElement checkboxElement = driver.findElement(By.id("isAgeSelected"));

		boolean isAgeSelected = checkboxElement.isSelected();
		if (isAgeSelected == false) {
			driver.findElement(By.id("isAgeSelected")).click();
		} else {
			System.out.println("isAgeSelected checked");
		}
		driver.close();
	}

	// Radio Button
	@Test
	public void radioBtDemoSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement radioElementMale = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));

		boolean radioIsSeleced = radioElementMale.isSelected();
		if (radioIsSeleced == false) {
			radioElementMale.click();
			System.out.println("Male checked");
		} else {
			driver.findElement(By.xpath("(//input[@value='Female'])[1]")).click();
			System.out.println("Female checked");
		}
		driver.close();
	}

	@Test
	public void dropdrowDemo() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		// WebElement dropdownDays =
		// driver.findElement(By.id("//select[@id='select-demo']"));
		Select selectDays = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		System.out.println("Dropdown co gia tri la" + selectDays.getOptions().size());
		driver.findElement(By.xpath("//select[@id='select-demo']")).click();
		selectDays.selectByVisibleText("Monday");
		By.id("//select[@id='select-demo']");
		System.out.println("Ban da chon" + selectDays.getFirstSelectedOption().getText());
		driver.close();

	}

}
