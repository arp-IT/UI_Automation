package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null ;
	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	 public void setTextInSearchBox(String text) {
		 
		 driver.findElement(textbox_search).sendKeys(text);
		 
	 }
	 
	 public void clickSearchButton() {
		 Actions builder = new Actions(driver);        
		 builder.sendKeys(Keys.RETURN);
	 }
	 
}
