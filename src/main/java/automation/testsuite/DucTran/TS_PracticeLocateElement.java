package automation.testsuite.DucTran;
import org.testng.annotations.Test;
import org.openqa.selenium. By;
import org.openqa.selenium.WebElement ;
import org.testng.annotations.BeforeMethod;



public class TS_PracticeLocateElement extends automation. common.CommonBase{
    @BeforeMethod
    public void init() {
      driver =initDriverTest("https://selectorshub.com/xpath-practice-page//");
      }
    @Test
    public void Demo_Testcase() {
       WebElement userEmail = driver. findElement (By.xpath("//tr[@class='usr_acn'][2]"));
       System. out. println( "User email is "+ userEmail. toString());
    }
}

