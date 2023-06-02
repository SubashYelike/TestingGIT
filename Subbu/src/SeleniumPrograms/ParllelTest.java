package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParllelTest {
	
	WebDriver driver;

	@Test
	public void ChromeLogin() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();

	}

	@Test
	public void FireFoxLogin() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subas\\Downloads\\geckodriver\\geckodriver.exe");

		driver = new FirefoxDriver(); 

		driver.get("http://www.facebook.com"); 

		driver.manage().window().maximize();

		System.out.println(driver.getTitle()); 

		String pagetitle = driver.getTitle(); 
		System.out.println(pagetitle);

	}

}
