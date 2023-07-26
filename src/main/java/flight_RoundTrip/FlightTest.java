package flight_RoundTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class FlightTest extends CommonBase {
	WebDriver driver;

	@FindBy(xpath = "//a[@id='round-trip-tab']/parent::li")
	private WebElement rdoRoundTripElement;

	public FlightTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void isCheckboxSelected() {
		driver = initChromeDriver("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
//		WebElement rdoRoundTripElement = driver.findElement(By.xpath("//a[@id='round-trip-tab']/parent::li"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", rdoRoundTripElement);

		boolean isSelected = rdoRoundTripElement.isSelected();
		if (isSelected == false) {
			rdoRoundTripElement.click();
			System.out.println("Checkbox đang được select");
		} else {
			System.out.println("Checkbox da được select");
		}
	}

}
