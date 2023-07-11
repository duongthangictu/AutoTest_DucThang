package automation.PageLocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automation.common.CommonBase;
import net.sourceforge.htmlunit.corejs.javascript.tools.shell.JSConsole;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientsPage_Day14 extends CommonBase {

	// Viet cac Xpath cua clientAdd
	WebDriver driver;

	@FindBy(xpath = "//label[normalize-space()='Organization']")
	private WebElement txtOganization;

	@FindBy(xpath = "//label[normalize-space()='Person']")
	private WebElement Person;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(id = "select2-chosen-3")
	private WebElement Owner;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "city")
	private WebElement txtCity;

	@FindBy(id = "state")
	private WebElement txtState;

	@FindBy(id = "zip")
	private WebElement txtZip;

	@FindBy(id = "country")
	private WebElement txtCountry;

	@FindBy(id = "phone")
	private WebElement txtPhone;

	@FindBy(id = "website")
	private WebElement txtWebsite;

	@FindBy(id = "vat_number")
	private WebElement txtVATNumber;

	@FindBy(id = "gst_number")
	private WebElement txtGSTNumber;

	@FindBy(xpath = "//div[@id='s2id_group_ids']/descendant::input")
	private WebElement ClientGroup;

	@FindBy(id = "select2-chosen-1")
	private WebElement Currency;

	@FindBy(id = "currency_symbol")
	private WebElement CurrencySymbol;

	@FindBy(id = "disable_online_payment")
	private WebElement checkboxDisableOnlinePayment;

	@FindBy(xpath = "(//div[@id='link-of-add-contact-modal']/following::button)[1]")
	private WebElement Close;

	@FindBy(xpath = "(//div[@id='link-of-add-contact-modal']/following::button)2]")
	private WebElement SaveContinue;

	@FindBy(xpath = "(//div[@id='link-of-add-contact-modal']/following::button)[3]")
	private WebElement btnSave;

	public ClientsPage_Day14(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addClient(String companyName, String address, String city, String State, String zip, String country,
			String phone, String website, String VAT_number, String GST_number) {

		// Click Element Clients on the left
		WebElement clientLinkElement = driver.findElement(DashboardPage.clientsLinkBy);
		clientLinkElement.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Click button Add client > display pop-up
		WebElement btnAddClientElement = driver.findElement(DashboardPage.btnAddClientBy);
		btnAddClientElement.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * txtCompanyName.sendKeys(companayName); txtAddress.sendKeys(address);
		 */

		// Cách 2

		txtCompanyName.sendKeys(companyName);
		
		// Select value in Dropdown list "Owner"
		Select dropdown_OwnerSelect = new Select(driver.findElement(By.xpath("(//div[@class='col-md-9'])[2]")));
		
		
		WebElement dropWeblement = driver.findElement(By.xpath("(//div[@class='col-md-9'])[2]"));
		dropWeblement.click();
//		((WebElement) dropdown_OwnerSelect).click();
		dropdown_OwnerSelect.selectByVisibleText("John Doe");
		
		
		/*
		 * WebElement selectMyElement = driver.findElement((By.id("s2id_created_by")));
		 * selectMyElement.click();
		 * 
		 * Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(Keys.DOWN,
		 * Keys.DOWN)).perform();
		 */
		
		txtAddress.sendKeys(address);
		txtCity.sendKeys(city);
		txtState.sendKeys(State);
		txtZip.sendKeys(zip);
		txtCountry.sendKeys(country);
		txtPhone.sendKeys(phone);
		txtWebsite.sendKeys(website);
		txtVATNumber.sendKeys(VAT_number);
		txtGSTNumber.sendKeys(GST_number);
		btnSave.click();

		// Cach 1
		/*
		txtCompanyName.sendKeys("Thang Duong");
		txtAddress.sendKeys("HN ok");
		txtCity.sendKeys("Ha Noi");
		txtState.sendKeys("HN");
		txtZip.sendKeys("123");
		txtCountry.sendKeys("HN");
		txtPhone.sendKeys("099999999");
		txtWebsite.sendKeys("123.com");
		txtVATNumber.sendKeys("123");
		txtGSTNumber.sendKeys("123");
		btnSave.click();
		/*/
	}
}
