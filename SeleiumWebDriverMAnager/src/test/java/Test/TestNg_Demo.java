package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFIle;
import Pages.GoogleSearchPageObjects;
import Util.ExcelDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Demo {
	
	private static WebDriver driver = null;
	public static String browserName = null;
	static String excelpath = "/Excel/data.xlsx";
	static String sheetname = "Sheet1";
	

	@BeforeTest
	public void setUpTest() throws Exception {
		
		PropertiesFIle.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}
	
	@Test(dataProvider="test1data")
	public static void googleSearchTest(String KeyWord,String Password) {
	  
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox(KeyWord);
		searchPageObj.clickSearchButton();
		
	}
	
	
	@DataProvider(name = "test1data")
	public static Object getData() {
		
		Object data[][] = ExcelDataProvider.testData(excelpath,sheetname);
		return data;
		
	}
	
	@AfterTest
	public void tearDownTest() throws Exception {
		
		driver.quit();
		System.out.println("Test Ran Successfully");
		PropertiesFIle.setProperties();
		
	}
	
	
}
