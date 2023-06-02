package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.selenium.dev/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement Documentation_Link = driver.findElement(By.linkText("Documentation"));
		 Documentation_Link.click();
		 
		 
		 
	}

}
