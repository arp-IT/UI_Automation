package initialPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws Exception {
	 String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exePath);
	 WebDriver driver = new ChromeDriver();
	 String url = "https://www.google.com";
	 driver.navigate().to(url);
	 driver.navigate().to("https://www.yahoo.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 String Title = driver.getTitle();
	 System.out.println(Title);
	 String currenturl = driver.getCurrentUrl();
	 System.out.println(currenturl);
	 String pagesource = driver.getPageSource();
	 System.out.println(pagesource);
	 driver.quit();
		 
	}

}
