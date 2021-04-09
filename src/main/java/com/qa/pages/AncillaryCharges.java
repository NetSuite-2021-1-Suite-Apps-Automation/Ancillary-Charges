package com.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;
import com.qa.util.TestBase;
@SuppressWarnings("deprecation")
public class AncillaryCharges extends TestBase {
	@FindBy(xpath = "//tr[@id='custpage_chargebacklist_row_1']//td[count(//td[@data-label='Charges']//preceding-sibling::td)]")
	WebElement charge_amount_click_after_payment;
	
	@FindBy(xpath = "//input[@id='custpage_amount_formattedValue']")
	WebElement charge_amount_enter_after_payment;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_glaccount']")
	WebElement charge_arrow_after_payment;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tr[@id='custpage_chargebacklistheader']//following-sibling::tr//td[count(//td[@data-label='Transaction #']//preceding-sibling::td)+1]")
	List<WebElement> Invoicenr_in_payment;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tr[@id='custpage_chargebacklistheader']//following-sibling::tr//td[count(//td[@data-label='Charges']//preceding-sibling::td)]")
	List<WebElement> charge_amount_in_payment;
	
	@FindBy(xpath = "//span[@id='custbody_tss_invoice_link_lbl_uir_label']//following-sibling::span")
	WebElement Invoicenr_in_journal;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_number__lbl']//following::span[@class='uir-field inputreadonly']")
	WebElement charge_name_in_ancillary_applied;
	
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement ancillary_edit;
	
	@FindBy(xpath = "//td[contains(text(),'That record does not exist.')]")
	WebElement journal_notexist;
	
	@FindBy(xpath = "//a[contains(text(),'Actions')]")
	WebElement Actions_payment;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	WebElement delete_payment;
	
	
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement payment_edit_secondary;
	
	@FindBy(xpath = "//li[@data-title='Transactions']")
	WebElement Transactions;
	
	@FindBy(xpath = "//a[@class='ns-scroll-button ns-scroll-button-bottom']")
	WebElement expand;
	
	@FindBy(xpath = "//li[@data-title='Financial']")
	WebElement financial;
	
	@FindBy(xpath = "//li[@data-title='Make Journal Entries']")
	WebElement make_journal_entries;
	
	@FindBy(xpath = "//li[@data-title='List']")
	WebElement jelist;
	
	@FindBy(xpath = "//td[@id='uir_totalcount' and @class='smalltextnolink']")
	WebElement jecount;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement journal_save;
	
	@FindBy(xpath = "//input[@id='memo']")
	WebElement memo;
	
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement journal_edit;
	
	@FindBy(xpath = "//tr[@id='custpage_chargebacklist_row_1']//td[count(//td[@data-label='Charges']//preceding-sibling::td)+1]")
	WebElement charge_name_change_click;
	
	@FindBy(xpath = "//input[@id='inpt_custpage_glaccount38']")
	WebElement charge_name_change;
	
	@FindBy(xpath = "//tr[@id='custpage_chargebacklist_row_1']//td[count(//td[@data-label='Amount'])]")
	WebElement charge_amount_change_click;
	
	@FindBy(xpath = "//input[@id='custpage_amount_formattedValue']")
	WebElement charge_amount_change;
	
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement payment_edit;
	
	@FindBy(xpath = "//table[@id='apply_splits']//tbody//tr[@id='applyheader']//following-sibling::tr//td[count(//td[@data-label='Apply'])+2]")
	List<WebElement> refno;
	
	@FindBy(xpath = "//img[@id='inpt_customform1_arrow']")
	WebElement form_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> forms;
	
	@FindBy(xpath = "//table[@id='apply_splits']//tbody//tr//following-sibling::tr//td[count(//td[@data-label='Apply']//preceding-sibling::td)+1]//img")
	List<WebElement> invoice_links;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr//td//a[contains(text(), 'View')]")
	List<WebElement> ancillary_charges_list;
	
	static String parentWindow;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tr[@id='custpage_chargebacklistheader']//following-sibling::tr//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]//a")
	List<WebElement> journallists;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tr[@id='custpage_chargebacklistheader']//following-sibling::tr//td[count(//td[@data-label='Charges']//preceding-sibling::td)+1]")
	List<WebElement> charge_name_after_payment;
	
	@FindBy(xpath = "//span[@id='aracct_fs_lbl_uir_label']//following-sibling::span")
	WebElement Ar_account;
	
	@FindBy(xpath = "//table[@id='apply_splits']//tr[@id='applyheader']//following-sibling::tr//td[count(//table[@id='apply_splits']//td[@data-label='Date']//preceding-sibling::td)]//img")
	List<WebElement> invoicelink;
	
	@FindBy(xpath = "//table[@id='apply_splits']//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Amt. Due']//preceding-sibling::td)+1]")
	List<WebElement> due_amount;
	
	@FindBy(xpath = "//li[@data-title='Lists']")
	WebElement Lists;
	
	@FindBy(xpath = "//li[@data-title='Ancillary Charges']")
	WebElement Ancillary_Charges;
	
	@FindBy(xpath = "//a[@class='ns-scroll-button ns-scroll-button-bottom']")
	WebElement Arrow;
	
	@FindBy(xpath = "//li[@data-title='Charges Setup']")
	WebElement Charges_Setup;
	
	@FindBy(xpath = "//li[@data-title='New']")
	WebElement New;
	
	@FindBy(xpath = "//li[@data-title='Applied Charges']")
	WebElement Applied_charges;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement Charge_name;
	
	@FindBy(xpath = "//input[@id='inpt_custrecord_tss_accounts1']")
	WebElement Debit_account;
	
	@FindBy(xpath = "//input[@id='inpt_custrecord_tss_payment_credit2']")
	WebElement Credit_account;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement Save;
	
	@FindBy(xpath = "//img[@id='inpt_custrecord_tss_accounts1_arrow']")
	WebElement Debit_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> Debit_dropdown;
	
	@FindBy(xpath = "//img[@id='inpt_custrecord_tss_payment_credit2_arrow']")
	WebElement Credit_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> Credit_dropdown;
	
	@FindBy(xpath = "//span[@id='segment_fs']//li")
	List<WebElement> Customer_list;
	
	@FindBy(xpath = "//span[@class='uir-pagination-label']")
	WebElement Customer_list_click;
	
	@FindBy(xpath = "//li[@data-title='Relationships']")
	WebElement Relationships;
	
	@FindBy(xpath = "//li[@data-title='Customers']")
	WebElement Customers;
	
	@FindBy(xpath = "//*[@href='/app/common/entity/custjob.nl?id=931']")
	WebElement view_customer;
	
	@FindBy(xpath = "//td[@id='tdbody_acceptpayment']")
	WebElement accept_payment;
	
	@FindBy(xpath = "//*[@id=\"apply1_fs\"]/img")
	WebElement invoice_click;
	
	@FindBy(xpath = "//a[@id='custpage_chargebacktxt']")
	WebElement charge_tab;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_appliedinvoice']")
	WebElement tran_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> tran_dropdown;
	
	@FindBy(xpath = "//input[@id='custpage_amount_formattedValue']")
	WebElement charge_value;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_glaccount']")
	WebElement charge_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> charge_dropdown_list;
	
//	@FindBy(xpath = "//input[@name='inpt_custpage_glaccount']")
//	WebElement charge_name_dropdown;
//	
	@FindBy(xpath = "//input[@id='undepfunds_fs_inp']")
	List<WebElement> account_checkbox;
	
	@FindBy(xpath = "//input[@name='inpt_account']")
	WebElement account_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> account_dropdown;
	
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_payment;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//tr[@id='custpage_chargebacklist_headerrow']//td[@data-label='Amount']//preceding-sibling::td)+1]")
	WebElement charge_amount_click;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//tr[@id='custpage_chargebacklist_headerrow']//td[@data-label='Charges']//preceding-sibling::td)+1]")
	WebElement charges_click;
	
	@FindBy(xpath = "//a[@id='custpage_chargebacktxt']")
	WebElement charge_tab_after_payment;
	
	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]//a")
	WebElement journal_link;
	
	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Debit']//preceding-sibling::td)]//a")
	WebElement credit_account1;
	
	@FindBy(xpath="//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-even']//td[count(//td[@data-label='Debit']//preceding-sibling::td)]//a")
	WebElement debit_account1;
	
	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Memo']//preceding-sibling::td)]")
	WebElement credit_amount;
	
	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-even']//td[count(//td[@data-label='Credit']//preceding-sibling::td)]")
	WebElement debit_amount;
	
	@FindBy(xpath = "//span[@id='custbody_tss_invoice_link_lbl_uir_label']//following-sibling::span//a")
	WebElement invoice_transcation_link;
	
	@FindBy(xpath = "//div[@class='uir-record-status']")
	WebElement invoice_status;
	
	@FindBy(xpath = "//span[@id='account_fs_lbl_uir_label']//following-sibling::span")
	WebElement bank_account;
	
	@FindBy(xpath = "//input[@id='inpt_custpage_glaccount24']")
	WebElement charge_selection;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[@id='row0']//a[@class='dottedlink viewitem']")
	WebElement created_ancillary_charge;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> created_recently_charge;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_journalid_record_lbl_uir_label']//following-sibling::span")
	WebElement journal_from_ancillary_charge;
	
	@FindBy(xpath = "//img[@id='inpt_quicksort3_arrow']")
	WebElement arrow_ancillary_charge;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_applied_invoice_lbl_uir_label']//following-sibling::span")
	WebElement ancillary_charge_invoice_nr;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_payment_lbl_uir_label']//following-sibling::span")
	WebElement ancillary_charge_payment_nr;
	
	@FindBy(xpath = "//span[@id='aracct_fs_lbl_uir_label']//following-sibling::span")
	WebElement ar_account_writeoff;
	
	@FindBy(xpath = "//span[@id='apply_amount1_fs']")
	WebElement payment_amount_click;
	
	@FindBy(xpath = "//input[@id='amount1_formattedValue']")
	WebElement payment_amount_enter;
	
	@FindBy(xpath = "//input[@id='custpage_chargebacklist_addedit']")
	WebElement add_button;
	
	@FindBy(xpath = "//tr[@class='uir-list-row-tr uir-list-row-even']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]")
	List<WebElement> even_journal;
	
	@FindBy(xpath = "//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]")
	List<WebElement> odd_journal;
	
	@FindBy(xpath = "//span[@id='name_fs_lbl_uir_label']//following-sibling::span")
	WebElement charge_confirmation;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr//td[count(//td[@data-label='Name']//preceding-sibling::td)+1]//a")
	List<WebElement> customer_search;
	
	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Credit']//preceding-sibling::td)+1]")
	WebElement amount_in_journal_1;
	
	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Credit']//preceding-sibling::td)]")
	WebElement amount_in_journal2;
	
	@FindBy(xpath = "//span[@id='custrecord_tss_amount_fs_lbl_uir_label']//following-sibling::span")
	WebElement amount_in_ancillary_applied;
	
	@FindBy(xpath = "//input[@name='inpt_quicksort']")
	WebElement recently_created_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> recently_recreated_list;
	
	
	String credit_account = null;
	
	String debit_account = null;
	
	String tr_no_1 = null;
	
	String tr_no_2 = null;
	
	String tr_no_mul[] = new String[2];
	
	String tr_no_3=null;

	public AncillaryCharges() {
		PageFactory.initElements(driver, this);
	}

	public void credit_and_debit_accounts(String charge_name) {

		if (charge_name.equals("Bank Charges")) {
			credit_account = "1100 Accounts Receivable";
			debit_account = "6040 Bank Service Charges";
		}
		if (charge_name.equals("Bad Debt")) {
			credit_account = "1100 Accounts Receivable";
			debit_account = "6030 Bad Debt Expense";
		}
		if (charge_name.equals("Write Off")) {
			credit_account = "1100 Accounts Receivable";
			debit_account = "6252 Taxes & Licenses-Other : Business";
		}
		if(charge_name.equals("Freight Charges"))
		{
			credit_account="1000 Checking";
			debit_account="6090 Freight & Delivery";
		}

	}

	public void charge_Screen() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(Lists).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Arrow).build().perform();
		Thread.sleep(1000);
		action.moveToElement(Ancillary_Charges).build().perform();
		Thread.sleep(2000);
		action.moveToElement(Charges_Setup).build().perform();
		New.click();

	}

	public void Ancillary_charges_screen() throws InterruptedException {

		Actions action = new Actions(driver);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(Lists));
		eleAvailability(driver, Lists, 20);
		action.moveToElement(Lists).build().perform();
		Thread.sleep(1000);
		action.moveToElement(Arrow).build().perform();
		Thread.sleep(1000);
		action.moveToElement(Ancillary_Charges).build().perform();
		Thread.sleep(1000);
		action.moveToElement(Applied_charges).click().build().perform();
		Thread.sleep(1000);
		if(isAlertPresent())
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		recently_created_arrow.click();
		for(int i=0;i<recently_recreated_list.size();i++)
		{
			if(recently_recreated_list.get(i).getText().equals("Recently Created"))
			{
				recently_recreated_list.get(i).click();
				Thread.sleep(3000);
				break;
			}
		}
		
	}
	
	public void Customer_Navigation_Accepting_Payment() throws InterruptedException {
		//WebDriverWait wait=new WebDriverWait(driver, 50);
		driver.navigate().to("https://tstdrv939179-rp.app.netsuite.com/app/common/search/searchresults.nl?searchid=532&whence=");
		if(isAlertPresent()==true)
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		for(int i=1;i<customer_search.size();i++)
		{
			WebElement customer_view=customer_search.get(i);
			String customer=customer_view.getText();
			System.out.println(customer);
			if(!customer.trim().equals(""))
			{
				if(customer_view.isDisplayed())
				{
					Thread.sleep(1000);
				customer_view.click();
				}
				break;			
			}
		}
		eleAvailability(driver, accept_payment, 20);
		accept_payment.click();
		Thread.sleep(3000);
		account_checkbox.get(1).click();
		eleAvailability(driver, account_arrow, 20);
		Actions action=new Actions(driver);
		action.moveToElement(account_arrow).build().perform();
		account_arrow.click();
		eleAvailability(driver, account_dropdown.get(0), 30);
		account_dropdown.get(2).click();
	}

	public boolean isAlertPresent() {
		try {
			Alert a = new WebDriverWait(driver, 4).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				System.out.println("Alert is present");
				return true;
			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			System.err.println("Alert isn't present!!");
			return false;
		}
	
	}
	public void isAlertPresent_(ExtentTest test)
	{
		if(isAlertPresent()==true)
		{
			Alert alert=driver.switchTo().alert();
			String message=alert.getText();
			alert.accept();
			System.out.println("The Alert Message is "+message);
			test.pass("The Alert Message is "+message);
		}
		else
		{
			test.fail("Alert is not displaying");
		}
	}

	public void charge_Creation(String charge_name, String debit_account, String credit_account, String testcase,ExtentTest test)
			throws InterruptedException {
		Save.click();
		ExtentTest test1=test.createNode("Verifying Save Option without entering Charge Name, Credit Account, Debit Account");
		isAlertPresent_(test1);
		Thread.sleep(2000);
		ExtentTest test2=test.createNode("Verifying Save Option with only Charge Name");
		Charge_name.sendKeys(charge_name);
		Save.click();
		isAlertPresent_(test2);
		Charge_name.clear();
		Thread.sleep(2000);
		ExtentTest test3=test.createNode("Verifying Save Option with only Debit Account");
		Debit_account.sendKeys(debit_account);
		Save.click();
		isAlertPresent_(test3);
		Debit_arrow.click();
		Debit_dropdown.get(0).click();
		Thread.sleep(2000);
		ExtentTest test4=test.createNode("Verifying Save Option with only Credit Account");
		Credit_account.sendKeys(credit_account);
		Save.click();
		isAlertPresent_(test4);
		Credit_arrow.click();
		Credit_dropdown.get(0).click();
		Thread.sleep(2000);
		ExtentTest test5=test.createNode("Verifying Save Option with Charge Name,Credit Account, Debit Account");
		Charge_name.sendKeys(charge_name);
		Debit_account.sendKeys(debit_account);
		Credit_account.sendKeys(credit_account);
		Save.click();
		Thread.sleep(5000);
		if(charge_confirmation.getText().trim().equals(charge_name.trim()))
		{
			test5.pass("Charge is created Successfully with credit account: " +credit_account+",debit account: "+debit_account+" accounts");
		}
		else
		{
			test5.fail("Charge is not created");
		}
		

	}

	public static void windowHandle() throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currentwindow = driver.getWindowHandle();
		parentWindow = currentwindow;
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while (i.hasNext()) {
			String childwindow = i.next();
			if (!childwindow.equalsIgnoreCase(currentwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void charge_selection(String charge_amount, String charge_name, String testcase, String no_of_invoices,ExtentTest test)
			throws Exception {
		boolean full_payment_with_bank_charges_flag=true;
		String tr_no_1 = null;
		String tr_no_2 = null;
		String tr_no_3 = null;
		Customer_Navigation_Accepting_Payment();
		Actions action = new Actions(driver);
		int invoice_size = Integer.parseInt(no_of_invoices);
		String[] refnrs = new String[invoice_size];
		int noofinvoices = Integer.parseInt(no_of_invoices);
		for (int i = 0; i < invoicelink.size(); i++)
		{
			if (noofinvoices == i)
			{
				break;
			}
			invoicelink.get(i).click();
			{
				WebElement due_amount_list = due_amount.get(i);
				String due_amount1 = due_amount_list.getText().replace(",", "");
				System.out.println(due_amount1);
				double j = Double.parseDouble(due_amount1);
				if (j > 101.00) {
					j = j - 100.00;
				}
				if (j <= 100 && j > 10) {
					j = j - 10.00;
				}
				if (j <= 10 && j > 2) {
					j = j - 1;
				}
				System.out.println("double" + j);
				String s = Double.toString(j);
				System.out.println("String" + s);
				payment_amount_click.click();
				payment_amount_enter.clear();
				payment_amount_enter.sendKeys(s);

			}
			WebElement ref = refno.get(i);
			refnrs[i] = ref.getText();
			System.out.println("Invoices are" + "--------" + refnrs[i]);

		}
		charge_tab.click();
		for (int k = 0; k < refnrs.length; k++) {
			if (k == refnrs.length)
				break;
			System.out.println(refnrs.length);
			System.out.println("Reference no is" + "-----" + refnrs[k]);
			Thread.sleep(2000);
			tran_arrow.click();
			for (int i = 0; i < tran_dropdown.size(); i++) {

				System.out.println(tran_dropdown.size());
				WebElement textsel = tran_dropdown.get(i);
				if (refnrs[k].equals(textsel.getText())) {
					tran_dropdown.get(i).click();
					break;
				}

			}
			action.sendKeys(Keys.TAB).build().perform();
			charge_value.sendKeys(charge_amount);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for (int j = 0; j < charge_dropdown_list.size(); j++) {
				WebElement charges = charge_dropdown_list.get(j);
				String chargetext = charges.getText();
				if (chargetext.equals(charge_name.trim())) {
					charges.click();
					break;
				}
			}
		}
		if (testcase.trim().equals("Full Payment with Bank Charges")) {
			save_payment.click();
			full_payment_with_bank_charges_flag = isAlertPresent();
			System.out.println(full_payment_with_bank_charges_flag);
			//Verify.(true, alert_value);

		}
		if(full_payment_with_bank_charges_flag)
		{
		save_payment.click();
		charge_tab_after_payment.click();
		WebElement tr1 = Invoicenr_in_payment.get(0);
		tr_no_1=tr1.getText();
		int size = journallists.size();
		for (int i = 0; i < journallists.size(); i++) {

			System.out.println("Journal size is" + " " + journallists.size());
			WebElement journal1 = journallists.get(i);
			journal1.click();
			windowHandle();
			tr_no_2 = Invoicenr_in_journal.getText();
			String debita = debit_account1.getText().trim();
			System.out.println("debit acct value:: " + debita);
			String credita = credit_account1.getText().trim();
			System.out.println("credit acct value is :: " + credita);
			credit_and_debit_accounts(charge_name.trim());
			if (debita.equals(debit_account)) {
				System.out.println("The debit account is verified");
				System.out.println("The debit account for" + " " + charge_name + " is" + " " + debita);
				test.pass("The debit account for" + " " + charge_name + " is" + " " + debita+"<br/>"+"Debit Account is Verified");
			}
			if (credita.equals(credit_account)) {
				System.out.println("The credit account is verified");
				System.out.println("The credit account for" + " " + charge_name + " is" + " " + credita);
				test.pass("The credit account for" + " " + charge_name + " is" + " " + credita+"<br/>"+"Credit Account is verified");
			}

			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(parentWindow);
			Thread.sleep(1000);
		}
		System.out.println("aa size is" + size);
		Ancillary_charges_screen();
		for (int i = 0; i < size; i++) {
			System.out.println("Ancillary charge count is" + " " + size);
			WebElement view_link_final = ancillary_charges_list.get(i);
			action.moveToElement(view_link_final).build().perform();
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			view_link_final.sendKeys(selectLinkOpeninNewTab);
			windowHandle();
			tr_no_3 = ancillary_charge_invoice_nr.getText();
			System.out.println("Applied to transcation " + " " + i + " " + ancillary_charge_invoice_nr.getText());
			driver.switchTo().window(parentWindow);
		}
		if (tr_no_1.equals(tr_no_2)) {
			if (tr_no_2.equals(tr_no_3)) {
				if (tr_no_3.equals(tr_no_1)) {
					System.out.println("The invoice number in payment, journal, ancillary charge is same");
					System.out.println("Testcase is verified");
					test.pass("Invoice number in payment is :"+tr_no_1 +"<br/>"+"Invoice number in Journal is: "+tr_no_2+"<br/>"+"Invoice number in Ancillary charge is:"+tr_no_3+"<br/>"+"The invoice number in payment, journal, ancillary charge is same"+"<br/>"+"So, Test case is verified");					
				}
			}
		}

	}
		else
		{
			test.fail("We should not apply Bank Charges when paying Full amount");
			System.out.println("We should not apply bank charges when paying full amount");

		}
	}

	@SuppressWarnings("deprecation")
	public void single_payment_multiple_same_charges(String charge_amount, String charge_name, String testcase,ExtentTest test)
			throws Exception {
		boolean same_charge_flag=true;
		boolean banK_charge_full_payment_flag=true;

		Actions action = new Actions(driver);
		Customer_Navigation_Accepting_Payment();
		String[] charge_amounts = charge_amount.split(",");
		String[] charge_names = charge_name.split(",");
		int size = charge_names.length;
		String[] refnrs = new String[size];
		String[] refnrs_one = new String[1];
		if (testcase.trim().equals("Multiple  invoices and multiple charges")) {

			for (int i = 0; i < charge_names.length; i++) {
				WebElement ref = refno.get(i);
				refnrs[i] = ref.getText();
				System.out.println("Invoices are" + "--------" + refnrs[i]);
				WebElement invoice_to_click = invoice_links.get(i);
				System.out.println("invoices are" + invoice_to_click.getText());
				invoice_to_click.click();
				Thread.sleep(2000);

			}
		} else {
			for (int i = 0; i < refnrs_one.length; i++) {
				WebElement ref = refno.get(i);
				refnrs_one[i] = ref.getText();
				
				invoice_click.click();
				
			}
		}
		if(testcase.trim().equals("Multiple charge selection for single payment including write off with partial amount"))
		{				
			for (int i = 0; i < invoicelink.size(); i++) {
					if(i==1)
					break;
					WebElement due_amount_list = due_amount.get(i);
					String due_amount1 = due_amount_list.getText().replace(",", "");
					System.out.println(due_amount1);
					double j = Double.parseDouble(due_amount1);
					if(j>1000.00)
					{
						j=j-1000.00;
					}
					if (j > 101.00) {
						j = j - 100.00;
					}
					if (j <= 100 && j > 10) {
						j = j - 10.00;
					}
					if (j <= 10 && j > 2) {
						j = j - 1;
					}
					System.out.println("double" + j);
					String s = Double.toString(j);
					System.out.println("String" + s);
					payment_amount_click.click();
					payment_amount_enter.clear();
					payment_amount_enter.sendKeys(s);
		
			}
		}
		
		charge_tab.click();
		if (testcase.trim().equals("Same Charge Multiple times")) {
			tran_arrow.click();
			for (int i = 0; i < tran_dropdown.size(); i++) {

				for (int j = 0; j < tran_dropdown.size(); j++) {
					if (j == size)
						break;
					System.out.println(tran_dropdown.size());
					WebElement textsel = tran_dropdown.get(j);
					String textsel1 = textsel.getText();
					if (textsel1.equals(refnrs_one[0])) {
						tran_dropdown.get(j).click();
						break;
					}
				}
				action.sendKeys(Keys.TAB).build().perform();
				charge_value.sendKeys(charge_amounts[i]);
				action.sendKeys(Keys.TAB).build().perform();
				charge_arrow.click();
				for (int j = 0; j < charge_dropdown_list.size(); j++) {
					WebElement charges = charge_dropdown_list.get(j);
					String chargetext = charges.getText();
					if (chargetext.equals(charge_names[i])) {
						Thread.sleep(1000);
						charges.click();
						break;
					}
				}
				if (i == size-1)
					break;
				add_button.click();
				tran_arrow.click();
			}
			same_charge_flag = isAlertPresent();               
		}

		if (testcase.trim().equals("Multiple charges selection for single payment")||testcase.trim().equals("Multiple charge selection for single payment including write off with partial amount")||testcase.trim().equals("Multiple charges selection including Bank Charges for single payment with full amount")) {
			tran_arrow.click();
			for (int i = 0; i < tran_dropdown.size(); i++) {
				if (i == size)
					break;
				System.out.println(tran_dropdown.size());
				for(int j=0;j<tran_dropdown.size();j++)
				{
				WebElement textsel = tran_dropdown.get(j);
				String textsel1 = textsel.getText();
				if (textsel1.equals(refnrs_one[0])) {
					tran_dropdown.get(j).click();
					break;
				}
				}
				action.sendKeys(Keys.TAB).build().perform();
				charge_value.sendKeys(charge_amounts[i]);
				action.sendKeys(Keys.TAB).build().perform();
				charge_arrow.click();
				for (int j = 0; j < charge_dropdown_list.size(); j++) {
					WebElement charges = charge_dropdown_list.get(j);
					String chargetext = charges.getText();
					if (chargetext.equals(charge_names[i])) {
						charges.click();
						break;
					}
				}
				add_button.click();
				tran_arrow.click();
			}
			

		}

		if (testcase.trim().equals("Multiple  invoices and multiple charges")) {

			for (int k = 0; k < refnrs.length; k++) {
				System.out.println("Reference no is" + "-----" + refnrs[k]);
				Thread.sleep(2000);
				tran_arrow.click();
				for (int i = 1; i <= tran_dropdown.size(); i++) {

					WebElement textsel = tran_dropdown.get(i);
					if (refnrs[k].equals(textsel.getText())) {
						tran_dropdown.get(i).click();
						break;
					}
				}
				action.sendKeys(Keys.TAB).build().perform();
				charge_value.sendKeys(charge_amounts[k]);
				action.sendKeys(Keys.TAB).build().perform();
				charge_arrow.click();
				for (int j = 0; j < charge_dropdown_list.size(); j++) {
					WebElement charges = charge_dropdown_list.get(j);
					String chargetext = charges.getText();
					if (chargetext.equals(charge_names[k])) {
						charges.click();
						break;
					}
				}
				if(k==refnrs.length-1)
				break;
				add_button.click();
			}
		}

		save_payment.click();
		if(testcase.trim().equals("Multiple charges selection including Bank Charges for single payment with full amount"))
		{
			 banK_charge_full_payment_flag = isAlertPresent();
		}
		if(banK_charge_full_payment_flag&&same_charge_flag)
		{
		charge_tab_after_payment.click();
		String [] invoices_payment=new String[Invoicenr_in_payment.size()];
		if(testcase.trim().equals("Multiple  invoices and multiple charges"))
		{
			for(int i=0;i<Invoicenr_in_payment.size();i++)
			{
			WebElement tr=Invoicenr_in_payment.get(i);
			invoices_payment[i]=tr.getText();
			}
			for(int i=0;i<Invoicenr_in_payment.size();i++)
			{
				System.out.println("Invoices are-----------------------"+invoices_payment[i]);
			}
			
		}
		String invoice_in_payment_array[]=new String[2];
		for(int i=0;i<Invoicenr_in_payment.size();i++)
		{
		WebElement tr=Invoicenr_in_payment.get(i);
		invoice_in_payment_array[i]=tr.getText();
		}
		if(invoice_in_payment_array[0].trim().equals(invoice_in_payment_array[1].trim()))
		{
			tr_no_1=invoice_in_payment_array[0];
		}
		int size1 = journallists.size();
		String []charge_two=charge_name.split(",");
		String invoice_journal[]=new String[2];
		for (int i = 0; i < journallists.size(); i++) {

			System.out.println("Journal size is" + " " + journallists.size());
			WebElement journal1 = journallists.get(i);
			journal1.click();
			windowHandle();
			invoice_journal[i]=Invoicenr_in_journal.getText();
			System.out.println("Invoice in journal -----------"+invoice_journal[i]);
			tr_no_2 = Invoicenr_in_journal.getText();
			String debita = debit_account1.getText();
			System.out.println("debit acct value:: " + debita);
			String credita = credit_account1.getText();
			System.out.println("credit acct value is :: " + credita);
			credit_and_debit_accounts(charge_two[i].trim());
			if (debita.equals(debit_account)) {
				System.out.println("The debit account is verified");
				System.out.println("The debit account for" + " " + charge_two[i] + " is" + " " + debita);
				
			}
			if (credita.equals(credit_account)) {
				System.out.println("The credit account is verified");
				System.out.println("The credit account for" + " " + charge_two[i] + " is" + " " + credita);
				
			}

			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(parentWindow);
			Thread.sleep(1000);
		}
		System.out.println("aa size is" + size);
		Ancillary_charges_screen();
		if(!testcase.trim().equals("Multiple  invoices and multiple charges"))
		{
		for (int i = 0; i < size; i++) {
			System.out.println("Ancillary charge count is" + " " + size);
			WebElement view_link_final = ancillary_charges_list.get(i);
			action.moveToElement(view_link_final).build().perform();
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			view_link_final.sendKeys(selectLinkOpeninNewTab);
			windowHandle();
			tr_no_mul[i] = ancillary_charge_invoice_nr.getText();
			System.out.println("Ancillary charges Invoices are-------------------- "+tr_no_mul[i]);
			System.out.println("Applied to transcation " + " " + i + " " + ancillary_charge_invoice_nr.getText());
			driver.switchTo().window(parentWindow);
		}
		if(tr_no_mul[0].equals(tr_no_mul[1]))
		{
			tr_no_3=tr_no_mul[0];
		}
		if (tr_no_1.equals(tr_no_2)) {
			if (tr_no_2.equals(tr_no_3)) {
				if (tr_no_3.equals(tr_no_1)) {
					System.out.println("The invoice number in payment, journal, ancillary charge is same");
					System.out.println("Testcase is verified");
					System.out.print("Invoice number in payment is :"+invoice_in_payment_array[0]+", "+invoice_in_payment_array[1]+" "+"<br/>"+"Invoice number in Journal is: "+invoice_journal[0]+", "+invoice_journal[1]+"<br/>"+"Invoice number in Ancillary charge is:"+tr_no_mul[0]+", "+tr_no_mul[1]+"<br/>"+"The invoice number in payment, journal, ancillary charge is same"+"<br/>"+"So, Test case is verified");
					test.pass("Invoice number in payment is :"+invoice_in_payment_array[0]+", "+invoice_in_payment_array[1]+" "+"<br/>"+"Invoice number in Journal is: "+invoice_journal[0]+", "+invoice_journal[1]+"<br/>"+"Invoice number in Ancillary charge is:"+tr_no_mul[0]+", "+tr_no_mul[1]+"<br/>"+"The invoice number in payment, journal, ancillary charge is same"+"<br/>"+"So, Test case is verified");	
				}
			}
		}
		else
		{
			test.fail("Transaction number is different So, testcase is failed");
		}
	}
	
		int count=0;
		int j=0;
		if(testcase.trim().equals("Multiple  invoices and multiple charges"))
		{
			for (int i = size-1; i >=0; i--) {
				System.out.println("Ancillary charge count is" + " " + size);
				WebElement view_link_final = ancillary_charges_list.get(i);
				action.moveToElement(view_link_final).build().perform();
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				view_link_final.sendKeys(selectLinkOpeninNewTab);
				windowHandle();				
				tr_no_mul[j] = ancillary_charge_invoice_nr.getText();
				System.out.println("Ancillary charges Invoices are-------------------- "+tr_no_mul[j]);
				j=j+1;
				System.out.println("Applied to transcation " + " " + i + " " + ancillary_charge_invoice_nr.getText());
				driver.switchTo().window(parentWindow);
			}
			for(int i=0;i<2;i++)
			{
				if(invoices_payment[i].trim().equals(invoice_journal[i].trim()))
						{
							if(invoice_journal[i].trim().equals(tr_no_mul[i].trim()))
									{
										if(tr_no_mul[i].trim().equals(invoices_payment[i].trim()))
												{
													count=count+1;
												}
									}
						}
			}
			if(count==2)
			{
				System.out.println("Passed");
				System.out.println("Invoice number in payment is :"+invoices_payment[0]+", "+invoices_payment[1] +"<br/>"+"Invoice number in Journal is: "+invoice_journal[0]+", "+invoice_journal[1]+"<br/>"+"Invoice number in Ancillary charge is:"+tr_no_mul[0]+", "+tr_no_mul[1]+"<br/>"+"The invoice number in payment, journal, ancillary charge is same"+"<br/>"+"So, Test case is verified");
				test.pass("Invoice number in payment is :"+invoices_payment[0]+", "+invoices_payment[1] +"<br/>"+"Invoice number in Journal is: "+invoice_journal[0]+", "+invoice_journal[1]+"<br/>"+"Invoice number in Ancillary charge is:"+tr_no_mul[0]+", "+tr_no_mul[1]+"<br/>"+"The invoice number in payment, journal, ancillary charge is same"+"<br/>"+"So, Test case is verified");
			}
			else
			{
				test.fail("Transaction number is different So, testcase is failed");
			}
		}
	}
		else
		{
			if(testcase.trim().equals("Multiple charges selection including Bank Charges for single payment with full amount"))
			{
				test.fail("we shouldn't use Bank charges for full payment");
				System.out.println("We shouldn't use bank charges for full payment");
			}
			if(testcase.trim().equals("Same Charge Multiple times"))
			{
				test.fail("We shouldn't select same charge for multiple times when we do single payment");
				System.out.println("We shouldn't select same charge for multiple times when we do single payment");
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void total_write_off(String charge_amount, String charge_name, String testcase, String new_amount,
			String new_charge, String no_of_invoices,ExtentTest test) throws Exception {
		Actions action = new Actions(driver);
		boolean journal_entry_edit_flag=false;
		boolean total_amount_as_writeoff_flag=false;
		boolean percentage_as_charge_amount_flag=true;
		Customer_Navigation_Accepting_Payment();
		String chargeamounts = due_amount.get(0).getText().replace(",", "");
		System.out.println("Amount is "+chargeamounts);
		int invoice_size = Integer.parseInt(no_of_invoices);
		String[] refnrs = new String[invoice_size];
		int noofinvoices = Integer.parseInt(no_of_invoices);
		for (int i = 0; i < invoice_links.size();i++) {
			if (noofinvoices == i)
				break;
			invoice_links.get(i).click();
			WebElement ref = refno.get(i);
			refnrs[i] = ref.getText();
			System.out.println("Invoices are" + "--------" + refnrs[i]);
		}

		charge_tab.click();
		for (int k = 0; k < refnrs.length; k++) {
			System.out.println(refnrs.length);
			System.out.println("Reference no is" + "-----" + refnrs[k]);
			Thread.sleep(2000);
			tran_arrow.click();
			for (int i = 0; i < tran_dropdown.size(); i++) {

				System.out.println(tran_dropdown.size());
				WebElement textsel = tran_dropdown.get(i);
				if (refnrs[k].equals(textsel.getText())) {
					tran_dropdown.get(i).click();
					break;
				}

			}
		}
		if (testcase.trim().equals("Editing journal entry")) {
			action.sendKeys(Keys.TAB).build().perform();
			charge_value.clear();
			charge_value.sendKeys(chargeamounts);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();
				if(charge_name.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}			
			save_payment.click();
			charge_tab_after_payment.click();
			int size = journallists.size();
			for (int i = 0; i < journallists.size(); i++) {
				System.out.println("Journal size is" + " " + journallists.size());
				WebElement journal1 = journallists.get(i);
				journal1.click();
				windowHandle();
				String debita = debit_account1.getText();
				System.out.println("debit acct value:: " + debita);
				String credita = credit_account1.getText();
				System.out.println(credita);
				journal_edit.click();
				memo.sendKeys("test");
				action.sendKeys(Keys.TAB).build().perform();
				if(isAlertPresent()==true)
				{
				 Alert alert=driver.switchTo().alert();
				 journal_entry_edit_flag=true;
				 alert.accept();
				}
				if(journal_entry_edit_flag==false)
				{
					System.out.println("We cannot edit Journal entry once it's approved");
					test.fail("System is allowing to edit journal entry once it's approved");
				}
				else
				{
					test.pass("System is not allowing to edit journal entry once it's approved");
					System.out.println("System is not allowing to edit journal entry once it's approved");
				}
			}

		}
		if (testcase.trim().equals("Total amount as WriteOff")) {
			action.sendKeys(Keys.TAB).build().perform();
			System.out.println(chargeamounts);
			charge_value.clear();
			charge_value.sendKeys(chargeamounts);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();
				if(charge_name.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}
			save_payment.click();
			if(isAlertPresent()==true)
			{
				Alert alert=driver.switchTo().alert();
				total_amount_as_writeoff_flag=true;
				alert.accept();
			}
			if(total_amount_as_writeoff_flag==false)
			{
				test.fail("System should not allow the total amount to be write off as the entire amount will be in negative balance,but it is allowing");
				System.out.println("System should not allow the total amount to be write off amount ");
			}
			else
			{
				test.pass("System is not accepting to use total amount as write off charge amount");
				System.out.println("System is not accepting to use total amount as write off charge amount");
			}
		}
		if (testcase.trim().equals("Percentage as Charge Amount")) {
			action.sendKeys(Keys.TAB).build().perform();
			String value = charge_amount + "%";
			int charge_a=Integer.parseInt(charge_amount);
			Double per=Double.valueOf(chargeamounts);
			double percentage=(charge_a/100.00)*(per+.00);
			String final_p=String.valueOf(percentage);
			System.out.println("percentage is "+percentage);
			System.out.println(value);
			charge_value.clear();
			charge_value.sendKeys(value);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();
				if(charge_name.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}			
			save_payment.click();
			charge_tab_after_payment.click();
			String ele=charge_amount_in_payment.get(0).getText().trim();
			System.out.println("percentage in charge is "+ele);
			if(final_p.equals(ele))
			{
			System.out.println("Payment is saved successfully with percentage as charge amount");
			test.pass("Charge Amount is taking as percantage");
			}
			else
			{
				test.fail("System is not taking the percantage as charge amount");
				System.out.println("System is not taking the percantage as charge amount");
			}
		}
		if(testcase.trim().equals("Changing Charge name"))
		{
			action.sendKeys(Keys.TAB).build().perform();
			charge_value.clear();
			charge_value.sendKeys(charge_amount);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();
				if(charge_name.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}	
			save_payment.click();
			payment_edit.click();
			Thread.sleep(5000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", charge_tab_after_payment);
			charge_tab_after_payment.click();
			charge_name_change_click.click();
			charge_arrow_after_payment.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();	
				if(new_charge.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}
			boolean chnage_charge_name_flag=false;
			save_payment.click();
			if(isAlertPresent()==true)
			{
				Alert alert=driver.switchTo().alert();
				if(alert.getText().equals("AR Creditable Charge cannot be updated"))
				{
					chnage_charge_name_flag=true;
				}
				alert.accept();
			}
			if(chnage_charge_name_flag)
			{
				test.fail("System is not allowing to edit charge name");
				System.out.println("System is not allowing to edit charge name");
				
			}
			else
			{
			Thread.sleep(2000);
			charge_tab_after_payment.click();
			if(charge_name_after_payment.get(0).getText().trim().equals(new_charge.trim()))
			{
						System.out.println("System is allowing to change charge name");
						test.pass("System is accepting to change charge name");
			}
			
			}
		}
		
		if (testcase.trim().equals("Changing Charge amount")) {				
			action.sendKeys(Keys.TAB).build().perform();
			charge_value.clear();
			charge_value.sendKeys(charge_amount);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for(int i=0;i<charge_dropdown_list.size();i++)
			{
				WebElement charge=charge_dropdown_list.get(i);
				String charge_text=charge.getText();
				if(charge_name.trim().equals(charge_text))
				{
					charge_dropdown_list.get(i).click();
					break;
				}
			}	
			save_payment.click();
			payment_edit.click();
			Thread.sleep(6000);
			boolean changing_charge_amount_flag=false;
			action.moveToElement(charge_tab_after_payment).build().perform();
			charge_tab_after_payment.click();
			charge_amount_click_after_payment.click();
			charge_amount_enter_after_payment.sendKeys(new_amount);			
			save_payment.click();
			if(isAlertPresent()==true)
			{
				Alert alert=driver.switchTo().alert();
				if(alert.getText().equals("AR Creditable Charge cannot be updated"))
				{
					changing_charge_amount_flag=true;
				}
				alert.accept();
			}
			if(changing_charge_amount_flag)
			{
				test.fail("System is not allowing to edit charge amount");
				System.out.println("system is not allowing to edit charge amount");
			}
			else
			{
			Thread.sleep(2000);	
			charge_tab_after_payment.click();
			String charge_amount_in_payment1=charge_amount_in_payment.get(0).getText().trim();
			System.out.println("Charge amount in payment is "+charge_amount_in_payment1);
			if(charge_amount_in_payment1.equals(new_charge.trim()))
			{
				test.pass("System is allowing to change charge amount");
				System.out.println("System is allowing to change charge amount");
			}
			int size=journallists.size();
			String journal_amount=null;
			String ancillary_amount=null;
			for (int i = 0; i < journallists.size(); i++) {

				System.out.println("Journal size is" + " " + journallists.size());
				WebElement journal1 = journallists.get(i);
				journal1.click();
				windowHandle();
				if(amount_in_journal_1.getText().trim().equals(""))
				{
					journal_amount=amount_in_journal2.getText().trim();
				}
				else
				{
				journal_amount=amount_in_journal_1.getText().trim();
				System.out.println("charge amount in journal is "+journal_amount);
				}
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(parentWindow);
				Thread.sleep(1000);
			}
			Ancillary_charges_screen();
			for (int i = 0; i < size; i++) {
				WebElement view_link_final = ancillary_charges_list.get(i);
				action.moveToElement(view_link_final).build().perform();
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				view_link_final.sendKeys(selectLinkOpeninNewTab);
				windowHandle();
				ancillary_amount=amount_in_ancillary_applied.getText().trim();
				System.out.println("ancillary charge amount is: "+ancillary_amount);
				driver.switchTo().window(parentWindow);
			}
			
			if(charge_amount_in_payment1.equals(ancillary_amount))
			{
				if(ancillary_amount.equals(journal_amount))
				{
					if(journal_amount.equals(charge_amount_in_payment1))
					{
						System.out.println("Amount is updated in Applied Ancillary charge, journal,Payment");
					test.pass("Amount is updated in Applied Ancillary charge, journal,Payment");
				}
			}
		}
			
			}
		}

	}
	@SuppressWarnings("deprecation")
	public void deleting_payment_journal_ancillary(String charge_amount, String charge_name, String testcase,
			String no_of_invoices,ExtentTest test) throws Exception {
		boolean deleting_journal_flag=true;
		boolean deleting_applied_ancillary_charge_flag=true;
		int invoice_size = Integer.parseInt(no_of_invoices);
		String[] refnrs = new String[invoice_size];
		Actions action = new Actions(driver);
		String[] journal_count_before = new String[2];
		String[] journal_count_after = new String[2];
		Customer_Navigation_Accepting_Payment();
		int noofinvoices = Integer.parseInt(no_of_invoices);
		for (int i = 0; i < invoicelink.size(); i++) {
			if (noofinvoices == i)
				break;
			invoice_click.click();
			WebElement ref = refno.get(i);
			refnrs[i] = ref.getText();
			System.out.println("Invoices are" + "--------" + refnrs[i]);

		}
		charge_tab.click();
		for (int k = 0; k < refnrs.length; k++) {
			if (k == refnrs.length)
				break;
			System.out.println(refnrs.length);
			System.out.println("Reference no is" + "-----" + refnrs[k]);
			Thread.sleep(2000);
			tran_arrow.click();
			for (int i = 0; i < tran_dropdown.size(); i++) {

				System.out.println(tran_dropdown.size());
				WebElement textsel = tran_dropdown.get(i);
				if (refnrs[k].equals(textsel.getText())) {
					tran_dropdown.get(i).click();
					break;
				}

			}
			action.sendKeys(Keys.TAB).build().perform();
			charge_value.sendKeys(charge_amount);
			action.sendKeys(Keys.TAB).build().perform();
			charge_arrow.click();
			for (int j = 0; j < charge_dropdown_list.size(); j++) {
				WebElement charges = charge_dropdown_list.get(j);
				String chargetext = charges.getText();
				if (chargetext.equals(charge_name.trim())) {
					charges.click();
					break;
				}
			}
		}
		save_payment.click();
		String payment_url = driver.getCurrentUrl();
		charge_tab_after_payment.click();
		int size = journallists.size();
		String[] ancillary_urls = new String[size];
		String[] journal_urls = new String[size];
		for (int i = 0; i < journallists.size(); i++) {

			System.out.println("Journal size is" + " " + journallists.size());
			WebElement journal1 = journallists.get(i);
			journal1.click();
			windowHandle();
			journal_urls[i] = driver.getCurrentUrl();
			String debita = debit_account1.getText();
			System.out.println("debit acct value:: " + debita);
			String credita = credit_account1.getText();
			System.out.println(credita);
			if (testcase.trim().equals("deleting journal")) {
				journal_edit.click();
				action.moveToElement(Actions_payment).build().perform();
				delete_payment.click();
				Alert alert = driver.switchTo().alert();
				String alert_text = alert.getText();
				System.out.println("Alert value is: " + alert_text);
				if (alert_text.contains("Are you sure you want to delete this transaction?")) {
					deleting_journal_flag=false;
					alert.accept();
					//Assert.assertEquals("don't delete", alert_text);
				}
				else
				{
					deleting_journal_flag=true;
				}
			}
			driver.switchTo().window(parentWindow);
			Thread.sleep(1000);
		}
		if(deleting_journal_flag)
		{
			Ancillary_charges_screen();
			System.out.println("aa size is" + size);
			for (int i = 0; i < size; i++) 
			{
			System.out.println("Ancillary charge count is" + " " + size);
			WebElement view_link_final = ancillary_charges_list.get(i);
			action.moveToElement(view_link_final).build().perform();
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			view_link_final.sendKeys(selectLinkOpeninNewTab);
			windowHandle();
			ancillary_urls[i] = driver.getCurrentUrl();
			System.out.println("Applied to transcation " + " " + i + " " + ancillary_charge_invoice_nr.getText());
			if (testcase.trim().equals("deleting  applied ancillary charges")) {
				ancillary_edit.click();
				action.moveToElement(Actions_payment).build().perform();
				delete_payment.click();
				Alert alert = driver.switchTo().alert();
				String alert_text = alert.getText();
				System.out.println("Alert value is: " + alert_text);
				if (alert_text.contains("Are you sure you want to delete this record?")) {
					deleting_applied_ancillary_charge_flag=false;
					alert.accept();
				}
				else
				{
					deleting_applied_ancillary_charge_flag=true;
				}

			}
			driver.close();
			driver.switchTo().window(parentWindow);
		}
		if(deleting_applied_ancillary_charge_flag)
		{
			
		driver.navigate().to(payment_url);
		payment_edit_secondary.click();
		action.moveToElement(Actions_payment).build().perform();
		delete_payment.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);

		if (testcase.trim().equals("deleting  payment and related transactions")) {
			System.out.println("Navigating to  journal entry");
			for (int i = 0; i < size; i++)
				driver.navigate().to(journal_urls[i]);
			journal_notexist.click();
			if (journal_notexist.getText().equals("That record does not exist.")) {
				System.out.println("The journal doesn't exist ----- journal got deleted succesfully");
				test.pass("Journal deleted sucessfully");
			}

		}
		if (testcase.trim().equals("deleting  payment and related transactions")) {

			System.out.println("Navigating to ancillary charge");
			for (int i = 0; i < size; i++)
				driver.navigate().to(ancillary_urls[i]);
			try
			{
			
			journal_notexist.click();
			if (journal_notexist.getText().equals("That record does not exist."))
			{
				System.out.println("The ancillary charge doesn't exist ----- ancillary charge got deleted succesfully");
				test.pass("Ancillary charge deleted sucessfully");
			}
			}
			catch(NoSuchElementException e)
			{
				test.fail("Ancillary Charge is not deleted");
			}

		}
		}
		else
		{
			test.fail("System is allowing to delete the applied ancillary charges");
			System.out.println("system is allowing to delete ancillary charges");
		}
	
	}
		else
		{
			test.fail("System is allowing to delete journal entry");
			System.out.println("System is allowing to delete journal entry");
		}

}
}
