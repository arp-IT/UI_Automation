package initialPackages;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/arpit.agarwal/Desktop/Automation%20practice%20seleium/try.html");
		driver.findElement(By.id("click")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		((FluentWait<WebDriver>) wait).pollingEvery(250,  TimeUnit.MILLISECONDS);
		((FluentWait<WebDriver>) wait).withTimeout(5, TimeUnit.SECONDS);
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver arg0) {
				String element = (String) arg0.findElement(By.id("demo")).getCssValue("background-color");
				System.out.println("The color if the button is " + element);
				
				if (element.equals("rgba(255, 0, 0, 1)")) {
					return true;
				}
				
				return false;
			}
		};
		wait.until(function);
		driver.close();
	}
}