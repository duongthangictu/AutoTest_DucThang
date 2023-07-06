package automation.testsuite.ThangDuong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q {
	public static void main(String[] args) {
		WebDriver aa = new ChromeDriver();
		aa.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		aa.get("https://the-internet.herokuapp.com/upload");
		//we want to import selenium-snapshot file. 
		
		aa.quit();
	}
}