package automation.testsuite.ThangDuong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_Ver2 extends CommonBase {

	@Test
	public void isSingleCheckboxSelected() {

		// Open link
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.findElement(By.id("isAgeSelected"));

		boolean isSelected = false;
		if (isSelected == false) {
			System.out.println("Checkbox is not checked");
			driver.findElement(By.id("isAgeSelected")).click();
		} else {
			driver.findElement(By.id("isAgeSelected")).click();
			System.out.println("Add checked");
		}
		driver.close();

	}

	@Test
	public void isRadioButtonSelected() {
		// Open link
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

		System.out.println("=========================================");

		WebElement checkboxMale = driver.findElement(By.xpath("(//input[@value='Male' and @type='radio'])[1]"));
		checkboxMale.click();
		// Kiem tra xem checkbox Male da dc chon hay chua
		boolean isSelected = checkboxMale.isSelected();
		if (isSelected == false) {
			checkboxMale.click();
			System.out.println("Chua chon -> Click chon roi nhe");
		} else {
			WebElement checkboxFemale = driver.findElement(By.xpath("(//input[@value='Female' and @type='radio'])[1]"));
			checkboxFemale.click();
			System.out.println("Female No > Yes");
		}
		driver.close();

	}

	@Test
	public void selectDropdownlist() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select select = new Select(driver.findElement(By.id("select-demo")));

		System.out.println("Size is: " + select.getOptions().size());

		WebElement dropElement = driver.findElement(By.id("select-demo"));
		dropElement.click();

		select.selectByVisibleText("Monday");
		dropElement.click();

	}

}
