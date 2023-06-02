package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		 WebElement Email_USIDTextbox = driver.findElement(By.name("email"));
		 Email_USIDTextbox.sendKeys("Subash");
		 
		 WebElement Email_PassTextbox = driver.findElement(By.name("pass"));
		 Email_PassTextbox.sendKeys("12345678");

	}

}
