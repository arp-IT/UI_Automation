package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Config.PropertiesFIle;
import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgMultipleBrowserExecution {

	private static WebDriver driver = null;
	public static String browserName = null;

	@Parameters("browsername")
	@BeforeTest
	public void setUpTest(String browsername) throws Exception {

		browserName = browsername;

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}


		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();;
			driver = new EdgeDriver();
		}

	}

	@Test
	public static void googleSearchTest() {

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("KeyWord");
		searchPageObj.clickSearchButton();

	}

	@AfterTest
	public void tearDownTest() throws Exception {

		driver.quit();
		System.out.println("Test Ran Successfully");
		PropertiesFIle.setProperties();

	}


}
