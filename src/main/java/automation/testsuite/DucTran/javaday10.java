package automation.testsuite.DucTran;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class javaday10 extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://bepantoan.vn/danh-muc/bep-tu");
	} 
	@Test
	public void Demo_Testcase() {
		WebElement menulink = driver.findElement(By.xpath("//h1[contains(text(),'TOP 300+ Mẫu Bếp Từ Nhập Khẩu Có Inventer Tiết Kiệm Điện')]"));
		System.out.println("Open Bep Tu" + menulink.toString());
		
		WebElement mayruachenbat = driver.findElement(By.xpath("//a[contains(text(),' Máy Rửa Chén Bát')]"));
		System.out.println("Open Bep Tu" + mayruachenbat.toString());
		 
}
}