package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAFormsPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demoqa.com/text-box");
		 
		 driver.manage().window().maximize();
		 
		 WebElement Forms_Button = driver.findElement(By.className("Forms"));
		 Forms_Button.click();

	}

}
