package initialPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
			 String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
			 System.setProperty("webdriver.chrome.driver", exePath);
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://toolsqa.com/automation-practice-form/");
		    }
	}


