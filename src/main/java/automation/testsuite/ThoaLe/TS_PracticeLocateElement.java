package automation.testsuite.ThoaLe;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TS_PracticeLocateElement extends automation.common.CommonBase{
	
	 @BeforeMethod
	  public void init() {
	    driver = initDriverTest("https://selectorshub.com/xpath-practice-page//");    
	    //openPage("https://partners-staging.capa.ai/", driver);
		 
//		 driver = initDriverTest("https://bepantoan.vn/danh-muc/may-hut-mui"); 
	    }
//
//	  @AfterMethod
//	  public void after() {
//	    quitDriver(driver);}

	  @Test
	  public void Demo_Testcase() {
		//  WebDriver userName = driver.findElement(By.id(baseUrl));
//		  pause(3000);
//		  driver.findElement(By.partialLinkText("Hút Mùi Ống Khói"));
//		  System.out.println("Link text is OK");
//		  driver.close();
//		  WebElement userEmail = driver.findElement(By.id("userId"));
//		  System.out.println("User email is " + userEmail.toString());
		  
		  WebElement userEmail = driver.findElement(By.xpath("//tr[@class='usr_acn'][2]"));
		  System.out.println("User email is " + userEmail.toString());

}
}
