package initialPackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) throws Exception {
		String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		List<org.openqa.selenium.WebElement> rdBtn_Sex = driver.findElements(By.name("gender"));
		boolean bValue = false;
		bValue = rdBtn_Sex.get(0).isSelected();
		String value = rdBtn_Sex.get(0).getAttribute("value");
		System.out.println(!bValue + " " + value);
//		 WebDriverWait wait = new WebDriverWait(driver, 120);
//	     wait.until(ExpectedConditions.elementToBeClickable(rdBtn_Sex.get(0)));
//		if(!bValue || value == "Male") {
//			rdBtn_Sex.get(0).click();
//		}
		List<WebElement> checkbox_Hobbies = driver.findElements(By.id("hobbiesWrapper"));
//		WebElement element = driver.findElement(By.cssSelector("input[value=1]"));
		for(int i = 0 ; i < checkbox_Hobbies.size(); i++) {
			checkbox_Hobbies.get(i).click();
		}
//		element.getAttribute("name");
		Thread.sleep(10000);
		driver.close();
	}

}
