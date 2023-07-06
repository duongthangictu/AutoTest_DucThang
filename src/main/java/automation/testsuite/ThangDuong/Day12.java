package automation.testsuite.ThangDuong;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day12 extends automation.common.CommonBase {
	/*
	 * @BeforeMethod public void init() { driver =
	 * initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html"); }
	 * 
	 * 
	 */

	
	@Test
	public void isSingleCheckboxSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.findElement(By.id("isAgeSelected")).isSelected();
		boolean isAgeSelected = false;

		if (isAgeSelected == false) {
			driver.findElement(By.id("isAgeSelected")).click();
			System.out.println("\n\nCheckbox da duoc Click");
		}
		driver.close();
	}

	@Test
	public void isRadioButtonSelected() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		// TÌm locator cua Male radiobutton và lưu vào WebElement
		WebElement checkboxMale = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		checkboxMale.click(); // để có thể làm được TH else
		// Kiểm tra checkox Male đã đươc chọn hay chưa
		boolean isSelected = checkboxMale.isSelected();

		if (isSelected == false) {
			// Nếu false tức là checkbox chưa được chọn > Click chọn
			checkboxMale.click();
			System.out.println("Male radioButton is Selected");
		} else {
			// Nếu Male đã được chọn thì check vào Female còn lại
			// 1. Tìm locator cua Female 2. Click vào Female 3. In ra

			WebElement checkboxFemale = driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
			boolean isSelected_2 = checkboxFemale.isSelected();
			if (isSelected_2 == false) {
				// Nếu false tức là checkbox chưa được chọn > Click chọn
				checkboxFemale.click();
				System.out.println("Female radioButton is Selected");
			}
		}
		driver.close();
	}

	/*
	 * https://demo.seleniumeasy.com/basic-select-dropdown-demo.html 2. Tìm đến thẻ
	 * select là dropdownlist 3. Tìm size của dropdownlist 4. Chọn MOnday bằng 3
	 * cách 5. Sau khi chọn xog kiểm tra lại text đã đúng giá trị chọn hay chưa
	 * 
	 */

	@Test
	public void dropDownListChecked() {
		driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

		// B2
		Select select = new Select(driver.findElement(By.id("select-demo")));

		// B3
		System.out.println("\n\nSize: " + select.getOptions().size());

		// 4
		WebElement checkDropdownlistElement = driver.findElement(By.id("select-demo"));
		checkDropdownlistElement.click(); // Open dropdownlist
//		select.selectByVisibleText("Monday");
		// c2 de chon 1 gia tri trong dropdownlist:
		// select.selectByValue("Monday");
		select.selectByIndex(2);
		checkDropdownlistElement.click(); // Close dropdownlist

		/*
		 * org.testng.Assert.assertFalse(select.isMultiple());
		 * org.testng.Assert.assertEquals(7, select.getOptions().size());
		 */

	}

}