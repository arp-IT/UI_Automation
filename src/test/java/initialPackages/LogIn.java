package initialPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	int i =0;
	public static void main(String args[]) {
		String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:4200/Login");
		org.openqa.selenium.WebElement element = (org.openqa.selenium.WebElement) driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[1]/input"));
		element.sendKeys("mindfire");
		element = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[2]/input"));
		element.sendKeys("mindfire");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div[3]/button")).click();
		//driver.findElement(By.xpath("/html/body/app-root/app-products/div/nav/div/ul/li/span")).click();
	}

}
