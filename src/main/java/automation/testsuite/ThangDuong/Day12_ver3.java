package automation.testsuite.ThangDuong;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day12_ver3 extends CommonBase {

	// Check box
	@Test
	public void checkboxSelected() {
		// open link
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		WebElement checkboxElement = driver.findElement(By.id("isAgeSelected"));
		// de check TH else
		// checkboxElement.click();

		boolean isAgeSelected = checkboxElement.isSelected();
		if (isAgeSelected == false) {
			driver.findElement(By.id("isAgeSelected")).click();
			System.out.println("Status isAgeSelected: No > Yes");
		} else {
			System.out.println("isAgeSelected checked");
		}
		driver.close();

	}

	// Radio Button Dem
	@Test
	public void radioButtonDemoSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement radioElementMale = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));

		//radioElementMale.click();  check TH else
		boolean radioIsSeleced = radioElementMale.isSelected();
		if (radioIsSeleced == false) {
			radioElementMale.click();
			System.out.println("Male checked: No > Yes");
		} else {
			// Neu male dc chon > click chon Female
			driver.findElement(By.xpath("(//input[@value='Female'])[1]")).click();
			System.out.println("Female checked");
		}
		driver.close();
	}
	
	//select dropdown list
	
	@Test
	public void dropdownList() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select select = new Select(driver.findElement(By.id("select-demo")));
		// Check size dropdown list
		System.out.println("Size is: " + select.getOptions().size());
		
		//click dropdown list
		driver.findElement(By.id("select-demo")).click();
		select.selectByVisibleText("Monday");
		driver.findElement(By.id("select-demo")).click();
		driver.close();
	}

}
