package automation.PageLocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Day14_ClientsPage {

	// Viet cac Xpath cua clientAdd
	WebDriver driver;

	@FindBy(xpath = "//label[normalize-space()='Organization']")
	private WebElement txtOganization;

	@FindBy(xpath = "//label[normalize-space()='Person']")
	private WebElement Person;

	@FindBy(id = "company_name")
	private WebElement CompanyName;

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

	public void addClient() {
		txtOganization.sendKeys("WIN");
		txtAddress.sendKeys("Van Tri");
		txtCity.sendKeys("Ha Noi");
		txtState.sendKeys("HN");
		txtZip.sendKeys("123");
		txtCountry.sendKeys("HN");
		txtPhone.sendKeys("099999999");
		txtWebsite.sendKeys("123.com");
		txtVATNumber.sendKeys("123");
		txtGSTNumber.sendKeys("123");
		btnSave.click();
	}
}
