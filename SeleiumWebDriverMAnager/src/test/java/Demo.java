import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("WebDriver started");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Hello");
		System.out.println("Text Entered");
		Thread.sleep(1000);
		 Actions builder = new Actions(driver);        
		 builder.sendKeys(Keys.RETURN);
		 System.out.println("Entered key press");
		 Thread.sleep(1000);
		 driver.close();
		 driver.quit();
		 System.out.println("Exit");
	}

}
