package initialPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws Exception {
		
		String exePath = "D:\\Seleium Learning project\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		org.openqa.selenium.WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("ToolsQA");
		String tagName = element.getTagName();
		String attValue = element.getAttribute("name");
		org.openqa.selenium.Dimension dimensions = element.getSize();
		Point point = element.getLocation();
		System.out.println(tagName + " " + attValue + " " + dimensions.height +
		" " + dimensions.width + " " + point.x + " " + point.y);
		element.clear();
		element.sendKeys("QA");
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

	
		
	}


