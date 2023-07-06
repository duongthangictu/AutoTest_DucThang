package automation.testsuite.AnTran;

import org.testng.annotations.*;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TS_PracticeLocateElement extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://selectorshub.com/xpath-practice-page/");
	}

	@Test
	public void Demo_TestCase() {
		WebElement userEmail = driver.findElement(By.xpath("//tr[@class='usr_acn'][2]"));
		System.out.println("User email is" + userEmail.toString());

//		//HomeWorkUnit9
//		1. //input[@title='Email']
//		2. //input[@title='Password']
//		3. //span[@class='input-group-addon icon icon-company'][position()=1]
//		4. //span[@class='input-group-addon icon icon-mobile'][position()=1]
//		5. //button[@id='blue']
//		6. //input[@value='Submit']
//		7. //div[@id='pancakes'][position()=2]//button[position()=2]
//		8. //div[@id='unique'][position()=1]//button[position()=3]
//		9. //div[@id='unique'][position()=2]//button[position()=1]
//		10. //div[@id='unique'][position()=2]//button[position()=3]
//		11. //div[@id='unique'][position()=2]//input
//		12. //h1
//		13. //tr[@class='usr_acn'][position()=3]
//		14. //tr[@class='plan rit'][position()=2]
//		15. //tr[@class='plan rit'][position()=3]
//		16. //div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']
//		17. //div[@class='FPdoLc lJ9FBc']//input[@class='RNmpXc']
//		18. //img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']

	}

}
