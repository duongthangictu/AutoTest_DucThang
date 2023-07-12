package automation.PageLocation;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automation.common.CommonBase;

public class ClientsPage extends CommonBase {

	WebDriver driver;

	@FindBy(xpath = "//label[normalize-space()='Organization']")
	private WebElement txtOganization;

	@FindBy(xpath = "//label[normalize-space()='Person']")
	private WebElement Person;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(xpath = "//a[@class='btn btn-default' and @title='Add client']")
	private WebElement btnAddClient;

	@FindBy(xpath = "//div[@id='s2id_created_by']")
	private WebElement checkboxOwner;

	@FindBy(xpath = "//ul[@id='select2-results-3']//li[3]")
	private WebElement ownerItem;

	// Chon Richard Gray voiw xpath = //div[text()='Richard Gray']
	@FindBy(xpath = "//div[text()='Richard Gray']")
	private WebElement ownerItem2;

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

	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Total clients']")
	private WebElement totalClientCard;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement textboxSearch;
	@FindBy(xpath = "//td[@class=' all']//a[text()='thangduong@demo.com']")
	private WebElement searchResult;

	public void addClient(String companyName, int dropOwner2, String address, String city, String State, String zip,
			String country, String phone, String website, String VAT_number, String GST_number) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DashboardPage.clientsLink.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		btnAddClient.click();

		txtCompanyName.sendKeys(companyName);
		checkboxOwner.click();
		ownerItem2.click(); // ((WebElement) dropdown_OwnerSelect).click();
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

		// Dùng JavascriptExecutor để click vào totalClientCard
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", totalClientCard);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		textboxSearch.sendKeys(companyName);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		assertTrue(searchResult.isDisplayed());

	}
}
