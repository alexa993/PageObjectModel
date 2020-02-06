package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageObjectModel {
	
	private static WebDriver driver = null;
	
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QATests\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().deleteAllCookies();
		
		IndexPage.SignOn(driver).click();
		
		LoginPage.userName(driver).sendKeys("testUser");
		LoginPage.password(driver).sendKeys("test123");
		LoginPage.submit(driver).click();
		
		System.out.println("Login successfully");
		
		IndexPage.SignOff(driver).click();
		
		
		driver.close();
		driver.quit();
	}
}
