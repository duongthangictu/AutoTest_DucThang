package automation.testsuite.DucTran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class PracticeDay12 extends CommonBase {

    @Test
    public void isRadioButtonSelected() {
        driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement checkboxMale = driver.findElement(By.xpath("(//input[@value='Male' and @type ='radio'])[2]"));
        boolean isSelected = checkboxMale.isSelected();
        if (!isSelected) {
            checkboxMale.click();
            System.out.println("Checkbox đang được select");
        } else {
            WebElement checkboxFemale = driver.findElement(By.xpath("(//input[@value='Female' and @type ='radio'])[2]"));
            checkboxFemale.click();
            System.out.println("Checkbox female đang được select");
        }
        driver.close();
    }

    @Test
    public void issingedroplist() {
        driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        Select dropDayselect = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        System.out.print(dropDayselect.getOptions().size());
        WebElement dropDays=driver.findElement (By.id("select-demo")) ;
        dropDays.click();// Mở dropdownlist
        //dropDayselect.selectByVisibleText ("Monday") ;
        dropDayselect.selectByValue("Monday") ;
        dropDays.click(); // đóng droplist
        driver.close();

    }
}
