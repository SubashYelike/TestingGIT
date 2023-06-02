package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class WorkingWithFacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		 
		 driver.manage().window().maximize();
		 
		 WebElement  searchTxt = driver.findElement(By.xpath("//input[@title='Search']"));
		 
			if (searchTxt.isDisplayed()) {
				String value = "Selenium";
				searchTxt.sendKeys(value);
			}
			
		
		 Thread.sleep(2000);
		 
		String actualVal  = searchTxt.getText();
		
		if (actualVal.equals(actualVal)) {
			System.out.println("Input data is matching with actually Entered Data");
		} else {
			System.out.println("Input data is not matching with actually Entered Data");
		}
		
	}

}
