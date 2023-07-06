package automation.testsuite.TrangNguyen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BTVN09 extends   automation.common.CommonBase {

	@BeforeMethod
	public void Bai1vaBai3() {
		driver = initDriverTest("https://selectorshub.com/xpath-practice-page/");
	}

	@Test
	public void Demo_Testcase() {
		WebElement Node01 = driver.findElement(By.xpath("//input[@id='userId']")); 
		System.out.println("user email is" + Node01.toString());
		
		WebElement Node02 = driver.findElement(By.xpath("//input[@id='pass'][@name='Password']")); 
		System.out.println("user email is" + Node02.toString());
		
		WebElement Node03 = driver.findElement(By.xpath("(//div[@class='userform']//div)[2]//input[@name='company']")); 
		System.out.println("user email is" + Node03.toString());
		
		WebElement Node04 = driver.findElement(By.xpath("(//div[@class='userform']//div)[2]//input[@name='mobile number']")); 
		System.out.println("user email is" + Node04.toString());
		
		WebElement Node05 = driver.findElement(By.xpath("//input[@type='submit']")); 
		System.out.println("user email is" + Node05.toString());
		
		WebElement Bai301 = driver.findElement(By.xpath("//tr[@class='usr_acn'][3]//td[4]")); 
		System.out.println("user email is" + Bai301.toString());

		WebElement Bai302 = driver.findElement(By.xpath("//tr[@class='plan rit'][2]//td[4]")); 
		System.out.println("user email is" + Bai302.toString());

		WebElement Bai303 = driver.findElement(By.xpath("//tr[@class='plan rit'][3]//td[4]")); 
		System.out.println("user email is" + Bai303.toString());
		 
		
	}
	
	@BeforeMethod
	public void dynamic() {
		driver = initDriverTest("https://chercher.tech/practice/dynamic-table");
	}
	@Test
	public void Demo_Bai2() {
		WebElement Bai201 = driver.findElement(By.xpath("///button[@id='blue']")); 
		System.out.println("user email is" + Bai201.toString());

		WebElement Bai202 = driver.findElement(By.xpath("//div[@id='pancakes'][2]//button[@type='button'][2]")); 
		System.out.println("user email is" + Bai202.toString());
		
		WebElement Bai203 = driver.findElement(By.xpath("//div[@id='unique'][1]//button[@type='button'][3]")); 
		System.out.println("user email is" + Bai203.toString());
		
		WebElement Bai204 = driver.findElement(By.xpath("//div[@id='unique'][2]//button[@type='button'][1]")); 
		System.out.println("user email is" + Bai204.toString());
		
		WebElement Bai205 = driver.findElement(By.xpath("//div[@id='unique'][2]//button[@type='button'][3]")); 
		System.out.println("user email is" + Bai205.toString());
		
		WebElement Bai206 = driver.findElement(By.xpath("//div[@id='unique'][2]//input[@type='button']")); 
		System.out.println("user email is" + Bai206.toString());
		
	}
	
	@BeforeMethod
	public void bai4() {
		driver = initDriverTest("https://www.google.com/");
	}
	@Test
	public void Demo_Bai4() {
		WebElement Bai401 = driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']/img[1]")); 
		System.out.println("user email is" + Bai401.toString());

		WebElement Bai402 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[1]")); 
		System.out.println("user email is" + Bai402.toString());
		
		WebElement Bai403 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[2]")); 
		System.out.println("user email is" + Bai403.toString());
		
		
	}

}

