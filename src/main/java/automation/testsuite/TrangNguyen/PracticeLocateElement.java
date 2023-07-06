package automation.testsuite.TrangNguyen;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeLocateElement extends CommonBase {
	// CHuyeernr tới trang cần test
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://bepantoan.vn/danh-muc/may-hut-mui");

	}

	// Viết test
	@Test
	public void Testcase_Demo() {
		WebElement mayhutmui = driver.findElement(By.className("category-menus"));
		System.err.println("may hut mùi" + mayhutmui.toString());

	}

	// quay về trang trước đó
	public void backtopage() {
		driver.navigate().back();
	}

	// Làm mới trang hiện tại
	public void reloadpage() {
		driver.navigate().refresh();
	}
}
