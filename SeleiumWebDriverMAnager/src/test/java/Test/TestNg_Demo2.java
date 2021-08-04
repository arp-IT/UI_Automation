package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Demo2 {
	
	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearchTest2() {
	  
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
		driver.quit();
	}
	
	@Test
	public static void googleSearchTest3() {
	  
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
		driver.quit();
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
		System.out.println("Test Ran Successfully");
	}
	
	
}
