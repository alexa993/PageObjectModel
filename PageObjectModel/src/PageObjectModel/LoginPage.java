package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		
	public static WebElement element = null;
	
	public static WebElement userName(WebDriver driver) {
		
		element = driver.findElement(By.name("userName"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement submit(WebDriver driver) {
		element = driver.findElement(By.name("submit"));
		return element;
	}
	
	
}
