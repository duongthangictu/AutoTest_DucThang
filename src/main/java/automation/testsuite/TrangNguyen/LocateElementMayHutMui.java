package automation.testsuite.TrangNguyen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

	public class LocateElementMayHutMui extends automation.common.CommonBase {


		@BeforeMethod
		public void init() {
			driver = initDriverTest("https://bepantoan.vn/danh-muc/bep-tu");
		}
//trong the a thi dung partiallinkText
		@Test
		public void Demo_Testcase() {
			WebElement menulink = driver.findElement(By.partialLinkText("Bếp Từ"));
			System.out.println("Open Bep Tu" + menulink.toString());
			
			WebElement mayhutmui = driver.findElement(By.partialLinkText("Máy Hút Mùi"));
			System.out.println("Open 'May Hut Mui'" + mayhutmui.toString());
			
			WebElement mayhutmui1 = driver.findElement(By.className("menu-link"));
			System.out.println("Open 'May Hut Mui'" + mayhutmui1.toString());
			WebElement Giamgianhieu = driver.findElement(By.partialLinkText("Giảm giá nhiều"));
			System.out.println("Open 'May Hut Mui'" + Giamgianhieu.toString()); 
		//Buổi 9:	p2 locate
			WebElement beptu = driver.findElement(By.xpath("//div[@class='flex h-[45px]']//li[@class='px-4 py-3 cursor-pointer'][1]")); //hoặc (//div[@class='flex h-[45px]']//ul)[2]//li[1]
			System.out.println("Open bep tu'" + beptu.toString());
			
			
		}  
		
	}

