package automation.testsuite.TrangNguyen;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class buoi10 extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://bepantoan.vn/danh-muc/bep-tu");
	} 
	@Test
	public void Demo_Testcase() {
		WebElement menulink = driver.findElement(By.xpath("//h1[contains(text(),'TOP 300+ Mẫu Bếp Từ Nhập Khẩu Có Inventer Tiết Kiệm Điện')]"));
		System.out.println("Open Bep Tu" + menulink.toString());
		
		WebElement mayruachenbat = driver.findElement(By.xpath("//a[contains(text(),' Máy Rửa Chén Bát')]"));
		System.out.println("Open Bep Tu" + mayruachenbat.toString());
		//find Bếp điện => (//a[contains(text(),'Bếp Điện')])[2]
		//starts-with(contains) find: //h1[starts-with(@class,'inline-block leading-[150%] font-semibold md:text-[28px] text-[22px] title-gradient uppercase text-center md:text-left')]
		//starts-with(text(),'')] find: //p[starts-with(text(),'Bếp từ là lựa chọn hàng đầu của mọi gia đình Việt với các tính năng an toàn tuyệt đối và vẻ thẩm mỹ cao. Lựa chọn thông thái hơn với những thông tin chi tiết sản phẩm được cung cấp bởi Bếp An Toàn.')]
		//and: //div[@jsname='VlcLAe']//input[@class='gNO89b' and @value='Google Search']
			//img[@class='block object-contain w-full h-full' and @alt='BẾP TỪ ĐÔI BOSCH PPI82560MS']
	
	//buoi11:
//		trước khi đẩy code lên sẽ check 
//		vào folder mà clone về và open git bash.
//		1. git status ( để check những thứ thay đổi & chưa commit)
//		2. git reset --hard ( => sẽ lấy code thay đổi trên máy lần gần nhất, nên là nếu có code mới nên copy & pate ra chỗ khác) 
//
//		Đẩy code mới về máy. 
//		1. git pull
//
//
//		Ancestor:tìm đến 1 thẻ nào đó và tìm thẻ cha của nó. 
//		//input[@name='company_name']/ancestor::div
//		//div[@id='ajaxModalContent']/ancestor::div
//
//		descendant: tìm đến 1 thẻ nào đó và tìm đến con của nó là thẻ gì. 
//		Ví dụ thẻ a có con là thẻ span
//		//a[@id='web-notification-icon']/descendant::span
//		//div[@id='ajaxModalContent']/descendant::input
//		(//div[@class='checkbox'])[1]/descendant::input
//
//
//		preceding: bắt đầu xác định vị trí các phần tử nằm trên nút cha đã cho. (tìm tất cả các thẻ có ở phía trên thẻ tìm kiếm)
//		Ví dụ tìm trên thẻ a với tất cả div
//		//a[@title='Add client']/preceding::div
//		//div[@id='ajaxModalContent']/preceding::input
//		
//		following: nằm từ dưới nút cha đã cho, tìm phần tử trước câu lệnh following và đặt nó làm nút trên cùng. 
//		Ví dụ thẻ nav và tìm ở dưới với thẻ div (sẽ hiện ra tất cả div)
//		//nav[@id='default-navbar']/following::div
//		//div[@id='ajaxModalContent']/following::div
//		(//div[@class='panel panel-default'])[1]/following::input

//
//following-sibling: lấy tất cả các chị em bên dưới là tất cả các element, (anh chị em ngang hàng ngay phía dưới)
////label[@for='company_name']/following-sibling::div
////label[@for='created_by']/following-sibling::div
////div[@class='hide']/following-sibling::button[1]

	}
	
}