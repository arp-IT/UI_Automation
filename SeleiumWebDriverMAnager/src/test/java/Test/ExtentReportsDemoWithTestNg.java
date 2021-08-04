package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNg {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
	
		htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void test1() throws IOException {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		test.pass("Navigated to Google web Page");
		searchPageObj.setTextInSearchBox("A B C D");
		test.pass("Entered Text to be searched inside text box");
		searchPageObj.clickSearchButton();
		test.pass("Enter key pressed by automation framework");
	}
	
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		System.out.println("Test Ran Successfully");
	}
	

	@AfterSuite
	public void tearDown() {
		
		extent.flush();	
		
	}
}
