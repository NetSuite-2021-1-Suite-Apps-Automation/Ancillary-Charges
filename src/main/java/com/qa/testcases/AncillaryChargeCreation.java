package com.qa.testcases;
import java.io.IOException;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.excelreader.ExcelReaderbycolumnname;
import com.qa.pages.AncillaryCharges;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class AncillaryChargeCreation extends TestBase {
	TestUtil testUtil;
	AncillaryCharges charges;
	//ExcelReader reader;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	ExcelReaderbycolumnname reader;
	String file_name_="C:\\\\Users\\\\Sindhuja\\\\Desktop\\\\Ancillary_charge_creation.xlsx";

	@BeforeTest
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/AncillaryChargeReport/AncillaryChargesReport.html");
		htmlReporter.config().setDocumentTitle("Ancillary Charges Report"); // Tile of report
		htmlReporter.config().setReportName("Ancillary Charges Application Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// Passing General information
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Sindhuja");
	}

	@AfterTest
	public void endReport() throws EmailException {
		extent.flush();
		send_email();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			//test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																					// report
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			//test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		driver.quit();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		testUtil = new TestUtil();
		testUtil.setUp();
	}
	public void send_email() throws EmailException
	{
		EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("./AncillaryChargeReport/AncillaryChargesReport.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("sindhuja.b@tvarana.com", "Sindhu@123"));
		  email.setSSLOnConnect(true);
		  email.addTo("sindhuja.b@tvarana.com", "Sindhu");
		  email.setFrom("sindhuja.b@tvarana.com", "Sindhuja");
		  email.setSubject("Ancillary Charges Test Report");
		  email.setMsg("Here is the report please find the attachment");
		  email.attach(attachment);
		  email.send();
	}
	
	
	
	@Test(priority = 5)
	public void chargeCreation() throws IOException, InterruptedException
	{
		
		reader=new ExcelReaderbycolumnname();
		String charge_name[]=reader.excelReader(file_name_, 0, "charge_name");
		String debit_account[]=reader.excelReader(file_name_, 0, "debit_account");
		String credit_account[]=reader.excelReader(file_name_, 0, "credit_account");
		String testcase[]=reader.excelReader(file_name_, 0, "testcase");
		for(int i=0;i<charge_name.length;i++)
		{
			try
			{
			test = extent.createTest("The testcase is" + " " + testcase[i]);
			charges=new AncillaryCharges();
			charges.charge_Screen();
			charges.charge_Creation(charge_name[i], debit_account[i], credit_account[i], testcase[i],test);
			}
			catch(Exception e)
			{
				test.fail(testcase+ "is failed due to "+e.fillInStackTrace());

			}
			
			
		}
		
	}
	@Test(priority = 2)
	public void customerPayment() throws Exception
	{
		reader=new ExcelReaderbycolumnname();
		String[] charge_amount=reader.excelReader(file_name_, 1, "Charge_amount");
		String[] charge_name=reader.excelReader(file_name_, 1, "charge_name");
		String[] testcase=reader.excelReader(file_name_, 1, "testcase");
		String[] no_of_invoices=reader.excelReader(file_name_, 1, "no_of_invoices");
		System.out.println("lenght of charge amount is: "+charge_amount.length);
		for(int i=0;i<charge_amount.length;i++)
		{
			try
			{
			test = extent.createTest("The testcase is" + " " + testcase[i]);
			charges=new AncillaryCharges();
			charges.charge_selection(charge_amount[i], charge_name[i], testcase[i], no_of_invoices[i],test);
			}
			catch(Exception e)
			{
				test.fail(testcase+ "is failed due to "+e.fillInStackTrace());

			}
			
		}
		
	}
	@Test(priority = 3)
	public void multiplePaymentsCharges() throws Exception
	{
		reader=new ExcelReaderbycolumnname();

		String[] charge_amount=reader.excelReader(file_name_, 2, "charge_amount");
		String[] charge_name=reader.excelReader(file_name_, 2, "charge_name");
		String [] testcase=reader.excelReader(file_name_, 2, "testcase");
		for(int i=0;i<charge_amount.length;i++)
		{
			try
			{
			test = extent.createTest("The testcase is" + " " + testcase[i]);
			charges=new AncillaryCharges();
			charges.single_payment_multiple_same_charges(charge_amount[i], charge_name[i], testcase[i],test);
		}
			catch(Exception e)
			{
				test.fail(testcase+ "is failed due to "+e.fillInStackTrace());
			}
		}
	}
	
	@Test(priority = 4)
	public void writeOffTotal_editing() throws Exception
	{
		reader=new ExcelReaderbycolumnname();
		String [] charge_amount=reader.excelReader(file_name_, 3, "charge_amount");
		String[] charge_name=reader.excelReader(file_name_, 3, "charge_name");
		String[] testcase=reader.excelReader(file_name_, 3, "testcase");
		String[] new_amount=reader.excelReader(file_name_, 3, "new_amount");
		String[] new_charge=reader.excelReader(file_name_, 3, "new_charge");
		String[] no_of_invoices=reader.excelReader(file_name_, 3, "no_of_invoices");
		for(int i=0;i<charge_amount.length;i++)
		{
			try
			{
			test = extent.createTest("The testcase is" + " " + testcase[i]);
		charges=new AncillaryCharges();
			charges.total_write_off(charge_amount[i], charge_name[i], testcase[i],new_amount[i],new_charge[i],no_of_invoices[i],test);
			}
			catch(Exception e)
			{
				test.fail(testcase[i]+ "is failed due to "+e.fillInStackTrace());

			}
			
		}

		
	}
	@Test(priority = 1)
	public void deleting() throws Exception
	{
		reader=new ExcelReaderbycolumnname();
		String[] charge_amount=reader.excelReader(file_name_, 4, "charge_amount");
		String[] charge_name=reader.excelReader(file_name_, 4, "charge_name");
		String[] testcase=reader.excelReader(file_name_, 4, "testcase");
		String[] no_of_invoices=reader.excelReader(file_name_, 4, "no_of_invoices");
		for(int i=0;i<charge_amount.length;i++)
		{
			try
			{
			test = extent.createTest("The testcase is" + " " + testcase[i]);
			charges=new AncillaryCharges();
			charges.deleting_payment_journal_ancillary(charge_amount[i], charge_name[i], testcase[i], no_of_invoices[i],test);
			}
			catch(Exception e)
			{
				test.fail("Exception is: "+e.fillInStackTrace());
			}
		}
				
		
	}
}