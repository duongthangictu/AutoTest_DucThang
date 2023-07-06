package automation.testsuite.TrangNguyen;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TS_PracticeLocateElement extends automation.common.CommonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://selectorshub.com/xpath-practice-page/");
	}

	@Test
	public void Demo_Testcase() {
		WebElement userEmail = driver.findElement(By.xpath("//tr[@class='usr_acn'][2]")); 
		System.out.println("user email is" + userEmail.toString());
		
		WebElement userEmail1 = driver.findElement(By.xpath("//tr[@class='plan rit'][last()]")); 
		System.out.println("user email is" + userEmail1.toString());
		
		WebElement userEmail12 = driver.findElement(By.xpath("//tr[@class='plan rit'][position()]")); 
		System.out.println("user email is" + userEmail12.toString());
		
		WebElement userEmail123 = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr[position()=1]")); 
		System.out.println("user email is" + userEmail123.toString());
		
		WebElement userEmail2 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[position()=3]")); 
		System.out.println("user email is" + userEmail2.toString());
		// /. lấy chính ra cái thẻ đó 	
		WebElement userEmai3 = driver.findElement(By.xpath("//table[@id='resultTable']/.")); 
		System.out.println("user email is" + userEmai3.toString());
		// /.. tìm ra tk cha hiện tại
		WebElement userEmai2 = driver.findElement(By.xpath("//table[@id='resultTable']/..")); 
		System.out.println("user email is" + userEmai2.toString());
		//name thẻ = //body để check có bao nhiêu body
		
		//name thẻ// thẻ trong thẻ = //body//tbody => check xem có bn thẻ x=trong thẻ
		//thead/tr[position()<=1] | //thead//thead dùng toán tử | để lấy ra các thead có duy nhất 1 tr = (//thead/tr[position()<=1]) hoặc các thead mà có nhiều tr
		//dùng toán tử | để lấy tất cả các tr mà có class = 'usr_acn' hoặc tr mà có class = 'plan rit': //tr[@class='usr_acn'] | //tr[@class='plan rit']
		// dùng toán tử | để lấy ra tất cả các tr mà có class = 'usr_acn' hoặc tr mà có class = 'left':  //tr[@class='usr_acn'] | //td[@class='left']
	}
	
	
	

}
