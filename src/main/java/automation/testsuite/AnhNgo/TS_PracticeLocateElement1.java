package automation.testsuite.AnhNgo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation. common. CommonBase;
import org.openqa.selenium.By;

public final class TS_PracticeLocateElement1 extends CommonBase {

@BeforeMethod
public void init() {
driver = initDriverTest("https://bepantoan.vn/danh-muc/may-hut-mui");
}
@Test
public void Demo_Testcase() {
pause (3000) ;
driver. findElement(By.partialLinkText("Máy Hút Mùi Ống Khói"));
System.out.println("LinkText is Ok");
driver. close();
}
}